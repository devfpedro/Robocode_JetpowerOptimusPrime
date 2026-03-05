package autobots;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

import java.awt.*;

public class JetpowerOptimusPrime extends AdvancedRobot {
    private static final double SAFE_DISTANCE = 250.0;
    private static final double RETREAT_DISTANCE = 350.0;

    private double enemyBearing = 0;
    private double enemyDistance = Double.MAX_VALUE;
    private boolean isSafe = true;

    @Override
    public void run() {
        setColors(Color.blue, Color.red,  Color.black);
        setAdjustRadarForGunTurn(true);
        setAdjustGunForRobotTurn(true);

        while (true) {
            setTurnRadarRight(Double.MAX_VALUE);
            execute();
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        enemyBearing = event.getBearing();
        enemyDistance = event.getDistance();

        double absoluteBearing = getHeading() + enemyBearing;
        double gunTurnAmount = Utils.normalRelativeAngleDegrees(absoluteBearing - getGunHeading());

        if (enemyDistance < SAFE_DISTANCE) {
            isSafe = false;

            setTurnGunRight(gunTurnAmount);
            double retreatBearing = enemyBearing + 180;
            setTurnRight(retreatBearing);
            setAhead(RETREAT_DISTANCE - enemyDistance + 100);
        } else {
            isSafe = true;

            setTurnGunRight(gunTurnAmount);
            if (getGunHeat() == 0 && Math.abs(gunTurnAmount) < 5) {
                setFire(3.0);
            }


        }

        double radarTurn = Utils.normalRelativeAngleDegrees(absoluteBearing - getRadarHeading());
        setTurnRadarRight(radarTurn * 2);
        execute();
    }

    @Override
    public void onHitWall(HitWallEvent event) {
        setBack(50);
        setTurnRight(45);
        execute();
    }

    @Override
    public void onHitByBullet(HitByBulletEvent event) {
        if (!isSafe) {
            setTurnRight(event.getBearing() + 180);
            setAhead(150);
            execute();
        }
    }
}

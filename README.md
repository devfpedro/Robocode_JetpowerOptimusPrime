# **🤖 Jetpower Optimus Prime - Robocode Robot**

> A robot developed in Java using the Robocode library, created as part of an academic activity to explore concepts of object-oriented programming, events, and algorithmic strategy in simulated environments.
The Jetpower Optimus Prime robot uses a safe distance-based strategy: it attacks when the enemy is far away and performs a tactical retreat maneuver when the opponent gets too close.
<br>

## **🎮 About Robocode**

> Robot developed in Java using the Robocode library, created as part of an academic activity to explore concepts of object-oriented programming, events, and algorithmic strategy in simulated environments.
Robocode is an educational programming game/program where code-controlled robots fight in an arena. Each robot is developed in Java and reacts to environmental events, such as:
detecting enemies
receiving shots
colliding with walls
controlling radar, movement, and weapons
The goal is to implement intelligent combat strategies through programming.
<br>

## **🧠 Robot Strategy**

> The Jetpower Optimus Prime uses a simple strategy based on distance control and event response.
<br>
## **🔎 Enemy detection**

> When an enemy is detected (onScannedRobot):
> 1. The robot calculates the enemy's absolute angle.
> 2. Adjusts the cannon to aim at the target.
> 3. Adjusts the radar to keep the enemy constantly tracked.
<br>

## **🔥 Attack**

> If the enemy is outside the safe distance (250 units):
The robot maintains its position.
It aligns the cannon with the enemy.
It fires at maximum power (3.0) when the cannon is aligned.
<br>

## **🛡️ Tactical retreat**

> If the enemy is too close (< 250 units):
The robot enters evasion mode.
It rotates 180° relative to the enemy.
It moves backward, increasing the distance.
This avoids very close combat, where the risk of damage is greater.
<br>

## **🧱 Collision with walls**

> If the robot collides with a wall (onHitWall):
it moves back 50 units
it rotates 45°
it attempts to reposition itself in the arena
<br>

## **💥 When he is hit by a gunshot**

> If hit (onHitByBullet):
if in danger mode
turns in the opposite direction from the enemy
moves quickly to escape the line of fire
<br>

## **🛠️ Technologies used**

> Java
> Robocode API
> Object-Oriented Programming
> Event-based programming
<br>

## **📂 Project structure**
`` autobots/
└── JetpowerOptimusPrime.java``
<br>

## **▶️ How to run**

> 1. Install Robocode
> 2. Copy the .java file to the folder:
     Robocode/robots/autobots
> 3. Compile the robot within Robocode.
> 4. Run battles in the arena selecting JetpowerOptimusPrime.
<br>
 
## **📚 Academic context**

> This project was developed as a practical activity in the Introduction to Autonomous Mobile Robots course of the Internet Systems undergraduate program, with the objective of practicing:
object-oriented programming
control logic
event-driven programming
development of algorithmic strategies
<br>

## **👨‍💻 Author**

**Pedro Henrique Santos de Pontes**
*Technology student in Sistemas para Internet*

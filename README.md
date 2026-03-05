🤖 Jetpower Optimus Prime - Robocode Robot

Robô desenvolvido em Java utilizando a biblioteca do Robocode, criado como parte de uma atividade acadêmica para explorar conceitos de programação orientada a objetos, eventos e estratégia algorítmica em ambientes simulados.

O robô Jetpower Optimus Prime utiliza uma estratégia baseada em distância segura: ele ataca quando o inimigo está distante e realiza uma manobra de recuo tático quando o adversário se aproxima demais.

🎮 Sobre o Robocode

Robocode é um jogo/programa educacional de programação onde robôs controlados por código lutam em uma arena. Cada robô é desenvolvido em Java e reage a eventos do ambiente, como:
detectar inimigos
receber tiros
colidir com paredes
controlar radar, movimento e armas

O objetivo é implementar estratégias inteligentes de combate através da programação.

🧠 Estratégia do Robô

O Jetpower Optimus Prime utiliza uma estratégia simples baseada em controle de distância e resposta a eventos.

🔎 Detecção de inimigos

Quando um inimigo é detectado (onScannedRobot):
1. O robô calcula o ângulo absoluto do inimigo.
2. Ajusta o canhão para mirar no alvo.
3. Ajusta o radar para manter o inimigo constantemente rastreado.

🔥 Ataque

Se o inimigo estiver fora da distância segura (250 unidades):
O robô mantém posição.
Alinha o canhão com o inimigo.
Dispara com potência máxima (3.0) quando o canhão está alinhado.

🛡️ Recuo tático

Se o inimigo estiver muito próximo (< 250 unidades):
O robô entra em modo de evasão.
Gira 180° em relação ao inimigo.
Move-se para trás aumentando a distância.
Isso evita combates muito próximos, onde o risco de dano é maior.

🧱 Colisão com paredes

Se o robô colidir com uma parede (onHitWall):
recua 50 unidades
gira 45°
tenta reposicionar-se na arena

💥 Quando é atingido por um tiro

Caso seja atingido (onHitByBullet):
se estiver em modo de perigo
gira na direção oposta ao inimigo
avança rapidamente para escapar da linha de tiro

🛠️ Tecnologias utilizadas

Java
Robocode API
Programação Orientada a Objetos
Programação baseada em eventos

📂 Estrutura do projeto
autobots/
└── JetpowerOptimusPrime.java

▶️ Como executar

Instale o Robocode
1- Copie o arquivo .java para a pasta:
Robocode/robots/autobots
2- Compile o robô dentro do Robocode.
3- Execute batalhas na arena selecionando JetpowerOptimusPrime.

📚 Contexto acadêmico

Este projeto foi desenvolvido como atividade prática na disciplina de Introdução aos Robôs Móveis Autônomos da graduação em Sistemas para Internet, com o objetivo de praticar:
programação orientada a objetos
lógica de controle
programação dirigida a eventos
desenvolvimento de estratégias algorítmicas

👨‍💻 Autor

Pedro Henrique Santos de Pontes
Estudante de Tecnologia em Sistemas para Internet


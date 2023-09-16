package Cyber18_pack;
import robocode.*;
import java.awt.Color;

// Cyber18 - a robot by (Arthur Thierry Rodrigues Martins)

public class Cyber18 extends AdvancedRobot
{
	public void run() {

//Cores do Tanque
	setColors(Color.green,Color.blue,Color.yellow,Color.white,Color.red);
		
	//Movimentação
	while(true) {
		turnGunLeft(360);
		}
	}

// Localizar um tanque adversário se movimentar e atirar
public void onScannedRobot(ScannedRobotEvent e) {
turnRight (e.getBearing());
fire(3); 
ahead(80);
}
// Colisão na parede da arena 
public void onHitWall(HitWallEvent e) {
back(55);
turnLeft(180);
	}	
}
// Toda vez que o robô atingir aparede da arena ele vai retornar 55 pixels, número esse que foi baseado através do tamnho do robô que é 45 pixels.

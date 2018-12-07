import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class PongPanel extends JPanel{

	// Properties
	int intRectX = 50;
	int intRectY = 260;
	int intRectX1 = 1180;
	int intRectY1 = 260;
	int intBallX = 610;
	int intBallY = 320; 
	boolean blnGoDown = false;
	boolean blnGoUp = false;
	boolean blnGoLeft = false;
	boolean blnGoRight = false;
	
	// Methods
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1280, 720);
		g.setColor(Color.WHITE);
		g.fillRect(intRectX, intRectY, 50, 200);
		g.fillRect(intRectX1, intRectY1, 50, 200);
		g.setColor(Color.BLUE);
		g.fillOval(intBallX, intBallY, 50, 50);
		
		
		intBallX = intBallX + 5;
		if(intBallX == 1130){
			intBallX = intBallX - 50;
		}
		
	
		if(blnGoDown){
			if(intRectY <= 520){
				intRectY = intRectY + 5;
			}
		}
		if(blnGoUp){
			if(intRectY >= 0){
				intRectY = intRectY - 5;
			}
		}
		if(blnGoRight){
		//	intRectX = intRectX + 5;
		}
		if(blnGoLeft){
		//	intRectX = intRectX - 5;
		}
		
	}
	
	// Constructor
	public PongPanel(){
		super();
		}
	
}

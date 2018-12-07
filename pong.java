import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;

public class pong implements ActionListener, KeyListener, MouseListener{
	
	// Properties
	JFrame theframe;
	PongPanel thepanel;
	Timer thetimer; 
	
	// Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == thetimer){
			thepanel.repaint();
		}
	}
	
	public void keyReleased(KeyEvent evt){
		if(evt.getKeyCode() == 37){
			thepanel.blnGoLeft = false;
		}else if(evt.getKeyCode() == 38){
			thepanel.blnGoUp = false;
		}else if(evt.getKeyCode() == 39){
			thepanel.blnGoRight = false;
		}else if(evt.getKeyCode() == 40){
			thepanel.blnGoDown = false;
		}
	}
	public void keyPressed(KeyEvent evt){
		if(evt.getKeyCode() == 37){
			thepanel.blnGoLeft = true;
		}else if(evt.getKeyCode() == 38){
			thepanel.blnGoUp = true;
		}else if(evt.getKeyCode() == 39){
			thepanel.blnGoRight = true;
		}else if(evt.getKeyCode() == 40){
			thepanel.blnGoDown = true;
		}
	}
	public void keyTyped(KeyEvent evt){
		
	}
	
	public void mouseClicked(MouseEvent evt){
		
	}
	public void mousePressed(MouseEvent evt){
		thepanel.intRectY1 = evt.getY();
		if(thepanel.intRectY1 >= 520){
			thepanel.intRectY1 = 520;
		}
	}
	public void mouseReleased(MouseEvent evt){
		
	}
	public void mouseEntered(MouseEvent evt){
		
	}
	public void mouseExited(MouseEvent evt){
		
	}
	
	
	// Constructor
	public pong(){
		theframe = new JFrame("Pong");
		thepanel = new PongPanel();
		thepanel.setLayout(null);
		thepanel.setPreferredSize(new Dimension(1280,720));
		thepanel.addMouseListener(this);
		
		theframe.setContentPane(thepanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);
		theframe.addKeyListener(this);
		
		thetimer = new Timer(1000/60, this);
		thetimer.start();
	}
	
	// Main Method
	public static void main(String[] args){
		new pong();
	}
	
}

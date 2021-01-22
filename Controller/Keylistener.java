import java.awt.event.KeyListener;  
import java.awt.event.KeyEvent; 

public class Keylistener implements KeyListener {
    
    public Keylistener() {

        this.initRI();
    }
    public void keyPressed( KeyEvent e) {

        char pressed = e.getKeyChar();

        if(pressed == 'w' || pressed == 'W') {

            ri.fwdPressed();
        }
        if(pressed  == 's' || pressed == 'S') {

            ri.backPressed();   
        }
        if(pressed == 'a' || pressed == 'A') {

            ri.leftPressed();
        }
        if(pressed == 'd' || pressed == 'D') {

            ri.rightPressed();
        }
    }

    public void keyTyped( KeyEvent e) {


    }

    public void keyReleased( KeyEvent e) {


    }

    
    private RobotInterface ri;
    public void initRI() {

        ri = new RobotInterface();
    }
}

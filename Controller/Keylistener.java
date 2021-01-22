import java.awt.event.KeyListener;  
import java.awt.event.KeyEvent; 

public class Keylistener implements KeyListener {
    
    public Keylistener() {

        this.initRI();
    }
    boolean w = false;
    boolean a = false;
    boolean s = false;
    boolean d = false; 

    public void keyPressed( KeyEvent e) {

        char pressed = e.getKeyChar();

        if((pressed == 'w' || pressed == 'W') && !w) {

            w = true;
           ri.fwdPressed();
        }
        if((pressed  == 's' || pressed == 'S') && !s) {

            s = true;
            ri.backPressed();   
        }
        if((pressed == 'a' || pressed == 'A') && !a) {

            a = true;
            ri.leftPressed();
        }
        if((pressed == 'd' || pressed == 'D') && !d) {

            d = true;
            ri.rightPressed();
        }
    }

    public void keyTyped( KeyEvent e) {

            
    }

    public void keyReleased( KeyEvent e) {

        char pressed = e.getKeyChar();

        if(pressed == 'w' || pressed == 'W') {

            w = false;
           ri.fwdReleased();
        }
        if(pressed  == 's' || pressed == 'S') {

            s = false;
            ri.backReleased();   
        }
        if(pressed == 'a' || pressed == 'A') {

            a = false;
            ri.leftReleased();
        }
        if(pressed == 'd' || pressed == 'D') {

            d = false;
            ri.rightReleased();
        }
    }

    
    private RobotInterface ri;
    public void initRI() {

        ri = new RobotInterface();
    }
}

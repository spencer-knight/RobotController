import javax.swing.JFrame;
import java.awt.GraphicsConfiguration;

public class ControlPanel {

    static GraphicsConfiguration gc;
    public ControlPanel() {

        JFrame frame = new JFrame(gc);
        frame.setSize( 300, 150);
        frame.setTitle("Control Panel");
        frame.addKeyListener(new Keylistener());
        frame.setVisible(true);
    }
}

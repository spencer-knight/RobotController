import java.net.Socket;
import java.io.DataOutputStream;

public class RobotInterface {
    
    Socket connection = null;
    DataOutputStream out = null;
    public RobotInterface() {

        //connect to server
        try{ 

            connection = new Socket("127.0.0.1", 4040);
            out = new DataOutputStream( connection.getOutputStream());
        }   
        catch( Exception e) {

            System.out.println(e);
            e.printStackTrace();
        }

    }
    private static final byte[] one = { 0x1};
    private static final byte[] zero = { 0x0};
    public void fwdPressed() {

        System.out.println("Move fwd"); 
        RobotPacket rp = new RobotPacket( 1, (short)420, one);
        sendPacket(rp); 
    }
    public void backPressed() {

        System.out.println("Move back");
        RobotPacket rp = new RobotPacket( 1, (short)7, one);
        sendPacket(rp);
    }
    public void rightPressed() {

        System.out.println("Turn Right");  
        RobotPacket rp = new RobotPacket( 1, (short)720, one);
        sendPacket(rp);
    }
    public void leftPressed() {

        System.out.println("Turn Left");
        RobotPacket rp = new RobotPacket( 1, (short)53, one);
        sendPacket( rp);
    }
    public void fwdReleased() {

        System.out.println("Stop Move fwd"); 
        RobotPacket rp = new RobotPacket( 1, (short)420, zero);
        sendPacket(rp); 
    }
    public void backReleased() {

        System.out.println("Stop Move back");
        RobotPacket rp = new RobotPacket( 1, (short)7, zero);
        sendPacket(rp);
    }
    public void rightReleased() {

        System.out.println("Stop Turn Right");  
        RobotPacket rp = new RobotPacket( 1, (short)720, zero);
        sendPacket(rp);
    }
    public void leftReleased() {

        System.out.println("Stop Turn Left");
        RobotPacket rp = new RobotPacket( 1, (short)53, zero);
        sendPacket( rp);
    }
    private void sendPacket(RobotPacket rp) {

        try{

            out.write(rp.toBytes());
        }
        catch( Exception e) {

            System.out.println( e);
            e.printStackTrace();
        }
    }
}

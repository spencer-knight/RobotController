import java.util.Scanner;
import java.net.Socket;
import java.lang.Exception;
import java.io.DataOutputStream;



class Main {
  public static void main(String[] args) {
  
	  /*try{ 

          byte[] testData = { 0x00, 0x03};
		  Socket s = new Socket("127.0.0.1", 4040);
		  DataOutputStream dos = new DataOutputStream(s.getOutputStream());

		  RobotPacket rp = new RobotPacket(2, (short)1, testData);
		  while(true) {

			  dos.write(rp.toBytes(), 0, rp.toBytes().length);
		  }
	  }
	  catch( Exception e) {

		  System.out.println( e);
	  }

	  */
	  ControlPanel cp = new ControlPanel();
	  while(true) {

		//Do robot stuff
	  }
  }
}
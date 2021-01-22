import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Main {
  public static void main(String[] args) {

	try {	
		
		ServerSocket ss = new ServerSocket( 4040);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		byte[] inputBuff = new byte[6];

		while(true) {

			dis.read(inputBuff);
			RobotPacket rp = new RobotPacket(inputBuff);
			byte[] data = new byte[rp.getLength()];
			dis.read(data);
			rp.setBytes(data);
			System.out.println("Length: " + rp.getLength());
			System.out.println("Type: " + rp.getType());
			for(int i = 0; i < rp.getLength(); i++) {

				System.out.println( rp.getBytes()[i] + " = " + (char)i);
			}
		}
	}
	catch( Exception e) {

	  System.out.println( e);
	}
  }
}
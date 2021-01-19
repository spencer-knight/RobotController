import java.nio.ByteBuffer;

class RobotPacket {

	private int length = 0;
	private short type = 0;
	private byte[] bytes;

	public RobotPacket(int length, short type, byte[] bytes) {

		this.length = length;
		this.type = type;
		this.bytes = bytes;
	}

	public RobotPacket(int length, short type) {
    
		this.length = length;
		this.type = type;
		bytes = new byte[0];	
	}

	public RobotPacket(byte[] in) {

		ByteBuffer lenB = ByteBuffer.wrap(in, 0, 4);
		length = lenB.getInt();
		ByteBuffer typeB = ByteBuffer.wrap(in, 4, 2);
		type = typeB.getShort();
		System.out.println(type);
	}
  
  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public short getType() {
    return type;
  }

  public void setType(short type) {
    this.type = type;
  }

  public byte[] getBytes() {
    return bytes;
  }

  public void setBytes(byte[] bytes) {
    this.bytes = bytes;
  }

  public byte[] toBytes() {

	  ByteBuffer bb = ByteBuffer.allocate(length + 6);
	  bb.putInt(length);
	  bb.putShort(type);
	  bb.put(bytes);

	  return bb.array();
  }
}

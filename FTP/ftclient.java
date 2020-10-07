import java.io.*;
import java.net.*;

public class ftclient
{
	public static void main(String[] args) throws Exception
	{
		Socket socket=new Socket(InetAddress.getByName("localhost"),5000);
		FileOutputStream fos=new FileOutputStream("e:\\data2.bin");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		InputStream is=socket.getInputStream();
		socket.close();
		System.out.println("File saved successfully");
	}
}

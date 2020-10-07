import java.io.*;

import java.net.*;

 

public class ftserver

{

public static void main(String[] args) throws Exception

{

ServerSocket ssock=new ServerSocket(5000);

Socket socket=ssock.accept();

 

InetAddress IA=InetAddress.getByName("localhost");

File file=new File("e:\\data2.bin");

FileInputStream fis=new FileInputStream(file);

BufferedInputStream bis=new BufferedInputStream(fis);

OutputStream os=socket.getOutputStream();

socket.close();

ssock.close();

System.out.println("File sent successfully");

}

}

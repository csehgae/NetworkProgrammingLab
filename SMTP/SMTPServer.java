import java.io.*;
import java.net.*;
class SMTPServer			// SMTP Server
{
public static void main(String arg[])
{
try
{
DatagramSocket ds=new DatagramSocket(5100);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
byte[]rd=new byte[20];
byte[]rd1=new byte[20];
byte[]rd2=new byte[20];
while(true)
{
DatagramPacket sdpr=new DatagramPacket(rd,rd.length);
ds.receive(sdpr);
String str=new String(sdpr.getData());
System.out.println("\n");
System.out.println("From : "+str);
DatagramPacket sdpr1=new DatagramPacket(rd1,rd1.length);
ds.receive(sdpr1);
String str1=new String(sdpr1.getData());
System.out.println("\n");
System.out.println("To : "+str1);
DatagramPacket sdpr2=new DatagramPacket(rd2,rd2.length);
ds.receive(sdpr2);
String str2=new String(sdpr2.getData());
System.out.println("\n");
System.out.println("Content : "+str2);
}
}catch(Exception e){}
}
}

/*

student@HGACPL0##:~/Jowin$ javac SMTPServer.java
student@HGACPL0##:~/Jowin$ java SMTPServer

From : Jowin
To : Jomon
Content : Hi

*/


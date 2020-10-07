import java.io.*;
import java.net.*;
class SMTPClient			// SMTP Client
{
public static void main(String args[])
{
try
{
DatagramSocket cds=new DatagramSocket();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
System.out.println("\nFrom:");
String c=br.readLine();
System.out.println("\nTo:");
String c1=br.readLine();
System.out.println("\nContent:");
String c2=br.readLine();
byte[] sd=new byte[20];
sd=c.getBytes();
InetAddress addr=InetAddress.getLocalHost();
DatagramPacket cdps=new DatagramPacket(sd,sd.length,addr,5100);
cds.send(cdps);
byte[]sd1=new byte[20];
sd1=c1.getBytes();
InetAddress addr1=InetAddress.getLocalHost();
DatagramPacket cdps1=new DatagramPacket(sd1,sd1.length,addr1,5100);
cds.send(cdps1);
byte[]sd2=new byte[20];
sd2=c2.getBytes();
InetAddress addr2=InetAddress.getLocalHost();
DatagramPacket cdps2=new DatagramPacket(sd2,sd2.length,addr2,5100);
cds.send(cdps2);
}
}
catch(Exception e){}
}
}

/*

student@HGACPL0##:~/Jowin$ javac SMTPClient.java
student@HGACPL0##:~/Jowin$ java SMTPClient

From:
Jowin
To:
Jomon 
Content:
Hi

From:

*/

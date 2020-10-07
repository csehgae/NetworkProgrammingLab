import java.io.*;
import java.net.*;
import os;

class csaw
{
public static void main(String a[])throws Exception
{
Socket cc=new Socket("127.0.0.1", 5010);
BufferedReader ci=new BufferedReader(new InputStreamReader(cc.getInputStream()));
DataInputStream ck=new DataInputStream(System.in);
PrintWriter co=new PrintWriter(cc.getOutputStream(), true);
String str;
String re;
while( true )
{
System.out.println( "Enter data to be read: " );
str=ck.readLine();
co.println( str );
cc.setSoTimeout( 10000 );
while( true )
{
try
{
re=ci.readLine();
System.out.println("Received Acknowledgement\n Thank You");
break;
}
catch(Exception e)
{
co.println( str );
co.println( str );
}
}
}
}
}

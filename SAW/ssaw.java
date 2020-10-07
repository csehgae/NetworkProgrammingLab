import java.io.*;
import java.net.*;
class ssaw
{
public static void main(String a[])throws Exception
{
ServerSocket ss=new ServerSocket(5010);
Socket cs=ss.accept();
DataInputStream ki=new DataInputStream(System.in);
BufferedReader si=new BufferedReader(new InputStreamReader(cs.getInputStream()));
PrintWriter so=new PrintWriter(cs.getOutputStream(),true);
String sts;
while(true)
{
sts=si.readLine();
System.out.println("Received data(press enter to ack):\n"+sts);
while(ki.available()==0)
{
sts=si.readLine();
}
sts=ki.readLine();
so.println(sts);
}
}
} 

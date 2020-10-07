
import java.io.*;

import java.net.*;

class cgobn

{

public static void main(String args[])throws Exception

{

Socket cc=new Socket("127.0.0.1",5010);

BufferedReader ci=new BufferedReader(new InputStreamReader(cc.getInputStream()));

DataInputStream ck=new DataInputStream(System.in);

PrintWriter co=new PrintWriter(cc.getOutputStream(),true);

String stc;

int[] data=new int[10];

int i;

System.out.print("Enter data: ");

for(i=1;i<=6;i++)

{

stc=ck.readLine();

data[i]=Integer.parseInt(stc);

co.println(stc);

}

i=Integer.parseInt(ci.readLine());

System.out.println("Sending Data Packets from :"+i);

for(;i<=6;i++)

{

co.println(data[i]);

}

}

}

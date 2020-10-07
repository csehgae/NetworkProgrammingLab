import java.io.*;

import java.net.*;

class sgobn

{

public static void main(String args[])throws Exception

{

ServerSocket ss=new ServerSocket(5010);

Socket cs=ss.accept();

BufferedReader si=new BufferedReader(new InputStreamReader(cs.getInputStream()));

PrintWriter so=new PrintWriter(cs.getOutputStream(),true);

DataInputStream sk=new DataInputStream(System.in);

String sts;

int  i;

int[] data=new int[10];

for(i=1;i<=6;i++)

{

sts=si.readLine();

System.out.println(sts);

}

System.out.println("Enter corrupted Data Packet:   ");

{

sts=sk.readLine();

i=Integer.parseInt(sts);

so.println(sts);

for(;i<=6;i++)

{

sts=si.readLine();

System.out.println(sts);

}

}

}

}

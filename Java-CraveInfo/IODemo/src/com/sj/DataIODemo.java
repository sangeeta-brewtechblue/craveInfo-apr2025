package com.sj;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIODemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	       int x =5;
	       float y =10.3f;
	       double z =3.14;
	       String s ="abc";
	       FileOutputStream fos = new FileOutputStream("DataFile");
	       DataOutputStream dos = new DataOutputStream(fos);
	       dos.writeInt(x);
	       dos.writeFloat(y);
	       dos.writeDouble(z);
	       dos.writeUTF(s);
	       
	       FileInputStream fis = new FileInputStream("DataFile");
	       DataInputStream dis = new DataInputStream(fis);
	       
	       System.out.println(dis.readInt());
	       System.out.println(dis.readFloat());
	       System.out.println(dis.readDouble());
	       System.out.println(dis.readUTF());
	       
	       fis.close();
	       dis.close();
	       
	       
	
	
	}

}

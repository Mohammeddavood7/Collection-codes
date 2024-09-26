package com.april30.HashMap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class DeSerializableClass
{

		static SerializableClass s1	= new SerializableClass(555,"smith",44000.0);
		static SerializableClass s2	= new SerializableClass(222,"scott",54000.0);
		static SerializableClass s3	= new SerializableClass(444,"ward",64000.0);
        
		public static void callSerial() throws IOException
		{	    
			HashSet<SerializableClass> hs = new HashSet<>();
               hs.add(s1);
               hs.add(s2);
               hs.add(s3);

               
			 var fos = new FileOutputStream("D:\\advancejavaxml\\serial.txt");
             @SuppressWarnings("resource")
			var oos = new ObjectOutputStream(fos);
             oos.writeObject(hs);
		}
		
		public static void main(String[] args) throws IOException, ClassNotFoundException
		{
			DeSerializableClass.callSerial();
			var fis = new FileInputStream("D:\\advancejavaxml\\serial.txt");
		    @SuppressWarnings("resource")
			var ois = 	new ObjectInputStream(fis);
		    @SuppressWarnings("unchecked")
			HashSet<SerializableClass> hss =  (HashSet<SerializableClass>)ois.readObject();
			hss.forEach(re ->System.out.println(re));
		}
	
}


















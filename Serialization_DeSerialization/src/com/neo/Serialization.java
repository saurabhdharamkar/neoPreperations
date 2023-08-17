package com.neo;

import java.io.*;    
class Serialization{    
 public static void main(String args[]){    
  try{    
  
  Student s1 =new Student(211,"ravi");    

  FileOutputStream fout=new FileOutputStream("f.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(s1);    
  out.flush();    
  
  out.close();    
  System.out.println("success "+s1.toString());    
  }catch(Exception e){System.out.println(e);}    
 }    
}    


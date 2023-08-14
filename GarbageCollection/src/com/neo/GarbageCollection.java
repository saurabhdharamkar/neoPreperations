package com.neo;

public class GarbageCollection {
	   String name;
	   GarbageCollection(String name){
	      this.name = name;
	   }
	   protected void finalize() throws Throwable {
	      System.out.println(this.name + " successfully garbage collected");
	   }
	   public static void main(String args[]){
		   GarbageCollection obj = new GarbageCollection("myObject1");
	      obj = null;
	      System.gc();
	   }
	}
package com.neo;


import java.util.ArrayList;
import java.util.Arrays;


class CustomException1 extends Exception {
  
	private static final long serialVersionUID = 1L;

public CustomException1(String message) {

    super(message);
  }
}

class Main2 {

  ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));

  public void checkLanguage(String language) throws CustomException1 {


    if(languages.contains(language)) {
      throw new CustomException1(language + " already exists");
    }
    else {

      languages.add(language);
      System.out.println(language + " is added to the ArrayList");
    }
  }

  public static void main(String[] args) throws CustomException1 {

   
    Main2 obj = new Main2();

    
    try {
      obj.checkLanguage("Swift");
      obj.checkLanguage("Java");
    }

    catch(CustomException e) {
      System.out.println("[" + e + "] Exception Occured");
    }
  }
}


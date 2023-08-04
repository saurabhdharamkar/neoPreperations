package com.neo;


import java.util.ArrayList;
import java.util.Arrays;


class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

public CustomException(String message) {

    super(message);
  }
}

class Main1 {

  ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));

  
  public void checkLanguage(String language) {


    if(languages.contains(language)) {
      throw new CustomException(language + " already exists");
    }
    else {
 
      languages.add(language);
      System.out.println(language + " is added to the ArrayList");
    }
  }

  public static void main(String[] args) {

   
    Main1 obj = new Main1();

    
    obj.checkLanguage("Swift");
    obj.checkLanguage("Java");
  }
}

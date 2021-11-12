package com.lopputyo.project;

import java.util.ArrayList;
import java.util.List;


public class Student {

    private long id;
   // private String firstname;
  //  private String lastname;
    private String name;
    private static long idCounter = 0;

    public List<Student> student = new ArrayList<>();

    public Student(String name) {
        this.id = idCounter++;;
        //this.firstname = firstname;
      //  this.lastname = lastname;
        this.name = name;
    }

   

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
        
        
    }

   /* public String getFirstname(String firstname){
        return this.firstname;
    }

    public String getLastname(String lastname){
        return this.lastname;
    }
*/
    public void setName(String name) {
        this.name = name;
       // this.lastname = lastname;
       // this.firstname = firstname;
    }

  

}

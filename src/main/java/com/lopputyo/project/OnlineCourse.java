package com.lopputyo.project;

import java.util.ArrayList;
import java.util.List;


public class OnlineCourse {

    private String website;
   private String onlinecourse;
   private String teacher;
   private long id;


    public List<OnlineCourse> online = new ArrayList<>();

    private static long idCounter = 0;

    public OnlineCourse(String onlinecourse, String teacher, String website) {
        this.id = idCounter++;;
        this.website = website;
        this.teacher = teacher;
        this.onlinecourse = onlinecourse;
    }

    public long getId() {
        return this.id;
    }


    public void setWebsite(String website){
        this.website = website;
    }

    public String getWebsite(){
        return this.website;
    }

    public void setOnlineCourse(String onlinecourse){
        this.onlinecourse = onlinecourse;
    }

    public String getOnlineCourse(){
        return this.onlinecourse;
    }

    public void setTeacher(String teacher){
        this.teacher = teacher;
    }

    public String getTeacher(){
        return this.teacher;
    }


    
}

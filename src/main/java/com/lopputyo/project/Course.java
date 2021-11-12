package com.lopputyo.project;

import java.util.ArrayList;
import java.util.List;


public class Course {
    private long id;
    private String coursename;
    private String teachername;
    public List<Course> courses = new ArrayList<>();

    private static long idCounter = 0;

    public Course(String coursename, String teachername) {
        this.id = idCounter++;;
        this.coursename = coursename;
        this.teachername = teachername;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoursename() {
        return this.coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getTeachername(){
        return this.teachername;
    }

    public void setTeachername(String teachername){
        this.teachername = teachername;
    }

}

   
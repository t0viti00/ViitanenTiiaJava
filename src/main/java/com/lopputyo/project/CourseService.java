package com.lopputyo.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    public List<Course> Courses = new ArrayList<>();
    public List<Student> Students = new ArrayList<>();


    public CourseService(){
       
        Course o1 = new Course("Web Services","Pekka");
        Courses.add(o1);

        Course o2 = new Course("Java", "Matti");
        Courses.add(o2);

        Student p1 = new Student("Pelkonen Hanna");
        Students.add(p1);
       

    
    }

    public List<Course> getCoursesByName(String coursename){

        List<Course> found = new ArrayList<>();

        for (Course course : Courses) {
            if(course.getCoursename().equals(coursename)){
                found.add(course);
            }
        }
        return found;
    }

    public List<Course> getCoursesByTeacher(String teachername){

        List<Course> found = new ArrayList<>();

        for (Course course : Courses) {
            if(course.getTeachername().equals(teachername)){
                found.add(course);
            }
        }
        return found;
    }


    public List<Student> getStudentsByName(String name){

        List<Student> found = new ArrayList<>();

        for (Student student : Students) {
            if(student.getName().equals(name)){
                found.add(student);
            }
        }
        return found;

    }

    
}

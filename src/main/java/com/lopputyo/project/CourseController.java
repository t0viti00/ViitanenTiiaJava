package com.lopputyo.project;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    CourseService CourseService;

    @GetMapping("Students")
    public List<Student> getStudents(){
        return CourseService.Students;
    }

    @GetMapping("Courses")
    public List<Course> getCourses(){
        return CourseService.Courses;
    }

    @GetMapping("OnlineCourses")
    public List<OnlineCourse> getOnlineCourses(){
        return CourseService.online;
    }


    @GetMapping("Courses/{name}")
    public List<Course> getCustomerCourses(@PathVariable String name){
        return CourseService.getCoursesByName(name);
    }
    

      @GetMapping("Students/{name}")
    public List<Student> getStudents(@PathVariable String name){
        return CourseService.getStudentsByName(name);
    }

    @PostMapping("create")
    public String addStudent(@RequestBody Student Student ){

        CourseService.Students.add(Student);

        return "Lisäys onnistui!";
    }
}

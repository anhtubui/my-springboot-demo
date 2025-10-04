package spring.com.demo.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
            new Course(1, "Spring", "Spring Framework"),
            new Course(2, "Spring Boot", "Spring Boot Framework"),
            new Course(3, "Spring Security", "Spring Security Framework"),
            new Course(4, "Spring Data JPA", "Spring Data JPA Framework"),
            new Course(5, "Spring Data MongoDB", "Spring Data MongoDB Framework"),
            new Course(6, "Spring Data Redis", "Spring Data Redis Framework"),
            new Course(7, "Spring Data Elasticsearch", "Spring Data Elasticsearch Framework"),
            new Course(8, "Spring Data Solr", "Spring Data Solr Framework"),
            new Course(9, "Spring Data JMS", "Spring Data JMS Framework"),
            new Course(10, "Spring Data AMQP", "Spring Data AMQP Framework"),
            new Course(11, "Spring Data JPA", "Spring Data JPA Framework"),
            new Course(12, "Spring Data MongoDB", "Spring Data MongoDB Framework"),
            new Course(13, "Spring Data Redis", "Spring Data Redis Framework")
            );
    }
    
}

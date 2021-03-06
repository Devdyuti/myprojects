package org.tutorial.spring.ws.service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.tutorial.spring.ws.model.Course;
import org.tutorial.spring.ws.model.Student;

@Component
public class StudentService {
	private static List<Student> students=new ArrayList<Student>();
	
	static {
		Course course1=new Course("1", "JAVA", "Enterprise application", Arrays.asList("Learn core java","learn opps concept","learn collection"));
		Course course2=new Course("2", ".NET", "Business Application", Arrays.asList("Learn C#","learn VB concept","learn .net framework"));
		Course course3=new Course("3", ".PHP", "Web Application", Arrays.asList("Learn core php","learn opps concept","learn web part"));
		Course course4=new Course("4", ".PERL", "Highly integrated Applications", Arrays.asList("Learn core peral","learn c++ concept","learn Objective C"));
		
		Student ravi=new Student("1", "Ravi", "Ravi is Btech Student", new ArrayList<>(Arrays.asList(course1,course2,course3,course4)));
		Student devd=new Student("2", "Dyuti", "Devdyuti is student of MCA and learning JAVA", new ArrayList<>(Arrays.asList(course1,course3)));
		
		students.add(ravi);
		students.add(devd);
		System.out.println("CHECKING: "+students);
	}
	
	public List<Student> retrieveAllStudents(){
		return students;
	}
	public Student retrieveStudent(String studentId) {
		for(Student student:students) {
			if(student.getId().equals(studentId)) {
				return student;
			}
		}
		return null;
	}
	public List<Course> retrieveCourses(String studentId){
		Student student=retrieveStudent(studentId);
		if(student==null) {
			return null;
		}
		return student.getCourses();
	}
	public Course retrieveCourse(String studentId, String courseId) {
		Student student=retrieveStudent(studentId);
		if(student==null) {
			return null;
		}
		for(Course course:student.getCourses()) {
			if(course.getId().equals(courseId)) {
				return course;
			}
		}
		return null;
	}
	private SecureRandom random=new SecureRandom();
	public Course addCourse(String studentId, Course course) {
		Student student=retrieveStudent(studentId);
		if(student==null) {
			return null;
		}
		String randomId=new BigInteger(130, random).toString(32);
		course.setId(randomId);
		student.getCourses().add(course);
		return course;
	}
}

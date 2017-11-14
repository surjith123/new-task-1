package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id");
		int studentId = Integer.valueOf(bf.readLine());
		System.out.println("Enter Name");
		String studentName = bf.readLine();
		System.out.println("Enter Email");
		String studentEmail = bf.readLine();
		System.out.println("Enter phone number");
		long phone = Long.valueOf(bf.readLine());
		System.out.println("Enter student address");
		String studentAddress = bf.readLine();
		System.out.println("Enter student mark");
		int studentMark = Integer.valueOf(bf.readLine());
		System.out.println("Enter student age");
		int studentAge = Integer.valueOf(bf.readLine());
		System.out.println("student year");
		int studentYear = Integer.valueOf(bf.readLine());
		Student student = new Student(studentId, studentName, studentEmail, phone, studentAddress,
				studentMark, studentAge, studentYear);
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentEmail());
		System.out.println(student.getPhone());
		System.out.println(student.getStudentAddress());
		System.out.println(student.getStudentMark());
		System.out.println(student.getStudentYear());
		System.out.println(student.getStudentAge());
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}

}

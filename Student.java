package org.main;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "STUDENT_DETAILS")
public class Student{
	@Id
	@GeneratedValue
	@Column(name = "Student_ID")
	private int studentId;
	@Column(name = "Student_NAME", length = 155)
	private String studentName;
	@Column(name = "EMAIL_ID", nullable = false)
	private String studentEmail;
	private long phone;
	@Column(name = "Student_address")
	private String studentAddress;
	@Column(name = "DOB")
	private int dateOfBirth;
	@Column(name = "YEAR")
	private int studentYear;
	@Column(name = "MARK")
	private int studentMark;
	@Column(name = "AGE")
	private int studentAge;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String studentEmail, long phone,String studentAddress,
			int dateOfBirth, int studentYear, int studentMark, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.phone = phone;
		this.studentAddress = studentAddress;
		this.dateOfBirth = dateOfBirth;
		this.studentYear = studentYear ;
		this.studentMark = studentMark;
		this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(int studentAddress) {
		this.studentAddress = studentAddress;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public int getStudentMark() {
		return studentMark;
	}

	public void setStudentMark(int studentMark) {
		this.studentMark = studentMark;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	

};

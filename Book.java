package org.isbn.bk;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Book {
        private int id;
        private String name;
        private String publisher;
        private String author;
        private double price;
        @Temporal(TemporalType.DATE)
        private Date published;
        private String isbnNo;
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Book(int id, String name, String publisher, String author, double price, Date published, String isbnNo) {
			super();
			this.id = id;
			this.name = name;
			this.publisher = publisher;
			this.author = author;
			this.price = price;
			this.published = published;
			this.isbnNo = isbnNo;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
		
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		public Date getPublished() {
			return published;
		}
		public void setPublished(Date published) {
			this.published = published;
		}
		public String getIsbnNo() {
			return isbnNo;
		}
		public void setIsbnNo(String isbnNo) {
			this.isbnNo = isbnNo;
		}
        
        
}

package org.isbn.bk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id");
		int id = Integer.valueOf(bf.readLine());
		System.out.println("Enter Name");
		String name = bf.readLine();
		System.out.println("Enter publisher");
		String publisher = bf.readLine();
		System.out.println("Enter author");
		String author = bf.readLine();
		System.out.println("Enter price");
		double price = Double.valueOf(bf.readLine());
		System.out.println("Enter date");
		Date published =new Date(bf.readLine());
		System.out.println("Enter isbnNo");
		String isbnNo=bf.readLine();
		Book book = new Book(id,name,publisher,author,price,published,isbnNo);
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getPublisher());
		System.out.println(book.getAuthor());
		System.out.println(book.getPrice());
		System.out.println(book.getPublished());
		System.out.println(book.getIsbnNo());
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}


	}


<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-mapping PUBLIC 
 "-//Hibernate/Hibernate Mapping DTD//EN"
 "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">

<hibernate-mapping>
	<class name="org.isbn.bk.Book" table="BOOK_DETAILS">
		<id name="id" type="int" column="BK_ID">
			<generator class="increment" />
		</id>
		<property name="name" column="NAME" type="string" />
		<property name="publisher" column="PUBLISHER" type="string" />
		<property name="author" column="AUTHOR" type="string" />
		<property name="price" column="PRICE" type="double" />
		<property name="published" column="PUBLISHED" type="date" />
		<property name="isbnNo" column="ISBN_NO" type="string" />
	</class>
</hibernate-mapping>

<?xml version='1.0' encoding='utf-8'?>
<!-- ~ Hibernate, Relational Persistence for Idiomatic Java ~ ~ License: 
	GNU Lesser General Public License (LGPL), version 2.1 or later. ~ See the 
	lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>. -->
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>

	<session-factory>

		<!-- Database connection settings -->
		<property name="connection.driver_class">com.mysql.jdbc.Driver</property>
		<property name="connection.url">jdbc:mysql://localhost:3306/sample</property>
		<property name="connection.username">root</property>
		<property name="connection.password"></property>

		<!-- JDBC connection pool (use the built-in) -->
		<property name="connection.pool_size">10</property>

		<!-- SQL dialect -->
		<property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>

		<!-- Disable the second-level cache -->
		<property name="cache.provider_class">org.hibernate.cache.internal.NoCacheProvider</property>

		<!-- Echo all executed SQL to stdout -->
		<property name="show_sql">true</property>

		<!-- Drop and re-create the database schema on startup -->
		<property name="hbm2ddl.auto">create</property>

		<!-- Names the annotated entity class -->
		<mapping class="org.main.Employee" />
		<mapping resource="org/main/employee.hbm.xml/" />
		<mapping class="org.isbn.bk.Book" />
		<mapping resource="org/isbn/bk/book.hbm.xml/" />

	</session-factory>

</hibernate-configuration>
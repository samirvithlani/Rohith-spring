package com.demo;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		// invoke continer,,,
		// EmployeeBean emp = new EmployeeBean();

		ApplicationContext ctx = new FileSystemXmlApplicationContext("src\\main\\java\\com\\ApplicationContext.xml");
		EmployeeBean emp = ctx.getBean("emp", EmployeeBean.class);
		System.out.println(emp.getEid());
		System.out.println(emp.getName());

//		StudentBean studentBean1 = new StudentBean();
//		studentBean1.setDate(new Date());
//		System.out.println(studentBean1.getDate());

		StudentBean studentBean = ctx.getBean("stu", StudentBean.class);
		System.out.println(studentBean.getsMarks());
		System.out.println(studentBean.getJoiningDate());
		System.out.println(studentBean.getStudentDetail().getCity());

		// java.util.Date joiningDate = new Date();

		StudentDetail studentDetail = ctx.getBean("detail", StudentDetail.class);
		studentDetail.getCity();

	}
}

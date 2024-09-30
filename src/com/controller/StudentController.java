package com.controller;

import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) throws Exception {
		StudentService ss = new StudentService();
		//ss.insertdata();
		//ss.updateData();
		ss.fetchData();
		//ss.deleteData();
	}
	
}

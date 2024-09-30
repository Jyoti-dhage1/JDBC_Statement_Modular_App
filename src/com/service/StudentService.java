package com.service;

import com.dao.Studentdao;

public class StudentService {
	
	public void insertdata() throws Exception{
		Studentdao sd=new Studentdao();
		sd.insertData();
	}
	public void updateData() throws Exception{
		Studentdao sd=new Studentdao();
		sd.updateData();
	}
	public void deleteData() throws Exception{
		Studentdao sd=new Studentdao();
		sd.deleteData();
	}
	public void fetchData() throws Exception{
		Studentdao sd=new Studentdao();
		sd.fetchData();
	}
}

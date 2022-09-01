package com.example1.MySchool.MySchoolController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.MySchool.MySchoolService.MySchoolService;

@RestController
public class MySchoolController {
	@Autowired
	MySchoolService mservice;
	
	@GetMapping("/getstaffdata")
	public List<StaffDao> getStaffdata(){
		return
	}
	
	@GetMapping("/getStudentdata")
	public List<StudentDao> getStudentdata(){
		return s;
	}

}

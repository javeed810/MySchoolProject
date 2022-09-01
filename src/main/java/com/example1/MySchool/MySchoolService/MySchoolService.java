package com.example1.MySchool.MySchoolService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example1.MySchool.MySchoolDao.MySchoolDao;

@Service
public class MySchoolService {
		static List<MySchoolDao> ms=new ArrayList<MySchoolDao>();
		static {
			ms.add(new MySchoolDao("mahatma gandhi school yadgir"));
		}
	}


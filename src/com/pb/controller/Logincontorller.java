package com.pb.controller;

import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pb.dao.StudentDao;
import com.pb.domain.Student;

@Controller
public class Logincontorller {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	StudentDao studentdao=(StudentDao) context.getBean("studentDao");
	
	@RequestMapping(value="/login")	
	public String Login(String name,Map<String,Object>map){
		System.out.println(name);
		List<Student> list=studentdao.list();	
		map.put("list", list);
		return "display";
	}
}

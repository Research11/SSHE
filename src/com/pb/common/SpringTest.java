package com.pb.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pb.dao.StudentDao;
import com.pb.domain.Student;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao studentdao=(StudentDao) context.getBean("studentDao");
		//ClassesDao studentdao1=(ClassesDao) context.getBean("classes");
		Student stu=studentdao.findBid(3);
		stu.setName("wangwu");
		studentdao.update(stu);
		/*Classes classes=new Classes();
		classes.setName("jsp");
		
		studentdao1.save(classes);*/
				
		/*List<Classes> set=studentdao1.classes();
		
		for(Classes classes:set){
			System.out.println(classes.getName());
			Set<Student> set1=classes.getStudent();
			for(Student stu1:set1){
				System.out.println(stu1.getName());
			}
		}*/
		
		/*Student stu=new Student();
		stu.setName("zhaoliu");
		stu.setEmail("zhaoliu@126.com");
		stu.setBirthday(new Date());
		stu.setClasses(studentdao1.findByid(2));
		
		
		
		
		studentdao.svae(stu);*/
		
		
		
		
		/*List<Student> list=studentdao.list();
		
		for(Student stu:list){
			System.out.println(stu.getName());
		}*/
	}

}

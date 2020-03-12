package mql.student.dao.Impl;

import java.util.ArrayList;

import StudentClass.Student;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDaoImpl std = new StudentDaoImpl();
		String sql = "select * from student";
		Object[] obj = null;
		ArrayList<Student> list = null;
		list = std.MqlQuery(sql,obj);
		System.out.println("");
		if(list.isEmpty())
		{
			System.out.println("empty");
		}
		else
		{
			for (int i = 0; i < list.size();i++) {
				System.out.println(list.get(i).getSnum());
				System.out.println(list.get(i).getSname());
				System.out.println(list.get(i).getSclass());
				System.out.println(list.get(i).getSpross());
			}
		}
		
	}

}

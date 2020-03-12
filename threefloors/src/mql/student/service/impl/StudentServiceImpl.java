package mql.student.service.impl;

import java.util.ArrayList;

import StudentClass.Student;
import mql.student.service.*;
import mql.student.dao.Impl.*;
import mql.student.dao.*;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao update;
	
	private ArrayList<Student> list;
	private static String insertsql = "insert into student (Snum,Sname,Sclass,Spross) values (?,?,?,?)";
	private static String sqlall = "select * from student";
	private static String dropsql = "delete from student where Snum = ?;";
	
	public StudentServiceImpl() {
		update = new StudentDaoImpl();
		list = update.MqlQuery(sqlall, null);
	}

	@Override
	public int InsertTable(Object[] obj) {
		// TODO Auto-generated method stub
		if(obj == null)
		{
			return -1;
		}
		int up = update.Update(insertsql, obj);
		if (up == 1) {
			return 1;// 执行正常插入
		}
		return 0;
	}

	@Override
	public int DropTable(String id) {
		// TODO Auto-generated method stub
		int i = 0;
		if (list == null) {
			return -1;// 表中没有数据
		}
		Object[] ob = {id};
		i = update.Update(dropsql,ob);
		
		return i;
	}

	@Override
	public int ModifyTable( String sql, Object[] obj) {
		// TODO Auto-generated method stub
		if (list == null) {
			return -1;// 表中没有数据
		}
		else {
			return update.Update(sql,obj);
		}
		
	}

	@Override
	public ArrayList<Student> Queryall() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Student Queryone(String id) {
		// TODO Auto-generated method stub
		if (list != null) {
			for (Student s : list) {
				if (id.equals(s.getSnum())) {
					return s;
				}
			}
		}
		return null;
	}

}

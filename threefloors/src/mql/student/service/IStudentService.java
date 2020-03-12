package mql.student.service;

import java.util.ArrayList;

import StudentClass.Student;

public interface IStudentService {
	public int InsertTable( Object[] obj);

	public int DropTable( String obj);

	public int ModifyTable(String sql, Object[] obj);

	public ArrayList<Student> Queryall();

	public Student Queryone(String id);
}

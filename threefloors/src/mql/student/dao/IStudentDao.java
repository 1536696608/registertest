/*
 * Dao²ã½Ó¿Ú
 */
package mql.student.dao;

import java.util.ArrayList;

import StudentClass.Student;

public interface IStudentDao {
	public  ArrayList<Student>  MqlQuery(String sql,Object[] obj);
	public int Update(String sql,Object[] obj);//Ôö
	
//	ArrayList<Student> MqlQuery( String sql, Object[] obj);
}

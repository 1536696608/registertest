/*
 * Dao��ӿ�
 */
package mql.student.dao;

import java.util.ArrayList;

import StudentClass.Student;

public interface IStudentDao {
	public  ArrayList<Student>  MqlQuery(String sql,Object[] obj);
	public int Update(String sql,Object[] obj);//��
	
//	ArrayList<Student> MqlQuery( String sql, Object[] obj);
}

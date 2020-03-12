package mql.student.dao.Impl;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import StudentClass.Student;
import mql.student.dao.DBuil;
import mql.student.dao.IStudentDao;

public class StudentDaoImpl implements IStudentDao {

	public StudentDaoImpl() {
	}

	// ≤È—Ø£¨∑µªÿlist
	@Override
	public ArrayList<Student> MqlQuery(String sql, Object[] obj) {
		// TODO Auto-generated method stub
		Connection connection = null;
//		Class<Student> A = null;
		Class B = Student.class;
		ResultSet query = null;
		ArrayList<Student> students = new ArrayList<>();
		PreparedStatement prestate = null;
		try {
			connection = DBuil.GetConection();
			prestate = DBuil.GetPreState(connection, sql);
			if (obj != null) {
				for (int pre = 0; pre < obj.length; pre++) {
					prestate.setObject(pre + 1, obj[pre]);
				}
			}
			query = prestate.executeQuery();
			ResultSetMetaData metaData = query.getMetaData();
			int columnCount = metaData.getColumnCount();
			while (query.next()) {
				Student std = (Student) B.newInstance();

				for (int i = 0; i < columnCount; i++) {

					Object value = query.getObject(i + 1);
					String columnLabel = metaData.getColumnLabel(i + 1);
					
					Field field = B.getDeclaredField(columnLabel);
					field.setAccessible(true);
					field.set(std, value);
				}

				students.add(std);
			}

		} catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException
				| NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (query != null)
					query.close();
				if (prestate != null)
					prestate.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return students;
	}

	@Override
	public int Update(String sql, Object[] obj) {
		Connection connection = null;
//		Class<Student> A = null;

		PreparedStatement prestate = null;
		try {
			connection = DBuil.GetConection();
			prestate = DBuil.GetPreState(connection, sql);
			if (obj != null) {
				for (int pre = 0; pre < obj.length; pre++) {
					prestate.setObject(pre + 1, obj[pre]);
				}
			}
			prestate.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			try {

				if (prestate != null)
					prestate.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return 1;
	}

}

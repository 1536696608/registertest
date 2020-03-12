/*
 * 这是一个JavaBean，Student实现类，对应表单的学号姓名班级专业
 */
package StudentClass;

public class Student {
	private String Snum;
	private String Sname;
	private String Sclass;
	private String Spross;

	public Student(String snum, String sname, String sclass, String spross) {
		super();
		Snum = snum;
		Sname = sname;
		Sclass = sclass;
		Spross = spross;
	}
	
	public Student() {
		
	}
	
	public String getSnum() {
		return Snum;
	}

	public void setSnum(String snum) {
		Snum = snum;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getSclass() {
		return Sclass;
	}

	public void setSclass(String sclass) {
		Sclass = sclass;
	}

	public String getSpross() {
		return Spross;
	}

	public void setSpross(String spross) {
		Spross = spross;
	}

}

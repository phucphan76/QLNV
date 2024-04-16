package employeeManagementSystem;

import java.util.Date;

public class Fresher implements ShowInfo{
	private int id;
	private String fullName;
	private String birthday;
	private String phone;
	private String email;
	private String employeeType;
	private int employeeCount;
	private String GraduationDate;
	private String GraduationRank;
	private String Education;
	
	public Fresher() {
		this.employeeType = "Fresher";
	}
	
	public Fresher(int id, String fullName, String birthday, String phone, String email, String employeeType,
			int employeeCount, String GraduationDate, String GraduationRank, String Education) {
		this.id = id;
		this.fullName = fullName;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.employeeType = "Fresher";
		this.employeeCount = employeeCount;
		this.GraduationDate = GraduationDate;
		this.GraduationRank = GraduationRank;
		this.Education = Education;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public String getGraduationDate() {
		return GraduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		GraduationDate = graduationDate;
	}

	public String getGraduationRank() {
		return GraduationRank;
	}

	public void setGraduationRank(String graduationRank) {
		GraduationRank = graduationRank;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}

	@Override
	public String toString() {
		return "Fresher [id=" + id + ", fullName=" + fullName + ", birthday=" + birthday + ", phone=" + phone
				+ ", email=" + email + ", employeeType=" + employeeType + ", employeeCount=" + employeeCount
				+ ", GraduationDate=" + GraduationDate + ", GraduationRank=" + GraduationRank + ", Education="
				+ Education + "]";
	}

	@Override
	public void displayInfo(int id) {
		// TODO Auto-generated method stub
		
	}
		
}

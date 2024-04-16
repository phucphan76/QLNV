package employeeManagementSystem;

public class Intern implements ShowInfo{
	private int id;
	private String fullName;
	private String birthday;
	private String phone;
	private String email;
	private String employeeType;
	private int employeeCount;
	private String Majors;
	private int Semester;
	private String UniversityName;
	
	public Intern() {
		this.employeeType = "Intern";
	}
	
	public Intern(int id, String fullName, String birthday, String phone, String email, String employeeType,
			int employeeCount, String Majors, int Semester, String UniversityName) {
		this.id = id;
		this.fullName = fullName;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.employeeType = "Intern";
		this.employeeCount = employeeCount;
		this.Majors = Majors;
		this.Semester = Semester;
		this.UniversityName = UniversityName;
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

	public String getMajors() {
		return Majors;
	}

	public void setMajors(String majors) {
		Majors = majors;
	}

	public int getSemester() {
		return Semester;
	}

	public void setSemester(int semester) {
		Semester = semester;
	}

	public String getUniversityName() {
		return UniversityName;
	}

	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}

	@Override
	public String toString() {
		return "Intern [id=" + id + ", fullName=" + fullName + ", birthday=" + birthday + ", phone=" + phone
				+ ", email=" + email + ", employeeType=" + employeeType + ", employeeCount=" + employeeCount
				+ ", Majors=" + Majors + ", Semester=" + Semester + ", UniversityName=" + UniversityName + "]";
	}

	@Override
	public void displayInfo(int id) {
		// TODO Auto-generated method stub
		
	}
	
}

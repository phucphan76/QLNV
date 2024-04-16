package employeeManagementSystem;

public class Experience implements ShowInfo{
	private int id;
	private String fullName;
	private String birthday;
	private String phone;
	private String email;
	private String employeeType;
	private int employeeCount;
	private int ExpInYear;
	private String ProSkill;
	
	public Experience() {
		this.employeeType = "Experience";
	}
	
	public Experience(int id, String fullName, String birthday, String phone, String email, String employeeType,
			int employeeCount, int ExpInYear, String ProSkill) {
		this.id = id;
		this.fullName = fullName;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.employeeType = "Experience";
		this.employeeCount = employeeCount;
		this.ExpInYear = ExpInYear;
		this.ProSkill = ProSkill;
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

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	public String getProSkill() {
		return ProSkill;
	}

	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Experience [id=" + id + ", fullName=" + fullName + ", birthday=" + birthday + ", phone=" + phone
				+ ", email=" + email + ", employeeType=" + employeeType + ", employeeCount=" + employeeCount
				+ ", ExpInYear=" + ExpInYear + ", ProSkill=" + ProSkill + "]";
	}

	@Override
	public void displayInfo(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}

package Bank.VO;

public class BankVO {

	private String name;			// 이름
	private String nameOfBank;		// 은행 이름
	private String accountNumber;	// 계좌 번호
	private String gender;			// 성별
	private String tel;				// 전화 번호
	private String password;		// 비밀 번호

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getNameOfBank() {
		return nameOfBank;
	}

	public void setNameOfBank(String nameOfBank) {
		this.nameOfBank = nameOfBank;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "은행명: " + nameOfBank + "\n계좌번호" + accountNumber + "\n이름: " + name + "\n비밀번호: " + password + "\n성별: " + gender + "\n전화번호: " + tel;
	}

}

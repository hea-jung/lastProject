package member.dto;

public class MemberDTO {
	public String id;
	public String pass;
	public String name;
	public String email;
	public String addr;
	public String concernA1;
	public String concernB1;
	public String concernA2;
	public String concernB2;
	
	public MemberDTO(){
		
	}
	
	public MemberDTO(String id, String pass, String name, String email, String addr, String concernA1, String concernB1,
			String concernA2, String concernB2) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.concernA1 = concernA1;
		this.concernB1 = concernB1;
		this.concernA2 = concernA2;
		this.concernB2 = concernB2;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getConcernA1() {
		return concernA1;
	}
	public void setConcernA1(String concernA1) {
		this.concernA1 = concernA1;
	}
	public String getConcernB1() {
		return concernB1;
	}
	public void setConcernB1(String concernB1) {
		this.concernB1 = concernB1;
	}
	public String getConcernA2() {
		return concernA2;
	}
	public void setConcernA2(String concernA2) {
		this.concernA2 = concernA2;
	}
	public String getConcernB2() {
		return concernB2;
	}
	public void setConcernB2(String concernB2) {
		this.concernB2 = concernB2;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", email=" + email + ", addr=" + addr
				+ ", concernA1=" + concernA1 + ", concernB1=" + concernB1 + ", concernA2=" + concernA2 + ", concernB2="
				+ concernB2 + "]";
	}


	
	

}

package org.magoo;

public class Contact {
	
	private String name;
	
	private String email;
	private String contactNo;
	private String message;
	
	public Contact()
	{
		
	}
	
	public Contact(String name, String email, String contactNo, String message)
	{
		this.name=name;
		this.email=email;
		this.contactNo=contactNo;
		this.message=message;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", message=" + message + "]";
	}
	
	

}

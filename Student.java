package in.ac.sharda;

public class Student {
	
	private final int rollNumber;
	private final String name;
	private String email;
	
	public Student(int rn,String nm,String em){
		this.rollNumber = rn;
		this.name = nm;
		this.email = em;

	}
	
	public void attendance(){
		System.out.println("I am present");
		
	}
public int getRollNumber() {
	return rollNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getName() {
	return name;
}
@Override
public boolean equals(Object obj){
	if(obj instanceof Student){
		return((Student)obj)
				.getRollNumber() == rollNumber;
	}
	return false;
}
	
}


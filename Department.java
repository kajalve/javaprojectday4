package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public  class Department implements Comparable<Department>{
	
	private int id;
	private List<Student> students = new ArrayList<>();
	

	public Department(int id){
		this.id = id;
	}
	
	public void addStudent(Student student){
		this.students.add(student);
		
	}
	
public void printStudents(){
	students.parallelStream()
	.forEach(
			s ->System.out.println(
					s.getRollNumber()));
}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Department){
			return((Department)obj).getId()==id;
		}
		return false;
	}
    int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Department o){
		return o.getId() -id;
	}
    }


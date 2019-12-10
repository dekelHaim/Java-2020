import Test.Person;

public class Student extends Person {
	public String getStudentInfo() {
		//The field Person.age is not visible
		//Because he is private
		return "Student age: "+getAge()+ " ,name:"+getName();
	}
}

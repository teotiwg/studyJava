package ex08class;



class Person{
	
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "영화배우";
	
	void eat() {
		System.out.printf("%s가(이) 식사한다.\n", name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s가 잠자고 있따",  age, name);
	}
}

public class E01PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.eat();
		person.sleep();
		
		new Person().eat();
		new Person().sleep();
	}

}

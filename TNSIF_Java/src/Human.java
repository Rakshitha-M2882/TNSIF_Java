
public class Human {

	private String name;
	private String age;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Human obj=new Human();
		obj.name="rakshi";
		obj.age="20";
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
		
	}

}

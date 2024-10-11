package pac1;


public class TC006_GetterAndSetter {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TC006_GetterAndSetter obj=new TC006_GetterAndSetter();
		obj.setName("Leena");
				System.out.println("Name : "+obj.getName());
				obj.setAge(25);
				System.out.println("Age :"+obj.getAge());

	}

}

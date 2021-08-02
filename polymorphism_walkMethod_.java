class Person{
    int age;
    String name;
    int count =0;
    
    void walk()
    {
        System.out.println(name + " is walking.");
    }
    
    void walk(int steps)
    {
        System.out.println(name + " has completed "+ steps +" steps");
    }
}
public class Main
{
	public static void main(String[] args) {
	    Person p1 = new Person();
	    p1.age = 18;
	    p1.name = "mrunal";
	    p1.walk();
	    p1.walk(5);
	}
}

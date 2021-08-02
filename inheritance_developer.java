class Person
{
  int age;
  String name;
  int count = 0;

  void walk ()
  {
    System.out.println (name + " of age " + age + " is walking.");
  }

  void walk (int steps)
  {
    System.out.println (name + " has completed " + steps + " steps");
  }
}

class Developer extends Person
{
  //void walk(){
  //    System.out.println("Developer is walking");
  // }
}
public class Main
{
  public static void main (String[]args)
  {
    Person p1 = new Person ();
      p1.age = 18;
      p1.name = "mrunal";
      p1.walk ();
      p1.walk (5);

    Developer d1 = new Developer ();
      d1.name = "saee";
      d1.age = 8;
      d1.walk ();
  }
}

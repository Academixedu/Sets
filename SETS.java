public class SETS{
  public static void main(String[] args) {
Set <Person>per=new HashSet<>();
   per.add(new Person(1, "Chanakya", 234, "Dev"));
   per.add(new Person(5, "Chanakya", 234, "Dev"));
   per.add(new Person(7, "Chanakya", 234, "Dev"));
   per.add(new Person(9, "Chanakya", 234, "Dev"));

   for (Person person : per) {
    System.out.println(person);
   } 
  }
}

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
    Set <Person>p1=new LinkedHashSet<>();
 p1.add(new Person(1, "Chanakya", 234, "Dev"));
   p1.add(new Person(5, "Chanakya", 234, "Dev"));
   p1.add(new Person(7, "Chanakya", 234, "Dev"));
   p1.add(new Person(9, "Chanakya", 234, "Dev"));

   for (Person person : p1) {
    System.out.println(person);
   }
Comparator<Person> p=null;
Scanner in=new Scanner(System.in);
System.out.println("1. Sort By desg");
System.out.println("2. Sort By Name");
int choice=in.nextInt();
if(choice==1){
p=new BasedOndesg();
}
else if(choice==2){
    p=new BasedOnName();
}
Set<Person> sp=new TreeSet<Person>(p);
    sp.add(new Person(1, "Chanakya", 32429, "Dev"));
   sp.add(new Person(5, "Ravi", 23000004, "Hr"));
   sp.add(new Person(7, "Muhammad", 23479234, "SE"));
   sp.add(new Person(9, "Charan", 22132334, "TL"));
for (Person person : sp) {
    System.out.println(person);
}
  }
}

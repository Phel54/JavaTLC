public class Person {
    private String name;
    private  int age;


    public Person (String n, int a){
        name=n;
        age=a;
    numPeople++;
    }
    public Person (String a){
        name=a;
    }

  public int getAge(){return age;}

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }
    private static int numPeople;
    public static  int getCount(){
        return numPeople;
    }
    public String toString(){
        return (name + ": " + age);
    }

    public static void main(String[] args) {
       Person bruce = new Person( "bruce",34);
       Person brian ;
       brian = new Person("brian", 34);
       Person Phelim = new Person("Phelim");

       brian.setAge(54);
       brian.getAge();


        System.out.println(Phelim.name);
        System.out.println(brian.age);

        Person Yao = new Person("Yao",21);
//        Person klah = new Person(Yao);

    if (Person.getCount() == 3){
        System.out.println(true);
        System.out.println(Person.getCount());
    }else{
        System.out.println(false);
    }
        System.out.println(brian.toString());

    }


}

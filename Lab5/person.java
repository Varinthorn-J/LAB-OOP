public class person {

    private String name;
    private int age;

    public person(String n, int a) {
        this.name = n;
        this.age = a;
    }

     public void printDetails() {
     System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    }
    // public String toString(){
    //     return "person: "+ name +", " + name + ", " +
    // }

    // public int age_group(){
    //     return age;
    // }

}

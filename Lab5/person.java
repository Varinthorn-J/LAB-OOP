public class person {

    String name;
    int age;

    public person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

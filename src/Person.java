public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from " + this.getName());
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Person person1 = new Person ("Marcy");

        person1.setName("Marcella");

        person1.sayHello();

    }

}

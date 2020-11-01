package JavaSE.Encapsulation;

public class Demo2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "leon";
        //person.age 不可用， 因为private
        person.setAge(-20);
    }
}

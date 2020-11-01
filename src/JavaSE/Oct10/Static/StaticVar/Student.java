package JavaSE.Oct10.Static.StaticVar;

public class Student {
    private int age;
    private String name;
    static String room; //所在教室
    private int id = 0;
    private static int idCounter = 0;

    //在此 return idCounter 也可以，但setId 也就变成this.idCounter = idCounter, 改变后无法正常自加。
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
        this.id = ++idCounter;
    }

    public Student() {
        this.id = ++idCounter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

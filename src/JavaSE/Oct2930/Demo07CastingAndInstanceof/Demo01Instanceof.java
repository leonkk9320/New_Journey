package JavaSE.Oct2930.Demo07CastingAndInstanceof;
/*
对象 instanceof 类名称
得到布尔值结果 对象能不能当作后面这个类的实例
 */
public class Demo01Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        System.out.println("=======");
        giveMePet(new Cat());
    }

    public static void giveMePet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}

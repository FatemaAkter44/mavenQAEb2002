package IntergaceDemo;

public class Dog implements Animal{
    public void eat(){
        System.out.println("dog eat food");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep");
    }
}

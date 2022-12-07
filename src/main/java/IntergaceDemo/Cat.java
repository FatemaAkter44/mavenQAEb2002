package IntergaceDemo;

public class Cat implements Animal{
    public void eat(){
        System.out.println("cat drink milk");

    }

    @Override
    public void sleep() {
        System.out.println("cat sleep in bed");
    }

}

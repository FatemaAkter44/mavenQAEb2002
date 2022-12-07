package QuizFive;

public class Dog extends Animal{
    public void canRun(){
        System.out.println("Dog can run");
    }

    @Override
    public void makeSound() {
        System.out.println("dog can make sound");
    }

    @Override
    public void canEat() {
        System.out.println("Dog can eat");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.canEat();
        dog.aboutMe();
        dog.canRun();
        dog.makeSound();

    }
}

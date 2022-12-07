package QuizFive;

public class Cat extends Animal {
    public void favouriteToy(){
        System.out.println("Cat likes to play with shoes");
    }

    @Override
    public void makeSound() {
        System.out.println("Mew Mew");
    }

    @Override
    public void canEat() {
        System.out.println(" Cat can eat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.canEat();
        cat.aboutMe();
        cat.favouriteToy();
        cat.makeSound();
    }
}

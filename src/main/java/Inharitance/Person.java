package Inharitance;

public class Person {
    String name;
    int age;
    private String nameTwo;
    private int ageTwo;

    public String getNameTwo() {
        return nameTwo;
    }

    public void setNameTwo(String nameTwo) {
        this.nameTwo = nameTwo;
    }

    public int getAgeTwo() {
        return ageTwo;
    }

    public void setAgeTwo(int ageTwo) {
        this.ageTwo = ageTwo;
    }

    public void displayInformation1(){
        System.out.println("name "+name);
        System.out.println("age " + age);
    }
}

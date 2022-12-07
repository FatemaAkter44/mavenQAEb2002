package Inharitance;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name ="jahidul";
        teacher.age = 35;
        teacher.qualification = "Programing Teacher";
       // teacher.displayInformation1();
        teacher.displayInformation2();

        teacher.setQualificationTwo("Teacher");
        teacher.setNameTwo("Nurul");
        teacher.setAgeTwo(30);
        System.out.println(teacher.getNameTwo());
        System.out.println(teacher.getAgeTwo());
        System.out.println(teacher.getQualificationTwo());
    }
}

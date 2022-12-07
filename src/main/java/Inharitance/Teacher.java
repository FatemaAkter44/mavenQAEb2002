package Inharitance;

public class Teacher extends Person{
     String qualification;
     private String qualificationTwo;

     public String getQualificationTwo(){
         return qualificationTwo;

     }
     public void setQualificationTwo(String qualificationTwo){
         this.qualificationTwo = qualificationTwo;
     }




    public void displayInformation2(){
        displayInformation1();

        System.out.println("qualification " + qualification);
    }
}

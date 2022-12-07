package QuizFour;

import java.util.Scanner;

/*
* Create a class IzaanSchool with following private instance variables:

fullName
 email
phoneNumber
course
role
fee
And following methods:

*/
public class IzaanSchool {
    private String fullname;
    private String email;
    private long phoneNumber;
    private String course;
    private String role;
    private int fee;

    /*
    * setfullName(String fullName)
    setEmail(String email)
    setPhoneNumber(long phoneNumber)
    * */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*
     * setCourse(String course) : Course name can be only QA, DevOps, or Data Analyst.
     * It will show message "Invalid course" if entered any other name. */
    public void setCourse(String course) {
        if ((course == "QA") || (course == "DevOps") || (course == "Data Analyst")) {
            System.out.println("Wellcome to onbord.");
            this.course = course;
        } else {
            System.out.println("invalid course");
        }
    }

    /*
     * setRole(String role): Role can be only teacher or student.
     * It will show message "Invalid role" if entered any other role. */
    public void setRole(String role) {
        if ((role == "teacher") || (role == "student")) {
            this.role = role;
        } else {
            System.out.println("invalid user.");
        }
    }

    /*
     * setFee(int fee): This method will as user to choose among plans
     * like plan1, plan2 or plan3.
     * If user choose plan1 set fee to $7200,
     * if user choose plan2 set fee to $7600
     * and set fee to $8000 if user choose plan3. */

    public void setFee(int fee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hints: plan1 $7200, plan2 7600, plan3 8000 '\n' Please enter your plan:");
        //String plan = input.next();
    }

/*
* getfullName()
getEmail()
getPhoneNumber()
getCourse()
getRole()
getfee() */
    public String getFullname(){
        return fullname;
    }
    public String getEmail(){
        return email;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public String getCourse(){
        return course;
    }
    public String getRole(){
        return role;
    }

    public static void main(String[] args) {
        IzaanSchool izaanSchool =new IzaanSchool();

        izaanSchool.setFullname("Fatema Akter");
        izaanSchool.setEmail("fatemaroman@hotmail.com");
        izaanSchool.setPhoneNumber(6313567691l);
        //izaanSchool.setCourse("data science");
        izaanSchool.setCourse("QA");

        System.out.println(izaanSchool.getFullname());
        System.out.println(izaanSchool.getEmail());
        System.out.println(izaanSchool.getPhoneNumber());
        System.out.println(izaanSchool.getCourse());
    }
}

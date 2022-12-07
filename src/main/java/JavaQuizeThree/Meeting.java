package JavaQuizeThree;

public class Meeting {
    /**
     * Design a class called Meeting to represent meetings in a diary. The Meeting class has the following fields:
     * time of the meeting represented as string in hours and minutes,
     * location of the meeting (such as “room 205”),
     * subject to represent the meeting’s subject (such as “Examiner’s meeting”).
     Time, location and subject are stored as strings.
     * The class should include a constructor and the following methods:
     * setTime: to set the time,
     * setLocation: to set the location,
     * setSubject: to set the subject,
     * getSubject: to return the subject of the meeting,
     * printDetails: to print all information of a meeting in the following form:
     "Meeting in room 205 at 12:30; Subject: Examiner’s meeting."*/
    String time, location, subject;
    public Meeting(){

    }
    public void setTime(String time){
        this.time=time;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        subject ="Examiner’s meeting";
        return subject;
    }
    public void printDetails(){
        System.out.println("Meeting in " + location + " at " + time + " Subject: " + subject  );
    }

    public static void main(String[] args) {
        Meeting meeting = new Meeting();
        meeting.setTime("10: 00 am");
        meeting.setLocation("room 205");
        //meeting.setSubject("Examiner’s meeting");
        meeting.getSubject();
        meeting.printDetails();

    }
}

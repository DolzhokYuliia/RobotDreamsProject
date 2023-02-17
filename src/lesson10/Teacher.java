package lesson10;

public class Teacher {
    String name;
    String surname;
    int numberOfOffice;
    String subject;
    String scheduleTime;
    void teach (){
        System.out.println("teach");
    }
    void assessment (){
        System.out.println("assessment");
    }
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberOfOffice=" + numberOfOffice +
                ", subject='" + subject + '\'' +
                ", scheduleTime='" + scheduleTime + '\'' +
                '}';
    }
}

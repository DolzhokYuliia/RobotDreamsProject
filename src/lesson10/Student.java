package lesson10;

public class Student {
    String name;
    String surname;
    String dateOfBirth;
    int numberOfEducationYear;
    int numberOfGroup;
    int gradePointAverage;

       void learn (){
           System.out.println("learn");
       }
       void visitLessons (){
           System.out.println ("visit lessons");
       }
       public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", numberOfEducationYear=" + numberOfEducationYear +
                ", numberOfGroup=" + numberOfGroup +
                ", gradePointAverage=" + gradePointAverage +
                '}';
    }
}

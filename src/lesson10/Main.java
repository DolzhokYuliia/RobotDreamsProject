package lesson10;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Michael";
        student1.surname = "Jackson";
        student1.dateOfBirth = "28 february 1958";
        student1.numberOfEducationYear = 3;
        student1.numberOfGroup = 257;
        student1.gradePointAverage = 79;

        System.out.println(student1);

        student1.learn();
        student1.visitLessons();

        Teacher teacher1 = new Teacher();
        teacher1.name = "Banhu";
        teacher1.surname = "Mumbahu";
        teacher1.numberOfOffice = 34;
        teacher1.subject = "Math";
        teacher1.scheduleTime = "9-14:00 every day, excluding Saturday,Sunday";

        System.out.println(teacher1);
        teacher1.teach();
        teacher1.assessment();

        Array myArray = new Array();
        myArray.length = 20;
        myArray.bound = 234;
        myArray.printArray();



        System.out.println();
        myArray.printArray (array);
    }
}

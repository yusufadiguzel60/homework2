public class Main {

    public static void main(String[] args) {

        //Lesson

        LessonManager lesson1 = new LessonManager(53646, " Java & React ", 1);
        LessonManager lesson2 = new LessonManager(67513, " C# & Angular ", 2);
        LessonManager lesson3 = new LessonManager(85646, " Programlamaya Giriş ", 3);

        LessonManager[] lessonManagers = {lesson1, lesson2, lesson3};

        System.out.println("Ders Özellikleri");

        for (LessonManager lesson : lessonManagers) {
            System.out.println("Ders Id: " + lesson.lessonId + " Ders Adı: " + lesson.lessonName + " Ders Numarası: " + lesson.lessonNumber);
        }

        System.out.println("-----------------------------------------------");

        //Student-
        StudentManager student1 = new StudentManager(1960, "Yusuf", "example@gmail.com");
        StudentManager student2 = new StudentManager(6354, "Ali", "example1@gmail.com");
        StudentManager student3 = new StudentManager(6525, "Ayşe", "example2@gmail.com");
        StudentManager student4 = new StudentManager(9782, "Ertuğrul", "example3@gmail.com");
        StudentManager student5 = new StudentManager(6354, "Mehmet", "example4@gmail.com");

        StudentManager[] studentManagers = {student1,student2,student3,student4,student5};

        System.out.println("Öğrenci Özellikleri");

        for (StudentManager student : studentManagers){
            System.out.println("Öğrenci Id: " + student.studentId + " Öğrenci Adı: " + student.studentName + " Öğrenci Maili: " + student.studentMail);
        }

        //Student Added

        System.out.println("-----------------------------------------------");
        System.out.println("Öğrenci işlemleri");

        StudentRegister studentRegister = new StudentRegister();
        studentRegister.Add(student1);
        studentRegister.Add(student2);
        studentRegister.Add(student3);
        studentRegister.Remove(student4);
        studentRegister.Remove(student5);

    }
}

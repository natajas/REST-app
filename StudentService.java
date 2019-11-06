package pl.example.spring.zad03;
import io.vavr.collection.List;

public class StudentService {
    private List<Student> students = List.empty();

    List<Student> getStudents() {
        return this.students;
        //return List.empty();
    }

    Student addStudent(final NewStudent newStudent) {
        Student created = new Student(students.size() +1, newStudent.name, newStudent.number, newStudent.group);
        students = students.prepend(created);
        return created;
    }
  //  private StudentService service=new StudentService();
}

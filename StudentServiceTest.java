package pl.example.spring.zad03;
import io.vavr.collection.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentServiceTest<students> {
    @Test
    public void getEmptyList() {
    final StudentService service = new StudentService();
    List<Student> students = service.getStudents();

    assertTru(students.isEmpty());
}

    private void assertTru(boolean empty) {
    }

    @Test
    public void addStudent() {
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent("Student1", "number", "group"));
        assertNotNull(created);
}
@Test
    public void addStudentIsReturned(){
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent("Student1", "number", "group"));
        final List<Student> all = service.getStudents();
        assertEquals("Student1", all.get(0).name);
        //assertEquals("Student1", all.head().name);

}
@Test
    public void addStudentHasNewId(){
        final StudentService service = new StudentService();
        final Student created1 = service.addStudent(new NewStudent("Student1", "number", "group"));
        final Student created2 = service.addStudent(new NewStudent("Student2", "number", "group"));
        assertNotEquals(created1.id, created2.id);
        assertEquals(2, service.getStudents().size());

}
}
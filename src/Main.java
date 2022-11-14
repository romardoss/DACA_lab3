import java.io.File;

public class Main {
    public static void main(String[] args) {

        SinglyList<Student> school = new SinglyList<>();
        FileReadWrite.readFile(new File("src/Students.csv"), school);
        for (int i = 0; i < school.length(); i++) {
            Student temp = school.search(i);
            temp.info();
        }

        FileReadWrite.writeToFile(new File("src/output.csv"), school);
    }
}

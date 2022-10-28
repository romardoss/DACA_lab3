import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadWrite {
    public static void readFile(File f, SinglyList<Student> s){
        try {
            Scanner scan = new Scanner(f);
            scan.useDelimiter(",|;|\r\n");
            while(scan.hasNextLine()){
                String name = scan.next();
                String lastName = scan.next();
                String patronymic = scan.next();
                int classroom = scan.nextInt();
                String phone = scan.next();
                Student student = new Student(name, lastName, patronymic, classroom, phone);
                s.add(student);
                char[] subject = {'m', 'p', 'f', 'l'};
                for (int i = 0; i < 4; i++) {
                    int mark = scan.nextInt();
                    while(mark != -1){
                        student.addMark(subject[i], mark);
                        mark = scan.nextInt();
                    }
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}

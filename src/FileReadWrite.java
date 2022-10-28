import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
            scan.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    public static void writeToFile(File f, SinglyList<Student> s){
        try{
            FileWriter writer = new FileWriter(f);
            for (int i = 0; i < s.length(); i++) {
                Student temp = s.search(i);
                writer.write(temp.name + ";");
                writer.write(temp.lastName + ";");
                writer.write(temp.patronymic + ";");
                writer.write(temp.classroom + ";");
                writer.write(temp.phone + "\n");
                for (int j = 0; j < 4; j++) {
                    int end = s.search(i).getMarks(j).length();
                    SinglyList<Integer> marks = temp.getMarks(j);
                    for (int k = 0; k < end-1; k++) {
                        writer.write(marks.search(k) + ",");
                    }
                    writer.write(marks.search(end-1) + ";");
                    writer.write("-1\n");
                }
            }
            writer.close();
        }
        catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

    }

}

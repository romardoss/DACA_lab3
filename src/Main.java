import java.io.File;

public class Main {
    public static void main(String[] args) {
//        SinglyList<Integer> test = new SinglyList<>();
//        test.add(34);
//        for (int i = 0; i < 10; i++) {
//            test.add( (int) (Math.random() * 100) );
//        }
//        test.print();

//        Student ivan = new Student("Ivan", "Pupkin",
//                "Oleksandrovich", 9, "+380963451234");
//        ivan.addMark('m', 12);
//        ivan.addMark('m', 4);
//        ivan.addMark('m', 6);
//        ivan.deleteMark('m', 1);
//        ivan.addMark('l', 6);
//        ivan.deleteMark('l', 0);
//        ivan.info();

        SinglyList<Student> school = new SinglyList<>();
        FileReadWrite.readFile(new File("src/Students.csv"), school);
        for (int i = 0; i < 2; i++) {
            Student temp = school.search(i);
            temp.info();
        }
    }
}

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

        SinglyList<Integer> test = new SinglyList<>();
        test.add(14);
        test.add(5);
        test.add(3);
        System.out.print("Створений список: ");
        test.print();
        System.out.println("Результат пошуку: " + test.search(1));
        test.edit(1, 99);
        System.out.print("Результат редагування елементу: ");
        test.print();
        System.out.print("Результат видалення елементу: ");
        test.delete(2);
        test.print();
    }
}

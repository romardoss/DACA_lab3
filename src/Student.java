public class Student {
    private final String name;
    private final String lastName;
    private final String patronymic;
    private final int classroom;
    private final String phone;
    private final SinglyList<Subject> subjects;

    public Student(String name, String lastName, String patronymic,
                   int classroom, String phone){
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.classroom = classroom;
        this.phone = phone;
        subjects = new SinglyList<>();
        fillSubjects(subjects);
    }

    private class Subject{
        private final String name;
        private SinglyList<Integer> marks;

        public Subject(String name){
            this.name = name;
            marks = new SinglyList<>();
        }

        public void add(int mark){
            marks.add(mark);
        }

        public void delete(int index){
            marks.delete(index);
        }
    }

    private void fillSubjects(SinglyList<Subject> l){
        l.add(new Subject("Math"));
        l.add(new Subject("Physics"));
        l.add(new Subject("Foreign language"));
        l.add(new Subject("Literature"));
    }

    public void addMark(char name, int mark){
        // m - math
        // p - physics
        // f - foreign languages
        // l - literature
        Subject forMark = null;
        switch (name) {
            case 'm' -> forMark = subjects.search(0);
            case 'p' -> forMark = subjects.search(1);
            case 'f' -> forMark = subjects.search(2);
            case 'l' -> forMark = subjects.search(3);
        }
        if(forMark != null){
            forMark.add(mark);
        }
        else{
            System.out.println("Wrong subject code");
        }
    }

    public void deleteMark(char name, int index){
        // m - math
        // p - physics
        // f - foreign languages
        // l - literature
        Subject forMark = null;
        switch (name) {
            case 'm' -> forMark = subjects.search(0);
            case 'p' -> forMark = subjects.search(1);
            case 'f' -> forMark = subjects.search(2);
            case 'l' -> forMark = subjects.search(3);
        }
        if(forMark != null){
            forMark.delete(index);
        }
        else{
            System.out.println("Wrong subject code");
        }
    }

    public void info(){
        System.out.println("Information about the student:");
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Patronymic: " + patronymic);
        System.out.println("Classroom: " + classroom);
        System.out.println("Phone number: " + phone);
        System.out.println("Marks: ");
        for (int i = 0; i < 4; i++) {
            Subject temp = subjects.search(i);
            System.out.print(temp.name + ": ");
            temp.marks.print();
        }
    }

}

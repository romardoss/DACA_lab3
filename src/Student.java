public class Student {
    private String name;
    private String lastName;
    private String patronymic;
    private int classroom;
    private String phone;
    private SinglyList<Subject> subjects;

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
        private String name;
        private SinglyList<Integer> marks;

        public Subject(String name){
            this.name = name;
            marks = new SinglyList<>();
        }

        public void add(int mark){
            marks.add(mark);
        }
    }

    private void fillSubjects(SinglyList<Subject> l){
        l.add(new Subject("Math"));
        l.add(new Subject("Physics"));
        l.add(new Subject("Foreign language"));
        l.add(new Subject("Literature"));
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
            //System.out.println(subjects);
        }
    }

}

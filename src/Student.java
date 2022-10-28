public class Student {
    private String name;
    private String lastName;
    private String patronymic;
    private int classroom;
    private long phone;

    public Student(String name, String lastName, String patronymic,
                   int classroom, long phone){
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.classroom = classroom;
        this.phone = phone;
    }

    private class Subject{
        private String name;
        private SinglyList<Integer> marks;

        public Subject(String name){
            this.name = name;
        }

        public void add(int mark){
            marks.add(mark);
        }
    }
}

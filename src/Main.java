public class Main {
    public static void main(String[] args) {
        SinglyList<Integer> test = new SinglyList<>();
        test.add(34);
        for (int i = 0; i < 10; i++) {
            test.add( (int) (Math.random() * 100) );
        }
        test.print();
    }
}

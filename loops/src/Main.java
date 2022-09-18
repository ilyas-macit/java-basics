public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("for loop is over");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while loop is over");
    }
}
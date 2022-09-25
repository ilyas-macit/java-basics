public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        int result = math.sum();
        System.out.println(result);
        result = math.sum(1, 2);
        System.out.println(result);
    }

}
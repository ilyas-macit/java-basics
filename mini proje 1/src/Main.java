public class Main {
    public static void main(String[] args) {
        int number;
        number = 12;
        String result = number + " is prime number";
        for (int i = 2; i<number ; i++){
            if (number % i == 0){
                result = number + " isn't prime number";
                break;
            }
        }
        System.out.println(result);
    }
}
public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.3 , 2.3, 4.5, 5.5, 6.8};
        double max = numbers[0];
        double total = 0.0;
        for (double number : numbers){
            System.out.println(number);
            if (max < number) max = number;
            total += number;
        }

        System.out.println("max number: " + max);
        System.out.println("result :" + total);

    }
}
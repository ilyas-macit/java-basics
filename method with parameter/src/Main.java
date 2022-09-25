public class Main {
    public static void main(String[] args) {
        add("ilyas");
        int result = sum(1 ,2 );
        System.out.println(result);
        result = sum(1 ,2 ,3 ,4 ,5);
        System.out.println(result);
    }

    public static void add(String customerName) {
        System.out.println(customerName + " added");
    }

    public static void update(String customerName) {
        System.out.println(customerName + " updated");
    }

    public static void delete(String customerName) {
        System.out.println(customerName + " deleted");
    }
    public static int sum(int number1 , int number2){
        return number1 + number2;
    }
    public static int sum(int... numbers){
        int total = 0 ;
        for (Integer number :  numbers){
            total += number;
        }
        return total;
    }
}
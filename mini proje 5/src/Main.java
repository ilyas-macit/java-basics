public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 5, 6, 8, 9};
        int searchedNumber = 5;
        Boolean  isContained= false;

        for (Integer number  : numbers){
            if (searchedNumber == number){
                isContained = true;
                break;
            }
        }

        if (isContained) {
            System.out.println("the number is available");
        }else {
            System.out.println("the number isn't available");
        }
    }

}
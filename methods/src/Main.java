public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int searchingNumber = 4;
        Boolean isThere = false;
        for (Integer number : numbers) {
            if (searchingNumber == number) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            logMessage("number is Available");
        } else {
            logMessage("number isn't Available");
        }
    }

    public static void logMessage(String message) {
        System.out.println(message);
    }

}
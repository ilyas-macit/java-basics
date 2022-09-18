public class Main {
    public static void main(String[] args) {
        //if - elseif - else
        int age = 19;
        if (age < 18) {
            System.out.println(age + " less than 18");
        } else if (age == 18) {
            System.out.println(age + " equal to 18");
        } else {
            System.out.println(age + " greater than 18");
        }
        //switch case
        int dayNumber = 2;
        String day = "";
        switch (dayNumber) {
            case 1:
                day = "monday";
                break;
            case 2:
                day = "tuesday";
                break;
            case 3:
                day = "wednesday";
                break;
            case 4:
                day = "thursday";
                break;
            case 5:
                day = "friday";
                break;
            case 6:
                day = "saturday";
                break;
            case 7:
                day = "sunday";
                break;
            default:
                break;
        }

        System.out.println("to day is " + day);
    }
}
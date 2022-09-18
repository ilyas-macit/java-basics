public class Main {
    public static void main(String[] args) {
//integer -> int , long , short , byte
        //byte
        byte minByte = 127;
        byte maxByte = -128;
        //int
        int maxInt = 2147483647;
        int minInt = -2147483648;
        //short
        short minShort = -32768;
        short maxShort = 32767;
//text -> String , char
        //String
        String name = "ilyas";
        //char
        char character = 'A';
//boolean
        boolean isMale = false;
        boolean isFemale = true;
//array - list
        //array
        String[] students = {"ilyas", "ahmet", "merve"};
        System.out.println(students[1]);

        for(String student : students){
            System.out.println(student);
        }

    }
}
public class Main {
    public static void main(String[] args) {

        String message = "the weather is too nice today";
        /*System.out.println(message);
        System.out.println("message length is : " + message.length());
        System.out.println(message.charAt(4));
        System.out.println(message.concat(" so happy for that"));
        System.out.println(message.startsWith("A"));
        System.out.println(message.endsWith("y"));
        System.out.println(message.indexOf('a'));*/
        System.out.println(message.replace(' ' , '-'));
        System.out.println(message.substring(0 , 6));
        for(String word : message.split(" ")){
            System.out.println(word);
        }
        System.out.println(message.toUpperCase());



    }
}
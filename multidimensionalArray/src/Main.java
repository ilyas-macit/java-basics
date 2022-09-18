public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "istanbul";
        cities[0][1] = "bursa";
        cities[0][2] = "kocaeli";
        cities[1][0] = "antalya";
        cities[1][1] = "adana";
        cities[1][2] = "mersin";
        cities[2][0] = "mardin";
        cities[2][1] = "diyarbakir";
        cities[2][2] = "van";
        for(String[] cityRow : cities){
            System.out.println("-----------");
            for(String city : cityRow){
                System.out.println("current city: " + city);
            }
        }
    }
}
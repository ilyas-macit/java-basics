public class Main {
    public static void main(String[] args) {
        String kalinSesliHarfler = "aıou";
        String inceSesliHarfler = "eiöü";
        String harf = "b";
        int indexKalin =  kalinSesliHarfler.indexOf(harf.toLowerCase());
        int indexInce = inceSesliHarfler.indexOf(harf.toLowerCase());
        System.out.println(indexKalin);
        if (indexKalin >= 0){
            System.out.println("kalin sesli harf");
        }
        else if (indexInce >= 0){
            System.out.println("ince sesli harf");
        }
        else{
            System.out.println("sesli harf degil");
        }
    }
}
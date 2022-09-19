public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,4,5,7,9,0};
        int aranacak = 1;
        for (int sayi: sayilar){
            if (sayi == aranacak){
                System.out.println("Sayı listede mevcuttur");
                break;
            }
        }
        System.out.println("Sayı listede mevcut değildir.");
    }
}
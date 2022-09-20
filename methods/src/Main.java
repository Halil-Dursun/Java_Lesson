public class Main {
    public static void main(String[] args) {
        sayiBul();
    }

    public static void sayiBul(){
        int[] sayilar = new int[]{1,2,4,5,7,9,0};
        int aranacak = 1;
        for (int sayi: sayilar){
            if (sayi == aranacak){
                sendMessage("Sayı listede mevcuttur");
                return;
            }
        }
        sendMessage("Sayı listede mevcut değildir.");
    }

    public static void sendMessage(String message){
        System.out.println(message);
    }
}
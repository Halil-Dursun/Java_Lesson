public class Main {
    public static void main(String[] args) {
        int number = 4;
        int asalSayac = 0;

        if(number<1){
            System.out.println("Geçersiz sayı girildi");
            return;
        }

        for (int i = 1 ; i<=number ; i++){
            if(number % i == 0){
                asalSayac++;
            }
        }
        if(asalSayac > 2){
            System.out.println("Sayı asal değildir.");
        }else{
            System.out.println("Sayı asaldır");
        }
    }
}
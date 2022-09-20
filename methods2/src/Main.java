public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0,2);
        String sehir = sehirVer();
        System.out.println(yeniMesaj);
        int toplam = topla(5,7);
        System.out.println(toplam);
        int toplam2 = topla2(3,5,6,7);
        System.out.println(toplam2);
    }

    public static void add(){
        System.out.println("eklendi");
    }
    public static void delete(){
        System.out.println("silindi");

    }
    public static void update(){
        System.out.println("güncellendi");

    }

    public static int topla(int sayi1,int sayi2){
        return sayi1 + sayi2;
    }
    public static  String sehirVer(){
        return  "Ankara";
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi : sayilar){
            toplam = toplam+sayi;
        }
        return toplam;
    }
}
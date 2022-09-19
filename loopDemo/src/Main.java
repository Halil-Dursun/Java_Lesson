public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 0; i<=10;i++){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");
        //While
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti");

        //Do-While
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }while (j<10);
        System.out.println("Do-While döngüsü bitti");
    }
}
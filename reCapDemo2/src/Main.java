public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2,1.3,3.6,4.5};
        double total = 0;
        double max = myList[0];
        for(double number:myList){
            System.out.println(number);
            total = total + number;
            if(max < number){
                max = number;
            }
        }
        System.out.println("Toplam : " + total);
        System.out.println("En büyük sayı : " + max);
    }
}
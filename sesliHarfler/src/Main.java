public class Main {
    public static void main(String[] args) {
        char harf = 'U';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf + " Kalın sesli bir harf.");
                break;
            case 'E':
            case 'İ':
            case 'Ü':
            case 'Ö':
                System.out.println(harf + " E ince sesli bir harftir.");
                break;
            default:
                System.out.println("Geçersiz harf girildi.");
        }
    }
}
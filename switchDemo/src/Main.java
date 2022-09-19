public class Main {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Başarılı");
                break;
            case 'B':
                System.out.println("İyi");
                break;
            case 'C':
                System.out.println("Orta");
                break;
            case 'D':
                System.out.println("Koşullu");
                break;
            case 'F':
                System.out.println("Berbat");
                break;
            default:
                System.out.println("Hatalı değer");
        }
    }
}
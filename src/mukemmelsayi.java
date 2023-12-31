import java.util.Scanner;

public class mukemmelsayi {
    public static void main(String[] args) {
        System.out.println("Mükemmel Sayı bulma uygulaması"); // title
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: "); //istenilen ve
        int sayi = input.nextInt(); // veri değişken

        int toplam = 0;
        for (int i = 1; i <= sayi/2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + "Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + "Mükemmel sayi değildir. ");
        }
    }
}

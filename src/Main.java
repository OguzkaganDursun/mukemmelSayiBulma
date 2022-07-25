import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
        toplamı kendisine eşit olan sayıya mükemmel sayı denir.
         */

        //Degiskenler tanimlandi.
        int toplam = 0, sayi;

        //Kullanicidan degerler alinarak, mukemmel sayi olup olmadigi sorgulandi ve ekrana yazdirildi.
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz : ");
        sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++)
        {
            if (sayi % i == 0)
            {
                toplam += i;
            }
        }
        if (sayi == toplam)
        {
            System.out.println(sayi + " Sayisi Mukemmel Sayidir.");
        }
        else
        {
            System.out.println(sayi + " Sayisi Mukemmel Sayi Degildir.");
        }

    }
}

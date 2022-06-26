import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k,toplam,ortalama = 0,sayac=0;
        System.out.print("Sayi giriniz : ");
        k = scan.nextInt();
        toplam =0;

        for(int i = 0;i<k;i++)
        {
            if(i%3==0 && i%4==0)
            {
                sayac++;
                toplam +=i;
            }
        }
         ortalama = toplam/(sayac-1);
        System.out.println(toplam);
        System.out.println(ortalama);


    }
}

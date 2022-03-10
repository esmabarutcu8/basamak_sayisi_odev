package hesap;
import java.util.Scanner;
public class BasamakSayisi {
    public static void main(String[]args){
        int sayi;
        int toplam=0;

        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        sayi=input.nextInt();
        while(sayi!=0){
            toplam=(sayi%10)+toplam;
            sayi=sayi/10;

        }
        System.out.println("basamak sayılarının toplamı:"+toplam);



    }
}

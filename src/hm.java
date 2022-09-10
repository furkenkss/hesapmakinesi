import java.util.Scanner;

public class hm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayi1,sayi2,secim,sonuc;


        System.out.println("1.sayıyı gir:");
        sayi1=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n1-4 arası seçim yapın:");
        secim=input.nextInt();
        System.out.println("2.sayıyı gir:");
        sayi2=input.nextInt();
        switch (secim)
        {
            case 1:
                sonuc=0;
                sonuc=sayi1+sayi2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc=0;
                sonuc=sayi1-sayi2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc=0;
                sonuc=sayi1*sayi2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc=0;
                if (sayi1>=sayi2){
                    sonuc=sayi1/sayi2;
                    System.out.println(sonuc);
                }
                else {
                    sonuc=sayi2/sayi1;
                    System.out.println(sonuc);
                }
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
        }



    }

}

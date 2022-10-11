import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();
        System.out.println("Doğum gününüzü giriniz: ");
        day = input.nextInt();

        switch (month){
            case 1:
               if (day>=1 && day<=31){
                   if (day<22)
                       System.out.println("Oğlak burcu");
                   else
                       System.out.println("Kova burcu");
               }
               else
                   System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            case 2:
                if (day>=1 && day<=28){
                    if (day<20)
                    System.out.println("Kova burcu");
                    else
                    System.out.println("Balık burcu");
                }
                else
                    System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            case 3:
                if (day>=1 && day<=31){
                   if (day<21)
                    System.out.println("Balık burcu");
                   else
                    System.out.println("Koç burcu");
                }
                else
                    System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            case 4:
                if (day>=1 && day<=30){
                    if (day<21)
                    System.out.println("Koç burcu");
                    else
                    System.out.println("Boğa burcu");
                }
                else
                    System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            case 5:
                if (day>=1 && day<=31){
                    if (day<22)
                    System.out.println("Boğa burcu");
                    else
                    System.out.println("İkizler burcu");
                }
                else
                    System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            case 6:
                if (day>=1 && day<=30){
                    if (day<23)
                    System.out.println("İkizler burcu");
                    else
                    System.out.println("Yengeç burcu");
                }
                else
                    System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            case 7:
                if (day>=1 && day<=31){
                    if (day<23)
                    System.out.println("Yengeç burcu");
                    else
                    System.out.println("Aslan burcu");
                }
                else
                    System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            case 8:
                if (day>=1 && day<=31){
                    if (day<24)
                    System.out.println("Aslan burcu");
                     else
                    System.out.println("Başak burcu");
                }
                else
                    System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            case 9:
                if (day>=1 && day<=30){
                    if (day<23)
                    System.out.println("Başak burcu");
                    else
                    System.out.println("Terazi burcu");
                }
                else
                    System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            case 10:
                if (day>=1 && day<=31){
                    if (day<23)
                    System.out.println("Terazi burcu");
                    else
                    System.out.println("Akrep burcu");
                }
                else
                    System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            case 11:
                if (day>=1 && day<=30){
                    if (day<22)
                    System.out.println("Akrep burcu");
                    else
                    System.out.println("Yay burcu");
                }
                else
                    System.out.println("Geçersiz gün tekrar deneyiniz");
                break;
            case 12:
                if (day>=1 && day<=31){
                    if (day<22)
                    System.out.println("Yay burcu");
                    else
                    System.out.println("Oğlak burcu");
                }
                else
                    System.out.println("Geçersiz gün girdiniz. tekrar deneyiniz");
                break;
            default:
                System.out.println("Geçersiz ay tekrar deneyiniz.");
        }
    }
}

package DepoProje;

import java.util.Scanner;

import static DepoProje.Method.*;

public class Depo_Giris_Paneli {

    static  Scanner input = new Scanner(System.in);

    public static void girisPaneli () {

        System.out.println("-".repeat(20)+"DEPO ANA SAYFASI"+"-".repeat(20));

        System.out.println("Lutfen yapmak istediginiz islemi seciniz : " + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   | 1-URUN TANIMLAMA  |            | 2-MİKTAR GUNCELLEME|  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 3-RAF GUNCELLEME  |            | 4-URUN CIKISI     |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-URUN LİSTELE    |            | 6-CIKIS           |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       ");

        String secim = input.next() ;
        boolean scm = true;

        do {
            switch (secim) {
                case "1":
                    urunTanimlama();
                    scm = false;
                    break;

                case "2":
                    miktarGuncelleme();
                    scm = false;
                    break;

                case "3":
                    rafGuncelleme();
                    scm = false;
                    break;
                case "4":
                    urunCikisi();
                    scm = false;
                    break;
                case "5":
                    urunListeleme();
                    scm = false;
                    break;
                case "6":
                   cikis();
                    scm = false;
                    break;
                default:
                    System.out.println("Yanlis bir secim yaptiniz .Tekrar bir giris yapiniz");
                    secim = input.next() ;
            }
        } while (scm);

        }


}

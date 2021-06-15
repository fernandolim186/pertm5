package app;

import java.util.Scanner;

import app.balok.Balok;
import app.kubus.Kubus;
import app.tabung.Tabung;

public class app {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int pilih;
        char yn;

        do{

            System.out.println("Menghitung volume dan luas Kubus,balok,dan tabung");
            System.out.println("=========================================================");

            System.out.println("Pilih 1 : Kubus");
            System.out.println("Pilih 2 : Balok");
            System.out.println("Pilih 3 : Tabung\n");

            System.out.print("Pilih no : ");
            pilih = masukan.nextInt();
            
            if (pilih == 1){
                Kubus kubus = new Kubus();
                System.out.println(kubus.toString());
                System.out.println("Luas kubus : " + kubus.LuasKubus() + "m^2");
                System.out.println("Volume kubus : " + kubus.VolumeKubus() + "m^3");
                System.out.println();
            }
            else if(pilih == 2){
                Balok balok = new Balok();
                System.out.println(balok.toString());
                System.out.println("Luas balok : " + balok.LuasBalok() + "m^2");
                System.out.println("Volume balok : " + balok.VolumeBalok() + "m^3");
                System.out.println();
            }
            else if(pilih == 3){
                Tabung tabung = new Tabung();
                System.out.println(tabung.toString());
                System.out.println("Luas tabung : " + tabung.LuasTabung() + "m^2");
                System.out.println("Volume tabung : " + tabung.VolumeTabung() + "m^3");
                System.out.println();
            }

            System.out.print("Ulangi perhitungan ? (y/n) : ");
            masukan.nextLine();
            String yesno = masukan.nextLine();
            yn = yesno.charAt(0);
        }while(yn=='y' || yn=='Y');

        masukan.close();
    }
}
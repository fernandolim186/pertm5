package app;
import java.util.Scanner;

public class tabung{
    public static class Tabung{
        int j,t;
        float pi = 3.14f;

        Scanner masukan = new Scanner(System.in);

        public Tabung(){

            System.out.println("Luas dan volume tabung");
            System.out.print("Jari-jari : ");
            j = masukan.nextInt();

            System.out.print("Tinggi : ");
            t = masukan.nextInt();

        }

        public void setj (int j){
            this.j = j;
        }

        public int getj (){
            return j;
        }

        public void sett (int t){
            this.t = t;
        }

        public int gett (){
            return t;
        }

        float LuasTabung(){
            System.out.println("");
            float LuasTabung = (float)pi*(j*j);
            return LuasTabung;
        }

        float VolumeTabung(){
            float VolumeTabung = (float)pi*(j*j)*t;
            return VolumeTabung;
        }

        @Override
        public String toString() {
            return "\nJari-jari : " + j +
                "\nTinggi : " + t ;
        }


    }
}
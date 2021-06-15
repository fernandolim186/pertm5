package app;
import java.util.Scanner;

public class balok{
    public static class Balok{
        int p,l,t;

        Scanner masukan = new Scanner(System.in);

        public Balok(){

            System.out.println("Luas dan volume balok");
            System.out.print("Panjang : ");
            p = masukan.nextInt();

            System.out.print("Lebar : ");
            l = masukan.nextInt();

            System.out.print("Tinggi : ");
            t = masukan.nextInt();
        }

        public void setp (int p){
            this.p = p;
        }

        public int getp (){
            return p;
        }

        public void setl (int l){
            this.l = l;
        }

        public int getl (){
            return l;
        }

        public void sett (int t){
            this.t = t;
        }

        public int gett (){
            return t;
        }

        int LuasBalok(){
            System.out.println("");
            int LuasBalok = (2*p*l)+(2*p*t)+(2*l*t);
            return LuasBalok;
        }

        int VolumeBalok(){
            int VolumeBalok = p*l*t;
            return VolumeBalok;
        }


        @Override
        public String toString() {
            return "\nPanjang : " + p +
                "\nLebar : " + l +
                "\nTinggi : " + t ;
        }

    }
}
package app;
import java.util.Scanner;

public class kubus{
    public static class Kubus{
        int s;

        Scanner masukan = new Scanner(System.in);

        public Kubus(){

            System.out.println("Luas dan volume kubus");
            System.out.print("Sisi : ");
            s = masukan.nextInt();
        }

        public void sets (int s){
            this.s = s;
        }

        public int gets (){
            return s;
        }

        int LuasKubus(){
            System.out.println("");
            int LuasKubus = 6*(s*s);
            return LuasKubus;
        }

        int VolumeKubus(){
            int VolumeKubus = s*s*s;
            return VolumeKubus;
        }

        @Override
        public String toString() {
            return "\nSisi : " + s;
        }

    }
}
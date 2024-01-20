//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(getTextTest());
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame tu primer numero: ");
        int x = scan.nextInt();
        System.out.println("Dame tu segundo numero: ");
        int y = scan.nextInt();

        System.out.println("la suma es: "+sumaNumeros(x,y));

    }

        public static String getTextTest () {
        return "extrac text " ;
        }
        public static int sumaNumeros (int x, int y ){

            int result = 0;

            result = x + y;

            return result;
        }
    }


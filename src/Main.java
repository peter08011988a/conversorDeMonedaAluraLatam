import java.io.Externalizable;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean valor= true;
        while (valor) {
            System.out.println("*****************************");
            System.out.println("Sea bienvenido/a al conversor de moneda =]");
            System.out.println("1) Dólar =>> Peso argentino\n"
                    + "2) Peso argentino =>> Dólar\n"
                    + "3) Dólar =>> Real brasileño \n"
                    + "4) Real brasileño =>> Dólar\n"
                    + "5) Dólar =>> Peso colombiano \n"
                    + "6) Peso colombiano =>> Dólar\n"
                    + "7) Salir");
            System.out.println("Elija una opción valida ");
            System.out.println("****************************** ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);

            switch (opcion) {
                case '1':
                    convertir(974.79, "Pesos argentinos");
                    break;
                case '2':
                    convertir(974.79, "Dolar");
                    break;
                case '3':
                    convertir(5.60, "Real brasileño");
                    break;
                case '4':
                    convertir(5.6, "Dolar");
                    break;
                case '5':
                    convertir(4236.65, "Pesos colombianos");
                    break;
                case '6':
                    convertir(4236.65, "Dolar");
                    break;
                case '7':
                    System.out.println("Cerrando programa");
                    valor= false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }

    static void convertir(double valordolar, String pais) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el valor que deseas convertir ");
        double cantidadMoneda = leer.nextDouble();
        if (pais == "Dolar") {
                        double dolares = cantidadMoneda / valordolar;
            dolares = (double) Math.round(dolares * 100d) / 100;
            System.out.println("El valor de $" + cantidadMoneda + " corresponde al valor final de =>> " + dolares + " " + pais);
        }
        else {
            double dolares = cantidadMoneda * valordolar;
            dolares = (double) Math.round(dolares * 100d) / 100;
            System.out.println("El valor de $" + cantidadMoneda + " USD corresponde al valor final de =>> " + dolares + " " + pais);
        }

    }
}
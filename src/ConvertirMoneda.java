import java.util.Scanner;

public class ConvertirMoneda {
    public  static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion de hoy es :"+monedaBase+" = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese la cantidad a convertir "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadConvertida+" "+monedas.target_code());
    }
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo ");
        String monedaObejtivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObejtivo, consulta, lectura);
    }
}

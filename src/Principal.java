import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 8){
            System.out.println("**************************\n"+
                    "Bienvenido al convertidor de monedas\n\n"+
                    "Ingresa el tipo de conversion que deseas realizar.\n"+
                    "1. Peso Mexicano a Dollar Americano\n"+
                    "2. Dollar Americano a Peso Mexicano\n"+
                    "3. Dollar Americano a Euro\n"+
                    "4. Euro a Dolar Americano\n"+
                    "5. Euro a Peso Mexicano\n"+
                    "6. Peso Mexicano a Euro\n"+
                    "7. Convertir otra moneda\n"+
                    "8. Salir\n");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("MXN", "USD", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("USD", "MXN", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "EUR", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("EUR", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("EUR", "MXN", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("MXN", "EUR", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo... Hasta luego!\n");
                    break;
                default:
                    System.out.println("Opcion no valida...\n");
                    break;
            }
        }
    }
}

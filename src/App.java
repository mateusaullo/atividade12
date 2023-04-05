import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double altura,resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque sua altura: ");
        altura = teclado.nextDouble();
        teclado.close();

        resultado = (72.7*altura) - 58;

        System.out.print("Seu peso ideal eh: "+resultado);
        
    }
}

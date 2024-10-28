
public class App {

    public static void main(String[] args) throws Exception {
        Recursividad1 rec = new Recursividad1();
        int resultado = rec.factorial(5);
        System.out.println(resultado);

        System.out.println("el resultado de la suma consecutiva es: " + rec.sumaConsecutivos(5));
        System.out.println("el resultado de la potencia es: " + rec.potencia(4, 2));
        System.out.println("el resultado de sumar digitos es: " + rec.sumarDigitos(456));
    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //exercicio 1
    public static void mostrarMensagem() {
        System.out.println("Bem-vindo(a) ao programa!");
    }
    //exercicio 2
    public static void mostrarDobro(int num1) {
        System.out.println(num1 * 2);
    }
    //exercicio 3
    public static int dividir (int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }
    //exercicio 4
//    public class boolean ehPar(int numero) {
//        return numero % 2 == 0;
//    }

    //exercicio 5
    public static double calcularMedia(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    //exercicio 6
    public static void linha() {
        for (int i = 0; i < 30; i++) {
            System.out.println("-");
        }
    }
    public static void main(String[] args) {
        mostrarMensagem();
        mostrarDobro(5);
        int resultado = dividir(4, 2);
        System.out.println(resultado);

        //Resposta do exercicio 4
//        int num = 8;
//        boolean resultado = ehPar(num);
//        System.out.println("o numero " + num + " E par? " + resultado);

        double media = calcularMedia(7.5, 8.0, 9.0);
        System.out.println("A media das notas e: " + media);

        linha();
        System.out.println("texto no meio das linhas");
        linha();
    }
}
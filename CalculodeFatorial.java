public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculo de Fatorial");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        If( numero< 0) {
            System.out.print("Digite um numero o numero inteiro positivo: ");
        } else
            Valor fatorial = 1;
            for ( int i = 1; i <= numero; i++ ){
                fatorial *= i ;
            }

            System.out.println (" O fatorial de " + numero + "é: " + fatorial )

        scanner.close();
    }
}

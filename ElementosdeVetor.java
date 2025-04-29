public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Elementos de Vetor");

        Scanner scanner = new Scanner (System.in);
        int vetor = new int [10]

        System.out.println("Digite 10 números:");
        for ( int i = 0; i < vetor.legth; i++) {
            System.our.print("Número" + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();

        }
        int soma = 0;
        for ( int i = 0; i < vetor.lengeth; i ++){
            soma += vetor[i];

        }

        System.out.println("O total dos vetores é: " + soma);

        scanner.close();
    }
}

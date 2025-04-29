public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Média de Notas");

        Scanner scanner = new Scanner("System.in");
        double somadeNotas = 0;
        int quantidadedeNotas = 0;
        String resposta;

        do{
            System.out.print("Digite a nota (0 a 10) :");
            double = scanner.nextDouble();

            while ( nota < 0; nota > 10 ){
                System.out.print("A nota inserida é inválida. Digite uma nota entre 0 e 10) :");
                nota = scanner.nextDouble();
            }

            somadeNotas += notas;
            quantidadedeNotas++;
            
            System.out.print("Deseja inserir outra nota? (s/n):");
            
        } If(quantidadedeNotas > 0){
            double media = somadeNotas / quantidadedeNotas;
            System.out.println("A média das notas é: " + media);
        }

        scanner.close();
    }
}

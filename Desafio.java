public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Desafio");
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            double P = solicitarValor("Digite o valor do investimento inicial (P): ", scanner);
            double r = solicitarValor("Digite a taxa de juros anual (r) em porcentagem: ", scanner);
            int t = (int) solicitarValor("Digite o período de investimento em anos (t): ", scanner);
            String tipoCapitalizacao = solicitarTipoCapitalizacao(scanner);

            double M = calcularMontante(P, r, t, tipoCapitalizacao);

            System.out.println("Resultado");
            System.out.printf("Investimento inicial (P): R$ %.2f%n", P);
            System.out.printf("Taxa de juros anual (r): %.2f%%%n", r);
            System.out.printf("Período (t): %d anos%n", t);
            System.out.printf("Tipo de capitalização:");
            System.out.printf("Montante ao final do período (M): R$ %.2f%n", M);

            System.out.print("Deseja realizar um novo cálculo? (s/n): ");
            String resposta = scanner.nextLine;
            if (!resposta.equals("s")) {
                continuar = false;
                System.out.println("Finalizado!");
            }
        }

        scanner.close();

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jogo de adivinhacao");

        Scanner scanner = new Scanner("System.in");

        int numero = random.nextInt(20) + 1; // numero entre 1 e 20
        int valor;
        int valor =0;

        System.out.pruntln("Tente adivinhar um numero entre 1 e 20.");
        
        do{
            System.out.pruntln("Digite um numero:");
            teste = scanner.nextInt ();
            teste++;

        if(teste > numeroSorteado){
            System.out.pruntln("O numero é maior que:" + teste +" .Tente de novo!");
            } elseif (teste > numeroSorteado) {
                System.out.pruntln("O numero é menor que:" + teste +" .Tente de novo!");
                } elseif (teste < numeroSorteado){
                    System.out.pruntln("Parabens! O numero esta correto!" + numeroSorteado + "em" + teste " + teste." );
                }
            } while ( teste != numero);
        
        scanner.close();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Soma de Números inteiros");

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite números: (negativo para encerrar):");
        while(numero >=0){
            System.out.println("Digite um número:");
            numero = scanner.nextInt();

            if(numero <0){
                System.out.println("Loop encerrado!")
                
            }
        
        total+= numero;
        }

        System.out.println("Números positivos: "+ total)

        scanner.close(); 
    }
}

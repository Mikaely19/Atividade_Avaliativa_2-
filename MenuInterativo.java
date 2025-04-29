public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Menu Interativo");
        Scanner scanner = new Scanner(System.in);

        Int opcao;

        do{
            System.out.println("1 = Adicionar");
            System.out.println("2 = Removedor");
            System.out.println("3 = Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();

            System.out.println(" Ação de adicionar foi realizada. ");
            break;
           
            System.out.println(" Ação de Removedor foi realizada. ");
            break;
        
            default: //Caso o usuário inseria uma opção inválida 
            System.out.println(" Ação de Sair finalizada. ");
            break;

            while(opcao != 3);

            scanner.close();
        }

    }
}

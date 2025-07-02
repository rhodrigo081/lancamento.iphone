package view;

import model.Iphone;

import java.util.Scanner;

public class NavegadorInternetView {
    public static void NavegadorInternetView() {

        Iphone iphone = new Iphone();
        Scanner input = new Scanner(System.in);

        System.out.println("Navegador de Internet");
        System.out.println("1 - Exibir Página");
        System.out.println("2 - Adicionar Aba");
        System.out.println("3 - Atualizar Página");
        System.out.println("4 - Voltar");
        System.out.print("Escolha: ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.print("Digite a URL da página: ");
                input.nextLine();
                String url = input.nextLine();
                iphone.exibirPagina(url);
                break;
            case 2:
                System.out.print("Digite a URL para adicionar uma nova aba: ");
                input.nextLine();
                String novaAba = input.nextLine();
                iphone.adicionarAba(novaAba);
                break;
            case 3:
                iphone.atualizarPagina();
                break;
            case 4:
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                NavegadorInternetView();
                break;
        }

    }
}

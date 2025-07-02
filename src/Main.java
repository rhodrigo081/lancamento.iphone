import view.AparelhoTelefonicoView;
import view.NavegadorInternetView;
import view.ReprodutorMusicalView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("O que você deseja utilizar?");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho Telefonico");
            System.out.println("3 - Navegador de Internet");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    ReprodutorMusicalView.ReprodutorMusical();
                    break;
                case 2:
                    AparelhoTelefonicoView.ReprodutorMusicalView();
                    break;
                case 3:
                    NavegadorInternetView.NavegadorInternetView();
                case 4:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    main(args);
                    break;
            }
        } while (option != 4);

    }
}
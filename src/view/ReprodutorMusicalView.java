package view;

import model.Iphone;

import java.util.Scanner;

public class ReprodutorMusicalView {
    public static void ReprodutorMusical() {
        Scanner input = new Scanner(System.in);
        Iphone iphone = new Iphone();

        System.out.println("Reprodutor Musical");
        System.out.println("1 - Tocar Música");
        System.out.println("2 - Pausar Música");
        System.out.println("3 - Selecionar Música");
        System.out.println("4 - Voltar");
        System.out.print("Escolha: ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                iphone.tocar();
                break;
            case 2:
                iphone.pausar();
                break;
            case 3:
                System.out.print("Digite o nome da música: ");
                input.nextLine();
                String musica = input.nextLine();
                iphone.selecionarMusica(musica);
                break;
            case 4:
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                ReprodutorMusical();
                break;
        }
    }
}

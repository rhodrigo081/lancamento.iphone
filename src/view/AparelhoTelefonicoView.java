package view;

import model.Iphone;

import java.util.Scanner;

public class AparelhoTelefonicoView {
    public static void ReprodutorMusicalView() {

        Scanner input = new Scanner(System.in);
        Iphone iphone = new Iphone();

        System.out.println("Aparelho Telefonico");
        System.out.println("1 - Fazer Chamada");
        System.out.println("2 - Receber Chamada");
        System.out.println("3 - Enviar Mensagem");
        System.out.println("4 - Voltar");
        System.out.print("Escolha: ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.print("Digite o número para chamada: ");
                input.nextLine();
                String numeroChamada = input.nextLine();
                iphone.ligar(numeroChamada);
                break;
            case 2:
                iphone.atender();
                break;
            case 3:
                iphone.iniciarCorreioVoz();
                break;
            case 4:
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                ReprodutorMusicalView();
                break;

        }


    }
}

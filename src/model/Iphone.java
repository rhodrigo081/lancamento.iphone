package model;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    Scanner input = new Scanner(System.in);

    @Override
    public void tocar() {
            System.out.println("Tocando música");
            System.out.println("Digite 'P' para pausar ou 'F' para sair");
            char button = input.next().toUpperCase().charAt(0);
            switch (button) {
                case 'P':
                    pausar();
                    break;
                case 'F':
                    System.out.println("Saindo do reprodutor musical");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    tocar();
                    break;
            }
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
        System.out.println("Digite 'P' para sair de pause ou 'F' para sair");
        char button = input.next().toUpperCase().charAt(0);
        switch (button) {
            case 'P':
                tocar();
                break;
            case 'F':
                System.out.println("Saindo do reprodutor musical");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                pausar();
                break;
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
        tocar();
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
        System.out.println("Digite 'F' para finalizar a ligação");
        System.out.println("'C' para iniciar correio de voz");
        char button = input.next().toUpperCase().charAt(0);

        switch (button) {
            case 'F':
                System.out.println("Ligação finalizada");
                break;
            case 'C':
                iniciarCorreioVoz();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                ligar(numero);
                break;
        }
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada");
        System.out.println("Digite 'F' para finalizar a ligação");
        char button = input.next().toUpperCase().charAt(0);

        switch (button) {
            case 'F':
                System.out.println("Ligação finalizada");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                atender();
                break;
        }

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarAba(String url) {
        System.out.println("Adicionando aba com URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}

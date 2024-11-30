import Classes.Evento;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Evento eventosGerenciados = new Evento();


    while (true) {
        System.out.println("1. Adicionar Evento");
        System.out.println("2. Remover Evento");
        System.out.println("3. Listar Evento");
        System.out.println("0. Sair do Programa");

        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.print("Digite o nome do Evento: ");
                sc.nextLine();
                String nome = sc.nextLine();
                LocalDate data = Evento.lerData(sc);
                System.out.println("Digite o local do Evento: ");
                String local = sc.nextLine();

                eventosGerenciados.adicionarEvento(nome, data, local);
                break;
            case 2:
                LocalDate dataRemover = Evento.lerData(sc);
                eventosGerenciados.removerEvento(dataRemover);
                break;
            case 3:
                eventosGerenciados.listarEventos();
                break;
            case 0:
                System.out.println("Saindo do Programa");
                break;
            default:
                System.out.println("Opcao invalida. Tente Novamente");
        }
      }
    }
}
package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Evento {
    private String nome;
    private LocalDate data;
    private String local;

    private List<Evento> eventos;

    public Evento(String nome, LocalDate data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public Evento(){
        eventos = new ArrayList<>();
    }

    public void adicionarEvento(String nome, LocalDate data, String local){
        Evento novoEvento = new Evento(nome, data, local);
        eventos.add(novoEvento);
    }

    public void removerEvento(LocalDate data){
        boolean encontrado = false;
        for (Evento evento : eventos){
            if (evento.getData().equals(data)){
                eventos.remove(evento);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum evento encontrado para a data: " + data);
        }
    }

    public void listarEventos(){
        for (Evento evento : eventos){
            System.out.println(evento);
        }
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public static LocalDate lerData(Scanner sc) {
        LocalDate data = null;
        boolean valida = false;

        while (!valida) {
            try {
                System.out.print("Digite a data do evento (AAAA-MM-DD): ");
                String entrada = sc.nextLine();
                data = LocalDate.parse(entrada, DateTimeFormatter.ISO_LOCAL_DATE);
                valida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido! Por favor, use o formato AAAA-MM-DD.");
            }
        }

        return data;
    }


    public String toString() {
        return "Evento: " + nome + ", Data: " + data + ", Local: " + local;
    }
}

# GERENCIONAMENTO DE EVENTOS 

Este projeto em Java é um sistema básico de gerenciamento de eventos que permite adicionar, listar e remover eventos. Ele utiliza conceitos como POO (Programação Orientada a Objetos), manipulação de listas (ArrayList) e tratamento de datas (LocalDate).

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

* 1 . ``` Main ```
  *  Classe principal que contém o menu de interação com o usuário.
  * Permite adicionar, remover e listar eventos utilizando a classe Evento.
* 2 . ``` Evento ```
  * Representa um evento com os atributos: ```nome```, ```data``` e ```local```.
  * Contém os métodos para manipulação de eventos:
    * ```adicionarEvento(String nome, LocalDate data, String local)```
    * ```removerEvento(LocalDate data)```
    * ```listarEventos()```
    * ```lerData(Scanner sc)``` (utilitário para validação de entrada de datas).

## Funcionamento

* 1 . Adicionar Evento
  O programa solicita:
  * Nome do evento.
  * Data no formato AAAA-MM-DD (com validação).
  * Local do evento.

Os dados são armazenados em uma lista ```(ArrayList)``` de eventos.

* 2 . Remover Evento
  O programa solicita a data do evento a ser removido.
  * Se houver eventos na data informada, o primeiro evento encontrado será removido.
  * Caso contrário, uma mensagem de erro será exibida.

* 3 . Listar Eventos
  Todos os eventos cadastrados são exibidos, mostrando nome, data e local.

* 4 .  Sair do Programa
  Finaliza a execução do programa.

Autor: [Tallis Teixeira de Melo]
E-mail: tteixeirademelo@gmail.com
Licença: Uso pessoal ou acadêmico.

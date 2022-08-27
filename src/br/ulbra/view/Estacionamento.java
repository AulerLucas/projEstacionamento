package br.ulbra.view;
//Lucas Auler Bonfante

import br.ulbra.classes.Base;
import br.ulbra.classes.Cliente;
import java.util.Scanner;

public class Estacionamento {

    public static Base banco = new Base();

    public static void main(String[] args) {
        int lop = 1;
        Scanner ler = new Scanner(System.in);

        while (lop != 6) {
            System.out.println(
                    "───███████\n"
                    + "───████████\n"
                    + "─███████████\n"
                    + "██───████████\n"
                    + "█─▄█▄─████████\n"
                    + "█─▀█▀─█████████\n"
                    + "██───███████████\n"
                    + "─█████████▓▓▓▓██\n"
                    + "───███████▓▓▓▓██\n"
                    + "───█▀▀▀▀▀███████\n"
                    + "───███████▓▓▓▓██\n"
                    + "───███████▓▓▓▓██\n"
                    + "───███████▓▓▓▓██\n"
                    + "───███████▓▓▓▓█\n"
                    + "───███████▓▓▄▀\n"
                    + "───███████▄▀\n"
                    + "───███████\n"
                    + "─█████████\n"
                    + "██───█████\n"
                    + "█─▄█▄─████\n"
                    + "█─▀█▀─████\n"
                    + "██───████▀\n"
                    + "─███████▀\n"
                    + "───█▒▒█▀");
            System.out.println("ESTACIONAMENTO");
            System.out.println("1 - Adicionar veículo"); //F
            System.out.println("2 - Alterar"); //F
            System.out.println("3 - Verificar quantidades de veículos");
            System.out.println("4 - Liberar Veículo"); //F
            System.out.println("5 - consultar os Veículos no estacionamento"); //F
            System.out.println("6 - Sair"); //F
            System.out.println("7 - Pagamento");
            System.out.println("DIGITE O REQUERIMENTO DESEJADO");

            lop = ler.nextInt();
            switch (lop) {
                case 1:
                    Cliente c = new Cliente();
                    ler.nextLine();
                    System.out.println("Preencha os seguintes dados ");
                    System.out.println("Nome do Cliente:");
                    c.setNomeCliente(ler.nextLine());
                    System.out.println("CPF:");
                    c.setCpf(ler.nextLine());
                    System.out.println("RG:");
                    c.setRg(ler.nextLine());
                    System.out.println("Telefone:");
                    c.setTelefone(ler.nextLine());
                    System.out.println("CEP:");
                    c.setCep(ler.nextLine());
                    System.out.println("Nome do veículo:");
                    c.setNomeVeiculo(ler.nextLine());
                    System.out.println("Placa do veículo:");
                    c.setPlaca(ler.nextLine());
                    System.out.println("Data de entrada:");
                    c.setData(ler.nextLine());
                    System.out.println("Horário de entrada do veículo:");
                    c.setHoraEntrada(ler.nextInt());
                    banco.adicionarVeiculo(c);
                    break;

                case 2:
                    ler.nextLine();
                    Cliente cl = new Cliente();
                    System.out.println("Alterar veículos");
                    System.out.println("----------------");
                    System.out.println("Informe a placa do veículo:");
                    cl.setPlaca(ler.nextLine());
                    int ind = banco.encontrarPessoa(cl);
                    if (ind != -1) {
                        System.out.println("Informe os novos dados");
                        System.out.println("Nome:");
                        cl.setNomeCliente(ler.nextLine());
                        System.out.println("CPF:");
                        cl.setCpf(ler.nextLine());
                        System.out.println("RG:");
                        cl.setRg(ler.nextLine());
                        System.out.println("Telefone:");
                        cl.setTelefone(ler.nextLine());
                        System.out.println("CEP:");
                        cl.setCep(ler.nextLine());
                        System.out.println("Nome do veículo:");
                        cl.setNomeVeiculo(ler.nextLine());
                        System.out.println("Placa do veículo:");
                        cl.setPlaca(ler.nextLine());
                        System.out.println("Data de entrada:");
                        cl.setData(ler.nextLine());
                        System.out.println("Horário de entrada do veículo:");
                        cl.setHoraEntrada(ler.nextInt());
                      
                        banco.alterar(ind, cl);
                    }
                    break;

                case 3:
                    System.out.println("Quantidade de veiculos: "+banco.retornarQuant());
                    break;
                case 4:
                    //excluir veículo
                    ler.nextLine();
                    Cliente c1 = new Cliente();
                    System.out.println("EXCLUIR VEÍCULO");
                    System.out.println("----------------");
                    System.out.println("Informe a placa do veículo:");
                    c1.setPlaca(ler.nextLine());
                    int i = banco.encontrarPessoa(c1);
                    if (i != -1) {
                        banco.excluir(i);
                    } else {
                        System.out.println("ERRO: Este veículo não existe");
                    }
                    break;

                case 5:
                    //listar cliente
                    System.out.println(banco.listarCliente());
                    
                    
                    
                    break;
                    
                case 7:
                    ler.nextLine();
                    Cliente clp = new Cliente();
                    System.out.println("Pagamento do estacionamento");
                    System.out.println("----------------");
                    System.out.println("Informe a placa do veículo:");
                    clp.setPlaca(ler.nextLine());
                    int p = banco.encontrarPessoa(clp);
                   
                    if (p != -1) {
                        System.out.println("Informe o horario de saida:");
                             
                        clp.setNomeCliente(banco.retornarCli(p).getNomeCliente());
                        clp.setCpf(banco.retornarCli(p).getCpf());
                        clp.setRg(banco.retornarCli(p).getRg());
                        clp.setTelefone(banco.retornarCli(p).getTelefone());
                        clp.setCep(banco.retornarCli(p).getCep());
                        clp.setNomeVeiculo(banco.retornarCli(p).getNomeVeiculo());
                        clp.setPlaca(banco.retornarCli(p).getPlaca());
                        clp.setData(banco.retornarCli(p).getData());
                        clp.setHoraEntrada((int) banco.retornarCli(p).getHoraEntrada());
                        clp.setSaida(ler.nextInt());
                        banco.alterar(p, clp);
                        double valor =0;
                        valor = (banco.retornarCli(p).getSaida() - banco.retornarCli(p).getHoraEntrada())*2; 
                        System.out.println("O valor a ser pago é: R$"+valor);
                    }else{
                        System.out.println("Carro não existe!");
                    }
                    

            }

        }
    }
}

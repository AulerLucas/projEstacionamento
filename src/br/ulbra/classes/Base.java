package br.ulbra.classes;
//Lucas Auler Bonfante

import java.util.ArrayList;
import java.util.Scanner;

public class Base {

    public ArrayList<Cliente> b = new ArrayList();

    public void adicionarVeiculo(Cliente c) {
        b.add(c);
        System.out.println("Veiculo cadastrado com sucesso!");
    }

    public String listarCliente() {
        String res = "clientes \n\n";
        if (b.isEmpty()) {
            res = "lista vazia";
        } else {
            for (int i = 0; i < b.size(); i++) {
                res += b.get(i).getNomeCliente() + " - "
                        + b.get(i).getCpf() + " - "
                        + b.get(i).getRg() + " - "
                        + b.get(i).getTelefone() + " - "
                        + b.get(i).getCep() + " - "
                        + b.get(i).getNomeVeiculo() + " - "
                        + b.get(i).getPlaca() + " - "
                        + b.get(i).getData() + " - "
                        + b.get(i).getHoraEntrada() + " - "
                        + b.get(i).getSaida()
                        + "\n";
            }
        }
        return res;
    }

    public ArrayList getCli() {

        return b;
    }

    public int encontrarPessoa(Cliente c) {
        int aux = -1;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).getPlaca().equals(c.getPlaca())) {
                aux = i;
            }
        }
        return aux;
    }
    public Cliente retornarCli(int i){
        return b.get(i);
    }

    public void excluir(int i) {
        Scanner ler = new Scanner(System.in);
        int op;
        System.out.println("Tem certeza que deseja excluir? (1 = Sim -- 2 = Não)");
        op = ler.nextInt();
        if (op == 1) {
            b.remove(i);
            System.out.println("Removido com sucesso.");
        } else {
            System.out.println("Exclusão cancelada.");
        }
    }

   

    public void alterar(int i, Cliente c) {
        b.set(i, c);
        System.out.println("Contato alterado com sucesso");
    }

    public int calc(int i, Cliente c) {
        int ind = 0;

        return ind;
    }

    public int retornarQuant() {
        return b.size();
    }
}

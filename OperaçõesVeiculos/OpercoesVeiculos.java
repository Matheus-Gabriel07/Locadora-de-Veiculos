package OperaçõesVeiculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public interface OpercoesVeiculos {

    public String alugarVeiculos();

    public void abastecerVeiculo();

    public void consultarInformacoes();
}

class Cliente implements OpercoesVeiculos {
    String nome;
    int idade;
    String veiculoAlugado;
    String[] carrosDisponiveis = { "Corsa cromado", "Carro 2", "Carro 3" };
    ArrayList<String> litarCarros = new ArrayList<String>(Arrays.asList(carrosDisponiveis));
    
    Scanner sc = new Scanner(System.in);
    Delay delay = new Delay();

    public Cliente(String nome, int idade, String veiculoAlugado) {
        this.idade = idade;
        this.nome = nome;
        this.veiculoAlugado = veiculoAlugado;
    }

    // Metodo Getter do atributo idade:
    public int getIdade() {
        return idade;
    }

    // Método Getter do atributo nome:
    public String getNome() {
        return nome;
    }

    // Método Getter do atributo veiculo alugado:
    public String getVeiculoAlugado() {
        return veiculoAlugado;
    }
    // Metodo Setter do atributo idade:

    public void setIdade(int idade) {
        this.idade = idade;
    }
    // Método Setter do atributo nome:

    public void setNome(String nome) {
        this.nome = nome;
    }
    // Método Setter do atributo veiculo alugado:

    public void setVeiculoAlugado(String veiculoAlugado) {
        this.veiculoAlugado = veiculoAlugado;
    }

    @Override
    public String alugarVeiculos() {
        System.out.println(litarCarros);    
        System.out.println("Digite o nome do carro que você deseja comprar");
        String carroAlugar = sc.nextLine();
        
        boolean teste = litarCarros.contains(carroAlugar);

        if (teste == true) {
            System.out.println("Carro Alugado");
            litarCarros.remove(carroAlugar);
            System.out.println(litarCarros);
            System.out.println(carroAlugar);
            return carroAlugar;

        } else if (teste == false) {
            System.out.println("Carro inexistente");
            return "Carro inexistente "; 
        }
        return "Carro não alugado";
    }

    @Override
    public void abastecerVeiculo() {
        double litrosGastado = 10;
        Boolean controle = true;
        System.out.println("Você está devolvendo o carro e precisa abastecer antes de devolver.\n" +
            "Você gastou " + litrosGastado + "L. Abasteça no posto de combústivel mais próximo.");

        delay.timeDelay(2000);

        while (controle) {
            System.out.println("Você já abasteceu o carro?\n" +
            "1- Sim\n" +
            "2- Não");
            int abasteceuSouN = sc.nextInt();

            if(abasteceuSouN == 1) {
                System.out.println("Vá para a conscessionária.");
                controle = false;
            } else if(abasteceuSouN == 2) {
                System.out.println("Vá abastecer.");
            } else {
                System.out.println("Opção Inválida.");
            }
        }
        
        

    }

    @Override
    public void consultarInformacoes() {
        /*
         * Nome do clinete:
         * Idade do Cliente:
         * Qual carro o cliente alugou?
         * CPF:
         * RG:
         * Email: 
         */
    }

}
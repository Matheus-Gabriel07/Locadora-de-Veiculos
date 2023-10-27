
/** Classe base 'OperaçãoVeiculos' com a subclasse Cliente
 * ------------------------
 * 
 * @version 1.3
 * @author Kaique
*/

// TODO - FAZER CONSULTA DE INFORMAÇÕES

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public interface OpercoesVeiculos {
    public String alugarVeiculos();
    public void devolverVeiculo();
    public void abastecerVeiculo();
    public void consultarInformacoes();
}

class Cliente implements OpercoesVeiculos {
    Scanner sc = new Scanner(System.in);
    
    String[] carrosDisponiveis = { "Corsa cromado", "Carro 2", "Carro 3" };
    ArrayList<String> litarCarros = new ArrayList<String>(Arrays.asList(carrosDisponiveis));
    
    ArrayList<Object> carrosTotais = new ArrayList<Object>(Arrays.asList());
    ArrayList<String> carros = new ArrayList<String>(Arrays.asList());
    ArrayList<String> motos = new ArrayList<String>(Arrays.asList());
    
    private String nome;
    int idade;
    String veiculoAlugado;

    public Cliente(String nome, int idade, String veiculoAlugado) {
        if (idade >= 18) {
            this.idade = idade;
        } else {
            this.idade = 0;
            System.out.println("Não é possivel cadastrar este cliente. Idade insuficiente.");
        }

        this.nome = nome;

        if(veiculoAlugado != null) {
            this.veiculoAlugado = veiculoAlugado;
        } else {
            this.veiculoAlugado = "Nenhum veiculo alugado.";
        }
    }

    /* Getters & Setters */

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getVeiculoAlugado() {
        return veiculoAlugado;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVeiculoAlugado(String veiculoAlugado) {
        this.veiculoAlugado = veiculoAlugado;
    }

    // Overrides

    @Override
    public String alugarVeiculos() {
        System.out.println(litarCarros);
        System.out.println("Digite o nome do carro que você deseja comprar");
        String carroAlugar = sc.nextLine();

        boolean validarBusca = litarCarros.contains(carroAlugar);

        if (validarBusca == true) {
            System.out.println("Carro Alugado");
            litarCarros.remove(carroAlugar);
            System.out.println(litarCarros);
            System.out.println(carroAlugar);
            return carroAlugar;

        } else if (validarBusca == false) {
            System.out.println("Carro inexistente");
            return "Carro inexistente ";
        }
        return "Carro não alugado";
    }

    @Override
    public void devolverVeiculo() {
        String retorno = alugarVeiculos();
        System.out.println(retorno + "Teste");
    }

    @Override
    public void abastecerVeiculo() {
        double litrosGastado = 10;
        System.out.println("Você está devolvendo o carro e precisa abastecer antes de devolver.\n" +
                "Você gastou " + litrosGastado + "L. Abasteça no posto de combústivel mais próximo.");
    }

    @Override
    public void consultarInformacoes() {
        System.out.println("Olá mundo");
    }

    /* Métodos exclusivos da subclass */

    public String toString() {
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Veiculos alugados: " + this.veiculoAlugado;
    }
}
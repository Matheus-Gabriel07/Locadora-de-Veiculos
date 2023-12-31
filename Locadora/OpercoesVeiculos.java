
/** Classe base 'OperaçãoVeiculos' com a subclasse Cliente
 * ------------------------
 * 
 * @version 1.4
 * @author Kaique
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public interface OpercoesVeiculos {
    public void alugarEDevolverVeiculos();

    public void abastecerVeiculo();

    public void consultarInformacoes();
}

class Cliente implements OpercoesVeiculos {
    Configuration delay = new Configuration();
    Locadora locadora = new Locadora();
    Scanner sc = new Scanner(System.in);

    String[] carrosDisponiveis = { "Corsa cromado", "Carro 2", "Carro 3" };
    ArrayList<String> litarCarros = new ArrayList<String>(Arrays.asList(carrosDisponiveis));

    ArrayList<Object> carrosTotais = new ArrayList<Object>(Arrays.asList());
    ArrayList<String> carros = new ArrayList<String>(Arrays.asList());
    ArrayList<String> motos = new ArrayList<String>(Arrays.asList());

    // Atribuição e construção da classe
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

        if (veiculoAlugado != null) {
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
    public void alugarEDevolverVeiculos() {
        System.out.println("Você deseja alugar ou devolver um veículo?\n" +
                "1- Alugar\n" +
                "2- Devolver");
        int devolverOuAlugar = sc.nextInt();

        if (devolverOuAlugar == 1) {
            System.out.println("Você deseja alugar um carro ou uma moto?\n" +
                    "1- Carro \n" +
                    "2- Moto");
            int alugarCarroOuMoto = sc.nextInt();
            delay.clearBuff(sc);

            if (alugarCarroOuMoto == 1) {
                System.out.println("Qual carro você deseja alugar?");
                delay.delayTimer(1000);
                locadora.listarCarros();
                delay.delayTimer(1000);
                System.out.println("Qual carro você deseja alugar?");
                String carroAlugar = sc.nextLine();

                boolean teste = locadora.listaDeBusca.contains(carroAlugar);

                if (teste == true) {
                    System.out.println("Carro Alugado");

                    locadora.listaDeBusca.remove(carroAlugar);
                    locadora.arrayCarros.remove(carroAlugar);
                    locadora.veiculosTotais.remove(carroAlugar);

                    setVeiculoAlugado(carroAlugar);
                } else if (teste == false) {
                    System.out.println("Carro inexistente");
                }
            }
            if (alugarCarroOuMoto == 2) {
                System.out.println("Qual moto você deseja alugar?");
                delay.delayTimer(1000);
                locadora.listarMotos();
                delay.delayTimer(1000);
                String motoAlugar = sc.nextLine();

                boolean teste = locadora.listaDeBusca.contains(motoAlugar);

                if (teste == true) {
                    System.out.println("Moto Alugado");

                    locadora.arrayMotos.remove(motoAlugar);
                    locadora.listaDeBusca.remove(motoAlugar);
                    locadora.veiculosTotais.remove(motoAlugar);

                    setVeiculoAlugado(motoAlugar);

                } else if (teste == false) {
                    System.out.println("Moto inexistente");
                }
            }
        }
        if (devolverOuAlugar == 2) {
            String defaultLogin = getNome();
            String defaultSenha = "123";

            if (getVeiculoAlugado() == "Nenhum veiculo alugado.") {
                System.out.println("Não tem veiculos para devolução");
            } else {
                boolean padraoLogin = true;
                boolean padraoSenha = true;
                while (padraoLogin) {
                    System.out.println("Por favor inserir seu login: ");
                    String login = sc.nextLine();
                    boolean verifica = login.equals(defaultLogin);
                    if (verifica) {
                        padraoLogin = false;
                        while (padraoSenha) {
                            System.out.println("Por favor inserir a senha de segurança: ");
                            String senha = sc.nextLine();
                            boolean verificarSenha = senha.equals(defaultSenha);
                            if (verificarSenha) {
                                System.out.println("**VEICULO DEVOLVIDO COM SUCESSO**");
                                padraoSenha = false;
                            } else if (verificarSenha == false) {
                                System.out.println("Senha incorreta");
                            }
                        }

                    } else if (verifica == false) {
                        System.out.println("login invalida");
                    }
                }
            }
        }
    }

    @Override
    public void abastecerVeiculo() {
        if (getVeiculoAlugado() == "Nenhum veiculo alugado.") {
            System.out.println("Não há um veículo alugado.");
        } else {
            double litrosGastado = 10;
            System.out.println("Você está devolvendo o carro e precisa abastecer antes de devolver.\n" +
                    "Você gastou " + litrosGastado + "L. Abasteça no posto de combústivel mais próximo.");
        }
    }

    @Override
    public void consultarInformacoes() {
        System.out.println("\t---------- Informações Pessoais ----------\n" +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nVeiculos alugados: " + this.veiculoAlugado +
                "\n\t--------------------------------\n\n");
        delay.delayTimer(750);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Veiculos alugados: " + this.veiculoAlugado;
    }
}
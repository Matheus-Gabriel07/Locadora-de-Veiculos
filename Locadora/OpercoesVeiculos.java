/** Classe base 'OperaçãoVeiculos' com a subclasse Cliente
 * ------------------------
 * 
 * @version 1.2
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
    Locadora locadora = new Locadora();

    
    Configuration delay = new Configuration();
    String nome;
    int idade;
    String veiculoAlugado;
    String[] carrosDisponiveis = { "Corsa cromado", "Carro 2", "Carro 3" };
    ArrayList<String> litarCarros = new ArrayList<String>(Arrays.asList(carrosDisponiveis));
    
    ArrayList<Object> carrosTotais = new ArrayList<Object>(Arrays.asList());
    ArrayList<String> carros = new ArrayList<String>(Arrays.asList());
    ArrayList<String> motos = new ArrayList<String>(Arrays.asList());

    Scanner sc = new Scanner(System.in);

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
    public void alugarEDevolverVeiculos() {
        String veicloAlugado = null;

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
                String carroAlugar = sc.nextLine();

                boolean teste = locadora.listaDeBusca.contains(carroAlugar);

                if (teste == true) {
                    System.out.println("Carro Alugado");
                    
                    locadora.listaDeBusca.remove(carroAlugar);
                    locadora.arrayCarros.remove(carroAlugar);
                    locadora.veiculosTotais.remove(carroAlugar);
                    
                    System.out.println(locadora.arrayCarros);
                    
                    veicloAlugado = carroAlugar;

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

                    System.out.println(locadora.listaDeBusca);
                    veicloAlugado = motoAlugar;

                } else if (teste == false) {
                    System.out.println("Moto inexistente");
                }
            }
        }
        if (devolverOuAlugar == 2) {
            String defaultLogin = "123456";
            String defaultSenha = "1234";
            if (veicloAlugado == null) {
                //System.out.println("Não tem veiculos para devolução");
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
        double litrosGastado = 10;
        System.out.println("Você está devolvendo o carro e precisa abastecer antes de devolver.\n" +
            "Você gastou " + litrosGastado + "L. Abasteça no posto de combústivel mais próximo.");
    }

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
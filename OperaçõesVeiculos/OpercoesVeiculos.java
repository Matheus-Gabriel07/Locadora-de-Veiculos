package OperaçõesVeiculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public interface OpercoesVeiculos {

    public void alugarEDevolverVeiculos();

    public void abastecerVeiculo();

    public void consultarInformacoes();
}

class Cliente implements OpercoesVeiculos {
    String nome;
    int idade;
    String veiculoAlugado;
    int rg;
    int cpf;
    String email;

    // Array de carros disponiveis
    String[] carrosDisponiveis = { "Corsa cromado", "Carro 2", "Carro 3" };
    ArrayList<String> listarCarros = new ArrayList<String>(Arrays.asList(carrosDisponiveis));

    // Array de motos disponiveis
    String[] motosDisponiveis = { "Moto 1", "Moto 2", "Moto 3" };
    ArrayList<String> listarMotos = new ArrayList<String>(Arrays.asList(motosDisponiveis));

    Scanner sc = new Scanner(System.in);
    Delay delay = new Delay();

    public Cliente(String nome, int idade, String veiculoAlugado) {
        this.idade = idade;
        this.nome = nome;
        this.veiculoAlugado = veiculoAlugado;
        // this.cpf = cpf;
        // this.rg = rg;
        // this.email = email;
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

    // MétodoGetter do atributo RG:

    public int getRg() {
        return rg;
    }

    // Método Getter do atributo CPF:

    public int getCpf() {
        return cpf;
    }

    // Método Getter do atributo Email:

    public String getEmail() {
        return email;
    }

    // Metodo Setter do atributo idade:

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método Setter do atributo nome:

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método Setter do atributo CPF:

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    // Método Setter do atributo RG:

    public void setRg(int rg) {
        this.rg = rg;
    }

    // Método Setter do atributo Email:

    public void setEmail(String email) {
        this.email = email;
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
            delay.clearBuffer(sc);

            if (alugarCarroOuMoto == 1) {
                System.out.println("Qual carro você deseja alugar?");
                delay.timeDelay(1000);
                System.out.println(listarCarros);
                delay.timeDelay(1000);
                String carroAlugar = sc.nextLine();

                boolean teste = listarCarros.contains(carroAlugar);

                if (teste == true) {
                    System.out.println("Carro Alugado");
                    listarCarros.remove(carroAlugar);
                    System.out.println(listarCarros);
                    veicloAlugado = carroAlugar;

                } else if (teste == false) {
                    System.out.println("Carro inexistente");
                }
            }
            if (alugarCarroOuMoto == 2) {
                System.out.println("Qual moto você deseja alugar?");
                delay.timeDelay(1000);
                System.out.println(listarMotos);
                delay.timeDelay(1000);
                String motoAlugar = sc.nextLine();

                boolean teste = listarMotos.contains(motoAlugar);

                if (teste == true) {
                    System.out.println("Moto Alugado");
                    listarMotos.remove(motoAlugar);
                    System.out.println(listarMotos);
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
        Boolean controle = true;
        System.out.println("Você está devolvendo o carro e precisa abastecer antes de devolver.\n" +
                "Você gastou " + litrosGastado + "L. Abasteça no posto de combústivel mais próximo.");

        delay.timeDelay(2000);

        while (controle) {
            delay.timeDelay(2000);
            System.out.println("Você já abasteceu o carro?\n" +
                    "1- Sim\n" +
                    "2- Não");
            int abasteceuSouN = sc.nextInt();

            if (abasteceuSouN == 1) {
                System.out.println("Vá para a conscessionária.");
                controle = false;
            } else if (abasteceuSouN == 2) {
                System.out.println("Vá abastecer.");
            } else {
                System.out.println("Opção Inválida.");
            }
        }

    }

    @Override
    public void consultarInformacoes() {

        System.out.println("\t============Informações================/n");
        System.out.println("Nome do cliente " + nome);
        System.out.println("Idade do cliente " + idade);
        System.out.println("Qual carro o clienete alugou " + veiculoAlugado);
        System.out.println("CPF " + cpf);
        System.out.println("RG " + rg);
        System.out.println("Email " + email);
        System.out.println("\t==========================================/n");
    }

}
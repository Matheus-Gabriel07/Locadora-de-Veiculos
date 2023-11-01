
/** Classe base 'Locadora' principal que invocada e agrupa todas as outras classes
 * ------------------------
 * 
 * @version 1.5.3
 * @author Kaique
 * @author Matheus
 * @author Willian
*/

import java.util.*;

public class Locadora {
    Configuration configuration = new Configuration();
    Settings settings = new Configuration();
    Scanner sc = new Scanner(System.in);
    OpercoesVeiculos opercoesVeiculos;

    // Array contendo todos os clientes.
    Object[] listaClientes = {};
    ArrayList<Object> arrayListaCliente = new ArrayList<Object>(Arrays.asList(listaClientes));

    // Array contendo todos os veiculos (Carro e Moto).
    String[] listaTodosVeiculos = {};
    ArrayList<Object> veiculosTotais = new ArrayList<Object>(Arrays.asList(listaTodosVeiculos));

    // Array contendo todos os carros.
    String[] listaTodosCarros = {};
    ArrayList<Object> arrayCarros = new ArrayList<Object>(Arrays.asList(listaTodosCarros));

    // Array contendo todas as motos.
    String[] listaTodasMotos = {};
    ArrayList<Object> arrayMotos = new ArrayList<Object>(Arrays.asList(listaTodasMotos));

    // Array com a lista de busca
    String[] buscaVeiculos = {};
    ArrayList<String> listaDeBusca = new ArrayList<String>(Arrays.asList(buscaVeiculos));

    // Criando o objeto dos carros.
    Carro ferrari = new Carro("Ferrari", "F40", 2010, 100, 2, 2000);
    Carro palio = new Carro("Fiat", "Pálio", 2007, 100, 4, 230000);
    Carro prisma = new Carro("Chevrolet", "Prisma", 2015, 100, 4, 150000);
    Carro civic = new Carro("Honda", "Civic", 2017, 100, 4, 100000);
    Carro bmw = new Carro("BMW", "320i", 2019, 100, 4, 120000);

    // Criando objeto das motos.
    Moto gs = new Moto("BMW", "GS", 2017, 100, 500, 30000);
    Moto pcx = new Moto("Honda", "PCX", 2022, 100, 100, 60000);
    Moto ninja = new Moto("Kawasaki", "Ninja", 2015, 100, 300, 200000);
    Moto z1000 = new Moto("Kawasaki", "Z 1000", 2019, 100, 1000, 300000);

    public void start(String usuario) {
        // Instancia para poder realizar a busca.
        String validaFerrari = ferrari.getModelo();
        String validaPalio = palio.getModelo();
        String validaPrisma = prisma.getModelo();
        String validaCivic = civic.getModelo();
        String validaBMW = bmw.getModelo();

        // Instancia das motos
        String validaZ1000 = z1000.getModelo();
        String validaNinja = ninja.getModelo();
        String validaPCX = pcx.getModelo();
        String validaGS = gs.getModelo();

        // Adicionando as váriaveis para a lista de busca.

        // Carros
        listaDeBusca.add(validaFerrari);
        listaDeBusca.add(validaPalio);
        listaDeBusca.add(validaPrisma);
        listaDeBusca.add(validaCivic);
        listaDeBusca.add(validaBMW);

        // Motos
        listaDeBusca.add(validaZ1000);
        listaDeBusca.add(validaNinja);
        listaDeBusca.add(validaPCX);
        listaDeBusca.add(validaGS);

        // Adcionando Objetos de Carros e Motos a lista de veículos
        // Carros
        veiculosTotais.add(ferrari);
        veiculosTotais.add(palio);
        veiculosTotais.add(prisma);
        veiculosTotais.add(civic);

        // Motos
        veiculosTotais.add(bmw);
        veiculosTotais.add(z1000);
        veiculosTotais.add(ninja);
        veiculosTotais.add(pcx);
        veiculosTotais.add(gs);

        // Adicionando Objetos Carros na lista de Carros.
        arrayCarros.add(ferrari);
        arrayCarros.add(palio);
        arrayCarros.add(prisma);
        arrayCarros.add(civic);
        arrayCarros.add(bmw);

        // Adcionando Objetos Motos na lista de Motos.
        arrayMotos.add(z1000);
        arrayMotos.add(ninja);
        arrayMotos.add(pcx);
        arrayMotos.add(gs);

        Cliente usarioLogin = new Cliente(usuario, 25, null);
        arrayListaCliente.add(usarioLogin);
        menuInical(usuario);
    }

    public void menuInical(String usuario) {
        Cliente usarioLogin = new Cliente(usuario, 25, null);

        boolean loopMenu = true;

        do {
            System.out.println("\t---------- Locadora ----------\n" +
                    "\t 1) Cadastrar Veiculo\n" +
                    "\t 2) Cadastrar Cliente\n" +
                    "\t 3) Alugar & Devolver Veículo\n" +
                    "\t 4) Abastecer Veículo\n" +
                    "\t 5) Consultar Informações\n" +
                    "\t 6) Buscar Veículo\n" +
                    "\t 7) Informações Gerais\n" +
                    "\t 8) Sair\n" +
                    "\t--------------------------------\n\n" +
                    "Digite a opção desejada.\n");
            int respotaOpcao = sc.nextInt();

            switch (respotaOpcao) {
                // Cadastro de veiculo
                case 1:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    cadastrodeVeiculos();
                    break;

                // Cadastro de cliente
                case 2:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    cadastroClientes();
                    break;

                // Aluguar & Devolver Veículoo
                case 3:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    usarioLogin.alugarEDevolverVeiculos();
                    break;

                // Abastecer veiculo
                case 4:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    usarioLogin.abastecerVeiculo();
                    break;

                // Consultar informações
                case 5:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    usarioLogin.consultarInformacoes();
                    break;

                case 6:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    buscarVeiculo();
                    break;

                // Exibir listas
                case 7:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    listas();
                    break;

                // Encerração de programa
                case 8:
                    System.out.println("Obrigado por alugar conosco");
                    settings.delayTimer(1000);
                    loopMenu = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (loopMenu);
        sc.close();
    }

    public void cadastrodeVeiculos() {
        boolean loopCadatro = true;
        System.out.println("Cadatro de veiculos");
        settings.breakPrint();

        System.out.println("Digite o tipo de veiculos \n" +
                "1) Carro\n" +
                "2) Moto\n");
        int respotaOpcao = sc.nextInt();

        switch (respotaOpcao) {
            case 1:
                do {
                    configuration.clearBuff(sc);
                    System.out.println("Digite a marca do carro:");
                    String marca = sc.nextLine();
                    System.out.println("Digite o modelo do carro:");
                    String modelo = sc.nextLine();
                    System.out.println("Digite o ano de fabricação do carro:");
                    int ano = sc.nextInt();
                    System.out.println("Digite a capacidade máxima de combustivel do carro:");
                    double combustivel = sc.nextDouble();
                    System.out.println("Digite a quantidade de portas do carro:");
                    int portas = sc.nextInt();
                    System.out.println("Digite a quantidade de quilometros que o carro vai andar: ");
                    double quilometros = sc.nextDouble();
                    Carro carro = new Carro(marca, modelo, ano, combustivel, portas, quilometros);

                    veiculosTotais.add(carro);
                    arrayCarros.add(carro);
                    listaDeBusca.add(modelo);

                    settings.spacePrint(3);
                    System.out.println("Deseja adicionar um novo carro? \n" +
                            "1) Sim\n" +
                            "2) Não\n");
                    int respotaOpcaoCadastro = sc.nextInt();

                    if (respotaOpcaoCadastro == 1) {
                        settings.delayTimer(750);
                        settings.spacePrint(5);
                        loopCadatro = true;
                    } else if (respotaOpcaoCadastro == 2) {
                        settings.delayTimer(750);
                        settings.spacePrint(5);
                        loopCadatro = false;
                    } else {
                        System.out.println("Opção inválida. Cancelando adição de um novo veiculo.");
                    }
                } while (loopCadatro);
                break;

            case 2:
                do {
                    System.out.println("Digite a marca da moto:");
                    String marca = sc.nextLine();
                    System.out.println("Digite o modelo da moto:");
                    String modelo = sc.nextLine();
                    System.out.println("Digite o ano de fabricação da moto:");
                    int ano = sc.nextInt();
                    System.out.println("Digite a capacidade máxima de combustivel da moto:");
                    double combustivel = sc.nextDouble();
                    System.out.println("Digite a cilindrada da moto: ");
                    int cilindrada = sc.nextInt();
                    System.out.println("Digite a quantidade de quilometros que a moto vai andar: ");
                    double quilometros = sc.nextDouble();
                    Moto moto = new Moto(marca, modelo, ano, combustivel, cilindrada, quilometros);
                    veiculosTotais.add(moto);
                    arrayMotos.add(moto);
                    listaDeBusca.add(modelo);

                    settings.spacePrint(3);
                    System.out.println("Deseja adicionar um novo carro? \n" +
                            "1) Sim\n" +
                            "2) Não\n");
                    int respotaOpcaoCadastro = sc.nextInt();

                    if (respotaOpcaoCadastro == 1) {
                        settings.delayTimer(750);
                        settings.spacePrint(5);
                        loopCadatro = true;
                    } else if (respotaOpcaoCadastro == 2) {
                        settings.delayTimer(750);
                        settings.spacePrint(5);
                        loopCadatro = false;
                    } else {
                        System.out.println("Opção inválida. Cancelando adição de um novo veiculo.");
                    }
                } while (loopCadatro);
                break;

            default:
                System.out.println("Opção inválida. Cancelando opção, voltando para o menu principal.");
                break;
        }
    }

    public void cadastroClientes() {
        int loopCadatroCliente = 1;
        while (loopCadatroCliente != 0) {
            System.out.println("Digite o nome do alugador");
            String nome = sc.next();
            settings.delayTimer(500);
            System.out.println("Digite a idade de " + nome);
            int idade = sc.nextInt();
            if (idade < 18) {
                System.out.println("Não é possivel cadastrar este cliente. Idade insuficiente.");
                settings.delayTimer(500);
                settings.spacePrint(3);
                break;
            } else {
                Cliente cliente = new Cliente(nome, idade, null);
                arrayListaCliente.add(cliente);
                for (int i = 0; i < listaClientes.length; i++) {
                    if (listaClientes[i] == null) {
                        listaClientes[i] = cliente;
                        break;
                    }
                }
                settings.spacePrint(3);
                System.out.println("Deseja adicionar um novo cliente? \n" +
                        "1) Sim\n" +
                        "2) Não\n");
                int respotaOpcaoCadastro = sc.nextInt();

                if (respotaOpcaoCadastro == 1) {
                    settings.delayTimer(750);
                    settings.spacePrint(5);
                    loopCadatroCliente = 1;
                } else if (respotaOpcaoCadastro == 2) {
                    settings.delayTimer(750);
                    settings.spacePrint(5);
                    loopCadatroCliente = 0;
                } else {
                    System.out.println("Opção inválida. Cancelando adição de um novo veiculo.");
                }
            }
        }
    }

    public void buscarVeiculo() {
        configuration.clearBuff(sc);
        
        for (String busca : listaDeBusca) {
            System.out.println("> " + busca);
        }

        System.out.println("Digite o modelo que deseja alugar?");
        String buscaVeiculo = sc.nextLine();

        boolean verificarVeiculo = listaDeBusca.contains(buscaVeiculo);

        if (verificarVeiculo == true) {
            System.out.println("Veiculo disponível na loja.");
        } else if (verificarVeiculo == false) {
            System.out.println("Veículo não disponivel");
        }
    }

    public void listarCarros() {
        if (arrayCarros.size() == 0) {
            System.out.println("Não há carros cadastrado.");
        } else {
            for (Object listaCarros : arrayCarros) {
                System.out.println(listaCarros.toString());
            }
        }
    }

    public void listarMotos() {
        if (arrayMotos.size() == 0) {
            System.out.println("Não há motos cadastradas.");
        } else {
            for (Object motos : arrayMotos) {
                System.out.println(motos.toString());
            }
        }
    }

    public void listaDeClientes() {
        if (arrayListaCliente.size() == 0) {
            System.out.println("Não há clientes cadastrados");
        } else {
            for (Object cliente : arrayListaCliente) {
                System.out.println(cliente.toString());
            }
        }
    }

    public void listaDeVeiculos() {
        if (veiculosTotais.size() == 0) {
            System.out.println("Não há veiculos cadastrados");
        } else {
            for (Object veiculo : veiculosTotais) {
                System.out.println(veiculo.toString());
            }
        }
    }

    public void listaVeiculos(int opcaoDeLista) {
        if (opcaoDeLista == 1) {
            listaDeVeiculos();
        } else if (opcaoDeLista == 2) {
            listarCarros();
        } else if (opcaoDeLista == 3) {
            listarMotos();
        } else {
            System.out.println("Opção invalida.");
        }
    }

    public void listas() {
        int loopListas = 1;
        while (loopListas != 0) {
            System.out.println("\t---------- Informações ----------\n" +
                    "\t1) Lista de clientes\n" +
                    "\t2) Lista de veiculos\n" +
                    "\t3) Voltar\n");
            int respotaOpcao = sc.nextInt();

            if (respotaOpcao == 1) {
                settings.delayTimer(750);
                listaDeClientes();
            } else if (respotaOpcao == 2) {
                settings.delayTimer(750);
                while (loopListas != 4) {
                    System.out.println("\t---------- Informações dos Veiculos ----------\n" +
                            "\t1) Lista de Carros\n" +
                            "\t2) Lista de Motos\n" +
                            "\t3) Lista de todos Veiculos\n" +
                            "\t4) Voltar\n");
                    respotaOpcao = sc.nextInt();
                    if (respotaOpcao == 1) {
                        // Void de lista de Carros
                        listaVeiculos(2);
                    } else if (respotaOpcao == 2) {
                        // Void de lista de motos
                        listaVeiculos(3);
                    } else if (respotaOpcao == 3) {
                        // Void de lista do veiculos
                        listaVeiculos(1);
                    } else if (respotaOpcao == 4) {
                        loopListas = 4;
                    } else {
                        System.out.println("Opção invalida.");
                    }
                }
            } else if (respotaOpcao == 3) {
                loopListas = 0;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}

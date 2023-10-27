
/** Classe base 'Locadora' principal que invocada e agrupa todas as outras classes
 * ------------------------
 * 
 * @version 1.5.3
 * @author Kaique
 * @author Matheus
 * @author Willian
*/

// TODO - AJUSTAR OPÇÃO MENU INICIAL DE LISTAR CLIENTES PARA 'IMFORMAÇÕES'; 
// TODO - INTRODUZIR SISTEMA DE PAGAMENTO PARA ALGUEL DE VEICULOS;
// TODO - CASO TENHA TEMPO, FAZER ADM, E MUDAR TODA ESTRURA DE MENU;
// TODO - EASTER EGG

import java.util.*;

public class Locadora {
    Scanner sc = new Scanner(System.in);
    Configuration configuration = new Configuration();
    Settings settings = new Configuration();

    OpercoesVeiculos opercoesVeiculos = new Cliente(null, 0, null);
    OpercoesVeiculos opera;

    Object[] listaClientes = {};
    ArrayList<Object> arrayListaCliente = new ArrayList<Object>(Arrays.asList(listaClientes));

    String[] listaTodosVeiculos = {};
    ArrayList<Object> veiculosTotais = new ArrayList<Object>(Arrays.asList(listaTodosVeiculos));

    String[] listaTodosCarros = {};
    ArrayList<Object> arrayCarros = new ArrayList<Object>(Arrays.asList(listaTodosCarros));

    String[] listaTodasMotos = {};
    ArrayList<Object> arrayMotos = new ArrayList<Object>(Arrays.asList(listaTodasMotos));

    public void start(String usuario) {
        Cliente usarioLogin = new Cliente(usuario, 25, null);
        arrayListaCliente.add(usarioLogin);
        menuInical(usuario);
    }

    public void menuInical(String usuario) {
        Cliente usarioLogin = new Cliente(usuario, 25, null);

        Carro ferrari = new Carro("Ferrari", "F40", 2010, 100, 2, 2000);
        Carro palio = new Carro("Fiat", "Pálio", 2007, 100, 4, 230000);
        Carro prisma = new Carro("Chevrolet", "Prisma", 2015, 100, 4, 150000);
        Carro civic = new Carro("Honda", "Civic", 2017, 100, 4, 100000);
        Carro bmw = new Carro("BMW", "320i", 2019, 100, 4, 120000);

        veiculosTotais.add(ferrari);
        veiculosTotais.add(palio);
        veiculosTotais.add(prisma);
        veiculosTotais.add(civic);
        veiculosTotais.add(bmw);

        boolean loopMenu = true;

        do {
            System.out.println("\t---------- Locadora ----------\n" +
                    "\t 1) Cadastrar Veiculo\n" +
                    "\t 2) Cadastrar Cliente\n" +
                    "\t 3) Aluguar Veículo\n" +
                    "\t 4) Delvolver Veículo\n" +
                    "\t 5) Abastecer Veículo\n" +
                    "\t 6) Consultar Informações\n" +
                    "\t 7) Buscar Veículo\n" +
                    "\t 8) Lista de Clientes\n" +
                    "\t 9) Sair\n" +
                    "\t--------------------------------\n\n" +
                    "Digite a opção desejada.\n");
            int respotaOpcao = sc.nextInt();

            switch (respotaOpcao) {
                // Cadastro de veiculo
                case 1:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    break;

                // Cadastro de cliente
                case 2:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    cadastroClientes();
                    break;

                // Alugar veiculo
                case 3:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    opercoesVeiculos.abastecerVeiculo();
                    break;

                // Devolver veiculo
                case 4:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    opercoesVeiculos.devolverVeiculo();
                    break;

                // Abastecer veiculo
                case 5:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    opercoesVeiculos.abastecerVeiculo();
                    break;

                // Consultar informações
                case 6:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    usarioLogin.consultarInformacoes();
                    break;

                // Buscar algum veículo
                case 7:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    buscarVeiculo();
                    break;

                // Exibir lista de clientes
                case 8:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    listaDeClientes();
                    settings.breakPrint();
                    settings.delayTimer(5000);
                    break;

                // Encerração de programa
                case 9:
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
        System.out.println("Qual veículo você deseja procurar em nossa loja?");
        String buscaVeiculo = sc.nextLine();

        boolean verificarVeiculo = veiculosTotais.contains(buscaVeiculo);

        if (verificarVeiculo == true) {
            System.out.println("Veiculo dispónivel na loja.");
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
}

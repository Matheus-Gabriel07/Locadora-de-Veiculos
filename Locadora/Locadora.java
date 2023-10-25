import java.util.*;

public class Locadora {
    Scanner sc = new Scanner(System.in);
    OpercoesVeiculos opercoesVeiculos = new Cliente(null, 0, null);
    Settings settings = new Configuration();
    OpercoesVeiculos opera;

    String[] listaClientes = {};
    ArrayList<Object> arrayListaCliente = new ArrayList<Object>(Arrays.asList(listaClientes));
    ArrayList<Object> veiculosTotais = new ArrayList<Object>(Arrays.asList());

    public void menuInical() {
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
                case 1:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    // Cadastro de veiculo
                    break;

                case 2:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    cadastroClientes();
                    // Cadastro de cliente
                    break;

                case 3:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);

                    // alugar veiculo
                    opercoesVeiculos.abastecerVeiculo();
                    break;

                case 4:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);

                    // devolver veiculo
                    opercoesVeiculos.devolverVeiculo();
                    break;

                case 5:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);

                    // abastecer veiculo
                    opercoesVeiculos.abastecerVeiculo();
                    break;

                case 6:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);

                    // consultar informações
                    opercoesVeiculos.consultarInformacoes();
                    break;

                case 7:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);

                    // Buscar veiculos
                    break;

                case 8:
                    settings.delayTimer(1500);
                    settings.spacePrint(2);
                    listaDeClientes();
                    settings.breakPrint();
                    settings.delayTimer(5000);

                    break;

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
        System.out.println("Digite o nome do alugador");
        String nome = sc.nextLine();
        settings.delayTimer(500);
        System.out.println("Digite a idade de " + nome);
        int idade = sc.nextInt();
        Cliente cliente = new Cliente(nome, idade, null);
        arrayListaCliente.add(cliente);
    }

    public void buscarVeiculo() {

    }

    public void listaDeClientes() {
        for (Object obj : arrayListaCliente) {
            System.out.println("> " + obj);
        }
    }

}

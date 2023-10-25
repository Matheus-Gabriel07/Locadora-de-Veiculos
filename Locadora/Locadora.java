import java.util.*;

public class Locadora {
    Scanner sc = new Scanner(System.in);
    OpercoesVeiculos opercoesVeiculos = new Cliente(null, 0, null);
    Settings settings = new Configuration();

    String[] listaClientes = {};
    ArrayList<Object> arrayListaCliente = new ArrayList<Object>(Arrays.asList(listaClientes));

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
        System.out.println("Cadatro de veiculos");
        settings.breakPrint();

        System.out.println("Digite o tipo de veiculos \n" +
                "1) Carro\n" +
                "2) Moto\n");
        int respotaOpcao = sc.nextInt();

        switch (respotaOpcao) {
            case 1:
                Carro carro = new Carro(null, null, respotaOpcao, respotaOpcao, respotaOpcao, respotaOpcao);
                break;

            case 2:
                Moto moto = new Moto(null, null, respotaOpcao, respotaOpcao, respotaOpcao, respotaOpcao, respotaOpcao);
                break;

            default:
                System.out.println("Opção inválida");
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

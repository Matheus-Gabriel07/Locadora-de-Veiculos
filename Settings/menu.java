package Settings;

import java.util.Scanner;

public class menu {
    public void menuInical() {
        Scanner sc = new Scanner(System.in);
        Settings settings = new Configuration();
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
                    // Cadastro de veiculo
                    break;

                case 2:
                    settings.delayTimer(1500);
                    // Cadastro de cliente
                    break;

                case 3:
                    settings.delayTimer(1500);
                    // alugar veiculo
                    break;

                case 4:
                    settings.delayTimer(1500);
                    // devolver veiculo
                    break;

                case 5:
                    settings.delayTimer(1500);
                    // abastecer veiculo
                    break;

                case 6:
                    settings.delayTimer(1500);
                    // consultar informações
                    break;

                case 7:
                    settings.delayTimer(1500);
                    // Buscar veiculos
                    break;

                case 8:
                    settings.delayTimer(1500);
                    // lista de clientes
                    break;

                case 9:
                    System.out.println("Obrigado por alugar conosco");
                    loopMenu = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (loopMenu);
        sc.close();
    }
}
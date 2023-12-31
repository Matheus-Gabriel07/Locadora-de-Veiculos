
/** Classe de configurações gerais
 * ------------------------
 * 
 * @version 1.2.1
 * @author Kaique
 * @author Matheus
*/

import java.util.*;

public interface Settings {
    public void delayTimer(int millis);
    public void spacePrint(int size);
    public void clearBuff(Scanner Scanner);
    public void breakPrint();
    public void login();
}

class Configuration implements Settings {
    public void delayTimer(int millis) {
        System.out.println("Carregando...");
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
    }

    public void spacePrint(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println();
        }
    }

    public void breakPrint() {
        System.out.println("--------------------------------");
    }

    public void clearBuff(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    private String passSecretsEsterEgg = "Gustavo-Molina17";
    
    public String getpassSecretsEsterEgg() {
        return passSecretsEsterEgg;
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao Roda Sobre Roda");
        delayTimer(750);
        spacePrint(10);
        System.out.println("Digite o nome de usuário:");
        String nome = sc.nextLine();
        System.out.println("Digite sua senha:");
        String senha = sc.nextLine();
        delayTimer(1000);
        spacePrint(10);

        if (nome.equals(getpassSecretsEsterEgg())) {
            System.out.println("Usuario inválido. Encerrando programa.");
            System.exit(0);
        } else {
            System.out.println("Seja bem-vindo " + nome);
            breakPrint();
            spacePrint(2);

            Locadora locadora = new Locadora();
            locadora.start(nome);
            senha.endsWith(senha);
        }
        sc.close();
    }
}

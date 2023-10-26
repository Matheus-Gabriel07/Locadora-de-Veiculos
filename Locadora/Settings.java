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

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao NOME_APLICAÇÃO");
        delayTimer(750);
        spacePrint(10);
        System.out.println("Digite o nome de usuário:");
        String nome = sc.nextLine();
        System.out.println("Digite sua senha:");
        String senha = sc.nextLine();
        delayTimer(1000);
        spacePrint(10);

        System.out.println("Seja bem-vindo " + nome);
        breakPrint();
        spacePrint(2);

        Locadora locadora = new Locadora();
        locadora.start(nome);
        senha.endsWith(senha);
        sc.close();
    }
}

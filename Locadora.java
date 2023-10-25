import java.util.Scanner;

class Locadora{
    Scanner sc = new Scanner(System.in);

    String cadastroMar;
    String cadastroMod;
    String cliente;
    String devolucao;
    int abastecimento;
    String consuInfo;

    public Locadora(String cadastroMar, String cadastroMod, String cliente, String devolucao, int abastecimento,String consuInfo){
        this.cadastroMar = cadastroMar;
        this.cadastroMod = cadastroMod;
        this.cliente = cliente;
        this.devolucao = devolucao;
        this.abastecimento = abastecimento;
        this.consuInfo = consuInfo;
    }

    public String cadatosVei(){
        System.out.println("Cadastre a marca do seu veículo: ");
        cadastroMar = sc.nextLine();

        System.out.println("\nCadastre o modelo do seu veículo: ");
        cadastroMod = sc.nextLine();
    }
    public String cliente(){
        System.out.println("Digite seu nome completo : ");
        cliente = sc.nextLine();

    }
    public String devolucao(){
        System.out.println("Que veículo gostaria de devolver: " );
        devolucao = sc.nextLine();

    }
    public String consuInfo(){
        System.out.println("\n"+"\t================Informações================");
        System.out.println("Nome do cliente:" + cliente);
        System.out.println("Marca do carro:" + cadastroMar);
        System.out.println("Modelo do carro:" + cadastroMod);
        System.out.println("\n"+"\t================================================");
        
    }
    public int abastecimento(){
        System.out.println("Quanto gostaria de abastecer? " + abastecimento);
    }
    
}

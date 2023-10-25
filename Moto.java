public class Moto {
    double km;
    double consumo;
    int cilindrada;

    public Moto (int cilindrada, double consumo, double km){
        this.consumo = consumo;
        this.km = km;
        this.cilindrada = cilindrada;
    }
    public void cilindrada(){
        System.out.println("Essa moto possui " + cilindrada + " cilindradas");
    }
    public
        double consumo(){
        double consumo = 0;
        consumo = km / conbustivel;
        return consumo;
    }
    public String toString(){
        return "Este veiculo tem " + cilindrada + " e teve o consumo de compustivel de em km" + consumo;
    }
     
}

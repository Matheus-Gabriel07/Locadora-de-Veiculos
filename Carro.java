class Carro extends Veiculo{
    int numPortas;
    double km;
    double consumo;

    public Carro (int numPortas, double consumo, double km) {
        this.numPortas = numPortas;
        this.consumo = consumo;
        this.km = km;
    }
    public void numPortas(){
        System.out.println("Número de portas: " + numPortas);
    }
    public double consumo(){
        double consumo = 0;
        consumo = km / conbustivel;
        return consumo;
    }
     public String toString(){
        return "Número de portas: " + numPortas + ", consumo: " + consumo + km + ", km: ";
    }

     
}

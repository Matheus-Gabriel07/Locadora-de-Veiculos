/**
 * Subclasse 'Moto' de Veiculos
 * ------------------------
 * 
 * @version 1.0
 * @author William
 * @author Matheus
 */

public class Moto extends Veiculo {
    private double km;
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, double combustivel, int cilindrada, double km) {
        super(marca, modelo, ano, combustivel);
        this.km = km;
        this.cilindrada = cilindrada;
    }

    /* Getters */

    public int getCilindrada() {
        return cilindrada;
    }

    public void setKm(double km) {
        this.km = km;
    }

    // Overrides
    @Override
    public double calcularConsumo() {
        double consumo = 0;
        consumo = km / combustivel;
        return consumo;
    }

    @Override
    public String toString() {
        return "Moto: " + getModelo() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Ano: " + getAno() + "\n" +
                "Cilindradas: " + getCilindrada() + "\n" +
                "Km/L: " + calcularConsumo() + "\n";
    }

    /* Métodos exclusivos da subclass */

}

/** Subclasse 'Carros' extendida de Veiculos
 *  --------------------------------
 * 
 *  @version 1.0
 *  @author Willian
 *  @author Matheus
 */

class Carro extends Veiculo {
    private int portas;
    private double km;

    public Carro(String marca, String modelo, int ano, double combustivel, int portas, double km) {
        super(marca, modelo, ano, combustivel);
        this.portas = portas;
        this.km = km;
    }

    /* Getters & Setters */

    public int getPortas() {
        return portas;
    }

    public double getKm() {
        return km;
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
        return "Carro: " + getModelo() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Ano: " + getAno() + "\n" +
                "Numero de portas: " + getPortas() + "\n" +
                "Combustivel: " + getCombustivel() + "\n" +
                "Km/L: " + calcularConsumo() + "\n";
    }
}
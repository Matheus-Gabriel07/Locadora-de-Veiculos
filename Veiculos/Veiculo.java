import java.util.ArrayList;
import java.util.Arrays;

/** Classe base de "Veiculo"
 *  --------------------------
 *  @version 1.0
 *  @author Matheus Gabriel
 */

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    double combustivel;

    public Veiculo(String marca, String modelo, int ano, double combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
    }

    /* Getters & Setters */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    /* Métodos gerais */

    // Default method
    public double calcularConsumo() {
        return getCombustivel() * 5;
    }
    
    // Default method
    public String toString() {
        return "Default";
    }

    //ArrayList de carros pre definidos
    String[] CarrosDefault = {getModelo()};
    ArrayList<String> ListaCarrosDefault = new ArrayList<String>(Arrays.asList(CarrosDefault));

    public void exibirListaCarrosDefault() {
        System.out.println(ListaCarrosDefault);
    }
}
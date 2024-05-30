package br.edu.fatec.mvcDemo.models;

public class LojaCarro {
    private String carro;
    private String marca;
    private float preco;

    public LojaCarro(String carro, String marca, float preco) {
        this.carro = carro;
        this.marca = marca;
        this.preco = preco;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}

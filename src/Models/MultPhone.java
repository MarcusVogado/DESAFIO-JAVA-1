package Models;

import Contracts.IAparelhoTelefonico;
import Contracts.INavegadorInternet;
import Contracts.IReprodutorMusical;

public class MultPhone extends SmartPhone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {

    public MultPhone(String model, int phoneNumber, int imei) {
        super(model, phoneNumber, imei);
    }

    @Override
    public void ligar() {
        System.out.println("O Iphone: " + this.model + " está ligando...");
    }

    @Override
    public void atender() {

        System.out.println("O Iphone: " + this.model + " está atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O Iphone: " + this.model + " está iniciando Correio de Voz...");
    }

    @Override
    public void tocar() {
        System.out.println("O Iphone: "+this.model+" está tocando a música...");
    }

    @Override
    public void pausar() {
       System.out.println("O Iphone: "+this.model+" está pausando a música...");
    }

    @Override
    public void selecionarMusica() {
      System.out.println("O Iphone: "+this.model+" está selecionando a música...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("O Iphone: "+this.model+" está exibindo a página...");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("O Iphone: "+this.model+" está adicionando a página...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("O Iphone: "+this.model+" está atualizando a página...");
    }
}

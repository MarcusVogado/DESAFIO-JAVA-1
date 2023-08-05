package Models;

import Contracts.IAparelhoTelefonico;

public class SimplePhone extends SmartPhone implements IAparelhoTelefonico {


    public SimplePhone(String model, int phoneNumber, int imei) {
        super(model, phoneNumber, imei);        
    }

    @Override
    public void ligar() {
        System.out.println("O Iphone: "+this.model+" está ligando...");
    }

    @Override
    public void atender() {
        System.out.println("O Iphone: "+this.model+" está atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O Iphone: " + this.model + " está iniciando Correio de Voz...");
    }
    
}

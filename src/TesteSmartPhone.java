import Models.MultPhone;
import Models.SimplePhone;

public class TesteSmartPhone {
    public static void main(String[] args) {
       
        
        SimplePhone iphoneXr = new SimplePhone("Iphone XR", 999999, 99855887);
        iphoneXr.ligar();      
        iphoneXr.atender();
        iphoneXr.iniciarCorreioVoz();
       
        System.out.println("FUNÇÕES MULT PHONE\n");

        MultPhone iphone14 = new MultPhone("Iphone 14", 99998777, 555588799);

        System.out.println("APARELHO TELEFONICO\n");
        iphone14.atender();
        iphone14.ligar();
        iphone14.iniciarCorreioVoz();

        System.out.println("REPRODUTOR MUSICAL\n");
        iphone14.tocar();
        iphone14.pausar();
        iphone14.selecionarMusica();

        System.out.println("NAVEGADOR INTERNET\n");
         iphone14.exibirPagina();
        iphone14.adicionarPagina();
        iphone14.atualizarPagina();
    }
}

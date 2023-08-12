package Interfaces;

public class Itunes implements ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Pausando música.");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}

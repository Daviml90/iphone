import Interfaces.Safari;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        Safari navegador = new Safari();

        navegador.atualizarPagina();

        iphone.tocar();
        iphone.atender();
        iphone.adicionarNovaAba();
    }
}

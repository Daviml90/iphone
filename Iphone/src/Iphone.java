import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorNaInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando pelo iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando pelo iPhone");    
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica pelo iPhone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página pelo iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Aba pelo iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página pelo iPhone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando pelo iPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atnedendo pelo iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz pelo iPhone");
    }
    
}

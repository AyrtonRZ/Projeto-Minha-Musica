package principal;
import model.Musica;
import model.Podcast;
import model.Preferidos;

public class Principal {
    public static void main(String[] args) {
        Musica musica01 = new Musica();
        musica01.setTitulo("Forever");
        musica01.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            musica01.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            musica01.curti();
        }

        Podcast podcast01 = new Podcast();
        podcast01.setTitulo("DevCast");
        podcast01.setHost("Ayrton Rodrigues");

        for (int i = 0; i < 500; i++) {
            podcast01.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            podcast01.curti();
        }

        Preferidos preferidos = new Preferidos();
        preferidos.inclui(podcast01);
        preferidos.inclui(musica01);

    }
}

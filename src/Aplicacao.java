import model.Audio;

public class Aplicacao {
    public static void main(String[] args) {
        Audio musica01 = new Audio();
        musica01.setTitulo("Album 01");
        System.out.println(musica01.getTitulo());
    }
}

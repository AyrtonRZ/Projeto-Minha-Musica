package model;

public class Preferidos {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " esta entre as melhores.");
        } else {
            System.out.println(audio.getTitulo() + " esta entre as boas.");
        }
    }
}
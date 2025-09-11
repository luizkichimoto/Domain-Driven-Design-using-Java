import java.time.LocalDate;

public class Jogo extends Conteudo {
    //Atributos/Propriedades/Campos
    String plataforma;

    @Override
    public String toString() {
        return "Jogo{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
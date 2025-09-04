import java.time.LocalDate;

public class Jogo{
    String título;
    String plataforma;
    LocalDate dataLancamento;

    @Override
    public String toString() {
        return "Jogo{" +
                "título='" + título + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}

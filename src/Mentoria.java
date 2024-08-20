import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;
    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    
}

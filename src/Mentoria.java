import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descrica;
    private LocalDate data;
    public Mentoria(String titulo, String descrica, LocalDate data) {
        this.titulo = titulo;
        this.descrica = descrica;
        this.data = data;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescrica() {
        return descrica;
    }
    public void setDescrica(String descrica) {
        this.descrica = descrica;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descrica=" + descrica + ", data=" + data + "]";
    }

    
}

public class Curso {
    private String titulo;
    private String descricao;
    private int horas;
    public Curso(String titulo, String descricao, int horas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.horas = horas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", horas=" + horas + "]";
    }

    

}

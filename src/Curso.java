public class Curso extends Conteudo{
    private int horas;
    public Curso(String titulo, String descricao, int horas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.horas = horas;
    }
    
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", horas=" + horas + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * horas;
    }
}

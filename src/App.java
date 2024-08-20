import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Conteudo curso = new Curso("Curso de Java", "Curso de java", 30);
        Conteudo mentoria = new Mentoria("Mentoria", "Mentoria", LocalDate.now());
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Bootcamp muito java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Pedro");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();

        Dev dev1 = new Dev();
        dev1.setNome("Joao");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println(dev.getConteudosInscritos());
        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev.calcularTotalXp());
        System.out.println(dev1.calcularTotalXp());
    }
}

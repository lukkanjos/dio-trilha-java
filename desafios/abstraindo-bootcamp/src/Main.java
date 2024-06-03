import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();

        cursoJava.setTitulo("Java");
        cursoJava.setDescricao("curso da DIO Java");
        cursoJava.setCargaHoraria(85);

        
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Mentoria do curso Java");
        mentoriaJava.setData(LocalDate.now());
        
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descricao bootcamp Java Developer");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoriaJava);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcampJava);

        System.out.println(devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("Conteudo concluido: " + devLucas.getConteudosConcluidos());
        System.out.println(devLucas.calcularTotalXp());

    }
}

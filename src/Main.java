import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Mentoria mentoria = new Mentoria();
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Desrição do curso");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        mentoria.setTitulo("Titulo da mentoria");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        System.out.println("========================================");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("Desrição do curso");
        curso2.setCargaHoraria(7);
        System.out.println(curso2);

    }
}

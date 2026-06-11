import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso("curso Java", "descrição curso Java", 8);
        Curso curso2 = new Curso("curso Js", "descrição curso Js", 4);

        Mentoria mentoria = new Mentoria("mentoria de Java", "descrição mentoria de Java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
    }
}
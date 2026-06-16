import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devYuri = new Dev();
        devYuri.setNome("Yuri");

        Dev devWinycius = new Dev();
        devWinycius.setNome("Winycius");

        devYuri.inscreverBootcamp(bootcamp);
        devWinycius.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos incritos de Yuri: " + devYuri.getConteudosInscritos());

        System.out.println("Conteúdos incritos de Winycius: " + devWinycius.getConteudosInscritos());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        devYuri.progredir();
        devYuri.progredir();

        devWinycius.progredir();
        devWinycius.progredir();
        devWinycius.progredir();

        System.out.println("Conteúdos concluidos de Yuri: " + devYuri.getConteudosConcluidos());
        System.out.println("Conteúdos concluidos de Winycius: " + devWinycius.getConteudosConcluidos());
        System.out.println("*-*-*");

        System.out.println("Conteúdos incritos de Yuri: " + devYuri.getConteudosInscritos());
        System.out.println("XP: " + devYuri.calcularXP());

        System.out.println("Conteúdos incritos de Winycius: " + devWinycius.getConteudosInscritos());
        System.out.println("XP: " + devWinycius.calcularXP());
    }
}
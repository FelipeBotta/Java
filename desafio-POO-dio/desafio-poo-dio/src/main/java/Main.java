import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Develporer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devLuis = new Dev();
        devLuis.setNome("Luis");
        devLuis.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Luis: " + devLuis.getConteudosInscritos());
        devLuis.progredir();
        devLuis.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos Luis: " + devLuis.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Luis: " + devLuis.getConteudosConcluidos());
        System.out.println("XP:" + devLuis.calcularTotalXp());

        System.out.println("----------------------");

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Felipe: " + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos Felipe: " + devFelipe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Felipe: " + devFelipe.getConteudosConcluidos());
        System.out.println("XP:" + devFelipe.calcularTotalXp());










    }
}

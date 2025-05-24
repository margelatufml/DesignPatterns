package Subiect02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IFunctionalitati curs=new Curs();
        curs=new AdaugareCertificate(curs);
        curs=new AdaugareQuizuri(curs);
        curs=new AdaugareVideo(curs);
        curs.ceSaAdaugat();
        for(String func:curs.adaugareFunctionalitate()){
            System.out.println(func);
        }

        // Testare Adapter
        List<Student> listaStudenti = List.of(
                new Student("Ana", 6, 75.0f),
                new Student("Bogdan", 4, 60.0f),
                new Student("Clara", 7, 45.0f),
                new Student("Dan", 8, 85.0f),
                new Student("Elena", 5, 55.0f)
        );

        System.out.println("Lista initiala de studenti:");
        for (Student stud : listaStudenti) {
            System.out.println(stud.toString());
        }

        IEvaluationSystem sistem = new Adapter();
        List<Student> studentiFiltrati = new ArrayList<>(sistem.analizaExternaStudenti(listaStudenti));

        System.out.println("\nStudenti filtrati de Adapter:");
        for (Student stud : studentiFiltrati) {
            System.out.println(stud.toString());
        }
    }
    }


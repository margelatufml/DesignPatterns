package Subiect02;

import java.util.ArrayList;
import java.util.List;

public class EvaluareExterna implements IEvaluationSystem {
    @Override
    public List<Student> analizaExternaStudenti(List<Student> listStudenti) {
        List<Student> listafiltrata = new ArrayList<>();
        for (Student student : listStudenti) {
            if (student.getMedieMatematicaAnuala() > 50) { // Sistem extern folosește scală 0-100
                listafiltrata.add(student);
            }
            System.out.println("DWADAWDWADWADWADWAD");
        }
        return listafiltrata;
    }
}

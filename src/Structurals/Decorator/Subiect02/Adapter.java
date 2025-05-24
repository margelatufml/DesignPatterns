package Subiect02;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends EvaluareInterna implements IEvaluationSystem {
    @Override
    public List<Student> analizaExternaStudenti(List<Student> listStudenti) {
        List<Student> convertedList = new ArrayList<>();
        for (Student student : listStudenti) {
            float convertedGrade = student.getMedieMatematicaAnuala() / 10;
            convertedList.add(new Student(student.getNume(), student.getMedieAnuala(), convertedGrade));
        }
        return analizaInternaStudenti(convertedList);
    }
}

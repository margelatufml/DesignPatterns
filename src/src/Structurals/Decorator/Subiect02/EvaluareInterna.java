package Structurals.Decorator.Subiect02;

import java.util.ArrayList;
import java.util.List;

public class EvaluareInterna implements IAnalizaInterna{

    @Override
    public List<Student> analizaInternaStudenti(List<Student> listStudenti) {
        List<Student> studentiAdminis=new ArrayList<>();
        for(Student  studL:listStudenti){
            if(studL.getMedieAnuala()>5){
                studentiAdminis.add(studL);
            }
        }
            return studentiAdminis;
    }
}

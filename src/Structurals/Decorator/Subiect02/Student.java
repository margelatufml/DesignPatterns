package Subiect02;

public class Student {
    private String nume;
    private Integer medieAnuala;
    private Float medieMatematicaAnuala;

    public Student(String nume, Integer medieAnuala,Float medieMatematica) {
        this.nume = nume;
        this.medieAnuala = medieAnuala;
        this.medieMatematicaAnuala=medieMatematica;
    }

    public String getNume() {
        return nume;
    }

    public Integer getMedieAnuala() {
        return medieAnuala;
    }

    public Float getMedieMatematicaAnuala() {
        return medieMatematicaAnuala;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", medieAnuala=" + medieAnuala +
                ", medieMatematicaAnuala=" + medieMatematicaAnuala +
                '}';
    }
}

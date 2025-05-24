package Structurals.Composite;

// compositwe permite tratarea uniforma a obiectelor individuale si a compozitiile de obiecte
// cuvinte cheie : arbore, nivel, ierarhie,
public class Main {
    public static void main(String[] args) {
       File file1=new File("file1",100);
       File file2=new File("file2",200);
       Director root=new Director("Root");
       Director director=new Director("Director");
       director.addComponent(file1);
       director.addComponent(file2);
       root.addComponent(director);
       System.out.println("Director size: "+director.getSize());
    }
}
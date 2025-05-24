package iterator;

public class Main {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator<String> iter = namesRepository.createIterator(); iter.hasNext();){
            String name = iter.next();
            System.out.println("Name : " + name);
        }
    }
}
package iterator;

public class NameRepository implements Aggregate<String> {
    private String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
} 
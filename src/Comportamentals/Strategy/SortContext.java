package Comportamentals.Strategy;

public class SortContext {
    private ISortStrategy strategy;

    public void setStrategy(ISortStrategy strategy){
        this.strategy=strategy;
    }
    public void sortArray(int[] array){
        strategy.sort(array);
    }
}

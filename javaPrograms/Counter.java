public class Counter {
    private int count;

    
    public Counter() {
        this.count = 0;
    }

    
    public Counter(int initialCount) {
        this.count = initialCount;
    }

   
    public void increment() {
        count++;
    }

    
    public void decrement() {
        count--;
    }

    
    public int getCount() {
        return count;
    }

    
    public void reset() {
        count = 0;
    }

    public static void main(String[] args) {
        
        Counter counter1 = new Counter(); 
        counter1.increment();
        counter1.increment();
        System.out.println("Counter1: " + counter1.getCount()); 

        Counter counter2 = new Counter(5); 
        counter2.decrement();
        System.out.println("Counter2: " + counter2.getCount()); 
    }
}

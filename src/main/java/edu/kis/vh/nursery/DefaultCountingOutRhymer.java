package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int empty = -1;
    private static final int capacity = 12;
    private static final int full = capacity-1;
    private final int[] numbers = new int[capacity];

    private int total = empty;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == empty;
        }
        
            public boolean isFull() {
                return total == full;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return empty;;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return empty;
                        return numbers[total--];
                    }

}

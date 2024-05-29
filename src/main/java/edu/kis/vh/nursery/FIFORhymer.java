package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public final defaultCountingOutRhymer rhymerCount = new defaultCountingOutRhymer();
    
    @Override
    public int countOut() {
        while (!callCheck())
            
        rhymerCount.countIn(super.countOut());
        
        int ret = rhymerCount.countOut();
        
        while (!rhymerCount.callCheck())
            
        countIn(rhymerCount.countOut());
        
        return ret;
    }
}

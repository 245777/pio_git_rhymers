package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final DefaultCountingOutRhymer rhymerCount = new DefaultCountingOutRhymer();
    
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

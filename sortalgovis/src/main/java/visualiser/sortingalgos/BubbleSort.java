package visualiser.sortingalgos;

import java.lang.reflect.Array;
import visualiser.Gui;

public class BubbleSort implements Sort {

    private long wait = 1;

    @Override
    public void runSort(Gui toSort) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < toSort.getArrayLength() - 1; i++) {
                if (toSort.getValue(i) > toSort.getValue(i+1)) {
                    toSort.swap(i, i+1, 500000000);
                    sorted = false;
                }
            }
        }        
    }

    @Override
    public void setWait(long wait) {
        // TODO Auto-generated method stub

    }

    @Override
    public long getWait() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.getClass().getName();
    }


    
}


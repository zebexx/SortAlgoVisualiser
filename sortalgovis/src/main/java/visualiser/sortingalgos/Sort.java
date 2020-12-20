package visualiser.sortingalgos;

import visualiser.Gui;

public interface Sort {
    public void runSort(Gui toSort);
    public void setWait(long wait);
    public long getWait();
    public String getName();
}

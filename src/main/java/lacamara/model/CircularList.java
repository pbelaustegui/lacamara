package lacamara.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: pablo
 * Date: 25/03/12
 * Time: 8:52
 * To change this template use File | Settings | File Templates.
 */
public class CircularList <T> implements Serializable{
    
    private List<T> list;
    private int actualIndex;

    public CircularList(List<T> list){
       this.list = list;
       actualIndex = 0;
    }
    
    public T getActual(){
        return list.get(actualIndex);
    }
    
    public T getNext(){
        return list.get(this.nextIndex());
    }
    
    public T getPrevious(){
        return list.get(this.previousIndex());
    }

    public void next(){
        actualIndex = this.nextIndex();
    }

    public void previous(){
        actualIndex = this.previousIndex();
    }

    private int previousIndex() {
        return actualIndex > 0 ? actualIndex - 1 : list.size() - 1;
    }

    private int nextIndex() {
        return (actualIndex + 1) % list.size();
    }
}

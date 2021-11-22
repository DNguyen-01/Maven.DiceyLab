import java.util.HashMap;
import java.util.Map;

public class Bins {

    private Map<Integer, Integer> holder;
    private int startValue, endValue;


    public Bins(int startValue, int endValue){

        this.holder = new HashMap<Integer, Integer>();
        //go thru the length between the startValue and endValue
        for(int i = startValue; i <= endValue; i++){
            //use holder to assign the key(i) and a default value of zero
            holder.put(i,0);
        }
        this.startValue = startValue;
        this.endValue = endValue;
    }

    public Integer getBin(int key){
        //getting the bin at that key
        //returning the value at that key location
        return holder.get(key);
    }

    public void incrementBin(int key){
            //if value at that key is not null
            if(holder.get(key) != null){
                //increment the value at that key by 1
                holder.put(key,holder.get(key)+1);
            }



    }

    public int getStartValue() {
        return startValue;
    }

    public int getEndValue() {
        return endValue;
    }



}

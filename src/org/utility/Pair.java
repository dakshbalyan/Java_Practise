package org.utility;

public class Pair<T1, T2, T3> {
    private T1 key;
    private T2 min;
    private T3 max;

    public Pair(T1 key, T2 min, T3 max){
        this.key = key;
        this.min = min;
        this.max = max;
    }

    public T1 getKey(){
        return key;
    }

    public T2 getMin(){
        return min;
    }

    public T3 getMax(){
        return max;
    }

    public void setKey(T1 key){
        this.key = key;
    }
    public void setMin(T2 min){
        this.min = min;
    }
    public void setMax(T3 min){
        this.max = max;
    }

    @Override
    public String toString(){
        return "{\nKey: "+key+" ; \nMin: "+min+
                " ; \nMax: "+max+"\n}";
    }
}

package com.teamkarbon.android.townofsalem;

/**
 * Created by joekawai on 12/8/15.
 */
public class Model {

    String name;
    int value; /* 0 -&gt; checkbox disable, 1 -&gt; checkbox enable */

    Model(String name, int value){
        this.name = name;
        this.value = value;
    }
    public String getName(){
        return this.name;
    }
    public int getValue(){
        return this.value;
    }
}

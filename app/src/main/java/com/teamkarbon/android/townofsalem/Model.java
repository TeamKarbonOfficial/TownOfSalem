package com.teamkarbon.android.townofsalem;

/**
 * Created by joekawai on 12/8/15.
 */
public class Model {

    String name;
    String des;
    int value; /* 0 -&gt; checkbox disable, 1 -&gt; checkbox enable */

    Model(String name, String des , int value){
        this.name = name;
        this.des = des;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public String getDes(){
        return this.des;
    }
    public int getValue(){
        return this.value;
    }
}

package com.impression11.example;

/**
 * Created by 70015131 on 24/11/2015.
 */
public class computer {

     private int cpuspeed;
     private int memory;

    public computer(){}

    public String getCpuspeed() {
        return (cpuspeed)+"Mhz";
    }

    public void setCpuspeed(int cpuspeed) {
        this.cpuspeed = cpuspeed;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}

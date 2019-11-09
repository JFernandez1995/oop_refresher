package com.company;

public class Person {

    String name;
    String personality;
    boolean isSitting;
    Robot isOwned;

    Person(String n, String p, boolean i){
        this.name = n;
       this.isSitting = i;
        this.personality =p;
    }

    void standUp(){
        this.isSitting = false;
    }

    void sitDown(){
        this.isSitting = true;
    }


}

package com.company;

public class Robot {

        String name;    //Robot's name
        String color;   //Robot's color
        int weight;     //Robots weight
        Robot isLooking; //when you want robots to look at each other

    Robot(String n, String c, int w){   //we use a default constructor to easily pass params when initializing
            this.name = n;  //'this.' is used to universally have attributes assigned to specific instantiations
            this.color = c;
            this.weight = w;

    }

    public void introduceName(){

        System.out.println( "Hello! my name is " + this.name);
    }


}
package com.company;

public class Main {


    public static void main(String args[]) {

        Robot r1 = new Robot("Tom","Red",30);
        Robot r2 = new Robot("Jerry","Blue",40);

        r1.introduceName();     //outputs "Hello! my name is Tom"
        r1.isLooking = r2;      //useful for following in social media applications

        Person p1 = new Person("Jessie","smart", true);
        Person p2 = new Person("Fernandez","nice", false);

        p1.isOwned = r2;       //r2 is assigned to p1
        p2.isOwned = r1;       //r1 is assigned to p2


        p1.isOwned.introduceName(); //introdue p1's robot
        p2.isOwned.introduceName(); //introduce p2's robot

        //LinkedListmanual initializations

        LinkedList l = new LinkedList();

        /*Node nodeA = new Node(7);
        Node nodeb = new Node(8);

        head1.next = nodeA;
        nodeA.next = nodeb;
        nodeb.next = null;*/
        //l.addHead( 6 );
        Node head1 = new Node(6);
        l.addToEnd( head1,7 );
        l.addToEnd( head1,8);
        l.addToEnd( head1,9);

        System.out.println( l.count(head1) );
        LinkedList.printAll( head1 );



    }
}

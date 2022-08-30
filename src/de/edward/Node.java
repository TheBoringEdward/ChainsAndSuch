package de.edward;

public class Node {

    private Node next;
    private Player content;

    Node(Player p){
        content = p;
        next = null;
    }

    Node(){
        content = null;
        next = null;
    }

    //Returns next Player of current Player
    public Node getNext(){
        return next;
    }

    //Sets next Player of current Player
    public void setNext(Node next) {
        this.next = next;
    }

    //Returns Player Content
    public Player getContent() {
        return content;
    }

    //Sets Player Content
    public void setContent(Player p) {
        this.content = p;
    }

    //Prints Player Content
    public void print(){
        content.print();
    }

    //Builds String from Player Content
    public String toString(){
        return content.toString();
    }

}

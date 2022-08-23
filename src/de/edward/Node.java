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

    public Node get_next(){
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Player getContent() {
        return content;
    }

    public void setContent(Player p) {
        this.content = p;
    }

    public void print(){
        content.print();
    }

    public String toString(){
        String a = content.toString();
        return a;
    }

}

package de.edward;

public class List {

    private Node head;
    List(){
        head = new Node();
    }

    public Player get_first(){
        return head.getContent();
    }

    //Returns last Node
    public Node get_tail(){
        Node n = head;
        while( n.getNext() != null ) {
            n = n.getNext();
        }
        return n;
    }

    //Returns last Player
    public Player get_last(){
        Node n = get_tail();
        return n.getContent(); //Why
    }

    //Sets next Player of current Player
    public void append(Player p){
        Node n = get_tail();
        Node n2 = new Node(p);
        n.setNext(n2);
        System.out.println("Player has been appended:  " + get_last());
    }

    //Prints out the entire List of Nodes/Players
    public void print(){
        Node n = head;
        while(n.getNext() != null){
            System.out.println("\n");
            n.print();
            n = n.getNext();
        }
    }

    //Builds String from the entire List of Nodes/Player
    public String toString() {
        StringBuilder a = new StringBuilder();
        Node n = head;
        if (n.getNext() != null){
            n = n.getNext();
        }
        while(n.getNext() != null){
            a.append("\n").append(n);
            n = n.getNext();
        }
        a.append("\n").append(n);
        return a.toString();
    }

    //Remove selected Node/Player
    public void remove(Player p) {
        Node n = head; //Current Player to be deleted
        Node pre_n = head; //Player/Node prior to n
        //Check if player even exists
        if (n.getContent() == p) {
            head = n.getNext();
        } else {
            n = n.getNext();
            while (n.getContent() != p && n.getNext() != null) {
                n = n.getNext();
                pre_n = pre_n.getNext();
            }
            if (n.getNext() != null) {
                pre_n.setNext(n.getNext());
                n.setContent(null);
            }
            //Else do nothing
        }
    }

    public void insert_after( Player p, Player predecessor ) {
        Node n = head;
        Node newPlayer = new Node(p);

        if (n.getContent() == predecessor) {
            newPlayer.setNext(n.getNext());
            n.setNext(newPlayer);
        } else {
            while (n.getContent() != predecessor && n.getNext() != null){
                n = n.getNext();
            }
            if (n.getNext() != null){
                newPlayer.setNext(n.getNext());
                n.setNext(newPlayer);
            }
            //Else do nothing
        }
    }

    public Boolean isEmpty(){
        return head == null;
    }

}

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
        while( n.get_next() != null ) {
            n = n.get_next();
        }
        return n;
    }

    //Returns last Player
    public Player get_last(){
        Node n = get_tail();
        return n.getContent(); //Why don't we just combine get_last with get_tail? wtf?
    }

    //Sets next Player of current Player
    public void append(Player p){
        Node n = get_tail();
        Node n2 = new Node(p);
        n.setNext(n2);
    }

    //Prints out the entire List of Nodes/Players
    public void print(){
        Node n = head;
        while(n.get_next() != null){
            System.out.println("\n");
            n.print();
            n = n.get_next();
        }
    }

    public String toString() {
        StringBuilder a = new StringBuilder();
        Node n = head;
        while(n.get_next() != null){
            a.append("\n").append(n.toString());
            n = n.get_next();
        }
        return a.toString();
    }

    public void remove(Player p){
        Node n = head;
        Node n2 = head;
        //Check if first is requested
        //Check if player even exists
        n = n.get_next();
        while(n.getContent() != p){ //add additional tests
            n = n.get_next();
            n2 = n2.get_next();
        } // TODO: Fix this crap
        //set next to be used here
        // n wird gelöscht
        // Nachfolger von n2 wird gesetzt auf den Nachfolger von n
        n.setContent(null);
    }

    /*
    public void insert_after( Player p, Player precessor )
    public Boolean isEmpty()
     */

}

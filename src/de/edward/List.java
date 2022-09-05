package de.edward;

public class List {

    private Node head;  //TODO: I am VERY sure we need to attach the head. Otherwise it will just remain decapitated.
                        //We'd need an indefinite amount of nodes... How do I deal with that?!?
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

    public Node get_second(){ //TODO: Okay, smth is really fucked up rn...
        Node n = head;
        n = n.getNext();
        n = n.getNext();
        return n;
    }

    public Node get_other_second(){
        Node n = head;
        Node n2 = head;
        n = n.getNext();
        while( n.getNext() != null ) {
            n = n.getNext();
        }
        return n2;
    }

    //Returns last Player
    public Player get_last(){
        Node n = get_tail();
        return n.getContent(); //Why
    }

    //Sets next Player of current Player
    public void append(Player p){
        Node n = get_tail(); //Something about these Nodes is really fucked up...
        Node n2 = new Node(p); // Why the fuck is a Node treated like a list?
        n.setNext(n2); //n just gets lost, not appended to any list
        System.out.println("Player has allegedly been appended. get_last: " + get_last() + " get_second: " +get_second() + " get_first: " + get_first()); //get_first doesn't work
    }

    /*
    TODO: So... Somehow Dr Wiele managed to forget that nodes created within methods only exist in said method, or I'm just dumb as fuck.
        Meaning: The list just straight up would never get created because the nodes that get created just cease to exist outside of their methods.
        We would need to create as many nodes as the user requests. How do we do that? Fuck do I know!
        PS. Everything makes no sense anymore...The more I study this code the less sense it makes.
        It's like drinking salt-water to quench one's thirst. The more you consume of it, the worse off you are.

    */

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
        while(n.getNext() != null){
            a.append("\n").append(n.toString());
            n = n.getNext();
        }
        return a.toString();
    }
    /*
    String a = "";
    while(n.getnext() != null){
        a = a + n.toString;
    }
    return a;
     */

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

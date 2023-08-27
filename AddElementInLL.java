import java.util.Scanner;

class AddElementInJava{

    static Node head;
    public static class Node{
        String data;
        Node next;
        Node (String data){
            this.data = data;
            this.next = next;
        }
    }

    public static void ll (String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

      
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        AddElementInJava list = new AddElementInJava();
        list.ll(data);
    }
}
import java.io.*;
import java.util.*;

class Main {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;
//Question: 1 AddLast in a Linked List:

    void addLast(int val) {
      Node nn = new Node();
      nn.data = val;
      nn.next = null;
      
      if(size == 0){
          head = tail = nn;
          
      }
      else{
         tail.next = nn;
         tail = nn;
      }
         size++;
    }
//Question: 2 Display And Size of a Linked List:

  public void size(){
    System.out.println(size);
  }
  public void display(){
    Node nn = new Node();
    for(nn = head; nn != null; nn = nn.next){
      System.out.println(nn.data + " ");
    }
    System.out.println();
  }

//Question: 3 remove first in Linked List:
  public void removeFirst(){
    Node nn = new Node();
    nn = head;
    head = head.next;
    nn.next = null;
    size--;
  }

  }
  
  public static void testList(LinkedList list) {
    // for (Node temp = list.head; temp != null; temp = temp.next) {
    //   System.out.println(temp.data);
    // }
    // System.out.println(list.size);

    // if (list.size > 0) {
    //   System.out.println(list.tail.data);
    // } 
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    LinkedList list = new LinkedList();

    String str = scn.nextLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      }
      if(str.startsWith("display")){
        list.display();
      }
      if(str.startsWith("size")){
        list.size();
      }
      if(str.startsWith("removeFirst")){
        list.removeFirst();
      }
      str = scn.nextLine();
    }

    testList(list);
  }
}
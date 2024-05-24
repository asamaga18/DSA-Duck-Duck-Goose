public class CLList {
 private Node head;
 
 static class Node {
   private Node next;
   private Object data;
 
   public Node(Object dataValue) {
     next = null;
     data = dataValue;
   }
 }
 
 public CLList() {
   head = null;
 }
 
 public Node getNext(Node n) { return n.next; }
 
 public Object getData(Node n) { return n.data; }
 
 public void InsertAtHead(Object info) {
   Node temp = new Node(info);
   Node iterator = head;
   temp.next = head;

   // Loop until last node
   while(iterator.next != head)
     {
       iterator = iterator.next;
     }
   head = temp;
   iterator.next = head;
 }
 
 public void InsertAtTail(Object info) {
   Node temp = new Node(info);
   if (head == null) {
     head = temp;
     head.next = head;
   } else {
     Node iterator = head;

     // Loop until last node
     while (iterator.next != head) { 
       iterator = iterator.next;
     }
     iterator.next = temp;
     temp.next = head;
   }
 }
 
 public void InsertItem(Node before, Object info) {
   Node temp = new Node(info);
   temp.next = before.next;
   before.next = temp;
 }
 

 public boolean DeleteNode(Object info) {
   Node temp = Find(info);
 
   if (temp == null) 
     return false;
 
   Node iterator = head;
 
   do {
     iterator = iterator.next;
   }while (iterator != head && iterator.next != temp);
 
   iterator.next = temp.next;
   
   if (temp == head)
     head = temp.next;
 
   return true;
 }
 
 public void PrintList() { 
   Node iterator = head;
   do {
     System.out.println(iterator.data);
     iterator = iterator.next;
   }while (iterator != head);
 }
 
 public Node Find(Object target) { 
   Node iterator = head;
   do{
     if (iterator.data == target)
       return iterator;
     iterator = iterator.next;
   } while (iterator != head);
   return null; 
 }

 public Node getFirst(){
    return head;
 }
     
}
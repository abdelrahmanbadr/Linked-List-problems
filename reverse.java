
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Mylist myObject = new Mylist();
    myObject.add(1,0);
    myObject.add(2,1);
   myObject.add(3,2);
    myObject.add(4,3);
    myObject.add(5,4);
   
    myObject.reverse();
    System.out.println(myObject.head.value);
    System.out.println(myObject.head.next.value);
    System.out.println(myObject.head.next.next.value);
    System.out.println(myObject.head.next.next.next.value);
    System.out.println(myObject.head.next.next.next.next.value);
  }
}


public class Node
{
  int value;
  Node next=null;
  
  public Node(int v)
  {
    this.value=v;
  }
  
}
public class Mylist
{
  
  Node head;
  
  public void add(int v,int index)
  {
    
    
    
    Node newnode=new Node(v);
     Node myref=head;
    
    if(index == 0)
    {
      newnode.next=head;
      head=newnode;
      
    }
    else
    {
    for(int counter=0;  counter<index-1; counter++)
    {
      myref=myref.next;
    }
    newnode.next=myref.next;
    myref.next=newnode;
    }
  
  }
  public void reverse ()
  {
  	Node ref,prev,curr,next,first_node;
    ref = head.next;
    prev =head;
    first_node = head;
    while(ref.next != null){
      curr =ref;
      ref = ref.next;
      next = curr.next;
      curr.next= prev;
      prev = curr;
      // System.out.println(curr.next.value);
    }
    head = ref;
    head.next = prev;
    first_node.next = null;
  }
  
}

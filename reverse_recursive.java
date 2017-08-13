
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Mylist myObject = new Mylist();
    myObject.add(20,0);
    myObject.add(30,1);
   myObject.add(40,2);
    myObject.add(50,3);
    myObject.add(60,4);
    
    myObject.reverse(myObject.getHead());
    myObject.print(myObject.getHead());
    
        
    

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
  
  public Node getHead()
  {
  	return head;
  }
  
  
 
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
  public void reverse(Node p){
    Node curr;
    if(p.next == null){
      head = p;
    	return;
    }
   
    this.reverse(p.next);
        curr = p.next;
    curr.next = p;
     // to make last node .next == null
    p.next = null;
    
   
   
  }
   public void print (Node head){
      if(head == null){
    	return;
    }
       
       System.out.println(head.value);
      this.print(head.next);
      
      
    }
  
  
  
}

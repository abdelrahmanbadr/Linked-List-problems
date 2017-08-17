//   L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
//   Given {1,2,3,4}, reorder it to {1,4,2,3}.
public class ReorderList
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
  //   myObject.add(6,5);
  //  myObject.add(7,6);
  // myObject.add(8,7);
  //  myObject.add(9,8);
 //   myObject.add(10,9);
  //  myObject.add(11,10);

   // System.out.println(myObject.halfReverse());
    myObject.halfReverse();
    myObject.doStuff();
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
  Node end;
  int count;
    public Node getHead()
  {
  	return head;
  }
public void print (Node head){
      if(head == null){
    	return;
    }
       
       System.out.println(head.value);
      this.print(head.next);
      
      
    }
    public int count(){
  Node myref=head;
    int i=1;
    while(myref.next !=null)
    {
      myref=myref.next;
      i++;
      
    }
    return i;
    
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
  public void halfReverse(){
    int count = this.count();
    this.count = count;
    int j = count /2;
   
    Node ref = head;
  
    while(j > 0){
    ref =ref.next;
      j --;
      
    }
    this.reverse(ref);
    
    
    
  }
  public void reverse(Node p){
    Node curr;
    if(p.next == null){
      this.end = p;
    	return;
    }
    this.reverse(p.next);
        curr = p.next;
        curr.next = p; 
  }
  public void doStuff(){
     Node start = this.head;
    Node end = this.end;
    Node next_st,next_end;
     int count = this.count;
    int i = count /2;
    int j=0;
      while(j < i){
      j++;
      next_st =start.next; 
      next_end = end.next;
      start.next = end;
      end.next = next_st;
      start = next_st;
      end = next_end;
    }
    start.next = null;
   
  
   
  }
  
  
  
}

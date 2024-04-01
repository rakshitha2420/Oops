package edu.atria.Oops.LinkedListDemo;
class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
	
}
class linkedlistdemo
{
	Node head,tail;
	
	public void insert(int data)
	{
		Node n=new Node(data);
		n.next=null;
	
	if(head==null)
	{
		head=n;
		tail=n;
}
	else
	{
		tail.next=n;
		tail=n;
	}
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
}

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
linkedlistdemo ln=new linkedlistdemo();
ln.insert(20);
ln.insert(30);
ln.insert(40);
ln.insert(50);

ln.display();
	}

}
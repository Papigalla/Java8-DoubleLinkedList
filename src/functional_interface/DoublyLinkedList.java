package functional_interface;
	import java.util.Scanner;

	public class DoublyLinkedList {
		class Node
		{
			int data;
			Node prevLink;
			Node nextLink;
		}
		private Node first;
		private Scanner sc=new Scanner(System.in);
		public void addFirst()
		{
			System.out.println("Please the element:");
			int ele=sc.nextInt();
			Node newNode=new Node();
			newNode.prevLink=null;
			newNode.nextLink=null;
			newNode.data=ele;
			if(first==null)
			{
				first=newNode;
			}
			else
			{
				newNode.nextLink=first;
				first.prevLink=newNode;
				first=newNode;
			}
		}
		public void addLast()
		{
			System.out.println("Please enter the element:");
			int ele=sc.nextInt();
			Node newNode=new Node();
			newNode.data=ele;
			newNode.prevLink=null;
			newNode.nextLink=null;
			if(first==null)
			{
				first=newNode;
			}
			else
			{
				Node temp=first;
				while(temp.nextLink!=null)
				{
					temp=temp.nextLink;
				}
				temp.nextLink=newNode;
				newNode.prevLink=temp;
			}
		}
		public void deleteFirst()
		{
			if(first==null)
			{
				System.out.println("No elements are there");
			}
			else if(first.nextLink==null)
			{
				System.out.println("Deleted element is"+first.data);
				first=null;
			}
			else
			{
				System.out.println("Deleted element is"+first.data);
				first=first.nextLink;
				first.prevLink=null;
			}
		}
		public void deleteLast()
		{
			if(first==null)
			{
				System.out.println("No element is there");
			}
			else if(first.nextLink==null)
			{
				System.out.println("Deleted element is"+first.data);
				first=null;
			}
			else
			{
				Node temp=first;
				while(temp.nextLink.nextLink!=null)
				{
					temp=temp.nextLink;
				}
				System.out.println("Deleted element is:"+temp.data);
				temp.nextLink=null;
			}
		}
		public void display()
		{
			if(first==null)
			{
				System.out.println("No elements are there");
			}
			/*else if(first.nextLink==null)
			{
				System.out.println("It has only one element:"+first.data);
			}*/
			else
			{
				Node temp=first;
				while(temp!=null)
				{
					System.out.println(temp.data);
					temp=temp.nextLink;
				}
			}
		}
		public void reverseDisplay()
		{
			if(first==null)
			{
				System.out.println("No elements are there");
			}
			else if(first.nextLink==null)
			{
				System.out.println("It has only one element:"+first.data);
			}
			else
			{
				Node temp=first;
				while(temp.nextLink!=null)
				{
					temp=temp.nextLink;
				}
				while(temp!=null)
				{
					System.out.println(temp.data);
					temp=temp.prevLink;
				}
			}
			
		}

	}

package functional_interface;
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			DoublyLinkedList dll=new DoublyLinkedList();
			while(true)
			{
				System.out.println("Press 1 to add element in first");
				System.out.println("Press 2 to add element in last");
				System.out.println("Press 3 to delete element in first");
				System.out.println("Press 4 to delete element in last");
				System.out.println("Press 5 to display elements in forward display");
				System.out.println("Press 6 to display elements in reverse display");
				System.out.println("Press any Key to Exit");
				System.out.println("-------------------------------------");
				System.out.println();
				System.out.println("Please enter the number:");
				int n=sc.nextInt();
				switch(n)
				{
				case 1: dll.addFirst();
				       break;
				case 2: dll.addLast();
				       break;
				case 3: dll.deleteFirst();
				       break;
				case 4: dll.deleteLast();
				       break;
				case 5: dll.display();
				       break;
				case 6: dll.reverseDisplay();
				       break;
				default:
					System.exit(0);
				}
			}
		}


}

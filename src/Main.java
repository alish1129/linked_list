import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of nodes you want");
		int num = input.nextInt();

		LinkedList list = new LinkedList();
		for (int i = 0; i < num; i++) {
			list.makeNode(i);
		}

		list.showList();
		ask(list);
		input.close();

	}

	public static void ask(LinkedList list) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"\nSelect an options: \n 1 to insert a node \n 2 to delete a node \n 3 to find the tail \n 4 Exit");
		int option = input.nextInt();

		options(list, option);
		input.close();
	}

	public static void options(LinkedList list, int option) {
		Scanner input = new Scanner(System.in);

		if (option == 1) {
			System.out.println("\nAfter what node would you like to insert your new node?");
			int afterNum = input.nextInt();

			System.out.println("\nEnter the data you want to enter:");
			int data = input.nextInt();

			Node at = list.findPosition(afterNum);
			list.insertAfter(at, data);

			list.showList();
			ask(list);

		} else if (option == 2) {
			System.out.println("\n what node would you like to delete?");
			int deleteNode = input.nextInt();

			Node at = list.findPosition(deleteNode);
			list.removeNode(at);

			list.showList();

			ask(list);

		} else if (option == 3) {
			Node node1 = list.findTail();
			System.out.println("The tail node is " + node1.data);
			ask(list);
			list.showList();

		} else {
			System.out.println("Thank you! Have a wonderful day!");
		}

		input.close();
	}

}

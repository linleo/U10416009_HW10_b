import java.util.Scanner;
import java.util.ArrayList;

public class TestBubbleSort
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> number = new ArrayList<>();
		//user input the total of items
		System.out.print("How many items you want to input ? ");
		int item = input.nextInt();
		System.out.print("Enter the sequence of numbers : ");
		//user input the sequence of numbers
		for (int i = 0; i < item; i++)
			number.add(input.nextInt());
		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubble(number);
	}
}

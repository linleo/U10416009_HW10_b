import java.util.ArrayList;

public class BubbleSort
{
	int pass, buf, i;
	
	BubbleSort() {}
	
	void bubble(ArrayList<Integer> number)
	{
		//print original order
		System.out.print("Data items in original order :");
		for (i = 0; i < number.size(); i++) 
		{
			System.out.print(" " + number.get(i));
		} 
		
		//do bubble sort			  
		for (pass = 1; pass < number.size(); pass++) 
		{                   														  
			for (i = 0; i < number.size() - pass; i++) 
			{                       
				if (number.get(i) > number.get(i+1)) 
				{                        
					buf = number.get(i);                                   
					number.set(i, number.get(i+1));                             
					number.set((i+1), buf);                               
				}                                     
			}                                 
		}
		
		//print ascending order
		System.out.print("\nData items in ascending order :");
		for (i = 0; i < number.size(); i++) 
		{
			System.out.print(" " + number.get(i));
		}
		
		////print descending order
		System.out.print("\nData items in descending order :");
		for (i = number.size() - 1; i > -1; i--) 
		{
			System.out.print(" " + number.get(i));
		}

	}
}

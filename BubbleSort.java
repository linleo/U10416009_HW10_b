import java.util.ArrayList;

public class BubbleSort
{
	int pass, buf, i;
	
	BubbleSort() {}
	
	void bubble(ArrayList<Integer> number)
	{
		System.out.print("Data items in original order :");
		for (i = 0; i < number.size(); i++) 
		{
			System.out.print(" " + number.get(i));
		} 
					  
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
		System.out.print("\nData items in ascending order :");
		for (i = 0; i < number.size(); i++) 
		{
			System.out.print(" " + number.get(i));
		}
	}
}

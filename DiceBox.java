import java.util.ArrayList;

public class DiceBox{
	public ArrayList<Dice> Dices;

	
	
	public void adddice (Dice d)
	{

		Dices.add(d);
	}
	public void shake()
	{
		for(int i=0; i<Dices.size(); i++)
		{
			Dices.get(i).roll();
			  
		}
	}
	public int gettotal(){
		int sum = 0;
		for(int i=0; i<Dices.size(); i++)
		{
			sum += Dices.get(i).getface();

		}
		return sum;
	} 


}
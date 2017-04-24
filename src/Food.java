
public class Food implements Chain{

private Chain nextInChain;
	
	
	public void setNextChain(Chain nextChain)
	{
		nextInChain = nextChain;
	}
	
	public void getPrice(UserProduct request)
	{
		if(request.getCategory() == "food")
		{
			System.out.println(request.getProduct() + request.item.price());
		}
		else 
			nextInChain.getPrice(request);
	}
}

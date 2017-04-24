
public class UserProduct {

public Items item;
private String category;
private String product;
	
	public UserProduct(String category,String i)
	{
		this.category = category;
		this.product = i;
		if(i == "bran bread")
		{
		  item = 	new BranBread();
		}
		if(i == "organic milk")
		{
			item = new OrganicMilk();
		}
		if(i == "white flour")
		{
			item = new WhiteFlour();
		}
		if(i == "shirt")
		{
			item = new Shirt();
		}
		if(i == "jeans")
		{
			item = new Jeans();
		}
		if(i == "trimmer")
		{
			item = new Trimmer();
		}
		if(i == "standiron")
		{
			item = new StandIron();
		}
	}
	
	public String getCategory()
	{
		return category;
	}
	public String getProduct()
	{
		return product ;
	}
}

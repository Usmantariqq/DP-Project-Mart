import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;


public class Test {

	public static void main(String[] args) throws IOException {
	
		System.out.println("*******************Welcome To Rainbow Mart****************");
		System.out.println("Enter 1 for Employee");
		System.out.println("Enter 2 for Customer");
		System.out.println("For single product price price 3");
		
		Scanner scan = new Scanner(System.in);
		InputStreamReader input = new InputStreamReader(System.in);
		 // ye chalra h kch :P  ajeeb sa ;p khair dkho :P ye kia f hai bhae itna bara o_O  ? :p  han bc ajeeb chota bnana tha
			BufferedReader reader = new BufferedReader(input);
		 int read = scan.nextInt();  //sai h jaon bhae?  han han karlega na ? ya skype aja mai apna kaam krleta hn and mu se bhonk eta hn ;P ? aja  s kype msla ni to
		 if(read == 3)// stop kesy krty ?stopped hai terminated likha wa h 
		 {
			 Chain chainfood = new Food();
			 Chain chainelectronic = new Electronic();
				Chain chaincloths = new Clothing();
				
			chainfood.setNextChain(chainelectronic);
			chainfood.setNextChain(chaincloths);
			//String a = reader.readLine();
			
		  	//String b = reader.readLine();
			 
			 UserProduct request = new UserProduct("clothings","shirt");
				
			chaincloths.getPrice(request);
		 }
		 if(read == 2)
		 {
			 System.out.println("Please Enter  1 for Organic Products Package ");
			 System.out.println("       Enter  2 for White Products Package   ");
			 
			 int a = scan.nextInt();
			 if(a == 1){
			 PackageBuilder pb = new PackageBuilder();
				Package organic = pb.getOrganicProducts();
				System.out.println("Organic Products");
				organic.showItems();
				
				System.out.println("ToTal "+ organic.getCost());
				}
			 else
			 {
				 PackageBuilder pb = new PackageBuilder();
					Package white = pb.getWhiteProducts();
					System.out.println("White Products");
					white.showItems();
					
					System.out.println("ToTal "+ white.getCost());
			 }
		 }
		 
		 
	}
}

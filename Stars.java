package raj;

class GeeksForGeeks 
{ 
    // Function to demonstrate printing pattern 
    public void printStars(int n) 
    { 
        int i, j; 
  
        for(i=0; i<n; i++) 
        {  
            for(j=0; j>=i; j++) 
            { 
            	 if(j<=i)
                 { 
                     System.out.print("* "); 
                 } 
                System.out.print(" "); 
            } 
   
         
            System.out.println(); 
        } 
    } 
}
public class Stars {

	public static void main(String[] args) {
		
	
		 GeeksForGeeks obj=new GeeksForGeeks();
	        obj.printStars(5); 
	}

}

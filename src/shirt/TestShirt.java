package shirt;

public class TestShirt {

	public static void main(String[] args) {
		Shirt shirt1 = new Shirt();  // Use the default constructor for one Shirt object 
		Shirt shirt2 = new Shirt(1,42);
		Shirt shirt3 = new Shirt(20,41);
		System.out.println(shirt1);    //printing the object to get the information
				
		//print the required information for each object by having a separate method in TestShirt() that uses the accessor (get) methods of Shirt
System.out.println( "Shirt Size : " + shirt2.getShirtCollarSize() + " Shirt Sleeve Length : " +shirt2.getShirtSleeveLength()+" Material Quality :"+ shirt2.getMaterial());

System.out.println( "Shirt Size : " + shirt3.getShirtCollarSize() + " Shirt Sleeve Length : " +shirt3.getShirtSleeveLength()+" Material Quality :"+ shirt3.getMaterial());
	}

}

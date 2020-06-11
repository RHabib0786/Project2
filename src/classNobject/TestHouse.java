package classNobject;

public class TestHouse {

	public static void main(String[] args) {
		// creating object
		
		House myhouse = new House();
		
		System.out.println(myhouse.address);
		myhouse.setHouseName(" S. WhiteHouse");
		System.out.println(myhouse.gettHouseName());
		
	    myhouse.livingRoom();
		myhouse.bedRoom();
		myhouse.kitchen();
		myhouse.office();
		
		
		
		
				
	}

}





		
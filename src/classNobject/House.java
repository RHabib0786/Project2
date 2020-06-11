package classNobject;

public class House {
	

//declare variables 	
  String housename;
  public House() {}
  int address= 200;
  
  
//declare constructor
  public House (int address ) {
	  this.address = address;
	  System.out.println(housename +address);
	  }
  
  
  public House (String houseName ) {
	  this.housename = houseName;
	  System.out.println(houseName);  
  }public House (String houseName ) {
	  this.housename = houseName;
	  System.out.println(houseName);  
  }
  
  public House (String houseName, int address ) {
	  this.housename = houseName;
	  this.address = address;
	  System.out.println(houseName);
  }
  


//implement methods
 	public void kitchen () {
 		System.out.println("we cook in our Kitchen");
		}
    public void livingRoom() {
    	System.out.println("we watch TV,hangout");
		}
	
	public void bedRoom() {
		System.out.println("We have 3 bed rooms");
		}
	public void office() {
		System.out.println("We have 2 offices");
		}
	public void housename() {
		System.out.println("housename: "+address+" new apartment" );
		}
	public void setHouseName(String housename) {
		this.housename = housename;
		}
    public String gettHouseName() {
    	return housename;
    	
    }
}
    
    	



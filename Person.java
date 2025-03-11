public class Person{

    private String name;
    private String role;
    private String Address address;

     public Person(String name, String role, Address address) {
        this.name = name;
        this.role = role;
        this.address=new address(address);
     }

 public void showPersonDetails(){
    System.out,println("Name:"+this.name+"; Role:"+this.role);
    address.showaddress();  
    }

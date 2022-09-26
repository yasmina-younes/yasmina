public class BuddyInfo { //Class BuddyInfo
    private String name; //field name
    private String address; //field address
    private String phone; //field phone
    public BuddyInfo(String name, String address, String phone){  //constructor
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public BuddyInfo(){ //constructor
        name = "Yasmina";
        phone = "6137203334";
        address = "80 Country Club";
    }
    public String getName() { //method
        return name;
    }
    public void setName(String name) { //method
        this.name = name;
    }

   /**
    *   public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Yasmina");
        BuddyInfo buddy2 = new BuddyInfo("Jad");
        System.out.println("Hello " + buddy1.getName());
    }
    */
}
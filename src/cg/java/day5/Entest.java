package cg.java.day5;

public class Entest {
public static void main(String[] args) {
	EncapsuDemo obj = new  EncapsuDemo();
	obj.setName("swathi");
	obj.setPhone(233443);
	obj.setAdhar(24435);
	
	System.out.println("name: "+obj.getName());
	System.out.println("phone: "+obj.getPhone());
	System.out.println("Adhar: "+obj.getAdhar());
	System.out.println("id: "+obj.getId());
}

}

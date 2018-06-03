package myprofile;

public class Test {
 public static void  printprofile(Iprofile profile)
 {
	 profile.myBasicInfo();
	 profile.myHobbies();
 }

public static void main(String[] args) {
	
	System.err.println("Iprofile myprofile");
	Iprofile myprofile  = new Myprofilename();
	Test.printprofile(myprofile);
}
	 
	 
 }


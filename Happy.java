package myprofile;

public class Happy {
	public static void  printprofile(Iprofile profile)
	 {
		 profile.myBasicInfo();
		 profile.myHobbies();
	 }

	public static void main(String[] args) {
		
		System.out.println("Iprofile myprofile");
		Iprofile myprofile  = new Myprofilename();
		Happy.printprofile(myprofile);
	}
		 

}

package launchGame;


 class AbcTest {
	 
	 
	
	
	
}
public class LaunchPrintStringObjAddress {

	public static void main(String[] args) {
		
		AbcTest at= new AbcTest();
		System.out.println(at);
		System.out.println(System.identityHashCode(at));
		
		String s1 = new String("abc");
		String s2="abc";
		String s3="abc";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		

	}

}

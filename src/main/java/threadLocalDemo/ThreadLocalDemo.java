package threadLocalDemo;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		
		ThreadLocal<String> tl1=new ThreadLocal<String>();
		tl1.set("Rawa");
		
		ThreadLocal<String> tl2=new ThreadLocal<String>();
		tl2.set("Bushra");
		
		ThreadLocal<String> tl3=new ThreadLocal<String>();
		tl3.set("Omer");
		
		ThreadLocal<Integer> tl4=new ThreadLocal<Integer>();
		tl4.set(12);
	
		System.out.println(tl1.get());
		
		tl1.remove();
		
		System.out.println(tl1.get());
		
		

	}

}

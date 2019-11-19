package org.dev.garbage_collection;

/*finalize() call only one in a system even though, you are calling System.gc(); method multiple times
 * */
public class FinalizeTest {
	static FinalizeTest s;
	public static void main(String[] args) {
		FinalizeTest ft=new FinalizeTest();
		System.out.println("FinalizeTest class instance: "+ft.hashCode());
		ft=null;
		System.gc();
		sleeping_now();
		
		System.out.println("FinalizeTest class static instance: "+s.hashCode());
		s=null;
		System.gc();
		sleeping_now();
		System.out.println("End of main");
	}
	int count=0;
	@Override
	protected void finalize() throws Throwable {
		count++;
		System.out.println("Calling Finalize: "+count);
		s=this;
	}
	public static void sleeping_now(){
		try{
			Thread.sleep(4000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

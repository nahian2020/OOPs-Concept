package abstractconcepts;

public abstract class Page {
	
	public Page() {
		System.out.println("Page Const.....");
	}
	public abstract void title();
	
	public abstract void url();
	
	public abstract void footerlink();
	public void logo() {
		System.out.println("Page -- logo");
	}


}

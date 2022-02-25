package EncapsulationConcepts;

public class Browser {

	public void launchBrowser() {
		System.out.println("Browser Launched");
		checkOSCompatible();
		checkBrowserVersion();
		enoughRAM();
		isBrowserUpgraded();
	}
	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}
	private void enoughRAM() {
		System.out.println("enoughRAM");
	}
	
	 private void isBrowserUpgraded() {
		System.out.println("isBrowserUpgraded");
	}
	
	
	
}

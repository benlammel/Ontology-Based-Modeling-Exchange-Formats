package ch.lammel.obm;

public class TestMain {

	public TestMain() {
		
		String test = "owl:Thing";
		
		String[] split = test.split(":");
		
		System.out.println(split[0]);

	}
	
	public void main(String[] args){
		new TestMain();
	}

}

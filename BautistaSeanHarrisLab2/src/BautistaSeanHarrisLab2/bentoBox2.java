package BautistaSeanHarrisLab2;

public class bentoBox2 extends bentoBox {
	private int numSection;
	private String sauce;
	private int riceAmount;
	
//inheritance	
	public bentoBox2(int height, int thicc, int lenght, String color, String contents, int numSection, String sauce, int riceAmount) {
		super(height, thicc, lenght, color, contents);
		this.numSection=numSection;
		this.sauce=sauce;
		this.riceAmount=riceAmount;

	}
	public int numSection() {
		return this.numSection;
	}
	public String sauce() {
		return this.sauce;
	}
	public int riceAmount() {
		return this.riceAmount;
	}
	

}

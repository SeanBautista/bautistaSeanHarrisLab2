package BautistaSeanHarrisLab2;

public class bentoBox {
	private int height;
	private int thicc;
	private int length;
	private String color;
	private String content;
	private int perimeter;
//setters	
 public bentoBox(int height, int thicc, int lenght, String color, String contents){
		this.height=height;
		this.thicc = thicc;
		this.length= lenght;
		this.color= color;
		this.content= contents;
	}
 //getters
	public int tall() {
		return this.height;
	}
	public int wid() {
		return this.thicc;
	}
	public int leng() {
		return this.length;
	}
	public String hue() {
		return this.color;
	}
	public String pood() {
		return this.content;
	}
	
	public void Dimensions() {
		
	}
	 public int Dimensions(int perimeter) {
		this.perimeter = this.height + this.thicc + this.length;
		perimeter = this.perimeter;
		return perimeter;
	}
	
	/*
	private int numSection;
	private String contents;
	private String sauce;
	private int riceAmount;
	//setter
	public bentoBox(int numSection, String contents, String sauce, int riceAmount) {
		this.contents= contents;
		this.numSection= numSection;
		this.sauce= sauce;
		this.riceAmount= riceAmount;
	}
	//getters
	public int numSection() {
		return this.numSection;
	}
	public String contents() {
		return this.contents;
	}
	public String sauce() {
		return this.sauce;
		
	}
	private int riceAmount() {
		return this.riceAmount;
	}
*/
	
}


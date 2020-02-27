package BautistaSeanHarrisLab2;

import BautistaSeanHarrisLab2.bentoBox;
import BautistaSeanHarrisLab2.bentoBox2;

public class test {

	public static void main(String[] args) {
//method overloading		
		bentoBox p1 = new bentoBox(7, 17, 23, "red", "chicken");
		bentoBox p2 = new bentoBox2(5, 12, 25, "lime", "adobo", 3, "teryaki", 3);
		
		System.out.println("bentobox # 1...");
		System.out.println("dimension of the bentobox: " + p1.tall() + " x " + p1.wid() + " x " + p1.leng());
		System.out.println("color of the bentobox is: " + p1.hue());
		System.out.println("content of the bentobox is: " + p1.pood());
		System.out.println("perimeter of the bentobox is: " + p1.Dimensions(0) + "cm");
		
		System.out.println("");
		
		System.out.println("lunchbox # 2...");
		System.out.println("dimension of the bentobox: " + p2.tall() + " x " + p2.wid() + " x " + p2.leng());
		System.out.println("color of the bentobox is: " + p2.hue());
		System.out.println("content of the bentobox is: " + p2.pood());
		System.out.println("number of section of your bento: " +  ((bentoBox2) p2).numSection());
		System.out.println("the sauce in your bentobox is: " + ((bentoBox2)p2).sauce());
		System.out.println("number of cups of rice :" + ((bentoBox2) p2).riceAmount() + " cups");
		System.out.println("perimeter of the bentobox is: " + p2.Dimensions(0) + "cm");
	}

}

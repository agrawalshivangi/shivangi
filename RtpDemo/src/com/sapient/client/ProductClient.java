package com.sapient.client;

import com.sapient.beans.Camera;
import com.sapient.beans.Computer;
import com.sapient.beans.Product;

public class ProductClient {

	public static void main(String[] args) {

		Product[] arr = new Product[4];
		arr[0] = new Computer(1001, "acer laptop", 59000, "intel pentium5");
		arr[1] = new Computer(1002, "dell laptop", 30000, "intel i7");
		arr[2] = new Camera(1003, "nikon", 6000, "14mpx");
		arr[3] = new Camera(1004, "canon", 10000, "20mpx");
		for (Product p : arr) {
			System.out.println(p.display() + " " + p.isExpensive());
		}
	}

}

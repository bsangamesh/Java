package com.RemoveSpace;

public class RemoveSpace {
	public static void main(String[] args) {
		String str = "This is a St     ri\t  \n  ng";
		
		String noSpaceString = str.replaceAll("\\s+", "");
		
		System.out.println(noSpaceString);
	}

}

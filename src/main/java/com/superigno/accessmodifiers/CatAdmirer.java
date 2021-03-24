package com.superigno.accessmodifiers;

public class CatAdmirer {

	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.namePublic);
		System.out.println(cat.hasFurProtected);
		System.out.println(cat.hasPawsDefault);
	//  System.out.println(cat.idPrivate); //error
	}
	
}

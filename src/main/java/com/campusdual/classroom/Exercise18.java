package com.campusdual.classroom;

import static com.campusdual.util.Utils.*;

public class Exercise18 {

	public static int[] createAndInitializeArray(int n){
		int[] arrayTemplate = new int[n];
		for(int i = 0; i < n; i++){
			arrayTemplate[i] = i + 1;
		}
		return arrayTemplate;
	}

	public static void  showInlineArray(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print((i != a.length - 1) ? a[i] + " " : a[i]);
		}
	}

	public static void main(String[] args) {
		System.out.print("Introduzca el número de elementos:\t");
		showInlineArray(createAndInitializeArray(integer()));
	}
}

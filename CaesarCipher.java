package com.jdc.caesarr_cipher;

import java.util.Scanner;

public class CaesarCipher {
	char[] arrayUpper = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
			'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	char[] arrayLower = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z' };
	String message;

	public static void main(String[] args) {

		CaesarCipher cc = new CaesarCipher();
		cc.showMessage("Caesar Cipher");
		System.out.println();
		System.out.println("1.Encrypt");
		System.out.println("2.Decrypt");
		System.out.println();
		Scanner input = new Scanner(System.in);
		int num;
		do {
			System.out.print("Enter : ");
			num = input.nextInt();
			if (num > 2 || num < 1) {
				System.out.println();
				System.out.println("The code you entered is wrong. Please enter again!");
				System.out.println();
				System.out.println("1.Encrypt");
				System.out.println("2.Decrypt");
				System.out.println();
			}
		} while (num > 2 || num < 1);

		input.nextLine();
		System.out.println();
		if (num == 1) {
			cc.encryptNumber();
		} else if (num == 2) {
			cc.decryptNumber();
		}
		input.close();
	}

	void showMessage(String message) {
		String star = "";
		for (int i = 0, l = message.length(); i < l; i++) {
			star += "*";

		}

		System.out.println("***".concat(star).concat("***"));
		System.out.println("** ".concat(message).concat(" **"));
		System.out.println("***".concat(star).concat("***"));

	}

	String getString(String message) {
		System.out.print(this.message);
		return System.console().readLine();
	}

	public void encryptNumber() {
		Scanner sc = new Scanner(System.in);
		int shift;
		do {
			System.out.print("Algorithm number [1 - 20]: ");
			shift = sc.nextInt();
			if (shift > 20 || shift < 1) {
				System.out.print("Please enter correct Algorithm number! ");
				System.out.println();
				System.out.print("Enter ");

			}
		} while (shift > 20 || shift < 1);
		sc.nextLine();
		System.out.println();
		System.out.print("Enter a word you want to encrypt: ");
		String word = sc.nextLine();
		sc.close();
		System.out.println();
		System.out.println("Your word is");
		showMessage(word);
		System.out.println();

		int length = word.length();
		String encrypt = "";		
		System.out.println("Encrypted word is ");
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c == ' ') {
				encrypt += ' ';
				continue;
			}

			for (int j = 0; j < arrayUpper.length; j++) {
				if (c == arrayUpper[j]) {
					encrypt += arrayUpper[(j + shift) % arrayUpper.length];
					break;
				}
			}

			for (int j = 0; j < arrayLower.length; j++) {
				if (c == arrayLower[j]) {
					encrypt += (arrayLower[(j + shift) % arrayLower.length]);
					break;
				}
			}
		}
		showMessage(encrypt);
		System.out.println();

	}

	public void decryptNumber() {
		Scanner sc = new Scanner(System.in);
		int shift;
		do {
			System.out.print("Algorithm number [1 - 20]: ");
			shift = sc.nextInt();
			if (shift > 20 || shift < 1) {
				System.out.print("Please enter correct Algorithm number! ");
				System.out.println();
				System.out.print("Enter ");
			}
		} while (shift > 20 || shift < 1);
		sc.nextLine();
		System.out.println();
		System.out.print("Enter a word you want to decrypt: ");
		String word = sc.nextLine();
		sc.close();
		System.out.println();
		System.out.println("Your word is");
		showMessage(word);
		System.out.println();

		int length = word.length();
		String decrypt = "";
		System.out.println("Decrypt word is");
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c == ' ') {
				decrypt += ' ';
				continue;
			}
			for (int j = 0; j < arrayUpper.length; j++) {
				if (c == arrayUpper[j]) {
					decrypt += (arrayUpper[(j - shift) % arrayUpper.length]);
					break;
				}
			}

			for (int j = 0; j < arrayLower.length; j++) {
				if (c == arrayLower[j]) {
					decrypt += (arrayLower[(j - shift) % arrayLower.length]);
					break;
				}
			}
		}
		showMessage(decrypt);
		System.out.println();

	}
}
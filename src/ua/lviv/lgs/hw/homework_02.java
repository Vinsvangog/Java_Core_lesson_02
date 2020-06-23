package ua.lviv.lgs.hw;

public class homework_02 {
	public static void main(String[] args) {
		
		//�������� 1. �������� �� ���� ����� ������� ���� ���������� ���� �����.
		
		int a = 124565;
		long l = 456325987654L;
		short s = 3200;
		byte b = 64;
		double d = 1985.659;
		float f = 144.56F;
		char ch = 'A';
		boolean bn = true;
		
		//�������� 2. ������� �� ������� �������� �� ����������� �������� ���� �����.
		//���� ����������� �� ��������� System.out.println(); �� Java Wrappers (�������� ��������).
		
		System.out.println("Maximum and minimum value of data types:\n");
		System.out.println("TYPE:\t\t" + "MIN" + "\t\t\tMAX");
		System.out.println("Byte:\t\t" + Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
		System.out.println("Short:\t\t" + Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
		System.out.println("Integer:\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
		System.out.println("Long:\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
		System.out.println("Double:\t\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE);
		System.out.println("Float:\t\t" + Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
		System.out.println("Character:\t" + (int) Character.MIN_VALUE + "\t\t\t" + (int) Character.MAX_VALUE);
		
		
		//�������� 3. �������� �����, ��������� ���� 10 ���������� ���� int,
		//������ ����������� �� �������� �������� � ����� �� ������� �� �� �������.
		
		int[] array = {32,17,65,47,94,29,143,139,12,71};
		int min = array[0];
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("\n\nThe minimum and maximum value in the array:");
		System.out.println("min = " + min + ", " + "max = " + max);
		
	}
}

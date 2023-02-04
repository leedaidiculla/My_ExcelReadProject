package myExcelRead;

import java.io.IOException;

public class MyExcelMain {

	public static void main(String[] args) throws IOException {
		String Value1=MyExcelCode.stringDataRead(1, 0);
		String Value2=MyExcelCode.stringDataRead(2, 0);
		
		String Value3=MyExcelCode.integerDataRead(1, 1);
		String Value4=MyExcelCode.integerDataRead(2, 1);
		System.out.println(Value1);
		System.out.println(Value2);
		System.out.println(Value3);
		System.out.println(Value4);
		
		
		
	}

}

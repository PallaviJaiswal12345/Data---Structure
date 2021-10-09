//Name: Pallavi Saroj Jaiswa1
//CWID: 10478910

package hw1_P_Jaiswal;

import java.util.Arrays;

public class BinaryNumber {

	private int data[];
    private boolean overflow;
    
    // Here the constructor stores binary number filled with 0's in data array for the given length.
	public BinaryNumber(int length) {
		if(length<=0) {
			System.out.println("Not a valid length");
		}
		else {
		data = new int [length];
		for(int k=0; k<length; k++) {
			this.data[k] = 0;
		}
		}
	}
	
	//Here the string in the input format is converted into numeric value and is stored in the data array.
	public BinaryNumber(String str) {
		char[] binary = new char[str.length()];
		data = new int [str.length()];
		for(int k=0; k<str.length();k++) {
			if(str.charAt(k)!= '0' && str.charAt(k)!= '1') {
				System.out.println("Not a valid string");
				break;
			}
			else {
			binary[k]= str.charAt(k);
			data[k]= Character.getNumericValue(binary[k]);
			}
			
		}
	}
	
	//This function is used to get the length of the data array.
	public int getLength()
	{
		return data.length;
	}
	
	//In this function, the length of the data array is checked and if it is out of bound, message is printed or else the digit in the given index is returned.
	public int getDigit(int index) {
	
		if(index < 0 || index >= data.length) {
			System.out.print("Array Index out of bound ");
			return index;
		}
		else {
			
			    int value = data[index];
				 	return value;
			 }
		
	}
	
// In this function another array is taken for the reallocation of data array and space is been created to add new elements
//and the nested for loop is used to rotate the array by the given amount.
	public void shiftR(int amount) {
	int newArray[] = Arrays.copyOf(data, amount + data.length);
	int temp, lastval;
	for(int j = 0; j < amount; j++) {
		lastval = newArray[newArray.length-1];
		for(int k = 0; k < newArray.length; k++) {
			temp = newArray[k];
			newArray[k] = lastval;
			lastval = temp;
			
		}
	}
	data = newArray;
	System.out.println(Arrays.toString(data));
	}
	

	//In this function two binary numbers are getting added. Before adding the two binary numbers, it checks if they are of same length.
	//If not, it prints the message else it will add the two numbers and stores the result in data array.
	public void add(BinaryNumber aBinaryNumber) {
		int c = 0;
		if(data.length != aBinaryNumber.data.length) {
			System.out.println("Length not equal");
		}
		else {
			for(int k = 0; k<data.length; k++) {
				int total = data[k]+aBinaryNumber.data[k]+c;
				if(total==1) {
					data[k] = total;
					c = 0;
					overflow = false;
				}
				else if (total==2) {
					data[k]=0;
					c = 1;
					overflow = true;
				}
				else if (total==3) {
					data[k]=1;
					c=1;
					overflow = true;
				}
				else {
					data[k] = total+c;
				}
			}
		}
	}
	
	//In this function, binary number is transformed into String. While adding  the binary numbers,
	//if the overflow condition is reached; the overflow string will be printed as overflow is true or will return the data array
	public String toString() {
     if(overflow == true) {
	     return "Overflow";
       }
     else {
			String tostring = "";
			for(int k:data) {
			tostring = tostring + k +' ';
			}

			return tostring;
     }
	
	}
	//In this function, the binary value stored in the data array is converted into decimal number.
	public int toDecimal() {
		int decimal = 0;
		for(int k = data.length - 1; k>=0; k--) {
			decimal+= (int)(data[k]*Math.pow(2, k));
		}
		return decimal;
	}
	//This function clears the boolean value in the overflow flag.
	public void clearOverflow() {
		overflow = false;
	}
	
	
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryNumber obj =new  BinaryNumber("10010");
//		for(int k=0; k<5; k++) {
//		System.out.println(obj.data[k]);
//	}
		
//		BinaryNumber obj1 =new  BinaryNumber("10110");
//		BinaryNumber obj2 = new BinaryNumber("11100");
//		System.out.println(obj1);
//		for(int k=0; k<5; k++) {
//			System.out.println(obj1.data[k]);
//		}
//		System.out.println(obj1.getLength());
//		System.out.println(obj1.getDigit(6));
//		
//		System.out.println(obj1.toString());
//		System.out.println(obj1.toDecimal());
//		obj1.clearOverflow();
//		obj1.add(obj2);
//		System.out.println(obj1);
//		obj1.shiftR(4);	
		
		
		
		
		

		
		
//}
}

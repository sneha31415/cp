// A = 1, B = 2 .....  Z= 26,  AA = 27 AB = 28 
import java.lang.Math;

public class Main
{
    public static int getvalue(String s){
        int value = 0;
        for(int i = 0; i<s.length(); i++){
            value += ( s.charAt(i)-64 ) *  Math.pow(26, s.length()-i-1); 
        }
        return value;
    }
	public static void main(String[] args) {
		System.out.println(getvalue("ZD"));
	}
}

//System.out.println(duasdim [0] [0]);//Impressão das dimensões pelas posições
import java.util.Arrays;

public class ArrayDuasDimensoes{
	public static void main(String [] args){
		String [] [] duasdim = {{"Carlos","M", "SP"}, {"Lidiana", "F", "SP"}};//Duas dimensões separadas por chaves.
		for(int i = 0; i < duasdim.length; i++){
			System.out.println(Arrays.toString(duasdim[i]));
		}
	}
}

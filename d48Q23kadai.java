//s23011
//breakの下に書くと、breakまで行かないからcontinueの上に書く。

public class d48Q23kadai {
	public static void main(String[] args) {
		int i = 1;
			for(;;){
					i = i + 3;
					if(i < 10) {
						System.out.println(i);
						continue;
					} else {
						break;
					} 
			}				
	}
}

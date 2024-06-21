import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04_FileInputStream {
	
	public static void main(String[] args) {
		
		try {
			
			// 파일로부터 데이터가 들어오는 통로를 생성
			FileInputStream in = new FileInputStream("myfiles/test.txt");
			
			
			
			//데이터를 1byte씩 읽는다. 더 이상 읽을 것이 없으면 -1을 리턴한다.
//			System.out.println((char)in.read());
//			System.out.println((char)in.read());
//			System.out.println((char)in.read());
//			System.out.println((char)in.read());
//			System.out.println(in.read());
//			System.out.println(in.read());
//			System.out.println(in.read());
			// 여기서도 볼 수 있음. 그대로 출력해줌 
			
			
			//이렇게 while을 쓰는 이유: 몇번째의 바이트에 몇번째 문자가 담겼는지 보기위함
			//1byte씩 읽는 경우 2byte이상 차지하는 문자는 깨질 수 있다
//			int i = 0;
//			while (true) {
//				int b = in.read();
//				
//				
//				if (b == -1) {
//					break;
//				} else {
//					System.out.printf("%d번째 byte: %d(%c)\n", i++, b, b);
//				}
//			}
			
			//모든 데이터를 한번에 읽어버린다	
			byte[] allBytes = in.readAllBytes();
			
			
			//String 클래스에는 byte[]를 문자열로 조립해주는 생성자가 존재한다
			System.out.println(new String(allBytes));			
			
			//한글도 안깨지고 출력 가능해짐
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Byte단위로 일고 쓰는 것은 데이터를 직접 나눠서 저장해야 하고,\n읽을때는 직접 합쳐야하기 때문에 굉장히 불편하다");
	}

}
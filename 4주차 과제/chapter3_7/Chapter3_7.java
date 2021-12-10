
public class Chapter3_7 {
	public static void main(String[] args) throws Exception {
		for (int i = 1; i <= 99; i++) {
			int Fir = i / 10;
			int Sec = i % 10;

			if (Fir == 0 && Sec % 3 == 0) {
				System.out.println(i + " 박수 한번");
			} else if (Fir % 3 != 0 && Sec % 3 == 0) {
				if (Fir % 3 != 0 && Sec != 0) {
					System.out.println(i + " 박수 한번");
				}
			} else if (Fir % 3 == 0 && Sec == 0) {
				System.out.println(i + " 박수 한번");
			} else if (Fir % 3 == 0 && Sec % 3 == 0) {
				System.out.println(i + " 박수 두번");
			}
		}
	}
}

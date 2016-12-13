import java.util.Scanner;

public class LunarYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				System.out.println(year + "년은 평년입니다");
			}
			else 
			{
				System.out.println(year + "년은 윤년입니다");
				 System.exit(year); 
			}
			
			if(year % 400 == 0)
			{
				System.out.println(year + "년은 융년입니다");
				System.exit(year); 
			}
			else 
			{
				System.out.println(year + "년은 윤년입니다");
				System.exit(year); 
			}
		} 
		else{
			System.out.println(year + "년은 평년입니다");
		}
		sc.close();
	}

}

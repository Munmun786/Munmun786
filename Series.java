import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
int x=input.nextInt();
int j=1;
for(int i=1;i<=x;i++){
	System.out.print(j);
	System.out.print(",");
	j=j+2;

}
input.close();
	}

}

import java.util.Scanner;
//���� for��
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		//1. N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 
		 for(int i=1; i<10; i++) {
			 System.out.println(N+ "*"+ i + "=" + N*i);
		 }
		 
		 //2. �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
			int len = scan.nextInt();
			
			for(int i = 0; i < len; i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println(a+b);
			}
		 
		
		  //3. n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		  int n=100;
		  
		  int y=0;
		  for( int i =1 ; i<=n; i++) {
			  y= y+i;
		  }
		  System.out.println( y );
	  
		  
		  //9.ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		  Scanner scan = new Scanner(System.in);
		  int N = scan.nextInt();
		  
		  for (int i=1; i<=N ; i++) {
			  for ( int j=1; j<=i; j++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		  
		  //10.ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		  Scanner scan = new Scanner(System.in);
		  int N = scan.nextInt();
		  
		  for (int i=1; i<=N; i++) {
			  
			  //i�� 1�϶� N-i��ŭ�� ���� , i��ŭ�� ��
			  for ( int j=1; j<=N-i; j++) {  
			      System.out.print(" ");
			  }
			  for(int j=1; j<=i; j++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
*/			
		
		
		//���� https://www.acmicpc.net/step/9
		//1. ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr= new int[N]; 
		
		for(int i=0; i<N ; i++) {
			arr[i]= scan.nextInt();
		}
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		

		
		int temp;
		
		for(int i= arr.length; i>0; i-- ) {
			for(int j=0; j<i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] =temp;
				}
			}
		}
		
		//������ ����
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}

	}
	
	public class Fibonacci {
		 
	    public static void main(String[] args) {
	        
	        int a1 = 1;
	        int a2 = 1;
	        int a3;
	        
	        System.out.println(a1);
	        System.out.println(a2);
	        
	        for(int i=1; i<=8; i++){
	            a3=a1+a2;
	            System.out.println(a3);
	            a1=a2;
	            a2=a3;
	        }        
	    }
	    int sumResult=0;
	    int sum(int n) {
	    	while(n>=0) {
	    		sumResult+=n--;
	    	}
	    	return sumResult;
	    }
	}


	��ó: https://hunit.tistory.com/228 [HunIT Blog]

}

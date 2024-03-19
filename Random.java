import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=1;
        int end=100;
        int k;
        do{
            System.out.println("enter a number b/w 1 to 100");
            int n=sc.nextInt();

            while(start<=end){
                int mid=(start+end)/2;
                System.out.println(mid+" is it a number type y/n");
                char c=sc.next().charAt(0);
                if(c=='y'){
                    System.out.println("hooray");
                    break;
                }else if(c=='n'){
                    System.out.println("higher or lower type h/l");
                    char g=sc.next().charAt(0);
                    if(g=='h'){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }else{
                    System.out.println("invalid input");
                }

            }
            System.out.println("type 1 to play again");
            k=sc.nextInt();
        }while(k==1);
    }
}

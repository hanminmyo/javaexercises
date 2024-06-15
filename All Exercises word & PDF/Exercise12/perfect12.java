import java.util.Scanner;
public class TestMultipleFiveSeven {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer");
        int a = scanner.nextInt();

        if (a%5==0 & a%7 ==0) {
            System.out.println(a + " "+ "is a multiple of both 5 and 7");
        }
        else if  (a%5!=0 & a%7!= 0){
            System.out.println(a + " "+ "is not a multiple of both 5 and 7");
        }
        else if (a%5==0 & a%7!=0){
            System.out.println(a+ " "+"is only multiple of 5");
        }
        else if (a%7==0 & a%5 !=0){ 
            System.out.println(a+ " "+"is only multiple of 7");
        }
    
    }
}
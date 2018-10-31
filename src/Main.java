import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        //01
//        int week =scn.nextInt();
//        switch (week){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Friday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
        //02
//        String str =scn.next();
//        switch (str){
//            case "Spring":
//                System.out.println("1~4月");
//                break;
//            case "Summer":
//                System.out.println("5~7月");
//                break;
//            case "Fall":
//                System.out.println("8~10");
//                break;
//            case "Winter":
//                System.out.println("11~12月");
//                break;
        //03
//        int a=scn.nextInt(),b=scn.nextInt(),c=scn.nextInt();
//        for (int i=a;i<=b;i++){
//            if (i%c==0){
//                System.out.println(i);
//            }
//        }
        //04
        int n=scn.nextInt(),k=n/2;
        boolean flag =true;
        for (int i=2;i<=k;i++){
            if (n%i==0){//不是質數
                flag=false;
            }
        }
        if (flag==true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        //05
//        int n =scn.nextInt();
//        float max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
//        for (int i =1;i<=n;i++){
//            float f=scn.nextFloat();
//            if (f>max){
//                max=f;
//            }
//            if (f<min){
//                min=f;
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
        //06
//        int n =scn.nextInt(),sum=0,a=0;
//        for (int i =1;i<=n;i++){
//            int z=scn.nextInt();
//            sum+=z;
//            a=sum/i;
//        }
//        System.out.println(sum);
//        System.out.println(a);
        //07
//        int n=scn.nextInt(),k=scn.nextInt(),sum=0;
//        for (int i =1;i<=n;i++){
//            int j=scn.nextInt();
//            if (j>=k){
//               sum++;
//            }
//        }
//        System.out.println(sum);
    }
}

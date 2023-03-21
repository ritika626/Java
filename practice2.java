import java.util.Scanner;

// class Bitwise {
//        public static void main(String args[]){
//              Scanner s=new Scanner(System.in);
//              int a=10,b=20,x=-20;
//              int c= a&b;
//              System.out.print(c + "c");
//              System.out.print((a|b) + " or"); 
//              System.out.print(a^b);
//              System.out.print(~(a+b));
//              System.out.print(a^x);
//        }
// }

// class operator{
//     public static void main(String args[]){
//         int x=10;int y=20;
//         if(x++ >10 && ++y >20){
//             System.out.print("inside if");
//         }
//         else{
//             System.out.print("inside else if");
//         }
//         System.out.print(x + "" + y);
//     }

//     public static void main(String args[]){
//         int x=10;int y=20;
//         if(x++ >10 || ++y >20){
//             System.out.print("inside if");
//         }
//         else{
//             System.out.print("inside else if");
//         }
//         System.out.print(x + "" + y);
//     }
// }

class presedence{
    public static void main(String args[]){
        int a=10;
        a+=++a-5/3+6*a;
        System.out.print(a);
    }
}
// code rns in binary form i.e 0,1 .... so 0 and 1 are bits 
// 8bits=>1byte
// integer has 4byte storage so basically 32bits
// short => 2bytes
// long => 8bytes
// double =>8bytes (for decimals)
// float =>4bytes (written as 10.5f)

// Normal print Hello world also println prints in new line
class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hi welcome");
        System.out.print("on a new line");
    }
}

// AddTwoNumbers
class AddTwoNumbers{

    public static void main(String[] args){
        int a,b,c;
        a=10;
        b=12;
        c=a+b;
        System.out.println(c);
    }
}
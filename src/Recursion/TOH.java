package Recursion;

public class TOH {
    static  int count=0;
    public static void toh(int n, char a, char b, char c){
        if(n>=1){

            toh(n-1, a, c, b);
            System.out.println("Move "+n+" from "+a+" to "+c);
            count++;
            toh(n-1, b, a, c);
        }
    }

    public static void steps(){
        System.out.println("Total Steps: "+count);
    }


    public static void main(String[] args) {
        toh(4, 'A', 'B', 'C');
        steps();
    }
}

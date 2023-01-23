package Recursion;

// GCD Highest Common Factor
class GCDAlgo{
    public int iterativeGcd(int a, int b){
        while (b>0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }

    public int recursiveGcd(int a, int b){
        if(b==0)
            return a;
        return recursiveGcd(b, a%b);
    }

    public int myOwnLogic(int a, int b){
        int small, hcf=0;
        if (a<b)
            small=a;
        else
            small=b;

        for(int i =2; i<=small; i++){
            if (a%i==0 && b%i==0)
                hcf=i;
        }
        return hcf;
    }

}

public class GCD {
    public static void main(String[] args) {
        GCDAlgo g1 = new GCDAlgo();
        System.out.println("Using Iteration: " + g1.iterativeGcd(10, 15));
        System.out.println("Using Recursion: " + g1.recursiveGcd(10, 15));
        System.out.println("Using My own method: " + g1.myOwnLogic(10, 15));
    }
}

 public class power {
    public static int calcpower(int x,int n) {
        if (n == 0){
            return 1;  
        }
        if (x == 0){
            return 0;
        }
        int power1 = calcpower(x,n-1);
        int power2 = x*power1;
        return power2;
    }


    public static void main(String[]args){
        int x = 2;
        int n = 5;
        int  ans = calcpower(x,n);  
        System.out.print(ans);
    } 
    
}

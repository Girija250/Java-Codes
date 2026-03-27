public class happynum {
    public boolean ishappy(int n) {
        while (n!=1 && n!=4) {
            int sum = 0;
            while (n>0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
    public static void main(String[] args){
        happynum obj = new happynum();
        int n = 19;
        
        if (obj.ishappy(n)) {
            System.out.println(n + " is a Happy Number");
        } else {
            System.out.println(n + " is not  Happy Number");
        }

    }
    
}

class Solution {
    public int tribonacci(int n) {
    
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        
        int a = 0, b = 0, c = 1;
        int next = 0;
        
        for(int i = 0; i < n - 1; i++) {
            next = a + b + c;
            a = b;
            b = c;
            c = next;
        }
        
        return c;
    }
}
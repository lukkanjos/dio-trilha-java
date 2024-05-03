public class ExemploBreakContinue{
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num ++) {
            if (num == 3)    
                continue;
            
                if (num == 10) 
                break;

            System.out.println(num);
        }
    }
}
public class Ex6 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 20) {
            System.out.println(num);
            num += 1;
        }

        for(num = 0; num <= 20;num++) {
            if (num <= 19) {
                System.out.print(num + ",");  
            } else {
                System.out.print(num);
            }
            
        }
    }
}

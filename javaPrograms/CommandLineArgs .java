public class RepeatNumber {
    public static void main(String[] args) {
        
        int defaultLength = 5;

        
        if (args.length < 1) {
            System.out.println("Please provide a number as the first argument.");
            return;
        }

        
        int num;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("The first argument must be an integer.");
            return;
        }

        
        int length = defaultLength; 
        if (args.length >= 2) {
            try {
                length = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("The second argument must be an integer.");
                return;
            }
        }

        
        for (int i = 0; i < length; i++) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}

import java.util.Scanner;

class StockExchange {
    public static void main(String args[]) {
        System.out.println("Stock Exchange Online");
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a new order or type 'bye' to Exit: ");
            String line = input.nextLine();

            if ("bye".equalsIgnoreCase(line)) {
                break;
            }
            
            System.out.println("Order received: " + line);
        }

        input.close();
        System.out.println("Exiting Stock Exchange");
    }
}
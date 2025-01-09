import java.util.Scanner;

public class movieTicketing{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //movie list
        System.out.println("Welcome to the Movie Ticketing System");
        System.out.println("Please select a movie to watch:");
        System.out.println("1. The Lion King");
        System.out.println("2. The Avengers");
        System.out.println("3. The Incredibles");
        System.out.println("4. The Little Mermaid");
        System.out.println("5. The Jungle Book");
        System.out.println("6. The Lion King");
        System.out.println("7. The Avengers");
        System.out.println("8. The Incredibles");
        System.out.println("9. The Little Mermaid");
        System.out.println("10. The Jungle Book");

        //user input, movie selection
        System.out.print("Enter the number of the movie you want to watch: ");
        int movieChoice = sc.nextInt();

        //switch case for movie selection, and seat selection
        switch (movieChoice){
            case 1:
                boolean auth1 = true;
                while(auth1){
                    System.out.println("You have selected The Lion King");
                    //output seat data
                    System.out.println("1 is sold and 0 is available");
                    System.out.println("-----------------------------");
                    System.out.println("[0, 1, 0, 0, 1]");
                    System.out.println("[1, 0, 0, 1, 1]");
                    System.out.println("[0, 1, 1, 0, 0]");
                    System.out.println("[1, 1, 1, 0, 1]");
                    System.out.println("[1, 0, 1, 1, 0]");
                    System.out.println("-----------------------------");
                    //user input, seat data
                    System.out.print("Please select seat row: ");
                    int row1 = sc.nextInt();
                    System.out.print("Please select seat column: ");
                    int col1 = sc.nextInt();

                    //using arrays to create seat data
                    int [][] seatDat1 = {
                        {0, 1, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 1, 1, 0, 0},
                        {1, 1, 1, 0, 1},
                        {1, 0, 1, 1, 0}
                    };
                    //seat choice verification
                    int pos1 = seatDat1[row1 - 1][col1 - 1];

                    if (pos1 == 1){
                        System.out.println("------------------------------");
                        System.out.println("SOLD, please pick another seat");
                        System.out.println("------------------------------");
                    }
                    else{
                        System.out.println("------------------------------");
                        System.out.println("AVAILABLE, please enjoy the movie");
                        System.out.println("------------------------------");
                        auth1 = false;
                    }
                }
                break;
        }
    }
}
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
        System.out.println("5. Jungle Book");
        

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
            case 2:
                boolean auth2 = true;
                while(auth2){
                    System.out.println("You have selected The Avengers");
                    //output seat data
                    System.out.println("1 is sold and 0 is available");
                    System.out.println("-----------------------------");
                    System.out.println("[1, 0, 1, 0, 0]");
                    System.out.println("[0, 1, 0, 1, 1]");
                    System.out.println("[1, 0, 0, 0, 1]");
                    System.out.println("[0, 1, 1, 0, 0]");
                    System.out.println("[1, 0, 1, 0, 1]");
                    System.out.println("-----------------------------");
                    //user input, seat data
                    System.out.print("Please select seat row: ");
                    int row2 = sc.nextInt();
                    System.out.print("Please select seat column: ");
                    int col2 = sc.nextInt();

                    //using arrays to create seat data
                    int [][] seatDat2 = {
                        {1, 0, 1, 0, 0},
                        {0, 1, 0, 1, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 0, 0},
                        {1, 0, 1, 0, 1}
                    };
                    //seat choice verification
                    int pos2 = seatDat2[row2 - 1][col2 - 1];

                    if (pos2 == 1){
                        System.out.println("------------------------------");
                        System.out.println("SOLD, please pick another seat");
                        System.out.println("------------------------------");
                    }
                    else{
                        System.out.println("------------------------------");
                        System.out.println("AVAILABLE, please enjoy the movie");
                        System.out.println("------------------------------");
                        auth2 = false;
                    }
                }
                break;
            case 3:
                boolean auth3 = true;
                while(auth3){
                    System.out.println("You have selected The Incredibles");
                    //output seat data
                    System.out.println("1 is sold and 0 is available");
                    System.out.println("-----------------------------");
                    System.out.println("[0, 0, 1, 1, 0]");
                    System.out.println("[1, 1, 0, 0, 1]");
                    System.out.println("[0, 0, 1, 1, 0]");
                    System.out.println("[1, 1, 0, 0, 1]");
                    System.out.println("[0, 0, 1, 1, 0]");
                    System.out.println("-----------------------------");
                    //user input, seat data
                    System.out.print("Please select seat row: ");
                    int row3 = sc.nextInt();
                    System.out.print("Please select seat column: ");
                    int col3 = sc.nextInt();

                    //using arrays to create seat data
                    int [][] seatDat3 = {
                        {0, 0, 1, 1, 0},
                        {1, 1, 0, 0, 1},
                        {0, 0, 1, 1, 0},
                        {1, 1, 0, 0, 1},
                        {0, 0, 1, 1, 0}
                    };
                    //seat choice verification
                    int pos3 = seatDat3[row3 - 1][col3 - 1];

                    if (pos3 == 1){
                        System.out.println("------------------------------");
                        System.out.println("SOLD, please pick another seat");
                        System.out.println("------------------------------");
                    }
                    else{
                        System.out.println("------------------------------");
                        System.out.println("AVAILABLE, please enjoy the movie");
                        System.out.println("------------------------------");
                        auth3 = false;
                    }
                }
                break;
            case 4:
                boolean auth4 = true;
                while(auth4){
                    System.out.println("You have selected The Incredibles");
                    //output seat data
                    System.out.println("1 is sold and 0 is available");
                    System.out.println("-----------------------------");
                    System.out.println("[1, 1, 0, 0, 1]");
                    System.out.println("[0, 1, 1, 0, 0]");
                    System.out.println("[1, 0, 0, 1, 0]");
                    System.out.println("[0, 0, 1, 0, 1]");
                    System.out.println("[1, 1, 0, 0, 1]");
                    System.out.println("-----------------------------");
                    //user input, seat data
                    System.out.print("Please select seat row: ");
                    int row4 = sc.nextInt();
                    System.out.print("Please select seat column: ");
                    int col4 = sc.nextInt();

                    //using arrays to create seat data
                    int [][] seatDat4 = {
                        {1, 1, 0, 0, 1},
                        {0, 1, 1, 0, 0},
                        {1, 0, 0, 1, 0},
                        {0, 0, 1, 0, 1},
                        {1, 1, 0, 0, 1}
                    };
                    //seat choice verification
                    int pos4 = seatDat4[row4 - 1][col4 - 1];

                    if (pos4 == 1){
                        System.out.println("------------------------------");
                        System.out.println("SOLD, please pick another seat");
                        System.out.println("------------------------------");
                    }
                    else{
                        System.out.println("------------------------------");
                        System.out.println("AVAILABLE, please enjoy the movie");
                        System.out.println("------------------------------");
                        auth4 = false;
                    }
                }
                break;
            case 5:
                boolean auth5 = true;
                while(auth5){
                    System.out.println("You have selected The Incredibles");
                    //output seat data
                    System.out.println("1 is sold and 0 is available");
                    System.out.println("-----------------------------");
                    System.out.println("[0, 1, 0, 1, 0]");
                    System.out.println("[1, 0, 1, 0, 1]");
                    System.out.println("[0, 1, 0, 1, 0]");
                    System.out.println("[1, 0, 1, 0, 1]");
                    System.out.println("[0, 1, 0, 1, 0]");
                    System.out.println("-----------------------------");
                    //user input, seat data
                    System.out.print("Please select seat row: ");
                    int row5 = sc.nextInt();
                    System.out.print("Please select seat column: ");
                    int col5 = sc.nextInt();

                    //using arrays to create seat data
                    int [][] seatDat5 = {
                        {0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 1},
                        {0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 1},
                        {0, 1, 0, 1, 0}
                    };
                    //seat choice verification
                    int pos5 = seatDat5[row5 - 1][col5 - 1];

                    if (pos5 == 1){
                        System.out.println("------------------------------");
                        System.out.println("SOLD, please pick another seat");
                        System.out.println("------------------------------");
                    }
                    else{
                        System.out.println("------------------------------");
                        System.out.println("AVAILABLE, please enjoy the movie");
                        System.out.println("------------------------------");
                        auth5 = false;
                    }
                }
                break;
            default:
                System.out.println("Please enter available numbers");
        }
    }
}
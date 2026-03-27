public class theatre_seats {
public static void main(String[] args) {
    int rows = 5;
    int cols = 5;
    String[][] seats = new String[rows][cols];

    // Initialize all seats as available (A)
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            seats[i][j] = "Available";
        }
    }
    seats[0][0] = "Booked";
    seats[1][1] = "Booked";
    seats[2][2] = "Booked";
    seats[3][3] = "Booked";
    seats[4][4] = "Booked";

    // Display the seating arrangement
    System.out.println("Theatre Seating Arrangement:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(seats[i][j] + " ");
        }
        System.out.println();
    }
}
}
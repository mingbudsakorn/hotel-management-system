package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Room> rooms = new ArrayList<Room>();
              
        // Test Add Room
        Room room1 = new Room("name1", "small", 1, 1);
        // System.out.println(room1);
        rooms.add(room1);

        Room room2 = new Room("name2", "large", 4, 2);
        // System.out.println(room2);
        rooms.add(room2);

        System.out.println("Hello what do you want to do?");
        System.out.println("[1] Add Room");
        System.out.println("[2] Print all room");

        int choice = scanner.nextInt();

        if (choice==1) {
            //
            
        } else if (choice==2) {
            for (Room room : rooms) {
                System.out.println(room);
            }
        }
    }
}

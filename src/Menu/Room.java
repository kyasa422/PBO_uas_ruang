package Menu;

import java.util.ArrayList;

public class Room {
    public ArrayList<Integer> _room = new ArrayList<>();

    public void roomList(){
        for(int i = 0; i < 12; i++){
            if(!_room.contains(i + 1)){
                System.out.println((i + 1) + ". Room " + (i + 1) + " is available");
            }else{
                System.out.println((i + 1) + ". Room " + (i + 1) + " is not available");
            }
        }
    }

    public void roomDetail(int choice){
        if(!_room.contains(choice)){
            System.out.println("Status " + " is available");
        }else{
            System.out.println("Status " + " is not available");
        }

        if(choice <= 6){
            System.out.println("price : Rp. 200.000,00 per hour");
            System.out.println("Capacity : 6 person");
            System.out.println("Size : 3x2");
        } else if (choice >6 && choice <9) {
            System.out.println("");
            System.out.println(" This room is under maintenance ");
            System.out.println(" ");
        } else{
            System.out.println("Price : Rp. 400.000,00 per hour");
            System.out.println("Capacity : 12 person");
            System.out.println("Size : 5x10");
        }
    }
}

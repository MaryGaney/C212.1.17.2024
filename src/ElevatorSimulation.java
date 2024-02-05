import java.util.Scanner;
public class ElevatorSimulation {
    public static void main(String[] args) {
        int floor;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a floor number");
        floor = in.nextInt();
        int actualFloor;

        //condition
        if(floor >13) {
            actualFloor = floor - 1;
        }else{
            actualFloor = floor;
        }

        System.out.println("actual floor = " + actualFloor);
    }
}

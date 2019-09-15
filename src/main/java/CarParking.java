import java.util.*;

public class CarParking {
    HashMap<Integer, Integer> Map1=new HashMap<>();

    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);

        //Enter the total number of Car parking slots
        System.out.println("Enter the total number of Car parking slots:");
        int n=myObj.nextInt();

        ArrayList<CarDetails> al=new ArrayList<>();
        while(1 == 1) {
            //String input - Entry or Exit
            System.out.println("String input - Entry or Exit :");
            myObj.nextLine();
            String type = myObj.nextLine();


            if (type.equalsIgnoreCase("Entry")) {
                //Enter Registration Number of the Car
                System.out.println("Enter Registration Number of the Car:");
                String RegistrationNo = myObj.nextLine();

                //Enter Colour of the Car
                System.out.println("Enter Colour of the Car:");
                String Colour = myObj.nextLine();

                CarParking Slot = new CarParking();
                int ParkingNo = Slot.CarEntry(n);
                CarDetails C1 = new CarDetails(RegistrationNo, Colour, ParkingNo);
                System.out.println(C1.colour + C1.registrationNo + C1.SlotNo);
                al.add(C1);
                System.out.println(al);
            }
//        else if(type == "exit"){
//            //CarDetails C2;// = new CarDetails();
//          //  String RegNo = C1.registrationNo;
//        }
        }
}

    //Assigning a Slot to Car when it enters
    public int CarEntry(int Z){
        for(int i=1;i<Z+1;i++){
         if(Map1.containsKey(i)){
             if((Map1.get(i).equals(null)) || (Map1.get(i).equals(0))){
                 Map1.put(i,1);
                 return i;
            }
            else{
                System.out.println("All the slots are full");
            }
         }
         else{
             Map1.put(i,1);
             return i;
         }
        }
        return 0;
    }

    //Freeing up a slot when a car exits
    public void SlotsExit(int P){
        Map1.put(P, 0);
    }
}

import java.util.*;

public class CarParking {
    
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        
        //Hashmap contains 2 values - Slot Number & Availability
        HashMap<Integer, Integer> slotToAvailability =new HashMap<>();

        //Hashmap contain 2 values - Car's registration Number & Slot No. where car is parked
        HashMap<String, Integer> regNoToSlotMap=new HashMap<>();

        //Enter the total number of Car parking slots
        System.out.println("Enter the total number of Car parking slots:");
        int numberOfSlots=Input.nextInt();

        //Array List to store Car's registration Number , Color & Parking Slot no.
        ArrayList<CarDetails> CarInfo = new ArrayList<>();

        //To create an infinite loop
        while(1 == 1) {

            //String input - Entry or Exit
            System.out.println("String input - Entry or Exit :");
            String type = Input.nextLine();


            if (type.equalsIgnoreCase("Entry")) {

                //Enter Registration Number of the Car
                System.out.println("Enter Registration Number of the Car:");
                String RegistrationNo = Input.nextLine();

                //Enter Color of the Car
                System.out.println("Enter Color of the Car:");
                String Color = Input.nextLine();

                //Assign a Parking Slot No. to a car
                CarParking EngageSlot = new CarParking();
                int ParkingNo = EngageSlot.CarEntry(slotToAvailability,numberOfSlots);

                //Store Car details
                CarDetails C1 = new CarDetails(RegistrationNo, Color, ParkingNo);
                System.out.println(C1.colour + C1.registrationNo + C1.SlotNo);
                CarInfo.add(C1);
                System.out.println(CarInfo);

                //Map Car's registration Number & Slot No. where car is parked
                regNoToSlotMap.put(C1.registrationNo,C1.SlotNo);

            }
        else if(type.equalsIgnoreCase("exit")){

                //Enter Registration Number of the Car
                System.out.println("Enter Registration Number of the Car:");
                String RegistrationNo = Input.nextLine();

                //Free up a parking slot when a car exits
                CarParking FreeUpSlot = new CarParking();
                FreeUpSlot.SlotsExit(regNoToSlotMap, slotToAvailability, RegistrationNo);

        }
        }
}

    //Assigning a Slot to Car when it enters
    public int CarEntry(HashMap<Integer, Integer> slotToAvailibility,int Z){
        for(int i=1;i<Z+1;i++){
         if(slotToAvailibility.containsKey(i)){
             if((slotToAvailibility.get(i).equals(null)) || (slotToAvailibility.get(i).equals(0))){
                 slotToAvailibility.put(i,1);
                 return i;
            }
            else{
                System.out.println("All the slots are full");
            }
         }
         else{
             slotToAvailibility.put(i,1);
             return i;
         }
        }
        return 0;
    }

    //Freeing up a slot when a car exits
    public void SlotsExit(HashMap<String, Integer> registrationToSlotMap, HashMap<Integer, Integer> slotToAvailibility,String registrationNo){
        int slotNo = registrationToSlotMap.get(registrationNo);
        slotToAvailibility.put(slotNo, 0);
    }
}

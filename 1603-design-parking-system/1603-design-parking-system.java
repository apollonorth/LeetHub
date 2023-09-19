class ParkingSystem {
    int bigTotal;
    int mediumTotal;
    int smallTotal;
    public ParkingSystem(int big, int medium, int small) {
        bigTotal = big;
        mediumTotal = medium;
        smallTotal=small;
    }
    
    public boolean addCar(int carType) {
       if(carType == 1) {
            if(bigTotal <= 0) 
                return false;
            else {
                bigTotal--;
                return true;
            }
       }
        else if(carType == 2) {
            if(mediumTotal <= 0) 
                return false;
            else {
                mediumTotal--;
                return true;
            }
       }
        else if (carType == 3) {
            if(smallTotal <= 0)
                return false;
            else {
                smallTotal--;
                return true;
            }
        }
        else
            return false; 
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
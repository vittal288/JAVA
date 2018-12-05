package vittalk.com.company;

public class TataIndia extends Car {
    private int roadService;

    public TataIndia(int roadService) {
        super(4,"diesel","TATA INDICA",4,5,5,false);
        this.roadService = roadService;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stopVehicle();
            changeGear(1);//automatic car so, if car stops shift car gear to 1
        }else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(2);
        }else{
            changeGear(4);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}

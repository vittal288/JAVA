package vittalk.com.company;

public class Car {

    private int door;
    private  int wheel;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("swift") || validModel.equals("india")){
            this.model =model;
        }else {
            this.model = "unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}

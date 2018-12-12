package vittalk.com.company;

public class Sofa {
    private String model;
    private String brandName;
    private String cushionType;

    public Sofa(String model, String brandName, String cushionType) {
        this.model = model;
        this.brandName = brandName;
        this.cushionType = cushionType;
    }


    public String getModel() {
        return model;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getCushionType() {
        return cushionType;
    }
}

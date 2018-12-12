package vittalk.com.company;


public class Furniture {

    private Table teaTable;
    private Sofa mainSofa;
    private  Chair diningChairs;
    private  Chair computerChair;
    private Table diningTable;

    public Furniture(Table teaTable, Sofa mainSofa, Chair diningChairs, Chair computerChair, Table diningTable) {
        this.teaTable = teaTable;
        this.mainSofa = mainSofa;
        this.diningChairs = diningChairs;
        this.computerChair = computerChair;
    }

    public Table getTeaTable() {
        return teaTable;
    }

    public Sofa getMainSofa() {
        return mainSofa;
    }

    public Chair getDiningChairs() {
        return diningChairs;
    }

    public Chair getComputerChair() {
        return computerChair;
    }

    public Table getDiningTable() {
        return diningTable;
    }
}

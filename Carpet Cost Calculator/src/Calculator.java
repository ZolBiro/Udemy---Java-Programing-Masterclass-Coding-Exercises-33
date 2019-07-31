public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator (Floor floor, Carpet cost){
        this.floor = floor;
        this.carpet = cost;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}

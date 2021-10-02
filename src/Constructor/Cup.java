package Constructor;

public class Cup {
    int size;
    boolean isClean;
    double liquidAmount;
    public Cup(int entered,boolean clean,double liquid){
        this.size=entered;
        this.isClean=clean;
        this.liquidAmount=liquid;
    }
    public Cup(){
    }
    public Cup(int inputSize,boolean inputClean){

        this.size=inputSize;
        this.isClean=inputClean;
    }
    public void info(){
        System.out.println(size+" size "+isClean+" is clean "+liquidAmount+" liquid amount " );
    }

    public String toString(){
        return "This is my toString method";
    }
    @Override
    protected void finalize(){
        System.out.println("Now one object went to the garbage!");
    }
}

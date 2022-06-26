package zadanie7.pkg2;

public class Punkt2D {

    int wspx;
    int wspy;
    
    Punkt2D(){
        this.wspx=0;
        this.wspy=0;
    }
    
    Punkt2D(int wspx, int wspy) {
        this.wspx = wspx;
        this.wspy=wspy;
    }
    
    public void Random(int wspx,int wspy){
        this.wspx=wspx;
        this.wspy=wspy;
    }
    
    @Override
    public String toString(){
        return "x: "+ this.wspx + " y: " +this.wspy;
    }
}

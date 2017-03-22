
/**
 * Write a description of class TaxiNode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TaxiNode{
    private Taxi _taxi;
    private TaxiNode _next;
    
    public TaxiNode (Taxi t, TaxiNode next){
        _taxi = new Taxi(t);
        _next = next;
    }
    
    public void setTaxi(Taxi t){
        _taxi = new Taxi(t);
    }
     
    public void setNext(TaxiNode next){    
        _next = next;
    }
    
    public Taxi getTaxi(){
        return new Taxi(_taxi);
    }
    
    public TaxiNode getNext(){    
        return _next;
    }
}


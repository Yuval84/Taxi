
/**
 * Represents a queue of taxis
 * 
 * @author Edelman yuval
 * @version 31.1.12
 */
public class TaxiQueue{
    private TaxiNode _rear;//point at the rear of the queue
    private TaxiNode _front;//point at the front of the queue
  /**
   * empty constructor which initializes an empty queue
   */  
    public TaxiQueue(){
        _rear=new TaxiNode(null, null);//point at empty nod
        _front=_rear;//point at empty nod
    }
   /**
    * method receives an object of a taxi and put it back of the line
    * @param t Taxi object 
    */  
    public void enqueue(Taxi t){ 
        TaxiNode temp = new TaxiNode(null, null);//temp empty node
        _rear. setTaxi(t);// now _front point at t 
        _rear.setNext(temp);
        _rear = temp;      
    }
   /**
    * method that takes the first taxi from front of queue and returns it
    * @return Taxi the first taxi
    */   
    public Taxi dequeue(){
        if(empty())//if the queue is empty
            return null;
        else{
            TaxiNode temp=_front;//temp node point at first node
            _front=_front.getNext(); //remove the first taxi node from queue
            return temp.getTaxi();//return the first taxi
      }
    }
   /**
    * method returns true if the queue is empty and false otherwise
    * @return true if empty
    * @return false if not empty
    */  
     public boolean empty(){
         if(_rear==_front){//the queue is empty
             return true;
            }
            else{//the queue is not empty
                return false;
            }
        }
     /**
      * Method that returns the first values from the taxi queue without removing the taxi from the queue
      * @return t the first taxi values
      * @return null if the queue is empty
      */   
       public Taxi topQueue(){
               if(!empty()){//if the queue not empty
                Taxi t=_front.getTaxi();//Taxi t get the taxi values
                return t; 
            }else{//if the queue is empty
                return null;
            }
        }
     /**
      * The method returns a string Contains the sentence
      * ": Taxies in the queue (from the first to the last)" 
      *  and then the organs of the queue,from the firs to last in new row, for exemple:
      * Taxi's id is: 111, driver's name is: Yossi.
      * Taxi's id is: 222, driver's name is: David.
      * if the queue is empty teh string will contain the sentence:"No Taxies in queue"
      * @param s string represent taxi queue
      */   
      public String toString(){
          String s="";
          if(empty()){//the queue is empty
              s="No Taxies in queue \n ";
              return s;
            }        
         TaxiQueue temp=new TaxiQueue();//temp Taxi queue       
         s="Taxies in the queue (from the first to the last):\n";
         while(!empty()){//not empty
               s+=topQueue().toString() + "\n";//first taxi to string
              temp.enqueue(dequeue());//temp queue inserts taxi node from queue and remove it from queue
           }
          _rear = temp._rear;
          _front = temp._front;
         return s;
        }  
      /**
       *  method thet sort the taxi queue from the small to large number of taxi 
       */  
      public void sort(){
          TaxiQueue sort = new TaxiQueue();//new taxi queue
          while(!empty()){ //queue not empty  
              Taxi temp = new Taxi(dequeue());//taxi temp- insert taxi first taxi from queue,remove from queue
              TaxiQueue storage = new TaxiQueue();//new taxi queue to storege taxi nodes
               while(!empty()){
                   Taxi temp2 = new Taxi(dequeue());//taxi temp2- insert taxi first taxi from queue,remove from queue                   
                   if(temp.getId()<temp2.getId()){
                       storage.enqueue(temp2);//storage insert temp2 -taxi node
                    }
                   else
                     {
                        storage.enqueue(temp);////storage insert temp- taxi node
                        temp=temp2;
                     }
                }
                sort.enqueue(temp);//sort insert temp- taxi node
                _front=storage._front;//_front point at storage._front
                _rear=storage._rear; //_rear point at storage._rear
            }
           _front=sort._front; //_front point at sort._front
           _rear=sort._rear;//rear point at sort._rear
        }
    }//end of class
                    

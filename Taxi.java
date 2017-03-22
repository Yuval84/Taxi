
/**
 * This class represent a cab whith id number and driver name
 * 
 * @author Edelman yuval
 * @version 31.1.12
 */
public class Taxi{
        private int _id;//represent id num
        private String _name;//represent name
      /**
       * taxi cnstructor
       * @param id the taxi id number
       * @param name the driver name
       */  
        public Taxi(int id, String name){
            _id=id;
            _name=name;
        }
       /**
        * taxi other cnstructor
        * @param other other id and name
        */ 
        public Taxi(Taxi other){
            if (other != null){
          _id=other._id;
           _name=other._name;
         }
        }
       /**
        * method thet return the id of the taxi
        * @return id the taxi id
        */ 
        public int getId(){
            return _id;
        }
      /**
       * method thet return the driver name
       * @return name the name of the driver
       */
        public String getName(){
            return _name;
        }
       /**
        * method thet return string (Taxi's id is: [id], driver's name is: [name].)
        * @return string 
        */
        public String toString(){
            String s="";
            s=s+"Taxi's id is: "+_id+ ", driver's name is: "+_name+".";
            return s;
        }
    }
    


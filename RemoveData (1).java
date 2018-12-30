import java.util.*;


public class RemoveData {
        public static ArrayList<Data> deleteData(int id, ArrayList<Data> info){
                if (info.size()==0){
                        System.out.println("The database is Empty.Nothing to remove");
                        return info;
                }
                else{                                             
                         int index;
                        boolean unfound=false;
                        for(Data x:info){
                                if (x.getId()==id){
                                        index=info.indexOf(x);
                                        info.remove(index);
                                        unfound=true; 
                                        break;
                                }
                        }
                        if (unfound==false){
                                System.out.println("The item with id number "+ id +" was not found");
                                return info;
                        }
                }
                /*Collections.sort(info, new Comparator<Data>(){
                        @Override
                        public int compare(Data data1, Data data2)
                        {
                                return  Integer.valueOf(data1.getId()).compareTo(data2.getId());
                        }
                });*/ 
                /*
                 *To panw kommati taksinomei to arraylist alla epeidh einai idi taksinomhmenos den to xreiazomaste 
                 * Epeidh ka8e fora pou afairoume stoixeio se taksinomhmeno pinaka paramenei ta3inomhmenos
                 */
                return info;
        }
}

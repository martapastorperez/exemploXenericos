
package exemploXenericos;

import java.util.ArrayList;
import java.util.LinkedList;

    public class ListasXenericos2<T>  {
    LinkedList <T>lista = new LinkedList<T>();

    public ListasXenericos2() {
       lista=new LinkedList<T>();
    }
  public void amosar(LinkedList<T> lis){
      for(int i =0;i< lis.size();i++){
          System.out.println(lis.get(i));
      }
  }
 
  public void engadir(T e){
    lista.add(e);
        
    }
  public LinkedList<T>getArray(){
      return lista;
  }
}

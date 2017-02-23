
package exemploXenericos;

import java.util.ArrayList;


    public class ListasXenericos<T>  {
    ArrayList <T>lista = new ArrayList<T>();

    public ListasXenericos() {
       lista=new ArrayList<T>();
    }
  public void amosar(ArrayList<T> lis){
      for(int i =0;i< lis.size();i++){
          System.out.println(lis.get(i));
      }
  }
    
  public void engadir(T e){
    lista.add(e);
        
    }
  public ArrayList<T>getArray(){
      return lista;
  }
}

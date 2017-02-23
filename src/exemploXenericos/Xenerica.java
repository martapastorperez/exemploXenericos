
package exemploXenericos;

import javax.swing.JOptionPane;


public class Xenerica<T> {
    T variable;
    
    public void set(T e){
        variable=e;
        
        
    }
    public T get(){
        return variable;
    }
    public void visualizar(){
        JOptionPane.showMessageDialog(null,variable);
    }
}


package exemploXenericos;


public class ExemploHerdanza {

    
    public static void main(String[] args) {
       Xenerica <String> nombre=new Xenerica<>();
       nombre.set("abc");
       nombre.visualizar();
       
       Periodico periodico=new Periodico("Faro de Vigo","14 feb 2017");
       Xenerica<Periodico> period=new Xenerica<>();
       period.set(periodico);
       period.visualizar();
       
       Publicacion publica=new Publicacion(70, 2.3F);
       Xenerica<Publicacion> publi=new Xenerica<>();
       publi.set(publica);
       publi.visualizar();
       
        
        
      ListasXenericos<Periodico> listXen=new ListasXenericos<>();
      listXen.engadir(new Periodico ("10/3/2017","Marca"));
      listXen.engadir(new Periodico ("2/3/2017", "La voz de Galicia"));
      listXen.amosar(listXen.getArray());
      
     
    }
    
}

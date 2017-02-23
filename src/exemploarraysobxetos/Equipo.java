
package exemploarraysobxetos;

import javax.swing.JOptionPane;


public class Equipo {
    Xogador[]xogadores=new Xogador[3];
    //Xogador[] xog=(new Xogador("aa",1),new Xogador("bb",2));
    

    
    public String pedirNome(){
        return JOptionPane.showInputDialog("nome: ");
        
    }
    public int pedirDorsal(){
        return Integer.parseInt(JOptionPane.showInputDialog("dorsal: "));
    }
    public void crearArray(){
        for(int i=0;i<xogadores.length;i++)
            xogadores[i]=new Xogador(pedirNome(),pedirDorsal());
    }
      public void visualizar(){
        //for each
        for(Xogador xog:xogadores)
            JOptionPane.showMessageDialog(null, xog);
        //tamen se pode facer:
        for(int i=0;i<xogadores.length;i++)
        System.out.println(xogadores[i]);
    }
}

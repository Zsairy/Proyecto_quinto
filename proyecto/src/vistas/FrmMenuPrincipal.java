package vistas;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;

public class FrmMenuPrincipal extends JFrame {
    JMenuBar mnbPrincipal;
    JMenu mnInicio;
    JMenuItem mniSalir;
    
 //facultad
    JMenu mnFacultad;
    JMenuItem mniNuevoFacultad;
    JMenuItem mniModificaFacultad;
    JMenuItem mniEliminaFacultad;
    JMenuItem mniBuscaFacultad;
    JMenuItem mniListaFacultad;
    
    
      
  JDesktopPane dkpEscritorio;
 
   public FrmMenuPrincipal(){
        //Inicio
        dkpEscritorio= new JDesktopPane();
        dkpEscritorio.setBackground(new Color(240, 240, 240));      
        mnbPrincipal = new JMenuBar();
        mnInicio = new JMenu("Inicio");
        mniSalir = new JMenuItem("Salir");
       
        
        mniSalir.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                mniSalirActionPerformed(e);
            }
        });
       
        //facultad
        //Facultad
        mnFacultad = new JMenu("Facultad");
        mniNuevoFacultad = new JMenuItem("Nuevo");
        
        mniNuevoFacultad.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                mniSalirActionPerformed(e);
            }
        });
     
    
        
        
        
        mnbPrincipal.add(mnInicio);
        mnbPrincipal.add(mnFacultad);
        
        
        mnInicio.add(mniSalir);
       // mnInicio.add(mni);
        
        this.setLayout(new BorderLayout());
        this.add(mnbPrincipal, BorderLayout.NORTH);
        this.add(dkpEscritorio, BorderLayout.CENTER);
        this.setExtendedState(MAXIMIZED_BOTH); //Para maximizar
        this.setBounds(550,550,750,750);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Para terminar el programa
        
    } //Fin public FrmMenuPrincipal
   
  //Facultad
  
  
    
     /*  public void  mniFacultadActionPerformed(ActionEvent e ){
         facultad log= new facultad();
         dkpEscritorio.add(log);
         log.setVisible(true);
     }*/
       
   
     public void mniSalirActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    
    public static void main(String[] args) {
         JFrame.setDefaultLookAndFeelDecorated(true); //que nos permite dejar a Substance la decoracion ( por asi decirlo) 
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteSkin"); 
        SubstanceLookAndFeel.setCurrentTheme( "org.jvnet.substance.theme.SubstanceAquaTheme" ); 
        SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark( new SubstanceImageWatermark("c:\\hiper.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(0.9));//valor aproximado de la opacidad por default de imageWatermark
        FrmMenuPrincipal frm = new FrmMenuPrincipal();
        frm.setVisible(true);
    }  
}

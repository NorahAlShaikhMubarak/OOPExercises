/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepaintingtool;

/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.JFrame;

public class SimplePaintingtool extends JFrame 
{

    public static void main(String[] args)
    {
        PaintingTool frm = new PaintingTool ();
        frm.setVisible(true);
        frm.setSize(400, 300);
        frm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

}

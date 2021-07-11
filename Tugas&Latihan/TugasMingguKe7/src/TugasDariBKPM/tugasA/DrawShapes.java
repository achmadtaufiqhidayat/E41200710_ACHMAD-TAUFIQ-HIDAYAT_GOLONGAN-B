/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasDariBKPM.tugasA;

/**
 *
 * @author asus
 */
import java.awt.*;
import java.applet.*;
public class DrawShapes extends Applet{
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    public void init(){
        //The font Arial size 18, and is italicized
        font = new Font("Arial", Font.ITALIC,18);
        
        //some colors are predefined in the coor class
        redColor = Color.red;
        backgroundColor = Color.orange;
        
        //colors can be createed using red, green, bllue values
        blueColor = new Color(0,0,122);
        
        //set the background color of the applet
        setBackground(backgroundColor);
    }
    
    
    public void stop(){
    }
    
    /*
    this method paints the shapes to the screnn
    */
    public void paint(Graphics graph){
    //set font
    graph.setFont(font);
    //create a title
    graph.drawString("Draw Shapes", 90,20);
    
    //set the color for the first shape
    graph.setColor(blueColor);
    
    //draw a rectangle using drawRect(int x, int y, int width, int height)
    graph.drawRect(120, 120, 120, 120);
    
    //this will fill a rectangle
    graph.fillRect(115, 115, 90, 90);
    
    //set the color for the next shape
    graph.setColor(redColor);
    
    //draw a circle using drawArc(int x, int y, int width, nt height, int startAngle, int arcAngle)
    graph.fillArc(110, 110, 50, 50, 0, 360);
    
    //set color for next shape
    graph.setColor(Color.CYAN);
    
    //draw another rectanhle
    graph.drawRect(50, 50, 50, 50);
    
    //this will fill a rectangle
    graph.fillRect(50, 50, 60, 60);
    
    }
}

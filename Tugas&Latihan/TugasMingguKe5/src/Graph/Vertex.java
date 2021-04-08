/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author asus
 */
public class Vertex {
    public char label;
    public boolean wasVisited = false;
    
    public Vertex(char label){
    this.label = label; wasVisited = false;
    }
    
}

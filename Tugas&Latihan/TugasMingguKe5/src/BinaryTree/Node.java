/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author asus
 */
public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;
    
    public void displayNode(){
        System.out.println("{" + id + ", " + data + "}");
    }
}

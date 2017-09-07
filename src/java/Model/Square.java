/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Axel Cuevas
 */
public class Square extends Shape {
    
    public Square(double side) {
        super(side);
    }
    
    public double area(){
        return side*side;
    }
    
    public double perimeter()
    {
        return side*4;
    }
}

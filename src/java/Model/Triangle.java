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
public class Triangle extends Shape{
    
    public Triangle(double side) {
        super(side);
    }
    
    public double area(){
        return Math.sqrt(3) * Math.pow(side, 2)/4;
    }
    
    public double perimeter()
    {
        return side*3;
    }
}

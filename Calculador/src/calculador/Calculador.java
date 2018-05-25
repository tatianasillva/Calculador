/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;



 
/**
 *
 * @author Estudiantes
 */
public class Calculador{

   private  int x;
    private int y;
    private int r;
    int m ;
    int n; 
            
            
   
    
   
    public int getx() {
        return r;
    }
    
    public int gety() {
        return r;
    }

    public void setX(int n) {
        this.x = x;
    }

    public void setY(int n) {
        this.y = y;
    }
    
    public int setPoint(int n, int m ) {
        return r;
    }
   
    
    
    void sumar(){
    r=x+y;
    }
    
    void restar(){
    if(x<y){
        int a;
        a=x;
        x=y;
        y=a;
    }
    
    if (x<0){
        x=-x;
        y=-y;
    }
    
    r=x-y;
            
            }
    
     void multiplicar(){
    r=x*y;
     }
    
}
                


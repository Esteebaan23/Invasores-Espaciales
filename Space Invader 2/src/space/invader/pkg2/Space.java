package space.invader.pkg2;


public class Space {
       private int coordX;
    private int coordY;
    //
    private boolean aparecer;
    
    
    public Space (int x, int y)
    {
        this.coordX=x;
        this.coordY=y;  
        //
        this.aparecer=true;
    }
    
    public void setCoordX(int x)
    {
        this.coordX=x;
    }
    
    public void setCoordY(int y)
    {
        this.coordY=y;
    }
    //
    public void setAparecer(boolean aparecer)
    {
        this.aparecer=false;
    }
    //
    
    public int getCoordX()
    {
        return coordX;
    }
    
    public int getCoordY()
    {
        return coordY;
    }
    //
    public boolean getAparecer()
    {
        return aparecer;
    } 
}

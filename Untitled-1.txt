public class Dice{
    private int Face;


   
    public Dice(){
        
      // System.out.println("Test:"+Face);
   } 
   
    public Dice(int Face){
         this.Face = 1;
       // System.out.println("Test:"+Face);
    }
    public int getface(){
        return this.Face;
    }
    public void roll(){
        this.Face = (int)(Math.random() * 6) +1;
    }

    
}
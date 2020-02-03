class permanenemployee extends teacher{
    
    private int salary;
    

    public permanenemployee(String n, int a, int e , int s){
        super(n,a,e);
        this.salary = new s;


    }
    public String toString(){
        return "permanenemployee" + super.toString()+", " + salary;
    }
    
    
}
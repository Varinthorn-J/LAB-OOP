class employee extends person {
    private int employeeid;

    public employee(String n, int a, int e) {
        super(n, a);
        this.employeeid = e;
        
    }
    public String toString(){
        return "employee" + super.toString()+", " + employeeid;
    }

}
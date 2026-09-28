class App{
    //run |debug
    public static void main( String[] args ){
        Calculator obj1 = new Calculator();
        obj1.addnumbers();
        obj1.subnumbers(50,8);
        System.out.println(obj1.divnumbers());

        Calculator obj2 = new Calculator();
        obj2.subnumbers(150,67);
        obj2.mulnumbers(0);
    }
        
    

}
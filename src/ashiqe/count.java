package ashiqe;

public class count {
    
    int count = 0;
    
    void display() {
        count++;
        System.out.println(count);
    }
   
    public static void main(String[] args) {
        count ob1 = new count();
        ob1.display();
        
        count ob2 = new count();
        ob2.display();
        
        count ob3 = new count();
        ob3.display();
    }
}

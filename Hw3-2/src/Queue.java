
public class Queue {
    
    private int n;
    private Stack s1;
    private Stack s2;
    
    public Queue(int n) throws Exception{
        s1 = new Stack(n);
        s2 = new Stack(n);
    }
    
    public Object Dequeue() {

        if(s2.isEmpty()){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        Object o = s2.pop();
                
        return o;
    }
    
    public void Enqueue(Object o){
        s1.push(o);
    }
}


public class Hw310 {

    public static void main(String[] args) {

        Queue q1 = new Queue();
        Queue q2 = new Queue();

        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);
        q1.enQueue(5);
        q1.enQueue(6);

        q2 = Combin(q1);
        System.out.println("result: ");
        if(q2 != null){
            while (!q2.isEmpty()) {
                System.out.println(q2.deQueue());
            }
        }else{
            System.out.println("no result!");
        }
    }

    public static Queue Combin(Queue q) {
        
     if (q.size() % 2 != 0) {
            System.out.println("not even!");
            return null;
        }

        Queue h1 = new Queue();
        Queue h2 = new Queue();
        Queue q1 = new Queue();

        int len = q.size() / 2;
        while(q.size() > len) {
            h1.enQueue(q.deQueue());
        }

        while(q.size() > 0 && q.size() <=len) {
            h2.enQueue(q.deQueue());
        }
        
        while (!h1.isEmpty() || !h2.isEmpty()) {
            q1.enQueue(h1.deQueue());
            q1.enQueue(h2.deQueue());
        }

        return q1;

    }
}
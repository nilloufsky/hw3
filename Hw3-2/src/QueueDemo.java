
public class QueueDemo {

    public static void main(String[] args) throws Exception{

        Queue qu = new Queue(6);

        qu.Enqueue(1);
        qu.Enqueue(2);
        qu.Enqueue(3);
        qu.Enqueue(4);
        qu.Enqueue(5);
        qu.Enqueue(6);

        for (int i = 0; i < 6; i++) {
            System.out.println(qu.Dequeue());
        }
    }

}

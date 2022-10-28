public class SinglyList<T> {
    private Node first;
    private Node last;

    public SinglyList(){
        new Node(null, null);
    }

    private class Node{
        T val;
        Node next;

        public Node(T obj, Node prev){
            if(prev != null){
                prev.next = this;
                this.val = obj;
            }
            else{
                this.val = obj;
                first = this;
                last = this;
            }
        }
    }

    public Node add(T obj){
        last = new Node(obj, last);
        if(first.val == null){
            first = last;
        }
        return last;
    }

    public void print(){
        Node current = first;
        while (current != last){
            System.out.print(current.val.toString() + " -> ");
            current = current.next;
        }
        System.out.println(last.val.toString());
    }
}

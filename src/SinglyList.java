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

    public T search(int index){
        Node current = first;
        int i = 0;
        while (i != index){
            current = current.next;
            i++;
        }
        return current.val;
    }

    public void delete(int index){
        Node current = first;
        int i = 0;

        if(index == 0){
            if (first.next != null){
                first = first.next;
                return;
            }
            else{
                first.val = null;
                return;
            }
        }

        while (i+1 != index){
            current = current.next;
            i++;
        }
        if (current.next == last){
            last = current;
        }
        else{
            current.next = current.next.next;
        }
    }

    public void print(){
        Node current = first;
        while (current != last){
            System.out.print(current.val.toString() + " -> ");
            current = current.next;
        }
        if(last.val != null){
            System.out.println(last.val.toString());
        }
        else{
            System.out.println("Nothing");
        }
    }
}

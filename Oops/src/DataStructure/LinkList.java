package DataStructure;

public class LinkList {
    Nod7e head;
    public void insert(int data){
        Nod7e node = new Nod7e();
        node.data = data;
        node.next = null;
        if(head == null)
        {
            head = node;
        }
        else {
            Nod7e n = head;
            while (n.next!=null){
                n= n.next;
            }
            n.next = node;
        }

    }
    public void show(){
        Nod7e node = head;
        while (node.next!= null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}

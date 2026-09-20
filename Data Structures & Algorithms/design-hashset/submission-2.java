class MyHashSet {

    class Node {
        int key;
        Node next;

        Node(int key) {
            this.key=key;
            this.next=null;
        }
    }

    Node[] buckets;
    int size=1000;

    public MyHashSet() {
        buckets=new Node[size];
    }
    
    public void add(int key) {
        int index=key%size;
        Node current=buckets[index];
        while(current!=null) {
            if(current.key==key) {
                return;
            }
            current=current.next;
        }

        Node newNode=new Node(key);
        newNode.next=buckets[index];
        buckets[index]=newNode;

    }
    
    public void remove(int key) {
        int index=key%size;
        Node current=buckets[index];
        Node previous=null;
        while(current!=null) {
            if(current.key==key) {
                if(previous==null) {
                    buckets[index]=current.next;
                }
                else {
                    previous.next=current.next;
                }
            }
            previous=current;
            current=current.next;
        }
        return;
    }
    
    public boolean contains(int key) {
        int index=key%size;
        Node current=buckets[index];
        while(current!=null) {
            if(current.key==key) {
                return true;
            }
            current=current.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
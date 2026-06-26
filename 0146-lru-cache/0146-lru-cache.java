class LRUCache {
        class Node{
        int key,value;
        Node prev,next;

        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
        }
        HashMap<Integer,Node> map=new HashMap<>();

        Node head=new Node(0,0);
        Node tail=new Node(0,0);
        int capacity;
    

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;

    }
    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void insert(Node node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
    public int get(int key) {
        if(!map.containsKey(key)) return -1;

        Node node=map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            remove(node);
            insert(node);
        }
        else{
        if(map.size()==capacity){
            Node node=tail.prev;
            map.remove(node.key);
            remove(node);
        }
        Node newNode=new Node(key,value);
        insert(newNode);
        map.put(key,newNode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
package DSA150;

class LRUcache2 {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int cap;
    
    HashMap<Integer, Node> map = new HashMap<>();
    
    public LRUcache2(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    private void addNode(Node newNode) {
        Node temp = head.next;
        
        newNode.next = temp;
        newNode.prev = head;
        
        head.next = newNode;
        temp.prev = newNode;
    }
    
    private void deleteNode(Node delNode) {
        Node prev = delNode.prev;
        Node next = delNode.next;
        
        prev.next = next;
        next.prev = prev;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            Node resNode = map.get(key);
            int ans = resNode.value;
            
            map.remove(key);
            deleteNode(resNode);
            addNode(resNode);
            
            map.put(key, head.next);
            return ans;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node curr = map.get(key);
            map.remove(key);
            deleteNode(curr);
        }
        
        if (map.size() == cap) {
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        
        addNode(new Node(key, value));
        map.put(key, head.next);
        
    }
}
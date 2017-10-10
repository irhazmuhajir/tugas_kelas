package CircularLinkedList;

public class ChainCircular {
    protected ChainNodeCircular FirstNode, lastNode;
    protected int size;
    
    
    public ChainCircular(int initialcapacity){
        
    }
    public ChainCircular(){
        this(0);
    }
    
    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public int size() {
        return size;
    }
    
    public void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(
            "index = "+ index + " size = "+size);
        }
    }

    
    public Object get(int index) {
        checkIndex(index);
        
        ChainNodeCircular currentNode = FirstNode;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }

    
    public int indexOf(Object theElement) {
        ChainNodeCircular currentNode = FirstNode;
        int index = 0;
        while(currentNode != null && !currentNode.element.equals(theElement)){
            currentNode = currentNode.next;
            index++;
        }
        if(currentNode == null){
            return -1;
        }
        else{
            return index;
        }
    }

   
    public Object remove(int index) {
        checkIndex(index);
        
        Object removedElement;
        
        if(index == 0){
            removedElement = FirstNode.element;
            FirstNode = FirstNode.next;
            lastNode = FirstNode;
        }
        else{
            ChainNodeCircular q = FirstNode;
            for(int i = 0; i<index-1; i++){
                q = q.next;
            }
            removedElement = q.next.element;
            q.next = q.next.next;
        }
        size--;
        return removedElement;
    }

    
    public void add(int index, Object theElement) {
        if (index < 0 ||index > size){
            throw new IndexOutOfBoundsException("index = "+ index+" size = "+size);
        }
        if(index == 0){
            
            FirstNode = new ChainNodeCircular(theElement, FirstNode);
            lastNode = FirstNode;
        }
        else{
            ChainNodeCircular p = FirstNode;
            for(int i = 0; i < index - 1; i++){
                p = p.next;
            }
            p.next = new ChainNodeCircular(theElement, p.next);
            lastNode = FirstNode;
        }
        size++;
    }
    
    @Override
    public String toString(){
    StringBuffer s = new StringBuffer("[");
        
        ChainNodeCircular currentNode = FirstNode;
        while(currentNode != null){
            if(currentNode.element == null){
                s.append("null, ");
            }
            else{
                s.append(currentNode.element.toString()+", ");
            }
            currentNode = currentNode.next;
        }
//        ChainNodeCircular last = tail;
//        s.append(last.element.toString()+", ");
        if(size>0){
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        
        return new String(s);
    }
    
    
    public void clear(){
        FirstNode = lastNode = null;
        size = 0;
    }
}
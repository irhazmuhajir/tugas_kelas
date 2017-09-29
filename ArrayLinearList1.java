package tugas_kelas;

public class ArrayLinearList1 extends ArrayLinearList{
    @Override
    public void add(int index, Object theElement){   
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException("index = "+index + "size = "+size);
        if(size == element.length)
            element = ChangeArrayLength.changeLength1d(element,2*size);
        
        for(int i = size - 1; i >= index; i--)
            element[i + 1] = element[i];
        	element[index] = theElement;
        	
        	size++;
    }
    
    @Override
    public void trimToSize() {
    if (size < capacity) {
        Object[] element2 = new Object[size];
        System.arraycopy(element, 0, element2, 0, size);
        element = element2;
        capacity = size;
        }
    }
    
    @Override
    public Object remove(int index){
        checkIndex(index);
        Object removeElement = element[index];
        for(int i = index + 1; i < size; i++)
            element[i-1] = element[i];
        element[--size] = null;
        return removeElement;
    }
    
    @Override
    public Object setSize(int newSize){
        if(size > newSize){
            int index = size - newSize;
            Object removeElement = element[index];
            for(int j=0; j<index; j++){
            for(int i = index + 1; i < size; i++)
                element[i-1] = element[i];
            element[--size] = null;
            }
            return removeElement;
        }
        else{
            element2 = new Object[newSize];
            System.arraycopy(element, 0, element2,0, size);
            element = element2;
        }
        return size;
    }
}




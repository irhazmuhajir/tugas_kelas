package tugas_kelas;

public class Main {
	
    public static void main(String [] args){
    	Object [] y = new Object[10];
    	
        LinearList method = new ArrayLinearList();
        method.add(0,"i");
        method.add(1,"r");
        method.add(2,"h");
        method.add(3,"a");
        method.add(4,"z");
        for (int i = 0; i < method.size(); i++) {
            System.out.print(method.element[i]+" ");
        }
        
        System.out.println();
        System.out.println("Length Array : "+method.size());
        System.out.println("Length array before trim : "+method.capacity);
        method.trimToSize();
        System.out.println("Length array after trim : "+method.capacity);
        method.setSize(6);
        System.out.println("Ukuran elemen di set menjadi: " +method.element2.length);
        method.remove(1);
        System.out.println("Tampilan setelah indek 1 dihapus");
        
        for (int i = 0; i < method.size(); i++) {
            System.out.print(method.element[i]+" ");
        }
        
        System.out.println();
        method.removeRange(0, 3);
        for (int i = 0; i < method.size; i++) {
			System.out.print("Setelah di remove range : "+method.element[i]+" ");
		}
        
        System.out.println();
        method.clone(y);
        for (int i = 0; i < method.size; i++) {
			System.out.print("Setelah di clone ke Y : "+method.element[i]+" ");
	}
    }
}


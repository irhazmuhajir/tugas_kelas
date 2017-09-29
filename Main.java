package tugas_kelas;

public class Main {
	
    public static void main(String [] args){
        ArrayLinearList x = new ArrayLinearList1();
        x.add(0,"a");
        x.add(1,"w");
        x.add(2,"e");
        x.add(3,"g");
        x.add(4,"d");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.element[i]);
        }
        
        System.out.println("Panjang Array : "+x.size());
        System.out.println("Panjang elemen sebelum di trim : "+x.capacity);
        x.trimToSize();
        System.out.println("Panjang elemen setelah di trim : "+x.capacity);
        x.setSize(6);
        System.out.println("Ukuran elemen di set menjadi: " +x.element2.length);
        x.remove(1);
        System.out.println("Tampilan setelah indek 1 dihapus");
        
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.element[i]);
        }
    }
   }


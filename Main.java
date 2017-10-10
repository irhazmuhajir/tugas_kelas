package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        
    
     ChainCircular c = new ChainCircular();
        System.out.println("Apakah kosong?\t\t\t\t"+c.isEmpty());
        c.add(0, 0);
        c.add(1, 1);
        c.add(2, 2);
        c.add(3, 3);
        c.add(4, 4);
        c.add(5, 6);
        c.add(0, 1);
        System.out.println("Index dari elemen 1 = \t\t\t"+c.indexOf(1));
        System.out.println("isi elemen =\t\t"+c.toString());
        System.out.println("Element di index 6 =\t\t\t"+c.get(6));
        
        c.remove(1);
        System.out.println("isi elemen setelah index 1 d hapus = \t"+c.toString());
        c.clear();
        System.out.println("isi elemen setelah di clear =\t\t"+c.toString());
    }

}
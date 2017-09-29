package tugas_kelas;

import java.lang.reflect.Array;

public class ChangeArrayLength {
	
    public static Object [] changeLength1d(Object [] a, int n, int newLength){
        if(n > newLength)
            throw new IllegalArgumentException("new Length is too small");
        Object [] newArray = (Object []) Array.newInstance(a.getClass().getComponentType(),newLength);
        System.arraycopy(a, 0, newArray, 0, n);
        return newArray;
    }
    static Object[] changeLength1d(Object[] element, int i) {
        return null;        
    }
}


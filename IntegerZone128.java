
package org.inra.chaching ;

import java.lang.reflect.Field ;

/**
 *
 * @author Rac021
 */
public class IntegerZone128 {
    
    public static void main(String[] args) throws Exception {
        
        final Class IntegerCache = Integer.class.getDeclaredClasses()[0]   ;
        final Field field        = IntegerCache.getDeclaredField("cache")  ;
        field.setAccessible ( true ) ;
        final Integer[] cache     = (Integer[]) field.get(IntegerCache)    ; 
        
        int   pos_zero   =  - Byte.MIN_VALUE  ;
        cache[pos_zero]  =    21              ;
        
        final int X     = 0     ;
        final int Y     = 0     ;
        final int SOMME = X + Y ;
      
        System.out.printf(" " + X + " + " + Y + "  == %d ", SOMME) ; // Gives 21  
        System.out.println(" ") ;
      
        int   POS_ONE   =  1 - Byte.MIN_VALUE  ;
        cache[POS_ONE]  =  42                  ;
        
        final int A     = 1      ;
        final int B     = 1      ;
        final int MULT  = A * B  ;
      
        System.out.printf ( " " + A + " * " + B + "  == %d ", MULT ) ; // Gives 42  
        System.out.println ( " " ) ;
    }
}

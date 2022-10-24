
public class Start3 {
    public static void main (String[] data) {
        int[][] m = {   {3, 4, 2, 1, 7},
                        {2, 8, 5, 4, 9},
                        {1, 3, 1, 7, 6} };
        System.out.println(m[2][3]); // 7
        for (int i =0; i<m.length; i++) {            
            for (int j =0;j< m[i].length; j++){
                if (i==1)
                    System.out.println(m[i][j]);
            }
             
        }
        
    }
    
}


package ex42;
import java.util.*;

public class Ex42 {

    static int path(int m[][],int i,int j){
    if(m.length==0 && m[0].length==0)
        return 0;
    if(i < 0 || i >= m.length || j < 0 || j >= m[0].length ||
                m[i][j] == -1)
        return 0;
    if((i & 1)==1)
        return m[i][j]+Math.max(path(m,i,j-1), path(m,i+1,j));
    else
    {return m[i][j]+Math.max(path(m,i,j+1), path(m,i+1,j));}
    
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int m[][]={{1,1,-1,1,1},
            {1,0,0,-1,1},
            {1,1,1,1,-1},
            {-1,-1,1,1,1},
            {1,1,-1,-1,1}};
        System.out.println("max path cover  "+path(m,0,0));
        }
    }
    


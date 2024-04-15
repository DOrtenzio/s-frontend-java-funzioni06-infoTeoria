package utili;
public class Studenti {
    public static int [] MediaxStudente(int [][] m){
        int [] a=new int[m.length];
        for (int i=0;i<a.length;i++){
            for (int p=0;p<m[0].length;p++){
                a[i]+=m[i][p];
            }
            a[i]/=m[0].length;
        }
        return a;
    }
    public static int [] MediaxProva(int [][] m){
        int [] a2=new int[m[0].length];
        for (int i=0;i<a2.length;i++){
            for (int p=0;p<m.length;p++){
                a2[i]+=m[p][i];
            }
            a2[i]/=m.length;
        }
        return a2;
    }
    public static int MaxProva(int [][] m,int colonna){
        int max=m[0][colonna];
        for (int i=0;i<m.length;i++){
            if (m[i][colonna]>max)
                max=m[i][colonna];
        }
        return max;
    }
    public static int MinProva(int [][] m,int colonna){
        int min=m[0][colonna];
        for (int i=0;i<m.length;i++){
            if (m[i][colonna]<min)
                min=m[i][colonna];
        }
        return min;
    }
    public static int MaxStudente(int [][] m,int riga){
        int max=m[riga][0];
        for (int i=0;i<m[0].length;i++){
            if (m[riga][i]>max)
                max=m[riga][i];
        }
        return max;
    }
    public static int MinStudente(int [][] m,int riga){
        int min=m[riga][0];
        for (int i=0;i<m[0].length;i++){
            if (m[riga][i]<min)
                min=m[riga][i];
        }
        return min;
    }
    public static String StampaArray (int [] m){
        String min="";
        for (int i=0;i<m.length;i++){
            min=min+m[i]+"\t";
        }
        return min;
    }
}
package utili;

import java.util.Scanner;

public class TestStudenti{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserire il numero di studenti");
        int s=in.nextInt();
        System.out.println("Inserire il numero di prove");
        int [][] m=new int[s][in.nextInt()];
        for (int i=0;i<m.length;i++){
            for (int p=0;p<m[0].length;p++){
                System.out.println("Inserire il voto di studente n° "+i+" per la prova n° "+p+" :");
                m[i][p]=in.nextInt();
            }
        }
        System.out.println("Le medie per studente sono:");
        System.out.println(Studenti.StampaArray(Studenti.MediaxStudente(m)));
        System.out.println("Le medie per prova sono:");
        System.out.println(Studenti.StampaArray(Studenti.MediaxProva(m)));
        System.out.println("Inserire il numero di prova da analizzare:");
        int prova=in.nextInt();
        if (prova<0 || prova>m[0].length)
            System.out.println("Inserire un valore valido");
        else
            System.out.println("Il voto massimo per la prova "+prova+" è: "+Studenti.MaxProva(m,prova)+" ed il minimo è: "+Studenti.MinProva(m,prova));
        System.out.println("Inserire il numero di studente da analizzare:");
        int studente=in.nextInt();
        if (studente<0 || studente>m.length)
            System.out.println("Inserire un valore valido");
        else
            System.out.println("Il voto massimo per lo studente numero "+studente+" è: "+Studenti.MaxStudente(m,studente)+" ed il minimo è: "+Studenti.MinStudente(m,studente));

    }
}

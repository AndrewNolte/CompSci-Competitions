
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andrew
 * time = 20:43
 */
public class Test {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("test.dat"));
        int numTimes = sc.nextInt();
        for (int iteration = 0; iteration < numTimes; iteration++) {

            int numTimest = sc.nextInt();
            int numOmit = sc.nextInt();
            ArrayList<Tes> scores = new ArrayList();
            for (int st = 0; st < numTimest; st++) {
                scores.add(new Tes(sc.nextDouble(), sc.nextDouble()));
            }
            //System.out.println(scores.size());
            Collections.sort(scores, new Comparator<Tes>() {
                @Override
                public int compare(Tes o1, Tes o2) {
                    return (int)(100000 * (o1.score - o2.score));
                }
            });
            //System.out.println(scores);
            int i = numOmit;
            double tr = 0;
            double t = 0;
            for (; i < scores.size(); i++) {
                tr+= scores.get(i).corr;
                t+= scores.get(i).total;
            }
            System.out.printf("%.4f", tr/t);

        }

    }

    public static class Tes{

        double score;
        double corr;
        double total;

        public Tes(double corr, double total) {
            score = corr / total;
            this.corr = corr;
            this.total = total;
        }
        
        

    }

}

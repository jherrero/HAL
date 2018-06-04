package Testing;

import Framework.GridsAndAgents.PDEGrid2D;
import Framework.Tools.Timer;

/**
 * Created by rafael on 9/19/17.
 */
public class DiffTest4 {
    public static void main(String[] args) {
        Timer t=new Timer();
        PDEGrid2D g=new PDEGrid2D(400,400);
        double[]testArr=new double[100000];
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < testArr.length; j++) {
                testArr[j]+=100;
            }
        }
        t.Lap("DiffTest");
    }
}

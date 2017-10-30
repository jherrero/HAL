package LEARN_HERE.Other;

import Framework.Gui.GridVisWindow;
import Framework.Gui.GuiGridVis;

import static Framework.Utils.RGB;

public class PlotExample {
    public static void main(String[] args) {
        double[] xData = new double[] { 0.0, 1.0, 2.0, 3.0, 4.0, 5.0 };
        double[] yData = new double[] { 2.0, 1.0, 2.0, 2.0, 3.0, 6.0 };

        GridVisWindow win=new GridVisWindow(1000,1000,1);
        win.PlotLine(xData,yData,RGB(1,0,0),1000/6);
    }
}

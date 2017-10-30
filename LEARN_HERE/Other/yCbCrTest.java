package LEARN_HERE.Other;

import Framework.Gui.GridVisWindow;
import static Framework.Utils.*;

/**
 * Created by Rafael on 10/12/2017.
 */
public class yCbCrTest {
    public static void main(String[] args) {
        GridVisWindow win=new GridVisWindow("CbCrPlane",100,100,10,true);
        for (int x = 0; x < win.xDim; x++) {
            for (int y = 0; y < win.yDim; y++) {
                win.SetPix(x, y, CbCrPlaneColor(x*1.0/win.xDim,y*1.0/win.yDim));
            }
        }
    }
}

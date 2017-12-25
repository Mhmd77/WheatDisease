package ir.hoshmand.zamin.iran.wheatdisease.ui;

/**
 * Created by Mohammad on 12/20/2017.
 */

import android.content.res.AssetManager;
import android.graphics.Typeface;


public class TypeFaceHandler {
    public static Typeface sultanLight;
    public static Typeface sultanBold;
    public static Typeface bYekanLight;


    public TypeFaceHandler(AssetManager manager) {
        sultanLight = Typeface.createFromAsset(manager, "fonts/Sultan_Adan_Light.TTF");
        sultanBold = Typeface.createFromAsset(manager, "fonts/Sultan_Adan_Bold.TTF");
        bYekanLight = Typeface.createFromAsset(manager, "fonts/W_yekan.ttf");
    }

}

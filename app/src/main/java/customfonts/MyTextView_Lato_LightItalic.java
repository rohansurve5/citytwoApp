package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyTextView_Lato_LightItalic extends TextView {

    public MyTextView_Lato_LightItalic(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView_Lato_LightItalic(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView_Lato_LightItalic(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-LightItalic.ttf");
            setTypeface(tf);
        }
    }

}
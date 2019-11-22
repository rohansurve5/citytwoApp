package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class Textview_Lora_Italic extends TextView {

    public Textview_Lora_Italic(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Textview_Lora_Italic(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Textview_Lora_Italic(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-RegularItalic.ttf");
            setTypeface(tf);
        }
    }

}
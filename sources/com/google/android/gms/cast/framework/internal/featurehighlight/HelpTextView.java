package com.google.android.gms.cast.framework.internal.featurehighlight;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class HelpTextView extends android.widget.LinearLayout {
    private android.widget.TextView bodyTextView;
    private android.widget.TextView headerTextView;

    @androidx.annotation.Keep
    public HelpTextView(@androidx.annotation.RecentlyNonNull android.content.Context r1, @androidx.annotation.RecentlyNonNull android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void setTextAndVisibility(android.widget.TextView r2, java.lang.CharSequence r3) {
            r1 = this;
            r2.setText(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r0 = 1
            if (r0 == r3) goto Lc
            r3 = 0
            goto Le
        Lc:
            r3 = 8
        Le:
            r2.setVisibility(r3)
            return
    }

    @androidx.annotation.RecentlyNonNull
    @androidx.annotation.Keep
    public android.view.View asView() {
            r0 = this;
            return r0
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            r0 = 2131362010(0x7f0a00da, float:1.8343788E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.Objects.requireNonNull(r0)
            r1.headerTextView = r0
            r0 = 2131362009(0x7f0a00d9, float:1.8343786E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.Objects.requireNonNull(r0)
            r1.bodyTextView = r0
            return
    }

    @androidx.annotation.Keep
    public void setText(java.lang.CharSequence r2, java.lang.CharSequence r3) {
            r1 = this;
            android.widget.TextView r0 = r1.headerTextView
            r1.setTextAndVisibility(r0, r2)
            android.widget.TextView r2 = r1.bodyTextView
            r1.setTextAndVisibility(r2, r3)
            return
    }
}

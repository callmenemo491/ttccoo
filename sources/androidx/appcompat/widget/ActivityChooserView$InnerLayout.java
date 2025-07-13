package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends android.widget.LinearLayout {

    /* renamed from: a0 */
    public static final int[] f976a0 = null;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842964(0x10100d4, float:2.3694152E-38)
            r0[r1] = r2
            androidx.appcompat.widget.ActivityChooserView$InnerLayout.f976a0 = r0
            return
    }

    public ActivityChooserView$InnerLayout(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            int[] r0 = androidx.appcompat.widget.ActivityChooserView$InnerLayout.f976a0
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
            r0 = 0
            boolean r1 = r4.hasValue(r0)
            if (r1 == 0) goto L1b
            int r1 = r4.getResourceId(r0, r0)
            if (r1 == 0) goto L1b
            android.graphics.drawable.Drawable r3 = p102g.C2199a.m5784b(r3, r1)
            goto L1f
        L1b:
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r0)
        L1f:
            r2.setBackgroundDrawable(r3)
            r4.recycle()
            return
    }
}

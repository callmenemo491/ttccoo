package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class DialogTitle extends androidx.appcompat.widget.AppCompatTextView {
    public DialogTitle(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            super.onMeasure(r7, r8)
            android.text.Layout r0 = r6.getLayout()
            if (r0 == 0) goto L40
            int r1 = r0.getLineCount()
            if (r1 <= 0) goto L40
            int r1 = r1 + (-1)
            int r0 = r0.getEllipsisCount(r1)
            if (r0 <= 0) goto L40
            r0 = 0
            r6.setSingleLine(r0)
            r1 = 2
            r6.setMaxLines(r1)
            android.content.Context r1 = r6.getContext()
            r2 = 0
            int[] r3 = p064e.C1495i.f7280w
            r4 = 16842817(0x1010041, float:2.369374E-38)
            r5 = 16973892(0x1030044, float:2.406109E-38)
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            int r2 = r1.getDimensionPixelSize(r0, r0)
            if (r2 == 0) goto L3a
            float r2 = (float) r2
            r6.setTextSize(r0, r2)
        L3a:
            r1.recycle()
            super.onMeasure(r7, r8)
        L40:
            return
    }
}

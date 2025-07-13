package com.google.android.material.textview;

/* loaded from: classes.dex */
public class MaterialTextView extends androidx.appcompat.widget.AppCompatTextView {
    public MaterialTextView(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1 = 0
            android.content.Context r8 = p431y8.C7133a.m14245a(r8, r9, r0, r1)
            r7.<init>(r8, r9, r0)
            android.content.Context r8 = r7.getContext()
            r2 = 2130969556(0x7f0403d4, float:1.7547797E38)
            r3 = 1
            boolean r2 = p288q8.C5598b.m11873b(r8, r2, r3)
            if (r2 == 0) goto L47
            android.content.res.Resources$Theme r2 = r8.getTheme()
            int[] r4 = p339t7.C6183a.f23990C
            android.content.res.TypedArray r5 = r2.obtainStyledAttributes(r9, r4, r0, r1)
            r6 = 2
            int[] r6 = new int[r6]
            r6 = {x0048: FILL_ARRAY_DATA , data: [1, 2} // fill-array
            int r8 = m3599e(r8, r5, r6)
            r5.recycle()
            r5 = -1
            if (r8 == r5) goto L34
            goto L35
        L34:
            r3 = 0
        L35:
            if (r3 != 0) goto L47
            android.content.res.TypedArray r8 = r2.obtainStyledAttributes(r9, r4, r0, r1)
            int r9 = r8.getResourceId(r1, r5)
            r8.recycle()
            if (r9 == r5) goto L47
            r7.m3600c(r2, r9)
        L47:
            return
    }

    /* renamed from: e */
    public static int m3599e(android.content.Context r4, android.content.res.TypedArray r5, int... r6) {
            r0 = -1
            r1 = 0
            r2 = -1
        L3:
            int r3 = r6.length
            if (r1 >= r3) goto L11
            if (r2 >= 0) goto L11
            r2 = r6[r1]
            int r2 = p288q8.C5599c.m11877c(r4, r5, r2, r0)
            int r1 = r1 + 1
            goto L3
        L11:
            return r2
    }

    /* renamed from: c */
    public final void m3600c(android.content.res.Resources.Theme r2, int r3) {
            r1 = this;
            int[] r0 = p339t7.C6183a.f23989B
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            android.content.Context r3 = r1.getContext()
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x001e: FILL_ARRAY_DATA , data: [1, 2} // fill-array
            int r3 = m3599e(r3, r2, r0)
            r2.recycle()
            if (r3 < 0) goto L1c
            r1.setLineHeight(r3)
        L1c:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(android.content.Context r3, int r4) {
            r2 = this;
            super.setTextAppearance(r3, r4)
            r0 = 2130969556(0x7f0403d4, float:1.7547797E38)
            r1 = 1
            boolean r0 = p288q8.C5598b.m11873b(r3, r0, r1)
            if (r0 == 0) goto L14
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r2.m3600c(r3, r4)
        L14:
            return
    }
}

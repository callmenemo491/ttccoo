package com.google.android.material.snackbar;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends android.widget.LinearLayout {

    /* renamed from: a0 */
    public android.widget.TextView f6255a0;

    /* renamed from: b0 */
    public android.widget.Button f6256b0;

    /* renamed from: c0 */
    public int f6257c0;

    /* renamed from: d0 */
    public int f6258d0;

    public SnackbarContentLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int[] r0 = p339t7.C6183a.f23997J
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = 0
            r0 = -1
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f6257c0 = r3
            r3 = 7
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f6258d0 = r3
            r2.recycle()
            return
    }

    /* renamed from: a */
    public final boolean m3497a(int r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.getOrientation()
            r1 = 1
            if (r4 == r0) goto Lc
            r3.setOrientation(r4)
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            android.widget.TextView r0 = r3.f6255a0
            int r0 = r0.getPaddingTop()
            if (r0 != r5) goto L20
            android.widget.TextView r0 = r3.f6255a0
            int r0 = r0.getPaddingBottom()
            if (r0 == r6) goto L1e
            goto L20
        L1e:
            r1 = r4
            goto L41
        L20:
            android.widget.TextView r4 = r3.f6255a0
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.d.m10578g(r4)
            if (r0 == 0) goto L36
            int r0 = p227n0.C4661t.d.m10577f(r4)
            int r2 = p227n0.C4661t.d.m10576e(r4)
            p227n0.C4661t.d.m10582k(r4, r0, r5, r2, r6)
            goto L41
        L36:
            int r0 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            r4.setPadding(r0, r5, r2, r6)
        L41:
            return r1
    }

    public android.widget.Button getActionView() {
            r1 = this;
            android.widget.Button r0 = r1.f6256b0
            return r0
    }

    public android.widget.TextView getMessageView() {
            r1 = this;
            android.widget.TextView r0 = r1.f6255a0
            return r0
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            r0 = 2131362601(0x7f0a0329, float:1.8344987E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f6255a0 = r0
            r0 = 2131362600(0x7f0a0328, float:1.8344985E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.f6256b0 = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int r8, int r9) {
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f6257c0
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f6257c0
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165359(0x7f0700af, float:1.7944933E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131165358(0x7f0700ae, float:1.794493E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f6255a0
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3e
            r2 = 1
            goto L3f
        L3e:
            r2 = 0
        L3f:
            if (r2 == 0) goto L58
            int r5 = r7.f6258d0
            if (r5 <= 0) goto L58
            android.widget.Button r5 = r7.f6256b0
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f6258d0
            if (r5 <= r6) goto L58
            int r1 = r0 - r1
            boolean r0 = r7.m3497a(r4, r0, r1)
            if (r0 == 0) goto L63
            goto L62
        L58:
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            r0 = r1
        L5c:
            boolean r0 = r7.m3497a(r3, r0, r0)
            if (r0 == 0) goto L63
        L62:
            r3 = 1
        L63:
            if (r3 == 0) goto L68
            super.onMeasure(r8, r9)
        L68:
            return
    }

    public void setMaxInlineActionWidth(int r1) {
            r0 = this;
            r0.f6258d0 = r1
            return
    }
}

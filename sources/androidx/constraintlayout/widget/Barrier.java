package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class Barrier extends androidx.constraintlayout.widget.AbstractC0332a {

    /* renamed from: i0 */
    public int f1685i0;

    /* renamed from: j0 */
    public int f1686j0;

    /* renamed from: k0 */
    public p381w.C6760a f1687k0;

    public Barrier(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Barrier(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public int getMargin() {
            r1 = this;
            w.a r0 = r1.f1687k0
            int r0 = r0.f26064L0
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.f1685i0
            return r0
    }

    @Override // androidx.constraintlayout.widget.AbstractC0332a
    /* renamed from: k */
    public void mo900k(android.util.AttributeSet r7) {
            r6 = this;
            super.mo900k(r7)
            w.a r0 = new w.a
            r0.<init>()
            r6.f1687k0 = r0
            if (r7 == 0) goto L4e
            android.content.Context r0 = r6.getContext()
            int[] r1 = p422y.C7096f.f27456b
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = 0
        L1c:
            if (r2 >= r0) goto L4b
            int r3 = r7.getIndex(r2)
            r4 = 15
            if (r3 != r4) goto L2e
            int r3 = r7.getInt(r3, r1)
            r6.setType(r3)
            goto L48
        L2e:
            r4 = 14
            if (r3 != r4) goto L3c
            w.a r4 = r6.f1687k0
            r5 = 1
            boolean r3 = r7.getBoolean(r3, r5)
            r4.f26063K0 = r3
            goto L48
        L3c:
            r4 = 16
            if (r3 != r4) goto L48
            int r3 = r7.getDimensionPixelSize(r3, r1)
            w.a r4 = r6.f1687k0
            r4.f26064L0 = r3
        L48:
            int r2 = r2 + 1
            goto L1c
        L4b:
            r7.recycle()
        L4e:
            w.a r7 = r6.f1687k0
            r6.f1781d0 = r7
            r6.m941n()
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC0332a
    /* renamed from: l */
    public void mo919l(androidx.constraintlayout.widget.C0333b.a r1, p381w.C6770k r2, androidx.constraintlayout.widget.ConstraintLayout.C0330a r3, android.util.SparseArray<p381w.C6765f> r4) {
            r0 = this;
            super.mo919l(r1, r2, r3, r4)
            boolean r3 = r2 instanceof p381w.C6760a
            if (r3 == 0) goto L21
            r3 = r2
            w.a r3 = (p381w.C6760a) r3
            w.f r2 = r2.f26128R
            w.g r2 = (p381w.C6766g) r2
            boolean r2 = r2.f26197L0
            androidx.constraintlayout.widget.b$b r4 = r1.f1794d
            int r4 = r4.f1827b0
            r0.m921o(r3, r4, r2)
            androidx.constraintlayout.widget.b$b r1 = r1.f1794d
            boolean r2 = r1.f1843j0
            r3.f26063K0 = r2
            int r1 = r1.f1829c0
            r3.f26064L0 = r1
        L21:
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC0332a
    /* renamed from: m */
    public void mo920m(p381w.C6765f r2, boolean r3) {
            r1 = this;
            int r0 = r1.f1685i0
            r1.m921o(r2, r0, r3)
            return
    }

    /* renamed from: o */
    public final void m921o(p381w.C6765f r4, int r5, boolean r6) {
            r3 = this;
            r3.f1686j0 = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L12
            int r6 = r3.f1685i0
            if (r6 != r2) goto Lf
        Lc:
            r3.f1686j0 = r5
            goto L1c
        Lf:
            if (r6 != r1) goto L1c
            goto L16
        L12:
            int r6 = r3.f1685i0
            if (r6 != r2) goto L19
        L16:
            r3.f1686j0 = r0
            goto L1c
        L19:
            if (r6 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof p381w.C6760a
            if (r5 == 0) goto L26
            w.a r4 = (p381w.C6760a) r4
            int r5 = r3.f1686j0
            r4.f26062J0 = r5
        L26:
            return
    }

    public void setAllowsGoneWidget(boolean r2) {
            r1 = this;
            w.a r0 = r1.f1687k0
            r0.f26063K0 = r2
            return
    }

    public void setDpMargin(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = (float) r2
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            w.a r0 = r1.f1687k0
            r0.f26064L0 = r2
            return
    }

    public void setMargin(int r2) {
            r1 = this;
            w.a r0 = r1.f1687k0
            r0.f26064L0 = r2
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.f1685i0 = r1
            return
    }
}

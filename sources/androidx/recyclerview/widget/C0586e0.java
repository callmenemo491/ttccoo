package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e0 */
/* loaded from: classes.dex */
public class C0586e0 extends androidx.recyclerview.widget.AbstractC0598k0 {

    /* renamed from: c */
    public androidx.recyclerview.widget.AbstractC0582c0 f3401c;

    /* renamed from: d */
    public androidx.recyclerview.widget.AbstractC0582c0 f3402d;

    public C0586e0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.recyclerview.widget.AbstractC0598k0
    /* renamed from: b */
    public int[] mo2026b(androidx.recyclerview.widget.RecyclerView.AbstractC0557m r5, android.view.View r6) {
            r4 = this;
            r0 = 2
            int[] r0 = new int[r0]
            boolean r1 = r5.mo1687g()
            r2 = 0
            if (r1 == 0) goto L15
            androidx.recyclerview.widget.c0 r1 = r4.m2030g(r5)
            int r1 = r4.m2028e(r6, r1)
            r0[r2] = r1
            goto L17
        L15:
            r0[r2] = r2
        L17:
            boolean r1 = r5.mo1689h()
            r3 = 1
            if (r1 == 0) goto L29
            androidx.recyclerview.widget.c0 r5 = r4.m2031h(r5)
            int r5 = r4.m2028e(r6, r5)
            r0[r3] = r5
            goto L2b
        L29:
            r0[r3] = r2
        L2b:
            return r0
    }

    @Override // androidx.recyclerview.widget.AbstractC0598k0
    /* renamed from: c */
    public android.view.View mo2027c(androidx.recyclerview.widget.RecyclerView.AbstractC0557m r2) {
            r1 = this;
            boolean r0 = r2.mo1689h()
            if (r0 == 0) goto Lf
            androidx.recyclerview.widget.c0 r0 = r1.m2031h(r2)
        La:
            android.view.View r2 = r1.m2029f(r2, r0)
            return r2
        Lf:
            boolean r0 = r2.mo1687g()
            if (r0 == 0) goto L1a
            androidx.recyclerview.widget.c0 r0 = r1.m2030g(r2)
            goto La
        L1a:
            r2 = 0
            return r2
    }

    /* renamed from: e */
    public final int m2028e(android.view.View r2, androidx.recyclerview.widget.AbstractC0582c0 r3) {
            r1 = this;
            int r0 = r3.mo2000e(r2)
            int r2 = r3.mo1998c(r2)
            int r2 = r2 / 2
            int r2 = r2 + r0
            int r0 = r3.mo2006k()
            int r3 = r3.mo2007l()
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r2 = r2 - r3
            return r2
    }

    /* renamed from: f */
    public final android.view.View m2029f(androidx.recyclerview.widget.RecyclerView.AbstractC0557m r9, androidx.recyclerview.widget.AbstractC0582c0 r10) {
            r8 = this;
            int r0 = r9.m1891z()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r10.mo2006k()
            int r3 = r10.mo2007l()
            int r3 = r3 / 2
            int r3 = r3 + r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
        L17:
            if (r4 >= r0) goto L34
            android.view.View r5 = r9.m1889y(r4)
            int r6 = r10.mo2000e(r5)
            int r7 = r10.mo1998c(r5)
            int r7 = r7 / 2
            int r7 = r7 + r6
            int r7 = r7 - r3
            int r6 = java.lang.Math.abs(r7)
            if (r6 >= r2) goto L31
            r1 = r5
            r2 = r6
        L31:
            int r4 = r4 + 1
            goto L17
        L34:
            return r1
    }

    /* renamed from: g */
    public final androidx.recyclerview.widget.AbstractC0582c0 m2030g(androidx.recyclerview.widget.RecyclerView.AbstractC0557m r2) {
            r1 = this;
            androidx.recyclerview.widget.c0 r0 = r1.f3402d
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.f3380a
            if (r0 == r2) goto Lf
        L8:
            androidx.recyclerview.widget.a0 r0 = new androidx.recyclerview.widget.a0
            r0.<init>(r2)
            r1.f3402d = r0
        Lf:
            androidx.recyclerview.widget.c0 r2 = r1.f3402d
            return r2
    }

    /* renamed from: h */
    public final androidx.recyclerview.widget.AbstractC0582c0 m2031h(androidx.recyclerview.widget.RecyclerView.AbstractC0557m r2) {
            r1 = this;
            androidx.recyclerview.widget.c0 r0 = r1.f3401c
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.f3380a
            if (r0 == r2) goto Lf
        L8:
            androidx.recyclerview.widget.b0 r0 = new androidx.recyclerview.widget.b0
            r0.<init>(r2)
            r1.f3401c = r0
        Lf:
            androidx.recyclerview.widget.c0 r2 = r1.f3401c
            return r2
    }
}

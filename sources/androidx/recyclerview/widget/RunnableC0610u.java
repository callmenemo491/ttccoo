package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.u */
/* loaded from: classes.dex */
public class RunnableC0610u implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ androidx.recyclerview.widget.C0609t.f f3620Y;

    /* renamed from: Z */
    public final /* synthetic */ int f3621Z;

    /* renamed from: a0 */
    public final /* synthetic */ androidx.recyclerview.widget.C0609t f3622a0;

    public RunnableC0610u(androidx.recyclerview.widget.C0609t r1, androidx.recyclerview.widget.C0609t.f r2, int r3) {
            r0 = this;
            r0.f3622a0 = r1
            r0.f3620Y = r2
            r0.f3621Z = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            androidx.recyclerview.widget.t r0 = r5.f3622a0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f3585r
            if (r0 == 0) goto L5f
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L5f
            androidx.recyclerview.widget.t$f r0 = r5.f3620Y
            boolean r1 = r0.f3614k
            if (r1 != 0) goto L5f
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f3608e
            int r0 = r0.m1788e()
            r1 = -1
            if (r0 == r1) goto L5f
            androidx.recyclerview.widget.t r0 = r5.f3622a0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f3585r
            androidx.recyclerview.widget.RecyclerView$j r0 = r0.getItemAnimator()
            if (r0 == 0) goto L2b
            boolean r0 = r0.mo1835h()
            if (r0 != 0) goto L58
        L2b:
            androidx.recyclerview.widget.t r0 = r5.f3622a0
            java.util.List<androidx.recyclerview.widget.t$f> r1 = r0.f3583p
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        L35:
            if (r3 >= r1) goto L48
            java.util.List<androidx.recyclerview.widget.t$f> r4 = r0.f3583p
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.t$f r4 = (androidx.recyclerview.widget.C0609t.f) r4
            boolean r4 = r4.f3615l
            if (r4 != 0) goto L45
            r2 = 1
            goto L48
        L45:
            int r3 = r3 + 1
            goto L35
        L48:
            if (r2 != 0) goto L58
            androidx.recyclerview.widget.t r0 = r5.f3622a0
            androidx.recyclerview.widget.t$d r0 = r0.f3580m
            androidx.recyclerview.widget.t$f r1 = r5.f3620Y
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.f3608e
            int r2 = r5.f3621Z
            r0.mo2138j(r1, r2)
            goto L5f
        L58:
            androidx.recyclerview.widget.t r0 = r5.f3622a0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f3585r
            r0.post(r5)
        L5f:
            return
    }
}

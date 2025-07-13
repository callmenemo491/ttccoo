package p190kc;

/* renamed from: kc.i */
/* loaded from: classes.dex */
public abstract class AbstractC4088i extends p190kc.AbstractC4087h {
    public AbstractC4088i(p453zb.C7269a r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: d */
    public abstract void mo9174d(java.lang.StringBuilder r1, int r2);

    /* renamed from: e */
    public abstract int mo9175e(int r1);

    /* renamed from: f */
    public final void m9179f(java.lang.StringBuilder r3, int r4, int r5) {
            r2 = this;
            androidx.fragment.app.l0 r0 = r2.f17006b
            java.util.ArrayList<androidx.fragment.app.n> r0 = r0.f2230Z
            zb.a r0 = (p453zb.C7269a) r0
            int r4 = androidx.fragment.app.C0392l0.m1242t(r0, r4, r5)
            r2.mo9174d(r3, r4)
            int r4 = r2.mo9175e(r4)
            r5 = 100000(0x186a0, float:1.4013E-40)
            r0 = 0
        L15:
            r1 = 5
            if (r0 >= r1) goto L26
            int r1 = r4 / r5
            if (r1 != 0) goto L21
            r1 = 48
            r3.append(r1)
        L21:
            int r5 = r5 / 10
            int r0 = r0 + 1
            goto L15
        L26:
            r3.append(r4)
            return
    }
}

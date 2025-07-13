package androidx.lifecycle;

/* renamed from: androidx.lifecycle.g0 */
/* loaded from: classes.dex */
public final class C0443g0 extends p379vh.AbstractC6755z {

    /* renamed from: Z */
    public final androidx.lifecycle.C0448j f2497Z;

    public C0443g0() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.j r0 = new androidx.lifecycle.j
            r0.<init>()
            r1.f2497Z = r0
            return
    }

    @Override // p379vh.AbstractC6755z
    /* renamed from: x0 */
    public void mo156x0(p101fh.InterfaceC2175g r4, java.lang.Runnable r5) {
            r3 = this;
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r4, r0)
            androidx.lifecycle.j r0 = r3.f2497Z
            java.util.Objects.requireNonNull(r0)
            vh.z r1 = p379vh.C6716l0.f26007a
            vh.k1 r1 = p459zh.C7346l.f28106a
            vh.k1 r1 = r1.mo13640z0()
            boolean r2 = r1.mo1433y0(r4)
            if (r2 != 0) goto L23
            boolean r2 = r0.m1437a()
            if (r2 == 0) goto L1f
            goto L23
        L1f:
            r0.m1439c(r5)
            goto L2b
        L23:
            androidx.lifecycle.i r2 = new androidx.lifecycle.i
            r2.<init>(r0, r4, r5)
            r1.mo156x0(r4, r2)
        L2b:
            return
    }

    @Override // p379vh.AbstractC6755z
    /* renamed from: y0 */
    public boolean mo1433y0(p101fh.InterfaceC2175g r2) {
            r1 = this;
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r2, r0)
            vh.z r0 = p379vh.C6716l0.f26007a
            vh.k1 r0 = p459zh.C7346l.f28106a
            vh.k1 r0 = r0.mo13640z0()
            boolean r2 = r0.mo1433y0(r2)
            r0 = 1
            if (r2 == 0) goto L15
            return r0
        L15:
            androidx.lifecycle.j r2 = r1.f2497Z
            boolean r2 = r2.m1437a()
            r2 = r2 ^ r0
            return r2
    }
}

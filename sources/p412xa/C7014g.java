package p412xa;

/* renamed from: xa.g */
/* loaded from: classes.dex */
public class C7014g implements p412xa.InterfaceC7016i {

    /* renamed from: a */
    public final p327s7.C5986j<java.lang.String> f27329a;

    public C7014g(p327s7.C5986j<java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            r0.f27329a = r1
            return
    }

    @Override // p412xa.InterfaceC7016i
    /* renamed from: a */
    public boolean mo14166a(za.AbstractC7268d r5) {
            r4 = this;
            za.c$a r0 = r5.mo14347f()
            za.c$a r1 = za.C7267c.a.f27895a0
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L1d
            boolean r0 = r5.m14359j()
            if (r0 != 0) goto L1d
            boolean r0 = r5.m14357h()
            if (r0 == 0) goto L1c
            goto L1d
        L1c:
            return r2
        L1d:
            s7.j<java.lang.String> r0 = r4.f27329a
            java.lang.String r5 = r5.mo14344c()
            r0.m12459b(r5)
            return r3
    }

    @Override // p412xa.InterfaceC7016i
    /* renamed from: b */
    public boolean mo14167b(java.lang.Exception r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}

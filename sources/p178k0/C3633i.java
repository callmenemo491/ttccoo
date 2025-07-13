package p178k0;

/* renamed from: k0.i */
/* loaded from: classes.dex */
public class C3633i implements p212m0.InterfaceC4311a<p178k0.C3634j.a> {

    /* renamed from: a */
    public final /* synthetic */ java.lang.String f16025a;

    public C3633i(java.lang.String r1) {
            r0 = this;
            r0.f16025a = r1
            r0.<init>()
            return
    }

    @Override // p212m0.InterfaceC4311a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo8073a(p178k0.C3634j.a r1) {
            r0 = this;
            k0.j$a r1 = (p178k0.C3634j.a) r1
            r0.m8074b(r1)
            return
    }

    /* renamed from: b */
    public void m8074b(p178k0.C3634j.a r5) {
            r4 = this;
            java.lang.Object r0 = p178k0.C3634j.f16028c
            monitor-enter(r0)
            s.h<java.lang.String, java.util.ArrayList<m0.a<k0.j$a>>> r1 = p178k0.C3634j.f16029d     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r4.f16025a     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L2b
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L11:
            java.lang.String r3 = r4.f16025a     // Catch: java.lang.Throwable -> L2b
            r1.remove(r3)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            r0 = 0
        L18:
            int r1 = r2.size()
            if (r0 >= r1) goto L2a
            java.lang.Object r1 = r2.get(r0)
            m0.a r1 = (p212m0.InterfaceC4311a) r1
            r1.mo8073a(r5)
            int r0 = r0 + 1
            goto L18
        L2a:
            return
        L2b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r5
    }
}

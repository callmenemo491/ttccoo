package p445z2;

/* renamed from: z2.a */
/* loaded from: classes.dex */
public class C7227a implements p445z2.InterfaceC7234h {

    /* renamed from: Y */
    public final java.util.Set<p445z2.InterfaceC7235i> f27799Y;

    /* renamed from: Z */
    public boolean f27800Z;

    /* renamed from: a0 */
    public boolean f27801a0;

    public C7227a() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.f27799Y = r0
            return
    }

    /* renamed from: a */
    public void m14288a() {
            r2 = this;
            r0 = 1
            r2.f27801a0 = r0
            java.util.Set<z2.i> r0 = r2.f27799Y
            java.util.List r0 = p106g3.C2238j.m5845e(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            z2.i r1 = (p445z2.InterfaceC7235i) r1
            r1.mo2576m()
            goto Lf
        L1f:
            return
    }

    /* renamed from: b */
    public void m14289b() {
            r2 = this;
            r0 = 1
            r2.f27800Z = r0
            java.util.Set<z2.i> r0 = r2.f27799Y
            java.util.List r0 = p106g3.C2238j.m5845e(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            z2.i r1 = (p445z2.InterfaceC7235i) r1
            r1.mo2575l()
            goto Lf
        L1f:
            return
    }

    @Override // p445z2.InterfaceC7234h
    /* renamed from: c */
    public void mo13180c(p445z2.InterfaceC7235i r2) {
            r1 = this;
            java.util.Set<z2.i> r0 = r1.f27799Y
            r0.remove(r2)
            return
    }

    /* renamed from: d */
    public void m14290d() {
            r2 = this;
            r0 = 0
            r2.f27800Z = r0
            java.util.Set<z2.i> r0 = r2.f27799Y
            java.util.List r0 = p106g3.C2238j.m5845e(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            z2.i r1 = (p445z2.InterfaceC7235i) r1
            r1.mo2567d()
            goto Lf
        L1f:
            return
    }

    @Override // p445z2.InterfaceC7234h
    /* renamed from: h */
    public void mo13181h(p445z2.InterfaceC7235i r2) {
            r1 = this;
            java.util.Set<z2.i> r0 = r1.f27799Y
            r0.add(r2)
            boolean r0 = r1.f27801a0
            if (r0 == 0) goto Ld
            r2.mo2576m()
            goto L18
        Ld:
            boolean r0 = r1.f27800Z
            if (r0 == 0) goto L15
            r2.mo2575l()
            goto L18
        L15:
            r2.mo2567d()
        L18:
            return
    }
}

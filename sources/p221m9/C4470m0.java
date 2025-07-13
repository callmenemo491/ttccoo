package p221m9;

/* renamed from: m9.m0 */
/* loaded from: classes.dex */
public class C4470m0 implements p221m9.InterfaceC4467l0 {
    public C4470m0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p221m9.InterfaceC4467l0
    /* renamed from: a */
    public java.lang.Object mo10187a(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            m9.k0 r2 = (p221m9.C4464k0) r2
            m9.k0 r3 = (p221m9.C4464k0) r3
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2c
            boolean r0 = r2.f18189Y
            if (r0 != 0) goto L20
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1a
            m9.k0 r2 = new m9.k0
            r2.<init>()
            goto L20
        L1a:
            m9.k0 r0 = new m9.k0
            r0.<init>(r2)
            r2 = r0
        L20:
            r2.m10178b()
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2c
            r2.putAll(r3)
        L2c:
            return r2
    }

    @Override // p221m9.InterfaceC4467l0
    /* renamed from: b */
    public java.lang.Object mo10188b(java.lang.Object r2) {
            r1 = this;
            m9.k0 r2 = p221m9.C4464k0.f18188Z
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Le
            m9.k0 r2 = new m9.k0
            r2.<init>()
            goto L14
        Le:
            m9.k0 r0 = new m9.k0
            r0.<init>(r2)
            r2 = r0
        L14:
            return r2
    }

    @Override // p221m9.InterfaceC4467l0
    /* renamed from: c */
    public int mo10189c(int r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            m9.k0 r6 = (p221m9.C4464k0) r6
            m9.j0 r7 = (p221m9.C4461j0) r7
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            goto L3a
        Lc:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Objects.requireNonNull(r7)
            int r3 = p221m9.AbstractC4463k.m10131F(r5)
            int r0 = p221m9.C4461j0.m10125a(r2, r0)
            int r0 = p221m9.AbstractC4463k.m10151w(r0)
            int r0 = r0 + r3
            int r1 = r1 + r0
            goto L14
        L3a:
            return r1
    }

    @Override // p221m9.InterfaceC4467l0
    /* renamed from: d */
    public boolean mo10190d(java.lang.Object r1) {
            r0 = this;
            m9.k0 r1 = (p221m9.C4464k0) r1
            boolean r1 = r1.f18189Y
            r1 = r1 ^ 1
            return r1
    }

    @Override // p221m9.InterfaceC4467l0
    /* renamed from: e */
    public java.lang.Object mo10191e(java.lang.Object r3) {
            r2 = this;
            r0 = r3
            m9.k0 r0 = (p221m9.C4464k0) r0
            r1 = 0
            r0.f18189Y = r1
            return r3
    }

    @Override // p221m9.InterfaceC4467l0
    /* renamed from: f */
    public p221m9.C4461j0.a<?, ?> mo10192f(java.lang.Object r1) {
            r0 = this;
            m9.j0 r1 = (p221m9.C4461j0) r1
            java.util.Objects.requireNonNull(r1)
            r1 = 0
            return r1
    }

    @Override // p221m9.InterfaceC4467l0
    /* renamed from: g */
    public java.util.Map<?, ?> mo10193g(java.lang.Object r1) {
            r0 = this;
            m9.k0 r1 = (p221m9.C4464k0) r1
            return r1
    }

    @Override // p221m9.InterfaceC4467l0
    /* renamed from: h */
    public java.util.Map<?, ?> mo10194h(java.lang.Object r1) {
            r0 = this;
            m9.k0 r1 = (p221m9.C4464k0) r1
            return r1
    }
}

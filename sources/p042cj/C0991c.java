package p042cj;

/* renamed from: cj.c */
/* loaded from: classes.dex */
public class C0991c extends p317ri.AbstractC5894m implements p317ri.InterfaceC5867d {

    /* renamed from: c0 */
    public static p211m.AbstractC4310c f5075c0;

    /* renamed from: Y */
    public boolean f5076Y;

    /* renamed from: Z */
    public int f5077Z;

    /* renamed from: a0 */
    public p211m.AbstractC4310c f5078a0;

    /* renamed from: b0 */
    public p042cj.C0990b[] f5079b0;

    static {
            m.c r0 = dj.C1484b.f7245d
            p042cj.C0991c.f5075c0 = r0
            return
    }

    public C0991c(p317ri.AbstractC5915t r6) {
            r5 = this;
            m.c r0 = p042cj.C0991c.f5075c0
            r5.<init>()
            r5.f5078a0 = r0
            int r0 = r6.size()
            cj.b[] r0 = new p042cj.C0990b[r0]
            r5.f5079b0 = r0
            java.util.Enumeration r6 = r6.mo12278H()
            r0 = 0
        L14:
            boolean r1 = r6.hasMoreElements()
            if (r1 == 0) goto L3b
            cj.b[] r1 = r5.f5079b0
            int r2 = r0 + 1
            java.lang.Object r3 = r6.nextElement()
            boolean r4 = r3 instanceof p042cj.C0990b
            if (r4 == 0) goto L29
            cj.b r3 = (p042cj.C0990b) r3
            goto L37
        L29:
            if (r3 == 0) goto L36
            cj.b r4 = new cj.b
            ri.v r3 = p317ri.AbstractC5921v.m12284C(r3)
            r4.<init>(r3)
            r3 = r4
            goto L37
        L36:
            r3 = 0
        L37:
            r1[r0] = r3
            r0 = r2
            goto L14
        L3b:
            return
    }

    /* renamed from: n */
    public static p042cj.C0991c m2725n(java.lang.Object r1) {
            boolean r0 = r1 instanceof p042cj.C0991c
            if (r0 == 0) goto L7
            cj.c r1 = (p042cj.C0991c) r1
            return r1
        L7:
            if (r1 == 0) goto L13
            cj.c r0 = new cj.c
            ri.t r1 = p317ri.AbstractC5915t.m12274C(r1)
            r0.<init>(r1)
            return r0
        L13:
            r1 = 0
            return r1
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            ri.a1 r0 = new ri.a1
            cj.b[] r1 = r2.f5079b0
            r0.<init>(r1)
            return r0
    }

    @Override // p317ri.AbstractC5894m
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p042cj.C0991c
            r2 = 0
            if (r1 != 0) goto Le
            boolean r1 = r5 instanceof p317ri.AbstractC5915t
            if (r1 != 0) goto Le
            return r2
        Le:
            r1 = r5
            ri.e r1 = (p317ri.InterfaceC5870e) r1
            ri.s r1 = r1.mo168e()
            ri.s r3 = r4.mo168e()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L20
            return r0
        L20:
            m.c r0 = r4.f5078a0     // Catch: java.lang.Exception -> L36
            cj.c r1 = new cj.c     // Catch: java.lang.Exception -> L36
            ri.e r5 = (p317ri.InterfaceC5870e) r5     // Catch: java.lang.Exception -> L36
            ri.s r5 = r5.mo168e()     // Catch: java.lang.Exception -> L36
            ri.t r5 = p317ri.AbstractC5915t.m12274C(r5)     // Catch: java.lang.Exception -> L36
            r1.<init>(r5)     // Catch: java.lang.Exception -> L36
            boolean r5 = r0.m9639a(r4, r1)     // Catch: java.lang.Exception -> L36
            return r5
        L36:
            return r2
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r8 = this;
            boolean r0 = r8.f5076Y
            if (r0 == 0) goto L7
            int r0 = r8.f5077Z
            return r0
        L7:
            r0 = 1
            r8.f5076Y = r0
            m.c r0 = r8.f5078a0
            java.util.Objects.requireNonNull(r0)
            cj.b[] r1 = r8.m2726p()
            r2 = 0
            r3 = 0
            r4 = 0
        L16:
            int r5 = r1.length
            if (r3 == r5) goto L5d
            r5 = r1[r3]
            boolean r5 = r5.m2724q()
            if (r5 == 0) goto L40
            r5 = r1[r3]
            cj.a[] r5 = r5.m2723p()
            r6 = 0
        L28:
            int r7 = r5.length
            if (r6 == r7) goto L5a
            r7 = r5[r6]
            ri.n r7 = r7.f5072Y
            int r7 = r7.hashCode()
            r4 = r4 ^ r7
            r7 = r5[r6]
            ri.e r7 = r7.f5073Z
            int r7 = r0.m9640b(r7)
            r4 = r4 ^ r7
            int r6 = r6 + 1
            goto L28
        L40:
            r5 = r1[r3]
            cj.a r5 = r5.m2722n()
            ri.n r5 = r5.f5072Y
            int r5 = r5.hashCode()
            r4 = r4 ^ r5
            r5 = r1[r3]
            cj.a r5 = r5.m2722n()
            ri.e r5 = r5.f5073Z
            int r5 = r0.m9640b(r5)
            r4 = r4 ^ r5
        L5a:
            int r3 = r3 + 1
            goto L16
        L5d:
            r8.f5077Z = r4
            return r4
    }

    /* renamed from: p */
    public p042cj.C0990b[] m2726p() {
            r4 = this;
            cj.b[] r0 = r4.f5079b0
            int r1 = r0.length
            cj.b[] r2 = new p042cj.C0990b[r1]
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r3, r1)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            m.c r0 = r1.f5078a0
            java.lang.String r0 = r0.mo4022i(r1)
            return r0
    }
}

package p081ej;

/* renamed from: ej.p */
/* loaded from: classes.dex */
public class C1873p extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p081ej.C1866i f8106Y;

    /* renamed from: Z */
    public boolean f8107Z;

    /* renamed from: a0 */
    public boolean f8108a0;

    /* renamed from: b0 */
    public p081ej.C1875r f8109b0;

    /* renamed from: c0 */
    public boolean f8110c0;

    /* renamed from: d0 */
    public boolean f8111d0;

    /* renamed from: e0 */
    public p317ri.AbstractC5915t f8112e0;

    public C1873p(p317ri.AbstractC5915t r6) {
            r5 = this;
            r5.<init>()
            r5.f8112e0 = r6
            r0 = 0
            r1 = 0
        L7:
            int r2 = r6.size()
            if (r1 == r2) goto L83
            ri.e r2 = r6.mo12277F(r1)
            ri.y r2 = p317ri.AbstractC5928y.m12293C(r2)
            int r3 = r2.f22755Y
            if (r3 == 0) goto L68
            r4 = 1
            if (r3 == r4) goto L5d
            r4 = 2
            if (r3 == r4) goto L52
            r4 = 3
            if (r3 == r4) goto L46
            r4 = 4
            if (r3 == r4) goto L3b
            r4 = 5
            if (r3 != r4) goto L33
            ri.c r2 = p317ri.C5864c.m12217E(r2, r0)
            boolean r2 = r2.m12218F()
            r5.f8111d0 = r2
            goto L80
        L33:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown tag in IssuingDistributionPoint"
            r6.<init>(r0)
            throw r6
        L3b:
            ri.c r2 = p317ri.C5864c.m12217E(r2, r0)
            boolean r2 = r2.m12218F()
            r5.f8110c0 = r2
            goto L80
        L46:
            ej.r r3 = new ej.r
            ri.n0 r2 = p317ri.C5898n0.m12257F(r2, r0)
            r3.<init>(r2)
            r5.f8109b0 = r3
            goto L80
        L52:
            ri.c r2 = p317ri.C5864c.m12217E(r2, r0)
            boolean r2 = r2.m12218F()
            r5.f8108a0 = r2
            goto L80
        L5d:
            ri.c r2 = p317ri.C5864c.m12217E(r2, r0)
            boolean r2 = r2.m12218F()
            r5.f8107Z = r2
            goto L80
        L68:
            ri.s r2 = r2.m12294D()
            ri.y r2 = (p317ri.AbstractC5928y) r2
            if (r2 == 0) goto L7b
            boolean r3 = r2 instanceof p081ej.C1866i
            if (r3 == 0) goto L75
            goto L7b
        L75:
            ej.i r3 = new ej.i
            r3.<init>(r2)
            goto L7e
        L7b:
            r3 = r2
            ej.i r3 = (p081ej.C1866i) r3
        L7e:
            r5.f8106Y = r3
        L80:
            int r1 = r1 + 1
            goto L7
        L83:
            return
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r1 = this;
            ri.t r0 = r1.f8112e0
            return r0
    }

    /* renamed from: n */
    public final void m4634n(java.lang.StringBuffer r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "    "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = ":"
            r2.append(r4)
            r2.append(r3)
            r2.append(r0)
            r2.append(r0)
            r2.append(r5)
            r2.append(r3)
            return
    }

    /* renamed from: p */
    public final java.lang.String m4635p(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            java.lang.String r1 = "true"
            goto L7
        L5:
            java.lang.String r1 = "false"
        L7:
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = p400wj.C6892e.f26795a
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "IssuingDistributionPoint: ["
            r1.append(r2)
            r1.append(r0)
            ej.i r2 = r4.f8106Y
            if (r2 == 0) goto L1c
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "distributionPoint"
            r4.m4634n(r1, r0, r3, r2)
        L1c:
            boolean r2 = r4.f8107Z
            if (r2 == 0) goto L29
            java.lang.String r2 = r4.m4635p(r2)
            java.lang.String r3 = "onlyContainsUserCerts"
            r4.m4634n(r1, r0, r3, r2)
        L29:
            boolean r2 = r4.f8108a0
            if (r2 == 0) goto L36
            java.lang.String r2 = r4.m4635p(r2)
            java.lang.String r3 = "onlyContainsCACerts"
            r4.m4634n(r1, r0, r3, r2)
        L36:
            ej.r r2 = r4.f8109b0
            if (r2 == 0) goto L43
            java.lang.String r2 = r2.mo12211h()
            java.lang.String r3 = "onlySomeReasons"
            r4.m4634n(r1, r0, r3, r2)
        L43:
            boolean r2 = r4.f8111d0
            if (r2 == 0) goto L50
            java.lang.String r2 = r4.m4635p(r2)
            java.lang.String r3 = "onlyContainsAttributeCerts"
            r4.m4634n(r1, r0, r3, r2)
        L50:
            boolean r2 = r4.f8110c0
            if (r2 == 0) goto L5d
            java.lang.String r2 = r4.m4635p(r2)
            java.lang.String r3 = "indirectCRL"
            r4.m4634n(r1, r0, r3, r2)
        L5d:
            java.lang.String r2 = "]"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}

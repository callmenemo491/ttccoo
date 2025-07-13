package p081ej;

/* renamed from: ej.u */
/* loaded from: classes.dex */
public class C1878u extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.AbstractC5915t f8126Y;

    /* renamed from: Z */
    public p317ri.C5888k f8127Z;

    /* renamed from: a0 */
    public p081ej.C1868k f8128a0;

    public C1878u(p317ri.AbstractC5915t r9) {
            r8 = this;
            r8.<init>()
            r8.f8126Y = r9
            r0 = 0
            ri.e r1 = r9.mo12277F(r0)
            boolean r1 = r1 instanceof p317ri.AbstractC5928y
            r2 = 0
            if (r1 == 0) goto L22
            ri.e r1 = r9.mo12277F(r0)
            ri.y r1 = (p317ri.AbstractC5928y) r1
            ri.s r1 = r1.m12294D()
            ri.k r1 = p317ri.C5888k.m12240C(r1)
            r8.f8127Z = r1
            r1 = 0
            goto L2a
        L22:
            ri.k r1 = new ri.k
            r1.<init>(r2)
            r8.f8127Z = r1
            r1 = -1
        L2a:
            ri.k r4 = r8.f8127Z
            java.math.BigInteger r4 = r4.m12243E()
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            boolean r2 = r4.equals(r2)
            r3 = 1
            if (r2 == 0) goto L3d
            r2 = 1
            goto L65
        L3d:
            ri.k r2 = r8.f8127Z
            java.math.BigInteger r2 = r2.m12243E()
            r4 = 1
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L52
            r2 = 0
            r4 = 1
            goto L66
        L52:
            ri.k r2 = r8.f8127Z
            java.math.BigInteger r2 = r2.m12243E()
            r4 = 2
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L101
            r2 = 0
        L65:
            r4 = 0
        L66:
            int r5 = r1 + 1
            ri.e r5 = r9.mo12277F(r5)
            p317ri.C5888k.m12240C(r5)
            int r5 = r1 + 2
            ri.e r5 = r9.mo12277F(r5)
            p081ej.C1858a.m4628n(r5)
            int r5 = r1 + 3
            ri.e r5 = r9.mo12277F(r5)
            p042cj.C0991c.m2725n(r5)
            int r5 = r1 + 4
            ri.e r5 = r9.mo12277F(r5)
            ri.t r5 = (p317ri.AbstractC5915t) r5
            ri.e r6 = r5.mo12277F(r0)
            p081ej.C1879v.m4638n(r6)
            ri.e r5 = r5.mo12277F(r3)
            p081ej.C1879v.m4638n(r5)
            int r5 = r1 + 5
            ri.e r5 = r9.mo12277F(r5)
            p042cj.C0991c.m2725n(r5)
            int r1 = r1 + 6
            ri.e r5 = r9.mo12277F(r1)
            p081ej.C1876s.m4637n(r5)
            int r5 = r9.size()
            int r5 = r5 - r1
            int r5 = r5 - r3
            if (r5 == 0) goto Lbc
            if (r2 != 0) goto Lb4
            goto Lbc
        Lb4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "version 1 certificate contains extra data"
            r9.<init>(r0)
            throw r9
        Lbc:
            if (r5 <= 0) goto L100
            int r2 = r1 + r5
            ri.e r2 = r9.mo12277F(r2)
            ri.y r2 = (p317ri.AbstractC5928y) r2
            int r6 = r2.f22755Y
            if (r6 == r3) goto Lfa
            r7 = 2
            if (r6 == r7) goto Lfa
            r7 = 3
            if (r6 != r7) goto Le5
            if (r4 != 0) goto Ldd
            ri.t r2 = p317ri.AbstractC5915t.m12275D(r2, r3)
            ej.k r2 = p081ej.C1868k.m4630n(r2)
            r8.f8128a0 = r2
            goto Lfd
        Ldd:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "version 2 certificate cannot contain extensions"
            r9.<init>(r0)
            throw r9
        Le5:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown tag encountered in structure: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r2.f22755Y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        Lfa:
            p317ri.C5898n0.m12257F(r2, r0)
        Lfd:
            int r5 = r5 + (-1)
            goto Lbc
        L100:
            return
        L101:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "version number not recognised"
            r9.<init>(r0)
            throw r9
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r1 = this;
            ri.t r0 = r1.f8126Y
            return r0
    }
}

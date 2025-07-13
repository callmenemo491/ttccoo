package p440yi;

/* renamed from: yi.f */
/* loaded from: classes.dex */
public class C7218f extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.C5888k f27776Y;

    /* renamed from: Z */
    public p081ej.C1858a f27777Z;

    /* renamed from: a0 */
    public p317ri.AbstractC5900o f27778a0;

    /* renamed from: b0 */
    public p317ri.AbstractC5921v f27779b0;

    /* renamed from: c0 */
    public p317ri.AbstractC5861b f27780c0;

    public C7218f(p081ej.C1858a r2, p317ri.InterfaceC5870e r3, p317ri.AbstractC5921v r4, byte[] r5) {
            r1 = this;
            r1.<init>()
            ri.k r5 = new ri.k
            java.math.BigInteger r0 = p400wj.C6889b.f26791a
            r5.<init>(r0)
            r1.f27776Y = r5
            r1.f27777Z = r2
            ri.x0 r2 = new ri.x0
            r2.<init>(r3)
            r1.f27778a0 = r2
            r1.f27779b0 = r4
            r2 = 0
            r1.f27780c0 = r2
            return
    }

    public C7218f(p317ri.AbstractC5915t r6) {
            r5 = this;
            r5.<init>()
            java.util.Enumeration r6 = r6.mo12278H()
            java.lang.Object r0 = r6.nextElement()
            ri.k r0 = p317ri.C5888k.m12240C(r0)
            r5.f27776Y = r0
            java.math.BigInteger r0 = r0.m12243E()
            java.math.BigInteger r1 = p400wj.C6889b.f26791a
            int r1 = r0.compareTo(r1)
            if (r1 < 0) goto L7e
            java.math.BigInteger r1 = p400wj.C6889b.f26792b
            int r1 = r0.compareTo(r1)
            if (r1 > 0) goto L7e
            int r0 = r0.intValue()
            java.lang.Object r1 = r6.nextElement()
            ej.a r1 = p081ej.C1858a.m4628n(r1)
            r5.f27777Z = r1
            java.lang.Object r1 = r6.nextElement()
            ri.o r1 = p317ri.AbstractC5900o.m12258C(r1)
            r5.f27778a0 = r1
            r1 = -1
        L3e:
            boolean r2 = r6.hasMoreElements()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r6.nextElement()
            ri.y r2 = (p317ri.AbstractC5928y) r2
            int r3 = r2.f22755Y
            if (r3 <= r1) goto L75
            r1 = 0
            if (r3 == 0) goto L6d
            r4 = 1
            if (r3 != r4) goto L65
            if (r0 < r4) goto L5d
            ri.n0 r1 = p317ri.C5898n0.m12257F(r2, r1)
            r5.f27780c0 = r1
            goto L73
        L5d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'publicKey' requires version v2(1) or later"
            r6.<init>(r0)
            throw r6
        L65:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown optional field in private key info"
            r6.<init>(r0)
            throw r6
        L6d:
            ri.v r1 = p317ri.AbstractC5921v.m12285D(r2, r1)
            r5.f27779b0 = r1
        L73:
            r1 = r3
            goto L3e
        L75:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid optional field in private key info"
            r6.<init>(r0)
            throw r6
        L7d:
            return
        L7e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid version for private key info"
            r6.<init>(r0)
            throw r6
    }

    /* renamed from: n */
    public static p440yi.C7218f m14285n(java.lang.Object r1) {
            boolean r0 = r1 instanceof p440yi.C7218f
            if (r0 == 0) goto L7
            yi.f r1 = (p440yi.C7218f) r1
            return r1
        L7:
            if (r1 == 0) goto L13
            yi.f r0 = new yi.f
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
            r5 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.k r1 = r5.f27776Y
            r0.m7087h(r1)
            ej.a r1 = r5.f27777Z
            r0.m7087h(r1)
            ri.o r1 = r5.f27778a0
            r0.m7087h(r1)
            ri.v r1 = r5.f27779b0
            r2 = 0
            if (r1 == 0) goto L27
            ri.d1 r3 = new ri.d1
            r3.<init>(r2, r2, r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r3)
        L27:
            ri.b r1 = r5.f27780c0
            if (r1 == 0) goto L38
            ri.d1 r3 = new ri.d1
            r4 = 1
            r3.<init>(r2, r4, r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r3)
        L38:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}

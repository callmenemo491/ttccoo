package p317ri;

/* renamed from: ri.n0 */
/* loaded from: classes.dex */
public class C5898n0 extends p317ri.AbstractC5861b {
    public C5898n0(p317ri.InterfaceC5870e r2) {
            r1 = this;
            ri.s r2 = r2.mo168e()
            java.lang.String r0 = "DER"
            byte[] r2 = r2.m12246m(r0)
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C5898n0(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C5898n0(byte[] r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: E */
    public static p317ri.C5898n0 m12256E(java.lang.Object r2) {
            if (r2 == 0) goto L50
            boolean r0 = r2 instanceof p317ri.C5898n0
            if (r0 == 0) goto L7
            goto L50
        L7:
            boolean r0 = r2 instanceof p317ri.C5887j1
            if (r0 == 0) goto L17
            ri.n0 r0 = new ri.n0
            ri.j1 r2 = (p317ri.C5887j1) r2
            byte[] r1 = r2.f22668Y
            int r2 = r2.f22669Z
            r0.<init>(r1, r2)
            return r0
        L17:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L35
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Exception -> L24
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.lang.Exception -> L24
            ri.n0 r2 = (p317ri.C5898n0) r2     // Catch: java.lang.Exception -> L24
            return r2
        L24:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "encoding error in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = androidx.fragment.app.C0390k0.m1221a(r2, r1)
            r0.<init>(r2)
            throw r0
        L35:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "illegal object in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L50:
            ri.n0 r2 = (p317ri.C5898n0) r2
            return r2
    }

    /* renamed from: F */
    public static p317ri.C5898n0 m12257F(p317ri.AbstractC5928y r4, boolean r5) {
            ri.s r4 = r4.m12294D()
            if (r5 != 0) goto L31
            boolean r5 = r4 instanceof p317ri.C5898n0
            if (r5 == 0) goto Lb
            goto L31
        Lb:
            ri.o r4 = (p317ri.AbstractC5900o) r4
            byte[] r4 = r4.mo12219E()
            int r5 = r4.length
            r0 = 1
            if (r5 < r0) goto L29
            r5 = 0
            r1 = r4[r5]
            int r2 = r4.length
            int r2 = r2 - r0
            byte[] r3 = new byte[r2]
            if (r2 == 0) goto L23
            int r2 = r4.length
            int r2 = r2 - r0
            java.lang.System.arraycopy(r4, r0, r3, r5, r2)
        L23:
            ri.n0 r4 = new ri.n0
            r4.<init>(r3, r1)
            return r4
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "truncated BIT STRING detected"
            r4.<init>(r5)
            throw r4
        L31:
            ri.n0 r4 = m12256E(r4)
            return r4
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r7) {
            r6 = this;
            byte[] r0 = r6.f22668Y
            int r1 = r6.f22669Z
            byte[] r0 = p317ri.AbstractC5861b.m12208C(r0, r1)
            int r1 = r0.length
            r2 = 1
            int r1 = r1 + r2
            byte[] r3 = new byte[r1]
            int r4 = r6.f22669Z
            byte r4 = (byte) r4
            r5 = 0
            r3[r5] = r4
            int r1 = r1 - r2
            java.lang.System.arraycopy(r0, r5, r3, r2, r1)
            r0 = 3
            r7.m12266e(r0, r3)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22668Y
            int r0 = r0.length
            int r0 = r0 + 1
            int r0 = p317ri.C5923v1.m12290a(r0)
            int r0 = r0 + 1
            byte[] r1 = r2.f22668Y
            int r1 = r1.length
            int r0 = r0 + r1
            int r0 = r0 + 1
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: w */
    public boolean mo12206w() {
            r1 = this;
            r0 = 0
            return r0
    }
}

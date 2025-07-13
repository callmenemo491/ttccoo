package p081ej;

/* renamed from: ej.i */
/* loaded from: classes.dex */
public class C1866i extends p317ri.AbstractC5894m implements p317ri.InterfaceC5867d {

    /* renamed from: Y */
    public p317ri.InterfaceC5870e f8088Y;

    /* renamed from: Z */
    public int f8089Z;

    public C1866i(p317ri.AbstractC5928y r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.f22755Y
            r2.f8089Z = r0
            r1 = 0
            if (r0 != 0) goto L13
            ri.t r3 = p317ri.AbstractC5915t.m12275D(r3, r1)
            ej.m r3 = p081ej.C1870m.m4632n(r3)
            goto L17
        L13:
            ri.v r3 = p317ri.AbstractC5921v.m12285D(r3, r1)
        L17:
            r2.f8088Y = r3
            return
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r4 = this;
            ri.d1 r0 = new ri.d1
            int r1 = r4.f8089Z
            ri.e r2 = r4.f8088Y
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    /* renamed from: n */
    public final void m4629n(java.lang.StringBuffer r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
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

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = p400wj.C6892e.f26795a
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "DistributionPointName: ["
            r1.append(r2)
            r1.append(r0)
            int r2 = r4.f8089Z
            if (r2 != 0) goto L1c
            ri.e r2 = r4.f8088Y
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "fullName"
            goto L24
        L1c:
            ri.e r2 = r4.f8088Y
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "nameRelativeToCRLIssuer"
        L24:
            r4.m4629n(r1, r0, r3, r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}

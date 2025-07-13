package p081ej;

/* renamed from: ej.m */
/* loaded from: classes.dex */
public class C1870m extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public final p081ej.C1869l[] f8098Y;

    public C1870m(p081ej.C1869l r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            ej.l[] r0 = new p081ej.C1869l[r0]
            r1 = 0
            r0[r1] = r3
            r2.f8098Y = r0
            return
    }

    public C1870m(p317ri.AbstractC5915t r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.size()
            ej.l[] r0 = new p081ej.C1869l[r0]
            r3.f8098Y = r0
            r0 = 0
        Lc:
            int r1 = r4.size()
            if (r0 == r1) goto L21
            ej.l[] r1 = r3.f8098Y
            ri.e r2 = r4.mo12277F(r0)
            ej.l r2 = p081ej.C1869l.m4631n(r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lc
        L21:
            return
    }

    /* renamed from: n */
    public static p081ej.C1870m m4632n(java.lang.Object r1) {
            boolean r0 = r1 instanceof p081ej.C1870m
            if (r0 == 0) goto L7
            ej.m r1 = (p081ej.C1870m) r1
            return r1
        L7:
            if (r1 == 0) goto L13
            ej.m r0 = new ej.m
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
            ej.l[] r1 = r2.f8098Y
            r0.<init>(r1)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = p400wj.C6892e.f26795a
            java.lang.String r2 = "GeneralNames:"
            r0.append(r2)
            r0.append(r1)
            r2 = 0
        L10:
            ej.l[] r3 = r4.f8098Y
            int r3 = r3.length
            if (r2 == r3) goto L27
            java.lang.String r3 = "    "
            r0.append(r3)
            ej.l[] r3 = r4.f8098Y
            r3 = r3[r2]
            r0.append(r3)
            r0.append(r1)
            int r2 = r2 + 1
            goto L10
        L27:
            java.lang.String r0 = r0.toString()
            return r0
    }
}

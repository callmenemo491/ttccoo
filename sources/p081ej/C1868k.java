package p081ej;

/* renamed from: ej.k */
/* loaded from: classes.dex */
public class C1868k extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public java.util.Hashtable f8094Y;

    /* renamed from: Z */
    public java.util.Vector f8095Z;

    public C1868k(p317ri.AbstractC5915t r4) {
            r3 = this;
            r3.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r3.f8094Y = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r3.f8095Z = r0
            java.util.Enumeration r4 = r4.mo12278H()
        L15:
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r4.nextElement()
            ri.n r1 = p081ej.C1867j.f8090b0
            boolean r1 = r0 instanceof p081ej.C1867j
            if (r1 == 0) goto L28
            ej.j r0 = (p081ej.C1867j) r0
            goto L36
        L28:
            if (r0 == 0) goto L35
            ej.j r1 = new ej.j
            ri.t r0 = p317ri.AbstractC5915t.m12274C(r0)
            r1.<init>(r0)
            r0 = r1
            goto L36
        L35:
            r0 = 0
        L36:
            java.util.Hashtable r1 = r3.f8094Y
            ri.n r2 = r0.f8091Y
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L4f
            java.util.Hashtable r1 = r3.f8094Y
            ri.n r2 = r0.f8091Y
            r1.put(r2, r0)
            java.util.Vector r1 = r3.f8095Z
            ri.n r0 = r0.f8091Y
            r1.addElement(r0)
            goto L15
        L4f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "repeated extension found: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            ri.n r0 = r0.f8091Y
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L64:
            return
    }

    /* renamed from: n */
    public static p081ej.C1868k m4630n(java.lang.Object r1) {
            boolean r0 = r1 instanceof p081ej.C1868k
            if (r0 == 0) goto L7
            ej.k r1 = (p081ej.C1868k) r1
            return r1
        L7:
            if (r1 == 0) goto L13
            ej.k r0 = new ej.k
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
            r4 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            java.util.Vector r1 = r4.f8095Z
            java.util.Enumeration r1 = r1.elements()
        Ld:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.nextElement()
            ri.n r2 = (p317ri.C5897n) r2
            java.util.Hashtable r3 = r4.f8094Y
            java.lang.Object r2 = r3.get(r2)
            ej.j r2 = (p081ej.C1867j) r2
            r0.m7087h(r2)
            goto Ld
        L25:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}

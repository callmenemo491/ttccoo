package p081ej;

/* renamed from: ej.l */
/* loaded from: classes.dex */
public class C1869l extends p317ri.AbstractC5894m implements p317ri.InterfaceC5867d {

    /* renamed from: Y */
    public p317ri.InterfaceC5870e f8096Y;

    /* renamed from: Z */
    public int f8097Z;

    public C1869l(int r1, p317ri.InterfaceC5870e r2) {
            r0 = this;
            r0.<init>()
            r0.f8096Y = r2
            r0.f8097Z = r1
            return
    }

    public C1869l(p042cj.C0991c r1) {
            r0 = this;
            r0.<init>()
            r0.f8096Y = r1
            r1 = 4
            r0.f8097Z = r1
            return
    }

    /* renamed from: n */
    public static p081ej.C1869l m4631n(java.lang.Object r3) {
            if (r3 == 0) goto Lc3
            boolean r0 = r3 instanceof p081ej.C1869l
            if (r0 == 0) goto L8
            goto Lc3
        L8:
            boolean r0 = r3 instanceof p317ri.AbstractC5928y
            if (r0 == 0) goto L91
            r0 = r3
            ri.y r0 = (p317ri.AbstractC5928y) r0
            int r1 = r0.f22755Y
            r2 = 0
            switch(r1) {
                case 0: goto L87;
                case 1: goto L7d;
                case 2: goto L73;
                case 3: goto L67;
                case 4: goto L56;
                case 5: goto L4c;
                case 6: goto L42;
                case 7: goto L38;
                case 8: goto L17;
                default: goto L15;
            }
        L15:
            goto L91
        L17:
            ej.l r3 = new ej.l
            java.util.concurrent.ConcurrentMap<ri.n$a, ri.n> r2 = p317ri.C5897n.f22718a0
            ri.s r0 = r0.m12294D()
            boolean r2 = r0 instanceof p317ri.C5897n
            if (r2 == 0) goto L28
            ri.n r0 = p317ri.C5897n.m12249F(r0)
            goto L34
        L28:
            ri.o r0 = p317ri.AbstractC5900o.m12258C(r0)
            byte[] r0 = r0.mo12219E()
            ri.n r0 = p317ri.C5897n.m12248D(r0)
        L34:
            r3.<init>(r1, r0)
            return r3
        L38:
            ej.l r3 = new ej.l
            ri.o r0 = p317ri.AbstractC5900o.m12259D(r0, r2)
            r3.<init>(r1, r0)
            return r3
        L42:
            ej.l r3 = new ej.l
            ri.u0 r0 = p317ri.C5919u0.m12282D(r0, r2)
            r3.<init>(r1, r0)
            return r3
        L4c:
            ej.l r3 = new ej.l
            ri.t r0 = p317ri.AbstractC5915t.m12275D(r0, r2)
            r3.<init>(r1, r0)
            return r3
        L56:
            ej.l r3 = new ej.l
            m.c r2 = p042cj.C0991c.f5075c0
            r2 = 1
            ri.t r0 = p317ri.AbstractC5915t.m12275D(r0, r2)
            cj.c r0 = p042cj.C0991c.m2725n(r0)
            r3.<init>(r1, r0)
            return r3
        L67:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown tag: "
            java.lang.String r0 = android.support.v4.media.C0142a.m254a(r0, r1)
            r3.<init>(r0)
            throw r3
        L73:
            ej.l r3 = new ej.l
            ri.u0 r0 = p317ri.C5919u0.m12282D(r0, r2)
            r3.<init>(r1, r0)
            return r3
        L7d:
            ej.l r3 = new ej.l
            ri.u0 r0 = p317ri.C5919u0.m12282D(r0, r2)
            r3.<init>(r1, r0)
            return r3
        L87:
            ej.l r3 = new ej.l
            ri.t r0 = p317ri.AbstractC5915t.m12275D(r0, r2)
            r3.<init>(r1, r0)
            return r3
        L91:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto La8
            byte[] r3 = (byte[]) r3     // Catch: java.io.IOException -> La0
            ri.s r3 = p317ri.AbstractC5912s.m12271u(r3)     // Catch: java.io.IOException -> La0
            ej.l r3 = m4631n(r3)     // Catch: java.io.IOException -> La0
            return r3
        La0:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unable to parse encoded general name"
            r3.<init>(r0)
            throw r3
        La8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown object in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        Lc3:
            ej.l r3 = (p081ej.C1869l) r3
            return r3
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r4 = this;
            int r0 = r4.f8097Z
            r1 = 4
            if (r0 != r1) goto Le
            ri.d1 r1 = new ri.d1
            r2 = 1
            ri.e r3 = r4.f8096Y
            r1.<init>(r2, r0, r3)
            return r1
        Le:
            ri.d1 r1 = new ri.d1
            r2 = 0
            ri.e r3 = r4.f8096Y
            r1.<init>(r2, r0, r3)
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r3.f8097Z
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            int r1 = r3.f8097Z
            r2 = 1
            if (r1 == r2) goto L2f
            r2 = 2
            if (r1 == r2) goto L2f
            r2 = 4
            if (r1 == r2) goto L24
            r2 = 6
            if (r1 == r2) goto L2f
            ri.e r1 = r3.f8096Y
            java.lang.String r1 = r1.toString()
            goto L39
        L24:
            ri.e r1 = r3.f8096Y
            cj.c r1 = p042cj.C0991c.m2725n(r1)
            java.lang.String r1 = r1.toString()
            goto L39
        L2f:
            ri.e r1 = r3.f8096Y
            ri.u0 r1 = p317ri.C5919u0.m12281C(r1)
            java.lang.String r1 = r1.mo12211h()
        L39:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

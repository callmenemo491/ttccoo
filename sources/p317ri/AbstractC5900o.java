package p317ri;

/* renamed from: ri.o */
/* loaded from: classes.dex */
public abstract class AbstractC5900o extends p317ri.AbstractC5912s implements p317ri.InterfaceC5903p {

    /* renamed from: Y */
    public byte[] f22723Y;

    public AbstractC5900o(byte[] r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "string cannot be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f22723Y = r2
            return
    }

    /* renamed from: C */
    public static p317ri.AbstractC5900o m12258C(java.lang.Object r2) {
            if (r2 == 0) goto L5b
            boolean r0 = r2 instanceof p317ri.AbstractC5900o
            if (r0 == 0) goto L7
            goto L5b
        L7:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L2e
            byte[] r2 = (byte[]) r2     // Catch: java.io.IOException -> L16
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.io.IOException -> L16
            ri.o r2 = m12258C(r2)     // Catch: java.io.IOException -> L16
            return r2
        L16:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "failed to construct OCTET STRING from byte[]: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r2.getMessage()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L2e:
            boolean r0 = r2 instanceof p317ri.InterfaceC5870e
            if (r0 == 0) goto L40
            r0 = r2
            ri.e r0 = (p317ri.InterfaceC5870e) r0
            ri.s r0 = r0.mo168e()
            boolean r1 = r0 instanceof p317ri.AbstractC5900o
            if (r1 == 0) goto L40
            ri.o r0 = (p317ri.AbstractC5900o) r0
            return r0
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "illegal object in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L5b:
            ri.o r2 = (p317ri.AbstractC5900o) r2
            return r2
    }

    /* renamed from: D */
    public static p317ri.AbstractC5900o m12259D(p317ri.AbstractC5928y r3, boolean r4) {
            ri.s r3 = r3.m12294D()
            if (r4 != 0) goto L32
            boolean r4 = r3 instanceof p317ri.AbstractC5900o
            if (r4 == 0) goto Lb
            goto L32
        Lb:
            ri.t r3 = p317ri.AbstractC5915t.m12274C(r3)
            int r4 = r3.size()
            ri.o[] r4 = new p317ri.AbstractC5900o[r4]
            java.util.Enumeration r3 = r3.mo12278H()
            r0 = 0
        L1a:
            boolean r1 = r3.hasMoreElements()
            if (r1 == 0) goto L2c
            int r1 = r0 + 1
            java.lang.Object r2 = r3.nextElement()
            ri.o r2 = (p317ri.AbstractC5900o) r2
            r4[r0] = r2
            r0 = r1
            goto L1a
        L2c:
            ri.d0 r3 = new ri.d0
            r3.<init>(r4)
            return r3
        L32:
            ri.o r3 = m12258C(r3)
            return r3
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: A */
    public p317ri.AbstractC5912s mo12209A() {
            r2 = this;
            ri.x0 r0 = new ri.x0
            byte[] r1 = r2.f22723Y
            r0.<init>(r1)
            return r0
    }

    /* renamed from: E */
    public byte[] mo12219E() {
            r1 = this;
            byte[] r0 = r1.f22723Y
            return r0
    }

    @Override // p317ri.InterfaceC5903p
    /* renamed from: a */
    public java.io.InputStream mo12221a() {
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r2.f22723Y
            r0.<init>(r1)
            return r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.mo12219E()
            int r0 = p400wj.C6888a.m13952d(r0)
            return r0
    }

    @Override // p317ri.InterfaceC5908q1
    /* renamed from: i */
    public p317ri.AbstractC5912s mo12213i() {
            r0 = this;
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            boolean r0 = r2 instanceof p317ri.AbstractC5900o
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            ri.o r2 = (p317ri.AbstractC5900o) r2
            byte[] r0 = r1.f22723Y
            byte[] r2 = r2.f22723Y
            boolean r2 = p400wj.C6888a.m13949a(r0, r2)
            return r2
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "#"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            byte[] r1 = r4.f22723Y
            xj.d r2 = p421xj.C7089e.f27429a
            int r2 = r1.length
            r3 = 0
            byte[] r1 = p421xj.C7089e.m14195b(r1, r3, r2)
            java.lang.String r1 = p400wj.C6892e.m13958a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: z */
    public p317ri.AbstractC5912s mo12212z() {
            r2 = this;
            ri.x0 r0 = new ri.x0
            byte[] r1 = r2.f22723Y
            r0.<init>(r1)
            return r0
    }
}

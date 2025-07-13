package p317ri;

/* renamed from: ri.t */
/* loaded from: classes.dex */
public abstract class AbstractC5915t extends p317ri.AbstractC5912s implements java.lang.Iterable {

    /* renamed from: Y */
    public java.util.Vector f22743Y;

    public AbstractC5915t() {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.f22743Y = r0
            return
    }

    public AbstractC5915t(p124h7.C2839rb r4) {
            r3 = this;
            r3.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r3.f22743Y = r0
            r0 = 0
        Lb:
            int r1 = r4.m7098u()
            if (r0 == r1) goto L1d
            java.util.Vector r1 = r3.f22743Y
            ri.e r2 = r4.m7093n(r0)
            r1.addElement(r2)
            int r0 = r0 + 1
            goto Lb
        L1d:
            return
    }

    public AbstractC5915t(p317ri.InterfaceC5870e r2) {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.f22743Y = r0
            r0.addElement(r2)
            return
    }

    public AbstractC5915t(p317ri.InterfaceC5870e[] r4) {
            r3 = this;
            r3.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r3.f22743Y = r0
            r0 = 0
        Lb:
            int r1 = r4.length
            if (r0 == r1) goto L18
            java.util.Vector r1 = r3.f22743Y
            r2 = r4[r0]
            r1.addElement(r2)
            int r0 = r0 + 1
            goto Lb
        L18:
            return
    }

    /* renamed from: C */
    public static p317ri.AbstractC5915t m12274C(java.lang.Object r2) {
            if (r2 == 0) goto L6a
            boolean r0 = r2 instanceof p317ri.AbstractC5915t
            if (r0 == 0) goto L7
            goto L6a
        L7:
            boolean r0 = r2 instanceof p317ri.InterfaceC5918u
            if (r0 == 0) goto L16
            ri.u r2 = (p317ri.InterfaceC5918u) r2
            ri.s r2 = r2.mo168e()
            ri.t r2 = m12274C(r2)
            return r2
        L16:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L3d
            byte[] r2 = (byte[]) r2     // Catch: java.io.IOException -> L25
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.io.IOException -> L25
            ri.t r2 = m12274C(r2)     // Catch: java.io.IOException -> L25
            return r2
        L25:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "failed to construct sequence from byte[]: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r2.getMessage()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L3d:
            boolean r0 = r2 instanceof p317ri.InterfaceC5870e
            if (r0 == 0) goto L4f
            r0 = r2
            ri.e r0 = (p317ri.InterfaceC5870e) r0
            ri.s r0 = r0.mo168e()
            boolean r1 = r0 instanceof p317ri.AbstractC5915t
            if (r1 == 0) goto L4f
            ri.t r0 = (p317ri.AbstractC5915t) r0
            return r0
        L4f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown object in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L6a:
            ri.t r2 = (p317ri.AbstractC5915t) r2
            return r2
    }

    /* renamed from: D */
    public static p317ri.AbstractC5915t m12275D(p317ri.AbstractC5928y r1, boolean r2) {
            if (r2 == 0) goto L1a
            boolean r2 = r1.f22756Z
            if (r2 == 0) goto L12
            ri.s r1 = r1.m12294D()
            java.util.Objects.requireNonNull(r1)
            ri.t r1 = m12274C(r1)
            return r1
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "object implicit - explicit expected."
            r1.<init>(r2)
            throw r1
        L1a:
            ri.s r2 = r1.m12294D()
            boolean r0 = r1.f22756Z
            if (r0 == 0) goto L32
            boolean r1 = r1 instanceof p317ri.C5886j0
            if (r1 == 0) goto L2c
            ri.f0 r1 = new ri.f0
            r1.<init>(r2)
            return r1
        L2c:
            ri.m1 r1 = new ri.m1
            r1.<init>(r2)
            return r1
        L32:
            boolean r0 = r2 instanceof p317ri.AbstractC5915t
            if (r0 == 0) goto L39
            ri.t r2 = (p317ri.AbstractC5915t) r2
            return r2
        L39:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown object in getInstance: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            throw r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: A */
    public p317ri.AbstractC5912s mo12209A() {
            r2 = this;
            ri.m1 r0 = new ri.m1
            r0.<init>()
            java.util.Vector r1 = r2.f22743Y
            r0.f22743Y = r1
            return r0
    }

    /* renamed from: E */
    public final p317ri.InterfaceC5870e m12276E(java.util.Enumeration r1) {
            r0 = this;
            java.lang.Object r1 = r1.nextElement()
            ri.e r1 = (p317ri.InterfaceC5870e) r1
            return r1
    }

    /* renamed from: F */
    public p317ri.InterfaceC5870e mo12277F(int r2) {
            r1 = this;
            java.util.Vector r0 = r1.f22743Y
            java.lang.Object r2 = r0.elementAt(r2)
            ri.e r2 = (p317ri.InterfaceC5870e) r2
            return r2
    }

    /* renamed from: H */
    public java.util.Enumeration mo12278H() {
            r1 = this;
            java.util.Vector r0 = r1.f22743Y
            java.util.Enumeration r0 = r0.elements()
            return r0
    }

    /* renamed from: I */
    public p317ri.InterfaceC5870e[] m12279I() {
            r3 = this;
            int r0 = r3.size()
            ri.e[] r0 = new p317ri.InterfaceC5870e[r0]
            r1 = 0
        L7:
            int r2 = r3.size()
            if (r1 == r2) goto L16
            ri.e r2 = r3.mo12277F(r1)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L16:
            return r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r3 = this;
            java.util.Enumeration r0 = r3.mo12278H()
            int r1 = r3.size()
        L8:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L1a
            ri.e r2 = r3.m12276E(r0)
            int r1 = r1 * 17
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            goto L8
        L1a:
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<p317ri.InterfaceC5870e> iterator() {
            r2 = this;
            wj.a$a r0 = new wj.a$a
            ri.e[] r1 = r2.m12279I()
            r0.<init>(r1)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r5) {
            r4 = this;
            boolean r0 = r5 instanceof p317ri.AbstractC5915t
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ri.t r5 = (p317ri.AbstractC5915t) r5
            int r0 = r4.size()
            int r2 = r5.size()
            if (r0 == r2) goto L13
            return r1
        L13:
            java.util.Enumeration r0 = r4.mo12278H()
            java.util.Enumeration r5 = r5.mo12278H()
        L1b:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L3b
            ri.e r2 = r4.m12276E(r0)
            ri.e r3 = r4.m12276E(r5)
            ri.s r2 = r2.mo168e()
            ri.s r3 = r3.mo168e()
            if (r2 == r3) goto L1b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3a
            goto L1b
        L3a:
            return r1
        L3b:
            r5 = 1
            return r5
    }

    public int size() {
            r1 = this;
            java.util.Vector r0 = r1.f22743Y
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Vector r0 = r1.f22743Y
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: w */
    public boolean mo12206w() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: z */
    public p317ri.AbstractC5912s mo12212z() {
            r2 = this;
            ri.a1 r0 = new ri.a1
            r0.<init>()
            java.util.Vector r1 = r2.f22743Y
            r0.f22743Y = r1
            return r0
    }
}

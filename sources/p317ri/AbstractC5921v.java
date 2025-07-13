package p317ri;

/* renamed from: ri.v */
/* loaded from: classes.dex */
public abstract class AbstractC5921v extends p317ri.AbstractC5912s implements java.lang.Iterable {

    /* renamed from: Y */
    public java.util.Vector f22749Y;

    /* renamed from: Z */
    public boolean f22750Z;

    public AbstractC5921v() {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.f22749Y = r0
            r0 = 0
            r1.f22750Z = r0
            return
    }

    public AbstractC5921v(p124h7.C2839rb r4, boolean r5) {
            r3 = this;
            r3.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r3.f22749Y = r0
            r0 = 0
            r3.f22750Z = r0
        Ld:
            int r1 = r4.m7098u()
            if (r0 == r1) goto L1f
            java.util.Vector r1 = r3.f22749Y
            ri.e r2 = r4.m7093n(r0)
            r1.addElement(r2)
            int r0 = r0 + 1
            goto Ld
        L1f:
            if (r5 == 0) goto L24
            r3.m12289I()
        L24:
            return
    }

    public AbstractC5921v(p317ri.InterfaceC5870e r3) {
            r2 = this;
            r2.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r2.f22749Y = r0
            r1 = 0
            r2.f22750Z = r1
            r0.addElement(r3)
            return
    }

    public AbstractC5921v(p317ri.InterfaceC5870e[] r4, boolean r5) {
            r3 = this;
            r3.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r3.f22749Y = r0
            r0 = 0
            r3.f22750Z = r0
        Ld:
            int r1 = r4.length
            if (r0 == r1) goto L1a
            java.util.Vector r1 = r3.f22749Y
            r2 = r4[r0]
            r1.addElement(r2)
            int r0 = r0 + 1
            goto Ld
        L1a:
            if (r5 == 0) goto L1f
            r3.m12289I()
        L1f:
            return
    }

    /* renamed from: C */
    public static p317ri.AbstractC5921v m12284C(java.lang.Object r2) {
            if (r2 == 0) goto L6a
            boolean r0 = r2 instanceof p317ri.AbstractC5921v
            if (r0 == 0) goto L7
            goto L6a
        L7:
            boolean r0 = r2 instanceof p317ri.InterfaceC5924w
            if (r0 == 0) goto L16
            ri.w r2 = (p317ri.InterfaceC5924w) r2
            ri.s r2 = r2.mo168e()
            ri.v r2 = m12284C(r2)
            return r2
        L16:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L3d
            byte[] r2 = (byte[]) r2     // Catch: java.io.IOException -> L25
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.io.IOException -> L25
            ri.v r2 = m12284C(r2)     // Catch: java.io.IOException -> L25
            return r2
        L25:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "failed to construct set from byte[]: "
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
            boolean r1 = r0 instanceof p317ri.AbstractC5921v
            if (r1 == 0) goto L4f
            ri.v r0 = (p317ri.AbstractC5921v) r0
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
            ri.v r2 = (p317ri.AbstractC5921v) r2
            return r2
    }

    /* renamed from: D */
    public static p317ri.AbstractC5921v m12285D(p317ri.AbstractC5928y r1, boolean r2) {
            if (r2 == 0) goto L15
            boolean r2 = r1.f22756Z
            if (r2 == 0) goto Ld
            ri.s r1 = r1.m12294D()
            ri.v r1 = (p317ri.AbstractC5921v) r1
            return r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "object implicit - explicit expected."
            r1.<init>(r2)
            throw r1
        L15:
            ri.s r2 = r1.m12294D()
            boolean r0 = r1.f22756Z
            if (r0 == 0) goto L2d
            boolean r1 = r1 instanceof p317ri.C5886j0
            if (r1 == 0) goto L27
            ri.h0 r1 = new ri.h0
            r1.<init>(r2)
            return r1
        L27:
            ri.b1 r1 = new ri.b1
            r1.<init>(r2)
            return r1
        L2d:
            boolean r0 = r2 instanceof p317ri.AbstractC5921v
            if (r0 == 0) goto L34
            ri.v r2 = (p317ri.AbstractC5921v) r2
            return r2
        L34:
            boolean r0 = r2 instanceof p317ri.AbstractC5915t
            if (r0 == 0) goto L52
            ri.t r2 = (p317ri.AbstractC5915t) r2
            boolean r1 = r1 instanceof p317ri.C5886j0
            if (r1 == 0) goto L48
            ri.h0 r1 = new ri.h0
            ri.e[] r2 = r2.m12279I()
            r1.<init>(r2)
            return r1
        L48:
            ri.b1 r1 = new ri.b1
            ri.e[] r2 = r2.m12279I()
            r1.<init>(r2)
            return r1
        L52:
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
            ri.b1 r0 = new ri.b1
            r1 = 1
            r0.<init>(r1)
            java.util.Vector r1 = r2.f22749Y
            r0.f22749Y = r1
            return r0
    }

    /* renamed from: E */
    public final p317ri.InterfaceC5870e m12286E(java.util.Enumeration r1) {
            r0 = this;
            java.lang.Object r1 = r1.nextElement()
            ri.e r1 = (p317ri.InterfaceC5870e) r1
            if (r1 != 0) goto La
            ri.v0 r1 = p317ri.C5922v0.f22751Y
        La:
            return r1
    }

    /* renamed from: F */
    public p317ri.InterfaceC5870e m12287F(int r2) {
            r1 = this;
            java.util.Vector r0 = r1.f22749Y
            java.lang.Object r2 = r0.elementAt(r2)
            ri.e r2 = (p317ri.InterfaceC5870e) r2
            return r2
    }

    /* renamed from: H */
    public java.util.Enumeration m12288H() {
            r1 = this;
            java.util.Vector r0 = r1.f22749Y
            java.util.Enumeration r0 = r0.elements()
            return r0
    }

    /* renamed from: I */
    public void m12289I() {
            r15 = this;
            java.lang.String r0 = "cannot encode object added to SET"
            java.lang.String r1 = "DER"
            boolean r2 = r15.f22750Z
            if (r2 != 0) goto L94
            r2 = 1
            r15.f22750Z = r2
            java.util.Vector r3 = r15.f22749Y
            int r3 = r3.size()
            if (r3 <= r2) goto L94
            java.util.Vector r3 = r15.f22749Y
            int r3 = r3.size()
            int r3 = r3 - r2
            r4 = 1
        L1b:
            if (r4 == 0) goto L94
            java.util.Vector r4 = r15.f22749Y
            r5 = 0
            java.lang.Object r4 = r4.elementAt(r5)
            ri.e r4 = (p317ri.InterfaceC5870e) r4
            ri.s r4 = r4.mo168e()     // Catch: java.io.IOException -> L8e
            byte[] r4 = r4.m12246m(r1)     // Catch: java.io.IOException -> L8e
            r7 = r4
            r4 = 0
            r6 = 0
            r8 = 0
        L32:
            if (r8 == r3) goto L8b
            java.util.Vector r9 = r15.f22749Y
            int r10 = r8 + 1
            java.lang.Object r9 = r9.elementAt(r10)
            ri.e r9 = (p317ri.InterfaceC5870e) r9
            ri.s r9 = r9.mo168e()     // Catch: java.io.IOException -> L85
            byte[] r9 = r9.m12246m(r1)     // Catch: java.io.IOException -> L85
            int r11 = r7.length
            int r12 = r9.length
            int r11 = java.lang.Math.min(r11, r12)
            r12 = 0
        L4d:
            if (r12 == r11) goto L63
            r13 = r7[r12]
            r14 = r9[r12]
            if (r13 == r14) goto L60
            r11 = r7[r12]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            if (r11 >= r12) goto L68
            goto L66
        L60:
            int r12 = r12 + 1
            goto L4d
        L63:
            int r12 = r7.length
            if (r11 != r12) goto L68
        L66:
            r11 = 1
            goto L69
        L68:
            r11 = 0
        L69:
            if (r11 == 0) goto L6d
            r7 = r9
            goto L83
        L6d:
            java.util.Vector r4 = r15.f22749Y
            java.lang.Object r4 = r4.elementAt(r8)
            java.util.Vector r6 = r15.f22749Y
            java.lang.Object r9 = r6.elementAt(r10)
            r6.setElementAt(r9, r8)
            java.util.Vector r6 = r15.f22749Y
            r6.setElementAt(r4, r10)
            r4 = r8
            r6 = 1
        L83:
            r8 = r10
            goto L32
        L85:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L8b:
            r3 = r4
            r4 = r6
            goto L1b
        L8e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L94:
            return
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r3 = this;
            java.util.Enumeration r0 = r3.m12288H()
            int r1 = r3.size()
        L8:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L1a
            ri.e r2 = r3.m12286E(r0)
            int r1 = r1 * 17
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            goto L8
        L1a:
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<p317ri.InterfaceC5870e> iterator() {
            r4 = this;
            wj.a$a r0 = new wj.a$a
            int r1 = r4.size()
            ri.e[] r1 = new p317ri.InterfaceC5870e[r1]
            r2 = 0
        L9:
            int r3 = r4.size()
            if (r2 == r3) goto L18
            ri.e r3 = r4.m12287F(r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L18:
            r0.<init>(r1)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r5) {
            r4 = this;
            boolean r0 = r5 instanceof p317ri.AbstractC5921v
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ri.v r5 = (p317ri.AbstractC5921v) r5
            int r0 = r4.size()
            int r2 = r5.size()
            if (r0 == r2) goto L13
            return r1
        L13:
            java.util.Enumeration r0 = r4.m12288H()
            java.util.Enumeration r5 = r5.m12288H()
        L1b:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L3b
            ri.e r2 = r4.m12286E(r0)
            ri.e r3 = r4.m12286E(r5)
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
            java.util.Vector r0 = r1.f22749Y
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Vector r0 = r1.f22749Y
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
            r4 = this;
            boolean r0 = r4.f22750Z
            r1 = 0
            if (r0 == 0) goto Lf
            ri.b1 r0 = new ri.b1
            r0.<init>(r1)
            java.util.Vector r1 = r4.f22749Y
            r0.f22749Y = r1
            return r0
        Lf:
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r2 = 0
        L15:
            java.util.Vector r3 = r4.f22749Y
            int r3 = r3.size()
            if (r2 == r3) goto L29
            java.util.Vector r3 = r4.f22749Y
            java.lang.Object r3 = r3.elementAt(r2)
            r0.addElement(r3)
            int r2 = r2 + 1
            goto L15
        L29:
            ri.b1 r2 = new ri.b1
            r2.<init>(r1)
            r2.f22749Y = r0
            r2.m12289I()
            return r2
    }
}

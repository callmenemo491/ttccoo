package p317ri;

/* renamed from: ri.c */
/* loaded from: classes.dex */
public class C5864c extends p317ri.AbstractC5912s {

    /* renamed from: Z */
    public static final byte[] f22674Z = null;

    /* renamed from: a0 */
    public static final byte[] f22675a0 = null;

    /* renamed from: b0 */
    public static final p317ri.C5864c f22676b0 = null;

    /* renamed from: c0 */
    public static final p317ri.C5864c f22677c0 = null;

    /* renamed from: Y */
    public final byte[] f22678Y;

    static {
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r1[r2] = r3
            p317ri.C5864c.f22674Z = r1
            byte[] r1 = new byte[r0]
            r1[r2] = r2
            p317ri.C5864c.f22675a0 = r1
            ri.c r1 = new ri.c
            r1.<init>(r2)
            p317ri.C5864c.f22676b0 = r1
            ri.c r1 = new ri.c
            r1.<init>(r0)
            p317ri.C5864c.f22677c0 = r1
            return
    }

    public C5864c(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            byte[] r1 = p317ri.C5864c.f22674Z
            goto La
        L8:
            byte[] r1 = p317ri.C5864c.f22675a0
        La:
            r0.f22678Y = r1
            return
    }

    public C5864c(byte[] r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 1
            if (r0 != r1) goto L24
            r0 = 0
            r1 = r3[r0]
            if (r1 != 0) goto L11
            byte[] r3 = p317ri.C5864c.f22675a0
            r2.f22678Y = r3
            goto L23
        L11:
            r0 = r3[r0]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L1d
            byte[] r3 = p317ri.C5864c.f22674Z
            r2.f22678Y = r3
            goto L23
        L1d:
            byte[] r3 = p400wj.C6888a.m13951c(r3)
            r2.f22678Y = r3
        L23:
            return
        L24:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byte value should have 1 byte in it"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: C */
    public static p317ri.C5864c m12215C(byte[] r2) {
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L1c
            r0 = 0
            r1 = r2[r0]
            if (r1 != 0) goto Lc
            ri.c r2 = p317ri.C5864c.f22676b0
            return r2
        Lc:
            r0 = r2[r0]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L16
            ri.c r2 = p317ri.C5864c.f22677c0
            return r2
        L16:
            ri.c r0 = new ri.c
            r0.<init>(r2)
            return r0
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "BOOLEAN value should have 1 byte in it"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: D */
    public static p317ri.C5864c m12216D(java.lang.Object r2) {
            if (r2 == 0) goto L47
            boolean r0 = r2 instanceof p317ri.C5864c
            if (r0 == 0) goto L7
            goto L47
        L7:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L2c
            byte[] r2 = (byte[]) r2
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.io.IOException -> L14
            ri.c r2 = (p317ri.C5864c) r2     // Catch: java.io.IOException -> L14
            return r2
        L14:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "failed to construct boolean from byte[]: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r2.getMessage()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L2c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "illegal object in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L47:
            ri.c r2 = (p317ri.C5864c) r2
            return r2
    }

    /* renamed from: E */
    public static p317ri.C5864c m12217E(p317ri.AbstractC5928y r0, boolean r1) {
            ri.s r0 = r0.m12294D()
            if (r1 != 0) goto L16
            boolean r1 = r0 instanceof p317ri.C5864c
            if (r1 == 0) goto Lb
            goto L16
        Lb:
            ri.o r0 = (p317ri.AbstractC5900o) r0
            byte[] r0 = r0.mo12219E()
            ri.c r0 = m12215C(r0)
            return r0
        L16:
            ri.c r0 = m12216D(r0)
            return r0
    }

    /* renamed from: F */
    public boolean m12218F() {
            r2 = this;
            byte[] r0 = r2.f22678Y
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto L8
            r1 = 1
        L8:
            return r1
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r2 = this;
            byte[] r0 = r2.f22678Y
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r3) {
            r2 = this;
            boolean r0 = r3 instanceof p317ri.C5864c
            r1 = 0
            if (r0 == 0) goto L12
            byte[] r0 = r2.f22678Y
            r0 = r0[r1]
            ri.c r3 = (p317ri.C5864c) r3
            byte[] r3 = r3.f22678Y
            r3 = r3[r1]
            if (r0 != r3) goto L12
            r1 = 1
        L12:
            return r1
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.f22678Y
            r1 = 1
            r3.m12266e(r1, r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r1 = this;
            r0 = 3
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            byte[] r0 = r2.f22678Y
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto La
            java.lang.String r0 = "TRUE"
            goto Lc
        La:
            java.lang.String r0 = "FALSE"
        Lc:
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

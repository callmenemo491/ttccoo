package p317ri;

/* renamed from: ri.y */
/* loaded from: classes.dex */
public abstract class AbstractC5928y extends p317ri.AbstractC5912s implements p317ri.InterfaceC5908q1 {

    /* renamed from: Y */
    public int f22755Y;

    /* renamed from: Z */
    public boolean f22756Z;

    /* renamed from: a0 */
    public p317ri.InterfaceC5870e f22757a0;

    public AbstractC5928y(boolean r3, int r4, p317ri.InterfaceC5870e r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f22756Z = r0
            r1 = 0
            r2.f22757a0 = r1
            boolean r1 = r5 instanceof p317ri.InterfaceC5867d
            if (r1 == 0) goto L10
            r2.f22756Z = r0
            goto L12
        L10:
            r2.f22756Z = r3
        L12:
            r2.f22755Y = r4
            boolean r3 = r2.f22756Z
            if (r3 == 0) goto L19
            goto L1f
        L19:
            ri.s r3 = r5.mo168e()
            boolean r3 = r3 instanceof p317ri.AbstractC5921v
        L1f:
            r2.f22757a0 = r5
            return
    }

    /* renamed from: C */
    public static p317ri.AbstractC5928y m12293C(java.lang.Object r2) {
            if (r2 == 0) goto L49
            boolean r0 = r2 instanceof p317ri.AbstractC5928y
            if (r0 == 0) goto L7
            goto L49
        L7:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L2e
            byte[] r2 = (byte[]) r2     // Catch: java.io.IOException -> L16
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.io.IOException -> L16
            ri.y r2 = m12293C(r2)     // Catch: java.io.IOException -> L16
            return r2
        L16:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "failed to construct tagged object from byte[]: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r2.getMessage()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown object in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L49:
            ri.y r2 = (p317ri.AbstractC5928y) r2
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: A */
    public p317ri.AbstractC5912s mo12209A() {
            r4 = this;
            ri.n1 r0 = new ri.n1
            boolean r1 = r4.f22756Z
            int r2 = r4.f22755Y
            ri.e r3 = r4.f22757a0
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* renamed from: D */
    public p317ri.AbstractC5912s m12294D() {
            r1 = this;
            ri.e r0 = r1.f22757a0
            if (r0 == 0) goto L9
            ri.s r0 = r0.mo168e()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r2 = this;
            int r0 = r2.f22755Y
            ri.e r1 = r2.f22757a0
            if (r1 == 0) goto Lb
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
        Lb:
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
    public boolean mo12203n(p317ri.AbstractC5912s r4) {
            r3 = this;
            boolean r0 = r4 instanceof p317ri.AbstractC5928y
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ri.y r4 = (p317ri.AbstractC5928y) r4
            int r0 = r3.f22755Y
            int r2 = r4.f22755Y
            if (r0 != r2) goto L31
            boolean r0 = r3.f22756Z
            boolean r2 = r4.f22756Z
            if (r0 == r2) goto L15
            goto L31
        L15:
            ri.e r0 = r3.f22757a0
            if (r0 != 0) goto L1e
            ri.e r4 = r4.f22757a0
            if (r4 == 0) goto L2f
            return r1
        L1e:
            ri.s r0 = r0.mo168e()
            ri.e r4 = r4.f22757a0
            ri.s r4 = r4.mo168e()
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L2f
            return r1
        L2f:
            r4 = 1
            return r4
        L31:
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "["
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r2.f22755Y
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            ri.e r1 = r2.f22757a0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: z */
    public p317ri.AbstractC5912s mo12212z() {
            r4 = this;
            ri.d1 r0 = new ri.d1
            boolean r1 = r4.f22756Z
            int r2 = r4.f22755Y
            ri.e r3 = r4.f22757a0
            r0.<init>(r1, r2, r3)
            return r0
    }
}

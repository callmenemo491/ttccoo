package p317ri;

/* renamed from: ri.b */
/* loaded from: classes.dex */
public abstract class AbstractC5861b extends p317ri.AbstractC5912s implements p317ri.InterfaceC5926x {

    /* renamed from: a0 */
    public static final char[] f22667a0 = null;

    /* renamed from: Y */
    public final byte[] f22668Y;

    /* renamed from: Z */
    public final int f22669Z;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            p317ri.AbstractC5861b.f22667a0 = r0
            return
    }

    public AbstractC5861b(byte[] r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "data cannot be null"
            java.util.Objects.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto L16
            if (r3 != 0) goto Le
            goto L16
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "zero length data with non-zero pad bits"
            r2.<init>(r3)
            throw r2
        L16:
            r0 = 7
            if (r3 > r0) goto L24
            if (r3 < 0) goto L24
            byte[] r2 = p400wj.C6888a.m13951c(r2)
            r1.f22668Y = r2
            r1.f22669Z = r3
            return
        L24:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "pad bits cannot be greater than 7 or less than 0"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: C */
    public static byte[] m12208C(byte[] r3, int r4) {
            byte[] r0 = p400wj.C6888a.m13951c(r3)
            if (r4 <= 0) goto L13
            int r3 = r3.length
            int r3 = r3 + (-1)
            r1 = r0[r3]
            r2 = 255(0xff, float:3.57E-43)
            int r4 = r2 << r4
            r4 = r4 & r1
            byte r4 = (byte) r4
            r0[r3] = r4
        L13:
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: A */
    public p317ri.AbstractC5912s mo12209A() {
            r3 = this;
            ri.j1 r0 = new ri.j1
            byte[] r1 = r3.f22668Y
            int r2 = r3.f22669Z
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: D */
    public byte[] m12210D() {
            r2 = this;
            byte[] r0 = r2.f22668Y
            int r1 = r2.f22669Z
            byte[] r0 = m12208C(r0, r1)
            return r0
    }

    @Override // p317ri.InterfaceC5926x
    /* renamed from: h */
    public java.lang.String mo12211h() {
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "#"
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            ri.q r2 = new ri.q
            r2.<init>(r1)
            r3 = 0
            r2.mo12244h(r5)     // Catch: java.io.IOException -> L3a
            byte[] r1 = r1.toByteArray()
        L19:
            int r2 = r1.length
            if (r3 == r2) goto L35
            char[] r2 = p317ri.AbstractC5861b.f22667a0
            r4 = r1[r3]
            int r4 = r4 >>> 4
            r4 = r4 & 15
            char r4 = r2[r4]
            r0.append(r4)
            r4 = r1[r3]
            r4 = r4 & 15
            char r2 = r2[r4]
            r0.append(r2)
            int r3 = r3 + 1
            goto L19
        L35:
            java.lang.String r0 = r0.toString()
            return r0
        L3a:
            r0 = move-exception
            ri.r r1 = new ri.r
            java.lang.String r2 = "Internal error encoding BitString: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r4 = r0.getMessage()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0, r3)
            throw r1
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r2 = this;
            int r0 = r2.f22669Z
            byte[] r1 = r2.m12210D()
            int r1 = p400wj.C6888a.m13952d(r1)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r4) {
            r3 = this;
            boolean r0 = r4 instanceof p317ri.AbstractC5861b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ri.b r4 = (p317ri.AbstractC5861b) r4
            int r0 = r3.f22669Z
            int r2 = r4.f22669Z
            if (r0 != r2) goto L1d
            byte[] r0 = r3.m12210D()
            byte[] r4 = r4.m12210D()
            boolean r4 = p400wj.C6888a.m13949a(r0, r4)
            if (r4 == 0) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mo12211h()
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: z */
    public p317ri.AbstractC5912s mo12212z() {
            r3 = this;
            ri.n0 r0 = new ri.n0
            byte[] r1 = r3.f22668Y
            int r2 = r3.f22669Z
            r0.<init>(r1, r2)
            return r0
    }
}

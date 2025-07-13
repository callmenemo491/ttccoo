package p317ri;

/* renamed from: ri.p1 */
/* loaded from: classes.dex */
public class C5905p1 extends p317ri.AbstractC5920u1 {

    /* renamed from: c0 */
    public static final byte[] f22727c0 = null;

    /* renamed from: a0 */
    public final int f22728a0;

    /* renamed from: b0 */
    public int f22729b0;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            p317ri.C5905p1.f22727c0 = r0
            return
    }

    public C5905p1(java.io.InputStream r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r2 < 0) goto L10
            r0.f22728a0 = r2
            r0.f22729b0 = r2
            if (r2 != 0) goto Lf
            r1 = 1
            r0.m12283h(r1)
        Lf:
            return
        L10:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "negative lengths not allowed"
            r1.<init>(r2)
            throw r1
    }

    @Override // p317ri.AbstractC5920u1
    /* renamed from: a */
    public int mo12260a() {
            r1 = this;
            int r0 = r1.f22729b0
            return r0
    }

    /* renamed from: i */
    public byte[] m12261i() {
            r3 = this;
            int r0 = r3.f22729b0
            if (r0 != 0) goto L7
            byte[] r0 = p317ri.C5905p1.f22727c0
            return r0
        L7:
            byte[] r1 = new byte[r0]
            java.io.InputStream r2 = r3.f22747Y
            int r2 = p441yj.C7221a.m14286a(r2, r1)
            int r0 = r0 - r2
            r3.f22729b0 = r0
            if (r0 != 0) goto L19
            r0 = 1
            r3.m12283h(r0)
            return r1
        L19:
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.String r1 = "DEF length "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r3.f22728a0
            r1.append(r2)
            java.lang.String r2 = " object truncated by "
            r1.append(r2)
            int r2 = r3.f22729b0
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream
    public int read() {
            r3 = this;
            int r0 = r3.f22729b0
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            java.io.InputStream r0 = r3.f22747Y
            int r0 = r0.read()
            if (r0 < 0) goto L1a
            int r1 = r3.f22729b0
            r2 = 1
            int r1 = r1 - r2
            r3.f22729b0 = r1
            if (r1 != 0) goto L19
            r3.m12283h(r2)
        L19:
            return r0
        L1a:
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.String r1 = "DEF length "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r3.f22728a0
            r1.append(r2)
            java.lang.String r2 = " object truncated by "
            r1.append(r2)
            int r2 = r3.f22729b0
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.f22729b0
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            int r4 = java.lang.Math.min(r4, r0)
            java.io.InputStream r0 = r1.f22747Y
            int r2 = r0.read(r2, r3, r4)
            if (r2 < 0) goto L1e
            int r3 = r1.f22729b0
            int r3 = r3 - r2
            r1.f22729b0 = r3
            if (r3 != 0) goto L1d
            r3 = 1
            r1.m12283h(r3)
        L1d:
            return r2
        L1e:
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.String r3 = "DEF length "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            int r4 = r1.f22728a0
            r3.append(r4)
            java.lang.String r4 = " object truncated by "
            r3.append(r4)
            int r4 = r1.f22729b0
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }
}

package p317ri;

/* renamed from: ri.r1 */
/* loaded from: classes.dex */
public class C5911r1 extends p317ri.AbstractC5920u1 {

    /* renamed from: a0 */
    public int f22737a0;

    /* renamed from: b0 */
    public int f22738b0;

    /* renamed from: c0 */
    public boolean f22739c0;

    /* renamed from: d0 */
    public boolean f22740d0;

    public C5911r1(java.io.InputStream r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.f22739c0 = r2
            r2 = 1
            r0.f22740d0 = r2
            int r2 = r1.read()
            r0.f22737a0 = r2
            int r1 = r1.read()
            r0.f22738b0 = r1
            if (r1 < 0) goto L1b
            r0.m12270i()
            return
        L1b:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    /* renamed from: i */
    public final boolean m12270i() {
            r1 = this;
            boolean r0 = r1.f22739c0
            if (r0 != 0) goto L16
            boolean r0 = r1.f22740d0
            if (r0 == 0) goto L16
            int r0 = r1.f22737a0
            if (r0 != 0) goto L16
            int r0 = r1.f22738b0
            if (r0 != 0) goto L16
            r0 = 1
            r1.f22739c0 = r0
            r1.m12283h(r0)
        L16:
            boolean r0 = r1.f22739c0
            return r0
    }

    @Override // java.io.InputStream
    public int read() {
            r3 = this;
            boolean r0 = r3.m12270i()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            java.io.InputStream r0 = r3.f22747Y
            int r0 = r0.read()
            if (r0 < 0) goto L19
            int r1 = r3.f22737a0
            int r2 = r3.f22738b0
            r3.f22737a0 = r2
            r3.f22738b0 = r0
            return r1
        L19:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.f22740d0
            if (r0 != 0) goto L47
            r0 = 3
            if (r5 >= r0) goto L8
            goto L47
        L8:
            boolean r0 = r2.f22739c0
            if (r0 == 0) goto Le
            r3 = -1
            return r3
        Le:
            java.io.InputStream r0 = r2.f22747Y
            int r1 = r4 + 2
            int r5 = r5 + (-2)
            int r5 = r0.read(r3, r1, r5)
            if (r5 < 0) goto L41
            int r0 = r2.f22737a0
            byte r0 = (byte) r0
            r3[r4] = r0
            int r4 = r4 + 1
            int r0 = r2.f22738b0
            byte r0 = (byte) r0
            r3[r4] = r0
            java.io.InputStream r3 = r2.f22747Y
            int r3 = r3.read()
            r2.f22737a0 = r3
            java.io.InputStream r3 = r2.f22747Y
            int r3 = r3.read()
            r2.f22738b0 = r3
            if (r3 < 0) goto L3b
            int r5 = r5 + 2
            return r5
        L3b:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L41:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L47:
            int r3 = super.read(r3, r4, r5)
            return r3
    }
}

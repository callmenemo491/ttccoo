package p352u5;

/* renamed from: u5.k */
/* loaded from: classes.dex */
public final class C6322k extends java.io.InputStream {

    /* renamed from: Y */
    public final p352u5.InterfaceC6320i f24698Y;

    /* renamed from: Z */
    public final p352u5.C6323l f24699Z;

    /* renamed from: a0 */
    public final byte[] f24700a0;

    /* renamed from: b0 */
    public boolean f24701b0;

    /* renamed from: c0 */
    public boolean f24702c0;

    /* renamed from: d0 */
    public long f24703d0;

    public C6322k(p352u5.InterfaceC6320i r2, p352u5.C6323l r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f24701b0 = r0
            r1.f24702c0 = r0
            r1.f24698Y = r2
            r1.f24699Z = r3
            r2 = 1
            byte[] r2 = new byte[r2]
            r1.f24700a0 = r2
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.f24702c0
            if (r0 != 0) goto Lc
            u5.i r0 = r1.f24698Y
            r0.close()
            r0 = 1
            r1.f24702c0 = r0
        Lc:
            return
    }

    @Override // java.io.InputStream
    public int read() {
            r2 = this;
            byte[] r0 = r2.f24700a0
            int r0 = r2.read(r0)
            r1 = -1
            if (r0 != r1) goto La
            goto L11
        La:
            byte[] r0 = r2.f24700a0
            r1 = 0
            r0 = r0[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
        L11:
            return r1
    }

    @Override // java.io.InputStream
    public int read(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            int r3 = r2.read(r3, r1, r0)
            return r3
    }

    @Override // java.io.InputStream
    public int read(byte[] r4, int r5, int r6) {
            r3 = this;
            boolean r0 = r3.f24702c0
            r1 = 1
            r0 = r0 ^ r1
            p371v5.C6549a.m13291e(r0)
            boolean r0 = r3.f24701b0
            if (r0 != 0) goto L14
            u5.i r0 = r3.f24698Y
            u5.l r2 = r3.f24699Z
            r0.mo6021c(r2)
            r3.f24701b0 = r1
        L14:
            u5.i r0 = r3.f24698Y
            int r4 = r0.mo6020b(r4, r5, r6)
            r5 = -1
            if (r4 != r5) goto L1e
            return r5
        L1e:
            long r5 = r3.f24703d0
            long r0 = (long) r4
            long r5 = r5 + r0
            r3.f24703d0 = r5
            return r4
    }
}

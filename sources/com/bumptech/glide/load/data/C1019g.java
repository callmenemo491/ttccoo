package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.g */
/* loaded from: classes.dex */
public final class C1019g extends java.io.FilterInputStream {

    /* renamed from: a0 */
    public static final byte[] f5205a0 = null;

    /* renamed from: b0 */
    public static final int f5206b0 = 0;

    /* renamed from: Y */
    public final byte f5207Y;

    /* renamed from: Z */
    public int f5208Z;

    static {
            r0 = 29
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0} // fill-array
            com.bumptech.glide.load.data.C1019g.f5205a0 = r0
            r0 = 31
            com.bumptech.glide.load.data.C1019g.f5206b0 = r0
            return
    }

    public C1019g(java.io.InputStream r2, int r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = -1
            if (r3 < r2) goto Le
            r2 = 8
            if (r3 > r2) goto Le
            byte r2 = (byte) r3
            r1.f5207Y = r2
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot add invalid orientation: "
            java.lang.String r3 = android.support.v4.media.C0142a.m254a(r0, r3)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
            r3 = this;
            int r0 = r3.f5208Z
            r1 = 2
            if (r0 < r1) goto L17
            int r2 = com.bumptech.glide.load.data.C1019g.f5206b0
            if (r0 <= r2) goto La
            goto L17
        La:
            if (r0 != r2) goto Lf
            byte r0 = r3.f5207Y
            goto L1b
        Lf:
            byte[] r2 = com.bumptech.glide.load.data.C1019g.f5205a0
            int r0 = r0 - r1
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L1b
        L17:
            int r0 = super.read()
        L1b:
            r1 = -1
            if (r0 == r1) goto L24
            int r1 = r3.f5208Z
            int r1 = r1 + 1
            r3.f5208Z = r1
        L24:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.f5208Z
            int r1 = com.bumptech.glide.load.data.C1019g.f5206b0
            if (r0 <= r1) goto Lb
            int r4 = super.read(r4, r5, r6)
            goto L2a
        Lb:
            if (r0 != r1) goto L13
            byte r6 = r3.f5207Y
            r4[r5] = r6
            r4 = 1
            goto L2a
        L13:
            r2 = 2
            if (r0 >= r2) goto L1c
            int r2 = r2 - r0
            int r4 = super.read(r4, r5, r2)
            goto L2a
        L1c:
            int r1 = r1 - r0
            int r6 = java.lang.Math.min(r1, r6)
            byte[] r0 = com.bumptech.glide.load.data.C1019g.f5205a0
            int r1 = r3.f5208Z
            int r1 = r1 - r2
            java.lang.System.arraycopy(r0, r1, r4, r5, r6)
            r4 = r6
        L2a:
            if (r4 <= 0) goto L31
            int r5 = r3.f5208Z
            int r5 = r5 + r4
            r3.f5208Z = r5
        L31:
            return r4
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r4) {
            r3 = this;
            long r4 = super.skip(r4)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L11
            int r0 = r3.f5208Z
            long r0 = (long) r0
            long r0 = r0 + r4
            int r1 = (int) r0
            r3.f5208Z = r1
        L11:
            return r4
    }
}

package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes.dex */
public final class C1015c extends java.io.OutputStream {

    /* renamed from: Y */
    public final java.io.OutputStream f5198Y;

    /* renamed from: Z */
    public byte[] f5199Z;

    /* renamed from: a0 */
    public p229n2.InterfaceC4672b f5200a0;

    /* renamed from: b0 */
    public int f5201b0;

    public C1015c(java.io.OutputStream r2, p229n2.InterfaceC4672b r3) {
            r1 = this;
            r1.<init>()
            r1.f5198Y = r2
            r1.f5200a0 = r3
            java.lang.Class<byte[]> r2 = byte[].class
            r0 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r2 = r3.mo10688e(r0, r2)
            byte[] r2 = (byte[]) r2
            r1.f5199Z = r2
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            r2.flush()     // Catch: java.lang.Throwable -> L15
            java.io.OutputStream r0 = r2.f5198Y
            r0.close()
            byte[] r0 = r2.f5199Z
            if (r0 == 0) goto L14
            n2.b r1 = r2.f5200a0
            r1.mo10687d(r0)
            r0 = 0
            r2.f5199Z = r0
        L14:
            return
        L15:
            r0 = move-exception
            java.io.OutputStream r1 = r2.f5198Y
            r1.close()
            throw r0
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
            r4 = this;
            int r0 = r4.f5201b0
            if (r0 <= 0) goto Le
            java.io.OutputStream r1 = r4.f5198Y
            byte[] r2 = r4.f5199Z
            r3 = 0
            r1.write(r2, r3, r0)
            r4.f5201b0 = r3
        Le:
            java.io.OutputStream r0 = r4.f5198Y
            r0.flush()
            return
    }

    @Override // java.io.OutputStream
    public void write(int r4) {
            r3 = this;
            byte[] r0 = r3.f5199Z
            int r1 = r3.f5201b0
            int r2 = r1 + 1
            r3.f5201b0 = r2
            byte r4 = (byte) r4
            r0[r1] = r4
            int r4 = r0.length
            if (r2 != r4) goto L18
            if (r2 <= 0) goto L18
            java.io.OutputStream r4 = r3.f5198Y
            r1 = 0
            r4.write(r0, r1, r2)
            r3.f5201b0 = r1
        L18:
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.write(r3, r1, r0)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r7, int r8, int r9) {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r9 - r1
            int r3 = r8 + r1
            int r4 = r6.f5201b0
            if (r4 != 0) goto L15
            byte[] r5 = r6.f5199Z
            int r5 = r5.length
            if (r2 < r5) goto L15
            java.io.OutputStream r8 = r6.f5198Y
            r8.write(r7, r3, r2)
            return
        L15:
            byte[] r5 = r6.f5199Z
            int r5 = r5.length
            int r5 = r5 - r4
            int r2 = java.lang.Math.min(r2, r5)
            byte[] r4 = r6.f5199Z
            int r5 = r6.f5201b0
            java.lang.System.arraycopy(r7, r3, r4, r5, r2)
            int r3 = r6.f5201b0
            int r3 = r3 + r2
            r6.f5201b0 = r3
            int r1 = r1 + r2
            byte[] r2 = r6.f5199Z
            int r4 = r2.length
            if (r3 != r4) goto L38
            if (r3 <= 0) goto L38
            java.io.OutputStream r4 = r6.f5198Y
            r4.write(r2, r0, r3)
            r6.f5201b0 = r0
        L38:
            if (r1 < r9) goto L2
            return
    }
}

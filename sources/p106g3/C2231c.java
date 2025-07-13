package p106g3;

/* renamed from: g3.c */
/* loaded from: classes.dex */
public final class C2231c extends java.io.FilterInputStream {

    /* renamed from: Y */
    public final long f10195Y;

    /* renamed from: Z */
    public int f10196Z;

    public C2231c(java.io.InputStream r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f10195Y = r2
            return
    }

    /* renamed from: a */
    public final int m5832a(int r6) {
            r5 = this;
            if (r6 < 0) goto L8
            int r0 = r5.f10196Z
            int r0 = r0 + r6
            r5.f10196Z = r0
            goto L14
        L8:
            long r0 = r5.f10195Y
            int r2 = r5.f10196Z
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L15
        L14:
            return r6
        L15:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Failed to read all expected data, expected: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r5.f10195Y
            r0.append(r1)
            java.lang.String r1 = ", but read: "
            r0.append(r1)
            int r1 = r5.f10196Z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.f10195Y     // Catch: java.lang.Throwable -> L15
            int r2 = r4.f10196Z     // Catch: java.lang.Throwable -> L15
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L15
            long r0 = r0 - r2
            java.io.InputStream r2 = r4.in     // Catch: java.lang.Throwable -> L15
            int r2 = r2.available()     // Catch: java.lang.Throwable -> L15
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L15
            long r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L15
            int r1 = (int) r0
            monitor-exit(r4)
            return r1
        L15:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
            r2 = this;
            monitor-enter(r2)
            int r0 = super.read()     // Catch: java.lang.Throwable -> Lf
            if (r0 < 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = -1
        La:
            r2.m5832a(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            int r3 = r2.read(r3, r1, r0)
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] r1, int r2, int r3) {
            r0 = this;
            monitor-enter(r0)
            int r1 = super.read(r1, r2, r3)     // Catch: java.lang.Throwable -> La
            r0.m5832a(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}

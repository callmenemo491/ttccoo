package p145i7;

/* renamed from: i7.k */
/* loaded from: classes.dex */
public final class C3102k extends java.io.FilterInputStream {

    /* renamed from: Y */
    public long f12491Y;

    /* renamed from: Z */
    public long f12492Z;

    public C3102k(java.io.InputStream r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = -1
            r2.f12492Z = r0
            java.util.Objects.requireNonNull(r3)
            r0 = 1048577(0x100001, double:5.18066E-318)
            r2.f12491Y = r0
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
            r4 = this;
            java.io.InputStream r0 = r4.in
            int r0 = r0.available()
            long r0 = (long) r0
            long r2 = r4.f12491Y
            long r0 = java.lang.Math.min(r0, r2)
            int r1 = (int) r0
            return r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> Lc
            r0.mark(r3)     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.f12491Y     // Catch: java.lang.Throwable -> Lc
            r2.f12492Z = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
            r6 = this;
            long r0 = r6.f12491Y
            r2 = -1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto La
            return r2
        La:
            java.io.InputStream r0 = r6.in
            int r0 = r0.read()
            if (r0 == r2) goto L19
            long r1 = r6.f12491Y
            r3 = -1
            long r1 = r1 + r3
            r6.f12491Y = r1
        L19:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r7, int r8, int r9) {
            r6 = this;
            long r0 = r6.f12491Y
            r2 = -1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto La
            return r2
        La:
            long r3 = (long) r9
            long r0 = java.lang.Math.min(r3, r0)
            java.io.InputStream r9 = r6.in
            int r1 = (int) r0
            int r7 = r9.read(r7, r8, r1)
            if (r7 == r2) goto L1e
            long r8 = r6.f12491Y
            long r0 = (long) r7
            long r8 = r8 - r0
            r6.f12491Y = r8
        L1e:
            return r7
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
            r5 = this;
            monitor-enter(r5)
            java.io.InputStream r0 = r5.in     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.markSupported()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L24
            long r0 = r5.f12492Z     // Catch: java.lang.Throwable -> L2c
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c
            java.io.InputStream r0 = r5.in     // Catch: java.lang.Throwable -> L2c
            r0.reset()     // Catch: java.lang.Throwable -> L2c
            long r0 = r5.f12492Z     // Catch: java.lang.Throwable -> L2c
            r5.f12491Y = r0     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r5)
            return
        L1c:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "Mark not set"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L24:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "Mark not supported"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) {
            r2 = this;
            long r0 = r2.f12491Y
            long r3 = java.lang.Math.min(r3, r0)
            java.io.InputStream r0 = r2.in
            long r3 = r0.skip(r3)
            long r0 = r2.f12491Y
            long r0 = r0 - r3
            r2.f12491Y = r0
            return r3
    }
}

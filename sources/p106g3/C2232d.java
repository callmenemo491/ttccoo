package p106g3;

/* renamed from: g3.d */
/* loaded from: classes.dex */
public final class C2232d extends java.io.InputStream {

    /* renamed from: a0 */
    public static final java.util.Queue<p106g3.C2232d> f10197a0 = null;

    /* renamed from: Y */
    public java.io.InputStream f10198Y;

    /* renamed from: Z */
    public java.io.IOException f10199Z;

    static {
            char[] r0 = p106g3.C2238j.f10214a
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 0
            r0.<init>(r1)
            p106g3.C2232d.f10197a0 = r0
            return
    }

    public C2232d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.InputStream
    public int available() {
            r1 = this;
            java.io.InputStream r0 = r1.f10198Y
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.InputStream r0 = r1.f10198Y
            r0.close()
            return
    }

    @Override // java.io.InputStream
    public void mark(int r2) {
            r1 = this;
            java.io.InputStream r0 = r1.f10198Y
            r0.mark(r2)
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.f10198Y
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream
    public int read() {
            r1 = this;
            java.io.InputStream r0 = r1.f10198Y     // Catch: java.io.IOException -> L7
            int r0 = r0.read()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            r1.f10199Z = r0
            throw r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r2) {
            r1 = this;
            java.io.InputStream r0 = r1.f10198Y     // Catch: java.io.IOException -> L7
            int r2 = r0.read(r2)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.f10199Z = r2
            throw r2
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) {
            r1 = this;
            java.io.InputStream r0 = r1.f10198Y     // Catch: java.io.IOException -> L7
            int r2 = r0.read(r2, r3, r4)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.f10199Z = r2
            throw r2
    }

    public void release() {
            r2 = this;
            r0 = 0
            r2.f10199Z = r0
            r2.f10198Y = r0
            java.util.Queue<g3.d> r0 = p106g3.C2232d.f10197a0
            monitor-enter(r0)
            r1 = r0
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L12
            r1.offer(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        L12:
            r1 = move-exception
            goto L10
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.f10198Y     // Catch: java.lang.Throwable -> L8
            r0.reset()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.io.InputStream
    public long skip(long r2) {
            r1 = this;
            java.io.InputStream r0 = r1.f10198Y     // Catch: java.io.IOException -> L7
            long r2 = r0.skip(r2)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.f10199Z = r2
            throw r2
    }
}

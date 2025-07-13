package p260oi;

/* renamed from: oi.o */
/* loaded from: classes.dex */
public final class C5293o implements p260oi.InterfaceC5304z {

    /* renamed from: Y */
    public final java.io.InputStream f20521Y;

    /* renamed from: Z */
    public final p260oi.C5279a0 f20522Z;

    public C5293o(java.io.InputStream r1, p260oi.C5279a0 r2) {
            r0 = this;
            r0.<init>()
            r0.f20521Y = r1
            r0.f20522Z = r2
            return
    }

    @Override // p260oi.InterfaceC5304z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.InputStream r0 = r1.f20521Y
            r0.close()
            return
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: d */
    public p260oi.C5279a0 mo7463d() {
            r1 = this;
            oi.a0 r0 = r1.f20522Z
            return r0
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: j0 */
    public long mo4683j0(p260oi.C5283e r4, long r5) {
            r3 = this;
            java.lang.String r0 = "sink"
            p214m2.C4339q.m9706k(r4, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            return r0
        Lc:
            r0 = 1
            if (r2 < 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L60
            oi.a0 r1 = r3.f20522Z     // Catch: java.lang.AssertionError -> L52
            r1.mo11529f()     // Catch: java.lang.AssertionError -> L52
            oi.u r0 = r4.m11580y0(r0)     // Catch: java.lang.AssertionError -> L52
            int r1 = r0.f20538c     // Catch: java.lang.AssertionError -> L52
            int r1 = 8192 - r1
            long r1 = (long) r1     // Catch: java.lang.AssertionError -> L52
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.AssertionError -> L52
            int r6 = (int) r5     // Catch: java.lang.AssertionError -> L52
            java.io.InputStream r5 = r3.f20521Y     // Catch: java.lang.AssertionError -> L52
            byte[] r1 = r0.f20536a     // Catch: java.lang.AssertionError -> L52
            int r2 = r0.f20538c     // Catch: java.lang.AssertionError -> L52
            int r5 = r5.read(r1, r2, r6)     // Catch: java.lang.AssertionError -> L52
            r6 = -1
            if (r5 != r6) goto L46
            int r5 = r0.f20537b     // Catch: java.lang.AssertionError -> L52
            int r6 = r0.f20538c     // Catch: java.lang.AssertionError -> L52
            if (r5 != r6) goto L43
            oi.u r5 = r0.m11604a()     // Catch: java.lang.AssertionError -> L52
            r4.f20500Y = r5     // Catch: java.lang.AssertionError -> L52
            p260oi.C5300v.m11608b(r0)     // Catch: java.lang.AssertionError -> L52
        L43:
            r4 = -1
            return r4
        L46:
            int r6 = r0.f20538c     // Catch: java.lang.AssertionError -> L52
            int r6 = r6 + r5
            r0.f20538c = r6     // Catch: java.lang.AssertionError -> L52
            long r0 = r4.f20501Z     // Catch: java.lang.AssertionError -> L52
            long r5 = (long) r5     // Catch: java.lang.AssertionError -> L52
            long r0 = r0 + r5
            r4.f20501Z = r0     // Catch: java.lang.AssertionError -> L52
            return r5
        L52:
            r4 = move-exception
            boolean r5 = p101fh.C2174f.m5726p(r4)
            if (r5 == 0) goto L5f
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L5f:
            throw r4
        L60:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = p382w0.C6774a.m13748a(r4, r5)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "source("
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.io.InputStream r1 = r2.f20521Y
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package p260oi;

/* renamed from: oi.r */
/* loaded from: classes.dex */
public final class C5296r implements p260oi.InterfaceC5302x {

    /* renamed from: Y */
    public final java.io.OutputStream f20527Y;

    /* renamed from: Z */
    public final p260oi.C5279a0 f20528Z;

    public C5296r(java.io.OutputStream r1, p260oi.C5279a0 r2) {
            r0 = this;
            r0.<init>()
            r0.f20527Y = r1
            r0.f20528Z = r2
            return
    }

    @Override // p260oi.InterfaceC5302x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.OutputStream r0 = r1.f20527Y
            r0.close()
            return
    }

    @Override // p260oi.InterfaceC5302x
    /* renamed from: d */
    public p260oi.C5279a0 mo7464d() {
            r1 = this;
            oi.a0 r0 = r1.f20528Z
            return r0
    }

    @Override // p260oi.InterfaceC5302x, java.io.Flushable
    public void flush() {
            r1 = this;
            java.io.OutputStream r0 = r1.f20527Y
            r0.flush()
            return
    }

    @Override // p260oi.InterfaceC5302x
    /* renamed from: p0 */
    public void mo5749p0(p260oi.C5283e r8, long r9) {
            r7 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r8, r0)
            long r1 = r8.f20501Z
            r3 = 0
            r5 = r9
            p080ei.C1854b.m4602d(r1, r3, r5)
        Ld:
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L4b
            oi.a0 r0 = r7.f20528Z
            r0.mo11529f()
            oi.u r0 = r8.f20500Y
            p214m2.C4339q.m9704i(r0)
            int r1 = r0.f20538c
            int r2 = r0.f20537b
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r9, r1)
            int r2 = (int) r1
            java.io.OutputStream r1 = r7.f20527Y
            byte[] r3 = r0.f20536a
            int r4 = r0.f20537b
            r1.write(r3, r4, r2)
            int r1 = r0.f20537b
            int r1 = r1 + r2
            r0.f20537b = r1
            long r2 = (long) r2
            long r9 = r9 - r2
            long r4 = r8.f20501Z
            long r4 = r4 - r2
            r8.f20501Z = r4
            int r2 = r0.f20538c
            if (r1 != r2) goto Ld
            oi.u r1 = r0.m11604a()
            r8.f20500Y = r1
            p260oi.C5300v.m11608b(r0)
            goto Ld
        L4b:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "sink("
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.io.OutputStream r1 = r2.f20527Y
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

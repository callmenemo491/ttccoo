package p260oi;

/* renamed from: oi.d */
/* loaded from: classes.dex */
public final class C5282d implements p260oi.InterfaceC5304z {

    /* renamed from: Y */
    public final /* synthetic */ p260oi.C5280b f20498Y;

    /* renamed from: Z */
    public final /* synthetic */ p260oi.InterfaceC5304z f20499Z;

    public C5282d(p260oi.C5280b r1, p260oi.InterfaceC5304z r2) {
            r0 = this;
            r0.f20498Y = r1
            r0.f20499Z = r2
            r0.<init>()
            return
    }

    @Override // p260oi.InterfaceC5304z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            oi.b r0 = r3.f20498Y
            r0.m11531h()
            oi.z r1 = r3.f20499Z     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            r1.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            boolean r1 = r0.m11532i()
            if (r1 != 0) goto L11
            return
        L11:
            r1 = 0
            java.io.IOException r0 = r0.mo7667j(r1)
            throw r0
        L17:
            r1 = move-exception
            goto L26
        L19:
            r1 = move-exception
            boolean r2 = r0.m11532i()     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L21
            goto L25
        L21:
            java.io.IOException r1 = r0.mo7667j(r1)     // Catch: java.lang.Throwable -> L17
        L25:
            throw r1     // Catch: java.lang.Throwable -> L17
        L26:
            boolean r0 = r0.m11532i()
            throw r1
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: d */
    public p260oi.C5279a0 mo7463d() {
            r1 = this;
            oi.b r0 = r1.f20498Y
            return r0
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: j0 */
    public long mo4683j0(p260oi.C5283e r3, long r4) {
            r2 = this;
            java.lang.String r0 = "sink"
            p214m2.C4339q.m9706k(r3, r0)
            oi.b r0 = r2.f20498Y
            r0.m11531h()
            oi.z r1 = r2.f20499Z     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f
            long r3 = r1.mo4683j0(r3, r4)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f
            boolean r5 = r0.m11532i()
            if (r5 != 0) goto L17
            return r3
        L17:
            r3 = 0
            java.io.IOException r3 = r0.mo7667j(r3)
            throw r3
        L1d:
            r3 = move-exception
            goto L2c
        L1f:
            r3 = move-exception
            boolean r4 = r0.m11532i()     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L27
            goto L2b
        L27:
            java.io.IOException r3 = r0.mo7667j(r3)     // Catch: java.lang.Throwable -> L1d
        L2b:
            throw r3     // Catch: java.lang.Throwable -> L1d
        L2c:
            boolean r4 = r0.m11532i()
            throw r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AsyncTimeout.source("
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            oi.z r1 = r2.f20499Z
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

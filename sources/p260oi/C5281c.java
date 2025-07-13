package p260oi;

/* renamed from: oi.c */
/* loaded from: classes.dex */
public final class C5281c implements p260oi.InterfaceC5302x {

    /* renamed from: Y */
    public final /* synthetic */ p260oi.C5280b f20496Y;

    /* renamed from: Z */
    public final /* synthetic */ p260oi.InterfaceC5302x f20497Z;

    public C5281c(p260oi.C5280b r1, p260oi.InterfaceC5302x r2) {
            r0 = this;
            r0.f20496Y = r1
            r0.f20497Z = r2
            r0.<init>()
            return
    }

    @Override // p260oi.InterfaceC5302x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            oi.b r0 = r3.f20496Y
            r0.m11531h()
            oi.x r1 = r3.f20497Z     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
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

    @Override // p260oi.InterfaceC5302x
    /* renamed from: d */
    public p260oi.C5279a0 mo7464d() {
            r1 = this;
            oi.b r0 = r1.f20496Y
            return r0
    }

    @Override // p260oi.InterfaceC5302x, java.io.Flushable
    public void flush() {
            r3 = this;
            oi.b r0 = r3.f20496Y
            r0.m11531h()
            oi.x r1 = r3.f20497Z     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            r1.flush()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
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
            if (r2 <= 0) goto L5b
            oi.u r2 = r8.f20500Y
        L15:
            p214m2.C4339q.m9704i(r2)
            r3 = 65536(0x10000, float:9.1835E-41)
            long r3 = (long) r3
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2f
            int r3 = r2.f20538c
            int r4 = r2.f20537b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r0 = r0 + r3
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 < 0) goto L2c
            r0 = r9
            goto L2f
        L2c:
            oi.u r2 = r2.f20541f
            goto L15
        L2f:
            oi.b r2 = r7.f20496Y
            r2.m11531h()
            oi.x r3 = r7.f20497Z     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r3.mo5749p0(r8, r0)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            boolean r3 = r2.m11532i()
            if (r3 != 0) goto L41
            long r9 = r9 - r0
            goto Ld
        L41:
            r8 = 0
            java.io.IOException r8 = r2.mo7667j(r8)
            throw r8
        L47:
            r8 = move-exception
            goto L56
        L49:
            r8 = move-exception
            boolean r9 = r2.m11532i()     // Catch: java.lang.Throwable -> L47
            if (r9 != 0) goto L51
            goto L55
        L51:
            java.io.IOException r8 = r2.mo7667j(r8)     // Catch: java.lang.Throwable -> L47
        L55:
            throw r8     // Catch: java.lang.Throwable -> L47
        L56:
            boolean r9 = r2.m11532i()
            throw r8
        L5b:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AsyncTimeout.sink("
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            oi.x r1 = r2.f20497Z
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

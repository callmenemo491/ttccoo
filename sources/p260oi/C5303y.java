package p260oi;

/* renamed from: oi.y */
/* loaded from: classes.dex */
public final class C5303y extends p260oi.C5280b {

    /* renamed from: l */
    public final java.net.Socket f20549l;

    public C5303y(java.net.Socket r1) {
            r0 = this;
            r0.<init>()
            r0.f20549l = r1
            return
    }

    @Override // p260oi.C5280b
    /* renamed from: j */
    public java.io.IOException mo7667j(java.io.IOException r3) {
            r2 = this;
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            r0.initCause(r3)
        Lc:
            return r0
    }

    @Override // p260oi.C5280b
    /* renamed from: k */
    public void mo5761k() {
            r5 = this;
            java.net.Socket r0 = r5.f20549l     // Catch: java.lang.AssertionError -> L6 java.lang.Exception -> L18
            r0.close()     // Catch: java.lang.AssertionError -> L6 java.lang.Exception -> L18
            goto L33
        L6:
            r0 = move-exception
            boolean r1 = p101fh.C2174f.m5726p(r0)
            if (r1 == 0) goto L17
            java.util.logging.Logger r1 = p260oi.C5294p.f20523a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L22
        L17:
            throw r0
        L18:
            r0 = move-exception
            java.util.logging.Logger r1 = p260oi.C5294p.f20523a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L22:
            java.lang.String r4 = "Failed to close timed out socket "
            r3.append(r4)
            java.net.Socket r4 = r5.f20549l
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3, r0)
        L33:
            return
    }
}

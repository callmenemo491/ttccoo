package p123h6;

/* renamed from: h6.b0 */
/* loaded from: classes.dex */
public final class RunnableC2490b0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p123h6.C2494d0 f11256Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f11257Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f11258a0;

    public RunnableC2490b0(p123h6.C2494d0 r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.f11256Y = r1
            r0.f11257Z = r2
            r0.f11258a0 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            h6.d0 r0 = r4.f11256Y
            java.util.Map<java.lang.String, com.google.android.gms.cast.a$d> r0 = r0.f11267C0
            monitor-enter(r0)
            h6.d0 r1 = r4.f11256Y     // Catch: java.lang.Throwable -> L30
            java.util.Map<java.lang.String, com.google.android.gms.cast.a$d> r1 = r1.f11267C0     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = r4.f11257Z     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.cast.a$d r1 = (com.google.android.gms.cast.C1057a.d) r1     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L20
            h6.d0 r0 = r4.f11256Y
            com.google.android.gms.cast.CastDevice r0 = r0.f11265A0
            java.lang.String r2 = r4.f11257Z
            java.lang.String r3 = r4.f11258a0
            r1.mo2941a(r0, r2, r3)
            return
        L20:
            h6.b r0 = p123h6.C2494d0.f11262S0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = r4.f11257Z
            r1[r2] = r3
            java.lang.String r2 = "Discarded message for unknown namespace '%s'"
            r0.m6376a(r2, r1)
            return
        L30:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1
    }
}

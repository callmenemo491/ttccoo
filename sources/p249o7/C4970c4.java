package p249o7;

/* renamed from: o7.c4 */
/* loaded from: classes.dex */
public final class C4970c4 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final java.lang.String f19619a;

    /* renamed from: b */
    public final /* synthetic */ p249o7.C4994f4 f19620b;

    public C4970c4(p249o7.C4994f4 r1, java.lang.String r2) {
            r0 = this;
            r0.f19620b = r1
            r0.<init>()
            r0.f19619a = r2
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(java.lang.Thread r2, java.lang.Throwable r3) {
            r1 = this;
            monitor-enter(r1)
            o7.f4 r2 = r1.f19620b     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L12
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r1.f19619a     // Catch: java.lang.Throwable -> L12
            r2.m11170d(r0, r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}

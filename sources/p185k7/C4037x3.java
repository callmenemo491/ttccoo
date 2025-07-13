package p185k7;

/* renamed from: k7.x3 */
/* loaded from: classes.dex */
public final class C4037x3 extends android.database.ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ p185k7.C4050y3 f16944a;

    public C4037x3(p185k7.C4050y3 r1) {
            r0 = this;
            r0.f16944a = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r3) {
            r2 = this;
            k7.y3 r3 = r2.f16944a
            java.lang.Object r0 = r3.f16965d
            monitor-enter(r0)
            r1 = 0
            r3.f16966e = r1     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.atomic.AtomicInteger r1 = p185k7.AbstractC3921o4.f16799h     // Catch: java.lang.Throwable -> L2a
            r1.incrementAndGet()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            monitor-enter(r3)
            java.util.List<k7.z3> r0 = r3.f16967f     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L27
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L27
            k7.z3 r1 = (p185k7.InterfaceC4063z3) r1     // Catch: java.lang.Throwable -> L27
            r1.m9158a()     // Catch: java.lang.Throwable -> L27
            goto L15
        L25:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r0
        L2a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r3
    }
}

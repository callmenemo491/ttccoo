package p056da;

/* renamed from: da.n */
/* loaded from: classes.dex */
public class CallableC1372n implements java.util.concurrent.Callable<p327s7.AbstractC5985i<java.lang.Void>> {

    /* renamed from: a */
    public final /* synthetic */ long f6935a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Throwable f6936b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.Thread f6937c;

    /* renamed from: d */
    public final /* synthetic */ p188ka.InterfaceC4076c f6938d;

    /* renamed from: e */
    public final /* synthetic */ p056da.C1378r f6939e;

    public CallableC1372n(p056da.C1378r r1, long r2, java.lang.Throwable r4, java.lang.Thread r5, p188ka.InterfaceC4076c r6) {
            r0 = this;
            r0.f6939e = r1
            r0.f6935a = r2
            r0.f6936b = r4
            r0.f6937c = r5
            r0.f6938d = r6
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public p327s7.AbstractC5985i<java.lang.Void> call() {
            r12 = this;
            long r0 = r12.f6935a
            r2 = 1000(0x3e8, double:4.94E-321)
            long r9 = r0 / r2
            da.r r0 = r12.f6939e
            java.lang.String r7 = r0.m3899f()
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 0
            if (r7 != 0) goto L1b
            java.lang.String r2 = "Tried to write a fatal exception while no session was open."
            android.util.Log.e(r0, r2, r1)
        L16:
            s7.i r0 = p327s7.C5988l.m12464e(r1)
            goto L8a
        L1b:
            da.r r2 = r12.f6939e
            androidx.appcompat.widget.x r2 = r2.f6951c
            r2.m820k()
            da.r r2 = r12.f6939e
            da.l0 r4 = r2.f6961m
            java.lang.Throwable r5 = r12.f6936b
            java.lang.Thread r6 = r12.f6937c
            java.util.Objects.requireNonNull(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Persisting fatal event for session "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r3 = 2
            boolean r3 = android.util.Log.isLoggable(r0, r3)
            if (r3 == 0) goto L48
            android.util.Log.v(r0, r2, r1)
        L48:
            r11 = 1
            java.lang.String r8 = "crash"
            r4.m3890f(r5, r6, r7, r8, r9, r11)
            da.r r0 = r12.f6939e
            long r2 = r12.f6935a
            r0.m3897d(r2)
            da.r r0 = r12.f6939e
            ka.c r2 = r12.f6938d
            r3 = 0
            r0.m3896c(r3, r2)
            da.r r0 = r12.f6939e
            p056da.C1378r.m3894a(r0)
            da.r r0 = r12.f6939e
            da.d0 r0 = r0.f6950b
            boolean r0 = r0.m3855a()
            if (r0 != 0) goto L6d
            goto L16
        L6d:
            da.r r0 = r12.f6939e
            da.f r0 = r0.f6952d
            java.util.concurrent.Executor r0 = r0.f6899a
            ka.c r1 = r12.f6938d
            ka.b r1 = (p188ka.C4075b) r1
            java.util.concurrent.atomic.AtomicReference<s7.j<la.a>> r1 = r1.f17002i
            java.lang.Object r1 = r1.get()
            s7.j r1 = (p327s7.C5986j) r1
            s7.q<TResult> r1 = r1.f23075a
            da.m r2 = new da.m
            r2.<init>(r12, r0)
            s7.i r0 = r1.mo12456n(r0, r2)
        L8a:
            return r0
    }
}

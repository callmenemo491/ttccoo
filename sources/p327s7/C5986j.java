package p327s7;

/* renamed from: s7.j */
/* loaded from: classes.dex */
public class C5986j<TResult> {

    /* renamed from: a */
    public final p327s7.C5993q<TResult> f23075a;

    public C5986j() {
            r1 = this;
            r1.<init>()
            s7.q r0 = new s7.q
            r0.<init>()
            r1.f23075a = r0
            return
    }

    /* renamed from: a */
    public boolean m12458a(java.lang.Exception r4) {
            r3 = this;
            s7.q<TResult> r0 = r3.f23075a
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "Exception must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r4, r1)
            java.lang.Object r1 = r0.f23096a
            monitor-enter(r1)
            boolean r2 = r0.f23098c     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L14
            r4 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            goto L20
        L14:
            r2 = 1
            r0.f23098c = r2     // Catch: java.lang.Throwable -> L21
            r0.f23101f = r4     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            z2.n r4 = r0.f23097b
            r4.m14309f(r0)
            r4 = 1
        L20:
            return r4
        L21:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    /* renamed from: b */
    public boolean m12459b(TResult r4) {
            r3 = this;
            s7.q<TResult> r0 = r3.f23075a
            java.lang.Object r1 = r0.f23096a
            monitor-enter(r1)
            boolean r2 = r0.f23098c     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto Lc
            r4 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            goto L18
        Lc:
            r2 = 1
            r0.f23098c = r2     // Catch: java.lang.Throwable -> L19
            r0.f23100e = r4     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            z2.n r4 = r0.f23097b
            r4.m14309f(r0)
            r4 = 1
        L18:
            return r4
        L19:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r4
    }
}

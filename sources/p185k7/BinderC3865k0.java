package p185k7;

/* renamed from: k7.k0 */
/* loaded from: classes.dex */
public final class BinderC3865k0 extends p185k7.AbstractBinderC3943q0 {

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicReference<android.os.Bundle> f16716a;

    /* renamed from: b */
    public boolean f16717b;

    public BinderC3865k0() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.f16716a = r0
            return
    }

    /* renamed from: k2 */
    public static final <T> T m8748k2(android.os.Bundle r3, java.lang.Class<T> r4) {
            if (r3 == 0) goto L31
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L31
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            goto L32
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L31:
            r3 = 0
        L32:
            return r3
    }

    @Override // p185k7.InterfaceC3956r0
    /* renamed from: D */
    public final void mo8749D(android.os.Bundle r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r0 = r2.f16716a
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.f16716a     // Catch: java.lang.Throwable -> L12
            r1.set(r3)     // Catch: java.lang.Throwable -> L12
            r3 = 1
            r2.f16717b = r3     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r3 = r2.f16716a     // Catch: java.lang.Throwable -> L19
            r3.notify()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L12:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.f16716a     // Catch: java.lang.Throwable -> L19
            r1.notify()     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L19:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    /* renamed from: H */
    public final java.lang.String m8750H(long r1) {
            r0 = this;
            android.os.Bundle r1 = r0.m8751x(r1)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Object r1 = m8748k2(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    /* renamed from: x */
    public final android.os.Bundle m8751x(long r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r0 = r2.f16716a
            monitor-enter(r0)
            boolean r1 = r2.f16717b     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L10
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.f16716a     // Catch: java.lang.InterruptedException -> Ld java.lang.Throwable -> L1a
            r1.wait(r3)     // Catch: java.lang.InterruptedException -> Ld java.lang.Throwable -> L1a
            goto L10
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            return r3
        L10:
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r3 = r2.f16716a     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L1a
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r3
        L1a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }
}

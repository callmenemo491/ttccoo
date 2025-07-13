package p179k1;

/* renamed from: k1.p */
/* loaded from: classes.dex */
public abstract class AbstractC3658p<T> extends p179k1.AbstractC3641a0 {
    public AbstractC3658p(p179k1.AbstractC3664v r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: e */
    public abstract void mo7439e(p243o1.InterfaceC4876f r1, T r2);

    /* renamed from: f */
    public final void m8087f(T r2) {
            r1 = this;
            o1.f r0 = r1.m8076a()
            r1.mo7439e(r0, r2)     // Catch: java.lang.Throwable -> L15
            r0.mo11022q0()     // Catch: java.lang.Throwable -> L15
            o1.f r2 = r1.f16050c
            if (r0 != r2) goto L14
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f16048a
            r0 = 0
            r2.set(r0)
        L14:
            return
        L15:
            r2 = move-exception
            r1.m8078d(r0)
            throw r2
    }
}

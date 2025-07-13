package p179k1;

/* renamed from: k1.o */
/* loaded from: classes.dex */
public abstract class AbstractC3657o<T> extends p179k1.AbstractC3641a0 {
    public AbstractC3657o(p179k1.AbstractC3664v r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: e */
    public abstract void mo7440e(p243o1.InterfaceC4876f r1, T r2);

    /* renamed from: f */
    public final int m8086f(T[] r6) {
            r5 = this;
            o1.f r0 = r5.m8076a()
            int r1 = r6.length     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r1) goto L16
            r4 = r6[r2]     // Catch: java.lang.Throwable -> L1a
            r5.mo7440e(r0, r4)     // Catch: java.lang.Throwable -> L1a
            int r4 = r0.mo11023x()     // Catch: java.lang.Throwable -> L1a
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L7
        L16:
            r5.m8078d(r0)
            return r3
        L1a:
            r6 = move-exception
            r5.m8078d(r0)
            throw r6
    }
}

package p432y9;

/* renamed from: y9.o */
/* loaded from: classes.dex */
public class C7148o<T> implements p392wa.InterfaceC6823b<T> {

    /* renamed from: c */
    public static final java.lang.Object f27595c = null;

    /* renamed from: a */
    public volatile java.lang.Object f27596a;

    /* renamed from: b */
    public volatile p392wa.InterfaceC6823b<T> f27597b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p432y9.C7148o.f27595c = r0
            return
    }

    public C7148o(p392wa.InterfaceC6823b<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = p432y9.C7148o.f27595c
            r1.f27596a = r0
            r1.f27597b = r2
            return
    }

    @Override // p392wa.InterfaceC6823b
    public T get() {
            r2 = this;
            java.lang.Object r0 = r2.f27596a
            java.lang.Object r1 = p432y9.C7148o.f27595c
            if (r0 != r1) goto L1b
            monitor-enter(r2)
            java.lang.Object r0 = r2.f27596a     // Catch: java.lang.Throwable -> L18
            if (r0 != r1) goto L16
            wa.b<T> r0 = r2.f27597b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L18
            r2.f27596a = r0     // Catch: java.lang.Throwable -> L18
            r1 = 0
            r2.f27597b = r1     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
        L1b:
            return r0
    }
}

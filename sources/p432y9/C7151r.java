package p432y9;

/* renamed from: y9.r */
/* loaded from: classes.dex */
public class C7151r<T> implements p392wa.InterfaceC6823b<T>, p392wa.InterfaceC6822a<T> {

    /* renamed from: c */
    public static final p392wa.InterfaceC6822a.a<java.lang.Object> f27600c = null;

    /* renamed from: d */
    public static final p392wa.InterfaceC6823b<java.lang.Object> f27601d = null;

    /* renamed from: a */
    public p392wa.InterfaceC6822a.a<T> f27602a;

    /* renamed from: b */
    public volatile p392wa.InterfaceC6823b<T> f27603b;

    static {
            k1.c r0 = p179k1.C3644c.f16096r0
            p432y9.C7151r.f27600c = r0
            y9.h r0 = p432y9.C7141h.f27574c
            p432y9.C7151r.f27601d = r0
            return
    }

    public C7151r(p392wa.InterfaceC6822a.a<T> r1, p392wa.InterfaceC6823b<T> r2) {
            r0 = this;
            r0.<init>()
            r0.f27602a = r1
            r0.f27603b = r2
            return
    }

    /* renamed from: a */
    public void m14265a(p392wa.InterfaceC6822a.a<T> r5) {
            r4 = this;
            wa.b<T> r0 = r4.f27603b
            wa.b<java.lang.Object> r1 = p432y9.C7151r.f27601d
            if (r0 == r1) goto La
            r5.mo25c(r0)
            return
        La:
            r0 = 0
            monitor-enter(r4)
            wa.b<T> r2 = r4.f27603b     // Catch: java.lang.Throwable -> L22
            if (r2 == r1) goto L12
            r0 = r2
            goto L1b
        L12:
            wa.a$a<T> r1 = r4.f27602a     // Catch: java.lang.Throwable -> L22
            f1.g0 r3 = new f1.g0     // Catch: java.lang.Throwable -> L22
            r3.<init>(r1, r5)     // Catch: java.lang.Throwable -> L22
            r4.f27602a = r3     // Catch: java.lang.Throwable -> L22
        L1b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L21
            r5.mo25c(r2)
        L21:
            return
        L22:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
            throw r5
    }

    @Override // p392wa.InterfaceC6823b
    public T get() {
            r1 = this;
            wa.b<T> r0 = r1.f27603b
            java.lang.Object r0 = r0.get()
            return r0
    }
}

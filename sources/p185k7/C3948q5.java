package p185k7;

/* renamed from: k7.q5 */
/* loaded from: classes.dex */
public final class C3948q5 {

    /* renamed from: b */
    public static volatile p185k7.C3948q5 f16844b;

    /* renamed from: c */
    public static volatile p185k7.C3948q5 f16845c;

    /* renamed from: d */
    public static final p185k7.C3948q5 f16846d = null;

    /* renamed from: a */
    public final java.util.Map<p185k7.C3935p5, p185k7.C3759c6<?, ?>> f16847a;

    static {
            k7.q5 r0 = new k7.q5
            r1 = 1
            r0.<init>(r1)
            p185k7.C3948q5.f16846d = r0
            return
    }

    public C3948q5() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f16847a = r0
            return
    }

    public C3948q5(boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.f16847a = r1
            return
    }

    /* renamed from: a */
    public static p185k7.C3948q5 m8909a() {
            k7.q5 r0 = p185k7.C3948q5.f16844b
            if (r0 != 0) goto L14
            java.lang.Class<k7.q5> r1 = p185k7.C3948q5.class
            monitor-enter(r1)
            k7.q5 r0 = p185k7.C3948q5.f16844b     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Lf
            k7.q5 r0 = p185k7.C3948q5.f16846d     // Catch: java.lang.Throwable -> L11
            p185k7.C3948q5.f16844b = r0     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r0
        L14:
            return r0
    }
}

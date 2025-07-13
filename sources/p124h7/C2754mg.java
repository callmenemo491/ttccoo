package p124h7;

/* renamed from: h7.mg */
/* loaded from: classes.dex */
public final class C2754mg {

    /* renamed from: b */
    public static volatile p124h7.C2754mg f11777b;

    /* renamed from: c */
    public static final p124h7.C2754mg f11778c = null;

    /* renamed from: a */
    public final java.util.Map<p124h7.C2736lg, p124h7.C2952xg<?, ?>> f11779a;

    static {
            h7.mg r0 = new h7.mg
            r1 = 1
            r0.<init>(r1)
            p124h7.C2754mg.f11778c = r0
            return
    }

    public C2754mg() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f11779a = r0
            return
    }

    public C2754mg(boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.f11779a = r1
            return
    }

    /* renamed from: a */
    public static p124h7.C2754mg m6988a() {
            h7.mg r0 = p124h7.C2754mg.f11777b
            if (r0 != 0) goto L14
            java.lang.Class<h7.mg> r1 = p124h7.C2754mg.class
            monitor-enter(r1)
            h7.mg r0 = p124h7.C2754mg.f11777b     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Lf
            h7.mg r0 = p124h7.C2754mg.f11778c     // Catch: java.lang.Throwable -> L11
            p124h7.C2754mg.f11777b = r0     // Catch: java.lang.Throwable -> L11
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

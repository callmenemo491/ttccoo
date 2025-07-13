package p352u5;

/* renamed from: u5.z */
/* loaded from: classes.dex */
public final class C6337z {

    /* renamed from: a */
    public final java.util.Map<java.lang.String, java.lang.String> f24787a;

    /* renamed from: b */
    public java.util.Map<java.lang.String, java.lang.String> f24788b;

    public C6337z() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f24787a = r0
            return
    }

    /* renamed from: a */
    public synchronized java.util.Map<java.lang.String, java.lang.String> m12987a() {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f24788b     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L12
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L16
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.f24787a     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch: java.lang.Throwable -> L16
            r2.f24788b = r0     // Catch: java.lang.Throwable -> L16
        L12:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f24788b     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}

package p056da;

/* renamed from: da.j0 */
/* loaded from: classes.dex */
public class C1365j0 {

    /* renamed from: a */
    public final java.util.Map<java.lang.String, java.lang.String> f6919a;

    /* renamed from: b */
    public final int f6920b;

    /* renamed from: c */
    public final int f6921c;

    public C1365j0(int r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f6919a = r0
            r1.f6920b = r2
            r1.f6921c = r3
            return
    }

    /* renamed from: a */
    public synchronized java.util.Map<java.lang.String, java.lang.String> m3880a() {
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.f6919a     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: b */
    public java.lang.String m3881b(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = r3.trim()
            int r0 = r3.length()
            int r1 = r2.f6921c
            if (r0 <= r1) goto L11
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r1)
        L11:
            return r3
    }
}

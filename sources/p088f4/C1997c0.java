package p088f4;

/* renamed from: f4.c0 */
/* loaded from: classes.dex */
public final class C1997c0 {

    /* renamed from: a */
    public static final java.util.HashSet<java.lang.String> f8866a = null;

    /* renamed from: b */
    public static java.lang.String f8867b;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            p088f4.C1997c0.f8866a = r0
            java.lang.String r0 = "goog.exo.core"
            p088f4.C1997c0.f8867b = r0
            return
    }

    /* renamed from: a */
    public static synchronized void m5181a(java.lang.String r4) {
            java.lang.Class<f4.c0> r0 = p088f4.C1997c0.class
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = p088f4.C1997c0.f8866a     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.add(r4)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L32
            java.lang.String r1 = p088f4.C1997c0.f8867b     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L34
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L34
            int r2 = r2 + 2
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L34
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L34
            r3.append(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = ", "
            r3.append(r1)     // Catch: java.lang.Throwable -> L34
            r3.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L34
            p088f4.C1997c0.f8867b = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }
}

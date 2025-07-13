package p185k7;

/* renamed from: k7.g4 */
/* loaded from: classes.dex */
public final class C3813g4 {

    /* renamed from: a */
    public static final p319s.C5934a<java.lang.String, android.net.Uri> f16650a = null;

    static {
            s.a r0 = new s.a
            r0.<init>()
            p185k7.C3813g4.f16650a = r0
            return
    }

    /* renamed from: a */
    public static synchronized android.net.Uri m8551a(java.lang.String r5) {
            java.lang.Class<k7.g4> r5 = p185k7.C3813g4.class
            monitor-enter(r5)
            java.lang.String r0 = "com.google.android.gms.measurement"
            s.a<java.lang.String, android.net.Uri> r1 = p185k7.C3813g4.f16650a     // Catch: java.lang.Throwable -> L33
            r2 = 0
            java.lang.Object r2 = r1.getOrDefault(r0, r2)     // Catch: java.lang.Throwable -> L33
            android.net.Uri r2 = (android.net.Uri) r2     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L31
            java.lang.String r2 = android.net.Uri.encode(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "content://com.google.android.gms.phenotype/"
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L25
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L33
            goto L2a
        L25:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L33
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L33
        L2a:
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L33
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L33
        L31:
            monitor-exit(r5)
            return r2
        L33:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }
}

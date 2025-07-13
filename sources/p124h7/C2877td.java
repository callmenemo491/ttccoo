package p124h7;

/* renamed from: h7.td */
/* loaded from: classes.dex */
public final class C2877td {

    /* renamed from: a */
    public static final java.util.Map<java.lang.String, p124h7.C2859sd> f11926a = null;

    /* renamed from: b */
    public static final java.util.Map<java.lang.String, java.lang.ref.WeakReference<p124h7.C2589dd>> f11927b = null;

    static {
            s.a r0 = new s.a
            r0.<init>()
            p124h7.C2877td.f11926a = r0
            s.a r0 = new s.a
            r0.<init>()
            p124h7.C2877td.f11927b = r0
            return
    }

    /* renamed from: a */
    public static java.lang.String m7173a(java.lang.String r2) {
            java.util.Map<java.lang.String, h7.sd> r0 = p124h7.C2877td.f11926a
            monitor-enter(r0)
            r1 = r0
            s.h r1 = (p319s.C5941h) r1     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L1e
            h7.sd r2 = (p124h7.C2859sd) r2     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L1c
            java.lang.String r2 = "https://"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "www.googleapis.com/identitytoolkit/v3/relyingparty"
            java.lang.String r2 = r2.concat(r0)
            return r2
        L1c:
            r2 = 0
            throw r2
        L1e:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r2
    }
}

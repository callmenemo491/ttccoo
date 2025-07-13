package p400wj;

/* renamed from: wj.d */
/* loaded from: classes.dex */
public class C6891d {

    /* renamed from: a */
    public static final java.lang.ThreadLocal f26794a = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p400wj.C6891d.f26794a = r0
            return
    }

    /* renamed from: a */
    public static boolean m13957a(java.lang.String r1) {
            wj.c r0 = new wj.c     // Catch: java.security.AccessControlException -> L18
            r0.<init>(r1)     // Catch: java.security.AccessControlException -> L18
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.AccessControlException -> L18
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.security.AccessControlException -> L18
            if (r1 == 0) goto L18
            java.lang.String r0 = "true"
            java.lang.String r1 = p400wj.C6892e.m13960c(r1)     // Catch: java.security.AccessControlException -> L18
            boolean r1 = r0.equals(r1)     // Catch: java.security.AccessControlException -> L18
            return r1
        L18:
            r1 = 0
            return r1
    }
}

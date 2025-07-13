package p346u;

/* renamed from: u.a */
/* loaded from: classes.dex */
public class C6256a {
    /* renamed from: a */
    public static java.lang.String m12870a() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = ".("
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* renamed from: b */
    public static java.lang.String m12871b(android.content.Context r1, int r2) {
            r0 = -1
            if (r2 == r0) goto Lc
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = r1.getResourceEntryName(r2)     // Catch: java.lang.Exception -> Lf
            return r1
        Lc:
            java.lang.String r1 = "UNKNOWN"
            return r1
        Lf:
            java.lang.String r1 = "?"
            java.lang.String r1 = android.support.v4.media.C0142a.m254a(r1, r2)
            return r1
    }

    /* renamed from: c */
    public static java.lang.String m12872c(android.view.View r1) {
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Exception -> L11
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L11
            int r1 = r1.getId()     // Catch: java.lang.Exception -> L11
            java.lang.String r1 = r0.getResourceEntryName(r1)     // Catch: java.lang.Exception -> L11
            return r1
        L11:
            java.lang.String r1 = "UNKNOWN"
            return r1
    }

    /* renamed from: d */
    public static java.lang.String m12873d(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2) {
            r0 = -1
            if (r2 != r0) goto L6
            java.lang.String r1 = "UNDEFINED"
            return r1
        L6:
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceEntryName(r2)
            return r1
    }
}

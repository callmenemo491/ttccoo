package p030c0;

/* renamed from: c0.f */
/* loaded from: classes.dex */
public final class C0819f {

    /* renamed from: c0.f$a */
    public static class a {
        /* renamed from: a */
        public static int m2467a(android.app.AppOpsManager r0, java.lang.String r1, int r2, java.lang.String r3) {
                if (r0 != 0) goto L4
                r0 = 1
                return r0
            L4:
                int r0 = r0.checkOpNoThrow(r1, r2, r3)
                return r0
        }

        /* renamed from: b */
        public static java.lang.String m2468b(android.content.Context r0) {
                java.lang.String r0 = r0.getOpPackageName()
                return r0
        }

        /* renamed from: c */
        public static android.app.AppOpsManager m2469c(android.content.Context r1) {
                java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
                return r1
        }
    }

    /* renamed from: a */
    public static int m2466a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L13
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2
            int r2 = r2.noteProxyOpNoThrow(r3, r4)
            return r2
        L13:
            r2 = 1
            return r2
    }
}

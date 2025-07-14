package p046d0;

@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: d0.a */
/* loaded from: classes.dex */
public class C1259a {

    /* renamed from: a */
    public static final java.lang.Object f6733a = null;

    /* renamed from: b */
    public static final java.lang.Object f6734b = null;

    /* renamed from: d0.a$a */
    public static class a {
        /* renamed from: a */
        public static void m3707a(android.content.Context r0, android.content.Intent[] r1, android.os.Bundle r2) {
                r0.startActivities(r1, r2)
                return
        }

        /* renamed from: b */
        public static void m3708b(android.content.Context r0, android.content.Intent r1, android.os.Bundle r2) {
                r0.startActivity(r1, r2)
                return
        }
    }

    /* renamed from: d0.a$b */
    public static class b {
        /* renamed from: a */
        public static java.io.File m3709a(android.content.Context r0) {
                java.io.File r0 = r0.getCodeCacheDir()
                return r0
        }

        /* renamed from: b */
        public static android.graphics.drawable.Drawable m3710b(android.content.Context r0, int r1) {
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
                return r0
        }

        /* renamed from: c */
        public static java.io.File m3711c(android.content.Context r0) {
                java.io.File r0 = r0.getNoBackupFilesDir()
                return r0
        }
    }

    /* renamed from: d0.a$c */
    public static class c {
        /* renamed from: a */
        public static int m3712a(android.content.Context r0, int r1) {
                int r0 = r0.getColor(r1)
                return r0
        }

        /* renamed from: b */
        public static <T> T m3713b(android.content.Context r0, java.lang.Class<T> r1) {
                java.lang.Object r0 = r0.getSystemService(r1)
                return r0
        }

        /* renamed from: c */
        public static java.lang.String m3714c(android.content.Context r0, java.lang.Class<?> r1) {
                java.lang.String r0 = r0.getSystemServiceName(r1)
                return r0
        }
    }

    /* renamed from: d0.a$d */
    public static class d {
        /* renamed from: a */
        public static android.content.Context m3715a(android.content.Context r0) {
                android.content.Context r0 = r0.createDeviceProtectedStorageContext()
                return r0
        }

        /* renamed from: b */
        public static java.io.File m3716b(android.content.Context r0) {
                java.io.File r0 = r0.getDataDir()
                return r0
        }

        /* renamed from: c */
        public static boolean m3717c(android.content.Context r0) {
                boolean r0 = r0.isDeviceProtectedStorage()
                return r0
        }
    }

    /* renamed from: d0.a$e */
    public static class e {
        /* renamed from: a */
        public static android.content.ComponentName m3718a(android.content.Context r0, android.content.Intent r1) {
                android.content.ComponentName r0 = r0.startForegroundService(r1)
                return r0
        }
    }

    /* renamed from: d0.a$f */
    public static class f {
        /* renamed from: a */
        public static java.util.concurrent.Executor m3719a(android.content.Context r0) {
                java.util.concurrent.Executor r0 = r0.getMainExecutor()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p046d0.C1259a.f6733a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p046d0.C1259a.f6734b = r0
            return
    }

    /* renamed from: a */
    public static int m3705a(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "permission must be non-null"
            java.util.Objects.requireNonNull(r3, r0)
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            int r2 = r2.checkPermission(r3, r0, r1)
            return r2
    }

    /* renamed from: b */
    public static int m3706b(android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r2 = p046d0.C1259a.c.m3712a(r2, r3)
            return r2
        Lb:
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r3)
            return r2
    }
}

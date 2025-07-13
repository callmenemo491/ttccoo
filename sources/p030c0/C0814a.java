package p030c0;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public class C0814a extends p046d0.C1259a {

    /* renamed from: c */
    public static final /* synthetic */ int f4421c = 0;

    /* renamed from: c0.a$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ java.lang.String[] f4422Y;

        /* renamed from: Z */
        public final /* synthetic */ android.app.Activity f4423Z;

        /* renamed from: a0 */
        public final /* synthetic */ int f4424a0;

        public a(java.lang.String[] r1, android.app.Activity r2, int r3) {
                r0 = this;
                r0.f4422Y = r1
                r0.f4423Z = r2
                r0.f4424a0 = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String[] r0 = r6.f4422Y
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.app.Activity r1 = r6.f4423Z
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.app.Activity r2 = r6.f4423Z
                java.lang.String r2 = r2.getPackageName()
                java.lang.String[] r3 = r6.f4422Y
                int r3 = r3.length
                r4 = 0
            L15:
                if (r4 >= r3) goto L24
                java.lang.String[] r5 = r6.f4422Y
                r5 = r5[r4]
                int r5 = r1.checkPermission(r5, r2)
                r0[r4] = r5
                int r4 = r4 + 1
                goto L15
            L24:
                android.app.Activity r1 = r6.f4423Z
                c0.a$b r1 = (p030c0.C0814a.b) r1
                int r2 = r6.f4424a0
                java.lang.String[] r3 = r6.f4422Y
                r1.onRequestPermissionsResult(r2, r3, r0)
                return
        }
    }

    /* renamed from: c0.a$b */
    public interface b {
        void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3);
    }

    /* renamed from: c0.a$c */
    public interface c {
        /* renamed from: c */
        void mo1353c(int r1);
    }

    /* renamed from: c */
    public static void m2463c(android.app.Activity r3, java.lang.String[] r4, int r5) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L25
            r2 = r4[r1]
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lf
            int r1 = r1 + 1
            goto L2
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Permission request for permissions "
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.String r4 = java.util.Arrays.toString(r4)
            java.lang.String r0 = " must not contain null or empty values"
            java.lang.String r4 = p346u.C6269n.m12888a(r5, r4, r0)
            r3.<init>(r4)
            throw r3
        L25:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L39
            boolean r0 = r3 instanceof p030c0.C0814a.c
            if (r0 == 0) goto L35
            r0 = r3
            c0.a$c r0 = (p030c0.C0814a.c) r0
            r0.mo1353c(r5)
        L35:
            r3.requestPermissions(r4, r5)
            goto L4e
        L39:
            boolean r0 = r3 instanceof p030c0.C0814a.b
            if (r0 == 0) goto L4e
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            c0.a$a r1 = new c0.a$a
            r1.<init>(r4, r3, r5)
            r0.post(r1)
        L4e:
            return
    }
}

package p244o2;

/* renamed from: o2.j */
/* loaded from: classes.dex */
public final class C4886j {

    /* renamed from: a */
    public final int f19372a;

    /* renamed from: b */
    public final int f19373b;

    /* renamed from: c */
    public final android.content.Context f19374c;

    /* renamed from: d */
    public final int f19375d;

    /* renamed from: o2.j$a */
    public static final class a {

        /* renamed from: e */
        public static final int f19376e = 0;

        /* renamed from: a */
        public final android.content.Context f19377a;

        /* renamed from: b */
        public android.app.ActivityManager f19378b;

        /* renamed from: c */
        public p244o2.C4886j.c f19379c;

        /* renamed from: d */
        public float f19380d;

        static {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 >= r1) goto L8
                r0 = 4
                goto L9
            L8:
                r0 = 1
            L9:
                p244o2.C4886j.a.f19376e = r0
                return
        }

        public a(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                int r0 = p244o2.C4886j.a.f19376e
                float r0 = (float) r0
                r1.f19380d = r0
                r1.f19377a = r2
                java.lang.String r0 = "activity"
                java.lang.Object r0 = r2.getSystemService(r0)
                android.app.ActivityManager r0 = (android.app.ActivityManager) r0
                r1.f19378b = r0
                o2.j$b r0 = new o2.j$b
                android.content.res.Resources r2 = r2.getResources()
                android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
                r0.<init>(r2)
                r1.f19379c = r0
                int r2 = android.os.Build.VERSION.SDK_INT
                r0 = 26
                if (r2 < r0) goto L34
                android.app.ActivityManager r2 = r1.f19378b
                boolean r2 = r2.isLowRamDevice()
                if (r2 == 0) goto L34
                r2 = 0
                r1.f19380d = r2
            L34:
                return
        }
    }

    /* renamed from: o2.j$b */
    public static final class b implements p244o2.C4886j.c {

        /* renamed from: a */
        public final android.util.DisplayMetrics f19381a;

        public b(android.util.DisplayMetrics r1) {
                r0 = this;
                r0.<init>()
                r0.f19381a = r1
                return
        }
    }

    /* renamed from: o2.j$c */
    public interface c {
    }

    public C4886j(p244o2.C4886j.a r8) {
            r7 = this;
            r7.<init>()
            android.content.Context r0 = r8.f19377a
            r7.f19374c = r0
            android.app.ActivityManager r0 = r8.f19378b
            boolean r0 = r0.isLowRamDevice()
            if (r0 == 0) goto L12
            r0 = 2097152(0x200000, float:2.938736E-39)
            goto L14
        L12:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L14:
            r7.f19375d = r0
            android.app.ActivityManager r1 = r8.f19378b
            r2 = 1053609165(0x3ecccccd, float:0.4)
            int r3 = r1.getMemoryClass()
            int r3 = r3 * 1024
            int r3 = r3 * 1024
            boolean r1 = r1.isLowRamDevice()
            float r3 = (float) r3
            if (r1 == 0) goto L2d
            r2 = 1051260355(0x3ea8f5c3, float:0.33)
        L2d:
            float r3 = r3 * r2
            int r1 = java.lang.Math.round(r3)
            o2.j$c r2 = r8.f19379c
            o2.j$b r2 = (p244o2.C4886j.b) r2
            android.util.DisplayMetrics r2 = r2.f19381a
            int r3 = r2.widthPixels
            int r2 = r2.heightPixels
            int r3 = r3 * r2
            int r3 = r3 * 4
            float r2 = (float) r3
            float r3 = r8.f19380d
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r5 = r1 - r0
            int r6 = r2 + r3
            if (r6 > r5) goto L5d
            r7.f19373b = r2
            r7.f19372a = r3
            goto L74
        L5d:
            float r2 = (float) r5
            float r3 = r8.f19380d
            float r3 = r3 + r4
            float r2 = r2 / r3
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
            r7.f19373b = r3
            float r3 = r8.f19380d
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            r7.f19372a = r2
        L74:
            r2 = 3
            java.lang.String r3 = "MemorySizeCalculator"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto Le2
            java.lang.String r2 = "Calculation complete, Calculated memory cache size: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            int r4 = r7.f19373b
            java.lang.String r4 = r7.m11028a(r4)
            r2.append(r4)
            java.lang.String r4 = ", pool size: "
            r2.append(r4)
            int r4 = r7.f19372a
            java.lang.String r4 = r7.m11028a(r4)
            r2.append(r4)
            java.lang.String r4 = ", byte array size: "
            r2.append(r4)
            java.lang.String r0 = r7.m11028a(r0)
            r2.append(r0)
            java.lang.String r0 = ", memory class limited? "
            r2.append(r0)
            if (r6 <= r1) goto Laf
            r0 = 1
            goto Lb0
        Laf:
            r0 = 0
        Lb0:
            r2.append(r0)
            java.lang.String r0 = ", max size: "
            r2.append(r0)
            java.lang.String r0 = r7.m11028a(r1)
            r2.append(r0)
            java.lang.String r0 = ", memoryClass: "
            r2.append(r0)
            android.app.ActivityManager r0 = r8.f19378b
            int r0 = r0.getMemoryClass()
            r2.append(r0)
            java.lang.String r0 = ", isLowMemoryDevice: "
            r2.append(r0)
            android.app.ActivityManager r8 = r8.f19378b
            boolean r8 = r8.isLowRamDevice()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.d(r3, r8)
        Le2:
            return
    }

    /* renamed from: a */
    public final java.lang.String m11028a(int r4) {
            r3 = this;
            android.content.Context r0 = r3.f19374c
            long r1 = (long) r4
            java.lang.String r4 = android.text.format.Formatter.formatFileSize(r0, r1)
            return r4
    }
}

package p178k0;

/* renamed from: k0.j */
/* loaded from: classes.dex */
public class C3634j {

    /* renamed from: a */
    public static final p319s.C5939f<java.lang.String, android.graphics.Typeface> f16026a = null;

    /* renamed from: b */
    public static final java.util.concurrent.ExecutorService f16027b = null;

    /* renamed from: c */
    public static final java.lang.Object f16028c = null;

    /* renamed from: d */
    public static final p319s.C5941h<java.lang.String, java.util.ArrayList<p212m0.InterfaceC4311a<p178k0.C3634j.a>>> f16029d = null;

    /* renamed from: k0.j$a */
    public static final class a {

        /* renamed from: a */
        public final android.graphics.Typeface f16030a;

        /* renamed from: b */
        public final int f16031b;

        public a(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f16030a = r0
                r1.f16031b = r2
                return
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        public a(android.graphics.Typeface r1) {
                r0 = this;
                r0.<init>()
                r0.f16030a = r1
                r1 = 0
                r0.f16031b = r1
                return
        }
    }

    static {
            s.f r0 = new s.f
            r1 = 16
            r0.<init>(r1)
            p178k0.C3634j.f16026a = r0
            k0.n r9 = new k0.n
            java.lang.String r0 = "fonts-androidx"
            r1 = 10
            r9.<init>(r0, r1)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r1 = 10000(0x2710, float:1.4013E-41)
            long r5 = (long) r1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingDeque r8 = new java.util.concurrent.LinkedBlockingDeque
            r8.<init>()
            r3 = 0
            r4 = 1
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
            p178k0.C3634j.f16027b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p178k0.C3634j.f16028c = r0
            s.h r0 = new s.h
            r0.<init>()
            p178k0.C3634j.f16029d = r0
            return
    }

    /* renamed from: a */
    public static p178k0.C3634j.a m8075a(java.lang.String r7, android.content.Context r8, p178k0.C3629e r9, int r10) {
            s.f<java.lang.String, android.graphics.Typeface> r0 = p178k0.C3634j.f16026a
            java.lang.Object r0 = r0.m12329b(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L10
            k0.j$a r7 = new k0.j$a
            r7.<init>(r0)
            return r7
        L10:
            r0 = 0
            k0.k r9 = p178k0.C3628d.m8072a(r8, r9, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            int r1 = r9.f16032a
            r2 = -3
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1e
            goto L35
        L1e:
            r1 = -2
            goto L3e
        L20:
            k0.l[] r1 = r9.f16033b
            r4 = 0
            if (r1 == 0) goto L3d
            int r5 = r1.length
            if (r5 != 0) goto L29
            goto L3d
        L29:
            int r3 = r1.length
            r5 = 0
        L2b:
            if (r5 >= r3) goto L3c
            r6 = r1[r5]
            int r6 = r6.f16038e
            if (r6 == 0) goto L39
            if (r6 >= 0) goto L37
        L35:
            r1 = -3
            goto L3e
        L37:
            r1 = r6
            goto L3e
        L39:
            int r5 = r5 + 1
            goto L2b
        L3c:
            r3 = 0
        L3d:
            r1 = r3
        L3e:
            if (r1 == 0) goto L46
            k0.j$a r7 = new k0.j$a
            r7.<init>(r1)
            return r7
        L46:
            k0.l[] r9 = r9.f16033b
            f0.k r1 = p084f0.C1942e.f8487a
            android.graphics.Typeface r8 = r1.mo4843b(r8, r0, r9, r10)
            if (r8 == 0) goto L5b
            s.f<java.lang.String, android.graphics.Typeface> r9 = p178k0.C3634j.f16026a
            r9.m12330c(r7, r8)
            k0.j$a r7 = new k0.j$a
            r7.<init>(r8)
            return r7
        L5b:
            k0.j$a r7 = new k0.j$a
            r7.<init>(r2)
            return r7
        L61:
            k0.j$a r7 = new k0.j$a
            r8 = -1
            r7.<init>(r8)
            return r7
    }
}

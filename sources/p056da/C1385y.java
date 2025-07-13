package p056da;

/* renamed from: da.y */
/* loaded from: classes.dex */
public class C1385y {

    /* renamed from: a */
    public final android.content.Context f6981a;

    /* renamed from: b */
    public final p056da.C1353d0 f6982b;

    /* renamed from: c */
    public final long f6983c;

    /* renamed from: d */
    public androidx.appcompat.widget.C0311x f6984d;

    /* renamed from: e */
    public androidx.appcompat.widget.C0311x f6985e;

    /* renamed from: f */
    public p056da.C1378r f6986f;

    /* renamed from: g */
    public final p056da.C1361h0 f6987g;

    /* renamed from: h */
    public final ca.InterfaceC0939b f6988h;

    /* renamed from: i */
    public final ba.InterfaceC0727a f6989i;

    /* renamed from: j */
    public final java.util.concurrent.ExecutorService f6990j;

    /* renamed from: k */
    public final p056da.C1356f f6991k;

    /* renamed from: l */
    public final p011aa.InterfaceC0045a f6992l;

    /* renamed from: da.y$a */
    public class a implements java.util.concurrent.Callable<java.lang.Boolean> {

        /* renamed from: a */
        public final /* synthetic */ p056da.C1385y f6993a;

        public a(p056da.C1385y r1) {
                r0 = this;
                r0.f6993a = r1
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public java.lang.Boolean call() {
                r4 = this;
                java.lang.String r0 = "FirebaseCrashlytics"
                da.y r1 = r4.f6993a     // Catch: java.lang.Exception -> L1b
                androidx.appcompat.widget.x r1 = r1.f6984d     // Catch: java.lang.Exception -> L1b
                java.io.File r1 = r1.m822m()     // Catch: java.lang.Exception -> L1b
                boolean r1 = r1.delete()     // Catch: java.lang.Exception -> L1b
                if (r1 != 0) goto L16
                java.lang.String r2 = "Initialization marker file was not properly removed."
                r3 = 0
                android.util.Log.w(r0, r2, r3)     // Catch: java.lang.Exception -> L1b
            L16:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L1b
                goto L23
            L1b:
                r1 = move-exception
                java.lang.String r2 = "Problem encountered deleting Crashlytics initialization marker."
                android.util.Log.e(r0, r2, r1)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
            L23:
                return r0
        }
    }

    /* renamed from: da.y$b */
    public static final class b implements p075ea.C1808b.b {

        /* renamed from: a */
        public final p185k7.C3827h4 f6994a;

        public b(p185k7.C3827h4 r1) {
                r0 = this;
                r0.<init>()
                r0.f6994a = r1
                return
        }
    }

    public C1385y(p251o9.C5180d r1, p056da.C1361h0 r2, p011aa.InterfaceC0045a r3, p056da.C1353d0 r4, ca.InterfaceC0939b r5, ba.InterfaceC0727a r6, java.util.concurrent.ExecutorService r7) {
            r0 = this;
            r0.<init>()
            r0.f6982b = r4
            r1.m11497a()
            android.content.Context r1 = r1.f20312a
            r0.f6981a = r1
            r0.f6987g = r2
            r0.f6992l = r3
            r0.f6988h = r5
            r0.f6989i = r6
            r0.f6990j = r7
            da.f r1 = new da.f
            r1.<init>(r7)
            r0.f6991k = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f6983c = r1
            return
    }

    /* renamed from: a */
    public static p327s7.AbstractC5985i m3903a(p056da.C1385y r4, p188ka.InterfaceC4076c r5) {
            da.f r0 = r4.f6991k
            r0.m3871a()
            androidx.appcompat.widget.x r0 = r4.f6984d
            r0.m820k()
            r0 = 2
            java.lang.String r1 = "FirebaseCrashlytics"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            r2 = 0
            if (r0 == 0) goto L19
            java.lang.String r0 = "Initialization marker file was created."
            android.util.Log.v(r1, r0, r2)
        L19:
            ca.b r0 = r4.f6988h     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            da.v r3 = new da.v     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            r0.mo2663f(r3)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            ka.b r5 = (p188ka.C4075b) r5     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            la.c r0 = r5.m9171b()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            la.b r0 = r0.mo9543b()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            boolean r0 = r0.f17392a     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r0 != 0) goto L47
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r1, r5)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r0 = "Collection of crash reports disabled in Crashlytics settings."
            if (r5 == 0) goto L3d
            android.util.Log.d(r1, r0, r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
        L3d:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            s7.i r5 = p327s7.C5988l.m12463d(r5)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            goto L71
        L47:
            da.r r0 = r4.f6986f     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            boolean r0 = r0.m3898e(r5)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r0 != 0) goto L54
            java.lang.String r0 = "Previous sessions could not be finalized."
            android.util.Log.w(r1, r0, r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
        L54:
            da.r r0 = r4.f6986f     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.util.concurrent.atomic.AtomicReference<s7.j<la.a>> r5 = r5.f17002i     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            s7.j r5 = (p327s7.C5986j) r5     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            s7.q<TResult> r5 = r5.f23075a     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            s7.i r5 = r0.m3902i(r5)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            goto L71
        L65:
            r5 = move-exception
            goto L75
        L67:
            r5 = move-exception
            java.lang.String r0 = "Crashlytics encountered a problem during asynchronous initialization."
            android.util.Log.e(r1, r0, r5)     // Catch: java.lang.Throwable -> L65
            s7.i r5 = p327s7.C5988l.m12463d(r5)     // Catch: java.lang.Throwable -> L65
        L71:
            r4.m3904b()
            return r5
        L75:
            r4.m3904b()
            throw r5
    }

    /* renamed from: b */
    public void m3904b() {
            r2 = this;
            da.f r0 = r2.f6991k
            da.y$a r1 = new da.y$a
            r1.<init>(r2)
            r0.m3872b(r1)
            return
    }
}

package p084f0;

/* renamed from: f0.e */
/* loaded from: classes.dex */
public class C1942e {

    /* renamed from: a */
    public static final p084f0.C1948k f8487a = null;

    /* renamed from: b */
    public static final p319s.C5939f<java.lang.String, android.graphics.Typeface> f8488b = null;

    /* renamed from: f0.e$a */
    public static class a extends p178k0.C3637m {

        /* renamed from: a */
        public p065e0.C1503h.c f8489a;

        public a(p065e0.C1503h.c r1) {
                r0 = this;
                r0.<init>()
                r0.f8489a = r1
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lc
            f0.j r0 = new f0.j
            r0.<init>()
            goto L41
        Lc:
            r1 = 28
            if (r0 < r1) goto L16
            f0.i r0 = new f0.i
            r0.<init>()
            goto L41
        L16:
            r1 = 26
            if (r0 < r1) goto L20
            f0.h r0 = new f0.h
            r0.<init>()
            goto L41
        L20:
            r1 = 24
            if (r0 < r1) goto L3c
            java.lang.reflect.Method r0 = p084f0.C1944g.f8497d
            if (r0 != 0) goto L2f
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        L2f:
            if (r0 == 0) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 == 0) goto L3c
            f0.g r0 = new f0.g
            r0.<init>()
            goto L41
        L3c:
            f0.f r0 = new f0.f
            r0.<init>()
        L41:
            p084f0.C1942e.f8487a = r0
            s.f r0 = new s.f
            r1 = 16
            r0.<init>(r1)
            p084f0.C1942e.f8488b = r0
            return
    }

    /* renamed from: a */
    public static android.graphics.Typeface m4837a(android.content.Context r6, p065e0.C1501f.a r7, android.content.res.Resources r8, int r9, int r10, p065e0.C1503h.c r11, android.os.Handler r12, boolean r13) {
            boolean r0 = r7 instanceof p065e0.C1501f.d
            r1 = -3
            if (r0 == 0) goto L145
            e0.f$d r7 = (p065e0.C1501f.d) r7
            java.lang.String r0 = r7.f7311d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L27
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L14
            goto L27
        L14:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L27
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L27
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 == 0) goto L30
            if (r11 == 0) goto L2f
            r11.m4086b(r0, r12)
        L2f:
            return r0
        L30:
            if (r13 == 0) goto L37
            int r0 = r7.f7310c
            if (r0 != 0) goto L3a
            goto L39
        L37:
            if (r11 != 0) goto L3a
        L39:
            r3 = 1
        L3a:
            r0 = -1
            if (r13 == 0) goto L40
            int r13 = r7.f7309b
            goto L41
        L40:
            r13 = -1
        L41:
            android.os.Handler r12 = p065e0.C1503h.c.m4084c(r12)
            f0.e$a r4 = new f0.e$a
            r4.<init>(r11)
            k0.e r7 = r7.f7308a
            k0.c r11 = new k0.c
            r11.<init>(r4, r12)
            if (r3 == 0) goto Lc7
            s.f<java.lang.String, android.graphics.Typeface> r3 = p178k0.C3634j.f16026a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r7.f16015e
            r3.append(r5)
            java.lang.String r5 = "-"
            r3.append(r5)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            s.f<java.lang.String, android.graphics.Typeface> r5 = p178k0.C3634j.f16026a
            java.lang.Object r5 = r5.m12329b(r3)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            if (r5 == 0) goto L80
            k0.a r6 = new k0.a
            r6.<init>(r11, r4, r5)
            r12.post(r6)
            r2 = r5
            goto L158
        L80:
            if (r13 != r0) goto L8d
            k0.j$a r6 = p178k0.C3634j.m8075a(r3, r6, r7, r10)
            r11.m8071a(r6)
            android.graphics.Typeface r2 = r6.f16030a
            goto L158
        L8d:
            k0.f r12 = new k0.f
            r12.<init>(r3, r6, r7, r10)
            java.util.concurrent.ExecutorService r6 = p178k0.C3634j.f16027b     // Catch: java.lang.InterruptedException -> Lb9
            java.util.concurrent.Future r6 = r6.submit(r12)     // Catch: java.lang.InterruptedException -> Lb9
            long r12 = (long) r13
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> La8 java.lang.InterruptedException -> Lb0 java.util.concurrent.ExecutionException -> Lb2
            java.lang.Object r6 = r6.get(r12, r7)     // Catch: java.util.concurrent.TimeoutException -> La8 java.lang.InterruptedException -> Lb0 java.util.concurrent.ExecutionException -> Lb2
            k0.j$a r6 = (p178k0.C3634j.a) r6     // Catch: java.lang.InterruptedException -> Lb9
            r11.m8071a(r6)     // Catch: java.lang.InterruptedException -> Lb9
            android.graphics.Typeface r2 = r6.f16030a     // Catch: java.lang.InterruptedException -> Lb9
            goto L158
        La8:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> Lb9
            java.lang.String r7 = "timeout"
            r6.<init>(r7)     // Catch: java.lang.InterruptedException -> Lb9
            throw r6     // Catch: java.lang.InterruptedException -> Lb9
        Lb0:
            r6 = move-exception
            throw r6     // Catch: java.lang.InterruptedException -> Lb9
        Lb2:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> Lb9
            r7.<init>(r6)     // Catch: java.lang.InterruptedException -> Lb9
            throw r7     // Catch: java.lang.InterruptedException -> Lb9
        Lb9:
            k0.m r6 = r11.f16008a
            android.os.Handler r7 = r11.f16009b
            k0.b r12 = new k0.b
            r12.<init>(r11, r6, r1)
            r7.post(r12)
            goto L158
        Lc7:
            s.f<java.lang.String, android.graphics.Typeface> r13 = p178k0.C3634j.f16026a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r7.f16015e
            r13.append(r0)
            java.lang.String r0 = "-"
            r13.append(r0)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            s.f<java.lang.String, android.graphics.Typeface> r0 = p178k0.C3634j.f16026a
            java.lang.Object r0 = r0.m12329b(r13)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto Lf3
            k0.a r6 = new k0.a
            r6.<init>(r11, r4, r0)
            r12.post(r6)
            r2 = r0
            goto L158
        Lf3:
            k0.g r12 = new k0.g
            r12.<init>(r11)
            java.lang.Object r0 = p178k0.C3634j.f16028c
            monitor-enter(r0)
            s.h<java.lang.String, java.util.ArrayList<m0.a<k0.j$a>>> r11 = p178k0.C3634j.f16029d     // Catch: java.lang.Throwable -> L142
            java.lang.Object r1 = r11.getOrDefault(r13, r2)     // Catch: java.lang.Throwable -> L142
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L142
            if (r1 == 0) goto L10a
            r1.add(r12)     // Catch: java.lang.Throwable -> L142
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L142
            goto L158
        L10a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L142
            r1.<init>()     // Catch: java.lang.Throwable -> L142
            r1.add(r12)     // Catch: java.lang.Throwable -> L142
            r11.put(r13, r1)     // Catch: java.lang.Throwable -> L142
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L142
            k0.h r11 = new k0.h
            r11.<init>(r13, r6, r7, r10)
            java.util.concurrent.ExecutorService r6 = p178k0.C3634j.f16027b
            k0.i r7 = new k0.i
            r7.<init>(r13)
            android.os.Looper r12 = android.os.Looper.myLooper()
            if (r12 != 0) goto L132
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            goto L137
        L132:
            android.os.Handler r12 = new android.os.Handler
            r12.<init>()
        L137:
            k0.o r13 = new k0.o
            r13.<init>(r12, r11, r7)
            java.util.concurrent.ThreadPoolExecutor r6 = (java.util.concurrent.ThreadPoolExecutor) r6
            r6.execute(r13)
            goto L158
        L142:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L142
            throw r6
        L145:
            f0.k r13 = p084f0.C1942e.f8487a
            e0.f$b r7 = (p065e0.C1501f.b) r7
            android.graphics.Typeface r2 = r13.mo4842a(r6, r7, r8, r10)
            if (r11 == 0) goto L158
            if (r2 == 0) goto L155
            r11.m4086b(r2, r12)
            goto L158
        L155:
            r11.m4085a(r1, r12)
        L158:
            if (r2 == 0) goto L163
            s.f<java.lang.String, android.graphics.Typeface> r6 = p084f0.C1942e.f8488b
            java.lang.String r7 = m4839c(r8, r9, r10)
            r6.m12330c(r7, r2)
        L163:
            return r2
    }

    /* renamed from: b */
    public static android.graphics.Typeface m4838b(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10) {
            f0.k r0 = p084f0.C1942e.f8487a
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            android.graphics.Typeface r6 = r0.mo4847d(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L16
            java.lang.String r7 = m4839c(r7, r8, r10)
            s.f<java.lang.String, android.graphics.Typeface> r8 = p084f0.C1942e.f8488b
            r8.m12330c(r7, r6)
        L16:
            return r6
    }

    /* renamed from: c */
    public static java.lang.String m4839c(android.content.res.Resources r1, int r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getResourcePackageName(r2)
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }
}

package p056da;

/* renamed from: da.r */
/* loaded from: classes.dex */
public class C1378r {

    /* renamed from: r */
    public static final /* synthetic */ int f6948r = 0;

    /* renamed from: a */
    public final android.content.Context f6949a;

    /* renamed from: b */
    public final p056da.C1353d0 f6950b;

    /* renamed from: c */
    public final androidx.appcompat.widget.C0311x f6951c;

    /* renamed from: d */
    public final p056da.C1356f f6952d;

    /* renamed from: e */
    public final p056da.C1361h0 f6953e;

    /* renamed from: f */
    public final p185k7.C3827h4 f6954f;

    /* renamed from: g */
    public final p056da.C1346a f6955g;

    /* renamed from: h */
    public final p075ea.C1808b.b f6956h;

    /* renamed from: i */
    public final p075ea.C1808b f6957i;

    /* renamed from: j */
    public final p011aa.InterfaceC0045a f6958j;

    /* renamed from: k */
    public final java.lang.String f6959k;

    /* renamed from: l */
    public final ba.InterfaceC0727a f6960l;

    /* renamed from: m */
    public final p056da.C1369l0 f6961m;

    /* renamed from: n */
    public p056da.C1351c0 f6962n;

    /* renamed from: o */
    public final p327s7.C5986j<java.lang.Boolean> f6963o;

    /* renamed from: p */
    public final p327s7.C5986j<java.lang.Boolean> f6964p;

    /* renamed from: q */
    public final p327s7.C5986j<java.lang.Void> f6965q;

    /* renamed from: da.r$a */
    public class a implements p327s7.InterfaceC5984h<java.lang.Boolean, java.lang.Void> {

        /* renamed from: Y */
        public final /* synthetic */ p327s7.AbstractC5985i f6966Y;

        /* renamed from: Z */
        public final /* synthetic */ p056da.C1378r f6967Z;

        public a(p056da.C1378r r1, p327s7.AbstractC5985i r2) {
                r0 = this;
                r0.f6967Z = r1
                r0.f6966Y = r2
                r0.<init>()
                return
        }

        @Override // p327s7.InterfaceC5984h
        /* renamed from: k */
        public p327s7.AbstractC5985i<java.lang.Void> mo3892k(java.lang.Boolean r3) {
                r2 = this;
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                da.r r0 = r2.f6967Z
                da.f r0 = r0.f6952d
                da.q r1 = new da.q
                r1.<init>(r2, r3)
                s7.i r3 = r0.m3873c(r1)
                return r3
        }
    }

    public C1378r(android.content.Context r2, p056da.C1356f r3, p056da.C1361h0 r4, p056da.C1353d0 r5, p185k7.C3827h4 r6, androidx.appcompat.widget.C0311x r7, p056da.C1346a r8, androidx.fragment.app.C0392l0 r9, p075ea.C1808b r10, p075ea.C1808b.b r11, p056da.C1369l0 r12, p011aa.InterfaceC0045a r13, ba.InterfaceC0727a r14) {
            r1 = this;
            r1.<init>()
            s7.j r9 = new s7.j
            r9.<init>()
            r1.f6963o = r9
            s7.j r9 = new s7.j
            r9.<init>()
            r1.f6964p = r9
            s7.j r9 = new s7.j
            r9.<init>()
            r1.f6965q = r9
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r9.<init>(r0)
            r1.f6949a = r2
            r1.f6952d = r3
            r1.f6953e = r4
            r1.f6950b = r5
            r1.f6954f = r6
            r1.f6951c = r7
            r1.f6955g = r8
            r1.f6957i = r10
            r1.f6956h = r11
            r1.f6958j = r13
            na.b r2 = r8.f6868g
            na.a r2 = (na.C4720a) r2
            java.lang.String r2 = r2.m10777a()
            r1.f6959k = r2
            r1.f6960l = r14
            r1.f6961m = r12
            return
    }

    /* renamed from: a */
    public static void m3894a(p056da.C1378r r35) {
            r0 = r35
            java.util.Objects.requireNonNull(r35)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            da.d r3 = new da.d
            da.h0 r4 = r0.f6953e
            r3.<init>(r4)
            java.lang.String r3 = p056da.C1352d.f6883b
            java.lang.String r4 = "Opening a new session with ID "
            java.lang.String r4 = p064e.C1493g.m4049a(r4, r3)
            java.lang.String r11 = "FirebaseCrashlytics"
            r5 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            boolean r5 = android.util.Log.isLoggable(r11, r5)
            r6 = 0
            if (r5 == 0) goto L2c
            android.util.Log.d(r11, r4, r6)
        L2c:
            java.util.Locale r4 = java.util.Locale.US
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r13 = "18.2.3"
            r6 = 0
            r5[r6] = r13
            java.lang.String r6 = "Crashlytics Android SDK/%s"
            java.lang.String r7 = java.lang.String.format(r4, r6, r5)
            da.h0 r5 = r0.f6953e
            da.a r6 = r0.f6955g
            java.lang.String r8 = r0.f6959k
            java.lang.String r15 = r5.f6914c
            java.lang.String r9 = r6.f6866e
            java.lang.String r10 = r6.f6867f
            java.lang.String r18 = r5.m3877c()
            java.lang.String r5 = r6.f6864c
            r21 = 4
            if (r5 == 0) goto L54
            r5 = 4
            goto L55
        L54:
            r5 = 1
        L55:
            int r19 = p365v.C6480g.m13151d(r5)
            fa.x r5 = new fa.x
            r14 = r5
            r16 = r9
            r17 = r10
            r20 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20)
            android.content.Context r6 = r0.f6949a
            java.lang.String r15 = android.os.Build.VERSION.RELEASE
            java.lang.String r14 = android.os.Build.VERSION.CODENAME
            boolean r6 = p056da.C1354e.m3868l(r6)
            fa.z r8 = new fa.z
            r8.<init>(r15, r14, r6)
            android.content.Context r6 = r0.f6949a
            android.os.StatFs r9 = new android.os.StatFs
            java.io.File r10 = android.os.Environment.getDataDirectory()
            java.lang.String r10 = r10.getPath()
            r9.<init>(r10)
            int r10 = r9.getBlockCount()
            r17 = r14
            r16 = r15
            long r14 = (long) r10
            int r9 = r9.getBlockSize()
            long r9 = (long) r9
            long r28 = r14 * r9
            da.e$a r9 = p056da.C1354e.a.f6893Y
            java.lang.String r15 = android.os.Build.CPU_ABI
            boolean r10 = android.text.TextUtils.isEmpty(r15)
            if (r10 == 0) goto Lab
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r11, r10)
            if (r10 == 0) goto Lbd
            java.lang.String r10 = "Architecture#getValue()::Build.CPU_ABI returned null or empty"
            r14 = 0
            android.util.Log.v(r11, r10, r14)
            goto Lbd
        Lab:
            java.lang.String r10 = r15.toLowerCase(r4)
            java.util.Map<java.lang.String, da.e$a> r14 = p056da.C1354e.a.f6894Z
            java.util.HashMap r14 = (java.util.HashMap) r14
            java.lang.Object r10 = r14.get(r10)
            da.e$a r10 = (p056da.C1354e.a) r10
            if (r10 != 0) goto Lbc
            goto Lbd
        Lbc:
            r9 = r10
        Lbd:
            int r23 = r9.ordinal()
            java.lang.String r14 = android.os.Build.MODEL
            java.lang.Runtime r9 = java.lang.Runtime.getRuntime()
            int r25 = r9.availableProcessors()
            long r26 = p056da.C1354e.m3865i()
            boolean r30 = p056da.C1354e.m3867k(r6)
            int r31 = p056da.C1354e.m3861e(r6)
            java.lang.String r10 = android.os.Build.MANUFACTURER
            java.lang.String r9 = android.os.Build.PRODUCT
            fa.y r6 = new fa.y
            r22 = r6
            r24 = r14
            r32 = r10
            r33 = r9
            r22.<init>(r23, r24, r25, r26, r28, r30, r31, r32, r33)
            r18 = r9
            aa.a r9 = r0.f6958j
            r19 = r10
            fa.w r10 = new fa.w
            r10.<init>(r5, r8, r6)
            r8 = 0
            r5 = r9
            r6 = r3
            r20 = r11
            r11 = r18
            r18 = r14
            r14 = 0
            r8 = r1
            r34 = r19
            r5.mo48d(r6, r7, r8, r10)
            ea.b r5 = r0.f6957i
            r5.m4548a(r3)
            da.l0 r0 = r0.f6961m
            da.a0 r5 = r0.f6926a
            java.util.Objects.requireNonNull(r5)
            java.nio.charset.Charset r6 = p094fa.AbstractC2103a0.f9649a
            fa.b$b r6 = new fa.b$b
            r6.<init>()
            r6.f9658a = r13
            da.a r7 = r5.f6873c
            java.lang.String r7 = r7.f6862a
            java.lang.String r8 = "Null gmpAppId"
            java.util.Objects.requireNonNull(r7, r8)
            r6.f9659b = r7
            da.h0 r7 = r5.f6872b
            java.lang.String r7 = r7.m3877c()
            java.lang.String r8 = "Null installationUuid"
            java.util.Objects.requireNonNull(r7, r8)
            r6.f9661d = r7
            da.a r7 = r5.f6873c
            java.lang.String r7 = r7.f6866e
            java.lang.String r8 = "Null buildVersion"
            java.util.Objects.requireNonNull(r7, r8)
            r6.f9662e = r7
            da.a r7 = r5.f6873c
            java.lang.String r7 = r7.f6867f
            java.lang.String r8 = "Null displayVersion"
            java.util.Objects.requireNonNull(r7, r8)
            r6.f9663f = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r21)
            r6.f9660c = r7
            fa.g$b r7 = new fa.g$b
            r7.<init>()
            r7.m5684b(r14)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.f9702c = r1
            java.lang.String r1 = "Null identifier"
            java.util.Objects.requireNonNull(r3, r1)
            r7.f9701b = r3
            java.lang.String r2 = p056da.C1347a0.f6870f
            java.lang.String r3 = "Null generator"
            java.util.Objects.requireNonNull(r2, r3)
            r7.f9700a = r2
            da.h0 r2 = r5.f6872b
            java.lang.String r2 = r2.f6914c
            java.util.Objects.requireNonNull(r2, r1)
            da.a r1 = r5.f6873c
            java.lang.String r1 = r1.f6866e
            java.lang.String r3 = "Null version"
            java.util.Objects.requireNonNull(r1, r3)
            da.a r3 = r5.f6873c
            java.lang.String r3 = r3.f6867f
            da.h0 r8 = r5.f6872b
            java.lang.String r26 = r8.m3877c()
            da.a r8 = r5.f6873c
            na.b r8 = r8.f6868g
            na.a r8 = (na.C4720a) r8
            java.lang.String r8 = r8.m10777a()
            if (r8 == 0) goto L197
            java.lang.String r9 = "Unity"
            r28 = r8
            r27 = r9
            goto L19d
        L197:
            r8 = 0
            r9 = 0
            r27 = r8
            r28 = r9
        L19d:
            fa.h r8 = new fa.h
            r25 = 0
            r29 = 0
            r21 = r8
            r22 = r2
            r23 = r1
            r24 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r7.f9705f = r8
            android.content.Context r1 = r5.f6871a
            boolean r1 = p056da.C1354e.m3868l(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = ""
            if (r12 != 0) goto L1c1
            java.lang.String r3 = " platform"
            goto L1c2
        L1c1:
            r3 = r2
        L1c2:
            if (r1 != 0) goto L1ca
            java.lang.String r8 = " jailbroken"
            java.lang.String r3 = p064e.C1493g.m4049a(r3, r8)
        L1ca:
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L302
            fa.u r3 = new fa.u
            int r8 = r12.intValue()
            boolean r1 = r1.booleanValue()
            r19 = 0
            r9 = r17
            r10 = r18
            r14 = r3
            r35 = r15
            r13 = r16
            r15 = r8
            r18 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            r7.f9707h = r3
            android.os.StatFs r1 = new android.os.StatFs
            java.io.File r3 = android.os.Environment.getDataDirectory()
            java.lang.String r3 = r3.getPath()
            r1.<init>(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r35)
            r8 = 7
            if (r3 == 0) goto L202
            goto L219
        L202:
            java.util.Map<java.lang.String, java.lang.Integer> r3 = p056da.C1347a0.f6869e
            r9 = r35
            java.lang.String r4 = r9.toLowerCase(r4)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L215
            goto L219
        L215:
            int r8 = r3.intValue()
        L219:
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            int r3 = r3.availableProcessors()
            long r13 = p056da.C1354e.m3865i()
            int r4 = r1.getBlockCount()
            r35 = r6
            r9 = r7
            long r6 = (long) r4
            int r1 = r1.getBlockSize()
            r4 = r2
            long r1 = (long) r1
            long r6 = r6 * r1
            android.content.Context r1 = r5.f6871a
            boolean r1 = p056da.C1354e.m3867k(r1)
            android.content.Context r2 = r5.f6871a
            int r2 = p056da.C1354e.m3861e(r2)
            fa.j$b r5 = new fa.j$b
            r5.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.f9727a = r8
            r5.f9728b = r10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.f9729c = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r5.f9730d = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r5.f9731e = r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.f9732f = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r5.f9733g = r1
            r1 = r34
            r5.f9734h = r1
            r5.f9735i = r11
            fa.a0$e$c r1 = r5.m5685a()
            r9.f9708i = r1
            r9.f9710k = r12
            fa.a0$e r1 = r9.mo5602a()
            r2 = r35
            r2.f9664g = r1
            fa.a0 r1 = r2.mo5575a()
            ia.e r0 = r0.f6927b
            java.util.Objects.requireNonNull(r0)
            r2 = r1
            fa.b r2 = (p094fa.C2104b) r2
            fa.a0$e r2 = r2.f9656h
            if (r2 != 0) goto L2a2
            r0 = 3
            r3 = r20
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L301
            java.lang.String r0 = "Could not get session for report"
            r1 = 0
            android.util.Log.d(r3, r0, r1)
            goto L301
        L2a2:
            r3 = r20
            java.lang.String r5 = r2.mo5588g()
            java.io.File r0 = r0.m7587f(r5)     // Catch: java.io.IOException -> L2f0
            p148ia.C3123e.m7582h(r0)     // Catch: java.io.IOException -> L2f0
            ga.a r6 = p148ia.C3123e.f12523i     // Catch: java.io.IOException -> L2f0
            java.lang.String r1 = r6.m6074h(r1)     // Catch: java.io.IOException -> L2f0
            java.io.File r6 = new java.io.File     // Catch: java.io.IOException -> L2f0
            java.lang.String r7 = "report"
            r6.<init>(r0, r7)     // Catch: java.io.IOException -> L2f0
            p148ia.C3123e.m7585k(r6, r1)     // Catch: java.io.IOException -> L2f0
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L2f0
            java.lang.String r6 = "start-time"
            r1.<init>(r0, r6)     // Catch: java.io.IOException -> L2f0
            long r6 = r2.mo5590i()     // Catch: java.io.IOException -> L2f0
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.io.IOException -> L2f0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L2f0
            r0.<init>(r1)     // Catch: java.io.IOException -> L2f0
            java.nio.charset.Charset r8 = p148ia.C3123e.f12521g     // Catch: java.io.IOException -> L2f0
            r2.<init>(r0, r8)     // Catch: java.io.IOException -> L2f0
            r2.write(r4)     // Catch: java.lang.Throwable -> L2e4
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            r1.setLastModified(r6)     // Catch: java.lang.Throwable -> L2e4
            r2.close()     // Catch: java.io.IOException -> L2f0
            goto L301
        L2e4:
            r0 = move-exception
            r1 = r0
            r2.close()     // Catch: java.lang.Throwable -> L2ea
            goto L2ef
        L2ea:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch: java.io.IOException -> L2f0
        L2ef:
            throw r1     // Catch: java.io.IOException -> L2f0
        L2f0:
            r0 = move-exception
            java.lang.String r1 = "Could not persist report for session "
            java.lang.String r1 = p064e.C1493g.m4049a(r1, r5)
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L301
            android.util.Log.d(r3, r1, r0)
        L301:
            return
        L302:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r1 = p064e.C1493g.m4049a(r1, r3)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public static p327s7.AbstractC5985i m3895b(p056da.C1378r r12) {
            java.util.Objects.requireNonNull(r12)
            java.lang.String r0 = "FirebaseCrashlytics"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            da.j r2 = p056da.C1364j.f6918a
            java.io.File r3 = r12.m3900g()
            java.io.File[] r2 = r3.listFiles(r2)
            r3 = 0
            if (r2 != 0) goto L19
            java.io.File[] r2 = new java.io.File[r3]
        L19:
            int r3 = r2.length
            r4 = 0
        L1b:
            if (r4 >= r3) goto L79
            r5 = r2[r4]
            r6 = 0
            java.lang.String r7 = r5.getName()     // Catch: java.lang.NumberFormatException -> L5f
            r8 = 3
            java.lang.String r7 = r7.substring(r8)     // Catch: java.lang.NumberFormatException -> L5f
            long r9 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L5f
            r7 = 1
            java.lang.String r11 = "com.google.firebase.crash.FirebaseCrash"
            java.lang.Class.forName(r11)     // Catch: java.lang.ClassNotFoundException -> L35 java.lang.NumberFormatException -> L5f
            r11 = 1
            goto L36
        L35:
            r11 = 0
        L36:
            if (r11 == 0) goto L42
            java.lang.String r7 = "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"
            android.util.Log.w(r0, r7, r6)     // Catch: java.lang.NumberFormatException -> L5f
            s7.i r7 = p327s7.C5988l.m12464e(r6)     // Catch: java.lang.NumberFormatException -> L5f
            goto L5b
        L42:
            boolean r8 = android.util.Log.isLoggable(r0, r8)     // Catch: java.lang.NumberFormatException -> L5f
            if (r8 == 0) goto L4d
            java.lang.String r8 = "Logging app exception event to Firebase Analytics"
            android.util.Log.d(r0, r8, r6)     // Catch: java.lang.NumberFormatException -> L5f
        L4d:
            java.util.concurrent.ScheduledThreadPoolExecutor r8 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.NumberFormatException -> L5f
            r8.<init>(r7)     // Catch: java.lang.NumberFormatException -> L5f
            da.k r7 = new da.k     // Catch: java.lang.NumberFormatException -> L5f
            r7.<init>(r12, r9)     // Catch: java.lang.NumberFormatException -> L5f
            s7.i r7 = p327s7.C5988l.m12462c(r8, r7)     // Catch: java.lang.NumberFormatException -> L5f
        L5b:
            r1.add(r7)     // Catch: java.lang.NumberFormatException -> L5f
            goto L73
        L5f:
            java.lang.String r7 = "Could not parse app exception timestamp from file "
            java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r7)
            java.lang.String r8 = r5.getName()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r0, r7, r6)
        L73:
            r5.delete()
            int r4 = r4 + 1
            goto L1b
        L79:
            s7.i r12 = p327s7.C5988l.m12465f(r1)
            return r12
    }

    /* renamed from: c */
    public final void m3896c(boolean r25, p188ka.InterfaceC4076c r26) {
            r24 = this;
            r1 = r24
            r2 = r25
            da.l0 r0 = r1.f6961m
            java.util.List r0 = r0.m3889e()
            r3 = r0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            r4 = 2
            r5 = 0
            if (r0 > r2) goto L25
            java.lang.String r0 = "No open sessions to be closed."
            java.lang.String r2 = "FirebaseCrashlytics"
            boolean r2 = android.util.Log.isLoggable(r2, r4)
            if (r2 == 0) goto L24
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.v(r2, r0, r5)
        L24:
            return
        L25:
            java.lang.Object r0 = r3.get(r2)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            r0 = r26
            ka.b r0 = (p188ka.C4075b) r0
            la.c r0 = r0.m9171b()
            la.b r0 = r0.mo9543b()
            boolean r0 = r0.f17393b
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L288
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 30
            if (r0 < r8) goto L274
            android.content.Context r0 = r1.f6949a
            java.lang.String r8 = "activity"
            java.lang.Object r0 = r0.getSystemService(r8)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r6 = r0.getHistoricalProcessExitReasons(r5, r7, r6)
            int r0 = r6.size()
            if (r0 == 0) goto L288
            ea.b r8 = new ea.b
            android.content.Context r0 = r1.f6949a
            ea.b$b r9 = r1.f6956h
            r8.<init>(r0, r9, r4)
            androidx.fragment.app.l0 r9 = new androidx.fragment.app.l0
            r0 = 18
            r9.<init>(r0)
            da.k0 r0 = new da.k0
            java.io.File r10 = r24.m3900g()
            r0.<init>(r10)
            java.lang.String r10 = "Failed to close user metadata file."
            java.io.File r0 = r0.m3883a(r4)
            boolean r11 = r0.exists()
            if (r11 != 0) goto L7e
            goto La3
        L7e:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
            java.lang.String r0 = p056da.C1354e.m3870n(r11)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.util.Map r0 = p056da.C1367k0.m3882b(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            p056da.C1354e.m3857a(r11, r10)
            goto La7
        L8f:
            r0 = move-exception
            goto L270
        L92:
            r0 = move-exception
            goto L99
        L94:
            r0 = move-exception
            goto L26f
        L97:
            r0 = move-exception
            r11 = r5
        L99:
            java.lang.String r12 = "Error deserializing user metadata."
            java.lang.String r13 = "FirebaseCrashlytics"
            android.util.Log.e(r13, r12, r0)     // Catch: java.lang.Throwable -> L26d
            p056da.C1354e.m3857a(r11, r10)
        La3:
            java.util.Map r0 = java.util.Collections.emptyMap()
        La7:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r10 = r9.f2231a0
            da.j0 r10 = (p056da.C1365j0) r10
            monitor-enter(r10)
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L26a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L26a
            r11 = 0
        Lb5:
            boolean r12 = r0.hasNext()     // Catch: java.lang.Throwable -> L26a
            if (r12 == 0) goto L100
            java.lang.Object r12 = r0.next()     // Catch: java.lang.Throwable -> L26a
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch: java.lang.Throwable -> L26a
            java.lang.Object r13 = r12.getKey()     // Catch: java.lang.Throwable -> L26a
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L26a
            if (r13 == 0) goto Lf8
            java.lang.String r13 = r10.m3881b(r13)     // Catch: java.lang.Throwable -> L26a
            java.util.Map<java.lang.String, java.lang.String> r14 = r10.f6919a     // Catch: java.lang.Throwable -> L26a
            int r14 = r14.size()     // Catch: java.lang.Throwable -> L26a
            int r15 = r10.f6920b     // Catch: java.lang.Throwable -> L26a
            if (r14 < r15) goto Le3
            java.util.Map<java.lang.String, java.lang.String> r14 = r10.f6919a     // Catch: java.lang.Throwable -> L26a
            boolean r14 = r14.containsKey(r13)     // Catch: java.lang.Throwable -> L26a
            if (r14 == 0) goto Le0
            goto Le3
        Le0:
            int r11 = r11 + 1
            goto Lb5
        Le3:
            java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Throwable -> L26a
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L26a
            java.util.Map<java.lang.String, java.lang.String> r14 = r10.f6919a     // Catch: java.lang.Throwable -> L26a
            if (r12 != 0) goto Lf0
            java.lang.String r12 = ""
            goto Lf4
        Lf0:
            java.lang.String r12 = r10.m3881b(r12)     // Catch: java.lang.Throwable -> L26a
        Lf4:
            r14.put(r13, r12)     // Catch: java.lang.Throwable -> L26a
            goto Lb5
        Lf8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L26a
            java.lang.String r2 = "Custom attribute key must not be null."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L26a
            throw r0     // Catch: java.lang.Throwable -> L26a
        L100:
            if (r11 <= 0) goto L122
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26a
            r0.<init>()     // Catch: java.lang.Throwable -> L26a
            java.lang.String r12 = "Ignored "
            r0.append(r12)     // Catch: java.lang.Throwable -> L26a
            r0.append(r11)     // Catch: java.lang.Throwable -> L26a
            java.lang.String r11 = " entries when adding custom keys. Maximum allowable: "
            r0.append(r11)     // Catch: java.lang.Throwable -> L26a
            int r11 = r10.f6920b     // Catch: java.lang.Throwable -> L26a
            r0.append(r11)     // Catch: java.lang.Throwable -> L26a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L26a
            java.lang.String r11 = "FirebaseCrashlytics"
            android.util.Log.w(r11, r0, r5)     // Catch: java.lang.Throwable -> L26a
        L122:
            monitor-exit(r10)
            da.l0 r10 = r1.f6961m
            java.lang.Object r0 = r6.get(r7)
            r6 = r0
            android.app.ApplicationExitInfo r6 = (android.app.ApplicationExitInfo) r6
            java.lang.String r7 = "FirebaseCrashlytics"
            ia.e r0 = r10.f6927b
            java.io.File r0 = r0.m7587f(r4)
            java.io.File r11 = new java.io.File
            java.lang.String r12 = "start-time"
            r11.<init>(r0, r12)
            long r11 = r11.lastModified()
            long r13 = r6.getTimestamp()
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L149
            goto L288
        L149:
            int r0 = r6.getReason()
            r11 = 6
            if (r0 == r11) goto L152
            goto L288
        L152:
            da.a0 r11 = r10.f6926a
            java.io.InputStream r0 = r6.getTraceInputStream()     // Catch: java.lang.NullPointerException -> L15d java.io.IOException -> L15f
            java.lang.String r0 = p056da.C1369l0.m3885b(r0)     // Catch: java.lang.NullPointerException -> L15d java.io.IOException -> L15f
            goto L17d
        L15d:
            r0 = move-exception
            goto L160
        L15f:
            r0 = move-exception
        L160:
            java.lang.String r12 = "Could not get input trace in application exit info: "
            java.lang.StringBuilder r12 = android.support.v4.media.C0144c.m256a(r12)
            java.lang.String r13 = r6.toString()
            r12.append(r13)
            java.lang.String r13 = " Error: "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            android.util.Log.w(r7, r0, r5)
            r0 = r5
        L17d:
            fa.c$b r12 = new fa.c$b
            r12.<init>()
            int r13 = r6.getImportance()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.f9678d = r13
            java.lang.String r13 = r6.getProcessName()
            java.lang.String r14 = "Null processName"
            java.util.Objects.requireNonNull(r13, r14)
            r12.f9676b = r13
            int r13 = r6.getReason()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.f9677c = r13
            long r13 = r6.getTimestamp()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.f9681g = r13
            int r13 = r6.getPid()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.f9675a = r13
            long r13 = r6.getPss()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.f9679e = r13
            long r13 = r6.getRss()
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r12.f9680f = r6
            r12.f9682h = r0
            fa.a0$a r16 = r12.m5662a()
            android.content.Context r0 = r11.f6871a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            fa.k$b r6 = new fa.k$b
            r6.<init>()
            java.lang.String r12 = "anr"
            r6.m5687c(r12)
            r12 = r16
            fa.c r12 = (p094fa.C2106c) r12
            long r13 = r12.f9673g
            r6.m5686b(r13)
            int r12 = r12.f9670d
            r13 = 100
            if (r12 == r13) goto L1f6
            r12 = 1
            goto L1f7
        L1f6:
            r12 = 0
        L1f7:
            r20 = 0
            r21 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)
            r15 = 0
            r14 = 0
            fa.a0$e$d$a$b$c r17 = r11.m3848e()
            fa.b0 r18 = r11.m3844a()
            fa.m r23 = new fa.m
            r19 = 0
            r13 = r23
            r13.<init>(r14, r15, r16, r17, r18, r19)
            if (r22 != 0) goto L21b
            java.lang.String r13 = " uiOrientation"
            goto L21d
        L21b:
            java.lang.String r13 = ""
        L21d:
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L25e
            fa.l r13 = new fa.l
            int r22 = r22.intValue()
            r14 = 0
            r17 = r13
            r18 = r23
            r19 = r21
            r21 = r12
            r23 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r6.f9743c = r13
            fa.a0$e$d$c r0 = r11.m3845b(r0)
            r6.f9744d = r0
            fa.a0$e$d r0 = r6.mo5649a()
            java.lang.String r6 = "Persisting anr for session "
            java.lang.String r6 = p064e.C1493g.m4049a(r6, r4)
            r11 = 3
            boolean r11 = android.util.Log.isLoggable(r7, r11)
            if (r11 == 0) goto L253
            android.util.Log.d(r7, r6, r5)
        L253:
            ia.e r6 = r10.f6927b
            fa.a0$e$d r0 = r10.m3888a(r0, r8, r9)
            r7 = 1
            r6.m7588g(r0, r4, r7)
            goto L288
        L25e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r2 = p064e.C1493g.m4049a(r2, r13)
            r0.<init>(r2)
            throw r0
        L26a:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L26d:
            r0 = move-exception
            r5 = r11
        L26f:
            r11 = r5
        L270:
            p056da.C1354e.m3857a(r11, r10)
            throw r0
        L274:
            java.lang.String r6 = "ANR feature enabled, but device is API "
            java.lang.String r0 = android.support.v4.media.C0142a.m254a(r6, r0)
            java.lang.String r6 = "FirebaseCrashlytics"
            r7 = 2
            boolean r6 = android.util.Log.isLoggable(r6, r7)
            if (r6 == 0) goto L288
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.v(r6, r0, r5)
        L288:
            aa.a r0 = r1.f6958j
            boolean r0 = r0.mo49e(r4)
            if (r0 == 0) goto L2c4
            java.lang.String r0 = "Finalizing native report for session "
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
            java.lang.String r6 = "FirebaseCrashlytics"
            r7 = 2
            boolean r7 = android.util.Log.isLoggable(r6, r7)
            if (r7 == 0) goto L2a2
            android.util.Log.v(r6, r0, r5)
        L2a2:
            aa.a r0 = r1.f6958j
            aa.d r0 = r0.mo46b(r4)
            java.util.Objects.requireNonNull(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "No minidump data found for session "
            r0.append(r7)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r6, r0, r5)
            aa.a r0 = r1.f6958j
            r0.mo45a(r4)
        L2c4:
            if (r2 == 0) goto L2ce
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L2cf
        L2ce:
            r0 = r5
        L2cf:
            da.l0 r2 = r1.f6961m
            long r3 = java.lang.System.currentTimeMillis()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r6
            ia.e r2 = r2.f6927b
            ia.a r6 = new ia.a
            r6.<init>(r0)
            java.io.File r0 = r2.f12527b
            java.util.List r0 = p148ia.C3123e.m7580d(r0, r6)
            java.util.Comparator<? super java.io.File> r6 = p148ia.C3123e.f12524j
            java.util.Collections.sort(r0, r6)
            int r6 = r0.size()
            r7 = 8
            if (r6 > r7) goto L2f3
            goto L314
        L2f3:
            int r6 = r0.size()
            java.util.List r6 = r0.subList(r7, r6)
            java.util.Iterator r6 = r6.iterator()
        L2ff:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L30f
            java.lang.Object r8 = r6.next()
            java.io.File r8 = (java.io.File) r8
            p148ia.C3123e.m7584j(r8)
            goto L2ff
        L30f:
            r6 = 0
            java.util.List r0 = r0.subList(r6, r7)
        L314:
            java.util.Iterator r6 = r0.iterator()
        L318:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4b5
            java.lang.Object r0 = r6.next()
            r7 = r0
            java.io.File r7 = (java.io.File) r7
            java.lang.String r0 = "Finalizing report for session "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r8 = r7.getName()
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "FirebaseCrashlytics"
            r9 = 2
            boolean r9 = android.util.Log.isLoggable(r8, r9)
            if (r9 == 0) goto L342
            android.util.Log.v(r8, r0, r5)
        L342:
            java.io.FilenameFilter r0 = p148ia.C3123e.f12525k
            java.util.List r0 = p148ia.C3123e.m7581e(r7, r0)
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L370
            java.lang.String r0 = "Session "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r9 = r7.getName()
            r0.append(r9)
            java.lang.String r9 = " has no events."
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r9 = 2
            boolean r9 = android.util.Log.isLoggable(r8, r9)
            if (r9 == 0) goto L4b0
            android.util.Log.v(r8, r0, r5)
            goto L4b0
        L370:
            java.util.Collections.sort(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r0.iterator()
        L37c:
            r0 = 0
            r11 = 0
        L37e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L3ee
            java.lang.Object r0 = r10.next()
            r12 = r0
            java.io.File r12 = (java.io.File) r12
            ga.a r0 = p148ia.C3123e.f12523i     // Catch: java.io.IOException -> L3d8
            java.lang.String r13 = p148ia.C3123e.m7583i(r12)     // Catch: java.io.IOException -> L3d8
            java.util.Objects.requireNonNull(r0)     // Catch: java.io.IOException -> L3d8
            android.util.JsonReader r14 = new android.util.JsonReader     // Catch: java.lang.IllegalStateException -> L3d1 java.io.IOException -> L3d8
            java.io.StringReader r0 = new java.io.StringReader     // Catch: java.lang.IllegalStateException -> L3d1 java.io.IOException -> L3d8
            r0.<init>(r13)     // Catch: java.lang.IllegalStateException -> L3d1 java.io.IOException -> L3d8
            r14.<init>(r0)     // Catch: java.lang.IllegalStateException -> L3d1 java.io.IOException -> L3d8
            fa.a0$e$d r0 = ga.C2310a.m6070d(r14)     // Catch: java.lang.Throwable -> L3c5
            r14.close()     // Catch: java.lang.IllegalStateException -> L3d1 java.io.IOException -> L3d8
            r9.add(r0)     // Catch: java.io.IOException -> L3d8
            if (r11 != 0) goto L3c3
            java.lang.String r0 = r12.getName()     // Catch: java.io.IOException -> L3d8
            java.lang.String r13 = "event"
            boolean r13 = r0.startsWith(r13)     // Catch: java.io.IOException -> L3d8
            if (r13 == 0) goto L3c0
            java.lang.String r13 = "_"
            boolean r0 = r0.endsWith(r13)     // Catch: java.io.IOException -> L3d8
            if (r0 == 0) goto L3c0
            r0 = 1
            goto L3c1
        L3c0:
            r0 = 0
        L3c1:
            if (r0 == 0) goto L37c
        L3c3:
            r11 = 1
            goto L37e
        L3c5:
            r0 = move-exception
            r13 = r0
            r14.close()     // Catch: java.lang.Throwable -> L3cb
            goto L3d0
        L3cb:
            r0 = move-exception
            r14 = r0
            r13.addSuppressed(r14)     // Catch: java.lang.IllegalStateException -> L3d1 java.io.IOException -> L3d8
        L3d0:
            throw r13     // Catch: java.lang.IllegalStateException -> L3d1 java.io.IOException -> L3d8
        L3d1:
            r0 = move-exception
            java.io.IOException r13 = new java.io.IOException     // Catch: java.io.IOException -> L3d8
            r13.<init>(r0)     // Catch: java.io.IOException -> L3d8
            throw r13     // Catch: java.io.IOException -> L3d8
        L3d8:
            r0 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Could not add event to report for "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            android.util.Log.w(r8, r12, r0)
            goto L37e
        L3ee:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L40a
            java.lang.String r0 = "Could not parse event files for session "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r9 = r7.getName()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r8, r0, r5)
            goto L4b0
        L40a:
            java.io.File r0 = new java.io.File
            java.lang.String r10 = "user"
            r0.<init>(r7, r10)
            boolean r10 = r0.isFile()
            if (r10 == 0) goto L432
            java.lang.String r0 = p148ia.C3123e.m7583i(r0)     // Catch: java.io.IOException -> L41c
            goto L433
        L41c:
            r0 = move-exception
            r10 = r0
            java.lang.String r0 = "Could not read user ID file in "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r12 = r7.getName()
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r8, r0, r10)
        L432:
            r0 = r5
        L433:
            java.io.File r10 = new java.io.File
            java.lang.String r12 = "report"
            r10.<init>(r7, r12)
            if (r11 == 0) goto L43f
            java.io.File r12 = r2.f12528c
            goto L441
        L43f:
            java.io.File r12 = r2.f12529d
        L441:
            ga.a r13 = p148ia.C3123e.f12523i     // Catch: java.io.IOException -> L49b
            java.lang.String r14 = p148ia.C3123e.m7583i(r10)     // Catch: java.io.IOException -> L49b
            fa.a0 r14 = r13.m6073g(r14)     // Catch: java.io.IOException -> L49b
            fa.a0 r0 = r14.m5566j(r3, r11, r0)     // Catch: java.io.IOException -> L49b
            fa.b0 r11 = new fa.b0     // Catch: java.io.IOException -> L49b
            r11.<init>(r9)     // Catch: java.io.IOException -> L49b
            r9 = r0
            fa.b r9 = (p094fa.C2104b) r9     // Catch: java.io.IOException -> L49b
            fa.a0$e r9 = r9.f9656h     // Catch: java.io.IOException -> L49b
            if (r9 == 0) goto L493
            fa.a0$b r9 = r0.mo5565i()     // Catch: java.io.IOException -> L49b
            fa.b r0 = (p094fa.C2104b) r0     // Catch: java.io.IOException -> L49b
            fa.a0$e r0 = r0.f9656h     // Catch: java.io.IOException -> L49b
            fa.a0$e$b r0 = r0.mo5593l()     // Catch: java.io.IOException -> L49b
            fa.g$b r0 = (p094fa.C2111g.b) r0     // Catch: java.io.IOException -> L49b
            r0.f9709j = r11     // Catch: java.io.IOException -> L49b
            fa.a0$e r0 = r0.mo5602a()     // Catch: java.io.IOException -> L49b
            fa.b$b r9 = (p094fa.C2104b.b) r9     // Catch: java.io.IOException -> L49b
            r9.f9664g = r0     // Catch: java.io.IOException -> L49b
            fa.a0 r0 = r9.mo5575a()     // Catch: java.io.IOException -> L49b
            r9 = r0
            fa.b r9 = (p094fa.C2104b) r9     // Catch: java.io.IOException -> L49b
            fa.a0$e r9 = r9.f9656h     // Catch: java.io.IOException -> L49b
            if (r9 != 0) goto L47f
            goto L4b0
        L47f:
            java.io.File r11 = new java.io.File     // Catch: java.io.IOException -> L49b
            p148ia.C3123e.m7582h(r12)     // Catch: java.io.IOException -> L49b
            java.lang.String r9 = r9.mo5588g()     // Catch: java.io.IOException -> L49b
            r11.<init>(r12, r9)     // Catch: java.io.IOException -> L49b
            java.lang.String r0 = r13.m6074h(r0)     // Catch: java.io.IOException -> L49b
            p148ia.C3123e.m7585k(r11, r0)     // Catch: java.io.IOException -> L49b
            goto L4b0
        L493:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L49b
            java.lang.String r9 = "Reports without sessions cannot have events added to them."
            r0.<init>(r9)     // Catch: java.io.IOException -> L49b
            throw r0     // Catch: java.io.IOException -> L49b
        L49b:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Could not synthesize final report file for "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r8, r9, r0)
        L4b0:
            p148ia.C3123e.m7584j(r7)
            goto L318
        L4b5:
            ka.c r0 = r2.f12531f
            ka.b r0 = (p188ka.C4075b) r0
            la.c r0 = r0.m9171b()
            n0.k r0 = r0.mo9542a()
            int r0 = r0.f18564b
            java.util.List r2 = r2.m7586c()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            if (r3 > r0) goto L4d0
            goto L4e8
        L4d0:
            java.util.List r0 = r2.subList(r0, r3)
            java.util.Iterator r0 = r0.iterator()
        L4d8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e8
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            r2.delete()
            goto L4d8
        L4e8:
            return
    }

    /* renamed from: d */
    public final void m3897d(long r5) {
            r4 = this;
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L1e
            java.io.File r1 = r4.m3900g()     // Catch: java.io.IOException -> L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1e
            r2.<init>()     // Catch: java.io.IOException -> L1e
            java.lang.String r3 = ".ae"
            r2.append(r3)     // Catch: java.io.IOException -> L1e
            r2.append(r5)     // Catch: java.io.IOException -> L1e
            java.lang.String r5 = r2.toString()     // Catch: java.io.IOException -> L1e
            r0.<init>(r1, r5)     // Catch: java.io.IOException -> L1e
            r0.createNewFile()     // Catch: java.io.IOException -> L1e
            goto L26
        L1e:
            r5 = move-exception
            java.lang.String r6 = "FirebaseCrashlytics"
            java.lang.String r0 = "Could not create app exception marker file."
            android.util.Log.w(r6, r0, r5)
        L26:
            return
    }

    /* renamed from: e */
    public boolean m3898e(p188ka.InterfaceC4076c r7) {
            r6 = this;
            da.f r0 = r6.f6952d
            r0.m3871a()
            boolean r0 = r6.m3901h()
            r1 = 0
            r2 = 0
            java.lang.String r3 = "FirebaseCrashlytics"
            if (r0 == 0) goto L15
            java.lang.String r7 = "Skipping session finalization because a crash has already occurred."
            android.util.Log.w(r3, r7, r1)
            return r2
        L15:
            r0 = 2
            boolean r4 = android.util.Log.isLoggable(r3, r0)
            r5 = 1
            if (r4 == 0) goto L22
            java.lang.String r4 = "Finalizing previously open sessions."
            android.util.Log.v(r3, r4, r1)
        L22:
            r6.m3896c(r5, r7)     // Catch: java.lang.Exception -> L31
            boolean r7 = android.util.Log.isLoggable(r3, r0)
            if (r7 == 0) goto L30
            java.lang.String r7 = "Closed all previously open sessions."
            android.util.Log.v(r3, r7, r1)
        L30:
            return r5
        L31:
            r7 = move-exception
            java.lang.String r0 = "Unable to finalize previously open sessions."
            android.util.Log.e(r3, r0, r7)
            return r2
    }

    /* renamed from: f */
    public final java.lang.String m3899f() {
            r2 = this;
            da.l0 r0 = r2.f6961m
            java.util.List r0 = r0.m3889e()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L16
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    /* renamed from: g */
    public java.io.File m3900g() {
            r1 = this;
            k7.h4 r0 = r1.f6954f
            java.io.File r0 = r0.m8568b()
            return r0
    }

    /* renamed from: h */
    public boolean m3901h() {
            r1 = this;
            da.c0 r0 = r1.f6962n
            if (r0 == 0) goto Le
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f6881e
            boolean r0 = r0.get()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* renamed from: i */
    public p327s7.AbstractC5985i<java.lang.Void> m3902i(p327s7.AbstractC5985i<la.C4233a> r6) {
            r5 = this;
            da.l0 r0 = r5.f6961m
            ia.e r0 = r0.f6927b
            java.util.List r0 = r0.m7586c()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 != 0) goto L2f
            java.lang.String r6 = "No crash reports are available to be sent."
            r0 = 2
            java.lang.String r1 = "FirebaseCrashlytics"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L23
            java.lang.String r0 = "FirebaseCrashlytics"
            android.util.Log.v(r0, r6, r2)
        L23:
            s7.j<java.lang.Boolean> r6 = r5.f6963o
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.m12459b(r0)
            s7.i r6 = p327s7.C5988l.m12464e(r2)
            return r6
        L2f:
            aa.c r0 = p011aa.C0047c.f101a
            java.lang.String r3 = "Crash reports are available to be sent."
            r0.m53d(r3)
            da.d0 r3 = r5.f6950b
            boolean r3 = r3.m3855a()
            if (r3 == 0) goto L5c
            java.lang.String r0 = "Automatic data collection is enabled. Allowing upload."
            r1 = 3
            java.lang.String r3 = "FirebaseCrashlytics"
            boolean r1 = android.util.Log.isLoggable(r3, r1)
            if (r1 == 0) goto L4e
            java.lang.String r1 = "FirebaseCrashlytics"
            android.util.Log.d(r1, r0, r2)
        L4e:
            s7.j<java.lang.Boolean> r0 = r5.f6963o
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.m12459b(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            s7.i r0 = p327s7.C5988l.m12464e(r0)
            goto L9d
        L5c:
            java.lang.String r2 = "Automatic data collection is disabled."
            r0.m51b(r2)
            java.lang.String r2 = "Notifying that unsent reports are available."
            r0.m53d(r2)
            s7.j<java.lang.Boolean> r2 = r5.f6963o
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.m12459b(r3)
            da.d0 r2 = r5.f6950b
            java.lang.Object r3 = r2.f6886c
            monitor-enter(r3)
            s7.j<java.lang.Void> r2 = r2.f6887d     // Catch: java.lang.Throwable -> La7
            s7.q<TResult> r2 = r2.f23075a     // Catch: java.lang.Throwable -> La7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La7
            da.o r3 = new da.o
            r3.<init>(r5)
            s7.i r2 = r2.mo12457o(r3)
            java.lang.String r3 = "Waiting for send/deleteUnsentReports to be called."
            r0.m51b(r3)
            s7.j<java.lang.Boolean> r0 = r5.f6964p
            s7.q<TResult> r0 = r0.f23075a
            java.util.concurrent.ExecutorService r3 = p056da.C1375o0.f6943a
            s7.j r3 = new s7.j
            r3.<init>()
            da.m0 r4 = new da.m0
            r4.<init>(r3, r1)
            r2.mo12448f(r4)
            r0.mo12448f(r4)
            s7.q<TResult> r0 = r3.f23075a
        L9d:
            da.r$a r1 = new da.r$a
            r1.<init>(r5, r6)
            s7.i r6 = r0.mo12457o(r1)
            return r6
        La7:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La7
            throw r6
    }
}

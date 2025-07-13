package p412xa;

/* renamed from: xa.c */
/* loaded from: classes.dex */
public class C7010c implements p412xa.InterfaceC7011d {

    /* renamed from: m */
    public static final java.lang.Object f27312m = null;

    /* renamed from: n */
    public static final java.util.concurrent.ThreadFactory f27313n = null;

    /* renamed from: a */
    public final p251o9.C5180d f27314a;

    /* renamed from: b */
    public final p012ab.C0051c f27315b;

    /* renamed from: c */
    public final za.C7267c f27316c;

    /* renamed from: d */
    public final p412xa.C7017j f27317d;

    /* renamed from: e */
    public final za.C7266b f27318e;

    /* renamed from: f */
    public final p412xa.C7015h f27319f;

    /* renamed from: g */
    public final java.lang.Object f27320g;

    /* renamed from: h */
    public final java.util.concurrent.ExecutorService f27321h;

    /* renamed from: i */
    public final java.util.concurrent.ExecutorService f27322i;

    /* renamed from: j */
    public java.lang.String f27323j;

    /* renamed from: k */
    public java.util.Set<p433ya.InterfaceC7153a> f27324k;

    /* renamed from: l */
    public final java.util.List<p412xa.InterfaceC7016i> f27325l;

    /* renamed from: xa.c$a */
    public class a implements java.util.concurrent.ThreadFactory {

        /* renamed from: a */
        public final java.util.concurrent.atomic.AtomicInteger f27326a;

        public a() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                r2.f27326a = r0
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r5) {
                r4 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.util.concurrent.atomic.AtomicInteger r2 = r4.f27326a
                int r2 = r2.getAndIncrement()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 0
                r1[r3] = r2
                java.lang.String r2 = "firebase-installations-executor-%d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r5, r1)
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p412xa.C7010c.f27312m = r0
            xa.c$a r0 = new xa.c$a
            r0.<init>()
            p412xa.C7010c.f27313n = r0
            return
    }

    public C7010c(p251o9.C5180d r12, p392wa.InterfaceC6823b<p095fb.InterfaceC2137g> r13, p392wa.InterfaceC6823b<ua.InterfaceC6369d> r14) {
            r11 = this;
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            java.util.concurrent.ThreadFactory r10 = p412xa.C7010c.f27313n
            r1 = 0
            r2 = 1
            r3 = 30
            r0 = r8
            r5 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            ab.c r0 = new ab.c
            r12.m11497a()
            android.content.Context r1 = r12.f20312a
            r0.<init>(r1, r13, r14)
            za.c r13 = new za.c
            r13.<init>(r12)
            xa.j r14 = p412xa.C7017j.m14169c()
            za.b r1 = new za.b
            r1.<init>(r12)
            xa.h r2 = new xa.h
            r2.<init>()
            r11.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r11.f27320g = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r11.f27324k = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11.f27325l = r3
            r11.f27314a = r12
            r11.f27315b = r0
            r11.f27316c = r13
            r11.f27317d = r14
            r11.f27318e = r1
            r11.f27319f = r2
            r11.f27321h = r8
            java.util.concurrent.ThreadPoolExecutor r12 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 30
            r0 = r12
            r5 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r11.f27322i = r12
            return
    }

    /* renamed from: f */
    public static p412xa.C7010c m14153f(p251o9.C5180d r2) {
            r0 = 1
            java.lang.String r1 = "Null is not a valid value of FirebaseApp."
            com.google.android.gms.common.internal.C1101a.m3097b(r0, r1)
            java.lang.Class<xa.d> r0 = p412xa.InterfaceC7011d.class
            r2.m11497a()
            y9.i r2 = r2.f20315d
            java.lang.Object r2 = r2.mo14246a(r0)
            xa.c r2 = (p412xa.C7010c) r2
            return r2
    }

    @Override // p412xa.InterfaceC7011d
    /* renamed from: a */
    public p327s7.AbstractC5985i<com.google.firebase.installations.AbstractC1244a> mo14154a(boolean r5) {
            r4 = this;
            r4.m14160h()
            s7.j r0 = new s7.j
            r0.<init>()
            xa.f r1 = new xa.f
            xa.j r2 = r4.f27317d
            r1.<init>(r2, r0)
            java.lang.Object r2 = r4.f27320g
            monitor-enter(r2)
            java.util.List<xa.i> r3 = r4.f27325l     // Catch: java.lang.Throwable -> L26
            r3.add(r1)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            s7.q<TResult> r0 = r0.f23075a
            java.util.concurrent.ExecutorService r1 = r4.f27321h
            xa.b r2 = new xa.b
            r3 = 0
            r2.<init>(r4, r5, r3)
            r1.execute(r2)
            return r0
        L26:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r5
    }

    /* renamed from: b */
    public final void m14155b(boolean r6) {
            r5 = this;
            java.lang.Object r0 = p412xa.C7010c.f27312m
            monitor-enter(r0)
            o9.d r1 = r5.f27314a     // Catch: java.lang.Throwable -> L61
            r1.m11497a()     // Catch: java.lang.Throwable -> L61
            android.content.Context r1 = r1.f20312a     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = "generatefid.lock"
            androidx.appcompat.widget.x r1 = androidx.appcompat.widget.C0311x.m808f(r1, r2)     // Catch: java.lang.Throwable -> L61
            za.c r2 = r5.f27316c     // Catch: java.lang.Throwable -> L5a
            za.d r2 = r2.m14356b()     // Catch: java.lang.Throwable -> L5a
            boolean r3 = r2.m14358i()     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L36
            java.lang.String r3 = r5.m14161i(r2)     // Catch: java.lang.Throwable -> L5a
            za.c r4 = r5.f27316c     // Catch: java.lang.Throwable -> L5a
            za.d$a r2 = r2.mo14349k()     // Catch: java.lang.Throwable -> L5a
            za.a$b r2 = (za.C7265a.b) r2     // Catch: java.lang.Throwable -> L5a
            r2.f27881a = r3     // Catch: java.lang.Throwable -> L5a
            za.c$a r3 = za.C7267c.a.f27895a0     // Catch: java.lang.Throwable -> L5a
            r2.mo14351b(r3)     // Catch: java.lang.Throwable -> L5a
            za.d r2 = r2.mo14350a()     // Catch: java.lang.Throwable -> L5a
            r4.m14355a(r2)     // Catch: java.lang.Throwable -> L5a
        L36:
            if (r1 == 0) goto L3b
            r1.m825p()     // Catch: java.lang.Throwable -> L61
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L4b
            za.d$a r0 = r2.mo14349k()
            za.a$b r0 = (za.C7265a.b) r0
            r1 = 0
            r0.f27883c = r1
            za.d r2 = r0.mo14350a()
        L4b:
            r5.m14164l(r2)
            java.util.concurrent.ExecutorService r0 = r5.f27322i
            xa.b r1 = new xa.b
            r2 = 1
            r1.<init>(r5, r6, r2)
            r0.execute(r1)
            return
        L5a:
            r6 = move-exception
            if (r1 == 0) goto L60
            r1.m825p()     // Catch: java.lang.Throwable -> L61
        L60:
            throw r6     // Catch: java.lang.Throwable -> L61
        L61:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            throw r6
    }

    /* renamed from: c */
    public final za.AbstractC7268d m14156c(za.AbstractC7268d r15) {
            r14 = this;
            ab.c r0 = r14.f27315b
            java.lang.String r1 = r14.m14157d()
            r2 = r15
            za.a r2 = (za.C7265a) r2
            java.lang.String r3 = r2.f27874b
            java.lang.String r4 = r14.m14159g()
            java.lang.String r2 = r2.f27877e
            ab.e r5 = r0.f118d
            boolean r5 = r5.m75a()
            java.lang.String r6 = "Firebase Installations Service is unavailable. Please try again later."
            r7 = 2
            if (r5 == 0) goto L138
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r8 = 0
            r5[r8] = r4
            r9 = 1
            r5[r9] = r3
            java.lang.String r3 = "projects/%s/installations/%s/authTokens:generate"
            java.lang.String r3 = java.lang.String.format(r3, r5)
            java.net.URL r3 = r0.m69a(r3)
            r5 = 0
        L2f:
            if (r5 > r9) goto L132
            r10 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r10)
            java.net.HttpURLConnection r10 = r0.m70c(r3, r1)
            java.lang.String r11 = "POST"
            r10.setRequestMethod(r11)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            java.lang.String r11 = "Authorization"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            r12.<init>()     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            java.lang.String r13 = "FIS_v2 "
            r12.append(r13)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            r12.append(r2)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            r10.addRequestProperty(r11, r12)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            r10.setDoOutput(r9)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            r0.m74h(r10)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            int r11 = r10.getResponseCode()     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            ab.e r12 = r0.f118d     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            r12.m76b(r11)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            r12 = 200(0xc8, float:2.8E-43)
            if (r11 < r12) goto L6f
            r12 = 300(0x12c, float:4.2E-43)
            if (r11 >= r12) goto L6f
            r12 = 1
            goto L70
        L6f:
            r12 = 0
        L70:
            r13 = 0
            if (r12 == 0) goto L78
            ab.f r0 = r0.m72f(r10)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            goto Lb8
        L78:
            p012ab.C0051c.m66b(r10, r13, r1, r4)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            r12 = 401(0x191, float:5.62E-43)
            if (r11 == r12) goto Lab
            r12 = 404(0x194, float:5.66E-43)
            if (r11 != r12) goto L84
            goto Lab
        L84:
            r12 = 429(0x1ad, float:6.01E-43)
            if (r11 == r12) goto La2
            r12 = 500(0x1f4, float:7.0E-43)
            if (r11 < r12) goto L92
            r12 = 600(0x258, float:8.41E-43)
            if (r11 >= r12) goto L92
            goto L128
        L92:
            java.lang.String r11 = "Firebase-Installations"
            java.lang.String r12 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r11, r12)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            ab.f$a r11 = p012ab.AbstractC0054f.m77a()     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            ab.f$b r12 = p012ab.AbstractC0054f.b.f128Z     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
        L9f:
            ab.b$b r11 = (p012ab.C0050b.b) r11     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            goto Lb2
        La2:
            xa.e r11 = new xa.e     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            java.lang.String r12 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r13 = 3
            r11.<init>(r12, r13)     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            throw r11     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
        Lab:
            ab.f$a r11 = p012ab.AbstractC0054f.m77a()     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            ab.f$b r12 = p012ab.AbstractC0054f.b.f129a0     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            goto L9f
        Lb2:
            r11.f112c = r12     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
            ab.f r0 = r11.mo64a()     // Catch: java.lang.Throwable -> L120 java.lang.Throwable -> L128
        Lb8:
            r10.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            ab.b r0 = (p012ab.C0050b) r0
            ab.f$b r1 = r0.f109c
            int r1 = r1.ordinal()
            if (r1 == 0) goto Lfd
            if (r1 == r9) goto Le9
            if (r1 != r7) goto Le1
            monitor-enter(r14)
            r14.f27323j = r13     // Catch: java.lang.Throwable -> Lde
            monitor-exit(r14)
            za.d$a r15 = r15.mo14349k()
            za.c$a r0 = za.C7267c.a.f27894Z
            r15.mo14351b(r0)
            za.d r15 = r15.mo14350a()
            return r15
        Lde:
            r15 = move-exception
            monitor-exit(r14)
            throw r15
        Le1:
            xa.e r15 = new xa.e
            java.lang.String r0 = "Firebase Installations Service is unavailable. Please try again later."
            r15.<init>(r0, r7)
            throw r15
        Le9:
            java.lang.String r0 = "BAD CONFIG"
            za.d$a r15 = r15.mo14349k()
            za.a$b r15 = (za.C7265a.b) r15
            r15.f27887g = r0
            za.c$a r0 = za.C7267c.a.f27897c0
            r15.mo14351b(r0)
            za.d r15 = r15.mo14350a()
            return r15
        Lfd:
            java.lang.String r1 = r0.f107a
            long r2 = r0.f108b
            xa.j r0 = r14.f27317d
            long r4 = r0.m14171b()
            za.d$a r15 = r15.mo14349k()
            za.a$b r15 = (za.C7265a.b) r15
            r15.f27883c = r1
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r15.f27885e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r15.f27886f = r0
            za.d r15 = r15.mo14350a()
            return r15
        L120:
            r15 = move-exception
            r10.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r15
        L128:
            r10.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r5 = r5 + 1
            goto L2f
        L132:
            xa.e r15 = new xa.e
            r15.<init>(r6, r7)
            throw r15
        L138:
            xa.e r15 = new xa.e
            r15.<init>(r6, r7)
            throw r15
    }

    /* renamed from: d */
    public java.lang.String m14157d() {
            r1 = this;
            o9.d r0 = r1.f27314a
            r0.m11497a()
            o9.h r0 = r0.f20314c
            java.lang.String r0 = r0.f20324a
            return r0
    }

    /* renamed from: e */
    public java.lang.String m14158e() {
            r1 = this;
            o9.d r0 = r1.f27314a
            r0.m11497a()
            o9.h r0 = r0.f20314c
            java.lang.String r0 = r0.f20325b
            return r0
    }

    /* renamed from: g */
    public java.lang.String m14159g() {
            r1 = this;
            o9.d r0 = r1.f27314a
            r0.m11497a()
            o9.h r0 = r0.f20314c
            java.lang.String r0 = r0.f20330g
            return r0
    }

    /* renamed from: h */
    public final void m14160h() {
            r4 = this;
            java.lang.String r0 = r4.m14158e()
            java.lang.String r1 = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."
            com.google.android.gms.common.internal.C1101a.m3101f(r0, r1)
            java.lang.String r0 = r4.m14159g()
            java.lang.String r2 = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."
            com.google.android.gms.common.internal.C1101a.m3101f(r0, r2)
            java.lang.String r0 = r4.m14157d()
            java.lang.String r2 = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."
            com.google.android.gms.common.internal.C1101a.m3101f(r0, r2)
            java.lang.String r0 = r4.m14158e()
            java.util.regex.Pattern r3 = p412xa.C7017j.f27333c
            java.lang.String r3 = ":"
            boolean r0 = r0.contains(r3)
            com.google.android.gms.common.internal.C1101a.m3097b(r0, r1)
            java.lang.String r0 = r4.m14157d()
            java.util.regex.Pattern r1 = p412xa.C7017j.f27333c
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            com.google.android.gms.common.internal.C1101a.m3097b(r0, r2)
            return
    }

    /* renamed from: i */
    public final java.lang.String m14161i(za.AbstractC7268d r6) {
            r5 = this;
            o9.d r0 = r5.f27314a
            r0.m11497a()
            java.lang.String r0 = r0.f20313b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            o9.d r0 = r5.f27314a
            boolean r0 = r0.m11501i()
            if (r0 == 0) goto L24
        L17:
            za.a r6 = (za.C7265a) r6
            za.c$a r6 = r6.f27875c
            za.c$a r0 = za.C7267c.a.f27893Y
            if (r6 != r0) goto L21
            r6 = 1
            goto L22
        L21:
            r6 = 0
        L22:
            if (r6 != 0) goto L2b
        L24:
            xa.h r6 = r5.f27319f
            java.lang.String r6 = r6.m14168a()
            return r6
        L2b:
            za.b r6 = r5.f27318e
            android.content.SharedPreferences r0 = r6.f27889a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f27889a     // Catch: java.lang.Throwable -> L55
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L55
            android.content.SharedPreferences r2 = r6.f27889a     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L40
            goto L44
        L40:
            java.lang.String r2 = r6.m14354a()     // Catch: java.lang.Throwable -> L55
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L51
            xa.h r6 = r5.f27319f
            java.lang.String r2 = r6.m14168a()
        L51:
            return r2
        L52:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            throw r6     // Catch: java.lang.Throwable -> L55
        L55:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            throw r6
    }

    /* renamed from: j */
    public final za.AbstractC7268d m14162j(za.AbstractC7268d r24) {
            r23 = this;
            r1 = r23
            r0 = r24
            za.a r0 = (za.C7265a) r0
            java.lang.String r2 = r0.f27874b
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L67
            int r2 = r2.length()
            r5 = 11
            if (r2 != r5) goto L67
            za.b r2 = r1.f27318e
            android.content.SharedPreferences r5 = r2.f27889a
            monitor-enter(r5)
            java.lang.String[] r6 = za.C7266b.f27888c     // Catch: java.lang.Throwable -> L64
            int r7 = r6.length     // Catch: java.lang.Throwable -> L64
            r8 = 0
        L1d:
            if (r8 >= r7) goto L5f
            r9 = r6[r8]     // Catch: java.lang.Throwable -> L64
            java.lang.String r10 = r2.f27890b     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r11.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r12 = "|T|"
            r11.append(r12)     // Catch: java.lang.Throwable -> L64
            r11.append(r10)     // Catch: java.lang.Throwable -> L64
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch: java.lang.Throwable -> L64
            r11.append(r9)     // Catch: java.lang.Throwable -> L64
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L64
            android.content.SharedPreferences r10 = r2.f27889a     // Catch: java.lang.Throwable -> L64
            java.lang.String r9 = r10.getString(r9, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L61
            boolean r10 = r9.isEmpty()     // Catch: java.lang.Throwable -> L64
            if (r10 != 0) goto L61
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L5e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5f java.lang.Throwable -> L64
            r2.<init>(r9)     // Catch: org.json.JSONException -> L5f java.lang.Throwable -> L64
            java.lang.String r6 = "token"
            java.lang.String r3 = r2.getString(r6)     // Catch: org.json.JSONException -> L5f java.lang.Throwable -> L64
            goto L5f
        L5e:
            r3 = r9
        L5f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L64
            goto L67
        L61:
            int r8 = r8 + 1
            goto L1d
        L64:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L64
            throw r0
        L67:
            ab.c r2 = r1.f27315b
            java.lang.String r5 = r23.m14157d()
            java.lang.String r0 = r0.f27874b
            java.lang.String r6 = r23.m14159g()
            java.lang.String r7 = r23.m14158e()
            ab.e r8 = r2.f118d
            boolean r8 = r8.m75a()
            java.lang.String r9 = "Firebase Installations Service is unavailable. Please try again later."
            r10 = 2
            if (r8 == 0) goto L185
            r8 = 1
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r4] = r6
            java.lang.String r12 = "projects/%s/installations"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            java.net.URL r11 = r2.m69a(r11)
            r12 = 0
        L92:
            if (r12 > r8) goto L17f
            r13 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r13)
            java.net.HttpURLConnection r13 = r2.m70c(r11, r5)
            java.lang.String r14 = "POST"
            r13.setRequestMethod(r14)     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174
            r13.setDoOutput(r8)     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174
            if (r3 == 0) goto Lad
            java.lang.String r14 = "x-goog-fis-android-iid-migration-auth"
            r13.addRequestProperty(r14, r3)     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174
        Lad:
            r2.m73g(r13, r0, r7)     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174
            int r14 = r13.getResponseCode()     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174
            ab.e r15 = r2.f118d     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174
            r15.m76b(r14)     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174
            r15 = 200(0xc8, float:2.8E-43)
            if (r14 < r15) goto Lc3
            r15 = 300(0x12c, float:4.2E-43)
            if (r14 >= r15) goto Lc3
            r15 = 1
            goto Lc4
        Lc3:
            r15 = 0
        Lc4:
            if (r15 == 0) goto Ld1
            ab.d r0 = r2.m71e(r13)     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L103
        Ld1:
            p012ab.C0051c.m66b(r13, r7, r5, r6)     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174 java.lang.Throwable -> L174
            r15 = 429(0x1ad, float:6.01E-43)
            if (r14 == r15) goto L163
            r15 = 500(0x1f4, float:7.0E-43)
            if (r14 < r15) goto Le2
            r15 = 600(0x258, float:8.41E-43)
            if (r14 >= r15) goto Le2
            goto L174
        Le2:
            java.lang.String r14 = "Firebase-Installations"
            java.lang.String r15 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r14, r15)     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174 java.lang.Throwable -> L174
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            ab.d$a r21 = p012ab.AbstractC0052d.a.f120Z     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174 java.lang.Throwable -> L174
            ab.a r14 = new ab.a     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174 java.lang.Throwable -> L174
            r22 = 0
            r16 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174 java.lang.Throwable -> L174
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r0 = r14
        L103:
            ab.a r0 = (p012ab.C0049a) r0
            ab.d$a r2 = r0.f106e
            int r2 = r2.ordinal()
            if (r2 == 0) goto L12b
            if (r2 != r8) goto L123
            java.lang.String r0 = "BAD CONFIG"
            za.d$a r2 = r24.mo14349k()
            za.a$b r2 = (za.C7265a.b) r2
            r2.f27887g = r0
            za.c$a r0 = za.C7267c.a.f27897c0
            r2.mo14351b(r0)
            za.d r0 = r2.mo14350a()
            return r0
        L123:
            xa.e r0 = new xa.e
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            r0.<init>(r2, r10)
            throw r0
        L12b:
            java.lang.String r2 = r0.f103b
            java.lang.String r3 = r0.f104c
            xa.j r4 = r1.f27317d
            long r4 = r4.m14171b()
            ab.f r6 = r0.f105d
            java.lang.String r6 = r6.mo62c()
            ab.f r0 = r0.f105d
            long r7 = r0.mo63d()
            za.d$a r0 = r24.mo14349k()
            za.a$b r0 = (za.C7265a.b) r0
            r0.f27881a = r2
            za.c$a r2 = za.C7267c.a.f27896b0
            r0.mo14351b(r2)
            r0.f27883c = r6
            r0.f27884d = r3
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r0.f27885e = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.f27886f = r2
            za.d r0 = r0.mo14350a()
            return r0
        L163:
            xa.e r14 = new xa.e     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174 java.lang.Throwable -> L174
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r4 = 3
            r14.<init>(r15, r4)     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174 java.lang.Throwable -> L174
            throw r14     // Catch: java.lang.Throwable -> L16c java.lang.Throwable -> L174 java.lang.Throwable -> L174
        L16c:
            r0 = move-exception
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L174:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r12 = r12 + 1
            r4 = 0
            goto L92
        L17f:
            xa.e r0 = new xa.e
            r0.<init>(r9, r10)
            throw r0
        L185:
            xa.e r0 = new xa.e
            r0.<init>(r9, r10)
            throw r0
    }

    /* renamed from: k */
    public final void m14163k(java.lang.Exception r4) {
            r3 = this;
            java.lang.Object r0 = r3.f27320g
            monitor-enter(r0)
            java.util.List<xa.i> r1 = r3.f27325l     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            xa.i r2 = (p412xa.InterfaceC7016i) r2     // Catch: java.lang.Throwable -> L21
            boolean r2 = r2.mo14167b(r4)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L9
            r1.remove()     // Catch: java.lang.Throwable -> L21
            goto L9
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    /* renamed from: l */
    public final void m14164l(za.AbstractC7268d r4) {
            r3 = this;
            java.lang.Object r0 = r3.f27320g
            monitor-enter(r0)
            java.util.List<xa.i> r1 = r3.f27325l     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            xa.i r2 = (p412xa.InterfaceC7016i) r2     // Catch: java.lang.Throwable -> L21
            boolean r2 = r2.mo14166a(r4)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L9
            r1.remove()     // Catch: java.lang.Throwable -> L21
            goto L9
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    @Override // p412xa.InterfaceC7011d
    /* renamed from: r */
    public p327s7.AbstractC5985i<java.lang.String> mo14165r() {
            r4 = this;
            r4.m14160h()
            monitor-enter(r4)
            java.lang.String r0 = r4.f27323j     // Catch: java.lang.Throwable -> L31
            monitor-exit(r4)
            if (r0 == 0) goto Le
            s7.i r0 = p327s7.C5988l.m12464e(r0)
            return r0
        Le:
            s7.j r0 = new s7.j
            r0.<init>()
            xa.g r1 = new xa.g
            r1.<init>(r0)
            java.lang.Object r2 = r4.f27320g
            monitor-enter(r2)
            java.util.List<xa.i> r3 = r4.f27325l     // Catch: java.lang.Throwable -> L2e
            r3.add(r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            s7.q<TResult> r0 = r0.f23075a
            java.util.concurrent.ExecutorService r1 = r4.f27321h
            f1.f r2 = new f1.f
            r2.<init>(r4)
            r1.execute(r2)
            return r0
        L2e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r0
        L31:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}

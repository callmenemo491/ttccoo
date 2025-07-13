package p124h7;

/* renamed from: h7.rd */
/* loaded from: classes.dex */
public final class C2841rd {

    /* renamed from: d */
    public static final p306r6.C5797a f11885d = null;

    /* renamed from: a */
    public final android.content.Context f11886a;

    /* renamed from: b */
    public final java.util.concurrent.ScheduledExecutorService f11887b;

    /* renamed from: c */
    public final java.util.HashMap<java.lang.String, p124h7.C2823qd> f11888c;

    static {
            r6.a r0 = new r6.a
            java.lang.String r1 = "SmsRetrieverHelper"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r2 = "FirebaseAuth"
            r0.<init>(r2, r1)
            p124h7.C2841rd.f11885d = r0
            return
    }

    public C2841rd(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f11888c = r0
            r1.f11886a = r2
            r2 = 1
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newScheduledThreadPool(r2)
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r2)
            r1.f11887b = r2
            return
    }

    /* renamed from: b */
    public static /* synthetic */ void m7099b(p124h7.C2841rd r3, java.lang.String r4) {
            java.util.HashMap<java.lang.String, h7.qd> r3 = r3.f11888c
            java.lang.Object r3 = r3.get(r4)
            h7.qd r3 = (p124h7.C2823qd) r3
            if (r3 == 0) goto L44
            java.lang.String r4 = r3.f11858d
            boolean r4 = p036c6.C0906q0.m2629q(r4)
            if (r4 != 0) goto L44
            java.lang.String r4 = r3.f11859e
            boolean r4 = p036c6.C0906q0.m2629q(r4)
            if (r4 != 0) goto L44
            java.util.List<h7.fc> r4 = r3.f11856b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L23
            goto L44
        L23:
            java.util.List<h7.fc> r4 = r3.f11856b
            java.util.Iterator r4 = r4.iterator()
        L29:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r4.next()
            h7.fc r0 = (p124h7.C2624fc) r0
            java.lang.String r1 = r3.f11858d
            java.lang.String r2 = r3.f11859e
            v9.v r1 = p375v9.C6624v.m13477Y(r1, r2)
            r0.m6720h(r1)
            goto L29
        L41:
            r4 = 1
            r3.f11862h = r4
        L44:
            return
    }

    /* renamed from: g */
    public static java.lang.String m7100g(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 1
            int r0 = r0 + r1
            r2.<init>(r0)
            java.lang.String r0 = " "
            java.lang.String r5 = p083f.C1932s.m4774a(r2, r4, r0, r5)
            r0 = 0
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.nio.charset.Charset r2 = p124h7.C2731lb.f11740a     // Catch: java.security.NoSuchAlgorithmException -> L77
            byte[] r5 = r5.getBytes(r2)     // Catch: java.security.NoSuchAlgorithmException -> L77
            r1.update(r5)     // Catch: java.security.NoSuchAlgorithmException -> L77
            byte[] r5 = r1.digest()     // Catch: java.security.NoSuchAlgorithmException -> L77
            r1 = 9
            byte[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch: java.security.NoSuchAlgorithmException -> L77
            r1 = 3
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)     // Catch: java.security.NoSuchAlgorithmException -> L77
            r1 = 11
            java.lang.String r5 = r5.substring(r0, r1)     // Catch: java.security.NoSuchAlgorithmException -> L77
            r6.a r1 = p124h7.C2841rd.f11885d     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch: java.security.NoSuchAlgorithmException -> L77
            int r2 = r2.length()     // Catch: java.security.NoSuchAlgorithmException -> L77
            int r2 = r2 + 19
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch: java.security.NoSuchAlgorithmException -> L77
            int r3 = r3.length()     // Catch: java.security.NoSuchAlgorithmException -> L77
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L77
            r3.<init>(r2)     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.lang.String r2 = "Package: "
            r3.append(r2)     // Catch: java.security.NoSuchAlgorithmException -> L77
            r3.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.lang.String r4 = " -- Hash: "
            r3.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L77
            r3.append(r5)     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.lang.String r4 = r3.toString()     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.security.NoSuchAlgorithmException -> L77
            r1.m12160a(r4, r2)     // Catch: java.security.NoSuchAlgorithmException -> L77
            return r5
        L77:
            r4 = move-exception
            r6.a r5 = p124h7.C2841rd.f11885d
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "NoSuchAlgorithm: "
            int r2 = r4.length()
            if (r2 == 0) goto L8f
            java.lang.String r4 = r1.concat(r4)
            goto L94
        L8f:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L94:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5.m12161b(r4, r0)
            r4 = 0
            return r4
    }

    /* renamed from: a */
    public final java.lang.String m7101a() {
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.f11886a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r3 = 28
            if (r2 >= r3) goto L1c
            android.content.Context r2 = r5.f11886a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            w6.b r2 = p388w6.C6816c.m13887a(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r3 = 64
            android.content.pm.PackageInfo r2 = r2.m13885b(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            android.content.pm.Signature[] r2 = r2.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            goto L2e
        L1c:
            android.content.Context r2 = r5.f11886a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            w6.b r2 = p388w6.C6816c.m13887a(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r2 = r2.m13885b(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            android.content.pm.SigningInfo r2 = r2.signingInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            android.content.pm.Signature[] r2 = r2.getApkContentsSigners()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
        L2e:
            r2 = r2[r0]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.lang.String r2 = r2.toCharsString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.lang.String r1 = m7100g(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            if (r1 == 0) goto L3b
            return r1
        L3b:
            r6.a r1 = p124h7.C2841rd.f11885d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.lang.String r2 = "Hash generation failed."
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.lang.String r4 = r1.f22479a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.lang.String r1 = r1.m12162c(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            android.util.Log.e(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            goto L5a
        L4b:
            r6.a r1 = p124h7.C2841rd.f11885d
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r1.f22479a
            java.lang.String r3 = "Unable to find package to obtain hash."
            java.lang.String r0 = r1.m12162c(r3, r0)
            android.util.Log.e(r2, r0)
        L5a:
            r0 = 0
            return r0
    }

    /* renamed from: c */
    public final void m7102c(p124h7.C2624fc r3, java.lang.String r4) {
            r2 = this;
            java.util.HashMap<java.lang.String, h7.qd> r0 = r2.f11888c
            java.lang.Object r4 = r0.get(r4)
            h7.qd r4 = (p124h7.C2823qd) r4
            if (r4 != 0) goto Lb
            return
        Lb:
            java.util.List<h7.fc> r0 = r4.f11856b
            r0.add(r3)
            boolean r0 = r4.f11861g
            if (r0 == 0) goto L19
            java.lang.String r0 = r4.f11858d
            r3.mo6714b(r0)
        L19:
            boolean r0 = r4.f11862h
            if (r0 == 0) goto L28
            java.lang.String r0 = r4.f11858d
            java.lang.String r1 = r4.f11859e
            v9.v r0 = p375v9.C6624v.m13477Y(r0, r1)
            r3.m6720h(r0)
        L28:
            boolean r0 = r4.f11863i
            if (r0 == 0) goto L31
            java.lang.String r4 = r4.f11858d
            r3.m6713a(r4)
        L31:
            return
    }

    /* renamed from: d */
    public final void m7103d(java.lang.String r4) {
            r3 = this;
            java.util.HashMap<java.lang.String, h7.qd> r0 = r3.f11888c
            java.lang.Object r0 = r0.get(r4)
            h7.qd r0 = (p124h7.C2823qd) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.concurrent.ScheduledFuture<?> r1 = r0.f11860f
            if (r1 == 0) goto L1b
            boolean r1 = r1.isDone()
            if (r1 != 0) goto L1b
            java.util.concurrent.ScheduledFuture<?> r1 = r0.f11860f
            r2 = 0
            r1.cancel(r2)
        L1b:
            java.util.List<h7.fc> r0 = r0.f11856b
            r0.clear()
            java.util.HashMap<java.lang.String, h7.qd> r0 = r3.f11888c
            r0.remove(r4)
            return
    }

    /* renamed from: e */
    public final void m7104e(java.lang.String r4, p124h7.C2624fc r5, long r6, boolean r8) {
            r3 = this;
            java.util.HashMap<java.lang.String, h7.qd> r0 = r3.f11888c
            h7.qd r1 = new h7.qd
            r1.<init>(r6, r8)
            r0.put(r4, r1)
            r3.m7102c(r5, r4)
            java.util.HashMap<java.lang.String, h7.qd> r5 = r3.f11888c
            java.lang.Object r5 = r5.get(r4)
            h7.qd r5 = (p124h7.C2823qd) r5
            long r6 = r5.f11855a
            r8 = 0
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L2e
            r6.a r4 = p124h7.C2841rd.f11885d
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r6 = r4.f22479a
            java.lang.String r7 = "Timeout of 0 specified; SmsRetriever will not start."
            java.lang.String r4 = r4.m12162c(r7, r5)
            android.util.Log.w(r6, r4)
            return
        L2e:
            java.util.concurrent.ScheduledExecutorService r0 = r3.f11887b
            h6.a0 r1 = new h6.a0
            r1.<init>(r3, r4)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledFuture r6 = r0.schedule(r1, r6, r2)
            r5.f11860f = r6
            boolean r5 = r5.f11857c
            if (r5 != 0) goto L51
            r6.a r4 = p124h7.C2841rd.f11885d
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r6 = r4.f22479a
            java.lang.String r7 = "SMS auto-retrieval unavailable; SmsRetriever will not start."
            java.lang.String r4 = r4.m12162c(r7, r5)
            android.util.Log.w(r6, r4)
            return
        L51:
            h7.pd r5 = new h7.pd
            r5.<init>(r3, r4)
            android.content.IntentFilter r4 = new android.content.IntentFilter
            r4.<init>()
            java.lang.String r6 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"
            r4.addAction(r6)
            android.content.Context r6 = r3.f11886a
            android.content.Context r6 = r6.getApplicationContext()
            r6.registerReceiver(r5, r4)
            android.content.Context r4 = r3.f11886a
            c7.h r5 = new c7.h
            r5.<init>(r4)
            m6.k$a r4 = p218m6.AbstractC4398k.m9834a()
            f.t r6 = new f.t
            r6.<init>(r5)
            r4.f17961a = r6
            r6 = 1
            k6.d[] r7 = new p184k6.C3701d[r6]
            k6.d r0 = p037c7.C0926b.f4876a
            r7[r8] = r0
            r4.f17963c = r7
            m6.k r4 = r4.m9835a()
            s7.i r4 = r5.m9328d(r6, r4)
            y.e r5 = new y.e
            r6 = 19
            r5.<init>(r6)
            s7.q r4 = (p327s7.C5993q) r4
            java.util.Objects.requireNonNull(r4)
            java.util.concurrent.Executor r6 = p327s7.C5987k.f23076a
            r4.mo12445c(r6, r5)
            return
    }

    /* renamed from: f */
    public final boolean m7105f(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, h7.qd> r0 = r1.f11888c
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    /* renamed from: h */
    public final void m7106h(java.lang.String r5) {
            r4 = this;
            java.util.HashMap<java.lang.String, h7.qd> r0 = r4.f11888c
            java.lang.Object r5 = r0.get(r5)
            h7.qd r5 = (p124h7.C2823qd) r5
            if (r5 != 0) goto Lb
            return
        Lb:
            boolean r0 = r5.f11862h
            if (r0 != 0) goto L42
            java.lang.String r0 = r5.f11858d
            boolean r0 = p036c6.C0906q0.m2629q(r0)
            if (r0 != 0) goto L42
            r6.a r0 = p124h7.C2841rd.f11885d
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "Timed out waiting for SMS."
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.w(r2, r0)
            java.util.List<h7.fc> r0 = r5.f11856b
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            h7.fc r1 = (p124h7.C2624fc) r1
            java.lang.String r2 = r5.f11858d
            r1.m6713a(r2)
            goto L2d
        L3f:
            r0 = 1
            r5.f11863i = r0
        L42:
            return
    }

    /* renamed from: i */
    public final void m7107i(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, h7.qd> r0 = r1.f11888c
            java.lang.Object r0 = r0.get(r2)
            h7.qd r0 = (p124h7.C2823qd) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            boolean r0 = r0.f11863i
            if (r0 != 0) goto L12
            r1.m7106h(r2)
        L12:
            r1.m7103d(r2)
            return
    }
}

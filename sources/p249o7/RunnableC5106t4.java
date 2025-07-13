package p249o7;

/* renamed from: o7.t4 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5106t4 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f20008Y;

    /* renamed from: Z */
    public final /* synthetic */ p249o7.C4979d5 f20009Z;

    public RunnableC5106t4(p249o7.C4979d5 r2, int r3) {
            r1 = this;
            r1.f20008Y = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.<init>()
            r1.f20009Z = r2
            return
        Lb:
            r1.f20009Z = r2
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            int r0 = r15.f20008Y
            r1 = -1
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto Lc;
                default: goto La;
            }
        La:
            goto L1f0
        Lc:
            o7.d5 r0 = r15.f20009Z
            r0.mo3183i()
            com.google.android.gms.measurement.internal.d r6 = r0.f5736a
            com.google.android.gms.measurement.internal.c r6 = r6.m3175t()
            o7.n3 r6 = r6.f5696q
            boolean r6 = r6.m11370b()
            if (r6 != 0) goto L1e2
            com.google.android.gms.measurement.internal.d r6 = r0.f5736a
            com.google.android.gms.measurement.internal.c r6 = r6.m3175t()
            o7.p3 r6 = r6.f5697r
            long r6 = r6.m11410a()
            com.google.android.gms.measurement.internal.d r8 = r0.f5736a
            com.google.android.gms.measurement.internal.c r8 = r8.m3175t()
            o7.p3 r8 = r8.f5697r
            long r4 = r4 + r6
            r8.m11411b(r4)
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            java.util.Objects.requireNonNull(r4)
            r4 = 5
            r8 = 1
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 < 0) goto L5d
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5675i
            java.lang.String r2 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            r1.m11169c(r2)
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.n3 r0 = r0.f5696q
            r0.m11369a(r8)
            goto L1ef
        L5d:
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f4 r4 = r0.mo3160b()
            r4.mo3183i()
            o7.h5 r4 = r0.m3177w()
            com.google.android.gms.measurement.internal.C1113d.m3156l(r4)
            com.google.android.gms.measurement.internal.a r4 = r0.m3172q()
            java.lang.String r4 = r4.m3132n()
            com.google.android.gms.measurement.internal.c r5 = r0.m3175t()
            r5.mo3183i()
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a
            u6.c r6 = r6.f5723n
            u6.d r6 = (p353u6.C6341d) r6
            java.util.Objects.requireNonNull(r6)
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r9 = r5.f5686g
            java.lang.String r10 = ""
            if (r9 == 0) goto La2
            long r11 = r5.f5688i
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 < 0) goto L96
            goto La2
        L96:
            android.util.Pair r6 = new android.util.Pair
            boolean r5 = r5.f5687h
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6.<init>(r9, r5)
            goto Le1
        La2:
            com.google.android.gms.measurement.internal.d r9 = r5.f5736a
            o7.f r9 = r9.f5716g
            o7.u2<java.lang.Long> r11 = p249o7.C5120v2.f20084b
            long r11 = r9.m11158r(r4, r11)
            long r11 = r11 + r6
            r5.f5688i = r11
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a     // Catch: java.lang.Exception -> Lc4
            android.content.Context r6 = r6.f5710a     // Catch: java.lang.Exception -> Lc4
            y5.a$a r6 = p428y5.C7118a.m14228b(r6)     // Catch: java.lang.Exception -> Lc4
            r5.f5686g = r10     // Catch: java.lang.Exception -> Lc4
            java.lang.String r7 = r6.f27527a     // Catch: java.lang.Exception -> Lc4
            if (r7 == 0) goto Lbf
            r5.f5686g = r7     // Catch: java.lang.Exception -> Lc4
        Lbf:
            boolean r6 = r6.f27528b     // Catch: java.lang.Exception -> Lc4
            r5.f5687h = r6     // Catch: java.lang.Exception -> Lc4
            goto Ld4
        Lc4:
            r6 = move-exception
            com.google.android.gms.measurement.internal.d r7 = r5.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5679m
            java.lang.String r9 = "Unable to get advertising id"
            r7.m11170d(r9, r6)
            r5.f5686g = r10
        Ld4:
            android.util.Pair r6 = new android.util.Pair
            java.lang.String r7 = r5.f5686g
            boolean r5 = r5.f5687h
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6.<init>(r7, r5)
        Le1:
            o7.f r5 = r0.f5716g
            boolean r5 = r5.m11161u()
            if (r5 == 0) goto L1d6
            java.lang.Object r5 = r6.second
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L1d6
            java.lang.Object r5 = r6.first
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto Lff
            goto L1d6
        Lff:
            o7.h5 r5 = r0.m3177w()
            r5.m11315l()
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a
            android.content.Context r5 = r5.f5710a
            java.lang.String r7 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r7)
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5
            if (r5 == 0) goto L119
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L119
            goto L11a
        L119:
            r5 = r3
        L11a:
            if (r5 == 0) goto L1cd
            boolean r5 = r5.isConnected()
            if (r5 == 0) goto L1cd
            com.google.android.gms.measurement.internal.f r5 = r0.m3158A()
            com.google.android.gms.measurement.internal.a r7 = r0.m3172q()
            com.google.android.gms.measurement.internal.d r7 = r7.f5736a
            o7.f r7 = r7.f5716g
            r7.m11157q()
            java.lang.Object r6 = r6.first
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.gms.measurement.internal.c r7 = r0.m3175t()
            o7.p3 r7 = r7.f5697r
            long r11 = r7.m11410a()
            long r11 = r11 + r1
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.common.internal.C1101a.m3100e(r6)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            com.google.android.gms.common.internal.C1101a.m3100e(r4)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r2 = 2
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r13 = 43042(0xa822, double:2.12656E-319)
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r13 = 0
            r7[r13] = r9     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            int r9 = r5.m3226m0()     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r7[r8] = r9     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            java.lang.String r9 = "v%s.%s"
            java.lang.String r7 = java.lang.String.format(r9, r7)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r1[r13] = r7     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r1[r8] = r6     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r1[r2] = r4     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r2 = 3
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r1[r2] = r6     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            java.lang.String r2 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s"
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            com.google.android.gms.measurement.internal.d r2 = r5.f5736a     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            o7.f r2 = r2.f5716g     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            java.lang.String r6 = "debug.deferred.deeplink"
            java.lang.String r2 = r2.m11151k(r6, r10)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            boolean r2 = r4.equals(r2)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            if (r2 == 0) goto L192
            java.lang.String r2 = "&ddl_test=1"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
        L192:
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r2.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L199 java.net.MalformedURLException -> L19b
            r3 = r2
            goto L1ad
        L199:
            r1 = move-exception
            goto L19c
        L19b:
            r1 = move-exception
        L19c:
            com.google.android.gms.measurement.internal.d r2 = r5.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r1 = r1.getMessage()
            java.lang.String r5 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r2.m11170d(r5, r1)
        L1ad:
            if (r3 == 0) goto L1ef
            o7.h5 r1 = r0.m3177w()
            com.google.android.gms.measurement.internal.e r2 = new com.google.android.gms.measurement.internal.e
            r2.<init>(r0, r8)
            r1.mo3183i()
            r1.m11315l()
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.g5 r5 = new o7.g5
            r5.<init>(r1, r4, r3, r2)
            r0.m11175r(r5)
            goto L1ef
        L1cd:
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r1 = "Network is not available for Deferred Deep Link request. Skipping"
            goto L1de
        L1d6:
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r1 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
        L1de:
            r0.m11169c(r1)
            goto L1ef
        L1e2:
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r1 = "Deferred Deep Link already retrieved. Not fetching again."
            r0.m11169c(r1)
        L1ef:
            return
        L1f0:
            o7.d5 r0 = r15.f20009Z
            o7.w6 r0 = r0.f19643n
            com.google.android.gms.measurement.internal.d r6 = r0.f20157a
            o7.f4 r6 = r6.mo3160b()
            r6.mo3183i()
            boolean r6 = r0.m11443b()
            if (r6 != 0) goto L205
            goto L2da
        L205:
            boolean r6 = r0.m11444c()
            java.lang.String r7 = "_cc"
            if (r6 == 0) goto L242
            com.google.android.gms.measurement.internal.d r1 = r0.f20157a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            o7.r3 r1 = r1.f5699t
            r1.m11417b(r3)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "(not set)"
            java.lang.String r3 = "source"
            r1.putString(r3, r2)
            java.lang.String r3 = "medium"
            r1.putString(r3, r2)
            java.lang.String r2 = "_cis"
            java.lang.String r3 = "intent"
            r1.putString(r2, r3)
            r1.putLong(r7, r4)
            com.google.android.gms.measurement.internal.d r2 = r0.f20157a
            o7.d5 r2 = r2.m3176v()
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_cmpx"
            r2.m11133p(r3, r4, r1)
            goto L2cd
        L242:
            com.google.android.gms.measurement.internal.d r4 = r0.f20157a
            com.google.android.gms.measurement.internal.c r4 = r4.m3175t()
            o7.r3 r4 = r4.f5699t
            java.lang.String r4 = r4.m11416a()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L262
            com.google.android.gms.measurement.internal.d r1 = r0.f20157a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5673g
            java.lang.String r2 = "Cache still valid but referrer not found"
            r1.m11169c(r2)
            goto L2c2
        L262:
            com.google.android.gms.measurement.internal.d r5 = r0.f20157a
            com.google.android.gms.measurement.internal.c r5 = r5.m3175t()
            o7.p3 r5 = r5.f5700u
            long r5 = r5.m11410a()
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 / r8
            long r5 = r5 + r1
            long r5 = r5 * r8
            android.net.Uri r1 = android.net.Uri.parse(r4)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r8 = r1.getPath()
            r4.<init>(r8, r2)
            java.util.Set r8 = r1.getQueryParameterNames()
            java.util.Iterator r8 = r8.iterator()
        L28f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L2a3
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r1.getQueryParameter(r9)
            r2.putString(r9, r10)
            goto L28f
        L2a3:
            java.lang.Object r1 = r4.second
            android.os.Bundle r1 = (android.os.Bundle) r1
            r1.putLong(r7, r5)
            java.lang.Object r1 = r4.first
            if (r1 != 0) goto L2b1
            java.lang.String r1 = "app"
            goto L2b3
        L2b1:
            java.lang.String r1 = (java.lang.String) r1
        L2b3:
            com.google.android.gms.measurement.internal.d r2 = r0.f20157a
            o7.d5 r2 = r2.m3176v()
            java.lang.Object r4 = r4.second
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "_cmp"
            r2.m11133p(r1, r5, r4)
        L2c2:
            com.google.android.gms.measurement.internal.d r1 = r0.f20157a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            o7.r3 r1 = r1.f5699t
            r1.m11417b(r3)
        L2cd:
            com.google.android.gms.measurement.internal.d r0 = r0.f20157a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.p3 r0 = r0.f5700u
            r1 = 0
            r0.m11411b(r1)
        L2da:
            return
    }
}

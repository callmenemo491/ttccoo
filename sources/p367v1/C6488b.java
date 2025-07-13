package p367v1;

/* renamed from: v1.b */
/* loaded from: classes.dex */
public class C6488b implements p180k2.InterfaceC3669a, p445z2.InterfaceC7234h, p445z2.InterfaceC7233g, p072e7.InterfaceC1589d6, p124h7.InterfaceC2943x7, ba.InterfaceC0727a, p188ka.InterfaceC4077d, ec.InterfaceC1814b {

    /* renamed from: Y */
    public final /* synthetic */ int f25163Y;

    public C6488b(int r1) {
            r0 = this;
            r0.f25163Y = r1
            r0.<init>()
            return
    }

    /* renamed from: i */
    public static la.C4234b m13177i(org.json.JSONObject r3) {
            java.lang.String r0 = "collect_reports"
            r1 = 1
            boolean r0 = r3.optBoolean(r0, r1)
            java.lang.String r1 = "collect_anrs"
            r2 = 0
            boolean r3 = r3.optBoolean(r1, r2)
            la.b r1 = new la.b
            r1.<init>(r0, r3)
            return r1
    }

    /* renamed from: j */
    public static long m13178j(p214m2.C4339q r4, long r5, org.json.JSONObject r7) {
            java.lang.String r0 = "expires_at"
            boolean r1 = r7.has(r0)
            if (r1 == 0) goto Ld
            long r4 = r7.optLong(r0)
            goto L1a
        Ld:
            java.util.Objects.requireNonNull(r4)
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r2
            long r4 = r5 + r0
        L1a:
            return r4
    }

    /* renamed from: l */
    public static final boolean m13179l() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // p124h7.InterfaceC2943x7
    /* renamed from: a */
    public /* bridge */ /* synthetic */ java.lang.Object mo6634a(java.lang.String r2, java.security.Provider r3) {
            r1 = this;
            int r0 = r1.f25163Y
            switch(r0) {
                case 21: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            if (r3 != 0) goto Ld
            javax.crypto.KeyAgreement r2 = javax.crypto.KeyAgreement.getInstance(r2)
            goto L11
        Ld:
            javax.crypto.KeyAgreement r2 = javax.crypto.KeyAgreement.getInstance(r2, r3)
        L11:
            return r2
        L12:
            if (r3 != 0) goto L19
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)
            goto L1d
        L19:
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2, r3)
        L1d:
            return r2
    }

    @Override // p188ka.InterfaceC4077d
    /* renamed from: b */
    public la.C4236d mo9173b(p214m2.C4339q r18, org.json.JSONObject r19) {
            r17 = this;
            r0 = r19
            java.lang.String r1 = "settings_version"
            r2 = 0
            int r9 = r0.optInt(r1, r2)
            java.lang.String r1 = "cache_duration"
            r3 = 3600(0xe10, float:5.045E-42)
            int r10 = r0.optInt(r1, r3)
            java.lang.String r1 = "app"
            org.json.JSONObject r1 = r0.getJSONObject(r1)
            java.lang.String r3 = "status"
            java.lang.String r12 = r1.getString(r3)
            java.lang.String r3 = "url"
            java.lang.String r13 = r1.getString(r3)
            java.lang.String r3 = "reports_url"
            java.lang.String r14 = r1.getString(r3)
            java.lang.String r3 = "ndk_reports_url"
            java.lang.String r15 = r1.getString(r3)
            java.lang.String r3 = "update_required"
            boolean r16 = r1.optBoolean(r3, r2)
            la.a r6 = new la.a
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.String r1 = "session"
            org.json.JSONObject r1 = r0.getJSONObject(r1)
            java.lang.String r2 = "max_custom_exception_events"
            r3 = 8
            int r1 = r1.optInt(r2, r3)
            n0.k r7 = new n0.k
            r2 = 4
            r7.<init>(r1, r2)
            java.lang.String r1 = "features"
            org.json.JSONObject r1 = r0.getJSONObject(r1)
            la.b r8 = m13177i(r1)
            long r1 = (long) r10
            r3 = r18
            long r4 = m13178j(r3, r1, r0)
            la.d r0 = new la.d
            r3 = r0
            r3.<init>(r4, r6, r7, r8, r9, r10)
            return r0
    }

    @Override // p445z2.InterfaceC7234h
    /* renamed from: c */
    public void mo13180c(p445z2.InterfaceC7235i r1) {
            r0 = this;
            return
    }

    @Override // p180k2.InterfaceC3669a
    /* renamed from: d */
    public boolean mo814d(java.lang.Object r1, java.io.File r2, p180k2.C3673e r3) {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            p106g3.C2229a.m5828b(r1, r2)     // Catch: java.io.IOException -> L7
            r1 = 1
            goto L17
        L7:
            r1 = move-exception
            r2 = 3
            java.lang.String r3 = "ByteBufferEncoder"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L16
            java.lang.String r2 = "Failed to write data"
            android.util.Log.d(r3, r2, r1)
        L16:
            r1 = 0
        L17:
            return r1
    }

    @Override // ba.InterfaceC0727a
    /* renamed from: e */
    public void mo2333e(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            r2 = 3
            java.lang.String r3 = "FirebaseCrashlytics"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 == 0) goto L14
            r2 = 0
            java.lang.String r0 = "Skipping logging Crashlytics event to Firebase, no Firebase Analytics"
            android.util.Log.d(r3, r0, r2)
        L14:
            return
    }

    @Override // ec.InterfaceC1814b
    /* renamed from: f */
    public void mo4569f(ec.C1815c r8) {
            r7 = this;
            r0 = 0
            java.lang.StringBuilder r1 = p367v1.C6487a.m13176a(r0)
        L5:
            boolean r2 = r8.m4573d()
            r3 = 1
            if (r2 == 0) goto L23
            char r2 = r8.m4571b()
            r1.append(r2)
            int r2 = r8.f7929f
            int r2 = r2 + r3
            r8.f7929f = r2
            java.lang.String r4 = r8.f7924a
            r5 = 5
            int r2 = p185k7.C3828h5.m8572A(r4, r2, r5)
            if (r2 == r5) goto L5
            r8.f7930g = r2
        L23:
            int r2 = r1.length()
            int r2 = r2 - r3
            int r4 = r8.m4570a()
            int r4 = r4 + r2
            int r4 = r4 + r3
            r8.m4575f(r4)
            ec.e r5 = r8.f7931h
            int r5 = r5.f7939b
            int r5 = r5 - r4
            if (r5 <= 0) goto L3a
            r4 = 1
            goto L3b
        L3a:
            r4 = 0
        L3b:
            boolean r5 = r8.m4573d()
            if (r5 != 0) goto L43
            if (r4 == 0) goto L5d
        L43:
            r4 = 249(0xf9, float:3.49E-43)
            if (r2 > r4) goto L4c
            char r2 = (char) r2
            r1.setCharAt(r0, r2)
            goto L5d
        L4c:
            r5 = 1555(0x613, float:2.179E-42)
            if (r2 > r5) goto L82
            int r5 = r2 / 250
            int r5 = r5 + r4
            char r4 = (char) r5
            r1.setCharAt(r0, r4)
            int r2 = r2 % 250
            char r2 = (char) r2
            r1.insert(r3, r2)
        L5d:
            int r2 = r1.length()
        L61:
            if (r0 >= r2) goto L81
            char r4 = r1.charAt(r0)
            int r5 = r8.m4570a()
            int r5 = r5 + r3
            int r5 = r5 * 149
            r6 = 255(0xff, float:3.57E-43)
            int r5 = r5 % r6
            int r5 = r5 + r3
            int r5 = r5 + r4
            if (r5 > r6) goto L76
            goto L78
        L76:
            int r5 = r5 + (-256)
        L78:
            char r4 = (char) r5
            java.lang.StringBuilder r5 = r8.f7928e
            r5.append(r4)
            int r0 = r0 + 1
            goto L61
        L81:
            return
        L82:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Message length not in valid ranges: "
            java.lang.String r0 = p422y.C7094d.m14209a(r0, r2)
            r8.<init>(r0)
            throw r8
    }

    @Override // p445z2.InterfaceC7233g
    /* renamed from: g */
    public void mo9716g(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // p445z2.InterfaceC7234h
    /* renamed from: h */
    public void mo13181h(p445z2.InterfaceC7235i r1) {
            r0 = this;
            r1.mo2575l()
            return
    }

    /* renamed from: k */
    public float m13182k(p267p3.InterfaceC5351e r5, p245o3.InterfaceC4890c r6) {
            r4 = this;
            float r0 = r6.getYChartMax()
            float r1 = r6.getYChartMin()
            l3.g r6 = r6.getLineData()
            float r2 = r5.mo9260j()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1e
            float r2 = r5.mo9254A()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L1e
            goto L37
        L1e:
            float r2 = r6.f17270a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L25
            r0 = 0
        L25:
            float r6 = r6.f17271b
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto L2c
            r1 = 0
        L2c:
            float r5 = r5.mo9254A()
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L36
            r3 = r1
            goto L37
        L36:
            r3 = r0
        L37:
            return r3
    }
}

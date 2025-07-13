package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes.dex */
public final class C1110a extends p249o7.AbstractC5097s3 {

    /* renamed from: c */
    public java.lang.String f5658c;

    /* renamed from: d */
    public java.lang.String f5659d;

    /* renamed from: e */
    public int f5660e;

    /* renamed from: f */
    public java.lang.String f5661f;

    /* renamed from: g */
    public long f5662g;

    /* renamed from: h */
    public final long f5663h;

    /* renamed from: i */
    public java.util.List<java.lang.String> f5664i;

    /* renamed from: j */
    public int f5665j;

    /* renamed from: k */
    public java.lang.String f5666k;

    /* renamed from: l */
    public java.lang.String f5667l;

    /* renamed from: m */
    public java.lang.String f5668m;

    public C1110a(com.google.android.gms.measurement.internal.C1113d r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f5663h = r2
            return
    }

    @Override // p249o7.AbstractC5097s3
    /* renamed from: l */
    public final boolean mo3130l() {
            r1 = this;
            r0 = 1
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* renamed from: m */
    public final void m3131m() {
            r13 = this;
            com.google.android.gms.measurement.internal.d r0 = r13.f5736a
            android.content.Context r0 = r0.f5710a
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.d r1 = r13.f5736a
            android.content.Context r1 = r1.f5710a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "unknown"
            java.lang.String r3 = "Unknown"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            java.lang.String r6 = ""
            if (r1 != 0) goto L2d
            com.google.android.gms.measurement.internal.d r7 = r13.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5672f
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1111b.m3134u(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.m11170d(r9, r8)
            goto L8c
        L2d:
            java.lang.String r2 = r1.getInstallerPackageName(r0)     // Catch: java.lang.IllegalArgumentException -> L32
            goto L43
        L32:
            com.google.android.gms.measurement.internal.d r7 = r13.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5672f
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1111b.m3134u(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.m11170d(r9, r8)
        L43:
            if (r2 != 0) goto L48
            java.lang.String r2 = "manual_install"
            goto L51
        L48:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L51
            r2 = r6
        L51:
            com.google.android.gms.measurement.internal.d r7 = r13.f5736a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            android.content.Context r7 = r7.f5710a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            if (r7 == 0) goto L8c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            if (r9 != 0) goto L70
            java.lang.String r8 = r8.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            goto L71
        L70:
            r8 = r3
        L71:
            java.lang.String r3 = r7.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            int r4 = r7.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            goto L8c
        L76:
            r7 = r3
            r3 = r8
            goto L7a
        L79:
            r7 = r3
        L7a:
            com.google.android.gms.measurement.internal.d r8 = r13.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            o7.f3 r8 = r8.f5672f
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1111b.m3134u(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.m11171e(r10, r9, r3)
            r3 = r7
        L8c:
            r13.f5658c = r0
            r13.f5661f = r2
            r13.f5659d = r3
            r13.f5660e = r4
            r2 = 0
            r13.f5662g = r2
            com.google.android.gms.measurement.internal.d r2 = r13.f5736a
            java.lang.String r2 = r2.f5711b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto Lb1
            com.google.android.gms.measurement.internal.d r2 = r13.f5736a
            java.lang.String r2 = r2.f5712c
            java.lang.String r4 = "am"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lb1
            r2 = 1
            goto Lb2
        Lb1:
            r2 = 0
        Lb2:
            com.google.android.gms.measurement.internal.d r4 = r13.f5736a
            int r4 = r4.m3168m()
            com.google.android.gms.measurement.internal.d r7 = r13.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            switch(r4) {
                case 0: goto Le5;
                case 1: goto Le0;
                case 2: goto Ldb;
                case 3: goto Ld6;
                case 4: goto Ld1;
                case 5: goto Lcc;
                case 6: goto Lc7;
                case 7: goto Lc2;
                default: goto Lc1;
            }
        Lc1:
            goto Led
        Lc2:
            o7.f3 r7 = r7.f5678l
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto Le9
        Lc7:
            o7.f3 r7 = r7.f5677k
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto Le9
        Lcc:
            o7.f3 r7 = r7.f5680n
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto Le9
        Ld1:
            o7.f3 r7 = r7.f5678l
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto Le9
        Ld6:
            o7.f3 r7 = r7.f5678l
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto Le9
        Ldb:
            o7.f3 r7 = r7.f5680n
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto Le9
        Le0:
            o7.f3 r7 = r7.f5678l
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto Le9
        Le5:
            o7.f3 r7 = r7.f5680n
            java.lang.String r8 = "App measurement collection enabled"
        Le9:
            r7.m11169c(r8)
            goto Lf2
        Led:
            o7.f3 r7 = r7.f5678l
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            goto Le9
        Lf2:
            r13.f5666k = r6
            r13.f5667l = r6
            r13.f5668m = r6
            com.google.android.gms.measurement.internal.d r7 = r13.f5736a
            java.util.Objects.requireNonNull(r7)
            if (r2 == 0) goto L105
            com.google.android.gms.measurement.internal.d r2 = r13.f5736a
            java.lang.String r2 = r2.f5711b
            r13.f5667l = r2
        L105:
            r2 = 0
            com.google.android.gms.measurement.internal.d r7 = r13.f5736a     // Catch: java.lang.IllegalStateException -> L1ac
            android.content.Context r8 = r7.f5710a     // Catch: java.lang.IllegalStateException -> L1ac
            java.lang.String r7 = r7.f5728s     // Catch: java.lang.IllegalStateException -> L1ac
            java.lang.String r9 = "google_app_id"
            java.lang.String r7 = p185k7.C3836i.m8635t(r8, r9, r7)     // Catch: java.lang.IllegalStateException -> L1ac
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.IllegalStateException -> L1ac
            if (r3 == r8) goto L11a
            r8 = r7
            goto L11b
        L11a:
            r8 = r6
        L11b:
            r13.f5666k = r8     // Catch: java.lang.IllegalStateException -> L1ac
            p185k7.C3847ia.m8706c()     // Catch: java.lang.IllegalStateException -> L1ac
            com.google.android.gms.measurement.internal.d r8 = r13.f5736a     // Catch: java.lang.IllegalStateException -> L1ac
            o7.f r8 = r8.f5716g     // Catch: java.lang.IllegalStateException -> L1ac
            o7.u2<java.lang.Boolean> r9 = p249o7.C5120v2.f20089d0     // Catch: java.lang.IllegalStateException -> L1ac
            boolean r8 = r8.m11162v(r2, r9)     // Catch: java.lang.IllegalStateException -> L1ac
            java.lang.String r9 = "admob_app_id"
            java.lang.String r10 = "null reference"
            if (r8 == 0) goto L16a
            com.google.android.gms.measurement.internal.d r8 = r13.f5736a     // Catch: java.lang.IllegalStateException -> L1ac
            android.content.Context r11 = r8.f5710a     // Catch: java.lang.IllegalStateException -> L1ac
            java.lang.String r8 = r8.f5728s     // Catch: java.lang.IllegalStateException -> L1ac
            java.util.Objects.requireNonNull(r11, r10)     // Catch: java.lang.IllegalStateException -> L1ac
            android.content.res.Resources r10 = r11.getResources()     // Catch: java.lang.IllegalStateException -> L1ac
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.IllegalStateException -> L1ac
            if (r12 != 0) goto L144
            goto L148
        L144:
            java.lang.String r8 = p249o7.C4962b4.m11110a(r11)     // Catch: java.lang.IllegalStateException -> L1ac
        L148:
            java.lang.String r11 = "ga_app_id"
            java.lang.String r11 = p249o7.C4962b4.m11111b(r11, r10, r8)     // Catch: java.lang.IllegalStateException -> L1ac
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.IllegalStateException -> L1ac
            if (r3 == r12) goto L155
            r6 = r11
        L155:
            r13.f5668m = r6     // Catch: java.lang.IllegalStateException -> L1ac
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.IllegalStateException -> L1ac
            if (r3 == 0) goto L163
            boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.IllegalStateException -> L1ac
            if (r3 != 0) goto L18d
        L163:
            java.lang.String r3 = p249o7.C4962b4.m11111b(r9, r10, r8)     // Catch: java.lang.IllegalStateException -> L1ac
        L167:
            r13.f5667l = r3     // Catch: java.lang.IllegalStateException -> L1ac
            goto L18d
        L16a:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.IllegalStateException -> L1ac
            if (r3 != 0) goto L18d
            com.google.android.gms.measurement.internal.d r3 = r13.f5736a     // Catch: java.lang.IllegalStateException -> L1ac
            android.content.Context r6 = r3.f5710a     // Catch: java.lang.IllegalStateException -> L1ac
            java.lang.String r3 = r3.f5728s     // Catch: java.lang.IllegalStateException -> L1ac
            java.util.Objects.requireNonNull(r6, r10)     // Catch: java.lang.IllegalStateException -> L1ac
            android.content.res.Resources r7 = r6.getResources()     // Catch: java.lang.IllegalStateException -> L1ac
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.IllegalStateException -> L1ac
            if (r8 != 0) goto L184
            goto L188
        L184:
            java.lang.String r3 = p249o7.C4962b4.m11110a(r6)     // Catch: java.lang.IllegalStateException -> L1ac
        L188:
            java.lang.String r3 = p249o7.C4962b4.m11111b(r9, r7, r3)     // Catch: java.lang.IllegalStateException -> L1ac
            goto L167
        L18d:
            if (r4 != 0) goto L1be
            com.google.android.gms.measurement.internal.d r3 = r13.f5736a     // Catch: java.lang.IllegalStateException -> L1ac
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.lang.IllegalStateException -> L1ac
            o7.f3 r3 = r3.f5680n     // Catch: java.lang.IllegalStateException -> L1ac
            java.lang.String r4 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r13.f5658c     // Catch: java.lang.IllegalStateException -> L1ac
            java.lang.String r7 = r13.f5666k     // Catch: java.lang.IllegalStateException -> L1ac
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.IllegalStateException -> L1ac
            if (r7 == 0) goto L1a6
            java.lang.String r7 = r13.f5667l     // Catch: java.lang.IllegalStateException -> L1ac
            goto L1a8
        L1a6:
            java.lang.String r7 = r13.f5666k     // Catch: java.lang.IllegalStateException -> L1ac
        L1a8:
            r3.m11171e(r4, r6, r7)     // Catch: java.lang.IllegalStateException -> L1ac
            goto L1be
        L1ac:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r4 = r13.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5672f
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C1111b.m3134u(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r4.m11171e(r6, r0, r3)
        L1be:
            r13.f5664i = r2
            com.google.android.gms.measurement.internal.d r0 = r13.f5736a
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.measurement.internal.d r0 = r13.f5736a
            o7.f r0 = r0.f5716g
            java.util.Objects.requireNonNull(r0)
            java.lang.String r3 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            android.os.Bundle r4 = r0.m11159s()
            if (r4 != 0) goto L1e5
            com.google.android.gms.measurement.internal.d r3 = r0.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5672f
            java.lang.String r4 = "Failed to load metadata: Metadata bundle is null"
            r3.m11169c(r4)
            goto L1eb
        L1e5:
            boolean r6 = r4.containsKey(r3)
            if (r6 != 0) goto L1ed
        L1eb:
            r3 = r2
            goto L1f5
        L1ed:
            int r3 = r4.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L1f5:
            if (r3 == 0) goto L21d
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a     // Catch: android.content.res.Resources.NotFoundException -> L20f
            android.content.Context r4 = r4.f5710a     // Catch: android.content.res.Resources.NotFoundException -> L20f
            android.content.res.Resources r4 = r4.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L20f
            int r3 = r3.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L20f
            java.lang.String[] r3 = r4.getStringArray(r3)     // Catch: android.content.res.Resources.NotFoundException -> L20f
            if (r3 != 0) goto L20a
            goto L21d
        L20a:
            java.util.List r2 = java.util.Arrays.asList(r3)     // Catch: android.content.res.Resources.NotFoundException -> L20f
            goto L21d
        L20f:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r4 = "Failed to load string array from metadata: resource not found"
            r0.m11170d(r4, r3)
        L21d:
            if (r2 != 0) goto L220
            goto L253
        L220:
            int r0 = r2.size()
            if (r0 != 0) goto L234
            com.google.android.gms.measurement.internal.d r0 = r13.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5677k
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.m11169c(r2)
            goto L255
        L234:
            java.util.Iterator r0 = r2.iterator()
        L238:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L253
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.d r4 = r13.f5736a
            com.google.android.gms.measurement.internal.f r4 = r4.m3158A()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.m3211P(r6, r3)
            if (r3 != 0) goto L238
            goto L255
        L253:
            r13.f5664i = r2
        L255:
            if (r1 == 0) goto L262
            com.google.android.gms.measurement.internal.d r0 = r13.f5736a
            android.content.Context r0 = r0.f5710a
            boolean r0 = p388w6.C6814a.m13883a(r0)
            r13.f5665j = r0
            return
        L262:
            r13.f5665j = r5
            return
    }

    /* renamed from: n */
    public final java.lang.String m3132n() {
            r2 = this;
            r2.m11419j()
            java.lang.String r0 = r2.f5658c
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String r0 = r2.f5658c
            return r0
    }

    /* renamed from: o */
    public final java.lang.String m3133o() {
            r3 = this;
            p185k7.C3991t9.m9017c()
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            o7.f r0 = r0.f5716g
            r1 = 0
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20117r0
            boolean r0 = r0.m11162v(r1, r2)
            if (r0 == 0) goto L13
            r3.mo3183i()
        L13:
            r3.m11419j()
            java.lang.String r0 = r3.f5666k
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String r0 = r3.f5666k
            return r0
    }
}

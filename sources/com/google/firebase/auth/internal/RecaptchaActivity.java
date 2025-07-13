package com.google.firebase.auth.internal;

/* loaded from: classes.dex */
public class RecaptchaActivity extends androidx.fragment.app.ActivityC0405s implements p124h7.InterfaceC2750mc {

    /* renamed from: l0 */
    public static final java.util.concurrent.ExecutorService f6599l0 = null;

    /* renamed from: m0 */
    public static long f6600m0;

    /* renamed from: n0 */
    public static final p411x9.C7003v f6601n0 = null;

    /* renamed from: k0 */
    public boolean f6602k0;

    static {
            h7.e1 r0 = p124h7.C2779o5.f11798a
            r1 = 2
            java.util.concurrent.ExecutorService r0 = r0.m6635b(r1)
            com.google.firebase.auth.internal.RecaptchaActivity.f6599l0 = r0
            r0 = 0
            com.google.firebase.auth.internal.RecaptchaActivity.f6600m0 = r0
            x9.v r0 = p411x9.C7003v.f27299b
            com.google.firebase.auth.internal.RecaptchaActivity.f6601n0 = r0
            return
    }

    public RecaptchaActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6602k0 = r0
            return
    }

    @Override // p124h7.InterfaceC2750mc
    /* renamed from: a */
    public final android.content.Context mo3637a() {
            r1 = this;
            android.content.Context r0 = r1.getApplicationContext()
            return r0
    }

    @Override // p124h7.InterfaceC2750mc
    /* renamed from: d */
    public final android.net.Uri.Builder mo3638d(android.content.Intent r12, java.lang.String r13, java.lang.String r14) {
            r11 = this;
            java.lang.String r0 = "com.google.firebase.auth.KEY_API_KEY"
            java.lang.String r0 = r12.getStringExtra(r0)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "com.google.firebase.auth.internal.CLIENT_VERSION"
            java.lang.String r2 = r12.getStringExtra(r2)
            java.lang.String r3 = "com.google.firebase.auth.internal.FIREBASE_APP_NAME"
            java.lang.String r12 = r12.getStringExtra(r3)
            o9.d r3 = p251o9.C5180d.m11495d(r12)
            com.google.firebase.auth.FirebaseAuth r4 = com.google.firebase.auth.FirebaseAuth.getInstance(r3)
            x9.x r5 = p411x9.C7005x.f27301a
            android.content.Context r6 = r11.getApplicationContext()
            monitor-enter(r5)
            com.google.android.gms.common.internal.C1101a.m3100e(r13)     // Catch: java.lang.Throwable -> L111
            com.google.android.gms.common.internal.C1101a.m3100e(r1)     // Catch: java.lang.Throwable -> L111
            android.content.SharedPreferences r6 = p411x9.C7005x.m14152b(r6, r13)     // Catch: java.lang.Throwable -> L111
            p411x9.C7005x.m14151a(r6)     // Catch: java.lang.Throwable -> L111
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L111
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L111
            r9 = 0
            r8[r9] = r1     // Catch: java.lang.Throwable -> L111
            java.lang.String r10 = "com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION"
            java.lang.String r8 = java.lang.String.format(r10, r8)     // Catch: java.lang.Throwable -> L111
            java.lang.String r10 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            r6.putString(r8, r10)     // Catch: java.lang.Throwable -> L111
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L111
            r7[r9] = r1     // Catch: java.lang.Throwable -> L111
            java.lang.String r8 = "com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME"
            java.lang.String r7 = java.lang.String.format(r8, r7)     // Catch: java.lang.Throwable -> L111
            r6.putString(r7, r12)     // Catch: java.lang.Throwable -> L111
            r6.apply()     // Catch: java.lang.Throwable -> L111
            monitor-exit(r5)
            android.content.Context r5 = r11.getApplicationContext()
            java.lang.String r3 = r3.m11498e()
            androidx.appcompat.widget.x r3 = androidx.appcompat.widget.C0311x.m809q(r5, r3)
            java.lang.String r3 = r3.m831x()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            r6 = 0
            if (r5 == 0) goto L84
            java.lang.String r12 = "RecaptchaActivity"
            java.lang.String r13 = "Could not generate an encryption key for reCAPTCHA - cancelling flow."
            android.util.Log.e(r12, r13)
            java.lang.String r12 = "Failed to generate/retrieve public encryption key for reCAPTCHA flow."
            com.google.android.gms.common.api.Status r12 = p074e9.C1805a.m4514B(r12)
            r11.m3647x(r12)
            return r6
        L84:
            java.lang.Object r7 = r4.f6585g
            monitor-enter(r7)
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L10e
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L96
            java.lang.Object r4 = r4.f6585g
            monitor-enter(r4)
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L93
            goto L9a
        L93:
            r12 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L93
            throw r12
        L96:
            java.lang.String r6 = p052d6.C1310h0.m3801c()
        L9a:
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            java.lang.String r5 = "https"
            android.net.Uri$Builder r4 = r4.scheme(r5)
            java.lang.String r5 = "__"
            android.net.Uri$Builder r4 = r4.appendPath(r5)
            java.lang.String r5 = "auth"
            android.net.Uri$Builder r4 = r4.appendPath(r5)
            java.lang.String r5 = "handler"
            android.net.Uri$Builder r4 = r4.appendPath(r5)
            java.lang.String r5 = "apiKey"
            android.net.Uri$Builder r0 = r4.appendQueryParameter(r5, r0)
            java.lang.String r4 = "authType"
            java.lang.String r5 = "verifyApp"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r4, r5)
            java.lang.String r4 = "apn"
            android.net.Uri$Builder r13 = r0.appendQueryParameter(r4, r13)
            java.lang.String r0 = "hl"
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r0, r6)
            java.lang.String r0 = "eventId"
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "X"
            int r2 = r0.length()
            if (r2 == 0) goto Le8
            java.lang.String r0 = r1.concat(r0)
            goto Led
        Le8:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        Led:
            java.lang.String r1 = "v"
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r1, r0)
            java.lang.String r0 = "eid"
            java.lang.String r1 = "p"
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r0, r1)
            java.lang.String r0 = "appName"
            android.net.Uri$Builder r12 = r13.appendQueryParameter(r0, r12)
            java.lang.String r13 = "sha1Cert"
            android.net.Uri$Builder r12 = r12.appendQueryParameter(r13, r14)
            java.lang.String r13 = "publicKey"
            android.net.Uri$Builder r12 = r12.appendQueryParameter(r13, r3)
            return r12
        L10e:
            r12 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L10e
            throw r12
        L111:
            r12 = move-exception
            monitor-exit(r5)
            throw r12
    }

    @Override // p124h7.InterfaceC2750mc
    /* renamed from: g */
    public final java.lang.String mo3639g(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = p124h7.C2877td.m7173a(r1)
            return r1
    }

    @Override // p124h7.InterfaceC2750mc
    /* renamed from: j */
    public final java.net.HttpURLConnection mo3640j(java.net.URL r4) {
            r3 = this;
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.io.IOException -> L7
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.io.IOException -> L7
            return r4
        L7:
            r6.a r4 = p124h7.InterfaceC2750mc.f11770E
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r4.f22479a
            java.lang.String r2 = "Error generating connection"
            java.lang.String r4 = r4.m12162c(r2, r0)
            android.util.Log.e(r1, r4)
            r4 = 0
            return r4
    }

    @Override // p124h7.InterfaceC2750mc
    /* renamed from: k */
    public final void mo3641k(android.net.Uri r9, java.lang.String r10) {
            r8 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            r3 = 0
            android.content.pm.ResolveInfo r0 = r2.resolveActivity(r0, r3)
            if (r0 == 0) goto L9b
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.support.customtabs.action.CustomTabsService"
            r2.<init>(r4)
            java.util.List r0 = r0.queryIntentServices(r2, r3)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L87
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L87
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r1)
            p.a r0 = new p.a
            r0.<init>()
            r1 = 1
            java.lang.String r5 = "android.support.customtabs.extra.SESSION"
            boolean r6 = r10.hasExtra(r5)
            r7 = 0
            if (r6 != 0) goto L4c
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r6.putBinder(r5, r7)
            r10.putExtras(r6)
        L4c:
            java.lang.String r5 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
            r10.putExtra(r5, r1)
            java.lang.Integer r0 = r0.f21229a
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            if (r0 == 0) goto L63
            int r0 = r0.intValue()
            java.lang.String r5 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            r1.putInt(r5, r0)
        L63:
            r10.putExtras(r1)
            java.lang.String r0 = "androidx.browser.customtabs.extra.SHARE_STATE"
            r10.putExtra(r0, r3)
            p.b r0 = new p.b
            r0.<init>(r10, r7)
            android.content.Intent r10 = r0.f21230a
            r10.addFlags(r4)
            android.content.Intent r10 = r0.f21230a
            r10.addFlags(r2)
            android.content.Intent r10 = r0.f21230a
            r10.setData(r9)
            android.content.Intent r9 = r0.f21230a
            java.lang.Object r10 = p046d0.C1259a.f6733a
            p046d0.C1259a.a.m3708b(r8, r9, r7)
            return
        L87:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r9)
            java.lang.String r9 = "com.android.browser.application_id"
            r0.putExtra(r9, r10)
            r0.addFlags(r4)
            r0.addFlags(r2)
            r8.startActivity(r0)
            return
        L9b:
            java.lang.String r9 = "RecaptchaActivity"
            java.lang.String r10 = "Device cannot resolve intent for: android.intent.action.VIEW"
            android.util.Log.e(r9, r10)
            r8.m3646w()
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, androidx.activity.ComponentActivity, p030c0.ActivityC0820g, android.app.Activity
    public final void onCreate(android.os.Bundle r9) {
            r8 = this;
            super.onCreate(r9)
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r0 = r0.getAction()
            java.lang.String r1 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "RecaptchaActivity"
            if (r1 != 0) goto L3a
            java.lang.String r1 = "android.intent.action.VIEW"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3a
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Could not do operation - unknown action: "
            int r1 = r9.length()
            if (r1 == 0) goto L2e
            java.lang.String r9 = r0.concat(r9)
            goto L33
        L2e:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r0)
        L33:
            android.util.Log.e(r2, r9)
            r8.m3646w()
            return
        L3a:
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = com.google.firebase.auth.internal.RecaptchaActivity.f6600m0
            long r3 = r0 - r3
            r5 = 30000(0x7530, double:1.4822E-319)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4e
            java.lang.String r9 = "Could not start operation - already in progress"
            android.util.Log.e(r2, r9)
            return
        L4e:
            com.google.firebase.auth.internal.RecaptchaActivity.f6600m0 = r0
            if (r9 == 0) goto L5a
            java.lang.String r0 = "com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW"
            boolean r9 = r9.getBoolean(r0)
            r8.f6602k0 = r9
        L5a:
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity
    public final void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            r0.setIntent(r1)
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity
    public final void onResume() {
            r11 = this;
            super.onResume()
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r1 = r1.getAction()
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L123
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r4 = "firebaseError"
            boolean r4 = r0.hasExtra(r4)
            if (r4 == 0) goto L30
            java.lang.String r1 = "firebaseError"
            java.lang.String r0 = r0.getStringExtra(r1)
            com.google.android.gms.common.api.Status r0 = p411x9.C7002u.m14148a(r0)
            r11.m3647x(r0)
            return
        L30:
            java.lang.String r4 = "link"
            boolean r4 = r0.hasExtra(r4)
            if (r4 == 0) goto L11f
            java.lang.String r4 = "eventId"
            boolean r4 = r0.hasExtra(r4)
            if (r4 == 0) goto L11f
            java.lang.String r4 = "link"
            java.lang.String r4 = r0.getStringExtra(r4)
            x9.x r5 = p411x9.C7005x.f27301a
            android.content.Context r6 = r11.getApplicationContext()
            java.lang.String r7 = r11.getPackageName()
            java.lang.String r8 = "eventId"
            java.lang.String r8 = r0.getStringExtra(r8)
            monitor-enter(r5)
            com.google.android.gms.common.internal.C1101a.m3100e(r7)     // Catch: java.lang.Throwable -> L11c
            com.google.android.gms.common.internal.C1101a.m3100e(r8)     // Catch: java.lang.Throwable -> L11c
            android.content.SharedPreferences r6 = p411x9.C7005x.m14152b(r6, r7)     // Catch: java.lang.Throwable -> L11c
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L11c
            r7[r3] = r8     // Catch: java.lang.Throwable -> L11c
            java.lang.String r9 = "com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION"
            java.lang.String r7 = java.lang.String.format(r9, r7)     // Catch: java.lang.Throwable -> L11c
            java.lang.String r9 = r6.getString(r7, r1)     // Catch: java.lang.Throwable -> L11c
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L11c
            r10[r3] = r8     // Catch: java.lang.Throwable -> L11c
            java.lang.String r8 = "com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME"
            java.lang.String r8 = java.lang.String.format(r8, r10)     // Catch: java.lang.Throwable -> L11c
            java.lang.String r10 = r6.getString(r8, r1)     // Catch: java.lang.Throwable -> L11c
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L11c
            r6.remove(r7)     // Catch: java.lang.Throwable -> L11c
            r6.remove(r8)     // Catch: java.lang.Throwable -> L11c
            r6.apply()     // Catch: java.lang.Throwable -> L11c
            boolean r6 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L11c
            monitor-exit(r5)
            if (r6 == 0) goto L92
            goto L93
        L92:
            r1 = r10
        L93:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto La9
            java.lang.String r5 = "RecaptchaActivity"
            java.lang.String r6 = "Failed to find registration for this event - failing to prevent session injection."
            android.util.Log.e(r5, r6)
            java.lang.String r5 = "Failed to find registration for this reCAPTCHA event"
            com.google.android.gms.common.api.Status r5 = p074e9.C1805a.m4514B(r5)
            r11.m3647x(r5)
        La9:
            java.lang.String r5 = "encryptionEnabled"
            boolean r0 = r0.getBooleanExtra(r5, r2)
            if (r0 == 0) goto Lc5
            android.content.Context r0 = r11.getApplicationContext()
            o9.d r1 = p251o9.C5180d.m11495d(r1)
            java.lang.String r1 = r1.m11498e()
            androidx.appcompat.widget.x r0 = androidx.appcompat.widget.C0311x.m809q(r0, r1)
            java.lang.String r4 = r0.m828t(r4)
        Lc5:
            android.net.Uri r0 = android.net.Uri.parse(r4)
            java.lang.String r1 = "recaptchaToken"
            java.lang.String r0 = r0.getQueryParameter(r1)
            r1 = 0
            com.google.firebase.auth.internal.RecaptchaActivity.f6600m0 = r1
            r11.f6602k0 = r3
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.google.firebase.auth.internal.RECAPTCHA_TOKEN"
            r1.putExtra(r2, r0)
            java.lang.String r2 = "com.google.firebase.auth.internal.OPERATION"
            java.lang.String r4 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            r1.putExtra(r2, r4)
            java.lang.String r2 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            r1.setAction(r2)
            b1.a r2 = p018b1.C0654a.m2198a(r11)
            r2.m2199b(r1)
            android.content.Context r1 = r11.getApplicationContext()
            java.lang.String r2 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "recaptchaToken"
            r1.putString(r2, r0)
            java.lang.String r0 = "operation"
            java.lang.String r2 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            r1.putString(r0, r2)
            java.lang.String r0 = "timestamp"
            long r2 = java.lang.System.currentTimeMillis()
            r1.putLong(r0, r2)
            r1.commit()
            r11.finish()
            return
        L11c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L11f:
            r11.m3646w()
            return
        L123:
            boolean r0 = r11.f6602k0
            if (r0 != 0) goto L182
            java.lang.String r0 = r11.getPackageName()
            byte[] r4 = p353u6.C6338a.m12988a(r11, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14a
            java.lang.String r4 = p353u6.C6343f.m12993a(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14a
            java.util.Locale r5 = java.util.Locale.US     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14a
            java.lang.String r1 = r4.toLowerCase(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14a
            h7.lc r4 = new h7.lc
            android.content.Intent r5 = r11.getIntent()
            r4.<init>(r0, r1, r5, r11)
            java.util.concurrent.ExecutorService r0 = com.google.firebase.auth.internal.RecaptchaActivity.f6599l0
            java.lang.Void[] r1 = new java.lang.Void[r3]
            r4.executeOnExecutor(r0, r1)
            goto L17f
        L14a:
            r3 = move-exception
            java.lang.String r4 = "RecaptchaActivity"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            int r6 = r3.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 34
            int r5 = r5 + r6
            r7.<init>(r5)
            java.lang.String r5 = "Could not get package signature: "
            r7.append(r5)
            r7.append(r0)
            java.lang.String r5 = " "
            r7.append(r5)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            android.util.Log.e(r4, r3)
            r11.mo3642p(r0, r1)
        L17f:
            r11.f6602k0 = r2
            return
        L182:
            r11.m3646w()
            return
    }

    @Override // androidx.activity.ComponentActivity, p030c0.ActivityC0820g, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            boolean r0 = r2.f6602k0
            java.lang.String r1 = "com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW"
            r3.putBoolean(r1, r0)
            return
    }

    @Override // p124h7.InterfaceC2750mc
    /* renamed from: p */
    public final void mo3642p(java.lang.String r1, com.google.android.gms.common.api.Status r2) {
            r0 = this;
            if (r2 != 0) goto L6
            r0.m3646w()
            return
        L6:
            r0.m3647x(r2)
            return
    }

    /* renamed from: w */
    public final void m3646w() {
            r3 = this;
            r0 = 0
            com.google.firebase.auth.internal.RecaptchaActivity.f6600m0 = r0
            r0 = 0
            r3.f6602k0 = r0
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.google.firebase.auth.internal.EXTRA_CANCELED"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            r0.setAction(r1)
            b1.a r1 = p018b1.C0654a.m2198a(r3)
            r1.m2199b(r0)
            x9.v r0 = com.google.firebase.auth.internal.RecaptchaActivity.f6601n0
            r0.m14149a(r3)
            r3.finish()
            return
    }

    /* renamed from: x */
    public final void m3647x(com.google.android.gms.common.api.Status r4) {
            r3 = this;
            r0 = 0
            com.google.firebase.auth.internal.RecaptchaActivity.f6600m0 = r0
            r0 = 0
            r3.f6602k0 = r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.String> r2 = p411x9.C7002u.f27298a
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r4.writeToParcel(r2, r0)
            byte[] r4 = r2.marshall()
            r2.recycle()
            java.lang.String r0 = "com.google.firebase.auth.internal.STATUS"
            r1.putExtra(r0, r4)
            java.lang.String r4 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            r1.setAction(r4)
            b1.a r4 = p018b1.C0654a.m2198a(r3)
            r4.m2199b(r1)
            x9.v r4 = com.google.firebase.auth.internal.RecaptchaActivity.f6601n0
            r4.m14149a(r3)
            r3.finish()
            return
    }
}

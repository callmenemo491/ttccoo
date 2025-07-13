package com.google.firebase.auth.internal;

@com.google.android.gms.common.annotation.KeepName
/* loaded from: classes.dex */
public class GenericIdpActivity extends androidx.fragment.app.ActivityC0405s implements p124h7.InterfaceC2750mc {

    /* renamed from: m0 */
    public static long f6595m0;

    /* renamed from: n0 */
    public static final p411x9.C7003v f6596n0 = null;

    /* renamed from: k0 */
    public final java.util.concurrent.Executor f6597k0;

    /* renamed from: l0 */
    public boolean f6598l0;

    static {
            x9.v r0 = p411x9.C7003v.f27299b
            com.google.firebase.auth.internal.GenericIdpActivity.f6596n0 = r0
            return
    }

    public GenericIdpActivity() {
            r2 = this;
            r2.<init>()
            h7.e1 r0 = p124h7.C2779o5.f11798a
            r1 = 1
            java.util.concurrent.ExecutorService r0 = r0.m6635b(r1)
            r2.f6597k0 = r0
            r0 = 0
            r2.f6598l0 = r0
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
    public final android.net.Uri.Builder mo3638d(android.content.Intent r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "https"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "__"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "auth"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "handler"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            android.net.Uri$Builder r3 = r2.m3643w(r0, r3, r4, r5)
            return r3
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
    public final java.net.HttpURLConnection mo3640j(java.net.URL r2) {
            r1 = this;
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.io.IOException -> L7
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.io.IOException -> L7
            return r2
        L7:
            java.lang.String r2 = "GenericIdpActivity"
            java.lang.String r0 = "Error generating URL connection"
            android.util.Log.e(r2, r0)
            r2 = 0
            return r2
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
            java.lang.String r9 = "GenericIdpActivity"
            java.lang.String r10 = "Device cannot resolve intent for: android.intent.action.VIEW"
            android.util.Log.e(r9, r10)
            r8.m3644x()
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, androidx.activity.ComponentActivity, p030c0.ActivityC0820g, android.app.Activity
    public final void onCreate(android.os.Bundle r9) {
            r8 = this;
            super.onCreate(r9)
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r0 = r0.getAction()
            java.lang.String r1 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "GenericIdpActivity"
            if (r1 != 0) goto L4a
            java.lang.String r1 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4a
            java.lang.String r1 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4a
            java.lang.String r1 = "android.intent.action.VIEW"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4a
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Could not do operation - unknown action: "
            int r1 = r9.length()
            if (r1 == 0) goto L3e
            java.lang.String r9 = r0.concat(r9)
            goto L43
        L3e:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r0)
        L43:
            android.util.Log.e(r2, r9)
            r8.m3644x()
            return
        L4a:
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = com.google.firebase.auth.internal.GenericIdpActivity.f6595m0
            long r3 = r0 - r3
            r5 = 30000(0x7530, double:1.4822E-319)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L5e
            java.lang.String r9 = "Could not start operation - already in progress"
            android.util.Log.e(r2, r9)
            return
        L5e:
            com.google.firebase.auth.internal.GenericIdpActivity.f6595m0 = r0
            if (r9 == 0) goto L6a
            java.lang.String r0 = "com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN"
            boolean r9 = r9.getBoolean(r0)
            r8.f6598l0 = r9
        L6a:
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
            r18 = this;
            r1 = r18
            super.onResume()
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = r18.getIntent()
            java.lang.String r2 = r2.getAction()
            boolean r0 = r0.equals(r2)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L19f
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r5 = "firebaseError"
            boolean r5 = r0.hasExtra(r5)
            if (r5 == 0) goto L32
            java.lang.String r2 = "firebaseError"
            java.lang.String r0 = r0.getStringExtra(r2)
            com.google.android.gms.common.api.Status r0 = p411x9.C7002u.m14148a(r0)
            r1.m3645y(r0)
            return
        L32:
            java.lang.String r5 = "link"
            boolean r5 = r0.hasExtra(r5)
            if (r5 == 0) goto L19b
            java.lang.String r5 = "eventId"
            boolean r5 = r0.hasExtra(r5)
            if (r5 == 0) goto L19b
            java.lang.String r5 = "link"
            java.lang.String r5 = r0.getStringExtra(r5)
            java.lang.String r6 = "eventId"
            java.lang.String r6 = r0.getStringExtra(r6)
            java.lang.String r7 = r18.getPackageName()
            java.lang.String r8 = "encryptionEnabled"
            boolean r0 = r0.getBooleanExtra(r8, r2)
            x9.x r8 = p411x9.C7005x.f27301a
            monitor-enter(r8)
            com.google.android.gms.common.internal.C1101a.m3100e(r7)     // Catch: java.lang.Throwable -> L198
            com.google.android.gms.common.internal.C1101a.m3100e(r6)     // Catch: java.lang.Throwable -> L198
            android.content.SharedPreferences r7 = p411x9.C7005x.m14152b(r1, r7)     // Catch: java.lang.Throwable -> L198
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L198
            r9[r4] = r6     // Catch: java.lang.Throwable -> L198
            java.lang.String r10 = "com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID"
            java.lang.String r9 = java.lang.String.format(r10, r9)     // Catch: java.lang.Throwable -> L198
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L198
            r10[r4] = r6     // Catch: java.lang.Throwable -> L198
            java.lang.String r11 = "com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION"
            java.lang.String r10 = java.lang.String.format(r11, r10)     // Catch: java.lang.Throwable -> L198
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L198
            r11[r4] = r6     // Catch: java.lang.Throwable -> L198
            java.lang.String r12 = "com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID"
            java.lang.String r11 = java.lang.String.format(r12, r11)     // Catch: java.lang.Throwable -> L198
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L198
            r2[r4] = r6     // Catch: java.lang.Throwable -> L198
            java.lang.String r6 = "com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME"
            java.lang.String r2 = java.lang.String.format(r6, r2)     // Catch: java.lang.Throwable -> L198
            java.lang.String r13 = r7.getString(r9, r3)     // Catch: java.lang.Throwable -> L198
            java.lang.String r14 = r7.getString(r10, r3)     // Catch: java.lang.Throwable -> L198
            java.lang.String r15 = r7.getString(r11, r3)     // Catch: java.lang.Throwable -> L198
            java.lang.String r6 = "com.google.firebase.auth.api.gms.config.tenant.id"
            java.lang.String r16 = r7.getString(r6, r3)     // Catch: java.lang.Throwable -> L198
            java.lang.String r17 = r7.getString(r2, r3)     // Catch: java.lang.Throwable -> L198
            android.content.SharedPreferences$Editor r6 = r7.edit()     // Catch: java.lang.Throwable -> L198
            r6.remove(r9)     // Catch: java.lang.Throwable -> L198
            r6.remove(r10)     // Catch: java.lang.Throwable -> L198
            r6.remove(r11)     // Catch: java.lang.Throwable -> L198
            r6.remove(r2)     // Catch: java.lang.Throwable -> L198
            r6.apply()     // Catch: java.lang.Throwable -> L198
            if (r13 == 0) goto Lc4
            if (r14 == 0) goto Lc4
            if (r15 == 0) goto Lc4
            h7.ae r2 = new h7.ae     // Catch: java.lang.Throwable -> L198
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L198
            monitor-exit(r8)
            goto Lc6
        Lc4:
            monitor-exit(r8)
            r2 = r3
        Lc6:
            if (r2 != 0) goto Lcb
            r18.m3644x()
        Lcb:
            if (r0 == 0) goto Le5
            android.content.Context r0 = r18.getApplicationContext()
            java.lang.String r6 = r2.mo27a()
            o9.d r6 = p251o9.C5180d.m11495d(r6)
            java.lang.String r6 = r6.m11498e()
            androidx.appcompat.widget.x r0 = androidx.appcompat.widget.C0311x.m809q(r0, r6)
            java.lang.String r5 = r0.m828t(r5)
        Le5:
            h7.if r0 = new h7.if
            r0.<init>(r2, r5)
            java.lang.String r5 = r2.f11378c0
            java.lang.String r2 = r2.f11376a0
            r0.f11655l0 = r5
            java.lang.String r6 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L125
            java.lang.String r6 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L125
            java.lang.String r6 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L109
            goto L125
        L109:
            java.lang.String r0 = "unsupported operation: "
            int r3 = r2.length()
            if (r3 == 0) goto L116
            java.lang.String r0 = r0.concat(r2)
            goto L11c
        L116:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        L11c:
            java.lang.String r2 = "GenericIdpActivity"
            android.util.Log.e(r2, r0)
            r18.m3644x()
            return
        L125:
            r6 = 0
            com.google.firebase.auth.internal.GenericIdpActivity.f6595m0 = r6
            r1.f6598l0 = r4
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r7 = "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"
            android.os.Parcel r8 = android.os.Parcel.obtain()
            r0.writeToParcel(r8, r4)
            byte[] r9 = r8.marshall()
            r8.recycle()
            r6.putExtra(r7, r9)
            java.lang.String r7 = "com.google.firebase.auth.internal.OPERATION"
            r6.putExtra(r7, r2)
            java.lang.String r7 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            r6.setAction(r7)
            b1.a r7 = p018b1.C0654a.m2198a(r18)
            r7.m2199b(r6)
            android.content.Context r6 = r18.getApplicationContext()
            java.lang.String r7 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r7, r4)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r7 = "verifyAssertionRequest"
            android.os.Parcel r8 = android.os.Parcel.obtain()
            r0.writeToParcel(r8, r4)
            byte[] r0 = r8.marshall()
            r8.recycle()
            if (r0 != 0) goto L175
            goto L17b
        L175:
            r3 = 10
            java.lang.String r3 = android.util.Base64.encodeToString(r0, r3)
        L17b:
            r6.putString(r7, r3)
            java.lang.String r0 = "operation"
            r6.putString(r0, r2)
            java.lang.String r0 = "tenantId"
            r6.putString(r0, r5)
            java.lang.String r0 = "timestamp"
            long r2 = java.lang.System.currentTimeMillis()
            r6.putLong(r0, r2)
            r6.commit()
            r18.finish()
            return
        L198:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L19b:
            r18.m3644x()
            return
        L19f:
            boolean r0 = r1.f6598l0
            if (r0 != 0) goto L23e
            java.lang.String r5 = r18.getPackageName()
            byte[] r0 = p353u6.C6338a.m12988a(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L206
            java.lang.String r0 = p353u6.C6343f.m12993a(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L206
            java.util.Locale r6 = java.util.Locale.US     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L206
            java.lang.String r0 = r0.toLowerCase(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L206
            android.content.Intent r6 = r18.getIntent()
            java.lang.String r7 = "com.google.firebase.auth.KEY_FIREBASE_APP_NAME"
            java.lang.String r6 = r6.getStringExtra(r7)
            o9.d r6 = p251o9.C5180d.m11495d(r6)
            java.util.Map<java.lang.String, h7.sd> r7 = p124h7.C2877td.f11926a
            r6.m11497a()
            o9.h r8 = r6.f20314c
            java.lang.String r8 = r8.f20324a
            r9 = r7
            s.h r9 = (p319s.C5941h) r9
            boolean r8 = r9.containsKey(r8)
            if (r8 != 0) goto L1e6
            h7.lc r3 = new h7.lc
            android.content.Intent r6 = r18.getIntent()
            r3.<init>(r5, r0, r6, r1)
            java.util.concurrent.Executor r0 = r1.f6597k0
            java.lang.Void[] r4 = new java.lang.Void[r4]
            r3.executeOnExecutor(r0, r4)
            goto L23b
        L1e6:
            r6.m11497a()
            o9.h r0 = r6.f20314c
            java.lang.String r0 = r0.f20324a
            monitor-enter(r7)
            r2 = r7
            s.h r2 = (p319s.C5941h) r2     // Catch: java.lang.Throwable -> L203
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L203
            h7.sd r0 = (p124h7.C2859sd) r0     // Catch: java.lang.Throwable -> L203
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L203
            if (r0 != 0) goto L202
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Tried to get the emulator widget endpoint, but no emulator endpoint overrides found."
            r0.<init>(r2)
            throw r0
        L202:
            throw r3
        L203:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L203
            throw r0
        L206:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            int r4 = r4.length()
            int r6 = r0.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r4 = r4 + 34
            int r4 = r4 + r6
            r7.<init>(r4)
            java.lang.String r4 = "Could not get package signature: "
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = " "
            r7.append(r4)
            r7.append(r0)
            java.lang.String r0 = "GenericIdpActivity"
            java.lang.String r4 = r7.toString()
            android.util.Log.e(r0, r4)
            r1.mo3642p(r5, r3)
        L23b:
            r1.f6598l0 = r2
            return
        L23e:
            r18.m3644x()
            return
    }

    @Override // androidx.activity.ComponentActivity, p030c0.ActivityC0820g, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            boolean r0 = r2.f6598l0
            java.lang.String r1 = "com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN"
            r3.putBoolean(r1, r0)
            return
    }

    @Override // p124h7.InterfaceC2750mc
    /* renamed from: p */
    public final void mo3642p(java.lang.String r1, com.google.android.gms.common.api.Status r2) {
            r0 = this;
            if (r2 != 0) goto L6
            r0.m3644x()
            return
        L6:
            r0.m3645y(r2)
            return
    }

    /* renamed from: w */
    public final android.net.Uri.Builder m3643w(android.net.Uri.Builder r19, android.content.Intent r20, java.lang.String r21, java.lang.String r22) {
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "com.google.firebase.auth.KEY_API_KEY"
            java.lang.String r3 = r1.getStringExtra(r3)
            java.lang.String r4 = "com.google.firebase.auth.KEY_PROVIDER_ID"
            java.lang.String r4 = r1.getStringExtra(r4)
            java.lang.String r5 = "com.google.firebase.auth.KEY_TENANT_ID"
            java.lang.String r5 = r1.getStringExtra(r5)
            java.lang.String r6 = "com.google.firebase.auth.KEY_FIREBASE_APP_NAME"
            java.lang.String r6 = r1.getStringExtra(r6)
            java.lang.String r7 = "com.google.firebase.auth.KEY_PROVIDER_SCOPES"
            java.util.ArrayList r7 = r1.getStringArrayListExtra(r7)
            if (r7 == 0) goto L33
            boolean r9 = r7.isEmpty()
            if (r9 != 0) goto L33
            java.lang.String r9 = ","
            java.lang.String r7 = android.text.TextUtils.join(r9, r7)
            goto L34
        L33:
            r7 = 0
        L34:
            java.lang.String r9 = "com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"
            android.os.Bundle r9 = r1.getBundleExtra(r9)
            if (r9 != 0) goto L3e
            r9 = 0
            goto L70
        L3e:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.util.Set r11 = r9.keySet()     // Catch: org.json.JSONException -> L65
            java.util.Iterator r11 = r11.iterator()     // Catch: org.json.JSONException -> L65
        L4b:
            boolean r12 = r11.hasNext()     // Catch: org.json.JSONException -> L65
            if (r12 == 0) goto L6c
            java.lang.Object r12 = r11.next()     // Catch: org.json.JSONException -> L65
            java.lang.String r12 = (java.lang.String) r12     // Catch: org.json.JSONException -> L65
            java.lang.String r13 = r9.getString(r12)     // Catch: org.json.JSONException -> L65
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch: org.json.JSONException -> L65
            if (r14 != 0) goto L4b
            r10.put(r12, r13)     // Catch: org.json.JSONException -> L65
            goto L4b
        L65:
            java.lang.String r9 = "GenericIdpActivity"
            java.lang.String r11 = "Unexpected JSON exception when serializing developer specified custom params"
            android.util.Log.e(r9, r11)
        L6c:
            java.lang.String r9 = r10.toString()
        L70:
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            java.lang.String r14 = "SHA-256"
            java.security.MessageDigest r14 = java.security.MessageDigest.getInstance(r14)     // Catch: java.security.NoSuchAlgorithmException -> Lce
            byte[] r11 = r11.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> Lce
            byte[] r11 = r14.digest(r11)     // Catch: java.security.NoSuchAlgorithmException -> Lce
            java.lang.String r14 = new java.lang.String     // Catch: java.security.NoSuchAlgorithmException -> Lce
            r14.<init>(r11)     // Catch: java.security.NoSuchAlgorithmException -> Lce
            int r11 = r14.length()     // Catch: java.security.NoSuchAlgorithmException -> Lce
            r15 = 0
        L98:
            if (r15 >= r11) goto Ldf
            char r8 = r14.charAt(r15)     // Catch: java.security.NoSuchAlgorithmException -> Lce
            r12 = 90
            r13 = 65
            if (r8 < r13) goto La8
            if (r8 > r12) goto La8
            r8 = 1
            goto La9
        La8:
            r8 = 0
        La9:
            if (r8 == 0) goto Lcb
            char[] r8 = r14.toCharArray()     // Catch: java.security.NoSuchAlgorithmException -> Lce
        Laf:
            if (r15 >= r11) goto Lc6
            char r14 = r8[r15]     // Catch: java.security.NoSuchAlgorithmException -> Lce
            if (r14 < r13) goto Lba
            if (r14 > r12) goto Lba
            r17 = 1
            goto Lbc
        Lba:
            r17 = 0
        Lbc:
            if (r17 == 0) goto Lc3
            r14 = r14 ^ 32
            char r14 = (char) r14     // Catch: java.security.NoSuchAlgorithmException -> Lce
            r8[r15] = r14     // Catch: java.security.NoSuchAlgorithmException -> Lce
        Lc3:
            int r15 = r15 + 1
            goto Laf
        Lc6:
            java.lang.String r14 = java.lang.String.valueOf(r8)     // Catch: java.security.NoSuchAlgorithmException -> Lce
            goto Ldf
        Lcb:
            int r15 = r15 + 1
            goto L98
        Lce:
            r6.a r8 = p124h7.InterfaceC2750mc.f11770E
            r11 = 0
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r11 = r8.f22479a
            java.lang.String r13 = "Failed to get SHA-256 MessageDigest"
            java.lang.String r8 = r8.m12162c(r13, r12)
            android.util.Log.e(r11, r8)
            r14 = 0
        Ldf:
            java.lang.String r8 = r20.getAction()
            java.lang.String r11 = "com.google.firebase.auth.internal.CLIENT_VERSION"
            java.lang.String r1 = r1.getStringExtra(r11)
            x9.x r11 = p411x9.C7005x.f27301a
            android.content.Context r12 = r18.getApplicationContext()
            monitor-enter(r11)
            com.google.android.gms.common.internal.C1101a.m3100e(r21)     // Catch: java.lang.Throwable -> L1f6
            com.google.android.gms.common.internal.C1101a.m3100e(r10)     // Catch: java.lang.Throwable -> L1f6
            com.google.android.gms.common.internal.C1101a.m3100e(r14)     // Catch: java.lang.Throwable -> L1f6
            com.google.android.gms.common.internal.C1101a.m3100e(r6)     // Catch: java.lang.Throwable -> L1f6
            android.content.SharedPreferences r12 = p411x9.C7005x.m14152b(r12, r2)     // Catch: java.lang.Throwable -> L1f6
            p411x9.C7005x.m14151a(r12)     // Catch: java.lang.Throwable -> L1f6
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch: java.lang.Throwable -> L1f6
            r13 = 1
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L1f6
            r16 = 0
            r15[r16] = r10     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r13 = "com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID"
            java.lang.String r13 = java.lang.String.format(r13, r15)     // Catch: java.lang.Throwable -> L1f6
            r12.putString(r13, r14)     // Catch: java.lang.Throwable -> L1f6
            r13 = 1
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L1f6
            r15[r16] = r10     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r13 = "com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION"
            java.lang.String r13 = java.lang.String.format(r13, r15)     // Catch: java.lang.Throwable -> L1f6
            r12.putString(r13, r8)     // Catch: java.lang.Throwable -> L1f6
            r8 = 1
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L1f6
            r13[r16] = r10     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r15 = "com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID"
            java.lang.String r13 = java.lang.String.format(r15, r13)     // Catch: java.lang.Throwable -> L1f6
            r12.putString(r13, r4)     // Catch: java.lang.Throwable -> L1f6
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L1f6
            r8[r16] = r10     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r13 = "com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME"
            java.lang.String r8 = java.lang.String.format(r13, r8)     // Catch: java.lang.Throwable -> L1f6
            r12.putString(r8, r6)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r8 = "com.google.firebase.auth.api.gms.config.tenant.id"
            r12.putString(r8, r5)     // Catch: java.lang.Throwable -> L1f6
            r12.apply()     // Catch: java.lang.Throwable -> L1f6
            monitor-exit(r11)
            o9.d r6 = p251o9.C5180d.m11495d(r6)
            android.content.Context r8 = r18.getApplicationContext()
            java.lang.String r6 = r6.m11498e()
            androidx.appcompat.widget.x r6 = androidx.appcompat.widget.C0311x.m809q(r8, r6)
            java.lang.String r6 = r6.m831x()
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L177
            java.lang.String r0 = "GenericIdpActivity"
            java.lang.String r1 = "Could not generate an encryption key for Generic IDP - cancelling flow."
            android.util.Log.e(r0, r1)
            java.lang.String r0 = "Failed to generate/retrieve public encryption key for Generic IDP flow."
            com.google.android.gms.common.api.Status r0 = p074e9.C1805a.m4514B(r0)
            r8 = r18
            r8.m3645y(r0)
            r11 = 0
            return r11
        L177:
            r8 = r18
            r11 = 0
            if (r14 != 0) goto L17d
            return r11
        L17d:
            java.lang.String r11 = "eid"
            java.lang.String r12 = "p"
            android.net.Uri$Builder r11 = r0.appendQueryParameter(r11, r12)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r12 = "X"
            int r13 = r1.length()
            if (r13 == 0) goto L196
            java.lang.String r1 = r12.concat(r1)
            goto L19b
        L196:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r12)
        L19b:
            java.lang.String r12 = "v"
            android.net.Uri$Builder r1 = r11.appendQueryParameter(r12, r1)
            java.lang.String r11 = "authType"
            java.lang.String r12 = "signInWithRedirect"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r11, r12)
            java.lang.String r11 = "apiKey"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r11, r3)
            java.lang.String r3 = "providerId"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r4)
            java.lang.String r3 = "sessionId"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r14)
            java.lang.String r3 = "eventId"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r10)
            java.lang.String r3 = "apn"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r2)
            java.lang.String r2 = "sha1Cert"
            r3 = r22
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
            java.lang.String r2 = "publicKey"
            r1.appendQueryParameter(r2, r6)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L1df
            java.lang.String r1 = "scopes"
            r0.appendQueryParameter(r1, r7)
        L1df:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L1ea
            java.lang.String r1 = "customParameters"
            r0.appendQueryParameter(r1, r9)
        L1ea:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L1f5
            java.lang.String r1 = "tid"
            r0.appendQueryParameter(r1, r5)
        L1f5:
            return r0
        L1f6:
            r0 = move-exception
            r8 = r18
            monitor-exit(r11)
            throw r0
    }

    /* renamed from: x */
    public final void m3644x() {
            r3 = this;
            r0 = 0
            com.google.firebase.auth.internal.GenericIdpActivity.f6595m0 = r0
            r0 = 0
            r3.f6598l0 = r0
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.google.firebase.auth.internal.EXTRA_CANCELED"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            r0.setAction(r1)
            b1.a r1 = p018b1.C0654a.m2198a(r3)
            r1.m2199b(r0)
            x9.v r0 = com.google.firebase.auth.internal.GenericIdpActivity.f6596n0
            java.lang.String r1 = "WEB_CONTEXT_CANCELED"
            com.google.android.gms.common.api.Status r1 = p074e9.C1805a.m4514B(r1)
            r0.m14150b(r3, r1)
            r3.finish()
            return
    }

    /* renamed from: y */
    public final void m3645y(com.google.android.gms.common.api.Status r4) {
            r3 = this;
            r0 = 0
            com.google.firebase.auth.internal.GenericIdpActivity.f6595m0 = r0
            r0 = 0
            r3.f6598l0 = r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.String> r2 = p411x9.C7002u.f27298a
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r4.writeToParcel(r2, r0)
            byte[] r0 = r2.marshall()
            r2.recycle()
            java.lang.String r2 = "com.google.firebase.auth.internal.STATUS"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            r1.setAction(r0)
            b1.a r0 = p018b1.C0654a.m2198a(r3)
            r0.m2199b(r1)
            x9.v r0 = com.google.firebase.auth.internal.GenericIdpActivity.f6596n0
            android.content.Context r1 = r3.getApplicationContext()
            r0.m14150b(r1, r4)
            r3.finish()
            return
    }
}

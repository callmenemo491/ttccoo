package p248o6;

/* renamed from: o6.v */
/* loaded from: classes.dex */
public final class C4938v {

    /* renamed from: a */
    public static final p319s.C5941h<java.lang.String, java.lang.String> f19544a = null;

    /* renamed from: b */
    public static java.util.Locale f19545b;

    static {
            s.h r0 = new s.h
            r0.<init>()
            p248o6.C4938v.f19544a = r0
            return
    }

    /* renamed from: a */
    public static java.lang.String m11077a(android.content.Context r3, int r4) {
            android.content.res.Resources r0 = r3.getResources()
            r1 = 0
            java.lang.String r2 = "GoogleApiAvailability"
            switch(r4) {
                case 1: goto L71;
                case 2: goto L69;
                case 3: goto L61;
                case 4: goto L60;
                case 5: goto L54;
                case 6: goto L60;
                case 7: goto L48;
                case 8: goto L45;
                case 9: goto L42;
                case 10: goto L3f;
                case 11: goto L3c;
                case 12: goto La;
                case 13: goto La;
                case 14: goto La;
                case 15: goto La;
                case 16: goto L39;
                case 17: goto L2d;
                case 18: goto L60;
                case 19: goto La;
                case 20: goto L21;
                default: goto La;
            }
        La:
            r3 = 33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r3 = "Unexpected error code "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        L1d:
            android.util.Log.e(r2, r3)
            return r1
        L21:
            java.lang.String r4 = "The current user profile is restricted and could not use authenticated features."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_restricted_profile_title"
            java.lang.String r3 = m11078b(r3, r4)
            return r3
        L2d:
            java.lang.String r4 = "The specified account could not be signed in."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_sign_in_failed_title"
            java.lang.String r3 = m11078b(r3, r4)
            return r3
        L39:
            java.lang.String r3 = "One of the API components you attempted to connect to is not available."
            goto L1d
        L3c:
            java.lang.String r3 = "The application is not licensed to the user."
            goto L1d
        L3f:
            java.lang.String r3 = "Developer error occurred. Please see logs for detailed information"
            goto L1d
        L42:
            java.lang.String r3 = "Google Play services is invalid. Cannot recover."
            goto L1d
        L45:
            java.lang.String r3 = "Internal error occurred. Please see logs for detailed information"
            goto L1d
        L48:
            java.lang.String r4 = "Network error occurred. Please retry request later."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_network_error_title"
            java.lang.String r3 = m11078b(r3, r4)
            return r3
        L54:
            java.lang.String r4 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r2, r4)
            java.lang.String r4 = "common_google_play_services_invalid_account_title"
            java.lang.String r3 = m11078b(r3, r4)
            return r3
        L60:
            return r1
        L61:
            r3 = 2131951725(0x7f13006d, float:1.9539873E38)
            java.lang.String r3 = r0.getString(r3)
            return r3
        L69:
            r3 = 2131951735(0x7f130077, float:1.9539893E38)
            java.lang.String r3 = r0.getString(r3)
            return r3
        L71:
            r3 = 2131951728(0x7f130070, float:1.9539879E38)
            java.lang.String r3 = r0.getString(r3)
            return r3
    }

    /* renamed from: b */
    public static java.lang.String m11078b(android.content.Context r5, java.lang.String r6) {
            s.h<java.lang.String, java.lang.String> r0 = p248o6.C4938v.f19544a
            monitor-enter(r0)
            android.content.res.Resources r1 = r5.getResources()     // Catch: java.lang.Throwable -> Lb1
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> Lb1
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb1
            r3 = 24
            r4 = 0
            if (r2 < r3) goto L21
            android.os.LocaleList r1 = r1.getLocales()     // Catch: java.lang.Throwable -> Lb1
            j0.d r2 = new j0.d     // Catch: java.lang.Throwable -> Lb1
            j0.g r3 = new j0.g     // Catch: java.lang.Throwable -> Lb1
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lb1
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb1
            goto L2c
        L21:
            r2 = 1
            java.util.Locale[] r2 = new java.util.Locale[r2]     // Catch: java.lang.Throwable -> Lb1
            java.util.Locale r1 = r1.locale     // Catch: java.lang.Throwable -> Lb1
            r2[r4] = r1     // Catch: java.lang.Throwable -> Lb1
            j0.d r2 = p158j0.C3382d.m7757a(r2)     // Catch: java.lang.Throwable -> Lb1
        L2c:
            j0.f r1 = r2.f14539a     // Catch: java.lang.Throwable -> Lb1
            java.util.Locale r1 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb1
            java.util.Locale r2 = p248o6.C4938v.f19545b     // Catch: java.lang.Throwable -> Lb1
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lb1
            if (r2 != 0) goto L3f
            r0.clear()     // Catch: java.lang.Throwable -> Lb1
            p248o6.C4938v.f19545b = r1     // Catch: java.lang.Throwable -> Lb1
        L3f:
            r1 = 0
            java.lang.Object r2 = r0.getOrDefault(r6, r1)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L4a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            return r2
        L4a:
            int r2 = p184k6.C3704g.f16410e     // Catch: java.lang.Throwable -> Lb1
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57 java.lang.Throwable -> Lb1
            java.lang.String r2 = "com.google.android.gms"
            android.content.res.Resources r5 = r5.getResourcesForApplication(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57 java.lang.Throwable -> Lb1
            goto L58
        L57:
            r5 = r1
        L58:
            if (r5 != 0) goto L5c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            return r1
        L5c:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r5.getIdentifier(r6, r2, r3)     // Catch: java.lang.Throwable -> Lb1
            if (r2 != 0) goto L83
            java.lang.String r5 = "GoogleApiAvailability"
            java.lang.String r2 = "Missing resource: "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lb1
            int r3 = r6.length()     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L79
            java.lang.String r6 = r2.concat(r6)     // Catch: java.lang.Throwable -> Lb1
            goto L7e
        L79:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> Lb1
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lb1
        L7e:
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            return r1
        L83:
            java.lang.String r5 = r5.getString(r2)     // Catch: java.lang.Throwable -> Lb1
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto Laa
            java.lang.String r5 = "GoogleApiAvailability"
            java.lang.String r2 = "Got empty resource: "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lb1
            int r3 = r6.length()     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto La0
            java.lang.String r6 = r2.concat(r6)     // Catch: java.lang.Throwable -> Lb1
            goto La5
        La0:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> Lb1
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lb1
        La5:
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            return r1
        Laa:
            s.h<java.lang.String, java.lang.String> r1 = p248o6.C4938v.f19544a     // Catch: java.lang.Throwable -> Lb1
            r1.put(r6, r5)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            return r5
        Lb1:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            throw r5
    }

    /* renamed from: c */
    public static java.lang.String m11079c(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r2 = m11078b(r2, r3)
            if (r2 != 0) goto L11
            r2 = 2131951731(0x7f130073, float:1.9539885E38)
            java.lang.String r2 = r0.getString(r2)
        L11:
            android.content.res.Configuration r3 = r0.getConfiguration()
            java.util.Locale r3 = r3.locale
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r2 = java.lang.String.format(r3, r2, r0)
            return r2
    }

    /* renamed from: d */
    public static java.lang.String m11080d(android.content.Context r4) {
            java.lang.String r0 = r4.getPackageName()
            w6.b r1 = p388w6.C6816c.m13887a(r4)     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r1.f26525a     // Catch: java.lang.Throwable -> L22
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L22
            android.content.Context r1 = r1.f26525a     // Catch: java.lang.Throwable -> L22
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L22
            r3 = 0
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r0, r3)     // Catch: java.lang.Throwable -> L22
            java.lang.CharSequence r1 = r2.getApplicationLabel(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L22
            return r4
        L22:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            java.lang.String r4 = r4.name
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L30
            return r0
        L30:
            return r4
    }

    /* renamed from: e */
    public static java.lang.String m11081e(android.content.Context r5, int r6) {
            android.content.res.Resources r0 = r5.getResources()
            java.lang.String r1 = m11080d(r5)
            r2 = 0
            r3 = 1
            if (r6 == r3) goto L90
            r4 = 2
            if (r6 == r4) goto L76
            r4 = 3
            if (r6 == r4) goto L6a
            r4 = 5
            if (r6 == r4) goto L63
            r4 = 7
            if (r6 == r4) goto L5c
            r4 = 9
            if (r6 == r4) goto L50
            r4 = 20
            if (r6 == r4) goto L49
            switch(r6) {
                case 16: goto L42;
                case 17: goto L3b;
                case 18: goto L2f;
                default: goto L23;
            }
        L23:
            r5 = 2131951731(0x7f130073, float:1.9539885E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L2f:
            r5 = 2131951736(0x7f130078, float:1.9539895E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L3b:
            java.lang.String r6 = "common_google_play_services_sign_in_failed_text"
            java.lang.String r5 = m11079c(r5, r6, r1)
            return r5
        L42:
            java.lang.String r6 = "common_google_play_services_api_unavailable_text"
            java.lang.String r5 = m11079c(r5, r6, r1)
            return r5
        L49:
            java.lang.String r6 = "common_google_play_services_restricted_profile_text"
            java.lang.String r5 = m11079c(r5, r6, r1)
            return r5
        L50:
            r5 = 2131951732(0x7f130074, float:1.9539887E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L5c:
            java.lang.String r6 = "common_google_play_services_network_error_text"
            java.lang.String r5 = m11079c(r5, r6, r1)
            return r5
        L63:
            java.lang.String r6 = "common_google_play_services_invalid_account_text"
            java.lang.String r5 = m11079c(r5, r6, r1)
            return r5
        L6a:
            r5 = 2131951724(0x7f13006c, float:1.953987E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L76:
            boolean r5 = p353u6.C6342e.m12992b(r5)
            if (r5 == 0) goto L84
            r5 = 2131951737(0x7f130079, float:1.9539897E38)
            java.lang.String r5 = r0.getString(r5)
            return r5
        L84:
            r5 = 2131951734(0x7f130076, float:1.953989E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L90:
            r5 = 2131951727(0x7f13006f, float:1.9539877E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
    }
}

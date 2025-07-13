package p056da;

/* renamed from: da.h0 */
/* loaded from: classes.dex */
public class C1361h0 implements p056da.InterfaceC1363i0 {

    /* renamed from: g */
    public static final java.util.regex.Pattern f6910g = null;

    /* renamed from: h */
    public static final java.lang.String f6911h = null;

    /* renamed from: a */
    public final p124h7.C2625fd f6912a;

    /* renamed from: b */
    public final android.content.Context f6913b;

    /* renamed from: c */
    public final java.lang.String f6914c;

    /* renamed from: d */
    public final p412xa.InterfaceC7011d f6915d;

    /* renamed from: e */
    public final p056da.C1353d0 f6916e;

    /* renamed from: f */
    public java.lang.String f6917f;

    static {
            java.lang.String r0 = "[^\\p{Alnum}]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p056da.C1361h0.f6910g = r0
            java.lang.String r0 = "/"
            java.lang.String r0 = java.util.regex.Pattern.quote(r0)
            p056da.C1361h0.f6911h = r0
            return
    }

    public C1361h0(android.content.Context r1, java.lang.String r2, p412xa.InterfaceC7011d r3, p056da.C1353d0 r4) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto L15
            r0.f6913b = r1
            r0.f6914c = r2
            r0.f6915d = r3
            r0.f6916e = r4
            h7.fd r1 = new h7.fd
            r1.<init>()
            r0.f6912a = r1
            return
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "appIdentifier must not be null"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: b */
    public static java.lang.String m3875b() {
            java.lang.String r0 = "SYN_"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: a */
    public final synchronized java.lang.String m3876a(java.lang.String r6, android.content.SharedPreferences r7) {
            r5 = this;
            monitor-enter(r5)
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5c
            r1 = 0
            if (r0 != 0) goto Le
            r0 = r1
            goto L20
        Le:
            java.util.regex.Pattern r2 = p056da.C1361h0.f6910g     // Catch: java.lang.Throwable -> L5c
            java.util.regex.Matcher r0 = r2.matcher(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceAll(r2)     // Catch: java.lang.Throwable -> L5c
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r0.toLowerCase(r2)     // Catch: java.lang.Throwable -> L5c
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r2.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "Created new Crashlytics installation ID: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L5c
            r2.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = " for FID: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L5c
            r2.append(r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5c
            r3 = 2
            java.lang.String r4 = "FirebaseCrashlytics"
            boolean r3 = android.util.Log.isLoggable(r4, r3)     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L47
            java.lang.String r3 = "FirebaseCrashlytics"
            android.util.Log.v(r3, r2, r1)     // Catch: java.lang.Throwable -> L5c
        L47:
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = "crashlytics.installation.id"
            android.content.SharedPreferences$Editor r7 = r7.putString(r1, r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = "firebase.installation.id"
            android.content.SharedPreferences$Editor r6 = r7.putString(r1, r6)     // Catch: java.lang.Throwable -> L5c
            r6.apply()     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r5)
            return r0
        L5c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    /* renamed from: c */
    public synchronized java.lang.String m3877c() {
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = r7.f6917f     // Catch: java.lang.Throwable -> Led
            if (r0 == 0) goto L7
            monitor-exit(r7)
            return r0
        L7:
            java.lang.String r0 = "Determining Crashlytics installation ID..."
            java.lang.String r1 = "FirebaseCrashlytics"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> Led
            r3 = 0
            if (r1 == 0) goto L18
            java.lang.String r1 = "FirebaseCrashlytics"
            android.util.Log.v(r1, r0, r3)     // Catch: java.lang.Throwable -> Led
        L18:
            android.content.Context r0 = r7.f6913b     // Catch: java.lang.Throwable -> Led
            android.content.SharedPreferences r0 = p056da.C1354e.m3864h(r0)     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = "firebase.installation.id"
            java.lang.String r1 = r0.getString(r1, r3)     // Catch: java.lang.Throwable -> Led
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r4.<init>()     // Catch: java.lang.Throwable -> Led
            java.lang.String r5 = "Cached Firebase Installation ID: "
            r4.append(r5)     // Catch: java.lang.Throwable -> Led
            r4.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Led
            java.lang.String r5 = "FirebaseCrashlytics"
            boolean r5 = android.util.Log.isLoggable(r5, r2)     // Catch: java.lang.Throwable -> Led
            if (r5 == 0) goto L42
            java.lang.String r5 = "FirebaseCrashlytics"
            android.util.Log.v(r5, r4, r3)     // Catch: java.lang.Throwable -> Led
        L42:
            da.d0 r4 = r7.f6916e     // Catch: java.lang.Throwable -> Led
            boolean r4 = r4.m3855a()     // Catch: java.lang.Throwable -> Led
            if (r4 == 0) goto L9a
            xa.d r4 = r7.f6915d     // Catch: java.lang.Throwable -> Led
            s7.i r4 = r4.mo14165r()     // Catch: java.lang.Throwable -> Led
            java.lang.Object r4 = p056da.C1375o0.m3893a(r4)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> Led
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> Led
            goto L60
        L57:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "Failed to retrieve Firebase Installations ID."
            android.util.Log.w(r5, r6, r4)     // Catch: java.lang.Throwable -> Led
            r4 = r3
        L60:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r5.<init>()     // Catch: java.lang.Throwable -> Led
            java.lang.String r6 = "Fetched Firebase Installation ID: "
            r5.append(r6)     // Catch: java.lang.Throwable -> Led
            r5.append(r4)     // Catch: java.lang.Throwable -> Led
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Led
            java.lang.String r6 = "FirebaseCrashlytics"
            boolean r6 = android.util.Log.isLoggable(r6, r2)     // Catch: java.lang.Throwable -> Led
            if (r6 == 0) goto L7e
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.v(r6, r5, r3)     // Catch: java.lang.Throwable -> Led
        L7e:
            if (r4 != 0) goto L88
            if (r1 != 0) goto L87
            java.lang.String r4 = m3875b()     // Catch: java.lang.Throwable -> Led
            goto L88
        L87:
            r4 = r1
        L88:
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> Led
            if (r1 == 0) goto L95
            java.lang.String r1 = "crashlytics.installation.id"
        L90:
            java.lang.String r1 = r0.getString(r1, r3)     // Catch: java.lang.Throwable -> Led
            goto Lb4
        L95:
            java.lang.String r1 = r7.m3876a(r4, r0)     // Catch: java.lang.Throwable -> Led
            goto Lb4
        L9a:
            if (r1 == 0) goto La6
            java.lang.String r4 = "SYN_"
            boolean r1 = r1.startsWith(r4)     // Catch: java.lang.Throwable -> Led
            if (r1 == 0) goto La6
            r1 = 1
            goto La7
        La6:
            r1 = 0
        La7:
            if (r1 == 0) goto Lac
            java.lang.String r1 = "crashlytics.installation.id"
            goto L90
        Lac:
            java.lang.String r1 = m3875b()     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = r7.m3876a(r1, r0)     // Catch: java.lang.Throwable -> Led
        Lb4:
            r7.f6917f = r1     // Catch: java.lang.Throwable -> Led
            if (r1 != 0) goto Lc9
            java.lang.String r1 = "Unable to determine Crashlytics Install Id, creating a new one."
            java.lang.String r4 = "FirebaseCrashlytics"
            android.util.Log.w(r4, r1, r3)     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = m3875b()     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = r7.m3876a(r1, r0)     // Catch: java.lang.Throwable -> Led
            r7.f6917f = r0     // Catch: java.lang.Throwable -> Led
        Lc9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r0.<init>()     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = "Crashlytics installation ID: "
            r0.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = r7.f6917f     // Catch: java.lang.Throwable -> Led
            r0.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = "FirebaseCrashlytics"
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> Led
            if (r1 == 0) goto Le9
            java.lang.String r1 = "FirebaseCrashlytics"
            android.util.Log.v(r1, r0, r3)     // Catch: java.lang.Throwable -> Led
        Le9:
            java.lang.String r0 = r7.f6917f     // Catch: java.lang.Throwable -> Led
            monitor-exit(r7)
            return r0
        Led:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    /* renamed from: d */
    public java.lang.String m3878d() {
            r3 = this;
            h7.fd r0 = r3.f6912a
            android.content.Context r1 = r3.f6913b
            monitor-enter(r0)
            java.lang.String r2 = r0.f11517Z     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L1b
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r2.getInstallerPackageName(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L19
            java.lang.String r1 = ""
        L19:
            r0.f11517Z = r1     // Catch: java.lang.Throwable -> L2b
        L1b:
            java.lang.String r1 = ""
            java.lang.String r2 = r0.f11517Z     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L27
            r1 = 0
            goto L29
        L27:
            java.lang.String r1 = r0.f11517Z     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)
            return r1
        L2b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: e */
    public final java.lang.String m3879e(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = p056da.C1361h0.f6911h
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
            return r3
    }
}

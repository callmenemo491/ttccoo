package p052d6;

/* renamed from: d6.a */
/* loaded from: classes.dex */
public class C1295a {

    /* renamed from: i */
    public static final p123h6.C2489b f6805i = null;

    /* renamed from: j */
    public static final java.lang.Object f6806j = null;

    /* renamed from: k */
    public static p052d6.C1295a f6807k;

    /* renamed from: a */
    public final android.content.Context f6808a;

    /* renamed from: b */
    public final p052d6.InterfaceC1324o0 f6809b;

    /* renamed from: c */
    public final p052d6.C1305f f6810c;

    /* renamed from: d */
    public final p052d6.C1314j0 f6811d;

    /* renamed from: e */
    public final p052d6.C1297b f6812e;

    /* renamed from: f */
    public final p072e7.BinderC1592e f6813f;

    /* renamed from: g */
    public final java.util.List<p052d6.AbstractC1309h> f6814g;

    /* renamed from: h */
    public p072e7.C1618g5 f6815h;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "CastContext"
            r0.<init>(r1)
            p052d6.C1295a.f6805i = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p052d6.C1295a.f6806j = r0
            return
    }

    public C1295a(android.content.Context r8, p052d6.C1297b r9, java.util.List<p052d6.AbstractC1309h> r10, p072e7.BinderC1592e r11) {
            r7 = this;
            r7.<init>()
            android.content.Context r8 = r8.getApplicationContext()
            r7.f6808a = r8
            r7.f6812e = r9
            r7.f6813f = r11
            r7.f6814g = r10
            java.lang.String r0 = r9.f6817Y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1d
            e7.g5 r0 = new e7.g5
            r0.<init>(r8, r9, r11)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r7.f6815h = r0
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            e7.g5 r0 = r7.f6815h
            if (r0 == 0) goto L30
            java.lang.String r1 = r0.f6841b
            d6.a0 r0 = r0.f6842c
            r8.put(r1, r0)
        L30:
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L68
            java.util.Iterator r10 = r10.iterator()
        L38:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r10.next()
            d6.h r2 = (p052d6.AbstractC1309h) r2
            java.lang.String r3 = "Additional SessionProvider must not be null."
            com.google.android.gms.common.internal.C1101a.m3104i(r2, r3)
            java.lang.String r3 = r2.f6841b
            java.lang.String r4 = "Category for SessionProvider must not be null or empty string."
            com.google.android.gms.common.internal.C1101a.m3101f(r3, r4)
            boolean r4 = r8.containsKey(r3)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r0] = r3
            r4 = r4 ^ r1
            java.lang.String r6 = "SessionProvider for category %s already added"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            com.google.android.gms.common.internal.C1101a.m3097b(r4, r5)
            d6.a0 r2 = r2.f6842c
            r8.put(r3, r2)
            goto L38
        L68:
            android.content.Context r10 = r7.f6808a     // Catch: android.os.RemoteException -> L136
            e7.w6 r2 = p072e7.C1726r3.m4430a(r10)     // Catch: android.os.RemoteException -> L136
            android.content.Context r10 = r10.getApplicationContext()     // Catch: android.os.RemoteException -> L136
            x6.b r3 = new x6.b     // Catch: android.os.RemoteException -> L136
            r3.<init>(r10)     // Catch: android.os.RemoteException -> L136
            d6.o0 r8 = r2.mo4478N0(r3, r9, r11, r8)     // Catch: android.os.RemoteException -> L136
            r7.f6809b = r8
            d6.l r9 = r8.mo3813h()     // Catch: android.os.RemoteException -> L12d
            d6.j0 r10 = new d6.j0
            r10.<init>(r9)
            r7.f6811d = r10
            d6.t r8 = r8.mo3812e()     // Catch: android.os.RemoteException -> L124
            d6.f r9 = new d6.f
            android.content.Context r10 = r7.f6808a
            r9.<init>(r8, r10)
            r7.f6810c = r9
            h6.w r8 = new h6.w
            r8.<init>(r10)
            java.lang.String r8 = "PrecacheManager"
            java.lang.String r10 = "The log tag cannot be null or empty."
            com.google.android.gms.common.internal.C1101a.m3101f(r8, r10)
            e7.g r8 = r11.f7542c
            if (r8 == 0) goto La7
            r8.f7560c = r9
        La7:
            android.content.Context r8 = r7.f6808a
            h6.w r9 = new h6.w
            r9.<init>(r8)
            java.lang.String r8 = "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED"
            java.lang.String r10 = "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE"
            java.lang.String r11 = "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"
            java.lang.String[] r8 = new java.lang.String[]{r8, r10, r11}
            m6.k$a r10 = p218m6.AbstractC4398k.m9834a()
            h6.t r11 = new h6.t
            r11.<init>(r9, r8, r0)
            r10.f17961a = r11
            k6.d[] r8 = new p184k6.C3701d[r1]
            k6.d r11 = p036c6.C0872a0.f4726b
            r8[r0] = r11
            r10.f17963c = r8
            r10.f17962b = r0
            r8 = 8425(0x20e9, float:1.1806E-41)
            r10.f17964d = r8
            m6.k r8 = r10.m9835a()
            s7.i r8 = r9.m9328d(r0, r8)
            d6.b0 r9 = new d6.b0
            r9.<init>(r7, r1)
            s7.q r8 = (p327s7.C5993q) r8
            java.util.Objects.requireNonNull(r8)
            java.util.concurrent.Executor r10 = p327s7.C5987k.f23076a
            r8.mo12446d(r10, r9)
            android.content.Context r8 = r7.f6808a
            h6.w r9 = new h6.w
            r9.<init>(r8)
            java.lang.String r8 = "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            m6.k$a r11 = p218m6.AbstractC4398k.m9834a()
            h6.t r2 = new h6.t
            r2.<init>(r9, r8, r1)
            r11.f17961a = r2
            k6.d[] r8 = new p184k6.C3701d[r1]
            k6.d r1 = p036c6.C0872a0.f4728d
            r8[r0] = r1
            r11.f17963c = r8
            r11.f17962b = r0
            r8 = 8427(0x20eb, float:1.1809E-41)
            r11.f17964d = r8
            m6.k r8 = r11.m9835a()
            s7.i r8 = r9.m9328d(r0, r8)
            d6.b0 r9 = new d6.b0
            r9.<init>(r7, r0)
            s7.q r8 = (p327s7.C5993q) r8
            java.util.Objects.requireNonNull(r8)
            r8.mo12446d(r10, r9)
            return
        L124:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Failed to call getSessionManagerImpl"
            r9.<init>(r10, r8)
            throw r9
        L12d:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Failed to call getDiscoveryManagerImpl"
            r9.<init>(r10, r8)
            throw r9
        L136:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Failed to call newCastContextImpl"
            r9.<init>(r10, r8)
            throw r9
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: b */
    public static p052d6.C1295a m3761b(@androidx.annotation.RecentlyNonNull android.content.Context r6) {
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            d6.a r0 = p052d6.C1295a.f6807k
            if (r0 != 0) goto L45
            java.lang.Object r0 = p052d6.C1295a.f6806j
            monitor-enter(r0)
            d6.a r1 = p052d6.C1295a.f6807k     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L40
            android.content.Context r1 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L42
            d6.c r1 = m3762c(r1)     // Catch: java.lang.Throwable -> L42
            android.content.Context r2 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L42
            d6.b r2 = r1.getCastOptions(r2)     // Catch: java.lang.Throwable -> L42
            e7.e r3 = new e7.e     // Catch: java.lang.Throwable -> L42
            f1.o r4 = p085f1.C1974o.m5026d(r6)     // Catch: java.lang.Throwable -> L42
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L42
            d6.a r4 = new d6.a     // Catch: p052d6.C1337y -> L39 java.lang.Throwable -> L42
            android.content.Context r5 = r6.getApplicationContext()     // Catch: p052d6.C1337y -> L39 java.lang.Throwable -> L42
            java.util.List r1 = r1.getAdditionalSessionProviders(r5)     // Catch: p052d6.C1337y -> L39 java.lang.Throwable -> L42
            r4.<init>(r6, r2, r1, r3)     // Catch: p052d6.C1337y -> L39 java.lang.Throwable -> L42
            p052d6.C1295a.f6807k = r4     // Catch: p052d6.C1337y -> L39 java.lang.Throwable -> L42
            goto L40
        L39:
            r6 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L42
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L42
            throw r1     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r6
        L45:
            d6.a r6 = p052d6.C1295a.f6807k
            return r6
    }

    /* renamed from: c */
    public static p052d6.InterfaceC1299c m3762c(android.content.Context r4) {
            w6.b r0 = p388w6.C6816c.m13887a(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r0.m13884a(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            android.os.Bundle r4 = r4.metaData     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            r0 = 0
            if (r4 != 0) goto L1c
            h6.b r1 = p052d6.C1295a.f6805i     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            java.lang.String r2 = "Bundle is null"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            r1.m6378c(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
        L1c:
            java.lang.String r1 = "com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME"
            java.lang.String r4 = r4.getString(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            if (r4 == 0) goto L3d
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            java.lang.Class<d6.c> r1 = p052d6.InterfaceC1299c.class
            java.lang.Class r4 = r4.asSubclass(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            java.lang.Object r4 = r4.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            d6.c r4 = (p052d6.InterfaceC1299c) r4     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            return r4
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            java.lang.String r0 = "The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME."
            r4.<init>(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
            throw r4     // Catch: java.lang.reflect.InvocationTargetException -> L45 java.lang.NoSuchMethodException -> L47 java.lang.IllegalAccessException -> L49 java.lang.InstantiationException -> L4b java.lang.NullPointerException -> L4d java.lang.ClassNotFoundException -> L4f android.content.pm.PackageManager.NameNotFoundException -> L51
        L45:
            r4 = move-exception
            goto L52
        L47:
            r4 = move-exception
            goto L52
        L49:
            r4 = move-exception
            goto L52
        L4b:
            r4 = move-exception
            goto L52
        L4d:
            r4 = move-exception
            goto L52
        L4f:
            r4 = move-exception
            goto L52
        L51:
            r4 = move-exception
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to initialize CastContext."
            r0.<init>(r1, r4)
            throw r0
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public p052d6.C1305f m3763a() {
            r1 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            d6.f r0 = r1.f6810c
            return r0
    }
}

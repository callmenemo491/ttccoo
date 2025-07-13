package p249o7;

/* renamed from: o7.f */
/* loaded from: classes.dex */
public final class C4989f extends com.google.android.gms.measurement.internal.C1114e {

    /* renamed from: b */
    public java.lang.Boolean f19665b;

    /* renamed from: c */
    public p249o7.InterfaceC4981e f19666c;

    /* renamed from: d */
    public java.lang.Boolean f19667d;

    public C4989f(com.google.android.gms.measurement.internal.C1113d r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            o7.d r2 = p249o7.C4973d.f19624a
            r1.f19666c = r2
            return
    }

    /* renamed from: j */
    public static final long m11150j() {
            o7.u2<java.lang.Long> r0 = p249o7.C5120v2.f20059D
            r1 = 0
            java.lang.Object r0 = r0.m11421a(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    /* renamed from: k */
    public final java.lang.String m11151k(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.String r0 = ""
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            r5 = 1
            r3[r5] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            java.lang.String r8 = "get"
            java.lang.reflect.Method r8 = r1.getMethod(r8, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            r1[r5] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            r7 = 0
            java.lang.Object r7 = r8.invoke(r7, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            java.lang.String r8 = "null reference"
            java.util.Objects.requireNonNull(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L38 java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L50
            return r7
        L2c:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r8 = r6.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            o7.f3 r8 = r8.f5672f
            java.lang.String r1 = "SystemProperties.get() threw an exception"
            goto L5b
        L38:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r8 = r6.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            o7.f3 r8 = r8.f5672f
            java.lang.String r1 = "Could not access SystemProperties.get()"
            goto L5b
        L44:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r8 = r6.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            o7.f3 r8 = r8.f5672f
            java.lang.String r1 = "Could not find SystemProperties.get() method"
            goto L5b
        L50:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r8 = r6.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            o7.f3 r8 = r8.f5672f
            java.lang.String r1 = "Could not find SystemProperties class"
        L5b:
            r8.m11170d(r1, r7)
            return r0
    }

    /* renamed from: l */
    public final int m11152l(java.lang.String r2) {
            r1 = this;
            o7.u2<java.lang.Integer> r0 = p249o7.C5120v2.f20063H
            int r2 = r1.m11155o(r2, r0)
            r0 = 2000(0x7d0, float:2.803E-42)
            int r2 = java.lang.Math.min(r2, r0)
            r0 = 500(0x1f4, float:7.0E-43)
            int r2 = java.lang.Math.max(r2, r0)
            return r2
    }

    /* renamed from: m */
    public final int m11153m() {
            r3 = this;
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.v5 r1 = r1.m3179y()
            java.lang.Boolean r1 = r1.f20136e
            int r0 = r0.m3226m0()
            r2 = 201500(0x3131c, float:2.82362E-40)
            if (r0 >= r2) goto L23
            if (r1 == 0) goto L20
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L20
            goto L23
        L20:
            r0 = 25
            return r0
        L23:
            r0 = 100
            return r0
    }

    /* renamed from: n */
    public final int m11154n(java.lang.String r2) {
            r1 = this;
            o7.u2<java.lang.Integer> r0 = p249o7.C5120v2.f20064I
            int r2 = r1.m11155o(r2, r0)
            r0 = 100
            int r2 = java.lang.Math.min(r2, r0)
            r0 = 25
            int r2 = java.lang.Math.max(r2, r0)
            return r2
    }

    /* renamed from: o */
    public final int m11155o(java.lang.String r4, p249o7.C5112u2<java.lang.Integer> r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Le
        L3:
            java.lang.Object r4 = r5.m11421a(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            return r4
        Le:
            o7.e r1 = r3.f19666c
            java.lang.String r2 = r5.f20018a
            java.lang.String r4 = r1.mo11088a(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L1d
            goto L3
        L1d:
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L3
            java.lang.Object r4 = r5.m11421a(r4)     // Catch: java.lang.NumberFormatException -> L3
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.NumberFormatException -> L3
            int r4 = r4.intValue()     // Catch: java.lang.NumberFormatException -> L3
            return r4
    }

    /* renamed from: p */
    public final int m11156p(java.lang.String r1, p249o7.C5112u2<java.lang.Integer> r2, int r3, int r4) {
            r0 = this;
            int r1 = r0.m11155o(r1, r2)
            int r1 = java.lang.Math.min(r1, r4)
            int r1 = java.lang.Math.max(r1, r3)
            return r1
    }

    /* renamed from: q */
    public final long m11157q() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            java.util.Objects.requireNonNull(r0)
            r0 = 43042(0xa822, double:2.12656E-319)
            return r0
    }

    /* renamed from: r */
    public final long m11158r(java.lang.String r4, p249o7.C5112u2<java.lang.Long> r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Le
        L3:
            java.lang.Object r4 = r5.m11421a(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            return r4
        Le:
            o7.e r1 = r3.f19666c
            java.lang.String r2 = r5.f20018a
            java.lang.String r4 = r1.mo11088a(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L1d
            goto L3
        L1d:
            long r1 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L3
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L3
            java.lang.Object r4 = r5.m11421a(r4)     // Catch: java.lang.NumberFormatException -> L3
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.NumberFormatException -> L3
            long r4 = r4.longValue()     // Catch: java.lang.NumberFormatException -> L3
            return r4
    }

    /* renamed from: s */
    public final android.os.Bundle m11159s() {
            r4 = this;
            r0 = 0
            com.google.android.gms.measurement.internal.d r1 = r4.f5736a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            android.content.Context r1 = r1.f5710a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            if (r1 != 0) goto L19
            com.google.android.gms.measurement.internal.d r1 = r4.f5736a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            o7.f3 r1 = r1.f5672f     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            java.lang.String r2 = "Failed to load metadata: PackageManager is null"
            r1.m11169c(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            return r0
        L19:
            com.google.android.gms.measurement.internal.d r1 = r4.f5736a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            android.content.Context r1 = r1.f5710a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            w6.b r1 = p388w6.C6816c.m13887a(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            com.google.android.gms.measurement.internal.d r2 = r4.f5736a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            android.content.Context r2 = r2.f5710a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r1.m13884a(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            if (r1 != 0) goto L3f
            com.google.android.gms.measurement.internal.d r1 = r4.f5736a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            o7.f3 r1 = r1.f5672f     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            java.lang.String r2 = "Failed to load metadata: ApplicationInfo is null"
            r1.m11169c(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            return r0
        L3f:
            android.os.Bundle r0 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            return r0
        L42:
            r1 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r4.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r3 = "Failed to load metadata: Package name not found"
            r2.m11170d(r3, r1)
            return r0
    }

    /* renamed from: t */
    public final java.lang.Boolean m11160t(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.common.internal.C1101a.m3100e(r4)
            android.os.Bundle r0 = r3.m11159s()
            r1 = 0
            if (r0 != 0) goto L18
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5672f
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m11169c(r0)
            return r1
        L18:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            boolean r4 = r0.getBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
    }

    /* renamed from: u */
    public final boolean m11161u() {
            r1 = this;
            java.lang.String r0 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r0 = r1.m11160t(r0)
            if (r0 == 0) goto L11
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    /* renamed from: v */
    public final boolean m11162v(java.lang.String r4, p249o7.C5112u2<java.lang.Boolean> r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Le
        L3:
            java.lang.Object r4 = r5.m11421a(r0)
        L7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        Le:
            o7.e r1 = r3.f19666c
            java.lang.String r2 = r5.f20018a
            java.lang.String r4 = r1.mo11088a(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L3
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            o7.f r1 = r1.f5716g
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20127w0
            boolean r0 = r1.m11162v(r0, r2)
            if (r0 == 0) goto L2f
            java.lang.String r0 = "1"
            boolean r4 = r0.equals(r4)
            goto L33
        L2f:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
        L33:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.m11421a(r4)
            goto L7
    }

    /* renamed from: w */
    public final boolean m11163w() {
            r1 = this;
            java.lang.String r0 = "google_analytics_automatic_screen_reporting_enabled"
            java.lang.Boolean r0 = r1.m11160t(r0)
            if (r0 == 0) goto L11
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    /* renamed from: x */
    public final boolean m11164x() {
            r1 = this;
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "firebase_analytics_collection_deactivated"
            java.lang.Boolean r0 = r1.m11160t(r0)
            if (r0 == 0) goto L15
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    /* renamed from: y */
    public final boolean m11165y(java.lang.String r3) {
            r2 = this;
            o7.e r0 = r2.f19666c
            java.lang.String r1 = "measurement.event_sampling_enabled"
            java.lang.String r3 = r0.mo11088a(r3, r1)
            java.lang.String r0 = "1"
            boolean r3 = r0.equals(r3)
            return r3
    }

    /* renamed from: z */
    public final boolean m11166z() {
            r1 = this;
            java.lang.Boolean r0 = r1.f19665b
            if (r0 != 0) goto L12
            java.lang.String r0 = "app_measurement_lite"
            java.lang.Boolean r0 = r1.m11160t(r0)
            r1.f19665b = r0
            if (r0 != 0) goto L12
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.f19665b = r0
        L12:
            java.lang.Boolean r0 = r1.f19665b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L23
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            boolean r0 = r0.f5714e
            if (r0 != 0) goto L21
            goto L23
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 1
            return r0
    }
}

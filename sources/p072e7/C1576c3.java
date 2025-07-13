package p072e7;

/* renamed from: e7.c3 */
/* loaded from: classes.dex */
public final class C1576c3 {

    /* renamed from: i */
    public static final p123h6.C2489b f7501i = null;

    /* renamed from: j */
    public static final java.lang.String f7502j = null;

    /* renamed from: k */
    public static p072e7.C1576c3 f7503k;

    /* renamed from: a */
    public final p072e7.C1662l f7504a;

    /* renamed from: b */
    public final android.content.SharedPreferences f7505b;

    /* renamed from: c */
    public final java.lang.String f7506c;

    /* renamed from: d */
    public final java.lang.Runnable f7507d;

    /* renamed from: e */
    public final android.os.Handler f7508e;

    /* renamed from: f */
    public final java.util.Set<p072e7.EnumC1635i2> f7509f;

    /* renamed from: g */
    public final java.util.Set<p072e7.EnumC1635i2> f7510g;

    /* renamed from: h */
    public long f7511h;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "FeatureUsageAnalytics"
            r0.<init>(r1)
            p072e7.C1576c3.f7501i = r0
            java.lang.String r0 = "20.1.0"
            p072e7.C1576c3.f7502j = r0
            return
    }

    public C1576c3(android.content.SharedPreferences r12, p072e7.C1662l r13, java.lang.String r14) {
            r11 = this;
            e7.i2 r0 = p072e7.EnumC1635i2.f7607Z
            r11.<init>()
            r11.f7505b = r12
            r11.f7504a = r13
            r11.f7506c = r14
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            r11.f7509f = r13
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r11.f7510g = r1
            e7.k r2 = new e7.k
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r11.f7508e = r2
            f6.i r2 = new f6.i
            r2.<init>(r11)
            r11.f7507d = r2
            java.lang.String r2 = "feature_usage_sdk_version"
            r3 = 0
            java.lang.String r4 = r12.getString(r2, r3)
            java.lang.String r5 = "feature_usage_package_name"
            java.lang.String r3 = r12.getString(r5, r3)
            r13.clear()
            r1.clear()
            r6 = 0
            r11.f7511h = r6
            java.lang.String r13 = p072e7.C1576c3.f7502j
            boolean r13 = r13.equals(r4)
            java.lang.String r1 = "feature_usage_timestamp_"
            java.lang.String r4 = "feature_usage_last_report_time"
            if (r13 == 0) goto Leb
            boolean r13 = r14.equals(r3)
            if (r13 != 0) goto L56
            goto Leb
        L56:
            long r13 = r12.getLong(r4, r6)
            r11.f7511h = r13
            long r13 = java.lang.System.currentTimeMillis()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Map r12 = r12.getAll()
            java.util.Set r12 = r12.keySet()
            java.util.Iterator r12 = r12.iterator()
        L71:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Ld4
            java.lang.Object r3 = r12.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r3.startsWith(r1)
            if (r4 == 0) goto L71
            android.content.SharedPreferences r4 = r11.f7505b
            long r4 = r4.getLong(r3, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L9a
            long r4 = r13 - r4
            r8 = 1209600000(0x48190800, double:5.97621805E-315)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L9a
            r2.add(r3)
            goto L71
        L9a:
            java.lang.String r4 = "feature_usage_timestamp_reported_feature_"
            boolean r4 = r3.startsWith(r4)
            r5 = 41
            if (r4 == 0) goto Lb8
            java.lang.String r3 = r3.substring(r5)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> Lb1
            e7.i2 r3 = p072e7.EnumC1635i2.m4229e(r3)     // Catch: java.lang.NumberFormatException -> Lb1
            goto Lb2
        Lb1:
            r3 = r0
        Lb2:
            java.util.Set<e7.i2> r4 = r11.f7510g
            r4.add(r3)
            goto Lce
        Lb8:
            java.lang.String r4 = "feature_usage_timestamp_detected_feature_"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L71
            java.lang.String r3 = r3.substring(r5)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> Lcd
            e7.i2 r3 = p072e7.EnumC1635i2.m4229e(r3)     // Catch: java.lang.NumberFormatException -> Lcd
            goto Lce
        Lcd:
            r3 = r0
        Lce:
            java.util.Set<e7.i2> r4 = r11.f7509f
            r4.add(r3)
            goto L71
        Ld4:
            r11.m4141d(r2)
            android.os.Handler r12 = r11.f7508e
            java.lang.String r13 = "null reference"
            java.util.Objects.requireNonNull(r12, r13)
            java.lang.Runnable r12 = r11.f7507d
            java.util.Objects.requireNonNull(r12, r13)
            android.os.Handler r12 = r11.f7508e
            java.lang.Runnable r13 = r11.f7507d
            r12.post(r13)
            return
        Leb:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.util.Map r12 = r12.getAll()
            java.util.Set r12 = r12.keySet()
            java.util.Iterator r12 = r12.iterator()
        Lfc:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L112
            java.lang.Object r14 = r12.next()
            java.lang.String r14 = (java.lang.String) r14
            boolean r0 = r14.startsWith(r1)
            if (r0 == 0) goto Lfc
            r13.add(r14)
            goto Lfc
        L112:
            r13.add(r4)
            r11.m4141d(r13)
            android.content.SharedPreferences r12 = r11.f7505b
            android.content.SharedPreferences$Editor r12 = r12.edit()
            java.lang.String r13 = p072e7.C1576c3.f7502j
            android.content.SharedPreferences$Editor r12 = r12.putString(r2, r13)
            java.lang.String r13 = r11.f7506c
            android.content.SharedPreferences$Editor r12 = r12.putString(r5, r13)
            r12.apply()
            return
    }

    /* renamed from: a */
    public static java.lang.String m4138a(java.lang.String r2, java.lang.String r3) {
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            java.lang.String r2 = "%s%s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    /* renamed from: b */
    public static void m4139b(p072e7.EnumC1635i2 r5) {
            e7.c3 r0 = p072e7.C1576c3.f7503k
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r5.f7634Y
            java.lang.String r1 = java.lang.Integer.toString(r1)
            android.content.SharedPreferences r2 = r0.f7505b
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r1 = r0.m4140c(r1)
            long r3 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = r2.putLong(r1, r3)
            r1.apply()
            java.util.Set<e7.i2> r1 = r0.f7509f
            r1.add(r5)
            android.os.Handler r5 = r0.f7508e
            java.lang.Runnable r0 = r0.f7507d
            r5.post(r0)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sharedPreferences"})
    /* renamed from: c */
    public final java.lang.String m4140c(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "feature_usage_timestamp_reported_feature_"
            java.lang.String r0 = m4138a(r0, r3)
            android.content.SharedPreferences r1 = r2.f7505b
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r0 = "feature_usage_timestamp_detected_feature_"
            java.lang.String r3 = m4138a(r0, r3)
            return r3
    }

    /* renamed from: d */
    public final void m4141d(java.util.Set<java.lang.String> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            android.content.SharedPreferences r0 = r2.f7505b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.remove(r1)
            goto L11
        L21:
            r0.apply()
            return
    }
}

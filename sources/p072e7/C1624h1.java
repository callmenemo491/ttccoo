package p072e7;

/* renamed from: e7.h1 */
/* loaded from: classes.dex */
public final class C1624h1 {

    /* renamed from: g */
    public static final p123h6.C2489b f7573g = null;

    /* renamed from: a */
    public final p072e7.C1662l f7574a;

    /* renamed from: b */
    public final p072e7.C1555a2 f7575b;

    /* renamed from: c */
    public final java.lang.Runnable f7576c;

    /* renamed from: d */
    public final android.os.Handler f7577d;

    /* renamed from: e */
    public final android.content.SharedPreferences f7578e;

    /* renamed from: f */
    public p072e7.C1714q1 f7579f;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "ApplicationAnalytics"
            r0.<init>(r1)
            p072e7.C1624h1.f7573g = r0
            return
    }

    public C1624h1(android.content.SharedPreferences r1, p072e7.C1662l r2, android.os.Bundle r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f7578e = r1
            r0.f7574a = r2
            e7.a2 r1 = new e7.a2
            r1.<init>(r3, r4)
            r0.f7575b = r1
            e7.k r1 = new e7.k
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f7577d = r1
            f6.i r1 = new f6.i
            r1.<init>(r0)
            r0.f7576c = r1
            return
    }

    /* renamed from: a */
    public static void m4210a(p072e7.C1624h1 r1, com.google.android.gms.cast.framework.C1062a r2, int r3) {
            r1.m4213d(r2)
            e7.a2 r2 = r1.f7575b
            e7.q1 r0 = r1.f7579f
            e7.z2 r2 = r2.m4115a(r0, r3)
            e7.l r3 = r1.f7574a
            r0 = 228(0xe4, float:3.2E-43)
            r3.m4321a(r2, r0)
            android.os.Handler r2 = r1.f7577d
            java.lang.Runnable r3 = r1.f7576c
            r2.removeCallbacks(r3)
            r2 = 0
            r1.f7579f = r2
            return
    }

    /* renamed from: b */
    public static void m4211b(p072e7.C1624h1 r4) {
            e7.q1 r0 = r4.f7579f
            android.content.SharedPreferences r4 = r4.f7578e
            java.util.Objects.requireNonNull(r0)
            if (r4 != 0) goto La
            goto L56
        La:
            h6.b r1 = p072e7.C1714q1.f7744i
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.String r3 = "Save the ApplicationAnalyticsSession to SharedPreferences %s"
            r1.m6376a(r3, r2)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r1 = r0.f7746a
            java.lang.String r2 = "application_id"
            r4.putString(r2, r1)
            java.lang.String r1 = r0.f7747b
            java.lang.String r2 = "receiver_metrics_id"
            r4.putString(r2, r1)
            long r1 = r0.f7748c
            java.lang.String r3 = "analytics_session_id"
            r4.putLong(r3, r1)
            int r1 = r0.f7749d
            java.lang.String r2 = "event_sequence_number"
            r4.putInt(r2, r1)
            java.lang.String r1 = r0.f7750e
            java.lang.String r2 = "receiver_session_id"
            r4.putString(r2, r1)
            int r1 = r0.f7751f
            java.lang.String r2 = "device_capabilities"
            r4.putInt(r2, r1)
            java.lang.String r1 = r0.f7752g
            java.lang.String r2 = "device_model_name"
            r4.putString(r2, r1)
            int r0 = r0.f7753h
            java.lang.String r1 = "analytics_session_start_type"
            r4.putInt(r1, r0)
            r4.apply()
        L56:
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: c */
    public static java.lang.String m4212c() {
            h6.b r0 = p052d6.C1295a.f6805i
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            d6.a r1 = p052d6.C1295a.f6807k
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            d6.b r0 = r1.f6812e
            java.lang.String r0 = r0.f6817Y
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"analyticsSession"})
    /* renamed from: d */
    public final void m4213d(com.google.android.gms.cast.framework.C1062a r5) {
            r4 = this;
            boolean r0 = r4.m4215f()
            if (r0 == 0) goto L35
            if (r5 == 0) goto Ld
            com.google.android.gms.cast.CastDevice r5 = r5.m2978j()
            goto Le
        Ld:
            r5 = 0
        Le:
            if (r5 == 0) goto L2d
            e7.q1 r0 = r4.f7579f
            java.lang.String r0 = r0.f7747b
            java.lang.String r1 = r5.f5361j0
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L2d
            e7.q1 r0 = r4.f7579f
            if (r0 != 0) goto L21
            goto L2d
        L21:
            java.lang.String r1 = r5.f5361j0
            r0.f7747b = r1
            int r1 = r5.f5358g0
            r0.f7751f = r1
            java.lang.String r5 = r5.f5354c0
            r0.f7752g = r5
        L2d:
            e7.q1 r5 = r4.f7579f
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r5, r0)
            return
        L35:
            h6.b r0 = p072e7.C1624h1.f7573g
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f11253a
            java.lang.String r3 = "The analyticsSession should not be null for logging. Create a dummy one."
            java.lang.String r0 = r0.m6380e(r3, r1)
            android.util.Log.w(r2, r0)
            r4.m4214e(r5)
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"analyticsSession"})
    /* renamed from: e */
    public final void m4214e(com.google.android.gms.cast.framework.C1062a r8) {
            r7 = this;
            h6.b r0 = p072e7.C1624h1.f7573g
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Create a new ApplicationAnalyticsSession based on CastSession"
            r0.m6376a(r3, r2)
            e7.q1 r0 = new e7.q1
            r0.<init>()
            long r2 = p072e7.C1714q1.f7745j
            r4 = 1
            long r2 = r2 + r4
            p072e7.C1714q1.f7745j = r2
            r7.f7579f = r0
            java.lang.String r2 = m4212c()
            r0.f7746a = r2
            if (r8 != 0) goto L22
            r0 = 0
            goto L26
        L22:
            com.google.android.gms.cast.CastDevice r0 = r8.m2978j()
        L26:
            if (r0 == 0) goto L39
            e7.q1 r2 = r7.f7579f
            if (r2 != 0) goto L2d
            goto L39
        L2d:
            java.lang.String r3 = r0.f5361j0
            r2.f7747b = r3
            int r3 = r0.f5358g0
            r2.f7751f = r3
            java.lang.String r0 = r0.f5354c0
            r2.f7752g = r0
        L39:
            e7.q1 r0 = r7.f7579f
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r0, r2)
            e7.q1 r0 = r7.f7579f
            if (r8 != 0) goto L45
            goto L76
        L45:
            java.lang.String r3 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r3)
            d6.r r3 = r8.f6834a
            if (r3 == 0) goto L76
            int r3 = r3.mo3818d()     // Catch: android.os.RemoteException -> L5e
            r4 = 211100000(0xc952160, float:2.2977172E-31)
            if (r3 < r4) goto L76
            d6.r r8 = r8.f6834a     // Catch: android.os.RemoteException -> L5e
            int r1 = r8.mo3820h()     // Catch: android.os.RemoteException -> L5e
            goto L76
        L5e:
            r8 = move-exception
            h6.b r3 = p052d6.AbstractC1303e.f6833b
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "getSessionStartType"
            r4[r1] = r5
            r5 = 1
            java.lang.Class<d6.r> r6 = p052d6.InterfaceC1329r.class
            java.lang.String r6 = r6.getSimpleName()
            r4[r5] = r6
            java.lang.String r5 = "Unable to call %s on %s."
            r3.m6377b(r8, r5, r4)
        L76:
            r0.f7753h = r1
            e7.q1 r8 = r7.f7579f
            java.util.Objects.requireNonNull(r8, r2)
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"analyticsSession"}, result = true)
    /* renamed from: f */
    public final boolean m4215f() {
            r4 = this;
            e7.q1 r0 = r4.f7579f
            r1 = 0
            if (r0 != 0) goto Lf
            h6.b r0 = p072e7.C1624h1.f7573g
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "The analytics session is null when matching with application ID."
            r0.m6376a(r3, r2)
            return r1
        Lf:
            java.lang.String r0 = m4212c()
            r2 = 1
            if (r0 == 0) goto L2b
            e7.q1 r3 = r4.f7579f
            java.lang.String r3 = r3.f7746a
            if (r3 == 0) goto L2b
            boolean r3 = android.text.TextUtils.equals(r3, r0)
            if (r3 != 0) goto L23
            goto L2b
        L23:
            e7.q1 r0 = r4.f7579f
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            return r2
        L2b:
            h6.b r3 = p072e7.C1624h1.f7573g
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "The analytics session doesn't match the application ID %s"
            r3.m6376a(r0, r2)
            return r1
    }

    /* renamed from: g */
    public final boolean m4216g(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.m4215f()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            e7.q1 r0 = r3.f7579f
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r0, r2)
            r0 = 1
            if (r4 == 0) goto L20
            e7.q1 r2 = r3.f7579f
            java.lang.String r2 = r2.f7750e
            if (r2 == 0) goto L20
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 != 0) goto L1f
            goto L20
        L1f:
            return r0
        L20:
            h6.b r2 = p072e7.C1624h1.f7573g
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            java.lang.String r4 = "The analytics session doesn't match the receiver session ID %s."
            r2.m6376a(r4, r0)
            return r1
    }
}

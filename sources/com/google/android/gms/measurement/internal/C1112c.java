package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c */
/* loaded from: classes.dex */
public final class C1112c extends p249o7.AbstractC5050m4 {

    /* renamed from: w */
    public static final android.util.Pair<java.lang.String, java.lang.Long> f5681w = null;

    /* renamed from: c */
    public android.content.SharedPreferences f5682c;

    /* renamed from: d */
    public p249o7.C5081q3 f5683d;

    /* renamed from: e */
    public final p249o7.C5073p3 f5684e;

    /* renamed from: f */
    public final p249o7.C5089r3 f5685f;

    /* renamed from: g */
    public java.lang.String f5686g;

    /* renamed from: h */
    public boolean f5687h;

    /* renamed from: i */
    public long f5688i;

    /* renamed from: j */
    public final p249o7.C5073p3 f5689j;

    /* renamed from: k */
    public final p249o7.C5057n3 f5690k;

    /* renamed from: l */
    public final p249o7.C5089r3 f5691l;

    /* renamed from: m */
    public final p249o7.C5057n3 f5692m;

    /* renamed from: n */
    public final p249o7.C5073p3 f5693n;

    /* renamed from: o */
    public boolean f5694o;

    /* renamed from: p */
    public final p249o7.C5057n3 f5695p;

    /* renamed from: q */
    public final p249o7.C5057n3 f5696q;

    /* renamed from: r */
    public final p249o7.C5073p3 f5697r;

    /* renamed from: s */
    public final p249o7.C5089r3 f5698s;

    /* renamed from: t */
    public final p249o7.C5089r3 f5699t;

    /* renamed from: u */
    public final p249o7.C5073p3 f5700u;

    /* renamed from: v */
    public final p249o7.C5065o3 f5701v;

    static {
            android.util.Pair r0 = new android.util.Pair
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = ""
            r0.<init>(r2, r1)
            com.google.android.gms.measurement.internal.C1112c.f5681w = r0
            return
    }

    public C1112c(com.google.android.gms.measurement.internal.C1113d r5) {
            r4 = this;
            r4.<init>(r5)
            o7.p3 r5 = new o7.p3
            java.lang.String r0 = "session_timeout"
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            r5.<init>(r4, r0, r1)
            r4.f5689j = r5
            o7.n3 r5 = new o7.n3
            java.lang.String r0 = "start_new_session"
            r1 = 1
            r5.<init>(r4, r0, r1)
            r4.f5690k = r5
            o7.p3 r5 = new o7.p3
            java.lang.String r0 = "last_pause_time"
            r1 = 0
            r5.<init>(r4, r0, r1)
            r4.f5693n = r5
            o7.r3 r5 = new o7.r3
            java.lang.String r0 = "non_personalized_ads"
            r5.<init>(r4, r0)
            r4.f5691l = r5
            o7.n3 r5 = new o7.n3
            java.lang.String r0 = "allow_remote_dynamite"
            r3 = 0
            r5.<init>(r4, r0, r3)
            r4.f5692m = r5
            o7.p3 r5 = new o7.p3
            java.lang.String r0 = "first_open_time"
            r5.<init>(r4, r0, r1)
            r4.f5684e = r5
            java.lang.String r5 = "app_install_time"
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            o7.r3 r5 = new o7.r3
            java.lang.String r0 = "app_instance_id"
            r5.<init>(r4, r0)
            r4.f5685f = r5
            o7.n3 r5 = new o7.n3
            java.lang.String r0 = "app_backgrounded"
            r5.<init>(r4, r0, r3)
            r4.f5695p = r5
            o7.n3 r5 = new o7.n3
            java.lang.String r0 = "deep_link_retrieval_complete"
            r5.<init>(r4, r0, r3)
            r4.f5696q = r5
            o7.p3 r5 = new o7.p3
            java.lang.String r0 = "deep_link_retrieval_attempts"
            r5.<init>(r4, r0, r1)
            r4.f5697r = r5
            o7.r3 r5 = new o7.r3
            java.lang.String r0 = "firebase_feature_rollouts"
            r5.<init>(r4, r0)
            r4.f5698s = r5
            o7.r3 r5 = new o7.r3
            java.lang.String r0 = "deferred_attribution_cache"
            r5.<init>(r4, r0)
            r4.f5699t = r5
            o7.p3 r5 = new o7.p3
            java.lang.String r0 = "deferred_attribution_cache_timestamp"
            r5.<init>(r4, r0, r1)
            r4.f5700u = r5
            o7.o3 r5 = new o7.o3
            r5.<init>(r4)
            r4.f5701v = r5
            return
    }

    @Override // p249o7.AbstractC5050m4
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull.List({@org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.preferences"}), @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: j */
    public final void mo3146j() {
            r5 = this;
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a
            android.content.Context r0 = r0.f5710a
            java.lang.String r1 = "com.google.android.gms.measurement.prefs"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r5.f5682c = r0
            java.lang.String r1 = "has_been_opened"
            boolean r0 = r0.getBoolean(r1, r2)
            r5.f5694o = r0
            if (r0 != 0) goto L24
            android.content.SharedPreferences r0 = r5.f5682c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r2 = 1
            r0.putBoolean(r1, r2)
            r0.apply()
        L24:
            o7.q3 r0 = new o7.q3
            com.google.android.gms.measurement.internal.d r1 = r5.f5736a
            java.util.Objects.requireNonNull(r1)
            r1 = 0
            o7.u2<java.lang.Long> r3 = p249o7.C5120v2.f20086c
            r4 = 0
            java.lang.Object r3 = r3.m11421a(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r1 = java.lang.Math.max(r1, r3)
            r0.<init>(r5, r1)
            r5.f5683d = r0
            return
    }

    @Override // p249o7.AbstractC5050m4
    /* renamed from: k */
    public final boolean mo3138k() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: p */
    public final android.content.SharedPreferences m3147p() {
            r2 = this;
            r2.mo3183i()
            r2.m11315l()
            android.content.SharedPreferences r0 = r2.f5682c
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            android.content.SharedPreferences r0 = r2.f5682c
            return r0
    }

    /* renamed from: q */
    public final p249o7.C4997g m3148q() {
            r3 = this;
            r3.mo3183i()
            android.content.SharedPreferences r0 = r3.m3147p()
            java.lang.String r1 = "consent_settings"
            java.lang.String r2 = "G1"
            java.lang.String r0 = r0.getString(r1, r2)
            o7.g r0 = p249o7.C4997g.m11182b(r0)
            return r0
    }

    /* renamed from: r */
    public final java.lang.Boolean m3149r() {
            r3 = this;
            r3.mo3183i()
            android.content.SharedPreferences r0 = r3.m3147p()
            java.lang.String r1 = "measurement_enabled"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1d
            android.content.SharedPreferences r0 = r3.m3147p()
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1d:
            r0 = 0
            return r0
    }

    /* renamed from: s */
    public final void m3150s(java.lang.Boolean r3) {
            r2 = this;
            r2.mo3183i()
            android.content.SharedPreferences r0 = r2.m3147p()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "measurement_enabled"
            if (r3 == 0) goto L17
            boolean r3 = r3.booleanValue()
            r0.putBoolean(r1, r3)
            goto L1a
        L17:
            r0.remove(r1)
        L1a:
            r0.apply()
            return
    }

    /* renamed from: t */
    public final void m3151t(boolean r4) {
            r3 = this;
            r3.mo3183i()
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r2 = "App measurement setting deferred collection"
            r0.m11170d(r2, r1)
            android.content.SharedPreferences r0 = r3.m3147p()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "deferred_analytics_collection"
            r0.putBoolean(r1, r4)
            r0.apply()
            return
    }

    /* renamed from: u */
    public final boolean m3152u(long r4) {
            r3 = this;
            o7.p3 r0 = r3.f5689j
            long r0 = r0.m11410a()
            long r4 = r4 - r0
            o7.p3 r0 = r3.f5693n
            long r0 = r0.m11410a()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L13
            r4 = 1
            return r4
        L13:
            r4 = 0
            return r4
    }

    /* renamed from: v */
    public final boolean m3153v(int r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.m3147p()
            java.lang.String r1 = "consent_source"
            r2 = 100
            int r0 = r0.getInt(r1, r2)
            boolean r4 = p249o7.C4997g.m11184h(r4, r0)
            return r4
    }
}

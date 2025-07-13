package p249o7;

/* renamed from: o7.w5 */
/* loaded from: classes.dex */
public final class C5131w5 extends p249o7.AbstractC5020i6 {

    /* renamed from: d */
    public java.lang.String f20149d;

    /* renamed from: e */
    public boolean f20150e;

    /* renamed from: f */
    public long f20151f;

    /* renamed from: g */
    public final p249o7.C5073p3 f20152g;

    /* renamed from: h */
    public final p249o7.C5073p3 f20153h;

    /* renamed from: i */
    public final p249o7.C5073p3 f20154i;

    /* renamed from: j */
    public final p249o7.C5073p3 f20155j;

    /* renamed from: k */
    public final p249o7.C5073p3 f20156k;

    public C5131w5(p249o7.C5052m6 r5) {
            r4 = this;
            r4.<init>(r5)
            o7.p3 r5 = new o7.p3
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "last_delete_stale"
            r2 = 0
            r5.<init>(r0, r1, r2)
            r4.f20152g = r5
            o7.p3 r5 = new o7.p3
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "backoff"
            r5.<init>(r0, r1, r2)
            r4.f20153h = r5
            o7.p3 r5 = new o7.p3
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "last_upload"
            r5.<init>(r0, r1, r2)
            r4.f20154i = r5
            o7.p3 r5 = new o7.p3
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "last_upload_attempt"
            r5.<init>(r0, r1, r2)
            r4.f20155j = r5
            o7.p3 r5 = new o7.p3
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "midnight_offset"
            r5.<init>(r0, r1, r2)
            r4.f20156k = r5
            return
    }

    @Override // p249o7.AbstractC5020i6
    /* renamed from: l */
    public final boolean mo11089l() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: m */
    public final android.util.Pair<java.lang.String, java.lang.Boolean> m11439m(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = ""
            r7.mo3183i()
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r3 = r7.f20149d
            if (r3 == 0) goto L29
            long r4 = r7.f20151f
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L1d
            goto L29
        L1d:
            android.util.Pair r8 = new android.util.Pair
            boolean r0 = r7.f20150e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.<init>(r3, r0)
            return r8
        L29:
            com.google.android.gms.measurement.internal.d r3 = r7.f5736a
            o7.f r3 = r3.f5716g
            o7.u2<java.lang.Long> r4 = p249o7.C5120v2.f20084b
            long r3 = r3.m11158r(r8, r4)
            long r3 = r3 + r1
            r7.f20151f = r3
            com.google.android.gms.measurement.internal.d r8 = r7.f5736a     // Catch: java.lang.Exception -> L4b
            android.content.Context r8 = r8.f5710a     // Catch: java.lang.Exception -> L4b
            y5.a$a r8 = p428y5.C7118a.m14228b(r8)     // Catch: java.lang.Exception -> L4b
            r7.f20149d = r0     // Catch: java.lang.Exception -> L4b
            java.lang.String r1 = r8.f27527a     // Catch: java.lang.Exception -> L4b
            if (r1 == 0) goto L46
            r7.f20149d = r1     // Catch: java.lang.Exception -> L4b
        L46:
            boolean r8 = r8.f27528b     // Catch: java.lang.Exception -> L4b
            r7.f20150e = r8     // Catch: java.lang.Exception -> L4b
            goto L5b
        L4b:
            r8 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5679m
            java.lang.String r2 = "Unable to get advertising id"
            r1.m11170d(r2, r8)
            r7.f20149d = r0
        L5b:
            android.util.Pair r8 = new android.util.Pair
            java.lang.String r0 = r7.f20149d
            boolean r1 = r7.f20150e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.<init>(r0, r1)
            return r8
    }

    /* renamed from: n */
    public final android.util.Pair<java.lang.String, java.lang.Boolean> m11440n(java.lang.String r2, p249o7.C4997g r3) {
            r1 = this;
            boolean r3 = r3.m11189f()
            if (r3 == 0) goto Lb
            android.util.Pair r2 = r1.m11439m(r2)
            return r2
        Lb:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.String r0 = ""
            r2.<init>(r0, r3)
            return r2
    }

    @java.lang.Deprecated
    /* renamed from: o */
    public final java.lang.String m11441o(java.lang.String r6) {
            r5 = this;
            r5.mo3183i()
            android.util.Pair r6 = r5.m11439m(r6)
            java.lang.Object r6 = r6.first
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = com.google.android.gms.measurement.internal.C1115f.m3193s(r0)
            if (r0 != 0) goto L15
            r6 = 0
            return r6
        L15:
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.math.BigInteger r4 = new java.math.BigInteger
            byte[] r6 = r6.getBytes()
            byte[] r6 = r0.digest(r6)
            r4.<init>(r2, r6)
            r6 = 0
            r3[r6] = r4
            java.lang.String r6 = "%032X"
            java.lang.String r6 = java.lang.String.format(r1, r6, r3)
            return r6
    }
}

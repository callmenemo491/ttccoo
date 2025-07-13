package p249o7;

/* renamed from: o7.m5 */
/* loaded from: classes.dex */
public final class C5051m5 extends p249o7.AbstractC5097s3 {

    /* renamed from: c */
    public volatile p249o7.C5027j5 f19846c;

    /* renamed from: d */
    public volatile p249o7.C5027j5 f19847d;

    /* renamed from: e */
    public p249o7.C5027j5 f19848e;

    /* renamed from: f */
    public final java.util.Map<android.app.Activity, p249o7.C5027j5> f19849f;

    /* renamed from: g */
    public android.app.Activity f19850g;

    /* renamed from: h */
    public volatile boolean f19851h;

    /* renamed from: i */
    public volatile p249o7.C5027j5 f19852i;

    /* renamed from: j */
    public p249o7.C5027j5 f19853j;

    /* renamed from: k */
    public boolean f19854k;

    /* renamed from: l */
    public final java.lang.Object f19855l;

    /* renamed from: m */
    public java.lang.String f19856m;

    public C5051m5(com.google.android.gms.measurement.internal.C1113d r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f19855l = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f19849f = r1
            return
    }

    @Override // p249o7.AbstractC5097s3
    /* renamed from: l */
    public final boolean mo3130l() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: m */
    public final void m11319m(android.app.Activity r17, p249o7.C5027j5 r18, boolean r19) {
            r16 = this;
            r7 = r16
            r0 = r18
            o7.j5 r1 = r7.f19846c
            if (r1 != 0) goto Lb
            o7.j5 r1 = r7.f19847d
            goto Ld
        Lb:
            o7.j5 r1 = r7.f19846c
        Ld:
            r3 = r1
            java.lang.String r1 = r0.f19788b
            if (r1 != 0) goto L31
            if (r17 == 0) goto L1f
            java.lang.Class r1 = r17.getClass()
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r7.m11323q(r1, r2)
            goto L20
        L1f:
            r1 = 0
        L20:
            r10 = r1
            o7.j5 r1 = new o7.j5
            java.lang.String r9 = r0.f19787a
            long r11 = r0.f19789c
            boolean r13 = r0.f19791e
            long r14 = r0.f19792f
            r8 = r1
            r8.<init>(r9, r10, r11, r13, r14)
            r2 = r1
            goto L32
        L31:
            r2 = r0
        L32:
            o7.j5 r0 = r7.f19846c
            r7.f19847d = r0
            r7.f19846c = r2
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            o7.f4 r8 = r0.mo3160b()
            o7.k5 r9 = new o7.k5
            r0 = r9
            r1 = r16
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r6)
            r8.m11176s(r9)
            return
    }

    /* renamed from: n */
    public final void m11320n(p249o7.C5027j5 r10, p249o7.C5027j5 r11, long r12, boolean r14, android.os.Bundle r15) {
            r9 = this;
            r9.mo3183i()
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L26
            long r2 = r11.f19789c
            long r4 = r10.f19789c
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L26
            java.lang.String r2 = r11.f19788b
            java.lang.String r3 = r10.f19788b
            boolean r2 = com.google.android.gms.measurement.internal.C1115f.m3188Z(r2, r3)
            if (r2 == 0) goto L26
            java.lang.String r2 = r11.f19787a
            java.lang.String r3 = r10.f19787a
            boolean r2 = com.google.android.gms.measurement.internal.C1115f.m3188Z(r2, r3)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = 0
            goto L27
        L26:
            r2 = 1
        L27:
            if (r14 == 0) goto L2e
            o7.j5 r14 = r9.f19848e
            if (r14 == 0) goto L2e
            r0 = 1
        L2e:
            if (r2 == 0) goto Lb9
            android.os.Bundle r8 = new android.os.Bundle
            if (r15 == 0) goto L38
            r8.<init>(r15)
            goto L3b
        L38:
            r8.<init>()
        L3b:
            com.google.android.gms.measurement.internal.C1115f.m3195x(r10, r8, r1)
            if (r11 == 0) goto L59
            java.lang.String r14 = r11.f19787a
            if (r14 == 0) goto L49
            java.lang.String r15 = "_pn"
            r8.putString(r15, r14)
        L49:
            java.lang.String r14 = r11.f19788b
            if (r14 == 0) goto L52
            java.lang.String r15 = "_pc"
            r8.putString(r15, r14)
        L52:
            long r14 = r11.f19789c
            java.lang.String r11 = "_pi"
            r8.putLong(r11, r14)
        L59:
            r14 = 0
            if (r0 == 0) goto L78
            com.google.android.gms.measurement.internal.d r11 = r9.f5736a
            o7.f6 r11 = r11.m3180z()
            o7.d6 r11 = r11.f19691e
            long r2 = r11.f19647b
            long r2 = r12 - r2
            r11.f19647b = r12
            int r11 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r11 <= 0) goto L78
            com.google.android.gms.measurement.internal.d r11 = r9.f5736a
            com.google.android.gms.measurement.internal.f r11 = r11.m3158A()
            r11.m3237v(r8, r2)
        L78:
            com.google.android.gms.measurement.internal.d r11 = r9.f5736a
            o7.f r11 = r11.f5716g
            boolean r11 = r11.m11163w()
            if (r11 != 0) goto L89
            r2 = 1
            java.lang.String r11 = "_mst"
            r8.putLong(r11, r2)
        L89:
            boolean r11 = r10.f19791e
            if (r1 == r11) goto L90
            java.lang.String r11 = "auto"
            goto L92
        L90:
            java.lang.String r11 = "app"
        L92:
            r4 = r11
            com.google.android.gms.measurement.internal.d r11 = r9.f5736a
            u6.c r11 = r11.f5723n
            u6.d r11 = (p353u6.C6341d) r11
            java.util.Objects.requireNonNull(r11)
            long r2 = java.lang.System.currentTimeMillis()
            boolean r11 = r10.f19791e
            if (r11 == 0) goto Lad
            long r5 = r10.f19792f
            int r11 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r11 != 0) goto Lab
            goto Lad
        Lab:
            r6 = r5
            goto Lae
        Lad:
            r6 = r2
        Lae:
            com.google.android.gms.measurement.internal.d r11 = r9.f5736a
            o7.d5 r3 = r11.m3176v()
            java.lang.String r5 = "_vs"
            r3.m11134q(r4, r5, r6, r8)
        Lb9:
            if (r0 == 0) goto Lc0
            o7.j5 r11 = r9.f19848e
            r9.m11321o(r11, r1, r12)
        Lc0:
            r9.f19848e = r10
            boolean r11 = r10.f19791e
            if (r11 == 0) goto Lc8
            r9.f19853j = r10
        Lc8:
            com.google.android.gms.measurement.internal.d r11 = r9.f5736a
            o7.v5 r11 = r11.m3179y()
            r11.mo3183i()
            r11.m11419j()
            h6.a0 r12 = new h6.a0
            r12.<init>(r11, r10)
            r11.m11434u(r12)
            return
    }

    /* renamed from: o */
    public final void m11321o(p249o7.C5027j5 r4, boolean r5, long r6) {
            r3 = this;
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            o7.y1 r0 = r0.m3169n()
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.m11449l(r1)
            r0 = 0
            if (r4 == 0) goto L1f
            boolean r1 = r4.f19790d
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            com.google.android.gms.measurement.internal.d r2 = r3.f5736a
            o7.f6 r2 = r2.m3180z()
            o7.d6 r2 = r2.f19691e
            boolean r5 = r2.m11144a(r1, r5, r6)
            if (r5 == 0) goto L32
            if (r4 == 0) goto L32
            r4.f19790d = r0
        L32:
            return
    }

    /* renamed from: p */
    public final p249o7.C5027j5 m11322p(boolean r1) {
            r0 = this;
            r0.m11419j()
            r0.mo3183i()
            if (r1 != 0) goto Lb
            o7.j5 r1 = r0.f19848e
            return r1
        Lb:
            o7.j5 r1 = r0.f19848e
            if (r1 == 0) goto L10
            return r1
        L10:
            o7.j5 r1 = r0.f19853j
            return r1
    }

    /* renamed from: q */
    public final java.lang.String m11323q(java.lang.Class<?> r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = r2.getCanonicalName()
            if (r2 != 0) goto L9
            java.lang.String r2 = "Activity"
            return r2
        L9:
            java.lang.String r3 = "\\."
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            if (r3 <= 0) goto L17
            int r3 = r3 + (-1)
            r2 = r2[r3]
            goto L19
        L17:
            java.lang.String r2 = ""
        L19:
            int r3 = r2.length()
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            java.util.Objects.requireNonNull(r0)
            r0 = 100
            if (r3 <= r0) goto L30
            com.google.android.gms.measurement.internal.d r3 = r1.f5736a
            java.util.Objects.requireNonNull(r3)
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r0)
        L30:
            return r2
    }

    /* renamed from: r */
    public final void m11324r(android.app.Activity r6, android.os.Bundle r7) {
            r5 = this;
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a
            o7.f r0 = r0.f5716g
            boolean r0 = r0.m11163w()
            if (r0 != 0) goto Lb
            return
        Lb:
            if (r7 != 0) goto Le
            return
        Le:
            java.lang.String r0 = "com.google.app_measurement.screen_service"
            android.os.Bundle r7 = r7.getBundle(r0)
            if (r7 != 0) goto L17
            return
        L17:
            o7.j5 r0 = new o7.j5
            java.lang.String r1 = "name"
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r2 = "referrer_name"
            java.lang.String r2 = r7.getString(r2)
            java.lang.String r3 = "id"
            long r3 = r7.getLong(r3)
            r0.<init>(r1, r2, r3)
            java.util.Map<android.app.Activity, o7.j5> r7 = r5.f19849f
            r7.put(r6, r0)
            return
    }

    /* renamed from: s */
    public final void m11325s(java.lang.String r1, p249o7.C5027j5 r2) {
            r0 = this;
            r0.mo3183i()
            monitor-enter(r0)
            java.lang.String r2 = r0.f19856m     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto Lf
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto Lf
            goto L11
        Lf:
            r0.f19856m = r1     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    /* renamed from: t */
    public final p249o7.C5027j5 m11326t(android.app.Activity r6) {
            r5 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            java.util.Map<android.app.Activity, o7.j5> r0 = r5.f19849f
            java.lang.Object r0 = r0.get(r6)
            o7.j5 r0 = (p249o7.C5027j5) r0
            if (r0 != 0) goto L2f
            java.lang.Class r0 = r6.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r0 = r5.m11323q(r0, r1)
            o7.j5 r1 = new o7.j5
            r2 = 0
            com.google.android.gms.measurement.internal.d r3 = r5.f5736a
            com.google.android.gms.measurement.internal.f r3 = r3.m3158A()
            long r3 = r3.m3227o0()
            r1.<init>(r2, r0, r3)
            java.util.Map<android.app.Activity, o7.j5> r0 = r5.f19849f
            r0.put(r6, r1)
            r0 = r1
        L2f:
            o7.j5 r6 = r5.f19852i
            if (r6 == 0) goto L36
            o7.j5 r6 = r5.f19852i
            return r6
        L36:
            return r0
    }
}

package p249o7;

/* renamed from: o7.d5 */
/* loaded from: classes.dex */
public final class C4979d5 extends p249o7.AbstractC5097s3 {

    /* renamed from: c */
    public p249o7.C4971c5 f19632c;

    /* renamed from: d */
    public androidx.appcompat.widget.C0311x f19633d;

    /* renamed from: e */
    public final java.util.Set<p249o7.InterfaceC5090r4> f19634e;

    /* renamed from: f */
    public boolean f19635f;

    /* renamed from: g */
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> f19636g;

    /* renamed from: h */
    public final java.lang.Object f19637h;

    /* renamed from: i */
    public p249o7.C4997g f19638i;

    /* renamed from: j */
    public int f19639j;

    /* renamed from: k */
    public final java.util.concurrent.atomic.AtomicLong f19640k;

    /* renamed from: l */
    public long f19641l;

    /* renamed from: m */
    public int f19642m;

    /* renamed from: n */
    public final p249o7.C5132w6 f19643n;

    /* renamed from: o */
    public boolean f19644o;

    /* renamed from: p */
    public final p249o7.InterfaceC5100s6 f19645p;

    public C4979d5(com.google.android.gms.measurement.internal.C1113d r4) {
            r3 = this;
            r3.<init>(r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r3.f19634e = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f19637h = r0
            r0 = 1
            r3.f19644o = r0
            o7.z3 r0 = new o7.z3
            r0.<init>(r3)
            r3.f19645p = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.f19636g = r0
            o7.g r0 = new o7.g
            r1 = 0
            r0.<init>(r1, r1)
            r3.f19638i = r0
            r0 = 100
            r3.f19639j = r0
            r1 = -1
            r3.f19641l = r1
            r3.f19642m = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r3.f19640k = r0
            o7.w6 r0 = new o7.w6
            r0.<init>(r4)
            r3.f19643n = r0
            return
    }

    /* renamed from: H */
    public static void m11120H(p249o7.C4979d5 r3, p249o7.C4997g r4, int r5, long r6, boolean r8, boolean r9) {
            r3.mo3183i()
            r3.m11419j()
            long r0 = r3.f19641l
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L23
            int r0 = r3.f19642m
            boolean r0 = p249o7.C4997g.m11184h(r0, r5)
            if (r0 != 0) goto L15
            goto L23
        L15:
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5678l
            java.lang.String r5 = "Dropped out-of-date consent setting, proposed settings"
            r3.m11170d(r5, r4)
            return
        L23:
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            r0.mo3183i()
            boolean r1 = r0.m3153v(r5)
            if (r1 == 0) goto L90
            android.content.SharedPreferences r0 = r0.m3147p()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r4 = r4.m11188e()
            java.lang.String r1 = "consent_settings"
            r0.putString(r1, r4)
            java.lang.String r4 = "consent_source"
            r0.putInt(r4, r5)
            r0.apply()
            r3.f19641l = r6
            r3.f19642m = r5
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            o7.v5 r4 = r4.m3179y()
            r4.mo3183i()
            r4.m11419j()
            if (r8 == 0) goto L6b
            r4.m11435v()
            com.google.android.gms.measurement.internal.d r5 = r4.f5736a
            o7.b3 r5 = r5.m3173r()
            r5.m11107n()
        L6b:
            boolean r5 = r4.m11429p()
            if (r5 == 0) goto L7f
            r5 = 0
            o7.u6 r5 = r4.m11431r(r5)
            o7.p5 r6 = new o7.p5
            r7 = 3
            r6.<init>(r4, r5, r7)
            r4.m11434u(r6)
        L7f:
            if (r9 == 0) goto L8f
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.v5 r3 = r3.m3179y()
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            r3.m11438z(r4)
        L8f:
            return
        L90:
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5678l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.String r5 = "Lower precedence consent source ignored, proposed source"
            r3.m11170d(r5, r4)
            return
    }

    /* renamed from: A */
    public final void m11121A(java.lang.Object r9) {
            r8 = this;
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_ldl"
            r5 = 1
            r1 = r8
            r4 = r9
            r1.m11122B(r2, r3, r4, r5, r6)
            return
    }

    /* renamed from: B */
    public final void m11122B(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
            r15 = this;
            r6 = r15
            r2 = r17
            r0 = r18
            if (r16 != 0) goto La
            java.lang.String r1 = "app"
            goto Lc
        La:
            r1 = r16
        Lc:
            r3 = 6
            r4 = 0
            r5 = 24
            if (r19 == 0) goto L1e
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a
            com.google.android.gms.measurement.internal.f r3 = r3.m3158A()
            int r3 = r3.m3225l0(r2)
            r11 = r3
            goto L49
        L1e:
            com.google.android.gms.measurement.internal.d r7 = r6.f5736a
            com.google.android.gms.measurement.internal.f r7 = r7.m3158A()
            java.lang.String r8 = "user property"
            boolean r9 = r7.m3212Q(r8, r2)
            if (r9 != 0) goto L2e
        L2c:
            r11 = 6
            goto L49
        L2e:
            java.lang.String[] r9 = p249o7.C5082q4.f19963a
            r10 = 0
            boolean r9 = r7.m3208M(r8, r9, r10, r2)
            if (r9 != 0) goto L3c
            r3 = 15
            r11 = 15
            goto L49
        L3c:
            com.google.android.gms.measurement.internal.d r9 = r7.f5736a
            java.util.Objects.requireNonNull(r9)
            boolean r7 = r7.m3207L(r8, r5, r2)
            if (r7 != 0) goto L48
            goto L2c
        L48:
            r11 = 0
        L49:
            r3 = 1
            if (r11 == 0) goto L73
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            com.google.android.gms.measurement.internal.d r1 = r6.f5736a
            java.util.Objects.requireNonNull(r1)
            java.lang.String r13 = r0.m3232r(r2, r5, r3)
            if (r2 == 0) goto L63
            int r4 = r17.length()
            r14 = r4
            goto L64
        L63:
            r14 = 0
        L64:
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a
            com.google.android.gms.measurement.internal.f r8 = r0.m3158A()
            o7.s6 r9 = r6.f19645p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.m3196A(r9, r10, r11, r12, r13, r14)
            return
        L73:
            if (r0 == 0) goto Lc8
            com.google.android.gms.measurement.internal.d r7 = r6.f5736a
            com.google.android.gms.measurement.internal.f r7 = r7.m3158A()
            int r11 = r7.m3221h0(r2, r0)
            if (r11 == 0) goto Lb3
            com.google.android.gms.measurement.internal.d r1 = r6.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            com.google.android.gms.measurement.internal.d r7 = r6.f5736a
            java.util.Objects.requireNonNull(r7)
            java.lang.String r13 = r1.m3232r(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L9b
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L99
            goto L9b
        L99:
            r14 = 0
            goto La4
        L9b:
            java.lang.String r0 = java.lang.String.valueOf(r18)
            int r4 = r0.length()
            r14 = r4
        La4:
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a
            com.google.android.gms.measurement.internal.f r8 = r0.m3158A()
            o7.s6 r9 = r6.f19645p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.m3196A(r9, r10, r11, r12, r13, r14)
            return
        Lb3:
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a
            com.google.android.gms.measurement.internal.f r3 = r3.m3158A()
            java.lang.Object r5 = r3.m3230q(r2, r0)
            if (r5 == 0) goto Lc7
            r0 = r15
            r2 = r17
            r3 = r20
            r0.m11138u(r1, r2, r3, r5)
        Lc7:
            return
        Lc8:
            r5 = 0
            r0 = r15
            r2 = r17
            r3 = r20
            r0.m11138u(r1, r2, r3, r5)
            return
    }

    /* renamed from: C */
    public final void m11123C(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
            r9 = this;
            com.google.android.gms.common.internal.C1101a.m3100e(r10)
            com.google.android.gms.common.internal.C1101a.m3100e(r11)
            r9.mo3183i()
            r9.m11419j()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            r1 = 1
            java.lang.String r2 = "_npa"
            if (r0 == 0) goto L65
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L53
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L53
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r3 = 1
            if (r1 == r11) goto L37
            r5 = 0
            goto L38
        L37:
            r5 = r3
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.r3 r0 = r0.f5691l
            long r5 = r11.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L4e
            java.lang.String r12 = "true"
        L4e:
            r0.m11417b(r12)
            r7 = r11
            goto L63
        L53:
            if (r12 != 0) goto L65
            com.google.android.gms.measurement.internal.d r11 = r9.f5736a
            com.google.android.gms.measurement.internal.c r11 = r11.m3175t()
            o7.r3 r11 = r11.f5691l
            java.lang.String r0 = "unset"
            r11.m11417b(r0)
            r7 = r12
        L63:
            r4 = r2
            goto L67
        L65:
            r4 = r11
            r7 = r12
        L67:
            com.google.android.gms.measurement.internal.d r11 = r9.f5736a
            boolean r11 = r11.m3165g()
            if (r11 != 0) goto L7d
            com.google.android.gms.measurement.internal.d r10 = r9.f5736a
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()
            o7.f3 r10 = r10.f5680n
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.m11169c(r11)
            return
        L7d:
            com.google.android.gms.measurement.internal.d r11 = r9.f5736a
            boolean r11 = r11.m3167i()
            if (r11 != 0) goto L86
            return
        L86:
            o7.p6 r11 = new o7.p6
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.d r10 = r9.f5736a
            o7.v5 r10 = r10.m3179y()
            r10.mo3183i()
            r10.m11419j()
            r10.m11435v()
            com.google.android.gms.measurement.internal.d r12 = r10.f5736a
            o7.b3 r12 = r12.m3173r()
            java.util.Objects.requireNonNull(r12)
            android.os.Parcel r13 = android.os.Parcel.obtain()
            r14 = 0
            p249o7.C5084q6.m11414a(r11, r13, r14)
            byte[] r0 = r13.marshall()
            r13.recycle()
            int r13 = r0.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r13 <= r2) goto Lc8
            com.google.android.gms.measurement.internal.d r12 = r12.f5736a
            com.google.android.gms.measurement.internal.b r12 = r12.mo3162d()
            o7.f3 r12 = r12.f5673g
            java.lang.String r13 = "User property too long for local database. Sending directly to service"
            r12.m11169c(r13)
            goto Lcc
        Lc8:
            boolean r14 = r12.m11109p(r1, r0)
        Lcc:
            o7.u6 r12 = r10.m11431r(r1)
            o7.o5 r13 = new o7.o5
            r13.<init>(r10, r12, r14, r11)
            r10.m11434u(r13)
            return
    }

    /* renamed from: D */
    public final void m11124D(android.os.Bundle r4, long r5) {
            r3 = this;
            p185k7.C3991t9.m9017c()
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            o7.f r0 = r0.f5716g
            r1 = 0
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20115q0
            boolean r0 = r0.m11162v(r1, r2)
            if (r0 == 0) goto L2f
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            com.google.android.gms.measurement.internal.a r0 = r0.m3172q()
            java.lang.String r0 = r0.m3133o()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            goto L2f
        L21:
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5677k
            java.lang.String r5 = "Using developer consent only; google app id found"
            r4.m11169c(r5)
            return
        L2f:
            r0 = 0
            r3.m11140w(r4, r0, r5)
            return
    }

    /* renamed from: E */
    public final void m11125E(java.lang.Boolean r3, boolean r4) {
            r2 = this;
            r2.mo3183i()
            r2.m11419j()
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r1 = "Setting app measurement enabled (FE)"
            r0.m11170d(r1, r3)
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            r0.m3150s(r3)
            if (r4 == 0) goto L43
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            com.google.android.gms.measurement.internal.c r4 = r4.m3175t()
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            r4.mo3183i()
            android.content.SharedPreferences r4 = r4.m3147p()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r0 = "measurement_enabled_from_api"
            if (r3 == 0) goto L3d
            boolean r1 = r3.booleanValue()
            r4.putBoolean(r0, r1)
            goto L40
        L3d:
            r4.remove(r0)
        L40:
            r4.apply()
        L43:
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            o7.f4 r0 = r4.mo3160b()
            r0.mo3183i()
            boolean r4 = r4.f5706D
            if (r4 != 0) goto L5a
            if (r3 == 0) goto L59
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L59
            goto L5a
        L59:
            return
        L5a:
            r2.m11126F()
            return
    }

    /* renamed from: F */
    public final void m11126F() {
            r10 = this;
            r10.mo3183i()
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.r3 r0 = r0.f5691l
            java.lang.String r0 = r0.m11416a()
            r1 = 1
            if (r0 == 0) goto L57
            java.lang.String r2 = "unset"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L31
            r6 = 0
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "app"
            java.lang.String r5 = "_npa"
            r3 = r10
            r3.m11123C(r4, r5, r6, r7)
            goto L57
        L31:
            java.lang.String r2 = "true"
            boolean r0 = r2.equals(r0)
            if (r1 == r0) goto L3c
            r2 = 0
            goto L3e
        L3c:
            r2 = 1
        L3e:
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "app"
            java.lang.String r6 = "_npa"
            r4 = r10
            r4.m11123C(r5, r6, r7, r8)
        L57:
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            boolean r0 = r0.m3165g()
            if (r0 == 0) goto L9d
            boolean r0 = r10.f19644o
            if (r0 == 0) goto L9d
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r2 = "Recording app launch after enabling measurement for the first time (FE)"
            r0.m11169c(r2)
            r10.m11128I()
            p185k7.C4069z9.m9168c()
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            o7.f r0 = r0.f5716g
            r2 = 0
            o7.u2<java.lang.Boolean> r3 = p249o7.C5120v2.f20101j0
            boolean r0 = r0.m11162v(r2, r3)
            if (r0 == 0) goto L8e
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            o7.f6 r0 = r0.m3180z()
            o7.e6 r0 = r0.f19690d
            r0.m11147a()
        L8e:
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.t4 r2 = new o7.t4
            r2.<init>(r10, r1)
            r0.m11176s(r2)
            return
        L9d:
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r2 = "Updating Scion state (FE)"
            r0.m11169c(r2)
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            o7.v5 r0 = r0.m3179y()
            r0.mo3183i()
            r0.m11419j()
            o7.u6 r1 = r0.m11431r(r1)
            o7.p5 r2 = new o7.p5
            r3 = 2
            r2.<init>(r0, r1, r3)
            r0.m11434u(r2)
            return
    }

    /* renamed from: G */
    public final java.lang.String m11127G() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = r1.f19636g
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    /* renamed from: I */
    public final void m11128I() {
            r8 = this;
            r8.mo3183i()
            r8.m11419j()
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            boolean r0 = r0.m3167i()
            if (r0 == 0) goto Ld3
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            o7.f r0 = r0.f5716g
            o7.u2<java.lang.Boolean> r1 = p249o7.C5120v2.f20081Z
            r2 = 0
            boolean r0 = r0.m11162v(r2, r1)
            r1 = 0
            if (r0 == 0) goto L4e
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            o7.f r0 = r0.f5716g
            com.google.android.gms.measurement.internal.d r3 = r0.f5736a
            java.util.Objects.requireNonNull(r3)
            java.lang.String r3 = "google_analytics_deferred_deep_link_enabled"
            java.lang.Boolean r0 = r0.m11160t(r3)
            if (r0 == 0) goto L4e
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4e
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r3 = "Deferred Deep Link feature enabled."
            r0.m11169c(r3)
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.t4 r3 = new o7.t4
            r3.<init>(r8, r1)
            r0.m11176s(r3)
        L4e:
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            o7.v5 r0 = r0.m3179y()
            r0.mo3183i()
            r0.m11419j()
            r3 = 1
            o7.u6 r4 = r0.m11431r(r3)
            com.google.android.gms.measurement.internal.d r5 = r0.f5736a
            o7.b3 r5 = r5.m3173r()
            byte[] r6 = new byte[r1]
            r7 = 3
            r5.m11109p(r7, r6)
            o7.p5 r5 = new o7.p5
            r5.<init>(r0, r4, r3)
            r0.m11434u(r5)
            r8.f19644o = r1
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            r0.mo3183i()
            android.content.SharedPreferences r1 = r0.m3147p()
            java.lang.String r3 = "previous_os_version"
            java.lang.String r1 = r1.getString(r3, r2)
            com.google.android.gms.measurement.internal.d r2 = r0.f5736a
            o7.l r2 = r2.m3171p()
            r2.m11315l()
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto Lad
            boolean r4 = r2.equals(r1)
            if (r4 != 0) goto Lad
            android.content.SharedPreferences r0 = r0.m3147p()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putString(r3, r2)
            r0.apply()
        Lad:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Ld3
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            o7.l r0 = r0.m3171p()
            r0.m11315l()
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto Ld3
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "_po"
            r0.putString(r2, r1)
            java.lang.String r1 = "auto"
            java.lang.String r2 = "_ou"
            r8.m11133p(r1, r2, r0)
        Ld3:
            return
    }

    /* renamed from: J */
    public final void m11129J(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
            r4 = this;
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.System.currentTimeMillis()
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "name"
            r2.putString(r3, r5)
            java.lang.String r5 = "creation_timestamp"
            r2.putLong(r5, r0)
            if (r6 == 0) goto L2b
            java.lang.String r5 = "expired_event_name"
            r2.putString(r5, r6)
            java.lang.String r5 = "expired_event_params"
            r2.putBundle(r5, r7)
        L2b:
            com.google.android.gms.measurement.internal.d r5 = r4.f5736a
            o7.f4 r5 = r5.mo3160b()
            o7.v4 r6 = new o7.v4
            r7 = 2
            r6.<init>(r4, r2, r7)
            r5.m11176s(r6)
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
    public final void m11130m() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            android.content.Context r0 = r0.f5710a
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto L1f
            o7.c5 r0 = r2.f19632c
            if (r0 == 0) goto L1f
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            android.content.Context r0 = r0.f5710a
            android.content.Context r0 = r0.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            o7.c5 r1 = r2.f19632c
            r0.unregisterActivityLifecycleCallbacks(r1)
        L1f:
            return
    }

    /* renamed from: n */
    public final void m11131n(java.lang.String r10, java.lang.String r11, android.os.Bundle r12) {
            r9 = this;
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r7 = java.lang.System.currentTimeMillis()
            r5 = 1
            r6 = 1
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.m11132o(r2, r3, r4, r5, r6, r7)
            return
    }

    /* renamed from: o */
    public final void m11132o(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
            r20 = this;
            r11 = r20
            if (r21 != 0) goto L8
            java.lang.String r0 = "app"
            r2 = r0
            goto La
        L8:
            r2 = r21
        La:
            if (r23 != 0) goto L12
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            goto L14
        L12:
            r0 = r23
        L14:
            java.lang.String r1 = "screen_view"
            r3 = r22
            boolean r1 = com.google.android.gms.measurement.internal.C1115f.m3188Z(r3, r1)
            r4 = 0
            if (r1 == 0) goto L143
            com.google.android.gms.measurement.internal.d r1 = r11.f5736a
            o7.m5 r1 = r1.m3178x()
            java.lang.Object r5 = r1.f19855l
            monitor-enter(r5)
            boolean r2 = r1.f19854k     // Catch: java.lang.Throwable -> L140
            if (r2 != 0) goto L3c
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: java.lang.Throwable -> L140
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L140
            o7.f3 r0 = r0.f5677k     // Catch: java.lang.Throwable -> L140
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r0.m11169c(r1)     // Catch: java.lang.Throwable -> L140
        L39:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L140
            goto L13f
        L3c:
            java.lang.String r2 = "screen_name"
            java.lang.String r13 = r0.getString(r2)     // Catch: java.lang.Throwable -> L140
            r2 = 100
            if (r13 == 0) goto L6d
            int r3 = r13.length()     // Catch: java.lang.Throwable -> L140
            if (r3 <= 0) goto L57
            int r3 = r13.length()     // Catch: java.lang.Throwable -> L140
            com.google.android.gms.measurement.internal.d r6 = r1.f5736a     // Catch: java.lang.Throwable -> L140
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L140
            if (r3 <= r2) goto L6d
        L57:
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: java.lang.Throwable -> L140
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L140
            o7.f3 r0 = r0.f5677k     // Catch: java.lang.Throwable -> L140
            java.lang.String r1 = "Invalid screen name length for screen view. Length"
            int r2 = r13.length()     // Catch: java.lang.Throwable -> L140
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L140
            r0.m11170d(r1, r2)     // Catch: java.lang.Throwable -> L140
            goto L39
        L6d:
            java.lang.String r3 = "screen_class"
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> L140
            if (r3 == 0) goto L9c
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L140
            if (r6 <= 0) goto L86
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L140
            com.google.android.gms.measurement.internal.d r7 = r1.f5736a     // Catch: java.lang.Throwable -> L140
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> L140
            if (r6 <= r2) goto L9c
        L86:
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: java.lang.Throwable -> L140
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L140
            o7.f3 r0 = r0.f5677k     // Catch: java.lang.Throwable -> L140
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L140
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L140
            r0.m11170d(r1, r2)     // Catch: java.lang.Throwable -> L140
            goto L39
        L9c:
            if (r3 != 0) goto Lb1
            android.app.Activity r2 = r1.f19850g     // Catch: java.lang.Throwable -> L140
            if (r2 == 0) goto Lad
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L140
            java.lang.String r3 = "Activity"
            java.lang.String r2 = r1.m11323q(r2, r3)     // Catch: java.lang.Throwable -> L140
            goto Laf
        Lad:
            java.lang.String r2 = "Activity"
        Laf:
            r14 = r2
            goto Lb2
        Lb1:
            r14 = r3
        Lb2:
            o7.j5 r2 = r1.f19846c     // Catch: java.lang.Throwable -> L140
            boolean r3 = r1.f19851h     // Catch: java.lang.Throwable -> L140
            if (r3 == 0) goto Ldb
            if (r2 == 0) goto Ldb
            r1.f19851h = r4     // Catch: java.lang.Throwable -> L140
            java.lang.String r3 = r2.f19788b     // Catch: java.lang.Throwable -> L140
            boolean r3 = com.google.android.gms.measurement.internal.C1115f.m3188Z(r3, r14)     // Catch: java.lang.Throwable -> L140
            java.lang.String r2 = r2.f19787a     // Catch: java.lang.Throwable -> L140
            boolean r2 = com.google.android.gms.measurement.internal.C1115f.m3188Z(r2, r13)     // Catch: java.lang.Throwable -> L140
            if (r3 == 0) goto Ldb
            if (r2 == 0) goto Ldb
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: java.lang.Throwable -> L140
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L140
            o7.f3 r0 = r0.f5677k     // Catch: java.lang.Throwable -> L140
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r0.m11169c(r1)     // Catch: java.lang.Throwable -> L140
            goto L39
        Ldb:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L140
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5680n
            if (r13 != 0) goto Le9
            java.lang.String r3 = "null"
            goto Lea
        Le9:
            r3 = r13
        Lea:
            if (r14 != 0) goto Lef
            java.lang.String r4 = "null"
            goto Lf0
        Lef:
            r4 = r14
        Lf0:
            java.lang.String r5 = "Logging screen view with name, class"
            r2.m11171e(r5, r3, r4)
            o7.j5 r2 = r1.f19846c
            if (r2 != 0) goto Lfc
            o7.j5 r2 = r1.f19847d
            goto Lfe
        Lfc:
            o7.j5 r2 = r1.f19846c
        Lfe:
            o7.j5 r3 = new o7.j5
            com.google.android.gms.measurement.internal.d r4 = r1.f5736a
            com.google.android.gms.measurement.internal.f r4 = r4.m3158A()
            long r15 = r4.m3227o0()
            r17 = 1
            r12 = r3
            r18 = r26
            r12.<init>(r13, r14, r15, r17, r18)
            r1.f19846c = r3
            r1.f19847d = r2
            r1.f19852i = r3
            com.google.android.gms.measurement.internal.d r4 = r1.f5736a
            u6.c r4 = r4.f5723n
            u6.d r4 = (p353u6.C6341d) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.measurement.internal.d r6 = r1.f5736a
            o7.f4 r6 = r6.mo3160b()
            o7.k4 r7 = new o7.k4
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r3
            r25 = r2
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r6.m11176s(r7)
        L13f:
            return
        L140:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L140
            throw r0
        L143:
            r1 = 1
            if (r25 == 0) goto L153
            androidx.appcompat.widget.x r5 = r11.f19633d
            if (r5 == 0) goto L153
            boolean r5 = com.google.android.gms.measurement.internal.C1115f.m3184V(r22)
            if (r5 == 0) goto L151
            goto L153
        L151:
            r8 = 0
            goto L154
        L153:
            r8 = 1
        L154:
            r10 = 0
            r1 = r20
            r3 = r22
            r4 = r26
            r6 = r0
            r7 = r25
            r9 = r24
            r1.m11137t(r2, r3, r4, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: p */
    public final void m11133p(java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
            r7 = this;
            r7.mo3183i()
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r4 = java.lang.System.currentTimeMillis()
            r1 = r7
            r2 = r8
            r3 = r9
            r6 = r10
            r1.m11134q(r2, r3, r4, r6)
            return
    }

    /* renamed from: q */
    public final void m11134q(java.lang.String r12, java.lang.String r13, long r14, android.os.Bundle r16) {
            r11 = this;
            r11.mo3183i()
            r10 = r11
            androidx.appcompat.widget.x r0 = r10.f19633d
            r1 = 1
            if (r0 == 0) goto L13
            boolean r0 = com.google.android.gms.measurement.internal.C1115f.m3184V(r13)
            if (r0 == 0) goto L10
            goto L13
        L10:
            r0 = 0
            r7 = 0
            goto L14
        L13:
            r7 = 1
        L14:
            r6 = 1
            r8 = 1
            r9 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r0.m11135r(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: r */
    public final void m11135r(java.lang.String r25, java.lang.String r26, long r27, android.os.Bundle r29, boolean r30, boolean r31, boolean r32, java.lang.String r33) {
            r24 = this;
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r12 = r29
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.C1101a.m3100e(r25)
            java.lang.String r13 = "null reference"
            java.util.Objects.requireNonNull(r12, r13)
            r24.mo3183i()
            r24.m11419j()
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            boolean r1 = r1.m3165g()
            if (r1 == 0) goto L57c
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.a r1 = r1.m3172q()
            java.util.List<java.lang.String> r1 = r1.f5664i
            if (r1 == 0) goto L41
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L33
            goto L41
        L33:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.m11171e(r1, r9, r8)
            return
        L41:
            boolean r1 = r7.f19635f
            r14 = 0
            r15 = 1
            r5 = 0
            if (r1 != 0) goto L93
            r7.f19635f = r15
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a     // Catch: java.lang.ClassNotFoundException -> L86
            boolean r2 = r1.f5714e     // Catch: java.lang.ClassNotFoundException -> L86
            if (r2 != 0) goto L5b
            android.content.Context r1 = r1.f5710a     // Catch: java.lang.ClassNotFoundException -> L86
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L86
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch: java.lang.ClassNotFoundException -> L86
            goto L5f
        L5b:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L86
        L5f:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch: java.lang.Exception -> L77
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r5] = r2     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch: java.lang.Exception -> L77
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch: java.lang.Exception -> L77
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a     // Catch: java.lang.Exception -> L77
            android.content.Context r2 = r2.f5710a     // Catch: java.lang.Exception -> L77
            r1[r5] = r2     // Catch: java.lang.Exception -> L77
            r0.invoke(r14, r1)     // Catch: java.lang.Exception -> L77
            goto L93
        L77:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a     // Catch: java.lang.ClassNotFoundException -> L86
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.ClassNotFoundException -> L86
            o7.f3 r1 = r1.f5675i     // Catch: java.lang.ClassNotFoundException -> L86
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.m11170d(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L86
            goto L93
        L86:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5678l
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.m11169c(r1)
        L93:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto Lc6
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto Lc6
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            java.util.Objects.requireNonNull(r1)
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r24
            r14 = 0
            r5 = r16
            r1.m11123C(r2, r3, r4, r5)
            goto Lc7
        Lc6:
            r14 = 0
        Lc7:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            java.util.Objects.requireNonNull(r0)
            if (r30 == 0) goto Lee
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.C1115f.f5738h
            r0 = r0[r14]
            boolean r0 = r0.equals(r9)
            r0 = r0 ^ r15
            if (r0 == 0) goto Lee
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            o7.o3 r1 = r1.f5701v
            android.os.Bundle r1 = r1.m11376a()
            r0.m3239y(r12, r1)
        Lee:
            r0 = 40
            if (r32 != 0) goto L173
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L173
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            java.lang.String r2 = "event"
            boolean r3 = r1.m3212Q(r2, r9)
            r5 = 2
            if (r3 != 0) goto L10f
            goto L129
        L10f:
            java.lang.String[] r3 = p249o7.C5066o4.f19921a
            java.lang.String[] r4 = p249o7.C5066o4.f19922b
            boolean r3 = r1.m3208M(r2, r3, r4, r9)
            if (r3 != 0) goto L11c
            r5 = 13
            goto L129
        L11c:
            com.google.android.gms.measurement.internal.d r3 = r1.f5736a
            java.util.Objects.requireNonNull(r3)
            boolean r1 = r1.m3207L(r2, r0, r9)
            if (r1 != 0) goto L128
            goto L129
        L128:
            r5 = 0
        L129:
            if (r5 == 0) goto L173
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5674h
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            o7.c3 r2 = r2.f5722m
            java.lang.String r2 = r2.m11116d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.m11170d(r3, r2)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            java.util.Objects.requireNonNull(r2)
            java.lang.String r0 = r1.m3232r(r9, r0, r15)
            if (r9 == 0) goto L156
            int r1 = r26.length()
            r14 = r1
        L156:
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            o7.s6 r2 = r7.f19645p
            r3 = 0
            java.lang.String r4 = "_ev"
            r25 = r1
            r26 = r2
            r27 = r3
            r28 = r5
            r29 = r4
            r30 = r0
            r31 = r14
            r25.m3196A(r26, r27, r28, r29, r30, r31)
            return
        L173:
            k7.nb r1 = p185k7.C3915nb.f16780Z
            k7.ob r1 = r1.m8849b()
            r1.mo8872a()
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            o7.f r1 = r1.f5716g
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20125v0
            r3 = 0
            boolean r1 = r1.m11162v(r3, r2)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L1a9
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            o7.m5 r1 = r1.m3178x()
            o7.j5 r1 = r1.m11322p(r14)
            if (r1 == 0) goto L1a4
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L1a4
            r1.f19790d = r15
        L1a4:
            if (r30 == 0) goto L1c8
            if (r32 != 0) goto L1c8
            goto L1c6
        L1a9:
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            o7.m5 r1 = r1.m3178x()
            o7.j5 r1 = r1.m11322p(r14)
            if (r1 == 0) goto L1c2
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L1c2
            r1.f19790d = r15
        L1c2:
            if (r30 == 0) goto L1c8
            if (r32 != 0) goto L1c8
        L1c6:
            r5 = 1
            goto L1c9
        L1c8:
            r5 = 0
        L1c9:
            com.google.android.gms.measurement.internal.C1115f.m3195x(r1, r12, r5)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C1115f.m3184V(r26)
            if (r30 == 0) goto L230
            androidx.appcompat.widget.x r4 = r7.f19633d
            if (r4 == 0) goto L230
            if (r3 != 0) goto L230
            if (r1 == 0) goto L1e3
            r16 = 1
            goto L232
        L1e3:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            o7.c3 r1 = r1.f5722m
            java.lang.String r1 = r1.m11116d(r9)
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            o7.c3 r2 = r2.f5722m
            java.lang.String r2 = r2.m11114b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.m11171e(r3, r1, r2)
            androidx.appcompat.widget.x r0 = r7.f19633d
            java.util.Objects.requireNonNull(r0, r13)
            androidx.appcompat.widget.x r13 = r7.f19633d
            java.util.Objects.requireNonNull(r13)
            java.lang.Object r0 = r13.f1481Z     // Catch: android.os.RemoteException -> L21b
            r1 = r0
            k7.u0 r1 = (p185k7.InterfaceC3995u0) r1     // Catch: android.os.RemoteException -> L21b
            r2 = r25
            r3 = r26
            r4 = r29
            r5 = r27
            r1.mo8752U(r2, r3, r4, r5)     // Catch: android.os.RemoteException -> L21b
            goto L22f
        L21b:
            r0 = move-exception
            java.lang.Object r1 = r13.f1482a0
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f5656a
            if (r1 == 0) goto L22f
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5675i
            java.lang.String r2 = "Event interceptor threw exception"
            r1.m11170d(r2, r0)
        L22f:
            return
        L230:
            r16 = r1
        L232:
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            boolean r1 = r1.m3167i()
            if (r1 == 0) goto L57b
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            int r1 = r1.m3222i0(r9)
            if (r1 == 0) goto L28d
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5674h
            com.google.android.gms.measurement.internal.d r3 = r7.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.m11170d(r4, r3)
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            com.google.android.gms.measurement.internal.f r2 = r2.m3158A()
            com.google.android.gms.measurement.internal.d r3 = r7.f5736a
            java.util.Objects.requireNonNull(r3)
            java.lang.String r0 = r2.m3232r(r9, r0, r15)
            if (r9 == 0) goto L271
            int r5 = r26.length()
            r14 = r5
        L271:
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            com.google.android.gms.measurement.internal.f r2 = r2.m3158A()
            o7.s6 r3 = r7.f19645p
            java.lang.String r4 = "_ev"
            r25 = r2
            r26 = r3
            r27 = r33
            r28 = r1
            r29 = r4
            r30 = r0
            r31 = r14
            r25.m3196A(r26, r27, r28, r29, r30, r31)
            return
        L28d:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            r2 = r33
            r3 = r26
            r4 = r29
            r6 = r32
            android.os.Bundle r12 = r1.m3234s0(r2, r3, r4, r5, r6)
            java.util.Objects.requireNonNull(r12, r13)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            o7.m5 r1 = r1.m3178x()
            o7.j5 r1 = r1.m11322p(r14)
            r5 = 0
            java.lang.String r13 = "_ae"
            if (r1 == 0) goto L2f9
            boolean r1 = r13.equals(r9)
            if (r1 == 0) goto L2f9
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            o7.f6 r1 = r1.m3180z()
            o7.d6 r1 = r1.f19691e
            o7.f6 r2 = r1.f19649d
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            u6.c r2 = r2.f5723n
            u6.d r2 = (p353u6.C6341d) r2
            java.util.Objects.requireNonNull(r2)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r14 = r1.f19647b
            long r14 = r2 - r14
            r1.f19647b = r2
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 <= 0) goto L2f9
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            r1.m3237v(r12, r14)
        L2f9:
            p185k7.C3952q9.m8914c()
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            o7.f r1 = r1.f5716g
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20099i0
            r14 = 0
            boolean r1 = r1.m11162v(r14, r2)
            if (r1 == 0) goto L380
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L35f
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L35f
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            java.lang.String r3 = r12.getString(r2)
            boolean r2 = p353u6.C6347j.m12999b(r3)
            if (r2 == 0) goto L32d
            r3 = r14
            goto L333
        L32d:
            if (r3 == 0) goto L333
            java.lang.String r3 = r3.trim()
        L333:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            com.google.android.gms.measurement.internal.c r2 = r2.m3175t()
            o7.r3 r2 = r2.f5698s
            java.lang.String r2 = r2.m11416a()
            boolean r2 = com.google.android.gms.measurement.internal.C1115f.m3188Z(r3, r2)
            if (r2 != 0) goto L351
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            o7.r3 r1 = r1.f5698s
            r1.m11417b(r3)
            goto L380
        L351:
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.m11169c(r1)
            return
        L35f:
            boolean r1 = r13.equals(r9)
            if (r1 == 0) goto L380
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            o7.r3 r1 = r1.f5698s
            java.lang.String r1 = r1.m11416a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L380
            r12.putString(r2, r1)
        L380:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r15.add(r12)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            o7.p3 r1 = r1.f5693n
            long r1 = r1.m11410a()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L408
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            boolean r1 = r1.m3152u(r10)
            if (r1 == 0) goto L408
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            o7.n3 r1 = r1.f5695p
            boolean r1 = r1.m11370b()
            if (r1 == 0) goto L408
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5680n
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.m11169c(r2)
            r4 = 0
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r18 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r1 = r24
            r29 = r15
            r14 = r5
            r5 = r18
            r1.m11123C(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r24
            r1.m11123C(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r24
            r1.m11123C(r2, r3, r4, r5)
            goto L40b
        L408:
            r29 = r15
            r14 = r5
        L40b:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r14)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L430
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5680n
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.m11169c(r2)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            o7.f6 r1 = r1.m3180z()
            o7.e6 r1 = r1.f19690d
            r2 = 1
            r1.m11148b(r10, r2)
        L430:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r5 = 0
        L441:
            if (r5 >= r2) goto L48c
            java.lang.Object r3 = r1.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L489
            com.google.android.gms.measurement.internal.d r4 = r7.f5736a
            r4.m3158A()
            java.lang.Object r4 = r12.get(r3)
            boolean r6 = r4 instanceof android.os.Bundle
            if (r6 == 0) goto L461
            r6 = 1
            android.os.Bundle[] r14 = new android.os.Bundle[r6]
            android.os.Bundle r4 = (android.os.Bundle) r4
            r6 = 0
            r14[r6] = r4
            goto L484
        L461:
            boolean r6 = r4 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L46f
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            int r6 = r4.length
            java.lang.Class<android.os.Bundle[]> r14 = android.os.Bundle[].class
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6, r14)
            goto L47f
        L46f:
            boolean r6 = r4 instanceof java.util.ArrayList
            if (r6 == 0) goto L483
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r6 = r4.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r4 = r4.toArray(r6)
        L47f:
            android.os.Bundle[] r4 = (android.os.Bundle[]) r4
            r14 = r4
            goto L484
        L483:
            r14 = 0
        L484:
            if (r14 == 0) goto L489
            r12.putParcelableArray(r3, r14)
        L489:
            int r5 = r5 + 1
            goto L441
        L48c:
            r12 = 0
        L48d:
            int r1 = r29.size()
            if (r12 >= r1) goto L54a
            r14 = r29
            java.lang.Object r1 = r14.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L4a0
            java.lang.String r2 = "_ep"
            goto L4a1
        L4a0:
            r2 = r9
        L4a1:
            r1.putString(r0, r8)
            if (r31 == 0) goto L4b0
            com.google.android.gms.measurement.internal.d r3 = r7.f5736a
            com.google.android.gms.measurement.internal.f r3 = r3.m3158A()
            android.os.Bundle r1 = r3.m3233r0(r1)
        L4b0:
            r15 = r1
            o7.q r5 = new o7.q
            o7.o r3 = new o7.o
            r3.<init>(r15)
            r1 = r5
            r4 = r25
            r30 = r0
            r0 = r5
            r5 = r27
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            o7.v5 r1 = r1.m3179y()
            java.util.Objects.requireNonNull(r1)
            r1.mo3183i()
            r1.m11419j()
            r1.m11435v()
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            o7.b3 r2 = r2.m3173r()
            java.util.Objects.requireNonNull(r2)
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r4 = 0
            p249o7.C5085r.m11415a(r0, r3, r4)
            byte[] r4 = r3.marshall()
            r3.recycle()
            int r3 = r4.length
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r5) goto L503
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5673g
            java.lang.String r3 = "Event is too long for local database. Sending event directly to service"
            r2.m11169c(r3)
            r2 = 1
            r21 = 0
            goto L50b
        L503:
            r3 = 0
            boolean r5 = r2.m11109p(r3, r4)
            r21 = r5
            r2 = 1
        L50b:
            o7.u6 r20 = r1.m11431r(r2)
            j6.g r2 = new j6.g
            r18 = r2
            r19 = r1
            r22 = r0
            r23 = r33
            r18.<init>(r19, r20, r21, r22, r23)
            r1.m11434u(r2)
            if (r16 != 0) goto L542
            java.util.Set<o7.r4> r0 = r7.f19634e
            java.util.Iterator r0 = r0.iterator()
        L527:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L542
            java.lang.Object r1 = r0.next()
            o7.r4 r1 = (p249o7.InterfaceC5090r4) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r15)
            r2 = r25
            r3 = r26
            r5 = r27
            r1.mo11418a(r2, r3, r4, r5)
            goto L527
        L542:
            int r12 = r12 + 1
            r0 = r30
            r29 = r14
            goto L48d
        L54a:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            o7.m5 r0 = r0.m3178x()
            r1 = 0
            o7.j5 r0 = r0.m11322p(r1)
            if (r0 == 0) goto L57b
            boolean r0 = r13.equals(r9)
            if (r0 == 0) goto L57b
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            o7.f6 r0 = r0.m3180z()
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            o7.d6 r0 = r0.f19691e
            r3 = 1
            r0.m11144a(r3, r3, r1)
        L57b:
            return
        L57c:
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.m11169c(r1)
            return
    }

    /* renamed from: s */
    public final void m11136s(long r6, boolean r8) {
            r5 = this;
            r5.mo3183i()
            r5.m11419j()
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r1 = "Resetting analytics data (FE)"
            r0.m11169c(r1)
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a
            o7.f6 r0 = r0.m3180z()
            r0.mo3183i()
            o7.d6 r0 = r0.f19691e
            o7.k r1 = r0.f19648c
            r1.m11284a()
            r1 = 0
            r0.f19646a = r1
            r0.f19647b = r1
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a
            boolean r0 = r0.m3165g()
            com.google.android.gms.measurement.internal.d r3 = r5.f5736a
            com.google.android.gms.measurement.internal.c r3 = r3.m3175t()
            o7.p3 r4 = r3.f5684e
            r4.m11411b(r6)
            com.google.android.gms.measurement.internal.d r6 = r3.f5736a
            com.google.android.gms.measurement.internal.c r6 = r6.m3175t()
            o7.r3 r6 = r6.f5698s
            java.lang.String r6 = r6.m11416a()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 0
            if (r6 != 0) goto L52
            o7.r3 r6 = r3.f5698s
            r6.m11417b(r7)
        L52:
            p185k7.C4069z9.m9168c()
            com.google.android.gms.measurement.internal.d r6 = r3.f5736a
            o7.f r6 = r6.f5716g
            o7.u2<java.lang.Boolean> r4 = p249o7.C5120v2.f20101j0
            boolean r6 = r6.m11162v(r7, r4)
            if (r6 == 0) goto L66
            o7.p3 r6 = r3.f5693n
            r6.m11411b(r1)
        L66:
            com.google.android.gms.measurement.internal.d r6 = r3.f5736a
            o7.f r6 = r6.f5716g
            boolean r6 = r6.m11164x()
            if (r6 != 0) goto L75
            r6 = r0 ^ 1
            r3.m3151t(r6)
        L75:
            o7.r3 r6 = r3.f5699t
            r6.m11417b(r7)
            o7.p3 r6 = r3.f5700u
            r6.m11411b(r1)
            o7.o3 r6 = r3.f5701v
            r6.m11377b(r7)
            if (r8 == 0) goto Lab
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a
            o7.v5 r6 = r6.m3179y()
            r6.mo3183i()
            r6.m11419j()
            r8 = 0
            o7.u6 r1 = r6.m11431r(r8)
            r6.m11435v()
            com.google.android.gms.measurement.internal.d r2 = r6.f5736a
            o7.b3 r2 = r2.m3173r()
            r2.m11107n()
            o7.p5 r2 = new o7.p5
            r2.<init>(r6, r1, r8)
            r6.m11434u(r2)
        Lab:
            p185k7.C4069z9.m9168c()
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a
            o7.f r6 = r6.f5716g
            boolean r6 = r6.m11162v(r7, r4)
            if (r6 == 0) goto Lc3
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a
            o7.f6 r6 = r6.m3180z()
            o7.e6 r6 = r6.f19690d
            r6.m11147a()
        Lc3:
            r6 = r0 ^ 1
            r5.f19644o = r6
            return
    }

    /* renamed from: t */
    public final void m11137t(java.lang.String r15, java.lang.String r16, long r17, android.os.Bundle r19, boolean r20, boolean r21, boolean r22, java.lang.String r23) {
            r14 = this;
            android.os.Bundle r6 = new android.os.Bundle
            r0 = r19
            r6.<init>(r0)
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            boolean r3 = r2 instanceof android.os.Bundle
            if (r3 == 0) goto L2e
            android.os.Bundle r3 = new android.os.Bundle
            android.os.Bundle r2 = (android.os.Bundle) r2
            r3.<init>(r2)
            r6.putBundle(r1, r3)
            goto Lf
        L2e:
            boolean r1 = r2 instanceof android.os.Parcelable[]
            r3 = 0
            if (r1 == 0) goto L4a
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
        L35:
            int r1 = r2.length
            if (r3 >= r1) goto Lf
            r1 = r2[r3]
            boolean r4 = r1 instanceof android.os.Bundle
            if (r4 == 0) goto L47
            android.os.Bundle r4 = new android.os.Bundle
            android.os.Bundle r1 = (android.os.Bundle) r1
            r4.<init>(r1)
            r2[r3] = r4
        L47:
            int r3 = r3 + 1
            goto L35
        L4a:
            boolean r1 = r2 instanceof java.util.List
            if (r1 == 0) goto Lf
            java.util.List r2 = (java.util.List) r2
        L50:
            int r1 = r2.size()
            if (r3 >= r1) goto Lf
            java.lang.Object r1 = r2.get(r3)
            boolean r4 = r1 instanceof android.os.Bundle
            if (r4 == 0) goto L68
            android.os.Bundle r4 = new android.os.Bundle
            android.os.Bundle r1 = (android.os.Bundle) r1
            r4.<init>(r1)
            r2.set(r3, r4)
        L68:
            int r3 = r3 + 1
            goto L50
        L6b:
            r11 = r14
            com.google.android.gms.measurement.internal.d r0 = r11.f5736a
            o7.f4 r12 = r0.mo3160b()
            o7.y4 r13 = new o7.y4
            r10 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r7 = r20
            r8 = r21
            r9 = r22
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            r12.m11176s(r13)
            return
    }

    /* renamed from: u */
    public final void m11138u(java.lang.String r10, java.lang.String r11, long r12, java.lang.Object r14) {
            r9 = this;
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.k4 r8 = new o7.k4
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r14
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.m11176s(r8)
            return
    }

    /* renamed from: v */
    public final void m11139v(android.os.Bundle r13, long r14) {
            r12 = this;
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r13, r2)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>(r13)
            java.lang.String r13 = "app_id"
            java.lang.String r4 = r3.getString(r13)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L27
            com.google.android.gms.measurement.internal.d r4 = r12.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.String r5 = "Package name should be null when calling setConditionalUserProperty"
            r4.m11169c(r5)
        L27:
            r3.remove(r13)
            r4 = 0
            p124h7.C2939x3.m7292r(r3, r13, r1, r4)
            java.lang.String r13 = "origin"
            p124h7.C2939x3.m7292r(r3, r13, r1, r4)
            java.lang.String r5 = "name"
            p124h7.C2939x3.m7292r(r3, r5, r1, r4)
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.String r7 = "value"
            p124h7.C2939x3.m7292r(r3, r7, r6, r4)
            java.lang.String r6 = "trigger_event_name"
            p124h7.C2939x3.m7292r(r3, r6, r1, r4)
            r8 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "trigger_timeout"
            p124h7.C2939x3.m7292r(r3, r9, r0, r8)
            java.lang.String r10 = "timed_out_event_name"
            p124h7.C2939x3.m7292r(r3, r10, r1, r4)
            java.lang.Class<android.os.Bundle> r10 = android.os.Bundle.class
            java.lang.String r11 = "timed_out_event_params"
            p124h7.C2939x3.m7292r(r3, r11, r10, r4)
            java.lang.String r10 = "triggered_event_name"
            p124h7.C2939x3.m7292r(r3, r10, r1, r4)
            java.lang.Class<android.os.Bundle> r10 = android.os.Bundle.class
            java.lang.String r11 = "triggered_event_params"
            p124h7.C2939x3.m7292r(r3, r11, r10, r4)
            java.lang.String r10 = "time_to_live"
            p124h7.C2939x3.m7292r(r3, r10, r0, r8)
            java.lang.String r0 = "expired_event_name"
            p124h7.C2939x3.m7292r(r3, r0, r1, r4)
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.String r1 = "expired_event_params"
            p124h7.C2939x3.m7292r(r3, r1, r0, r4)
            java.lang.String r0 = r3.getString(r5)
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            java.lang.String r13 = r3.getString(r13)
            com.google.android.gms.common.internal.C1101a.m3100e(r13)
            java.lang.Object r13 = r3.get(r7)
            java.util.Objects.requireNonNull(r13, r2)
            java.lang.String r13 = "creation_timestamp"
            r3.putLong(r13, r14)
            java.lang.String r13 = r3.getString(r5)
            java.lang.Object r14 = r3.get(r7)
            com.google.android.gms.measurement.internal.d r15 = r12.f5736a
            com.google.android.gms.measurement.internal.f r15 = r15.m3158A()
            int r15 = r15.m3225l0(r13)
            if (r15 != 0) goto L166
            com.google.android.gms.measurement.internal.d r15 = r12.f5736a
            com.google.android.gms.measurement.internal.f r15 = r15.m3158A()
            int r15 = r15.m3221h0(r13, r14)
            if (r15 != 0) goto L150
            com.google.android.gms.measurement.internal.d r15 = r12.f5736a
            com.google.android.gms.measurement.internal.f r15 = r15.m3158A()
            java.lang.Object r15 = r15.m3230q(r13, r14)
            if (r15 != 0) goto Ld4
            com.google.android.gms.measurement.internal.d r15 = r12.f5736a
            com.google.android.gms.measurement.internal.b r15 = r15.mo3162d()
            o7.f3 r15 = r15.f5672f
            com.google.android.gms.measurement.internal.d r0 = r12.f5736a
            o7.c3 r0 = r0.f5722m
            java.lang.String r13 = r0.m11118f(r13)
            java.lang.String r0 = "Unable to normalize conditional user property value"
            r15.m11171e(r0, r13, r14)
            return
        Ld4:
            p124h7.C2939x3.m7298x(r3, r15)
            long r14 = r3.getLong(r9)
            java.lang.String r0 = r3.getString(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r4 = 15552000000(0x39ef8b000, double:7.683708924E-314)
            if (r0 != 0) goto L114
            com.google.android.gms.measurement.internal.d r0 = r12.f5736a
            java.util.Objects.requireNonNull(r0)
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 > 0) goto Lfa
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 < 0) goto Lfa
            goto L114
        Lfa:
            com.google.android.gms.measurement.internal.d r0 = r12.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            com.google.android.gms.measurement.internal.d r1 = r12.f5736a
            o7.c3 r1 = r1.f5722m
            java.lang.String r13 = r1.m11118f(r13)
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            java.lang.String r15 = "Invalid conditional user property timeout"
            r0.m11171e(r15, r13, r14)
            return
        L114:
            long r14 = r3.getLong(r10)
            com.google.android.gms.measurement.internal.d r0 = r12.f5736a
            java.util.Objects.requireNonNull(r0)
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 > 0) goto L136
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L126
            goto L136
        L126:
            com.google.android.gms.measurement.internal.d r13 = r12.f5736a
            o7.f4 r13 = r13.mo3160b()
            o7.v4 r14 = new o7.v4
            r15 = 1
            r14.<init>(r12, r3, r15)
            r13.m11176s(r14)
            return
        L136:
            com.google.android.gms.measurement.internal.d r0 = r12.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            com.google.android.gms.measurement.internal.d r1 = r12.f5736a
            o7.c3 r1 = r1.f5722m
            java.lang.String r13 = r1.m11118f(r13)
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            java.lang.String r15 = "Invalid conditional user property time to live"
            r0.m11171e(r15, r13, r14)
            return
        L150:
            com.google.android.gms.measurement.internal.d r15 = r12.f5736a
            com.google.android.gms.measurement.internal.b r15 = r15.mo3162d()
            o7.f3 r15 = r15.f5672f
            com.google.android.gms.measurement.internal.d r0 = r12.f5736a
            o7.c3 r0 = r0.f5722m
            java.lang.String r13 = r0.m11118f(r13)
            java.lang.String r0 = "Invalid conditional user property value"
            r15.m11171e(r0, r13, r14)
            return
        L166:
            com.google.android.gms.measurement.internal.d r14 = r12.f5736a
            com.google.android.gms.measurement.internal.b r14 = r14.mo3162d()
            o7.f3 r14 = r14.f5672f
            com.google.android.gms.measurement.internal.d r15 = r12.f5736a
            o7.c3 r15 = r15.f5722m
            java.lang.String r13 = r15.m11118f(r13)
            java.lang.String r15 = "Invalid conditional user property name"
            r14.m11170d(r15, r13)
            return
    }

    /* renamed from: w */
    public final void m11140w(android.os.Bundle r4, int r5, long r6) {
            r3 = this;
            r3.m11419j()
            java.lang.String r0 = "ad_storage"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L11
            java.lang.Boolean r1 = p249o7.C4997g.m11186k(r0)
            if (r1 == 0) goto L21
        L11:
            java.lang.String r0 = "analytics_storage"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L20
            java.lang.Boolean r1 = p249o7.C4997g.m11186k(r0)
            if (r1 != 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == 0) goto L3d
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5677k
            java.lang.String r2 = "Ignoring invalid consent setting"
            r1.m11170d(r2, r0)
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5677k
            java.lang.String r1 = "Valid consent values are 'granted', 'denied'"
            r0.m11169c(r1)
        L3d:
            o7.g r4 = p249o7.C4997g.m11181a(r4)
            r3.m11141x(r4, r5, r6)
            return
    }

    /* renamed from: x */
    public final void m11141x(p249o7.C4997g r15, int r16, long r17) {
            r14 = this;
            r10 = r14
            r0 = r15
            r6 = r16
            r14.m11419j()
            r1 = -10
            if (r6 == r1) goto L22
            java.lang.Boolean r2 = r0.f19694a
            if (r2 != 0) goto L22
            java.lang.Boolean r2 = r0.f19695b
            if (r2 == 0) goto L14
            goto L22
        L14:
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5677k
            java.lang.String r1 = "Discarding empty consent settings"
            r0.m11169c(r1)
            return
        L22:
            java.lang.Object r2 = r10.f19637h
            monitor-enter(r2)
            int r3 = r10.f19639j     // Catch: java.lang.Throwable -> Le0
            boolean r3 = p249o7.C4997g.m11184h(r6, r3)     // Catch: java.lang.Throwable -> Le0
            r4 = 0
            r11 = 1
            if (r3 == 0) goto L60
            o7.g r3 = r10.f19638i     // Catch: java.lang.Throwable -> Le0
            boolean r3 = r15.m11191i(r3)     // Catch: java.lang.Throwable -> Le0
            boolean r5 = r15.m11190g()     // Catch: java.lang.Throwable -> Le0
            if (r5 == 0) goto L44
            o7.g r5 = r10.f19638i     // Catch: java.lang.Throwable -> Le0
            boolean r5 = r5.m11190g()     // Catch: java.lang.Throwable -> Le0
            if (r5 != 0) goto L44
            r4 = 1
        L44:
            o7.g r5 = r10.f19638i     // Catch: java.lang.Throwable -> Le0
            o7.g r7 = new o7.g     // Catch: java.lang.Throwable -> Le0
            java.lang.Boolean r8 = r0.f19694a     // Catch: java.lang.Throwable -> Le0
            if (r8 != 0) goto L4e
            java.lang.Boolean r8 = r5.f19694a     // Catch: java.lang.Throwable -> Le0
        L4e:
            java.lang.Boolean r0 = r0.f19695b     // Catch: java.lang.Throwable -> Le0
            if (r0 != 0) goto L54
            java.lang.Boolean r0 = r5.f19695b     // Catch: java.lang.Throwable -> Le0
        L54:
            r7.<init>(r8, r0)     // Catch: java.lang.Throwable -> Le0
            r10.f19638i = r7     // Catch: java.lang.Throwable -> Le0
            r10.f19639j = r6     // Catch: java.lang.Throwable -> Le0
            r0 = r3
            r9 = r4
            r3 = r7
            r4 = 1
            goto L63
        L60:
            r3 = r0
            r0 = 0
            r9 = 0
        L63:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le0
            if (r4 != 0) goto L74
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5678l
            java.lang.String r1 = "Ignoring lower-priority consent settings, proposed settings"
            r0.m11170d(r1, r3)
            return
        L74:
            java.util.concurrent.atomic.AtomicLong r2 = r10.f19640k
            long r7 = r2.getAndIncrement()
            if (r0 == 0) goto La1
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = r10.f19636g
            r1 = 0
            r0.set(r1)
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.a5 r12 = new o7.a5
            r1 = r12
            r2 = r14
            r4 = r17
            r6 = r16
            r1.<init>(r2, r3, r4, r6, r7, r9)
            r0.m11315l()
            o7.d4 r1 = new o7.d4
            java.lang.String r2 = "Task exception on worker thread"
            r1.<init>(r0, r12, r11, r2)
            r0.m11179v(r1)
            return
        La1:
            r0 = 30
            if (r6 == r0) goto Lbf
            if (r6 != r1) goto La8
            goto Lbf
        La8:
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.b5 r11 = new o7.b5
            r12 = 1
            r1 = r11
            r2 = r14
            r4 = r16
            r5 = r7
            r7 = r9
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r7, r8)
            r0.m11176s(r11)
            return
        Lbf:
            com.google.android.gms.measurement.internal.d r0 = r10.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.b5 r12 = new o7.b5
            r13 = 0
            r1 = r12
            r2 = r14
            r4 = r16
            r5 = r7
            r7 = r9
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r7, r8)
            r0.m11315l()
            o7.d4 r1 = new o7.d4
            java.lang.String r2 = "Task exception on worker thread"
            r1.<init>(r0, r12, r11, r2)
            r0.m11179v(r1)
            return
        Le0:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le0
            throw r0
    }

    /* renamed from: y */
    public final void m11142y(androidx.appcompat.widget.C0311x r3) {
            r2 = this;
            r2.mo3183i()
            r2.m11419j()
            if (r3 == 0) goto L16
            androidx.appcompat.widget.x r0 = r2.f19633d
            if (r3 == r0) goto L16
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r1 = "EventInterceptor already set."
            com.google.android.gms.common.internal.C1101a.m3106k(r0, r1)
        L16:
            r2.f19633d = r3
            return
    }

    /* renamed from: z */
    public final void m11143z(p249o7.C4997g r6) {
            r5 = this;
            r5.mo3183i()
            boolean r0 = r6.m11190g()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L11
            boolean r6 = r6.m11189f()
            if (r6 != 0) goto L1d
        L11:
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a
            o7.v5 r6 = r6.m3179y()
            boolean r6 = r6.m11429p()
            if (r6 == 0) goto L1f
        L1d:
            r6 = 1
            goto L20
        L1f:
            r6 = 0
        L20:
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a
            o7.f4 r3 = r0.mo3160b()
            r3.mo3183i()
            boolean r0 = r0.f5706D
            if (r6 == r0) goto L6e
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a
            o7.f4 r3 = r0.mo3160b()
            r3.mo3183i()
            r0.f5706D = r6
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            com.google.android.gms.measurement.internal.d r3 = r0.f5736a
            r0.mo3183i()
            android.content.SharedPreferences r3 = r0.m3147p()
            java.lang.String r4 = "measurement_enabled_from_api"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L5c
            android.content.SharedPreferences r0 = r0.m3147p()
            boolean r0 = r0.getBoolean(r4, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r6 == 0) goto L67
            if (r0 == 0) goto L67
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6e
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.m11125E(r6, r2)
        L6e:
            return
    }
}

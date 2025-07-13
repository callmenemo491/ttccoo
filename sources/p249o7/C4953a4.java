package p249o7;

/* renamed from: o7.a4 */
/* loaded from: classes.dex */
public final class C4953a4 extends p249o7.AbstractC5020i6 implements p249o7.InterfaceC4981e {

    /* renamed from: d */
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> f19565d;

    /* renamed from: e */
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> f19566e;

    /* renamed from: f */
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> f19567f;

    /* renamed from: g */
    public final java.util.Map<java.lang.String, p185k7.C3853j2> f19568g;

    /* renamed from: h */
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> f19569h;

    /* renamed from: i */
    public final p319s.C5939f<java.lang.String, p185k7.C3878l0> f19570i;

    /* renamed from: j */
    public final p249o7.C5153z3 f19571j;

    /* renamed from: k */
    public final java.util.Map<java.lang.String, java.lang.String> f19572k;

    public C4953a4(p249o7.C5052m6 r1) {
            r0 = this;
            r0.<init>(r1)
            s.a r1 = new s.a
            r1.<init>()
            r0.f19565d = r1
            s.a r1 = new s.a
            r1.<init>()
            r0.f19566e = r1
            s.a r1 = new s.a
            r1.<init>()
            r0.f19567f = r1
            s.a r1 = new s.a
            r1.<init>()
            r0.f19568g = r1
            s.a r1 = new s.a
            r1.<init>()
            r0.f19572k = r1
            s.a r1 = new s.a
            r1.<init>()
            r0.f19569h = r1
            o7.y3 r1 = new o7.y3
            r1.<init>(r0)
            r0.f19570i = r1
            o7.z3 r1 = new o7.z3
            r1.<init>(r0)
            r0.f19571j = r1
            return
    }

    /* renamed from: z */
    public static final java.util.Map<java.lang.String, java.lang.String> m11087z(p185k7.C3853j2 r3) {
            s.a r0 = new s.a
            r0.<init>()
            java.util.List r3 = r3.m8716C()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            k7.l2 r1 = (p185k7.C3880l2) r1
            java.lang.String r2 = r1.m8789t()
            java.lang.String r1 = r1.m8790u()
            r0.put(r2, r1)
            goto Ld
        L25:
            return r0
    }

    @Override // p249o7.InterfaceC4981e
    /* renamed from: a */
    public final java.lang.String mo11088a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.mo3183i()
            r1.m11101x(r2)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r1.f19565d
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L17
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L17:
            r2 = 0
            return r2
    }

    @Override // p249o7.AbstractC5020i6
    /* renamed from: l */
    public final boolean mo11089l() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: m */
    public final int m11090m(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.mo3183i()
            r1.m11101x(r2)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r1.f19569h
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            r0 = 1
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L1a
            return r0
        L1a:
            int r2 = r2.intValue()
            return r2
        L1f:
            return r0
    }

    /* renamed from: n */
    public final p185k7.C3853j2 m11091n(java.lang.String r2) {
            r1 = this;
            r1.m11247j()
            r1.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.m11101x(r2)
            java.util.Map<java.lang.String, k7.j2> r0 = r1.f19568g
            java.lang.Object r2 = r0.get(r2)
            k7.j2 r2 = (p185k7.C3853j2) r2
            return r2
    }

    /* renamed from: o */
    public final boolean m11092o(java.lang.String r1) {
            r0 = this;
            r0.mo3183i()
            k7.j2 r1 = r0.m11091n(r1)
            if (r1 != 0) goto Lb
            r1 = 0
            return r1
        Lb:
            boolean r1 = r1.m8717F()
            return r1
    }

    /* renamed from: p */
    public final boolean m11093p(java.lang.String r4) {
            r3 = this;
            p185k7.C3792eb.m8525c()
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            o7.f r0 = r0.f5716g
            r1 = 0
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20119s0
            boolean r0 = r0.m11162v(r1, r2)
            r1 = 0
            if (r0 == 0) goto L2b
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L18
            return r1
        L18:
            java.util.Map<java.lang.String, k7.j2> r0 = r3.f19568g
            java.lang.Object r4 = r0.get(r4)
            k7.j2 r4 = (p185k7.C3853j2) r4
            if (r4 != 0) goto L23
            return r1
        L23:
            int r4 = r4.m8720s()
            if (r4 == 0) goto L2b
            r4 = 1
            return r4
        L2b:
            return r1
    }

    /* renamed from: q */
    public final boolean m11094q(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "measurement.upload.blacklist_internal"
            java.lang.String r2 = r1.mo11088a(r2, r0)
            java.lang.String r0 = "1"
            boolean r2 = r0.equals(r2)
            return r2
    }

    /* renamed from: r */
    public final boolean m11095r(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r2.mo3183i()
            r2.m11101x(r3)
            java.lang.String r0 = "ecommerce_purchase"
            boolean r0 = r0.equals(r4)
            r1 = 1
            if (r0 == 0) goto L10
            return r1
        L10:
            java.lang.String r0 = "purchase"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "refund"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L21
            goto L3b
        L21:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r2.f19567f
            java.lang.Object r3 = r0.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            r0 = 0
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r3.get(r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 != 0) goto L35
            return r0
        L35:
            boolean r3 = r3.booleanValue()
            return r3
        L3a:
            return r0
        L3b:
            return r1
    }

    /* renamed from: s */
    public final boolean m11096s(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r3.mo3183i()
            r3.m11101x(r4)
            java.lang.String r0 = "measurement.upload.blacklist_internal"
            java.lang.String r0 = r3.mo11088a(r4, r0)
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 == 0) goto L1d
            boolean r0 = com.google.android.gms.measurement.internal.C1115f.m3184V(r5)
            if (r0 != 0) goto L1c
            goto L1d
        L1c:
            return r2
        L1d:
            java.lang.String r0 = "measurement.upload.blacklist_public"
            java.lang.String r0 = r3.mo11088a(r4, r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L31
            boolean r0 = com.google.android.gms.measurement.internal.C1115f.m3185W(r5)
            if (r0 != 0) goto L30
            goto L31
        L30:
            return r2
        L31:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r3.f19566e
            java.lang.Object r4 = r0.get(r4)
            java.util.Map r4 = (java.util.Map) r4
            r0 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r4.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 != 0) goto L45
            return r0
        L45:
            boolean r4 = r4.booleanValue()
            return r4
        L4a:
            return r0
    }

    /* renamed from: t */
    public final boolean m11097t(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "measurement.upload.blacklist_public"
            java.lang.String r2 = r1.mo11088a(r2, r0)
            java.lang.String r0 = "1"
            boolean r2 = r0.equals(r2)
            return r2
    }

    /* renamed from: u */
    public final boolean m11098u(java.lang.String r27, byte[] r28, java.lang.String r29) {
            r26 = this;
            r1 = r26
            r2 = r27
            r26.m11247j()
            r26.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r27)
            k7.j2 r0 = r26.m11099v(r27, r28)
            k7.a6 r0 = r0.m8501o()
            r3 = r0
            k7.i2 r3 = (p185k7.C3839i2) r3
            r1.m11100w(r2, r3)
            p185k7.C3792eb.m8525c()
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            o7.f r0 = r0.f5716g
            o7.u2<java.lang.Boolean> r4 = p249o7.C5120v2.f20119s0
            r5 = 0
            boolean r0 = r0.m11162v(r5, r4)
            if (r0 == 0) goto L34
            k7.d6 r0 = r3.m8201f()
            k7.j2 r0 = (p185k7.C3853j2) r0
            r1.m11102y(r2, r0)
        L34:
            java.util.Map<java.lang.String, k7.j2> r0 = r1.f19568g
            k7.d6 r4 = r3.m8201f()
            k7.j2 r4 = (p185k7.C3853j2) r4
            r0.put(r2, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f19572k
            r4 = r29
            r0.put(r2, r4)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r1.f19565d
            k7.d6 r6 = r3.m8201f()
            k7.j2 r6 = (p185k7.C3853j2) r6
            java.util.Map r6 = m11087z(r6)
            r0.put(r2, r6)
            o7.m6 r0 = r1.f19756b
            o7.j r6 = r0.f19862c
            p249o7.C5052m6.m11327I(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r3.f16453Z
            k7.j2 r0 = (p185k7.C3853j2) r0
            java.util.List r0 = r0.m8714A()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r7.<init>(r0)
            java.lang.String r8 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r9 = "event_filters"
            java.lang.String r10 = "property_filters"
            java.lang.String r11 = "null reference"
            r13 = 0
        L78:
            int r14 = r7.size()
            if (r13 >= r14) goto L1ff
            java.lang.Object r14 = r7.get(r13)
            k7.q1 r14 = (p185k7.C3944q1) r14
            k7.a6 r14 = r14.m8501o()
            k7.p1 r14 = (p185k7.C3931p1) r14
            MessageType extends k7.d6<MessageType, BuilderType> r5 = r14.f16453Z
            k7.q1 r5 = (p185k7.C3944q1) r5
            int r5 = r5.m8888t()
            if (r5 == 0) goto L17e
            r5 = r14
            r15 = 0
        L96:
            MessageType extends k7.d6<MessageType, BuilderType> r12 = r5.f16453Z
            k7.q1 r12 = (p185k7.C3944q1) r12
            int r12 = r12.m8888t()
            if (r15 >= r12) goto L175
            MessageType extends k7.d6<MessageType, BuilderType> r12 = r5.f16453Z
            k7.q1 r12 = (p185k7.C3944q1) r12
            k7.s1 r12 = r12.m8890w(r15)
            k7.a6 r12 = r12.m8501o()
            k7.r1 r12 = (p185k7.C3957r1) r12
            k7.a6 r16 = r12.m8204k()
            r4 = r16
            k7.r1 r4 = (p185k7.C3957r1) r4
            MessageType extends k7.d6<MessageType, BuilderType> r1 = r12.f16453Z
            k7.s1 r1 = (p185k7.C3970s1) r1
            java.lang.String r1 = r1.m8940y()
            java.lang.String r1 = p249o7.C5066o4.m11379b(r1)
            if (r1 == 0) goto Ld9
            r16 = r3
            boolean r3 = r4.f16454a0
            if (r3 == 0) goto Ld0
            r4.m8203j()
            r3 = 0
            r4.f16454a0 = r3
        Ld0:
            MessageType extends k7.d6<MessageType, BuilderType> r3 = r4.f16453Z
            k7.s1 r3 = (p185k7.C3970s1) r3
            p185k7.C3970s1.m8926A(r3, r1)
            r1 = 1
            goto Ldc
        Ld9:
            r16 = r3
            r1 = 0
        Ldc:
            r17 = r8
            r3 = 0
        Ldf:
            MessageType extends k7.d6<MessageType, BuilderType> r8 = r12.f16453Z
            k7.s1 r8 = (p185k7.C3970s1) r8
            int r8 = r8.m8936s()
            if (r3 >= r8) goto L13e
            MessageType extends k7.d6<MessageType, BuilderType> r8 = r12.f16453Z
            k7.s1 r8 = (p185k7.C3970s1) r8
            k7.u1 r8 = r8.m8938w(r3)
            r18 = r12
            java.lang.String r12 = r8.m9029w()
            r19 = r11
            java.lang.String[] r11 = p249o7.C5074p4.f19937a
            r20 = r9
            java.lang.String[] r9 = p249o7.C5074p4.f19938b
            java.lang.String r9 = p185k7.C3836i.m8633r(r12, r11, r9)
            if (r9 == 0) goto L135
            k7.a6 r1 = r8.m8501o()
            k7.t1 r1 = (p185k7.C3983t1) r1
            boolean r8 = r1.f16454a0
            if (r8 == 0) goto L116
            r1.m8203j()
            r8 = 0
            r1.f16454a0 = r8
            goto L117
        L116:
            r8 = 0
        L117:
            MessageType extends k7.d6<MessageType, BuilderType> r11 = r1.f16453Z
            k7.u1 r11 = (p185k7.C3996u1) r11
            p185k7.C3996u1.m9023x(r11, r9)
            k7.d6 r1 = r1.m8201f()
            k7.u1 r1 = (p185k7.C3996u1) r1
            boolean r9 = r4.f16454a0
            if (r9 == 0) goto L12d
            r4.m8203j()
            r4.f16454a0 = r8
        L12d:
            MessageType extends k7.d6<MessageType, BuilderType> r8 = r4.f16453Z
            k7.s1 r8 = (p185k7.C3970s1) r8
            p185k7.C3970s1.m8927B(r8, r3, r1)
            r1 = 1
        L135:
            int r3 = r3 + 1
            r12 = r18
            r11 = r19
            r9 = r20
            goto Ldf
        L13e:
            r20 = r9
            r19 = r11
            if (r1 == 0) goto L165
            boolean r1 = r5.f16454a0
            if (r1 == 0) goto L14e
            r5.m8203j()
            r1 = 0
            r5.f16454a0 = r1
        L14e:
            MessageType extends k7.d6<MessageType, BuilderType> r1 = r5.f16453Z
            k7.q1 r1 = (p185k7.C3944q1) r1
            k7.d6 r3 = r4.m8201f()
            k7.s1 r3 = (p185k7.C3970s1) r3
            p185k7.C3944q1.m8884B(r1, r15, r3)
            k7.d6 r1 = r14.m8201f()
            k7.q1 r1 = (p185k7.C3944q1) r1
            r7.set(r13, r1)
            r5 = r14
        L165:
            int r15 = r15 + 1
            r1 = r26
            r4 = r29
            r3 = r16
            r8 = r17
            r11 = r19
            r9 = r20
            goto L96
        L175:
            r16 = r3
            r17 = r8
            r20 = r9
            r19 = r11
            goto L187
        L17e:
            r16 = r3
            r17 = r8
            r20 = r9
            r19 = r11
            r5 = r14
        L187:
            MessageType extends k7.d6<MessageType, BuilderType> r1 = r5.f16453Z
            k7.q1 r1 = (p185k7.C3944q1) r1
            int r1 = r1.m8889u()
            if (r1 == 0) goto L1ee
            r1 = 0
        L192:
            MessageType extends k7.d6<MessageType, BuilderType> r3 = r5.f16453Z
            k7.q1 r3 = (p185k7.C3944q1) r3
            int r3 = r3.m8889u()
            if (r1 >= r3) goto L1ee
            MessageType extends k7.d6<MessageType, BuilderType> r3 = r5.f16453Z
            k7.q1 r3 = (p185k7.C3944q1) r3
            k7.a2 r3 = r3.m8891x(r1)
            java.lang.String r4 = r3.m8192w()
            java.lang.String[] r8 = p249o7.C5082q4.f19963a
            java.lang.String[] r9 = p249o7.C5082q4.f19964b
            java.lang.String r4 = p185k7.C3836i.m8633r(r4, r8, r9)
            if (r4 == 0) goto L1eb
            k7.a6 r3 = r3.m8501o()
            k7.z1 r3 = (p185k7.C4061z1) r3
            boolean r8 = r3.f16454a0
            if (r8 == 0) goto L1c3
            r3.m8203j()
            r8 = 0
            r3.f16454a0 = r8
            goto L1c4
        L1c3:
            r8 = 0
        L1c4:
            MessageType extends k7.d6<MessageType, BuilderType> r9 = r3.f16453Z
            k7.a2 r9 = (p185k7.C3727a2) r9
            p185k7.C3727a2.m8185x(r9, r4)
            boolean r4 = r5.f16454a0
            if (r4 == 0) goto L1d4
            r5.m8203j()
            r5.f16454a0 = r8
        L1d4:
            MessageType extends k7.d6<MessageType, BuilderType> r4 = r5.f16453Z
            k7.q1 r4 = (p185k7.C3944q1) r4
            k7.d6 r3 = r3.m8201f()
            k7.a2 r3 = (p185k7.C3727a2) r3
            p185k7.C3944q1.m8883A(r4, r1, r3)
            k7.d6 r3 = r14.m8201f()
            k7.q1 r3 = (p185k7.C3944q1) r3
            r7.set(r13, r3)
            r5 = r14
        L1eb:
            int r1 = r1 + 1
            goto L192
        L1ee:
            int r13 = r13 + 1
            r1 = r26
            r4 = r29
            r3 = r16
            r8 = r17
            r11 = r19
            r9 = r20
            r5 = 0
            goto L78
        L1ff:
            r16 = r3
            r17 = r8
            r20 = r9
            r19 = r11
            r6.m11247j()
            r6.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r27)
            android.database.sqlite.SQLiteDatabase r1 = r6.m11253D()
            r1.beginTransaction()
            r6.m11247j()     // Catch: java.lang.Throwable -> L622
            r6.mo3183i()     // Catch: java.lang.Throwable -> L622
            com.google.android.gms.common.internal.C1101a.m3100e(r27)     // Catch: java.lang.Throwable -> L622
            android.database.sqlite.SQLiteDatabase r3 = r6.m11253D()     // Catch: java.lang.Throwable -> L622
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L622
            r8 = 0
            r5[r8] = r2     // Catch: java.lang.Throwable -> L622
            r3.delete(r10, r0, r5)     // Catch: java.lang.Throwable -> L622
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L622
            r5[r8] = r2     // Catch: java.lang.Throwable -> L622
            r4 = r20
            r3.delete(r4, r0, r5)     // Catch: java.lang.Throwable -> L622
            java.util.Iterator r3 = r7.iterator()     // Catch: java.lang.Throwable -> L622
        L23a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L622
            if (r0 == 0) goto L4be
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L4b9
            k7.q1 r0 = (p185k7.C3944q1) r0     // Catch: java.lang.Throwable -> L4b9
            r6.m11247j()     // Catch: java.lang.Throwable -> L4b9
            r6.mo3183i()     // Catch: java.lang.Throwable -> L4b9
            com.google.android.gms.common.internal.C1101a.m3100e(r27)     // Catch: java.lang.Throwable -> L4b9
            r8 = r19
            java.util.Objects.requireNonNull(r0, r8)     // Catch: java.lang.Throwable -> L4b9
            boolean r9 = r0.m8886C()     // Catch: java.lang.Throwable -> L4b9
            if (r9 != 0) goto L273
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a     // Catch: java.lang.Throwable -> L622
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L622
            o7.f3 r0 = r0.f5675i     // Catch: java.lang.Throwable -> L622
            java.lang.String r5 = "Audience with no ID. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1111b.m3134u(r27)     // Catch: java.lang.Throwable -> L622
            r0.m11170d(r5, r9)     // Catch: java.lang.Throwable -> L622
        L26b:
            r22 = r1
            r19 = r3
        L26f:
            r11 = r17
            goto L4af
        L273:
            int r9 = r0.m8887s()     // Catch: java.lang.Throwable -> L4b9
            java.util.List r11 = r0.m8892y()     // Catch: java.lang.Throwable -> L4b9
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L4b9
        L27f:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L4b9
            if (r12 == 0) goto L2a0
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L622
            k7.s1 r12 = (p185k7.C3970s1) r12     // Catch: java.lang.Throwable -> L622
            boolean r12 = r12.m8934G()     // Catch: java.lang.Throwable -> L622
            if (r12 != 0) goto L27f
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a     // Catch: java.lang.Throwable -> L622
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L622
            o7.f3 r0 = r0.f5675i     // Catch: java.lang.Throwable -> L622
            java.lang.String r5 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
        L29b:
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C1111b.m3134u(r27)     // Catch: java.lang.Throwable -> L622
            goto L2c5
        L2a0:
            java.util.List r11 = r0.m8893z()     // Catch: java.lang.Throwable -> L4b9
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L4b9
        L2a8:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L4b9
            if (r12 == 0) goto L2cd
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L622
            k7.a2 r12 = (p185k7.C3727a2) r12     // Catch: java.lang.Throwable -> L622
            boolean r12 = r12.m8187B()     // Catch: java.lang.Throwable -> L622
            if (r12 != 0) goto L2a8
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a     // Catch: java.lang.Throwable -> L622
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L622
            o7.f3 r0 = r0.f5675i     // Catch: java.lang.Throwable -> L622
            java.lang.String r5 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            goto L29b
        L2c5:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L622
            r0.m11171e(r5, r11, r9)     // Catch: java.lang.Throwable -> L622
            goto L26b
        L2cd:
            java.util.List r11 = r0.m8892y()     // Catch: java.lang.Throwable -> L4b9
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L4b9
        L2d5:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L4b9
            java.lang.String r13 = "data"
            java.lang.String r14 = "session_scoped"
            java.lang.String r15 = "filter_id"
            java.lang.String r5 = "audience_id"
            r19 = r3
            java.lang.String r3 = "app_id"
            r20 = -1
            r22 = r1
            if (r12 == 0) goto L3ad
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L61e
            k7.s1 r12 = (p185k7.C3970s1) r12     // Catch: java.lang.Throwable -> L61e
            r6.m11247j()     // Catch: java.lang.Throwable -> L61e
            r6.mo3183i()     // Catch: java.lang.Throwable -> L61e
            com.google.android.gms.common.internal.C1101a.m3100e(r27)     // Catch: java.lang.Throwable -> L61e
            java.util.Objects.requireNonNull(r12, r8)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r23 = r12.m8940y()     // Catch: java.lang.Throwable -> L61e
            boolean r23 = android.text.TextUtils.isEmpty(r23)     // Catch: java.lang.Throwable -> L61e
            if (r23 == 0) goto L332
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a     // Catch: java.lang.Throwable -> L61e
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L61e
            o7.f3 r0 = r0.f5675i     // Catch: java.lang.Throwable -> L61e
            java.lang.String r1 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r27)     // Catch: java.lang.Throwable -> L61e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L61e
            boolean r11 = r12.m8934G()     // Catch: java.lang.Throwable -> L61e
            if (r11 == 0) goto L328
            int r11 = r12.m8937t()     // Catch: java.lang.Throwable -> L61e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L61e
            goto L329
        L328:
            r11 = 0
        L329:
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L61e
            r0.m11172f(r1, r3, r5, r11)     // Catch: java.lang.Throwable -> L61e
            goto L483
        L332:
            byte[] r1 = r12.m9160i()     // Catch: java.lang.Throwable -> L61e
            r24 = r11
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L61e
            r11.<init>()     // Catch: java.lang.Throwable -> L61e
            r11.put(r3, r2)     // Catch: java.lang.Throwable -> L61e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L61e
            r11.put(r5, r3)     // Catch: java.lang.Throwable -> L61e
            boolean r3 = r12.m8934G()     // Catch: java.lang.Throwable -> L61e
            if (r3 == 0) goto L356
            int r3 = r12.m8937t()     // Catch: java.lang.Throwable -> L61e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L61e
            goto L357
        L356:
            r3 = 0
        L357:
            r11.put(r15, r3)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r3 = "event_name"
            java.lang.String r5 = r12.m8940y()     // Catch: java.lang.Throwable -> L61e
            r11.put(r3, r5)     // Catch: java.lang.Throwable -> L61e
            boolean r3 = r12.m8935H()     // Catch: java.lang.Throwable -> L61e
            if (r3 == 0) goto L372
            boolean r3 = r12.m8932E()     // Catch: java.lang.Throwable -> L61e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L61e
            goto L373
        L372:
            r3 = 0
        L373:
            r11.put(r14, r3)     // Catch: java.lang.Throwable -> L61e
            r11.put(r13, r1)     // Catch: java.lang.Throwable -> L61e
            android.database.sqlite.SQLiteDatabase r1 = r6.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L3a0 java.lang.Throwable -> L61e
            r3 = 5
            r5 = 0
            long r11 = r1.insertWithOnConflict(r4, r5, r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L3a0 java.lang.Throwable -> L61e
            int r1 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r1 != 0) goto L398
            com.google.android.gms.measurement.internal.d r1 = r6.f5736a     // Catch: android.database.sqlite.SQLiteException -> L3a0 java.lang.Throwable -> L61e
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L3a0 java.lang.Throwable -> L61e
            o7.f3 r1 = r1.f5672f     // Catch: android.database.sqlite.SQLiteException -> L3a0 java.lang.Throwable -> L61e
            java.lang.String r3 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r27)     // Catch: android.database.sqlite.SQLiteException -> L3a0 java.lang.Throwable -> L61e
            r1.m11170d(r3, r5)     // Catch: android.database.sqlite.SQLiteException -> L3a0 java.lang.Throwable -> L61e
        L398:
            r3 = r19
            r1 = r22
            r11 = r24
            goto L2d5
        L3a0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r6.f5736a     // Catch: java.lang.Throwable -> L61e
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L61e
            o7.f3 r1 = r1.f5672f     // Catch: java.lang.Throwable -> L61e
            java.lang.String r3 = "Error storing event filter. appId"
            goto L47c
        L3ad:
            java.util.List r0 = r0.m8893z()     // Catch: java.lang.Throwable -> L61e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L61e
        L3b5:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L61e
            if (r1 == 0) goto L26f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L61e
            k7.a2 r1 = (p185k7.C3727a2) r1     // Catch: java.lang.Throwable -> L61e
            r6.m11247j()     // Catch: java.lang.Throwable -> L61e
            r6.mo3183i()     // Catch: java.lang.Throwable -> L61e
            com.google.android.gms.common.internal.C1101a.m3100e(r27)     // Catch: java.lang.Throwable -> L61e
            java.util.Objects.requireNonNull(r1, r8)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r11 = r1.m8192w()     // Catch: java.lang.Throwable -> L61e
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L61e
            if (r11 == 0) goto L402
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a     // Catch: java.lang.Throwable -> L61e
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L61e
            o7.f3 r0 = r0.f5675i     // Catch: java.lang.Throwable -> L61e
            java.lang.String r3 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r27)     // Catch: java.lang.Throwable -> L61e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L61e
            boolean r12 = r1.m8187B()     // Catch: java.lang.Throwable -> L61e
            if (r12 == 0) goto L3f8
            int r1 = r1.m8190s()     // Catch: java.lang.Throwable -> L61e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L61e
            goto L3f9
        L3f8:
            r1 = 0
        L3f9:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L61e
            r0.m11172f(r3, r5, r11, r1)     // Catch: java.lang.Throwable -> L61e
            goto L483
        L402:
            byte[] r11 = r1.m9160i()     // Catch: java.lang.Throwable -> L61e
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L61e
            r12.<init>()     // Catch: java.lang.Throwable -> L61e
            r12.put(r3, r2)     // Catch: java.lang.Throwable -> L61e
            r24 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L61e
            r12.put(r5, r0)     // Catch: java.lang.Throwable -> L61e
            boolean r0 = r1.m8187B()     // Catch: java.lang.Throwable -> L61e
            if (r0 == 0) goto L426
            int r0 = r1.m8190s()     // Catch: java.lang.Throwable -> L61e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L61e
            goto L427
        L426:
            r0 = 0
        L427:
            r12.put(r15, r0)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r0 = "property_name"
            r25 = r3
            java.lang.String r3 = r1.m8192w()     // Catch: java.lang.Throwable -> L61e
            r12.put(r0, r3)     // Catch: java.lang.Throwable -> L61e
            boolean r0 = r1.m8188C()     // Catch: java.lang.Throwable -> L61e
            if (r0 == 0) goto L444
            boolean r0 = r1.m8186A()     // Catch: java.lang.Throwable -> L61e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L61e
            goto L445
        L444:
            r0 = 0
        L445:
            r12.put(r14, r0)     // Catch: java.lang.Throwable -> L61e
            r12.put(r13, r11)     // Catch: java.lang.Throwable -> L61e
            android.database.sqlite.SQLiteDatabase r0 = r6.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L471 java.lang.Throwable -> L61e
            r1 = 5
            r3 = 0
            long r11 = r0.insertWithOnConflict(r10, r3, r12, r1)     // Catch: android.database.sqlite.SQLiteException -> L471 java.lang.Throwable -> L61e
            int r0 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r0 != 0) goto L46b
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a     // Catch: android.database.sqlite.SQLiteException -> L471 java.lang.Throwable -> L61e
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L471 java.lang.Throwable -> L61e
            o7.f3 r0 = r0.f5672f     // Catch: android.database.sqlite.SQLiteException -> L471 java.lang.Throwable -> L61e
            java.lang.String r1 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r27)     // Catch: android.database.sqlite.SQLiteException -> L471 java.lang.Throwable -> L61e
            r0.m11170d(r1, r3)     // Catch: android.database.sqlite.SQLiteException -> L471 java.lang.Throwable -> L61e
            goto L483
        L46b:
            r0 = r24
            r3 = r25
            goto L3b5
        L471:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r6.f5736a     // Catch: java.lang.Throwable -> L61e
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L61e
            o7.f3 r1 = r1.f5672f     // Catch: java.lang.Throwable -> L61e
            java.lang.String r3 = "Error storing property filter. appId"
        L47c:
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r27)     // Catch: java.lang.Throwable -> L61e
            r1.m11171e(r3, r5, r0)     // Catch: java.lang.Throwable -> L61e
        L483:
            r6.m11247j()     // Catch: java.lang.Throwable -> L61e
            r6.mo3183i()     // Catch: java.lang.Throwable -> L61e
            com.google.android.gms.common.internal.C1101a.m3100e(r27)     // Catch: java.lang.Throwable -> L61e
            android.database.sqlite.SQLiteDatabase r0 = r6.m11253D()     // Catch: java.lang.Throwable -> L61e
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L61e
            r5 = 0
            r3[r5] = r2     // Catch: java.lang.Throwable -> L61e
            java.lang.String r11 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L61e
            r12 = 1
            r3[r12] = r11     // Catch: java.lang.Throwable -> L61e
            r11 = r17
            r0.delete(r10, r11, r3)     // Catch: java.lang.Throwable -> L61e
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L61e
            r1[r5] = r2     // Catch: java.lang.Throwable -> L61e
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L61e
            r1[r12] = r3     // Catch: java.lang.Throwable -> L61e
            r0.delete(r4, r11, r1)     // Catch: java.lang.Throwable -> L61e
        L4af:
            r17 = r11
            r3 = r19
            r1 = r22
            r19 = r8
            goto L23a
        L4b9:
            r0 = move-exception
            r22 = r1
            goto L61f
        L4be:
            r22 = r1
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61e
            r0.<init>()     // Catch: java.lang.Throwable -> L61e
            java.util.Iterator r1 = r7.iterator()     // Catch: java.lang.Throwable -> L61e
        L4c9:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L61e
            if (r3 == 0) goto L4e9
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L61e
            k7.q1 r3 = (p185k7.C3944q1) r3     // Catch: java.lang.Throwable -> L61e
            boolean r4 = r3.m8886C()     // Catch: java.lang.Throwable -> L61e
            if (r4 == 0) goto L4e4
            int r3 = r3.m8887s()     // Catch: java.lang.Throwable -> L61e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L61e
            goto L4e5
        L4e4:
            r5 = 0
        L4e5:
            r0.add(r5)     // Catch: java.lang.Throwable -> L61e
            goto L4c9
        L4e9:
            com.google.android.gms.common.internal.C1101a.m3100e(r27)     // Catch: java.lang.Throwable -> L61e
            r6.m11247j()     // Catch: java.lang.Throwable -> L61e
            r6.mo3183i()     // Catch: java.lang.Throwable -> L61e
            android.database.sqlite.SQLiteDatabase r1 = r6.m11253D()     // Catch: java.lang.Throwable -> L61e
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: android.database.sqlite.SQLiteException -> L599 java.lang.Throwable -> L61e
            r3 = 0
            r4[r3] = r2     // Catch: android.database.sqlite.SQLiteException -> L599 java.lang.Throwable -> L61e
            java.lang.String r3 = "select count(1) from audience_filter_values where app_id=?"
            long r3 = r6.m11283z(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L599 java.lang.Throwable -> L61e
            com.google.android.gms.measurement.internal.d r5 = r6.f5736a     // Catch: java.lang.Throwable -> L61e
            o7.f r5 = r5.f5716g     // Catch: java.lang.Throwable -> L61e
            r6 = 2000(0x7d0, float:2.803E-42)
            o7.u2<java.lang.Integer> r7 = p249o7.C5120v2.f20061F     // Catch: java.lang.Throwable -> L61e
            int r5 = r5.m11155o(r2, r7)     // Catch: java.lang.Throwable -> L61e
            int r5 = java.lang.Math.min(r6, r5)     // Catch: java.lang.Throwable -> L61e
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)     // Catch: java.lang.Throwable -> L61e
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L61e
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L51e
            goto L5ab
        L51e:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61e
            r3.<init>()     // Catch: java.lang.Throwable -> L61e
            r4 = 0
        L524:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L61e
            if (r4 >= r6) goto L540
            java.lang.Object r6 = r0.get(r4)     // Catch: java.lang.Throwable -> L61e
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L61e
            if (r6 == 0) goto L5ab
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L61e
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch: java.lang.Throwable -> L61e
            r3.add(r6)     // Catch: java.lang.Throwable -> L61e
            int r4 = r4 + 1
            goto L524
        L540:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r3)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L61e
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L61e
            r4 = 2
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r3 = "("
            r4.append(r3)     // Catch: java.lang.Throwable -> L61e
            r4.append(r0)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L61e
            java.lang.String r3 = "audience_filter_values"
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L61e
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L61e
            int r4 = r4 + 140
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61e
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r4 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r6.append(r4)     // Catch: java.lang.Throwable -> L61e
            r6.append(r0)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r6.append(r0)     // Catch: java.lang.Throwable -> L61e
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L61e
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L61e
            r6 = 0
            r4[r6] = r2     // Catch: java.lang.Throwable -> L61e
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Throwable -> L61e
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Throwable -> L61e
            r1.delete(r3, r0, r4)     // Catch: java.lang.Throwable -> L61e
            goto L5ab
        L599:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r6.f5736a     // Catch: java.lang.Throwable -> L61e
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L61e
            o7.f3 r1 = r1.f5672f     // Catch: java.lang.Throwable -> L61e
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r27)     // Catch: java.lang.Throwable -> L61e
            r1.m11171e(r3, r4, r0)     // Catch: java.lang.Throwable -> L61e
        L5ab:
            r22.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L61e
            r22.endTransaction()
            r1 = r16
            boolean r0 = r1.f16454a0     // Catch: java.lang.RuntimeException -> L5d1
            if (r0 == 0) goto L5bd
            r1.m8203j()     // Catch: java.lang.RuntimeException -> L5d1
            r3 = 0
            r1.f16454a0 = r3     // Catch: java.lang.RuntimeException -> L5d1
        L5bd:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r1.f16453Z     // Catch: java.lang.RuntimeException -> L5d1
            k7.j2 r0 = (p185k7.C3853j2) r0     // Catch: java.lang.RuntimeException -> L5d1
            p185k7.C3853j2.m8710E(r0)     // Catch: java.lang.RuntimeException -> L5d1
            k7.d6 r0 = r1.m8201f()     // Catch: java.lang.RuntimeException -> L5d1
            k7.j2 r0 = (p185k7.C3853j2) r0     // Catch: java.lang.RuntimeException -> L5d1
            byte[] r0 = r0.m9160i()     // Catch: java.lang.RuntimeException -> L5d1
            r3 = r26
            goto L5e7
        L5d1:
            r0 = move-exception
            r3 = r26
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r27)
            java.lang.String r6 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r4.m11171e(r6, r5, r0)
            r0 = r28
        L5e7:
            k7.ya r4 = p185k7.C4057ya.f16976Z
            k7.za r4 = r4.m9155b()
            r4.mo8215a()
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            o7.f r4 = r4.f5716g
            o7.u2<java.lang.Boolean> r5 = p249o7.C5120v2.f20113p0
            r6 = 0
            boolean r4 = r4.m11162v(r6, r5)
            if (r4 == 0) goto L607
            o7.m6 r4 = r3.f19756b
            o7.j r4 = r4.f19862c
            p249o7.C5052m6.m11327I(r4)
            r6 = r29
            goto L60e
        L607:
            o7.m6 r4 = r3.f19756b
            o7.j r4 = r4.f19862c
            p249o7.C5052m6.m11327I(r4)
        L60e:
            r4.m11276r(r2, r0, r6)
            java.util.Map<java.lang.String, k7.j2> r0 = r3.f19568g
            k7.d6 r1 = r1.m8201f()
            k7.j2 r1 = (p185k7.C3853j2) r1
            r0.put(r2, r1)
            r1 = 1
            return r1
        L61e:
            r0 = move-exception
        L61f:
            r3 = r26
            goto L627
        L622:
            r0 = move-exception
            r3 = r26
            r22 = r1
        L627:
            r22.endTransaction()
            throw r0
    }

    /* renamed from: v */
    public final p185k7.C3853j2 m11099v(java.lang.String r8, byte[] r9) {
            r7 = this;
            java.lang.String r0 = "Unable to merge remote config. appId"
            if (r9 != 0) goto L9
            k7.j2 r8 = p185k7.C3853j2.m8713y()
            return r8
        L9:
            k7.i2 r1 = p185k7.C3853j2.m8711w()     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            k7.y4 r9 = p249o7.C5068o6.m11380D(r1, r9)     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            k7.i2 r9 = (p185k7.C3839i2) r9     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            k7.d6 r9 = r9.m8201f()     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            k7.j2 r9 = (p185k7.C3853j2) r9     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            o7.f3 r1 = r1.f5680n     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            java.lang.String r2 = "Parsed config. version, gmp_app_id"
            boolean r3 = r9.m8719H()     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            r4 = 0
            if (r3 == 0) goto L33
            long r5 = r9.m8722u()     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            goto L34
        L33:
            r3 = r4
        L34:
            boolean r5 = r9.m8718G()     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            if (r5 == 0) goto L3e
            java.lang.String r4 = r9.m8724z()     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
        L3e:
            r1.m11171e(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L42 p185k7.C3897m6 -> L57
            return r9
        L42:
            r9 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
        L49:
            o7.f3 r1 = r1.f5675i
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1111b.m3134u(r8)
            r1.m11171e(r0, r8, r9)
            k7.j2 r8 = p185k7.C3853j2.m8713y()
            return r8
        L57:
            r9 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            goto L49
    }

    /* renamed from: w */
    public final void m11100w(java.lang.String r10, p185k7.C3839i2 r11) {
            r9 = this;
            s.a r0 = new s.a
            r0.<init>()
            s.a r1 = new s.a
            r1.<init>()
            s.a r2 = new s.a
            r2.<init>()
            r3 = 0
            r4 = 0
        L11:
            MessageType extends k7.d6<MessageType, BuilderType> r5 = r11.f16453Z
            k7.j2 r5 = (p185k7.C3853j2) r5
            int r5 = r5.m8721t()
            if (r4 >= r5) goto Le4
            MessageType extends k7.d6<MessageType, BuilderType> r5 = r11.f16453Z
            k7.j2 r5 = (p185k7.C3853j2) r5
            k7.h2 r5 = r5.m8723v(r4)
            k7.a6 r5 = r5.m8501o()
            k7.f2 r5 = (p185k7.C3797f2) r5
            java.lang.String r6 = r5.m8529q()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L42
            com.google.android.gms.measurement.internal.d r5 = r9.f5736a
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()
            o7.f3 r5 = r5.f5675i
            java.lang.String r6 = "EventConfig contained null event name"
            r5.m11169c(r6)
            goto Le0
        L42:
            java.lang.String r6 = r5.m8529q()
            java.lang.String r7 = r5.m8529q()
            java.lang.String r7 = p249o7.C5066o4.m11379b(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L7a
            boolean r8 = r5.f16454a0
            if (r8 == 0) goto L5d
            r5.m8203j()
            r5.f16454a0 = r3
        L5d:
            MessageType extends k7.d6<MessageType, BuilderType> r8 = r5.f16453Z
            k7.h2 r8 = (p185k7.C3825h2) r8
            p185k7.C3825h2.m8556v(r8, r7)
            boolean r7 = r11.f16454a0
            if (r7 == 0) goto L6d
            r11.m8203j()
            r11.f16454a0 = r3
        L6d:
            MessageType extends k7.d6<MessageType, BuilderType> r7 = r11.f16453Z
            k7.j2 r7 = (p185k7.C3853j2) r7
            k7.d6 r8 = r5.m8201f()
            k7.h2 r8 = (p185k7.C3825h2) r8
            p185k7.C3853j2.m8709D(r7, r4, r8)
        L7a:
            MessageType extends k7.d6<MessageType, BuilderType> r7 = r5.f16453Z
            k7.h2 r7 = (p185k7.C3825h2) r7
            boolean r7 = r7.m8559w()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0.put(r6, r7)
            java.lang.String r6 = r5.m8529q()
            MessageType extends k7.d6<MessageType, BuilderType> r7 = r5.f16453Z
            k7.h2 r7 = (p185k7.C3825h2) r7
            boolean r7 = r7.m8560x()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r1.put(r6, r7)
            MessageType extends k7.d6<MessageType, BuilderType> r6 = r5.f16453Z
            k7.h2 r6 = (p185k7.C3825h2) r6
            boolean r6 = r6.m8561y()
            if (r6 == 0) goto Le0
            int r6 = r5.m8528p()
            r7 = 2
            if (r6 < r7) goto Lc7
            int r6 = r5.m8528p()
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r6 <= r7) goto Lb7
            goto Lc7
        Lb7:
            java.lang.String r6 = r5.m8529q()
            int r5 = r5.m8528p()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.put(r6, r5)
            goto Le0
        Lc7:
            com.google.android.gms.measurement.internal.d r6 = r9.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5675i
            java.lang.String r7 = r5.m8529q()
            int r5 = r5.m8528p()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r8 = "Invalid sampling rate. Event name, sample rate"
            r6.m11171e(r8, r7, r5)
        Le0:
            int r4 = r4 + 1
            goto L11
        Le4:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r11 = r9.f19566e
            r11.put(r10, r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r11 = r9.f19567f
            r11.put(r10, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r11 = r9.f19569h
            r11.put(r10, r2)
            return
    }

    /* renamed from: x */
    public final void m11101x(java.lang.String r13) {
            r12 = this;
            r12.m11247j()
            r12.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r13)
            java.util.Map<java.lang.String, k7.j2> r0 = r12.f19568g
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L11b
            o7.m6 r0 = r12.f19756b
            o7.j r0 = r0.f19862c
            p249o7.C5052m6.m11327I(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r13)
            r0.mo3183i()
            r0.m11247j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.m11253D()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L76
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L76
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L76
            r11 = 0
            r6[r11] = r13     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L76
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L76
            boolean r3 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
            if (r3 != 0) goto L46
            goto L8c
        L46:
            byte[] r3 = r2.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
            java.lang.String r4 = r2.getString(r10)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
            boolean r5 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
            if (r5 == 0) goto L65
            com.google.android.gms.measurement.internal.d r5 = r0.f5736a     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
            o7.f3 r5 = r5.f5672f     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1111b.m3134u(r13)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
            r5.m11170d(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
        L65:
            if (r3 != 0) goto L68
            goto L8c
        L68:
            android.util.Pair r5 = new android.util.Pair     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
            r5.<init>(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L113
            r2.close()
            goto L90
        L71:
            r3 = move-exception
            goto L79
        L73:
            r13 = move-exception
            goto L115
        L76:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L79:
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.Throwable -> L113
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L113
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L113
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r13)     // Catch: java.lang.Throwable -> L113
            r0.m11171e(r4, r5, r3)     // Catch: java.lang.Throwable -> L113
            if (r2 == 0) goto L8f
        L8c:
            r2.close()
        L8f:
            r5 = r1
        L90:
            if (r5 != 0) goto Lae
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r12.f19565d
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f19566e
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f19567f
            r0.put(r13, r1)
            java.util.Map<java.lang.String, k7.j2> r0 = r12.f19568g
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f19572k
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r12.f19569h
            goto L10f
        Lae:
            java.lang.Object r0 = r5.first
            byte[] r0 = (byte[]) r0
            k7.j2 r0 = r12.m11099v(r13, r0)
            k7.a6 r0 = r0.m8501o()
            k7.i2 r0 = (p185k7.C3839i2) r0
            r12.m11100w(r13, r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r12.f19565d
            k7.d6 r3 = r0.m8201f()
            k7.j2 r3 = (p185k7.C3853j2) r3
            java.util.Map r3 = m11087z(r3)
            r2.put(r13, r3)
            java.util.Map<java.lang.String, k7.j2> r2 = r12.f19568g
            k7.d6 r3 = r0.m8201f()
            k7.j2 r3 = (p185k7.C3853j2) r3
            r2.put(r13, r3)
            p185k7.C3792eb.m8525c()
            com.google.android.gms.measurement.internal.d r2 = r12.f5736a
            o7.f r2 = r2.f5716g
            o7.u2<java.lang.Boolean> r3 = p249o7.C5120v2.f20119s0
            boolean r2 = r2.m11162v(r1, r3)
            if (r2 == 0) goto Lf1
            k7.d6 r0 = r0.m8201f()
            k7.j2 r0 = (p185k7.C3853j2) r0
            r12.m11102y(r13, r0)
        Lf1:
            k7.ya r0 = p185k7.C4057ya.f16976Z
            k7.za r0 = r0.m9155b()
            r0.mo8215a()
            com.google.android.gms.measurement.internal.d r0 = r12.f5736a
            o7.f r0 = r0.f5716g
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20113p0
            boolean r0 = r0.m11162v(r1, r2)
            if (r0 == 0) goto L10d
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f19572k
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            goto L10f
        L10d:
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f19572k
        L10f:
            r0.put(r13, r1)
            return
        L113:
            r13 = move-exception
            r1 = r2
        L115:
            if (r1 == 0) goto L11a
            r1.close()
        L11a:
            throw r13
        L11b:
            return
    }

    /* renamed from: y */
    public final void m11102y(java.lang.String r5, p185k7.C3853j2 r6) {
            r4 = this;
            int r0 = r6.m8720s()
            if (r0 == 0) goto Lb6
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "EES programs found"
            int r2 = r6.m8720s()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.m11170d(r1, r2)
            java.util.List r6 = r6.m8715B()
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            k7.p3 r6 = (p185k7.C3933p3) r6
            k7.l0 r1 = new k7.l0     // Catch: p185k7.C3768d1 -> La8
            r1.<init>()     // Catch: p185k7.C3768d1 -> La8
            java.lang.String r2 = "internal.remoteConfig"
            o7.x3 r3 = new o7.x3     // Catch: p185k7.C3768d1 -> La8
            r3.<init>(r4, r5, r0)     // Catch: p185k7.C3768d1 -> La8
            k7.g2 r0 = r1.f16730a     // Catch: p185k7.C3768d1 -> La8
            androidx.lifecycle.c0 r0 = r0.f16649d     // Catch: p185k7.C3768d1 -> La8
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f2478a     // Catch: p185k7.C3768d1 -> La8
            r0.put(r2, r3)     // Catch: p185k7.C3768d1 -> La8
            o7.x3 r0 = new o7.x3     // Catch: p185k7.C3768d1 -> La8
            r2 = 2
            r0.<init>(r4, r5, r2)     // Catch: p185k7.C3768d1 -> La8
            java.lang.String r2 = "internal.appMetadata"
            k7.g2 r3 = r1.f16730a     // Catch: p185k7.C3768d1 -> La8
            androidx.lifecycle.c0 r3 = r3.f16649d     // Catch: p185k7.C3768d1 -> La8
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r3.f2478a     // Catch: p185k7.C3768d1 -> La8
            r3.put(r2, r0)     // Catch: p185k7.C3768d1 -> La8
            a7.c r0 = new a7.c     // Catch: p185k7.C3768d1 -> La8
            r0.<init>(r4)     // Catch: p185k7.C3768d1 -> La8
            java.lang.String r2 = "internal.logger"
            k7.g2 r3 = r1.f16730a     // Catch: p185k7.C3768d1 -> La8
            androidx.lifecycle.c0 r3 = r3.f16649d     // Catch: p185k7.C3768d1 -> La8
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r3.f2478a     // Catch: p185k7.C3768d1 -> La8
            r3.put(r2, r0)     // Catch: p185k7.C3768d1 -> La8
            r1.m8785a(r6)     // Catch: p185k7.C3768d1 -> La8
            s.f<java.lang.String, k7.l0> r0 = r4.f19570i     // Catch: p185k7.C3768d1 -> La8
            r0.m12330c(r5, r1)     // Catch: p185k7.C3768d1 -> La8
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a     // Catch: p185k7.C3768d1 -> La8
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: p185k7.C3768d1 -> La8
            o7.f3 r0 = r0.f5680n     // Catch: p185k7.C3768d1 -> La8
            java.lang.String r1 = "EES program loaded for appId, activities"
            k7.n3 r2 = r6.m8875s()     // Catch: p185k7.C3768d1 -> La8
            int r2 = r2.m8838s()     // Catch: p185k7.C3768d1 -> La8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: p185k7.C3768d1 -> La8
            r0.m11171e(r1, r5, r2)     // Catch: p185k7.C3768d1 -> La8
            k7.n3 r6 = r6.m8875s()     // Catch: p185k7.C3768d1 -> La8
            java.util.List r6 = r6.m8839v()     // Catch: p185k7.C3768d1 -> La8
            java.util.Iterator r6 = r6.iterator()     // Catch: p185k7.C3768d1 -> La8
        L89:
            boolean r0 = r6.hasNext()     // Catch: p185k7.C3768d1 -> La8
            if (r0 == 0) goto La7
            java.lang.Object r0 = r6.next()     // Catch: p185k7.C3768d1 -> La8
            k7.o3 r0 = (p185k7.C3920o3) r0     // Catch: p185k7.C3768d1 -> La8
            com.google.android.gms.measurement.internal.d r1 = r4.f5736a     // Catch: p185k7.C3768d1 -> La8
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: p185k7.C3768d1 -> La8
            o7.f3 r1 = r1.f5680n     // Catch: p185k7.C3768d1 -> La8
            java.lang.String r2 = "EES program activity"
            java.lang.String r0 = r0.m8858t()     // Catch: p185k7.C3768d1 -> La8
            r1.m11170d(r2, r0)     // Catch: p185k7.C3768d1 -> La8
            goto L89
        La7:
            return
        La8:
            com.google.android.gms.measurement.internal.d r6 = r4.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5672f
            java.lang.String r0 = "Failed to load EES program. appId"
            r6.m11170d(r0, r5)
            return
        Lb6:
            s.f<java.lang.String, k7.l0> r6 = r4.f19570i
            java.util.Objects.requireNonNull(r6)
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r5, r0)
            monitor-enter(r6)
            java.util.LinkedHashMap<K, V> r0 = r6.f22783a     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r5 = r0.remove(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r5 == 0) goto Lcf
            int r5 = r6.f22784b     // Catch: java.lang.Throwable -> Ld1
            int r5 = r5 + (-1)
            r6.f22784b = r5     // Catch: java.lang.Throwable -> Ld1
        Lcf:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld1
            return
        Ld1:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld1
            throw r5
    }
}

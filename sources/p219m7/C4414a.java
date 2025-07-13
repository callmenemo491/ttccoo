package p219m7;

/* renamed from: m7.a */
/* loaded from: classes.dex */
public final class C4414a extends p219m7.AbstractC4416c {

    /* renamed from: a */
    public final com.google.android.gms.measurement.internal.C1113d f17990a;

    /* renamed from: b */
    public final p249o7.C4979d5 f17991b;

    public C4414a(com.google.android.gms.measurement.internal.C1113d r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f17990a = r2
            o7.d5 r2 = r2.m3176v()
            r1.f17991b = r2
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: a */
    public final void mo9838a(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.d r0 = r3.f17990a
            o7.y1 r0 = r0.m3169n()
            com.google.android.gms.measurement.internal.d r1 = r3.f17990a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.m11447j(r4, r1)
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: b */
    public final long mo9839b() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f17990a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            long r0 = r0.m3227o0()
            return r0
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: c */
    public final void mo9840c(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            com.google.android.gms.measurement.internal.d r0 = r1.f17990a
            o7.d5 r0 = r0.m3176v()
            r0.m11129J(r2, r3, r4)
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: d */
    public final java.util.List<android.os.Bundle> mo9841d(java.lang.String r10, java.lang.String r11) {
            r9 = this;
            o7.d5 r0 = r9.f17991b
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f4 r1 = r1.mo3160b()
            boolean r1 = r1.m11178u()
            r2 = 0
            if (r1 == 0) goto L22
            com.google.android.gms.measurement.internal.d r10 = r0.f5736a
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()
            o7.f3 r10 = r10.f5672f
            java.lang.String r11 = "Cannot get conditional user properties from analytics worker thread"
            r10.m11169c(r11)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r2)
            goto L78
        L22:
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            java.util.Objects.requireNonNull(r1)
            boolean r1 = p367v1.C6488b.m13179l()
            if (r1 == 0) goto L40
            com.google.android.gms.measurement.internal.d r10 = r0.f5736a
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()
            o7.f3 r10 = r10.f5672f
            java.lang.String r11 = "Cannot get conditional user properties from main thread"
            r10.m11169c(r11)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r2)
            goto L78
        L40:
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.d r2 = r0.f5736a
            o7.f4 r3 = r2.mo3160b()
            e7.b r8 = new e7.b
            r8.<init>(r0, r1, r10, r11)
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r7 = "get conditional user properties"
            r4 = r1
            r3.m11173p(r4, r5, r7, r8)
            java.lang.Object r10 = r1.get()
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L74
            com.google.android.gms.measurement.internal.d r10 = r0.f5736a
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()
            o7.f3 r10 = r10.f5672f
            r11 = 0
            java.lang.String r0 = "Timed out waiting for get conditional user properties"
            r10.m11170d(r0, r11)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            goto L78
        L74:
            java.util.ArrayList r10 = com.google.android.gms.measurement.internal.C1115f.m3194u(r10)
        L78:
            return r10
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: e */
    public final int mo9842e(java.lang.String r2) {
            r1 = this;
            o7.d5 r0 = r1.f17991b
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            com.google.android.gms.measurement.internal.d r2 = r0.f5736a
            java.util.Objects.requireNonNull(r2)
            r2 = 25
            return r2
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: f */
    public final java.util.Map<java.lang.String, java.lang.Object> mo9843f(java.lang.String r11, java.lang.String r12, boolean r13) {
            r10 = this;
            o7.d5 r6 = r10.f17991b
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a
            o7.f4 r0 = r0.mo3160b()
            boolean r0 = r0.m11178u()
            if (r0 == 0) goto L19
            com.google.android.gms.measurement.internal.d r11 = r6.f5736a
            com.google.android.gms.measurement.internal.b r11 = r11.mo3162d()
            o7.f3 r11 = r11.f5672f
            java.lang.String r12 = "Cannot get user properties from analytics worker thread"
            goto L2e
        L19:
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a
            java.util.Objects.requireNonNull(r0)
            boolean r0 = p367v1.C6488b.m13179l()
            if (r0 == 0) goto L32
            com.google.android.gms.measurement.internal.d r11 = r6.f5736a
            com.google.android.gms.measurement.internal.b r11 = r11.mo3162d()
            o7.f3 r11 = r11.f5672f
            java.lang.String r12 = "Cannot get user properties from main thread"
        L2e:
            r11.m11169c(r12)
            goto L6b
        L32:
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            r7.<init>()
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a
            o7.f4 r8 = r0.mo3160b()
            j6.g r9 = new j6.g
            r0 = r9
            r1 = r6
            r2 = r7
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r4 = "get user properties"
            r0 = r8
            r1 = r7
            r5 = r9
            r0.m11173p(r1, r2, r4, r5)
            java.lang.Object r11 = r7.get()
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L70
            com.google.android.gms.measurement.internal.d r11 = r6.f5736a
            com.google.android.gms.measurement.internal.b r11 = r11.mo3162d()
            o7.f3 r11 = r11.f5672f
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r13)
            java.lang.String r13 = "Timed out waiting for handle get user properties, includeInternal"
            r11.m11170d(r13, r12)
        L6b:
            java.util.Map r11 = java.util.Collections.emptyMap()
            goto L96
        L70:
            s.a r12 = new s.a
            int r13 = r11.size()
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L7d:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L95
            java.lang.Object r13 = r11.next()
            o7.p6 r13 = (p249o7.C5076p6) r13
            java.lang.Object r0 = r13.m11412X()
            if (r0 == 0) goto L7d
            java.lang.String r13 = r13.f19945Z
            r12.put(r13, r0)
            goto L7d
        L95:
            r11 = r12
        L96:
            return r11
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: g */
    public final java.lang.String mo9844g() {
            r1 = this;
            o7.d5 r0 = r1.f17991b
            java.lang.String r0 = r0.m11127G()
            return r0
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: h */
    public final void mo9845h(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.d r0 = r3.f17990a
            o7.y1 r0 = r0.m3169n()
            com.google.android.gms.measurement.internal.d r1 = r3.f17990a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.m11448k(r4, r1)
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: i */
    public final java.lang.String mo9846i() {
            r1 = this;
            o7.d5 r0 = r1.f17991b
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.m5 r0 = r0.m3178x()
            o7.j5 r0 = r0.f19846c
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.f19788b
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: j */
    public final void mo9847j(android.os.Bundle r4) {
            r3 = this;
            o7.d5 r0 = r3.f17991b
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.m11139v(r4, r1)
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: k */
    public final void mo9848k(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            o7.d5 r0 = r1.f17991b
            r0.m11131n(r2, r3, r4)
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: r */
    public final java.lang.String mo9849r() {
            r1 = this;
            o7.d5 r0 = r1.f17991b
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.m5 r0 = r0.m3178x()
            o7.j5 r0 = r0.f19846c
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.f19787a
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: s */
    public final java.lang.String mo9850s() {
            r1 = this;
            o7.d5 r0 = r1.f17991b
            java.lang.String r0 = r0.m11127G()
            return r0
    }
}

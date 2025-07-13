package p123h6;

/* renamed from: h6.c0 */
/* loaded from: classes.dex */
public final class BinderC2492c0 extends p123h6.AbstractBinderC2497f {

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicReference<p123h6.C2494d0> f11260a;

    /* renamed from: b */
    public final android.os.Handler f11261b;

    public BinderC2492c0(p123h6.C2494d0 r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.f11260a = r0
            e7.k r0 = new e7.k
            android.os.Looper r2 = r2.f19418b0
            r0.<init>(r2)
            r1.f11261b = r0
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: B */
    public final void mo2943B(int r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r0 = r5.f11260a
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            h6.d0 r0 = (p123h6.C2494d0) r0
            if (r0 != 0) goto Lc
            goto L10
        Lc:
            r0.m6386M()
            r1 = r0
        L10:
            if (r1 != 0) goto L13
            return
        L13:
            h6.b r0 = p123h6.C2494d0.f11262S0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2[r3] = r4
            java.lang.String r3 = "ICastDeviceControllerListener.onDisconnected: %d"
            r0.m6376a(r3, r2)
            if (r6 == 0) goto L37
            r6 = 2
            android.os.Handler r0 = r1.f19421e0
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f19438v0
            int r1 = r1.get()
            r2 = 6
            android.os.Message r6 = r0.obtainMessage(r2, r1, r6)
            r0.sendMessage(r6)
        L37:
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: D1 */
    public final void mo2944D1(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r0 = r4.f11260a
            java.lang.Object r0 = r0.get()
            h6.d0 r0 = (p123h6.C2494d0) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            h6.b r1 = p123h6.C2494d0.f11262S0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 1
            r2[r3] = r6
            java.lang.String r3 = "Receive (type=text, ns=%s) %s"
            r1.m6376a(r3, r2)
            android.os.Handler r1 = r4.f11261b
            h6.b0 r2 = new h6.b0
            r2.<init>(r0, r5, r6)
            r1.post(r2)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: E */
    public final void mo2945E(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r2 = r1.f11260a
            java.lang.Object r2 = r2.get()
            h6.d0 r2 = (p123h6.C2494d0) r2
            if (r2 != 0) goto Lb
            return
        Lb:
            java.lang.Object r2 = p123h6.C2494d0.f11263T0
            monitor-enter(r2)
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: I0 */
    public final void mo2946I0(java.lang.String r1, double r2, boolean r4) {
            r0 = this;
            h6.b r1 = p123h6.C2494d0.f11262S0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Deprecated callback: \"onStatusreceived\""
            r1.m6376a(r3, r2)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: L */
    public final void mo2947L(p123h6.C2491c r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r0 = r4.f11260a
            java.lang.Object r0 = r0.get()
            h6.d0 r0 = (p123h6.C2494d0) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            h6.b r1 = p123h6.C2494d0.f11262S0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "onApplicationStatusChanged"
            r1.m6376a(r3, r2)
            android.os.Handler r1 = r4.f11261b
            h6.a0 r2 = new h6.a0
            r2.<init>(r0, r5)
            r1.post(r2)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: N */
    public final void mo2948N(p036c6.C0879d r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r4 = r0.f11260a
            java.lang.Object r4 = r4.get()
            h6.d0 r4 = (p123h6.C2494d0) r4
            if (r4 != 0) goto Lb
            return
        Lb:
            r4.f11283z0 = r1
            java.lang.String r1 = r1.f4745Y
            r4.f11279O0 = r1
            r4.f11280P0 = r3
            r4.f11271G0 = r2
            java.lang.Object r1 = p123h6.C2494d0.f11263T0
            monitor-enter(r1)
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: R1 */
    public final void mo2949R1(java.lang.String r4, byte[] r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r0 = r3.f11260a
            java.lang.Object r0 = r0.get()
            h6.d0 r0 = (p123h6.C2494d0) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            h6.b r0 = p123h6.C2494d0.f11262S0
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            int r5 = r5.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r4] = r5
            java.lang.String r4 = "IGNORING: Receive (type=binary, ns=%s) <%d bytes>"
            r0.m6376a(r4, r1)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: U0 */
    public final void mo2950U0(java.lang.String r2, long r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r2 = r1.f11260a
            java.lang.Object r2 = r2.get()
            h6.d0 r2 = (p123h6.C2494d0) r2
            if (r2 != 0) goto Lb
            return
        Lb:
            r0 = 0
            p123h6.C2494d0.m6382K(r2, r3, r0)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: h0 */
    public final void mo2951h0(int r1) {
            r0 = this;
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: j1 */
    public final void mo2952j1(p123h6.C2498f0 r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r0 = r4.f11260a
            java.lang.Object r0 = r0.get()
            h6.d0 r0 = (p123h6.C2494d0) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            h6.b r1 = p123h6.C2494d0.f11262S0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "onDeviceStatusChanged"
            r1.m6376a(r3, r2)
            android.os.Handler r1 = r4.f11261b
            h6.a0 r2 = new h6.a0
            r2.<init>(r0, r5)
            r1.post(r2)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: k */
    public final void mo2953k(int r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r0 = r3.f11260a
            java.lang.Object r0 = r0.get()
            h6.d0 r0 = (p123h6.C2494d0) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            r1 = 0
            r0.f11279O0 = r1
            r0.f11280P0 = r1
            java.lang.Object r1 = p123h6.C2494d0.f11264U0
            monitor-enter(r1)
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.cast.a$c r1 = r0.f11266B0
            if (r1 == 0) goto L22
            android.os.Handler r1 = r3.f11261b
            h6.z r2 = new h6.z
            r2.<init>(r0, r4)
            r1.post(r2)
        L22:
            return
        L23:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: q1 */
    public final void mo2954q1(int r1) {
            r0 = this;
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: s */
    public final void mo2955s(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r0 = r1.f11260a
            java.lang.Object r0 = r0.get()
            h6.d0 r0 = (p123h6.C2494d0) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            p123h6.C2494d0.m6383L(r0, r2)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: t */
    public final void mo2956t(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r0 = r1.f11260a
            java.lang.Object r0 = r0.get()
            h6.d0 r0 = (p123h6.C2494d0) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            p123h6.C2494d0.m6383L(r0, r2)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: z0 */
    public final void mo2957z0(java.lang.String r1, long r2, int r4) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReference<h6.d0> r1 = r0.f11260a
            java.lang.Object r1 = r1.get()
            h6.d0 r1 = (p123h6.C2494d0) r1
            if (r1 != 0) goto Lb
            return
        Lb:
            p123h6.C2494d0.m6382K(r1, r2, r4)
            return
    }
}

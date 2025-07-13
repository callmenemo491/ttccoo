package com.google.android.gms.cast;

/* renamed from: com.google.android.gms.cast.c */
/* loaded from: classes.dex */
public final class BinderC1059c extends p123h6.AbstractBinderC2497f {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.gms.cast.C1060d f5411a;

    public BinderC1059c(com.google.android.gms.cast.C1060d r1) {
            r0 = this;
            r0.f5411a = r1
            r0.<init>()
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: B */
    public final void mo2943B(int r4) {
            r3 = this;
            com.google.android.gms.cast.d r0 = r3.f5411a
            android.os.Handler r0 = com.google.android.gms.cast.C1060d.m2961o(r0)
            c6.g0 r1 = new c6.g0
            r2 = 2
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: D1 */
    public final void mo2944D1(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            h6.b r0 = com.google.android.gms.cast.C1060d.f5412F
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r2 = "Receive (type=text, ns=%s) %s"
            r0.m6376a(r2, r1)
            com.google.android.gms.cast.d r0 = r3.f5411a
            android.os.Handler r0 = com.google.android.gms.cast.C1060d.m2961o(r0)
            c6.h0 r1 = new c6.h0
            r1.<init>(r3, r4, r5)
            r0.post(r1)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: E */
    public final void mo2945E(int r2) {
            r1 = this;
            com.google.android.gms.cast.d r0 = r1.f5411a
            r0.m2966l(r2)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: I0 */
    public final void mo2946I0(java.lang.String r1, double r2, boolean r4) {
            r0 = this;
            h6.b r1 = com.google.android.gms.cast.C1060d.f5412F
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Deprecated callback: \"onStatusReceived\""
            r1.m6376a(r3, r2)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: L */
    public final void mo2947L(p123h6.C2491c r3) {
            r2 = this;
            com.google.android.gms.cast.d r0 = r2.f5411a
            android.os.Handler r0 = com.google.android.gms.cast.C1060d.m2961o(r0)
            h6.a0 r1 = new h6.a0
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: N */
    public final void mo2948N(p036c6.C0879d r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            r9 = this;
            com.google.android.gms.cast.d r0 = r9.f5411a
            r0.f5428s = r10
            r0.f5429t = r11
            h6.y r7 = new h6.y
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r1 = 0
            r8 = 0
            r2.<init>(r1, r8)
            r1 = r7
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r10 = r0.f5426q
            monitor-enter(r10)
            s7.j<com.google.android.gms.cast.a$a> r11 = r0.f5423n     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto L23
            s7.q<TResult> r11 = r11.f23075a     // Catch: java.lang.Throwable -> L27
            r11.m12473r(r7)     // Catch: java.lang.Throwable -> L27
        L23:
            r0.f5423n = r8     // Catch: java.lang.Throwable -> L27
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L27
            throw r11
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: R1 */
    public final void mo2949R1(java.lang.String r4, byte[] r5) {
            r3 = this;
            h6.b r0 = com.google.android.gms.cast.C1060d.f5412F
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
            com.google.android.gms.cast.d r2 = r1.f5411a
            r0 = 0
            com.google.android.gms.cast.C1060d.m2958e(r2, r3, r0)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: h0 */
    public final void mo2951h0(int r4) {
            r3 = this;
            com.google.android.gms.cast.d r0 = r3.f5411a
            android.os.Handler r0 = com.google.android.gms.cast.C1060d.m2961o(r0)
            c6.g0 r1 = new c6.g0
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: j1 */
    public final void mo2952j1(p123h6.C2498f0 r3) {
            r2 = this;
            com.google.android.gms.cast.d r0 = r2.f5411a
            android.os.Handler r0 = com.google.android.gms.cast.C1060d.m2961o(r0)
            h6.a0 r1 = new h6.a0
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: k */
    public final void mo2953k(int r4) {
            r3 = this;
            com.google.android.gms.cast.d r0 = r3.f5411a
            com.google.android.gms.cast.C1060d.m2959f(r0, r4)
            com.google.android.gms.cast.d r0 = r3.f5411a
            com.google.android.gms.cast.a$c r1 = r0.f5416C
            if (r1 == 0) goto L18
            android.os.Handler r0 = com.google.android.gms.cast.C1060d.m2961o(r0)
            c6.g0 r1 = new c6.g0
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.post(r1)
        L18:
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: q1 */
    public final void mo2954q1(int r4) {
            r3 = this;
            com.google.android.gms.cast.d r0 = r3.f5411a
            android.os.Handler r0 = com.google.android.gms.cast.C1060d.m2961o(r0)
            c6.g0 r1 = new c6.g0
            r2 = 3
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: s */
    public final void mo2955s(int r2) {
            r1 = this;
            com.google.android.gms.cast.d r0 = r1.f5411a
            com.google.android.gms.cast.C1060d.m2959f(r0, r2)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: t */
    public final void mo2956t(int r2) {
            r1 = this;
            com.google.android.gms.cast.d r0 = r1.f5411a
            com.google.android.gms.cast.C1060d.m2959f(r0, r2)
            return
    }

    @Override // p123h6.InterfaceC2499g
    /* renamed from: z0 */
    public final void mo2957z0(java.lang.String r1, long r2, int r4) {
            r0 = this;
            com.google.android.gms.cast.d r1 = r0.f5411a
            com.google.android.gms.cast.C1060d.m2958e(r1, r2, r4)
            return
    }
}

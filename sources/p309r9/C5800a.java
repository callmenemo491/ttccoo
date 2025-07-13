package p309r9;

/* renamed from: r9.a */
/* loaded from: classes.dex */
public final class C5800a implements p249o7.InterfaceC4987e5 {

    /* renamed from: a */
    public final /* synthetic */ p185k7.C3918o1 f22497a;

    public C5800a(p185k7.C3918o1 r1) {
            r0 = this;
            r0.f22497a = r1
            r0.<init>()
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: a */
    public final void mo9838a(java.lang.String r4) {
            r3 = this;
            k7.o1 r0 = r3.f22497a
            java.util.Objects.requireNonNull(r0)
            k7.c1 r1 = new k7.c1
            r2 = 0
            r1.<init>(r0, r4, r2)
            java.util.concurrent.ExecutorService r4 = r0.f16791a
            r4.execute(r1)
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: b */
    public final long mo9839b() {
            r6 = this;
            k7.o1 r0 = r6.f22497a
            java.util.Objects.requireNonNull(r0)
            k7.k0 r1 = new k7.k0
            r1.<init>()
            k7.e1 r2 = new k7.e1
            r3 = 2
            r2.<init>(r0, r1, r3)
            java.util.concurrent.ExecutorService r3 = r0.f16791a
            r3.execute(r2)
            r2 = 500(0x1f4, double:2.47E-321)
            android.os.Bundle r1 = r1.m8751x(r2)
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.Object r1 = p185k7.BinderC3865k0.m8748k2(r1, r2)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 != 0) goto L40
            java.util.Random r1 = new java.util.Random
            long r2 = java.lang.System.nanoTime()
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r2 ^ r4
            r1.<init>(r2)
            long r1 = r1.nextLong()
            int r3 = r0.f16794d
            int r3 = r3 + 1
            r0.f16794d = r3
            long r3 = (long) r3
            long r1 = r1 + r3
            goto L44
        L40:
            long r1 = r1.longValue()
        L44:
            return r1
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: c */
    public final void mo9840c(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
            r2 = this;
            k7.o1 r0 = r2.f22497a
            java.util.Objects.requireNonNull(r0)
            k7.a1 r1 = new k7.a1
            r1.<init>(r0, r3, r4, r5)
            java.util.concurrent.ExecutorService r3 = r0.f16791a
            r3.execute(r1)
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: d */
    public final java.util.List<android.os.Bundle> mo9841d(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            k7.o1 r0 = r1.f22497a
            java.util.List r2 = r0.m8853d(r2, r3)
            return r2
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: e */
    public final int mo9842e(java.lang.String r2) {
            r1 = this;
            k7.o1 r0 = r1.f22497a
            int r2 = r0.m8852b(r2)
            return r2
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: f */
    public final java.util.Map<java.lang.String, java.lang.Object> mo9843f(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            k7.o1 r0 = r1.f22497a
            java.util.Map r2 = r0.m8854e(r2, r3, r4)
            return r2
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: g */
    public final java.lang.String mo9844g() {
            r4 = this;
            k7.o1 r0 = r4.f22497a
            java.util.Objects.requireNonNull(r0)
            k7.k0 r1 = new k7.k0
            r1.<init>()
            k7.e1 r2 = new k7.e1
            r3 = 1
            r2.<init>(r0, r1, r3)
            java.util.concurrent.ExecutorService r0 = r0.f16791a
            r0.execute(r2)
            r2 = 50
            java.lang.String r0 = r1.m8750H(r2)
            return r0
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: h */
    public final void mo9845h(java.lang.String r4) {
            r3 = this;
            k7.o1 r0 = r3.f22497a
            java.util.Objects.requireNonNull(r0)
            k7.c1 r1 = new k7.c1
            r2 = 1
            r1.<init>(r0, r4, r2)
            java.util.concurrent.ExecutorService r4 = r0.f16791a
            r4.execute(r1)
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: i */
    public final java.lang.String mo9846i() {
            r4 = this;
            k7.o1 r0 = r4.f22497a
            java.util.Objects.requireNonNull(r0)
            k7.k0 r1 = new k7.k0
            r1.<init>()
            k7.e1 r2 = new k7.e1
            r3 = 4
            r2.<init>(r0, r1, r3)
            java.util.concurrent.ExecutorService r0 = r0.f16791a
            r0.execute(r2)
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.String r0 = r1.m8750H(r2)
            return r0
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: j */
    public final void mo9847j(android.os.Bundle r3) {
            r2 = this;
            k7.o1 r0 = r2.f22497a
            java.util.Objects.requireNonNull(r0)
            k7.z0 r1 = new k7.z0
            r1.<init>(r0, r3)
            java.util.concurrent.ExecutorService r3 = r0.f16791a
            r3.execute(r1)
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: k */
    public final void mo9848k(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            k7.o1 r0 = r1.f22497a
            r0.m8855f(r2, r3, r4)
            return
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: r */
    public final java.lang.String mo9849r() {
            r4 = this;
            k7.o1 r0 = r4.f22497a
            java.util.Objects.requireNonNull(r0)
            k7.k0 r1 = new k7.k0
            r1.<init>()
            k7.e1 r2 = new k7.e1
            r3 = 3
            r2.<init>(r0, r1, r3)
            java.util.concurrent.ExecutorService r0 = r0.f16791a
            r0.execute(r2)
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.String r0 = r1.m8750H(r2)
            return r0
    }

    @Override // p249o7.InterfaceC4987e5
    /* renamed from: s */
    public final java.lang.String mo9850s() {
            r4 = this;
            k7.o1 r0 = r4.f22497a
            java.util.Objects.requireNonNull(r0)
            k7.k0 r1 = new k7.k0
            r1.<init>()
            k7.e1 r2 = new k7.e1
            r3 = 0
            r2.<init>(r0, r1, r3)
            java.util.concurrent.ExecutorService r0 = r0.f16791a
            r0.execute(r2)
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.String r0 = r1.m8750H(r2)
            return r0
    }
}

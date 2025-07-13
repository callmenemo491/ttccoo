package p221m9;

/* renamed from: m9.a1 */
/* loaded from: classes.dex */
public final class C4435a1 {

    /* renamed from: c */
    public static final p221m9.C4435a1 f18092c = null;

    /* renamed from: a */
    public final p221m9.InterfaceC4450f1 f18093a;

    /* renamed from: b */
    public final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, p221m9.InterfaceC4447e1<?>> f18094b;

    static {
            m9.a1 r0 = new m9.a1
            r0.<init>()
            p221m9.C4435a1.f18092c = r0
            return
    }

    public C4435a1() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f18094b = r0
            m9.i0 r0 = new m9.i0
            r0.<init>()
            r1.f18093a = r0
            return
    }

    /* renamed from: a */
    public <T> p221m9.InterfaceC4447e1<T> m9903a(java.lang.Class<T> r10) {
            r9 = this;
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            java.lang.String r0 = "messageType"
            java.util.Objects.requireNonNull(r10, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, m9.e1<?>> r0 = r9.f18094b
            java.lang.Object r0 = r0.get(r10)
            m9.e1 r0 = (p221m9.InterfaceC4447e1) r0
            if (r0 != 0) goto Ldc
            m9.f1 r0 = r9.f18093a
            m9.i0 r0 = (p221m9.C4458i0) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<m9.x> r1 = p221m9.AbstractC4501x.class
            java.lang.Class<?> r2 = p221m9.C4453g1.f18135a
            boolean r2 = r1.isAssignableFrom(r10)
            if (r2 != 0) goto L35
            java.lang.Class<?> r2 = p221m9.C4453g1.f18135a
            if (r2 == 0) goto L35
            boolean r2 = r2.isAssignableFrom(r10)
            if (r2 == 0) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            r10.<init>(r0)
            throw r10
        L35:
            m9.p0 r0 = r0.f18159a
            m9.o0 r2 = r0.mo10107a(r10)
            boolean r0 = r2.mo9913b()
            java.lang.String r3 = "Protobuf runtime is not correctly loaded."
            if (r0 == 0) goto L71
            boolean r0 = r1.isAssignableFrom(r10)
            if (r0 == 0) goto L59
            m9.m1<?, ?> r0 = p221m9.C4453g1.f18138d
            m9.q<?> r1 = p221m9.C4487s.f18222a
            m9.q<?> r1 = p221m9.C4487s.f18222a
            m9.q0 r2 = r2.mo9914c()
            m9.u0 r3 = new m9.u0
            r3.<init>(r0, r1, r2)
            goto L68
        L59:
            m9.m1<?, ?> r0 = p221m9.C4453g1.f18136b
            m9.q<?> r1 = p221m9.C4487s.f18223b
            if (r1 == 0) goto L6b
            m9.q0 r2 = r2.mo9914c()
            m9.u0 r3 = new m9.u0
            r3.<init>(r0, r1, r2)
        L68:
            r0 = r3
            goto Ld1
        L6b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        L71:
            boolean r0 = r1.isAssignableFrom(r10)
            r1 = 0
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L9f
            int r0 = r2.mo9912a()
            if (r0 != r5) goto L81
            r4 = 1
        L81:
            if (r4 == 0) goto L8e
            m9.v0 r0 = p221m9.C4502x0.f18305b
            m9.g0 r1 = p221m9.AbstractC4452g0.f18133b
            m9.m1<?, ?> r3 = p221m9.C4453g1.f18138d
            m9.q<?> r4 = p221m9.C4487s.f18222a
            m9.q<?> r4 = p221m9.C4487s.f18222a
            goto L98
        L8e:
            m9.v0 r0 = p221m9.C4502x0.f18305b
            m9.g0 r3 = p221m9.AbstractC4452g0.f18133b
            m9.m1<?, ?> r4 = p221m9.C4453g1.f18138d
            r8 = r4
            r4 = r1
            r1 = r3
            r3 = r8
        L98:
            m9.l0 r5 = p221m9.C4473n0.f18194b
            r8 = r3
            r3 = r1
            r1 = r4
            r4 = r8
            goto Lc8
        L9f:
            int r0 = r2.mo9912a()
            if (r0 != r5) goto La6
            r4 = 1
        La6:
            if (r4 == 0) goto Lc0
            m9.v0 r0 = p221m9.C4502x0.f18304a
            m9.g0 r1 = p221m9.AbstractC4452g0.f18132a
            m9.m1<?, ?> r4 = p221m9.C4453g1.f18136b
            m9.q<?> r5 = p221m9.C4487s.f18223b
            if (r5 == 0) goto Lba
            m9.l0 r3 = p221m9.C4473n0.f18193a
            r7 = r3
            r6 = r5
            r3 = r0
            r5 = r4
            r4 = r1
            goto Lcd
        Lba:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        Lc0:
            m9.v0 r0 = p221m9.C4502x0.f18304a
            m9.g0 r3 = p221m9.AbstractC4452g0.f18132a
            m9.m1<?, ?> r4 = p221m9.C4453g1.f18137c
            m9.l0 r5 = p221m9.C4473n0.f18193a
        Lc8:
            r6 = r1
            r7 = r5
            r5 = r4
            r4 = r3
            r3 = r0
        Lcd:
            m9.t0 r0 = p221m9.C4491t0.m10330z(r2, r3, r4, r5, r6, r7)
        Ld1:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, m9.e1<?>> r1 = r9.f18094b
            java.lang.Object r10 = r1.putIfAbsent(r10, r0)
            m9.e1 r10 = (p221m9.InterfaceC4447e1) r10
            if (r10 == 0) goto Ldc
            r0 = r10
        Ldc:
            return r0
    }

    /* renamed from: b */
    public <T> p221m9.InterfaceC4447e1<T> m9904b(T r1) {
            r0 = this;
            java.lang.Class r1 = r1.getClass()
            m9.e1 r1 = r0.m9903a(r1)
            return r1
    }
}

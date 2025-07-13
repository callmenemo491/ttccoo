package p221m9;

/* renamed from: m9.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC4452g0 {

    /* renamed from: a */
    public static final p221m9.AbstractC4452g0 f18132a = null;

    /* renamed from: b */
    public static final p221m9.AbstractC4452g0 f18133b = null;

    /* renamed from: m9.g0$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: m9.g0$b */
    public static final class b extends p221m9.AbstractC4452g0 {

        /* renamed from: c */
        public static final java.lang.Class<?> f18134c = null;

        static {
                java.util.List r0 = java.util.Collections.emptyList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                java.lang.Class r0 = r0.getClass()
                p221m9.AbstractC4452g0.b.f18134c = r0
                return
        }

        public b(p221m9.AbstractC4452g0.a r1) {
                r0 = this;
                r1 = 0
                r0.<init>(r1)
                return
        }

        /* renamed from: d */
        public static <L> java.util.List<L> m10003d(java.lang.Object r3, long r4, int r6) {
                java.lang.Object r0 = p221m9.C4483q1.m10250n(r3, r4)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L2c
                boolean r1 = r0 instanceof p221m9.InterfaceC4449f0
                if (r1 == 0) goto L16
                m9.e0 r0 = new m9.e0
                r0.<init>(r6)
                goto L5f
            L16:
                boolean r1 = r0 instanceof p221m9.InterfaceC4506z0
                if (r1 == 0) goto L26
                boolean r1 = r0 instanceof p221m9.C4505z.c
                if (r1 == 0) goto L26
                m9.z$c r0 = (p221m9.C4505z.c) r0
                m9.z$c r6 = r0.mo9905B(r6)
            L24:
                r0 = r6
                goto L5f
            L26:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
                goto L5f
            L2c:
                java.lang.Class<?> r1 = p221m9.AbstractC4452g0.b.f18134c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L47
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
            L45:
                r0 = r1
                goto L5f
            L47:
                boolean r1 = r0 instanceof p221m9.C4480p1
                if (r1 == 0) goto L65
                m9.e0 r1 = new m9.e0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                m9.p1 r0 = (p221m9.C4480p1) r0
                int r6 = r1.size()
                r1.addAll(r6, r0)
                goto L45
            L5f:
                m9.q1$e r6 = p221m9.C4483q1.f18215f
                r6.m10278q(r3, r4, r0)
                goto L80
            L65:
                boolean r1 = r0 instanceof p221m9.InterfaceC4506z0
                if (r1 == 0) goto L80
                boolean r1 = r0 instanceof p221m9.C4505z.c
                if (r1 == 0) goto L80
                r1 = r0
                m9.z$c r1 = (p221m9.C4505z.c) r1
                boolean r2 = r1.mo9908U()
                if (r2 != 0) goto L80
                int r0 = r0.size()
                int r0 = r0 + r6
                m9.z$c r6 = r1.mo9905B(r0)
                goto L24
            L80:
                return r0
        }

        @Override // p221m9.AbstractC4452g0
        /* renamed from: a */
        public void mo10000a(java.lang.Object r4, long r5) {
                r3 = this;
                java.lang.Object r0 = p221m9.C4483q1.m10250n(r4, r5)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0 instanceof p221m9.InterfaceC4449f0
                if (r1 == 0) goto L11
                m9.f0 r0 = (p221m9.InterfaceC4449f0) r0
                m9.f0 r0 = r0.mo9982G()
                goto L36
            L11:
                java.lang.Class<?> r1 = p221m9.AbstractC4452g0.b.f18134c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L1e
                return
            L1e:
                boolean r1 = r0 instanceof p221m9.InterfaceC4506z0
                if (r1 == 0) goto L32
                boolean r1 = r0 instanceof p221m9.C4505z.c
                if (r1 == 0) goto L32
                m9.z$c r0 = (p221m9.C4505z.c) r0
                boolean r4 = r0.mo9908U()
                if (r4 == 0) goto L31
                r0.mo9910v()
            L31:
                return
            L32:
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            L36:
                m9.q1$e r1 = p221m9.C4483q1.f18215f
                r1.m10278q(r4, r5, r0)
                return
        }

        @Override // p221m9.AbstractC4452g0
        /* renamed from: b */
        public <E> void mo10001b(java.lang.Object r4, java.lang.Object r5, long r6) {
                r3 = this;
                java.lang.Object r5 = p221m9.C4483q1.m10250n(r5, r6)
                java.util.List r5 = (java.util.List) r5
                int r0 = r5.size()
                java.util.List r0 = m10003d(r4, r6, r0)
                int r1 = r0.size()
                int r2 = r5.size()
                if (r1 <= 0) goto L1d
                if (r2 <= 0) goto L1d
                r0.addAll(r5)
            L1d:
                if (r1 <= 0) goto L20
                r5 = r0
            L20:
                m9.q1$e r0 = p221m9.C4483q1.f18215f
                r0.m10278q(r4, r6, r5)
                return
        }

        @Override // p221m9.AbstractC4452g0
        /* renamed from: c */
        public <L> java.util.List<L> mo10002c(java.lang.Object r2, long r3) {
                r1 = this;
                r0 = 10
                java.util.List r2 = m10003d(r2, r3, r0)
                return r2
        }
    }

    /* renamed from: m9.g0$c */
    public static final class c extends p221m9.AbstractC4452g0 {
        public c(p221m9.AbstractC4452g0.a r1) {
                r0 = this;
                r1 = 0
                r0.<init>(r1)
                return
        }

        /* renamed from: d */
        public static <E> p221m9.C4505z.c<E> m10004d(java.lang.Object r0, long r1) {
                java.lang.Object r0 = p221m9.C4483q1.m10250n(r0, r1)
                m9.z$c r0 = (p221m9.C4505z.c) r0
                return r0
        }

        @Override // p221m9.AbstractC4452g0
        /* renamed from: a */
        public void mo10000a(java.lang.Object r1, long r2) {
                r0 = this;
                m9.z$c r1 = m10004d(r1, r2)
                r1.mo9910v()
                return
        }

        @Override // p221m9.AbstractC4452g0
        /* renamed from: b */
        public <E> void mo10001b(java.lang.Object r5, java.lang.Object r6, long r7) {
                r4 = this;
                m9.z$c r0 = m10004d(r5, r7)
                m9.z$c r6 = m10004d(r6, r7)
                int r1 = r0.size()
                int r2 = r6.size()
                if (r1 <= 0) goto L22
                if (r2 <= 0) goto L22
                boolean r3 = r0.mo9908U()
                if (r3 != 0) goto L1f
                int r2 = r2 + r1
                m9.z$c r0 = r0.mo9905B(r2)
            L1f:
                r0.addAll(r6)
            L22:
                if (r1 <= 0) goto L25
                r6 = r0
            L25:
                m9.q1$e r0 = p221m9.C4483q1.f18215f
                r0.m10278q(r5, r7, r6)
                return
        }

        @Override // p221m9.AbstractC4452g0
        /* renamed from: c */
        public <L> java.util.List<L> mo10002c(java.lang.Object r3, long r4) {
                r2 = this;
                m9.z$c r0 = m10004d(r3, r4)
                boolean r1 = r0.mo9908U()
                if (r1 != 0) goto L1e
                int r1 = r0.size()
                if (r1 != 0) goto L13
                r1 = 10
                goto L15
            L13:
                int r1 = r1 * 2
            L15:
                m9.z$c r0 = r0.mo9905B(r1)
                m9.q1$e r1 = p221m9.C4483q1.f18215f
                r1.m10278q(r3, r4, r0)
            L1e:
                return r0
        }
    }

    static {
            m9.g0$b r0 = new m9.g0$b
            r1 = 0
            r0.<init>(r1)
            p221m9.AbstractC4452g0.f18132a = r0
            m9.g0$c r0 = new m9.g0$c
            r0.<init>(r1)
            p221m9.AbstractC4452g0.f18133b = r0
            return
    }

    public AbstractC4452g0(p221m9.AbstractC4452g0.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract void mo10000a(java.lang.Object r1, long r2);

    /* renamed from: b */
    public abstract <L> void mo10001b(java.lang.Object r1, java.lang.Object r2, long r3);

    /* renamed from: c */
    public abstract <L> java.util.List<L> mo10002c(java.lang.Object r1, long r2);
}

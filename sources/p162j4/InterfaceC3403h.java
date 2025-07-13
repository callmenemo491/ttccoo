package p162j4;

/* renamed from: j4.h */
/* loaded from: classes.dex */
public interface InterfaceC3403h {

    /* renamed from: j4.h$a */
    public static class a {

        /* renamed from: a */
        public final int f14743a;

        /* renamed from: b */
        public final p108g5.InterfaceC2283r.a f14744b;

        /* renamed from: c */
        public final java.util.concurrent.CopyOnWriteArrayList<p162j4.InterfaceC3403h.a.C7396a> f14745c;

        /* renamed from: j4.h$a$a, reason: collision with other inner class name */
        public static final class C7396a {

            /* renamed from: a */
            public android.os.Handler f14746a;

            /* renamed from: b */
            public p162j4.InterfaceC3403h f14747b;

            public C7396a(android.os.Handler r1, p162j4.InterfaceC3403h r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f14746a = r1
                    r0.f14747b = r2
                    return
            }
        }

        public a() {
                r1 = this;
                java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
                r0.<init>()
                r1.<init>()
                r1.f14745c = r0
                r0 = 0
                r1.f14743a = r0
                r0 = 0
                r1.f14744b = r0
                return
        }

        public a(java.util.concurrent.CopyOnWriteArrayList<p162j4.InterfaceC3403h.a.C7396a> r1, int r2, p108g5.InterfaceC2283r.a r3) {
                r0 = this;
                r0.<init>()
                r0.f14745c = r1
                r0.f14743a = r2
                r0.f14744b = r3
                return
        }

        /* renamed from: a */
        public void m7823a() {
                r5 = this;
                java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r0 = r5.f14745c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                j4.h$a$a r1 = (p162j4.InterfaceC3403h.a.C7396a) r1
                j4.h r2 = r1.f14747b
                android.os.Handler r1 = r1.f14746a
                j4.f r3 = new j4.f
                r4 = 3
                r3.<init>(r5, r2, r4)
                p371v5.C6552b0.m13300D(r1, r3)
                goto L6
            L20:
                return
        }

        /* renamed from: b */
        public void m7824b() {
                r5 = this;
                java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r0 = r5.f14745c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                j4.h$a$a r1 = (p162j4.InterfaceC3403h.a.C7396a) r1
                j4.h r2 = r1.f14747b
                android.os.Handler r1 = r1.f14746a
                j4.f r3 = new j4.f
                r4 = 1
                r3.<init>(r5, r2, r4)
                p371v5.C6552b0.m13300D(r1, r3)
                goto L6
            L20:
                return
        }

        /* renamed from: c */
        public void m7825c() {
                r5 = this;
                java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r0 = r5.f14745c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                j4.h$a$a r1 = (p162j4.InterfaceC3403h.a.C7396a) r1
                j4.h r2 = r1.f14747b
                android.os.Handler r1 = r1.f14746a
                j4.f r3 = new j4.f
                r4 = 2
                r3.<init>(r5, r2, r4)
                p371v5.C6552b0.m13300D(r1, r3)
                goto L6
            L20:
                return
        }

        /* renamed from: d */
        public void m7826d(int r5) {
                r4 = this;
                java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r0 = r4.f14745c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                j4.h$a$a r1 = (p162j4.InterfaceC3403h.a.C7396a) r1
                j4.h r2 = r1.f14747b
                android.os.Handler r1 = r1.f14746a
                j4.g r3 = new j4.g
                r3.<init>(r4, r2, r5)
                p371v5.C6552b0.m13300D(r1, r3)
                goto L6
            L1f:
                return
        }

        /* renamed from: e */
        public void m7827e(java.lang.Exception r5) {
                r4 = this;
                java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r0 = r4.f14745c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                j4.h$a$a r1 = (p162j4.InterfaceC3403h.a.C7396a) r1
                j4.h r2 = r1.f14747b
                android.os.Handler r1 = r1.f14746a
                f4.n0 r3 = new f4.n0
                r3.<init>(r4, r2, r5)
                p371v5.C6552b0.m13300D(r1, r3)
                goto L6
            L1f:
                return
        }

        /* renamed from: f */
        public void m7828f() {
                r5 = this;
                java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r0 = r5.f14745c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                j4.h$a$a r1 = (p162j4.InterfaceC3403h.a.C7396a) r1
                j4.h r2 = r1.f14747b
                android.os.Handler r1 = r1.f14746a
                j4.f r3 = new j4.f
                r4 = 0
                r3.<init>(r5, r2, r4)
                p371v5.C6552b0.m13300D(r1, r3)
                goto L6
            L20:
                return
        }

        /* renamed from: g */
        public p162j4.InterfaceC3403h.a m7829g(int r3, p108g5.InterfaceC2283r.a r4) {
                r2 = this;
                j4.h$a r0 = new j4.h$a
                java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r1 = r2.f14745c
                r0.<init>(r1, r3, r4)
                return r0
        }
    }

    /* renamed from: E */
    void mo5396E(int r1, p108g5.InterfaceC2283r.a r2);

    /* renamed from: P */
    void mo5397P(int r1, p108g5.InterfaceC2283r.a r2);

    /* renamed from: e0 */
    void mo5399e0(int r1, p108g5.InterfaceC2283r.a r2);

    /* renamed from: g0 */
    void mo5400g0(int r1, p108g5.InterfaceC2283r.a r2);

    /* renamed from: o */
    void mo5402o(int r1, p108g5.InterfaceC2283r.a r2, int r3);

    /* renamed from: x */
    void mo5406x(int r1, p108g5.InterfaceC2283r.a r2, java.lang.Exception r3);
}

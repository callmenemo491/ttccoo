package p108g5;

/* renamed from: g5.u */
/* loaded from: classes.dex */
public interface InterfaceC2286u {

    /* renamed from: g5.u$a */
    public static class a {

        /* renamed from: a */
        public final int f10431a;

        /* renamed from: b */
        public final p108g5.InterfaceC2283r.a f10432b;

        /* renamed from: c */
        public final java.util.concurrent.CopyOnWriteArrayList<p108g5.InterfaceC2286u.a.C7393a> f10433c;

        /* renamed from: d */
        public final long f10434d;

        /* renamed from: g5.u$a$a, reason: collision with other inner class name */
        public static final class C7393a {

            /* renamed from: a */
            public android.os.Handler f10435a;

            /* renamed from: b */
            public p108g5.InterfaceC2286u f10436b;

            public C7393a(android.os.Handler r1, p108g5.InterfaceC2286u r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f10435a = r1
                    r0.f10436b = r2
                    return
            }
        }

        public a() {
                r2 = this;
                java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
                r0.<init>()
                r2.<init>()
                r2.f10433c = r0
                r0 = 0
                r2.f10431a = r0
                r0 = 0
                r2.f10432b = r0
                r0 = 0
                r2.f10434d = r0
                return
        }

        public a(java.util.concurrent.CopyOnWriteArrayList<p108g5.InterfaceC2286u.a.C7393a> r1, int r2, p108g5.InterfaceC2283r.a r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.f10433c = r1
                r0.f10431a = r2
                r0.f10432b = r3
                r0.f10434d = r4
                return
        }

        /* renamed from: a */
        public final long m6032a(long r4) {
                r3 = this;
                long r4 = p371v5.C6552b0.m13307K(r4)
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto Le
                goto L11
            Le:
                long r0 = r3.f10434d
                long r0 = r0 + r4
            L11:
                return r0
        }

        /* renamed from: b */
        public void m6033b(p108g5.C2279n r5) {
                r4 = this;
                java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r0 = r4.f10433c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                g5.u$a$a r1 = (p108g5.InterfaceC2286u.a.C7393a) r1
                g5.u r2 = r1.f10436b
                android.os.Handler r1 = r1.f10435a
                f4.n0 r3 = new f4.n0
                r3.<init>(r4, r2, r5)
                p371v5.C6552b0.m13300D(r1, r3)
                goto L6
            L1f:
                return
        }

        /* renamed from: c */
        public void m6034c(p108g5.C2276k r10, p108g5.C2279n r11) {
                r9 = this;
                java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r0 = r9.f10433c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                g5.u$a$a r1 = (p108g5.InterfaceC2286u.a.C7393a) r1
                g5.u r4 = r1.f10436b
                android.os.Handler r1 = r1.f10435a
                g5.s r8 = new g5.s
                r7 = 2
                r2 = r8
                r3 = r9
                r5 = r10
                r6 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                p371v5.C6552b0.m13300D(r1, r8)
                goto L6
            L24:
                return
        }

        /* renamed from: d */
        public void m6035d(p108g5.C2276k r10, p108g5.C2279n r11) {
                r9 = this;
                java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r0 = r9.f10433c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                g5.u$a$a r1 = (p108g5.InterfaceC2286u.a.C7393a) r1
                g5.u r4 = r1.f10436b
                android.os.Handler r1 = r1.f10435a
                g5.s r8 = new g5.s
                r7 = 1
                r2 = r8
                r3 = r9
                r5 = r10
                r6 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                p371v5.C6552b0.m13300D(r1, r8)
                goto L6
            L24:
                return
        }

        /* renamed from: e */
        public void m6036e(p108g5.C2276k r11, p108g5.C2279n r12, java.io.IOException r13, boolean r14) {
                r10 = this;
                java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r0 = r10.f10433c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L25
                java.lang.Object r1 = r0.next()
                g5.u$a$a r1 = (p108g5.InterfaceC2286u.a.C7393a) r1
                g5.u r4 = r1.f10436b
                android.os.Handler r1 = r1.f10435a
                g5.t r9 = new g5.t
                r2 = r9
                r3 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r8 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8)
                p371v5.C6552b0.m13300D(r1, r9)
                goto L6
            L25:
                return
        }

        /* renamed from: f */
        public void m6037f(p108g5.C2276k r10, p108g5.C2279n r11) {
                r9 = this;
                java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r0 = r9.f10433c
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                g5.u$a$a r1 = (p108g5.InterfaceC2286u.a.C7393a) r1
                g5.u r4 = r1.f10436b
                android.os.Handler r1 = r1.f10435a
                g5.s r8 = new g5.s
                r7 = 0
                r2 = r8
                r3 = r9
                r5 = r10
                r6 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                p371v5.C6552b0.m13300D(r1, r8)
                goto L6
            L24:
                return
        }

        /* renamed from: g */
        public p108g5.InterfaceC2286u.a m6038g(int r8, p108g5.InterfaceC2283r.a r9, long r10) {
                r7 = this;
                g5.u$a r6 = new g5.u$a
                java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r1 = r7.f10433c
                r0 = r6
                r2 = r8
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4)
                return r6
        }
    }

    /* renamed from: D */
    void mo5395D(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4);

    /* renamed from: i */
    void mo5401i(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4);

    /* renamed from: p */
    void mo5403p(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2279n r3);

    /* renamed from: s */
    void mo5404s(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4, java.io.IOException r5, boolean r6);

    /* renamed from: w */
    void mo5405w(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4);
}

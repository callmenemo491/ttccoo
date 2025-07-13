package p216m4;

/* renamed from: m4.a */
/* loaded from: classes.dex */
public abstract class AbstractC4352a {

    /* renamed from: a */
    public final p216m4.AbstractC4352a.a f17839a;

    /* renamed from: b */
    public final p216m4.AbstractC4352a.f f17840b;

    /* renamed from: c */
    public p216m4.AbstractC4352a.c f17841c;

    /* renamed from: d */
    public final int f17842d;

    /* renamed from: m4.a$a */
    public static class a implements p216m4.InterfaceC4378w {

        /* renamed from: a */
        public final p216m4.AbstractC4352a.d f17843a;

        /* renamed from: b */
        public final long f17844b;

        /* renamed from: c */
        public final long f17845c;

        /* renamed from: d */
        public final long f17846d;

        /* renamed from: e */
        public final long f17847e;

        /* renamed from: f */
        public final long f17848f;

        /* renamed from: g */
        public final long f17849g;

        public a(p216m4.AbstractC4352a.d r1, long r2, long r4, long r6, long r8, long r10, long r12) {
                r0 = this;
                r0.<init>()
                r0.f17843a = r1
                r0.f17844b = r2
                r0.f17845c = r4
                r0.f17846d = r6
                r0.f17847e = r8
                r0.f17848f = r10
                r0.f17849g = r12
                return
        }

        @Override // p216m4.InterfaceC4378w
        /* renamed from: d */
        public boolean mo9742d() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // p216m4.InterfaceC4378w
        /* renamed from: g */
        public p216m4.InterfaceC4378w.a mo9743g(long r14) {
                r13 = this;
                m4.a$d r0 = r13.f17843a
                long r1 = r0.mo9745f(r14)
                long r3 = r13.f17845c
                long r5 = r13.f17846d
                long r7 = r13.f17847e
                long r9 = r13.f17848f
                long r11 = r13.f17849g
                long r0 = p216m4.AbstractC4352a.c.m9746a(r1, r3, r5, r7, r9, r11)
                m4.w$a r2 = new m4.w$a
                m4.x r3 = new m4.x
                r3.<init>(r14, r0)
                r2.<init>(r3)
                return r2
        }

        @Override // p216m4.InterfaceC4378w
        /* renamed from: h */
        public long mo9744h() {
                r2 = this;
                long r0 = r2.f17844b
                return r0
        }
    }

    /* renamed from: m4.a$b */
    public static final class b implements p216m4.AbstractC4352a.d {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p216m4.AbstractC4352a.d
        /* renamed from: f */
        public long mo9745f(long r1) {
                r0 = this;
                return r1
        }
    }

    /* renamed from: m4.a$c */
    public static class c {

        /* renamed from: a */
        public final long f17850a;

        /* renamed from: b */
        public final long f17851b;

        /* renamed from: c */
        public final long f17852c;

        /* renamed from: d */
        public long f17853d;

        /* renamed from: e */
        public long f17854e;

        /* renamed from: f */
        public long f17855f;

        /* renamed from: g */
        public long f17856g;

        /* renamed from: h */
        public long f17857h;

        public c(long r1, long r3, long r5, long r7, long r9, long r11, long r13) {
                r0 = this;
                r0.<init>()
                r0.f17850a = r1
                r0.f17851b = r3
                r0.f17853d = r5
                r0.f17854e = r7
                r0.f17855f = r9
                r0.f17856g = r11
                r0.f17852c = r13
                long r1 = m9746a(r3, r5, r7, r9, r11, r13)
                r0.f17857h = r1
                return
        }

        /* renamed from: a */
        public static long m9746a(long r7, long r9, long r11, long r13, long r15, long r17) {
                r0 = 1
                long r2 = r13 + r0
                int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
                if (r4 >= 0) goto L2e
                long r2 = r9 + r0
                int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r4 < 0) goto Lf
                goto L2e
            Lf:
                long r2 = r7 - r9
                long r4 = r15 - r13
                float r4 = (float) r4
                long r5 = r11 - r9
                float r5 = (float) r5
                float r4 = r4 / r5
                float r2 = (float) r2
                float r2 = r2 * r4
                long r2 = (long) r2
                r4 = 20
                long r4 = r2 / r4
                long r2 = r2 + r13
                long r2 = r2 - r17
                long r2 = r2 - r4
                long r0 = r15 - r0
                r7 = r2
                r9 = r13
                r11 = r0
                long r0 = p371v5.C6552b0.m13316i(r7, r9, r11)
                return r0
            L2e:
                return r13
        }
    }

    /* renamed from: m4.a$d */
    public interface d {
        /* renamed from: f */
        long mo9745f(long r1);
    }

    /* renamed from: m4.a$e */
    public static final class e {

        /* renamed from: d */
        public static final p216m4.AbstractC4352a.e f17858d = null;

        /* renamed from: a */
        public final int f17859a;

        /* renamed from: b */
        public final long f17860b;

        /* renamed from: c */
        public final long f17861c;

        static {
                m4.a$e r6 = new m4.a$e
                r1 = -3
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r4 = -1
                r0 = r6
                r0.<init>(r1, r2, r4)
                p216m4.AbstractC4352a.e.f17858d = r6
                return
        }

        public e(int r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.f17859a = r1
                r0.f17860b = r2
                r0.f17861c = r4
                return
        }

        /* renamed from: a */
        public static p216m4.AbstractC4352a.e m9747a(long r7, long r9) {
                m4.a$e r6 = new m4.a$e
                r1 = -1
                r0 = r6
                r2 = r7
                r4 = r9
                r0.<init>(r1, r2, r4)
                return r6
        }

        /* renamed from: b */
        public static p216m4.AbstractC4352a.e m9748b(long r7) {
                m4.a$e r6 = new m4.a$e
                r1 = 0
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0 = r6
                r4 = r7
                r0.<init>(r1, r2, r4)
                return r6
        }

        /* renamed from: c */
        public static p216m4.AbstractC4352a.e m9749c(long r7, long r9) {
                m4.a$e r6 = new m4.a$e
                r1 = -2
                r0 = r6
                r2 = r7
                r4 = r9
                r0.<init>(r1, r2, r4)
                return r6
        }
    }

    /* renamed from: m4.a$f */
    public interface f {
        /* renamed from: a */
        p216m4.AbstractC4352a.e mo9750a(p216m4.InterfaceC4365j r1, long r2);

        /* renamed from: b */
        void mo9751b();
    }

    public AbstractC4352a(p216m4.AbstractC4352a.d r17, p216m4.AbstractC4352a.f r18, long r19, long r21, long r23, long r25, long r27, long r29, int r31) {
            r16 = this;
            r0 = r16
            r16.<init>()
            r1 = r18
            r0.f17840b = r1
            r1 = r31
            r0.f17842d = r1
            m4.a$a r15 = new m4.a$a
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r9 = r25
            r11 = r27
            r13 = r29
            r1.<init>(r2, r3, r5, r7, r9, r11, r13)
            r0.f17839a = r15
            return
    }

    /* renamed from: a */
    public int m9736a(p216m4.InterfaceC4365j r19, p216m4.C4377v r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
        L6:
            m4.a$c r3 = r0.f17841c
            p371v5.C6549a.m13292f(r3)
            long r4 = r3.f17855f
            long r6 = r3.f17856g
            long r8 = r3.f17857h
            long r6 = r6 - r4
            int r10 = r0.f17842d
            long r10 = (long) r10
            r12 = 0
            int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r13 > 0) goto L22
            r0.m9738c(r12, r4)
            int r1 = r0.m9739d(r1, r4, r2)
            return r1
        L22:
            boolean r4 = r0.m9741f(r1, r8)
            if (r4 != 0) goto L2d
            int r1 = r0.m9739d(r1, r8, r2)
            return r1
        L2d:
            r19.mo9790h()
            m4.a$f r4 = r0.f17840b
            long r5 = r3.f17851b
            m4.a$e r4 = r4.mo9750a(r1, r5)
            int r5 = r4.f17859a
            r6 = -3
            if (r5 == r6) goto L90
            r6 = -2
            if (r5 == r6) goto L76
            r6 = -1
            if (r5 == r6) goto L5f
            if (r5 != 0) goto L57
            long r5 = r4.f17861c
            r0.m9741f(r1, r5)
            r3 = 1
            long r5 = r4.f17861c
            r0.m9738c(r3, r5)
            long r3 = r4.f17861c
            int r1 = r0.m9739d(r1, r3, r2)
            return r1
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L5f:
            long r8 = r4.f17860b
            long r12 = r4.f17861c
            r3.f17854e = r8
            r3.f17856g = r12
            long r4 = r3.f17851b
            long r6 = r3.f17853d
            long r10 = r3.f17855f
            long r14 = r3.f17852c
            long r4 = p216m4.AbstractC4352a.c.m9746a(r4, r6, r8, r10, r12, r14)
            r3.f17857h = r4
            goto L6
        L76:
            long r8 = r4.f17860b
            long r12 = r4.f17861c
            r3.f17853d = r8
            r3.f17855f = r12
            long r6 = r3.f17851b
            long r10 = r3.f17854e
            long r14 = r3.f17856g
            long r4 = r3.f17852c
            r16 = r4
            long r4 = p216m4.AbstractC4352a.c.m9746a(r6, r8, r10, r12, r14, r16)
            r3.f17857h = r4
            goto L6
        L90:
            r0.m9738c(r12, r8)
            int r1 = r0.m9739d(r1, r8, r2)
            return r1
    }

    /* renamed from: b */
    public final boolean m9737b() {
            r1 = this;
            m4.a$c r0 = r1.f17841c
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: c */
    public final void m9738c(boolean r1, long r2) {
            r0 = this;
            r1 = 0
            r0.f17841c = r1
            m4.a$f r1 = r0.f17840b
            r1.mo9751b()
            return
    }

    /* renamed from: d */
    public final int m9739d(p216m4.InterfaceC4365j r3, long r4, p216m4.C4377v r6) {
            r2 = this;
            long r0 = r3.mo9797q()
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 != 0) goto La
            r3 = 0
            return r3
        La:
            r6.f17934a = r4
            r3 = 1
            return r3
    }

    /* renamed from: e */
    public final void m9740e(long r20) {
            r19 = this;
            r0 = r19
            r2 = r20
            m4.a$c r1 = r0.f17841c
            if (r1 == 0) goto Lf
            long r4 = r1.f17850a
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto Lf
            return
        Lf:
            m4.a$c r14 = new m4.a$c
            m4.a$a r1 = r0.f17839a
            m4.a$d r1 = r1.f17843a
            long r4 = r1.mo9745f(r2)
            m4.a$a r1 = r0.f17839a
            long r6 = r1.f17845c
            long r8 = r1.f17846d
            long r10 = r1.f17847e
            long r12 = r1.f17848f
            r15 = r12
            long r12 = r1.f17849g
            r1 = r14
            r2 = r20
            r17 = r12
            r12 = r15
            r0 = r14
            r14 = r17
            r1.<init>(r2, r4, r6, r8, r10, r12, r14)
            r1 = r0
            r0 = r19
            r0.f17841c = r1
            return
    }

    /* renamed from: f */
    public final boolean m9741f(p216m4.InterfaceC4365j r4, long r5) {
            r3 = this;
            long r0 = r4.mo9797q()
            long r5 = r5 - r0
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L18
            r0 = 262144(0x40000, double:1.295163E-318)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L18
            int r6 = (int) r5
            r4.mo9791i(r6)
            r4 = 1
            return r4
        L18:
            r4 = 0
            return r4
    }
}

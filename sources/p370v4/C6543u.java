package p370v4;

/* renamed from: v4.u */
/* loaded from: classes.dex */
public final class C6543u extends p216m4.AbstractC4352a {

    /* renamed from: v4.u$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: v4.u$b */
    public static final class b implements p216m4.AbstractC4352a.f {

        /* renamed from: a */
        public final p371v5.C6576z f25586a;

        /* renamed from: b */
        public final p371v5.C6571u f25587b;

        public b(p371v5.C6576z r1, p370v4.C6543u.a r2) {
                r0 = this;
                r0.<init>()
                r0.f25586a = r1
                v5.u r1 = new v5.u
                r1.<init>()
                r0.f25587b = r1
                return
        }

        @Override // p216m4.AbstractC4352a.f
        /* renamed from: a */
        public p216m4.AbstractC4352a.e mo9750a(p216m4.InterfaceC4365j r17, long r18) {
                r16 = this;
                r0 = r16
                long r1 = r17.mo9797q()
                long r3 = r17.mo9786a()
                long r3 = r3 - r1
                r5 = 20000(0x4e20, double:9.8813E-320)
                long r3 = java.lang.Math.min(r5, r3)
                int r4 = (int) r3
                v5.u r3 = r0.f25587b
                r3.m13392B(r4)
                v5.u r3 = r0.f25587b
                byte[] r3 = r3.f25710a
                r5 = 0
                r6 = r17
                r6.mo9795o(r3, r5, r4)
                v5.u r3 = r0.f25587b
                r4 = -1
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r8 = r5
                r7 = -1
            L2b:
                int r10 = r3.m13398a()
                r11 = 4
                if (r10 < r11) goto Lfb
                byte[] r10 = r3.f25710a
                int r12 = r3.f25711b
                int r10 = p370v4.C6543u.m13282g(r10, r12)
                r12 = 1
                r13 = 442(0x1ba, float:6.2E-43)
                if (r10 == r13) goto L43
                r3.m13397G(r12)
                goto L2b
            L43:
                r3.m13397G(r11)
                long r14 = p370v4.C6544v.m13283c(r3)
                int r4 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
                if (r4 == 0) goto L7a
                v5.z r4 = r0.f25586a
                long r14 = r4.m13444b(r14)
                int r4 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
                if (r4 <= 0) goto L64
                int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r3 != 0) goto L62
                m4.a$e r1 = p216m4.AbstractC4352a.e.m9747a(r14, r1)
                goto L108
            L62:
                long r3 = (long) r7
                goto L6f
            L64:
                r7 = 100000(0x186a0, double:4.94066E-319)
                long r7 = r7 + r14
                int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
                if (r4 <= 0) goto L76
                int r3 = r3.f25711b
                long r3 = (long) r3
            L6f:
                long r1 = r1 + r3
                m4.a$e r1 = p216m4.AbstractC4352a.e.m9748b(r1)
                goto L108
            L76:
                int r4 = r3.f25711b
                r7 = r4
                r8 = r14
            L7a:
                int r4 = r3.f25712c
                int r10 = r3.m13398a()
                r14 = 10
                if (r10 >= r14) goto L85
                goto Le2
            L85:
                r10 = 9
                r3.m13397G(r10)
                int r10 = r3.m13418u()
                r10 = r10 & 7
                int r14 = r3.m13398a()
                if (r14 >= r10) goto L97
                goto Le2
            L97:
                r3.m13397G(r10)
                int r10 = r3.m13398a()
                if (r10 >= r11) goto La1
                goto Le2
            La1:
                byte[] r10 = r3.f25710a
                int r14 = r3.f25711b
                int r10 = p370v4.C6543u.m13282g(r10, r14)
                r14 = 443(0x1bb, float:6.21E-43)
                if (r10 != r14) goto Lbe
                r3.m13397G(r11)
                int r10 = r3.m13423z()
                int r14 = r3.m13398a()
                if (r14 >= r10) goto Lbb
                goto Le2
            Lbb:
                r3.m13397G(r10)
            Lbe:
                int r10 = r3.m13398a()
                if (r10 < r11) goto Lf7
                byte[] r10 = r3.f25710a
                int r14 = r3.f25711b
                int r10 = p370v4.C6543u.m13282g(r10, r14)
                if (r10 == r13) goto Lf7
                r14 = 441(0x1b9, float:6.18E-43)
                if (r10 != r14) goto Ld3
                goto Lf7
            Ld3:
                int r10 = r10 >>> 8
                if (r10 == r12) goto Ld8
                goto Lf7
            Ld8:
                r3.m13397G(r11)
                int r10 = r3.m13398a()
                r14 = 2
                if (r10 >= r14) goto Le6
            Le2:
                r3.m13396F(r4)
                goto Lf7
            Le6:
                int r10 = r3.m13423z()
                int r14 = r3.f25712c
                int r15 = r3.f25711b
                int r15 = r15 + r10
                int r10 = java.lang.Math.min(r14, r15)
                r3.m13396F(r10)
                goto Lbe
            Lf7:
                int r4 = r3.f25711b
                goto L2b
            Lfb:
                int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r3 == 0) goto L106
                long r3 = (long) r4
                long r1 = r1 + r3
                m4.a$e r1 = p216m4.AbstractC4352a.e.m9749c(r8, r1)
                goto L108
            L106:
                m4.a$e r1 = p216m4.AbstractC4352a.e.f17858d
            L108:
                return r1
        }

        @Override // p216m4.AbstractC4352a.f
        /* renamed from: b */
        public void mo9751b() {
                r2 = this;
                v5.u r0 = r2.f25587b
                byte[] r1 = p371v5.C6552b0.f25629f
                r0.m13393C(r1)
                return
        }
    }

    public C6543u(p371v5.C6576z r17, long r18, long r20) {
            r16 = this;
            m4.a$b r1 = new m4.a$b
            r1.<init>()
            v4.u$b r2 = new v4.u$b
            r0 = 0
            r3 = r17
            r2.<init>(r3, r0)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 1000(0x3e8, float:1.401E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
    }

    /* renamed from: g */
    public static int m13282g(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }
}

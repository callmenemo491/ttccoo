package p370v4;

/* renamed from: v4.a0 */
/* loaded from: classes.dex */
public final class C6519a0 extends p216m4.AbstractC4352a {

    /* renamed from: v4.a0$a */
    public static final class a implements p216m4.AbstractC4352a.f {

        /* renamed from: a */
        public final p371v5.C6576z f25271a;

        /* renamed from: b */
        public final p371v5.C6571u f25272b;

        /* renamed from: c */
        public final int f25273c;

        /* renamed from: d */
        public final int f25274d;

        public a(int r1, p371v5.C6576z r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f25273c = r1
                r0.f25271a = r2
                r0.f25274d = r3
                v5.u r1 = new v5.u
                r1.<init>()
                r0.f25272b = r1
                return
        }

        @Override // p216m4.AbstractC4352a.f
        /* renamed from: a */
        public p216m4.AbstractC4352a.e mo9750a(p216m4.InterfaceC4365j r18, long r19) {
                r17 = this;
                r0 = r17
                long r1 = r18.mo9797q()
                int r3 = r0.f25274d
                long r3 = (long) r3
                long r5 = r18.mo9786a()
                long r5 = r5 - r1
                long r3 = java.lang.Math.min(r3, r5)
                int r4 = (int) r3
                v5.u r3 = r0.f25272b
                r3.m13392B(r4)
                v5.u r3 = r0.f25272b
                byte[] r3 = r3.f25710a
                r5 = 0
                r6 = r18
                r6.mo9795o(r3, r5, r4)
                v5.u r3 = r0.f25272b
                int r4 = r3.f25712c
                r7 = -1
                r9 = r7
                r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L2e:
                int r13 = r3.m13398a()
                r14 = 188(0xbc, float:2.63E-43)
                if (r13 < r14) goto L85
                byte[] r13 = r3.f25710a
                int r14 = r3.f25711b
            L3a:
                if (r14 >= r4) goto L45
                r15 = r13[r14]
                r5 = 71
                if (r15 == r5) goto L45
                int r14 = r14 + 1
                goto L3a
            L45:
                int r5 = r14 + 188
                if (r5 <= r4) goto L4a
                goto L85
            L4a:
                int r6 = r0.f25273c
                long r6 = p064e.C1492f.m4047g(r3, r14, r6)
                r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r8 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
                if (r8 == 0) goto L80
                v5.z r8 = r0.f25271a
                long r6 = r8.m13444b(r6)
                int r8 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r8 <= 0) goto L6e
                int r3 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
                if (r3 != 0) goto L6c
                m4.a$e r1 = p216m4.AbstractC4352a.e.m9747a(r6, r1)
                goto L96
            L6c:
                long r1 = r1 + r9
                goto L78
            L6e:
                r8 = 100000(0x186a0, double:4.94066E-319)
                long r8 = r8 + r6
                int r10 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
                if (r10 <= 0) goto L7d
                long r3 = (long) r14
                long r1 = r1 + r3
            L78:
                m4.a$e r1 = p216m4.AbstractC4352a.e.m9748b(r1)
                goto L96
            L7d:
                long r8 = (long) r14
                r11 = r6
                r9 = r8
            L80:
                r3.m13396F(r5)
                long r7 = (long) r5
                goto L2e
            L85:
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r5 == 0) goto L94
                long r1 = r1 + r7
                m4.a$e r1 = p216m4.AbstractC4352a.e.m9749c(r11, r1)
                goto L96
            L94:
                m4.a$e r1 = p216m4.AbstractC4352a.e.f17858d
            L96:
                return r1
        }

        @Override // p216m4.AbstractC4352a.f
        /* renamed from: b */
        public void mo9751b() {
                r2 = this;
                v5.u r0 = r2.f25272b
                byte[] r1 = p371v5.C6552b0.f25629f
                r0.m13393C(r1)
                return
        }
    }

    public C6519a0(p371v5.C6576z r17, long r18, long r20, int r22, int r23) {
            r16 = this;
            m4.a$b r1 = new m4.a$b
            r1.<init>()
            v4.a0$a r2 = new v4.a0$a
            r0 = r17
            r3 = r22
            r4 = r23
            r2.<init>(r3, r0, r4)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
    }
}

package p246o4;

/* renamed from: o4.a */
/* loaded from: classes.dex */
public final class C4891a extends p216m4.AbstractC4352a {

    /* renamed from: o4.a$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: o4.a$b */
    public static final class b implements p216m4.AbstractC4352a.f {

        /* renamed from: a */
        public final p216m4.C4373r f19386a;

        /* renamed from: b */
        public final int f19387b;

        /* renamed from: c */
        public final p216m4.C4370o.a f19388c;

        public b(p216m4.C4373r r1, int r2, p246o4.C4891a.a r3) {
                r0 = this;
                r0.<init>()
                r0.f19386a = r1
                r0.f19387b = r2
                m4.o$a r1 = new m4.o$a
                r1.<init>()
                r0.f19388c = r1
                return
        }

        @Override // p216m4.AbstractC4352a.f
        /* renamed from: a */
        public p216m4.AbstractC4352a.e mo9750a(p216m4.InterfaceC4365j r11, long r12) {
                r10 = this;
                long r0 = r11.mo9797q()
                long r2 = r10.m11030c(r11)
                long r4 = r11.mo9794n()
                m4.r r6 = r10.f19386a
                int r6 = r6.f17914c
                r7 = 6
                int r6 = java.lang.Math.max(r7, r6)
                r11.mo9796p(r6)
                long r6 = r10.m11030c(r11)
                long r8 = r11.mo9794n()
                int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r11 > 0) goto L2d
                int r11 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r11 <= 0) goto L2d
                m4.a$e r11 = p216m4.AbstractC4352a.e.m9748b(r4)
                return r11
            L2d:
                int r11 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r11 > 0) goto L36
                m4.a$e r11 = p216m4.AbstractC4352a.e.m9749c(r6, r8)
                return r11
            L36:
                m4.a$e r11 = p216m4.AbstractC4352a.e.m9747a(r2, r0)
                return r11
        }

        @Override // p216m4.AbstractC4352a.f
        /* renamed from: b */
        public /* synthetic */ void mo9751b() {
                r0 = this;
                p216m4.C4354b.m9755a(r0)
                return
        }

        /* renamed from: c */
        public final long m11030c(p216m4.InterfaceC4365j r14) {
                r13 = this;
            L0:
                long r0 = r14.mo9794n()
                long r2 = r14.mo9786a()
                r4 = 6
                long r2 = r2 - r4
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 >= 0) goto L68
                m4.r r0 = r13.f19386a
                int r1 = r13.f19387b
                m4.o$a r2 = r13.f19388c
                long r6 = r14.mo9794n()
                r3 = 2
                byte[] r8 = new byte[r3]
                r9 = 0
                r14.mo9795o(r8, r9, r3)
                r10 = r8[r9]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 << 8
                r11 = 1
                r12 = r8[r11]
                r12 = r12 & 255(0xff, float:3.57E-43)
                r10 = r10 | r12
                if (r10 == r1) goto L3b
                r14.mo9790h()
                long r0 = r14.mo9797q()
                long r6 = r6 - r0
                int r0 = (int) r6
                r14.mo9796p(r0)
                goto L62
            L3b:
                v5.u r10 = new v5.u
                r12 = 16
                r10.<init>(r12)
                byte[] r12 = r10.f25710a
                java.lang.System.arraycopy(r8, r9, r12, r9, r3)
                byte[] r8 = r10.f25710a
                r9 = 14
                int r3 = p216m4.C4367l.m9809c(r14, r8, r3, r9)
                r10.m13395E(r3)
                r14.mo9790h()
                long r8 = r14.mo9797q()
                long r6 = r6 - r8
                int r3 = (int) r6
                r14.mo9796p(r3)
                boolean r9 = p216m4.C4370o.m9814b(r10, r0, r1, r2)
            L62:
                if (r9 != 0) goto L68
                r14.mo9796p(r11)
                goto L0
            L68:
                long r0 = r14.mo9794n()
                long r2 = r14.mo9786a()
                long r2 = r2 - r4
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L87
                long r0 = r14.mo9786a()
                long r2 = r14.mo9794n()
                long r0 = r0 - r2
                int r1 = (int) r0
                r14.mo9796p(r1)
                m4.r r14 = r13.f19386a
                long r0 = r14.f17921j
                return r0
            L87:
                m4.o$a r14 = r13.f19388c
                long r0 = r14.f17909a
                return r0
        }
    }

    public C4891a(p216m4.C4373r r17, int r18, long r19, long r21) {
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            u3.b r1 = new u3.b
            r1.<init>(r0)
            o4.a$b r2 = new o4.a$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4, r3)
            long r3 = r17.m9823d()
            long r7 = r0.f17921j
            int r5 = r0.f17915d
            if (r5 <= 0) goto L27
            long r5 = (long) r5
            int r9 = r0.f17914c
            long r9 = (long) r9
            long r5 = r5 + r9
            r9 = 2
            long r5 = r5 / r9
            r9 = 1
            goto L42
        L27:
            int r5 = r0.f17912a
            int r6 = r0.f17913b
            if (r5 != r6) goto L31
            if (r5 <= 0) goto L31
            long r5 = (long) r5
            goto L33
        L31:
            r5 = 4096(0x1000, double:2.0237E-320)
        L33:
            int r9 = r0.f17918g
            long r9 = (long) r9
            long r5 = r5 * r9
            int r9 = r0.f17919h
            long r9 = (long) r9
            long r5 = r5 * r9
            r9 = 8
            long r5 = r5 / r9
            r9 = 64
        L42:
            long r13 = r5 + r9
            r5 = 6
            int r0 = r0.f17914c
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
    }
}

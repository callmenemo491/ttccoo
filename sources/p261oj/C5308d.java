package p261oj;

/* renamed from: oj.d */
/* loaded from: classes.dex */
public class C5308d extends p240nj.AbstractC4848f.c {
    public C5308d(p240nj.AbstractC4845c r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, boolean r5) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r2 = 1
            r0 = 0
            if (r3 != 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = 0
        La:
            if (r4 != 0) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r3 != r2) goto L13
            r1.f19290e = r5
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Exactly one of the field elements is null"
            r2.<init>(r3)
            throw r2
    }

    public C5308d(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.f19290e = r5
            return
    }

    /* renamed from: A */
    public p261oj.C5307c m11621A() {
            r4 = this;
            nj.d[] r0 = r4.f19289d
            r1 = 1
            r2 = r0[r1]
            oj.c r2 = (p261oj.C5307c) r2
            if (r2 != 0) goto L15
            r2 = 0
            r2 = r0[r2]
            oj.c r2 = (p261oj.C5307c) r2
            r3 = 0
            oj.c r2 = r4.m11623z(r2, r3)
            r0[r1] = r2
        L15:
            return r2
    }

    /* renamed from: B */
    public p261oj.C5308d m11622B(boolean r18) {
            r17 = this;
            r0 = r17
            nj.d r1 = r0.f19287b
            oj.c r1 = (p261oj.C5307c) r1
            nj.d r2 = r0.f19288c
            oj.c r2 = (p261oj.C5307c) r2
            nj.d[] r3 = r0.f19289d
            r4 = 0
            r3 = r3[r4]
            oj.c r3 = (p261oj.C5307c) r3
            oj.c r5 = r17.m11621A()
            r6 = 8
            int[] r7 = new int[r6]
            int[] r8 = r1.f20559Y
            p261oj.C5306b.m11616d(r8, r7)
            int r8 = tj.AbstractC6255a.m12846c(r7, r7, r7)
            int[] r9 = r5.f20559Y
            r10 = r9[r4]
            long r10 = (long) r10
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            r14 = r7[r4]
            long r14 = (long) r14
            long r14 = r14 & r12
            long r10 = r10 + r14
            r14 = 0
            long r10 = r10 + r14
            int r14 = (int) r10
            r7[r4] = r14
            r14 = 32
            long r10 = r10 >>> r14
            r15 = 1
            r4 = r9[r15]
            r16 = r5
            long r4 = (long) r4
            long r4 = r4 & r12
            r6 = r7[r15]
            long r14 = (long) r6
            long r14 = r14 & r12
            long r4 = r4 + r14
            long r4 = r4 + r10
            int r6 = (int) r4
            r10 = 1
            r7[r10] = r6
            r6 = 32
            long r4 = r4 >>> r6
            r6 = 2
            r10 = r9[r6]
            long r10 = (long) r10
            long r10 = r10 & r12
            r14 = r7[r6]
            long r14 = (long) r14
            long r14 = r14 & r12
            long r10 = r10 + r14
            long r10 = r10 + r4
            int r4 = (int) r10
            r7[r6] = r4
            r4 = 32
            long r10 = r10 >>> r4
            r4 = 3
            r5 = r9[r4]
            long r14 = (long) r5
            long r14 = r14 & r12
            r5 = r7[r4]
            long r4 = (long) r5
            long r4 = r4 & r12
            long r14 = r14 + r4
            long r14 = r14 + r10
            int r4 = (int) r14
            r5 = 3
            r7[r5] = r4
            r4 = 32
            long r10 = r14 >>> r4
            r4 = 4
            r5 = r9[r4]
            long r14 = (long) r5
            long r14 = r14 & r12
            r5 = r7[r4]
            long r4 = (long) r5
            long r4 = r4 & r12
            long r14 = r14 + r4
            long r14 = r14 + r10
            int r4 = (int) r14
            r5 = 4
            r7[r5] = r4
            r4 = 32
            long r10 = r14 >>> r4
            r4 = 5
            r5 = r9[r4]
            long r14 = (long) r5
            long r14 = r14 & r12
            r5 = r7[r4]
            long r4 = (long) r5
            long r4 = r4 & r12
            long r14 = r14 + r4
            long r14 = r14 + r10
            int r4 = (int) r14
            r5 = 5
            r7[r5] = r4
            r4 = 32
            long r10 = r14 >>> r4
            r4 = 6
            r5 = r9[r4]
            long r14 = (long) r5
            long r14 = r14 & r12
            r5 = r7[r4]
            long r4 = (long) r5
            long r4 = r4 & r12
            long r14 = r14 + r4
            long r14 = r14 + r10
            int r4 = (int) r14
            r5 = 6
            r7[r5] = r4
            r4 = 32
            long r10 = r14 >>> r4
            r4 = 7
            r5 = r9[r4]
            long r14 = (long) r5
            long r14 = r14 & r12
            r5 = r7[r4]
            long r4 = (long) r5
            long r4 = r4 & r12
            long r14 = r14 + r4
            long r14 = r14 + r10
            int r4 = (int) r14
            r5 = 7
            r7[r5] = r4
            r4 = 32
            long r4 = r14 >>> r4
            int r5 = (int) r4
            int r8 = r8 + r5
            p261oj.C5306b.m11615c(r8, r7)
            r4 = 8
            int[] r5 = new int[r4]
            int[] r8 = r2.f20559Y
            p261oj.C5306b.m11620h(r8, r5)
            int[] r8 = new int[r4]
            int[] r2 = r2.f20559Y
            p261oj.C5306b.m11613a(r5, r2, r8)
            int[] r2 = new int[r4]
            int[] r1 = r1.f20559Y
            p261oj.C5306b.m11613a(r8, r1, r2)
            p261oj.C5306b.m11620h(r2, r2)
            int[] r1 = new int[r4]
            r4 = 16
            int[] r9 = new int[r4]
            tj.AbstractC6255a.m12836D(r8, r9)
            p261oj.C5306b.m11614b(r9, r1)
            p261oj.C5306b.m11620h(r1, r1)
            oj.c r12 = new oj.c
            r12.<init>(r8)
            int[] r9 = new int[r4]
            tj.AbstractC6255a.m12836D(r7, r9)
            p261oj.C5306b.m11614b(r9, r8)
            int[] r8 = r12.f20559Y
            p261oj.C5306b.m11619g(r8, r2, r8)
            int[] r8 = r12.f20559Y
            p261oj.C5306b.m11619g(r8, r2, r8)
            oj.c r13 = new oj.c
            r13.<init>(r2)
            int[] r8 = r12.f20559Y
            p261oj.C5306b.m11619g(r2, r8, r2)
            int[] r2 = r13.f20559Y
            int[] r4 = new int[r4]
            tj.AbstractC6255a.m12833A(r2, r7, r4)
            p261oj.C5306b.m11614b(r4, r2)
            int[] r2 = r13.f20559Y
            p261oj.C5306b.m11619g(r2, r1, r2)
            oj.c r2 = new oj.c
            r2.<init>(r5)
            int[] r4 = r3.f20559Y
            boolean r4 = tj.AbstractC6255a.m12863t(r4)
            if (r4 != 0) goto L131
            int[] r4 = r2.f20559Y
            int[] r3 = r3.f20559Y
            p261oj.C5306b.m11613a(r4, r3, r4)
        L131:
            r3 = 0
            if (r18 == 0) goto L145
            oj.c r3 = new oj.c
            r3.<init>(r1)
            r4 = r16
            int[] r4 = r4.f20559Y
            p261oj.C5306b.m11613a(r1, r4, r1)
            int[] r1 = r3.f20559Y
            p261oj.C5306b.m11620h(r1, r1)
        L145:
            oj.d r1 = new oj.d
            nj.c r11 = r0.f19286a
            nj.d[] r14 = new p240nj.AbstractC4846d[r6]
            r4 = 0
            r14[r4] = r2
            r2 = 1
            r14[r2] = r3
            boolean r15 = r0.f19290e
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            return r1
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: a */
    public p240nj.AbstractC4848f mo10920a(p240nj.AbstractC4848f r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r23.m10930k()
            if (r2 == 0) goto Lb
            return r1
        Lb:
            boolean r2 = r24.m10930k()
            if (r2 == 0) goto L12
            return r0
        L12:
            if (r0 != r1) goto L19
            nj.f r1 = r23.mo10943x()
            return r1
        L19:
            nj.c r3 = r0.f19286a
            nj.d r2 = r0.f19287b
            oj.c r2 = (p261oj.C5307c) r2
            nj.d r4 = r0.f19288c
            oj.c r4 = (p261oj.C5307c) r4
            nj.d[] r5 = r0.f19289d
            r6 = 0
            r5 = r5[r6]
            oj.c r5 = (p261oj.C5307c) r5
            nj.d r7 = r1.f19287b
            oj.c r7 = (p261oj.C5307c) r7
            nj.d r8 = r24.mo10927h()
            oj.c r8 = (p261oj.C5307c) r8
            nj.d r1 = r1.mo10928i(r6)
            oj.c r1 = (p261oj.C5307c) r1
            r9 = 16
            int[] r10 = new int[r9]
            r11 = 8
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r5.mo10900h()
            if (r15 == 0) goto L51
            int[] r7 = r7.f20559Y
            int[] r8 = r8.f20559Y
            goto L67
        L51:
            int[] r6 = r5.f20559Y
            p261oj.C5306b.m11616d(r6, r13)
            int[] r6 = r7.f20559Y
            p261oj.C5306b.m11613a(r13, r6, r12)
            int[] r6 = r5.f20559Y
            p261oj.C5306b.m11613a(r13, r6, r13)
            int[] r6 = r8.f20559Y
            p261oj.C5306b.m11613a(r13, r6, r13)
            r7 = r12
            r8 = r13
        L67:
            boolean r6 = r1.mo10900h()
            if (r6 == 0) goto L72
            int[] r2 = r2.f20559Y
            int[] r4 = r4.f20559Y
            goto L88
        L72:
            int[] r9 = r1.f20559Y
            p261oj.C5306b.m11616d(r9, r14)
            int[] r2 = r2.f20559Y
            p261oj.C5306b.m11613a(r14, r2, r10)
            int[] r2 = r1.f20559Y
            p261oj.C5306b.m11613a(r14, r2, r14)
            int[] r2 = r4.f20559Y
            p261oj.C5306b.m11613a(r14, r2, r14)
            r2 = r10
            r4 = r14
        L88:
            int[] r9 = new int[r11]
            p261oj.C5306b.m11619g(r2, r7, r9)
            p261oj.C5306b.m11619g(r4, r8, r12)
            boolean r7 = tj.AbstractC6255a.m12866w(r9)
            if (r7 == 0) goto La6
            boolean r1 = tj.AbstractC6255a.m12866w(r12)
            if (r1 == 0) goto La1
            nj.f r1 = r23.mo10943x()
            return r1
        La1:
            nj.f r1 = r3.mo10881n()
            return r1
        La6:
            int[] r7 = new int[r11]
            r8 = 16
            int[] r11 = new int[r8]
            tj.AbstractC6255a.m12836D(r9, r11)
            p261oj.C5306b.m11614b(r11, r7)
            r16 = r3
            r11 = 8
            int[] r3 = new int[r11]
            int[] r11 = new int[r8]
            tj.AbstractC6255a.m12833A(r7, r9, r11)
            p261oj.C5306b.m11614b(r11, r3)
            int[] r11 = new int[r8]
            tj.AbstractC6255a.m12833A(r7, r2, r11)
            p261oj.C5306b.m11614b(r11, r13)
            boolean r2 = tj.AbstractC6255a.m12866w(r3)
            if (r2 == 0) goto Ld2
            tj.AbstractC6255a.m12843K(r3)
            goto Ld7
        Ld2:
            int[] r2 = p261oj.C5306b.f20555a
            tj.AbstractC6255a.m12839G(r2, r3, r3)
        Ld7:
            tj.AbstractC6255a.m12833A(r4, r3, r10)
            int r2 = tj.AbstractC6255a.m12846c(r13, r13, r3)
            p261oj.C5306b.m11615c(r2, r3)
            oj.c r4 = new oj.c
            r4.<init>(r14)
            r2 = 16
            int[] r8 = new int[r2]
            tj.AbstractC6255a.m12836D(r12, r8)
            p261oj.C5306b.m11614b(r8, r14)
            int[] r2 = r4.f20559Y
            p261oj.C5306b.m11619g(r2, r3, r2)
            oj.c r8 = new oj.c
            r8.<init>(r3)
            int[] r2 = r4.f20559Y
            p261oj.C5306b.m11619g(r13, r2, r3)
            int[] r2 = r8.f20559Y
            tj.AbstractC6255a.m12834B(r2, r12, r10)
            int[] r2 = p261oj.C5306b.f20556b
            r3 = 16
            boolean r3 = p085f1.AbstractC1972m.m5019x(r3, r10, r2)
            r11 = 1
            if (r3 == 0) goto L16b
            r3 = 0
            r12 = r10[r3]
            long r12 = (long) r12
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r17
            r14 = r2[r3]
            r24 = r4
            long r3 = (long) r14
            long r3 = r3 & r17
            long r12 = r12 - r3
            int r3 = (int) r12
            r4 = 0
            r10[r4] = r3
            r3 = 32
            long r12 = r12 >> r3
            r19 = 0
            int r4 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r4 == 0) goto L137
            r4 = 8
            int r12 = p085f1.AbstractC1972m.m5009n(r4, r10, r11)
            long r12 = (long) r12
            goto L139
        L137:
            r4 = 8
        L139:
            r14 = r10[r4]
            long r3 = (long) r14
            long r3 = r3 & r17
            r21 = 19
            long r3 = r3 + r21
            long r3 = r3 + r12
            int r12 = (int) r3
            r13 = 8
            r10[r13] = r12
            r12 = 32
            long r3 = r3 >> r12
            r12 = 15
            int r13 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r13 == 0) goto L158
            r3 = 9
            int r3 = p085f1.AbstractC1972m.m4967B(r12, r10, r3)
            long r3 = (long) r3
        L158:
            r13 = r10[r12]
            long r13 = (long) r13
            long r13 = r13 & r17
            r2 = r2[r12]
            int r2 = r2 + r11
            long r11 = (long) r2
            long r11 = r17 & r11
            long r13 = r13 - r11
            long r13 = r13 + r3
            int r2 = (int) r13
            r3 = 15
            r10[r3] = r2
            goto L16d
        L16b:
            r24 = r4
        L16d:
            int[] r2 = r8.f20559Y
            p261oj.C5306b.m11614b(r10, r2)
            oj.c r2 = new oj.c
            r2.<init>(r9)
            if (r15 != 0) goto L17e
            int[] r3 = r5.f20559Y
            p261oj.C5306b.m11613a(r9, r3, r9)
        L17e:
            if (r6 != 0) goto L187
            int[] r3 = r2.f20559Y
            int[] r1 = r1.f20559Y
            p261oj.C5306b.m11613a(r3, r1, r3)
        L187:
            if (r15 == 0) goto L18c
            if (r6 == 0) goto L18c
            goto L18d
        L18c:
            r7 = 0
        L18d:
            oj.c r1 = r0.m11623z(r2, r7)
            r3 = 2
            nj.d[] r6 = new p240nj.AbstractC4846d[r3]
            r3 = 0
            r6[r3] = r2
            r2 = 1
            r6[r2] = r1
            oj.d r1 = new oj.d
            boolean r7 = r0.f19290e
            r2 = r1
            r3 = r16
            r4 = r24
            r5 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: i */
    public p240nj.AbstractC4846d mo10928i(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L8
            oj.c r2 = r1.m11621A()
            return r2
        L8:
            nj.d r2 = super.mo10928i(r2)
            return r2
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10933n() {
            r7 = this;
            boolean r0 = r7.m10930k()
            if (r0 == 0) goto L7
            return r7
        L7:
            oj.d r0 = new oj.d
            nj.c r2 = r7.f19286a
            nj.d r3 = r7.f19287b
            nj.d r1 = r7.f19288c
            nj.d r4 = r1.mo10905m()
            nj.d[] r5 = r7.f19289d
            boolean r6 = r7.f19290e
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: v */
    public p240nj.AbstractC4848f mo10941v() {
            r1 = this;
            boolean r0 = r1.m10930k()
            if (r0 == 0) goto L7
            return r1
        L7:
            nj.d r0 = r1.f19288c
            boolean r0 = r0.mo10901i()
            if (r0 == 0) goto L10
            return r1
        L10:
            r0 = 0
            oj.d r0 = r1.m11622B(r0)
            nj.f r0 = r0.mo10920a(r1)
            return r0
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: x */
    public p240nj.AbstractC4848f mo10943x() {
            r2 = this;
            boolean r0 = r2.m10930k()
            if (r0 == 0) goto L7
            return r2
        L7:
            nj.c r0 = r2.f19286a
            nj.d r1 = r2.f19288c
            boolean r1 = r1.mo10901i()
            if (r1 == 0) goto L16
            nj.f r0 = r0.mo10881n()
            return r0
        L16:
            r0 = 1
            oj.d r0 = r2.m11622B(r0)
            return r0
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: y */
    public p240nj.AbstractC4848f mo10944y(p240nj.AbstractC4848f r2) {
            r1 = this;
            if (r1 != r2) goto L7
            nj.f r2 = r1.mo10941v()
            return r2
        L7:
            boolean r0 = r1.m10930k()
            if (r0 == 0) goto Le
            return r2
        Le:
            boolean r0 = r2.m10930k()
            if (r0 == 0) goto L19
            nj.f r2 = r1.mo10943x()
            return r2
        L19:
            nj.d r0 = r1.f19288c
            boolean r0 = r0.mo10901i()
            if (r0 == 0) goto L22
            return r2
        L22:
            r0 = 0
            oj.d r0 = r1.m11622B(r0)
            nj.f r2 = r0.mo10920a(r2)
            return r2
    }

    /* renamed from: z */
    public p261oj.C5307c m11623z(p261oj.C5307c r3, int[] r4) {
            r2 = this;
            nj.c r0 = r2.f19286a
            nj.d r0 = r0.f19249b
            oj.c r0 = (p261oj.C5307c) r0
            boolean r1 = r3.mo10900h()
            if (r1 == 0) goto Ld
            return r0
        Ld:
            oj.c r1 = new oj.c
            r1.<init>()
            if (r4 != 0) goto L1b
            int[] r4 = r1.f20559Y
            int[] r3 = r3.f20559Y
            p261oj.C5306b.m11616d(r3, r4)
        L1b:
            int[] r3 = r1.f20559Y
            p261oj.C5306b.m11616d(r4, r3)
            int[] r3 = r1.f20559Y
            int[] r4 = r0.f20559Y
            p261oj.C5306b.m11613a(r3, r4, r3)
            return r1
    }
}

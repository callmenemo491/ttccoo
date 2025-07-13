package p298qj;

/* renamed from: qj.d */
/* loaded from: classes.dex */
public class C5670d extends p240nj.AbstractC4848f.c {
    public C5670d(p240nj.AbstractC4845c r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, boolean r5) {
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

    public C5670d(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.f19290e = r5
            return
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: a */
    public p240nj.AbstractC4848f mo10920a(p240nj.AbstractC4848f r38) {
            r37 = this;
            r0 = r37
            r1 = r38
            boolean r2 = r37.m10930k()
            if (r2 == 0) goto Lb
            return r1
        Lb:
            boolean r2 = r38.m10930k()
            if (r2 == 0) goto L12
            return r0
        L12:
            if (r0 != r1) goto L19
            nj.f r1 = r37.mo10943x()
            return r1
        L19:
            nj.c r3 = r0.f19286a
            nj.d r2 = r0.f19287b
            qj.c r2 = (p298qj.C5666c) r2
            nj.d r4 = r0.f19288c
            qj.c r4 = (p298qj.C5666c) r4
            nj.d r5 = r1.f19287b
            qj.c r5 = (p298qj.C5666c) r5
            nj.d r6 = r38.mo10927h()
            qj.c r6 = (p298qj.C5666c) r6
            nj.d[] r7 = r0.f19289d
            r8 = 0
            r7 = r7[r8]
            qj.c r7 = (p298qj.C5666c) r7
            nj.d r1 = r1.mo10928i(r8)
            qj.c r1 = (p298qj.C5666c) r1
            r9 = 8
            int[] r10 = new int[r9]
            r11 = 4
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo10900h()
            if (r15 == 0) goto L50
            int[] r5 = r5.f21979Y
            int[] r6 = r6.f21979Y
            goto L66
        L50:
            int[] r8 = r7.f21979Y
            p298qj.C5662b.m11954g(r8, r13)
            int[] r5 = r5.f21979Y
            p298qj.C5662b.m11950c(r13, r5, r12)
            int[] r5 = r7.f21979Y
            p298qj.C5662b.m11950c(r13, r5, r13)
            int[] r5 = r6.f21979Y
            p298qj.C5662b.m11950c(r13, r5, r13)
            r5 = r12
            r6 = r13
        L66:
            boolean r8 = r1.mo10900h()
            if (r8 == 0) goto L71
            int[] r2 = r2.f21979Y
            int[] r4 = r4.f21979Y
            goto L87
        L71:
            int[] r9 = r1.f21979Y
            p298qj.C5662b.m11954g(r9, r14)
            int[] r2 = r2.f21979Y
            p298qj.C5662b.m11950c(r14, r2, r10)
            int[] r2 = r1.f21979Y
            p298qj.C5662b.m11950c(r14, r2, r14)
            int[] r2 = r4.f21979Y
            p298qj.C5662b.m11950c(r14, r2, r14)
            r2 = r10
            r4 = r14
        L87:
            int[] r9 = new int[r11]
            p298qj.C5662b.m11956i(r2, r5, r9)
            p298qj.C5662b.m11956i(r4, r6, r12)
            boolean r5 = tj.AbstractC6255a.m12865v(r9)
            if (r5 == 0) goto La5
            boolean r1 = tj.AbstractC6255a.m12865v(r12)
            if (r1 == 0) goto La0
            nj.f r1 = r37.mo10943x()
            return r1
        La0:
            nj.f r1 = r3.mo10881n()
            return r1
        La5:
            r5 = 8
            int[] r6 = new int[r5]
            tj.AbstractC6255a.m12835C(r9, r6)
            p298qj.C5662b.m11952e(r6, r13)
            int[] r6 = new int[r11]
            int[] r11 = new int[r5]
            tj.AbstractC6255a.m12869z(r13, r9, r11)
            p298qj.C5662b.m11952e(r11, r6)
            int[] r11 = new int[r5]
            tj.AbstractC6255a.m12869z(r13, r2, r11)
            p298qj.C5662b.m11952e(r11, r13)
            p298qj.C5662b.m11951d(r6, r6)
            tj.AbstractC6255a.m12869z(r4, r6, r10)
            int r2 = tj.AbstractC6255a.m12845b(r13, r13, r6)
            p298qj.C5662b.m11953f(r2, r6)
            qj.c r4 = new qj.c
            r4.<init>(r14)
            r2 = 8
            int[] r2 = new int[r2]
            tj.AbstractC6255a.m12835C(r12, r2)
            p298qj.C5662b.m11952e(r2, r14)
            int[] r2 = r4.f21979Y
            p298qj.C5662b.m11956i(r2, r6, r2)
            qj.c r5 = new qj.c
            r5.<init>(r6)
            int[] r2 = r4.f21979Y
            p298qj.C5662b.m11956i(r13, r2, r6)
            int[] r2 = r5.f21979Y
            r6 = 0
            r11 = r12[r6]
            long r13 = (long) r11
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r17
            r6 = 1
            r11 = r12[r6]
            r19 = r7
            long r6 = (long) r11
            long r6 = r6 & r17
            r11 = 2
            r11 = r12[r11]
            r20 = r3
            r21 = r4
            long r3 = (long) r11
            long r3 = r3 & r17
            r11 = 3
            r11 = r12[r11]
            long r11 = (long) r11
            long r11 = r11 & r17
            r22 = 0
            r25 = r1
            r16 = r8
            r24 = r9
            r8 = r22
            r0 = 0
        L11c:
            r1 = 4
            if (r0 >= r1) goto L18f
            r1 = r2[r0]
            r26 = r2
            long r1 = (long) r1
            long r1 = r1 & r17
            long r27 = r1 * r13
            int r29 = r0 + 0
            r30 = r13
            r13 = r10[r29]
            long r13 = (long) r13
            long r13 = r13 & r17
            long r27 = r27 + r13
            long r13 = r27 + r22
            r27 = r15
            int r15 = (int) r13
            r10[r29] = r15
            r15 = 32
            long r13 = r13 >>> r15
            long r28 = r1 * r6
            int r32 = r0 + 1
            r15 = r10[r32]
            r33 = r6
            long r6 = (long) r15
            long r6 = r6 & r17
            long r28 = r28 + r6
            long r6 = r28 + r13
            int r13 = (int) r6
            r10[r32] = r13
            r13 = 32
            long r6 = r6 >>> r13
            long r14 = r1 * r3
            int r28 = r0 + 2
            r13 = r10[r28]
            r35 = r3
            long r3 = (long) r13
            long r3 = r3 & r17
            long r14 = r14 + r3
            long r14 = r14 + r6
            int r3 = (int) r14
            r10[r28] = r3
            r3 = 32
            long r6 = r14 >>> r3
            long r1 = r1 * r11
            int r4 = r0 + 3
            r13 = r10[r4]
            long r13 = (long) r13
            long r13 = r13 & r17
            long r1 = r1 + r13
            long r1 = r1 + r6
            int r6 = (int) r1
            r10[r4] = r6
            long r1 = r1 >>> r3
            int r0 = r0 + 4
            r4 = r10[r0]
            long r6 = (long) r4
            long r6 = r6 & r17
            long r8 = r8 + r6
            long r8 = r8 + r1
            int r1 = (int) r8
            r10[r0] = r1
            long r8 = r8 >>> r3
            r2 = r26
            r15 = r27
            r13 = r30
            r0 = r32
            r6 = r33
            r3 = r35
            goto L11c
        L18f:
            r27 = r15
            int r0 = (int) r8
            if (r0 != 0) goto L1a6
            r0 = 7
            r0 = r10[r0]
            r1 = 1
            int r0 = r0 >>> r1
            r1 = 2147483646(0x7ffffffe, float:NaN)
            if (r0 < r1) goto L1ac
            int[] r0 = p298qj.C5662b.f21968b
            boolean r0 = tj.AbstractC6255a.m12861r(r10, r0)
            if (r0 == 0) goto L1ac
        L1a6:
            int[] r0 = p298qj.C5662b.f21969c
            int r1 = r0.length
            p085f1.AbstractC1972m.m5002g(r1, r0, r10)
        L1ac:
            int[] r0 = r5.f21979Y
            p298qj.C5662b.m11952e(r10, r0)
            qj.c r0 = new qj.c
            r1 = r24
            r0.<init>(r1)
            if (r27 != 0) goto L1c1
            r7 = r19
            int[] r2 = r7.f21979Y
            p298qj.C5662b.m11950c(r1, r2, r1)
        L1c1:
            if (r16 != 0) goto L1cc
            int[] r1 = r0.f21979Y
            r2 = r25
            int[] r2 = r2.f21979Y
            p298qj.C5662b.m11950c(r1, r2, r1)
        L1cc:
            r1 = 1
            nj.d[] r6 = new p240nj.AbstractC4846d[r1]
            r1 = 0
            r6[r1] = r0
            qj.d r0 = new qj.d
            r1 = r37
            boolean r7 = r1.f19290e
            r2 = r0
            r3 = r20
            r4 = r21
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10933n() {
            r7 = this;
            boolean r0 = r7.m10930k()
            if (r0 == 0) goto L7
            return r7
        L7:
            qj.d r0 = new qj.d
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
            if (r0 != 0) goto L18
            nj.d r0 = r1.f19288c
            boolean r0 = r0.mo10901i()
            if (r0 == 0) goto Lf
            goto L18
        Lf:
            nj.f r0 = r1.mo10943x()
            nj.f r0 = r0.mo10920a(r1)
            return r0
        L18:
            return r1
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: x */
    public p240nj.AbstractC4848f mo10943x() {
            r14 = this;
            boolean r0 = r14.m10930k()
            if (r0 == 0) goto L7
            return r14
        L7:
            nj.c r2 = r14.f19286a
            nj.d r0 = r14.f19288c
            qj.c r0 = (p298qj.C5666c) r0
            boolean r1 = r0.mo10901i()
            if (r1 == 0) goto L18
            nj.f r0 = r2.mo10881n()
            return r0
        L18:
            nj.d r1 = r14.f19287b
            qj.c r1 = (p298qj.C5666c) r1
            nj.d[] r3 = r14.f19289d
            r4 = 0
            r3 = r3[r4]
            qj.c r3 = (p298qj.C5666c) r3
            r5 = 4
            int[] r6 = new int[r5]
            int[] r7 = new int[r5]
            int[] r8 = new int[r5]
            int[] r9 = r0.f21979Y
            p298qj.C5662b.m11954g(r9, r8)
            int[] r9 = new int[r5]
            r10 = 8
            int[] r11 = new int[r10]
            tj.AbstractC6255a.m12835C(r8, r11)
            p298qj.C5662b.m11952e(r11, r9)
            boolean r11 = r3.mo10900h()
            int[] r12 = r3.f21979Y
            if (r11 != 0) goto L47
            p298qj.C5662b.m11954g(r12, r7)
            r12 = r7
        L47:
            int[] r13 = r1.f21979Y
            p298qj.C5662b.m11956i(r13, r12, r6)
            int[] r13 = r1.f21979Y
            p298qj.C5662b.m11948a(r13, r12, r7)
            int[] r12 = new int[r10]
            tj.AbstractC6255a.m12869z(r7, r6, r12)
            p298qj.C5662b.m11952e(r12, r7)
            int r12 = tj.AbstractC6255a.m12845b(r7, r7, r7)
            p298qj.C5662b.m11953f(r12, r7)
            int[] r1 = r1.f21979Y
            p298qj.C5662b.m11950c(r8, r1, r8)
            r1 = 2
            int r1 = p085f1.AbstractC1972m.m4979N(r5, r8, r1, r4)
            p298qj.C5662b.m11953f(r1, r8)
            r1 = 3
            int r12 = p085f1.AbstractC1972m.m4980O(r5, r9, r1, r4, r6)
            p298qj.C5662b.m11953f(r12, r6)
            qj.c r12 = new qj.c
            r12.<init>(r9)
            int[] r13 = new int[r10]
            tj.AbstractC6255a.m12835C(r7, r13)
            p298qj.C5662b.m11952e(r13, r9)
            int[] r9 = r12.f21979Y
            p298qj.C5662b.m11956i(r9, r8, r9)
            int[] r9 = r12.f21979Y
            p298qj.C5662b.m11956i(r9, r8, r9)
            qj.c r9 = new qj.c
            r9.<init>(r8)
            int[] r13 = r12.f21979Y
            p298qj.C5662b.m11956i(r8, r13, r8)
            int[] r8 = r9.f21979Y
            int[] r10 = new int[r10]
            tj.AbstractC6255a.m12869z(r8, r7, r10)
            p298qj.C5662b.m11952e(r10, r8)
            int[] r8 = r9.f21979Y
            p298qj.C5662b.m11956i(r8, r6, r8)
            qj.c r6 = new qj.c
            r6.<init>(r7)
            int[] r0 = r0.f21979Y
            int r0 = p085f1.AbstractC1972m.m4978M(r5, r0, r4, r7)
            r5 = 1
            if (r0 != 0) goto Lc3
            r0 = r7[r1]
            int r0 = r0 >>> r5
            r1 = 2147483646(0x7ffffffe, float:NaN)
            if (r0 < r1) goto Lc6
            int[] r0 = p298qj.C5662b.f21967a
            boolean r0 = tj.AbstractC6255a.m12860q(r7, r0)
            if (r0 == 0) goto Lc6
        Lc3:
            p298qj.C5662b.m11949b(r7)
        Lc6:
            if (r11 != 0) goto Lcf
            int[] r0 = r6.f21979Y
            int[] r1 = r3.f21979Y
            p298qj.C5662b.m11950c(r0, r1, r0)
        Lcf:
            qj.d r0 = new qj.d
            nj.d[] r5 = new p240nj.AbstractC4846d[r5]
            r5[r4] = r6
            boolean r6 = r14.f19290e
            r1 = r0
            r3 = r12
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
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
            nj.f r0 = r1.mo10943x()
            nj.f r2 = r0.mo10920a(r2)
            return r2
    }
}

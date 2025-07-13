package p298qj;

/* renamed from: qj.l0 */
/* loaded from: classes.dex */
public class C5703l0 extends p240nj.AbstractC4848f.c {
    public C5703l0(p240nj.AbstractC4845c r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, boolean r5) {
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

    public C5703l0(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.f19290e = r5
            return
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: a */
    public p240nj.AbstractC4848f mo10920a(p240nj.AbstractC4848f r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r16.m10930k()
            if (r2 == 0) goto Lb
            return r1
        Lb:
            boolean r2 = r17.m10930k()
            if (r2 == 0) goto L12
            return r0
        L12:
            if (r0 != r1) goto L19
            nj.f r1 = r16.mo10943x()
            return r1
        L19:
            nj.c r3 = r0.f19286a
            nj.d r2 = r0.f19287b
            qj.k0 r2 = (p298qj.C5699k0) r2
            nj.d r4 = r0.f19288c
            qj.k0 r4 = (p298qj.C5699k0) r4
            nj.d r5 = r1.f19287b
            qj.k0 r5 = (p298qj.C5699k0) r5
            nj.d r6 = r17.mo10927h()
            qj.k0 r6 = (p298qj.C5699k0) r6
            nj.d[] r7 = r0.f19289d
            r8 = 0
            r7 = r7[r8]
            qj.k0 r7 = (p298qj.C5699k0) r7
            nj.d r1 = r1.mo10928i(r8)
            qj.k0 r1 = (p298qj.C5699k0) r1
            r9 = 16
            int[] r10 = new int[r9]
            r11 = 8
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo10900h()
            if (r15 == 0) goto L51
            int[] r5 = r5.f22051Y
            int[] r6 = r6.f22051Y
            goto L67
        L51:
            int[] r8 = r7.f22051Y
            p298qj.C5695j0.m11994f(r8, r13)
            int[] r5 = r5.f22051Y
            p298qj.C5695j0.m11991c(r13, r5, r12)
            int[] r5 = r7.f22051Y
            p298qj.C5695j0.m11991c(r13, r5, r13)
            int[] r5 = r6.f22051Y
            p298qj.C5695j0.m11991c(r13, r5, r13)
            r5 = r12
            r6 = r13
        L67:
            boolean r8 = r1.mo10900h()
            if (r8 == 0) goto L72
            int[] r2 = r2.f22051Y
            int[] r4 = r4.f22051Y
            goto L88
        L72:
            int[] r9 = r1.f22051Y
            p298qj.C5695j0.m11994f(r9, r14)
            int[] r2 = r2.f22051Y
            p298qj.C5695j0.m11991c(r14, r2, r10)
            int[] r2 = r1.f22051Y
            p298qj.C5695j0.m11991c(r14, r2, r14)
            int[] r2 = r4.f22051Y
            p298qj.C5695j0.m11991c(r14, r2, r14)
            r2 = r10
            r4 = r14
        L88:
            int[] r9 = new int[r11]
            p298qj.C5695j0.m11996h(r2, r5, r9)
            p298qj.C5695j0.m11996h(r4, r6, r12)
            boolean r5 = tj.AbstractC6255a.m12866w(r9)
            if (r5 == 0) goto La6
            boolean r1 = tj.AbstractC6255a.m12866w(r12)
            if (r1 == 0) goto La1
            nj.f r1 = r16.mo10943x()
            return r1
        La1:
            nj.f r1 = r3.mo10881n()
            return r1
        La6:
            r5 = 16
            int[] r6 = new int[r5]
            tj.AbstractC6255a.m12836D(r9, r6)
            p298qj.C5695j0.m11992d(r6, r13)
            int[] r6 = new int[r11]
            int[] r11 = new int[r5]
            tj.AbstractC6255a.m12833A(r13, r9, r11)
            p298qj.C5695j0.m11992d(r11, r6)
            int[] r11 = new int[r5]
            tj.AbstractC6255a.m12833A(r13, r2, r11)
            p298qj.C5695j0.m11992d(r11, r13)
            boolean r2 = tj.AbstractC6255a.m12866w(r6)
            if (r2 == 0) goto Lcc
            tj.AbstractC6255a.m12843K(r6)
            goto Ld1
        Lcc:
            int[] r2 = p298qj.C5695j0.f22035a
            tj.AbstractC6255a.m12839G(r2, r6, r6)
        Ld1:
            tj.AbstractC6255a.m12833A(r4, r6, r10)
            int r2 = tj.AbstractC6255a.m12846c(r13, r13, r6)
            p298qj.C5695j0.m11993e(r2, r6)
            qj.k0 r4 = new qj.k0
            r4.<init>(r14)
            r2 = 16
            int[] r5 = new int[r2]
            tj.AbstractC6255a.m12836D(r12, r5)
            p298qj.C5695j0.m11992d(r5, r14)
            int[] r2 = r4.f22051Y
            p298qj.C5695j0.m11996h(r2, r6, r2)
            qj.k0 r5 = new qj.k0
            r5.<init>(r6)
            int[] r2 = r4.f22051Y
            p298qj.C5695j0.m11996h(r13, r2, r6)
            int[] r2 = r5.f22051Y
            int r2 = tj.AbstractC6255a.m12834B(r2, r12, r10)
            r6 = 1
            if (r2 != 0) goto L117
            r2 = 15
            r2 = r10[r2]
            int r2 = r2 >>> r6
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r2 < r11) goto L11e
            int[] r2 = p298qj.C5695j0.f22036b
            r11 = 16
            boolean r2 = p085f1.AbstractC1972m.m5019x(r11, r10, r2)
            if (r2 == 0) goto L11e
            goto L119
        L117:
            r11 = 16
        L119:
            int[] r2 = p298qj.C5695j0.f22036b
            p085f1.AbstractC1972m.m4989X(r11, r2, r10)
        L11e:
            int[] r2 = r5.f22051Y
            p298qj.C5695j0.m11992d(r10, r2)
            qj.k0 r2 = new qj.k0
            r2.<init>(r9)
            if (r15 != 0) goto L12f
            int[] r7 = r7.f22051Y
            p298qj.C5695j0.m11991c(r9, r7, r9)
        L12f:
            if (r8 != 0) goto L138
            int[] r7 = r2.f22051Y
            int[] r1 = r1.f22051Y
            p298qj.C5695j0.m11991c(r7, r1, r7)
        L138:
            nj.d[] r6 = new p240nj.AbstractC4846d[r6]
            r1 = 0
            r6[r1] = r2
            qj.l0 r1 = new qj.l0
            boolean r7 = r0.f19290e
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10933n() {
            r7 = this;
            boolean r0 = r7.m10930k()
            if (r0 == 0) goto L7
            return r7
        L7:
            qj.l0 r0 = new qj.l0
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
            qj.k0 r0 = (p298qj.C5699k0) r0
            boolean r1 = r0.mo10901i()
            if (r1 == 0) goto L18
            nj.f r0 = r2.mo10881n()
            return r0
        L18:
            nj.d r1 = r14.f19287b
            qj.k0 r1 = (p298qj.C5699k0) r1
            nj.d[] r3 = r14.f19289d
            r4 = 0
            r3 = r3[r4]
            qj.k0 r3 = (p298qj.C5699k0) r3
            r5 = 8
            int[] r6 = new int[r5]
            int[] r7 = new int[r5]
            int[] r8 = new int[r5]
            int[] r9 = r0.f22051Y
            p298qj.C5695j0.m11994f(r9, r8)
            int[] r9 = new int[r5]
            r10 = 16
            int[] r11 = new int[r10]
            tj.AbstractC6255a.m12836D(r8, r11)
            p298qj.C5695j0.m11992d(r11, r9)
            boolean r11 = r3.mo10900h()
            int[] r12 = r3.f22051Y
            if (r11 != 0) goto L48
            p298qj.C5695j0.m11994f(r12, r7)
            r12 = r7
        L48:
            int[] r13 = r1.f22051Y
            p298qj.C5695j0.m11996h(r13, r12, r6)
            int[] r13 = r1.f22051Y
            p298qj.C5695j0.m11989a(r13, r12, r7)
            int[] r12 = new int[r10]
            tj.AbstractC6255a.m12833A(r7, r6, r12)
            p298qj.C5695j0.m11992d(r12, r7)
            int r12 = tj.AbstractC6255a.m12846c(r7, r7, r7)
            p298qj.C5695j0.m11993e(r12, r7)
            int[] r1 = r1.f22051Y
            p298qj.C5695j0.m11991c(r8, r1, r8)
            r1 = 2
            int r1 = p085f1.AbstractC1972m.m4979N(r5, r8, r1, r4)
            p298qj.C5695j0.m11993e(r1, r8)
            r1 = 3
            int r1 = p085f1.AbstractC1972m.m4980O(r5, r9, r1, r4, r6)
            p298qj.C5695j0.m11993e(r1, r6)
            qj.k0 r12 = new qj.k0
            r12.<init>(r9)
            int[] r1 = new int[r10]
            tj.AbstractC6255a.m12836D(r7, r1)
            p298qj.C5695j0.m11992d(r1, r9)
            int[] r1 = r12.f22051Y
            p298qj.C5695j0.m11996h(r1, r8, r1)
            int[] r1 = r12.f22051Y
            p298qj.C5695j0.m11996h(r1, r8, r1)
            qj.k0 r9 = new qj.k0
            r9.<init>(r8)
            int[] r1 = r12.f22051Y
            p298qj.C5695j0.m11996h(r8, r1, r8)
            int[] r1 = r9.f22051Y
            int[] r8 = new int[r10]
            tj.AbstractC6255a.m12833A(r1, r7, r8)
            p298qj.C5695j0.m11992d(r8, r1)
            int[] r1 = r9.f22051Y
            p298qj.C5695j0.m11996h(r1, r6, r1)
            qj.k0 r1 = new qj.k0
            r1.<init>(r7)
            int[] r0 = r0.f22051Y
            int r0 = p085f1.AbstractC1972m.m4978M(r5, r0, r4, r7)
            if (r0 != 0) goto Lc1
            r0 = 7
            r0 = r7[r0]
            r5 = -1
            if (r0 != r5) goto Lc4
            int[] r0 = p298qj.C5695j0.f22035a
            boolean r0 = tj.AbstractC6255a.m12861r(r7, r0)
            if (r0 == 0) goto Lc4
        Lc1:
            p298qj.C5695j0.m11990b(r7)
        Lc4:
            if (r11 != 0) goto Lcd
            int[] r0 = r1.f22051Y
            int[] r3 = r3.f22051Y
            p298qj.C5695j0.m11991c(r0, r3, r0)
        Lcd:
            qj.l0 r0 = new qj.l0
            r3 = 1
            nj.d[] r5 = new p240nj.AbstractC4846d[r3]
            r5[r4] = r1
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

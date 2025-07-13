package p298qj;

/* renamed from: qj.p0 */
/* loaded from: classes.dex */
public class C5719p0 extends p240nj.AbstractC4848f.c {
    public C5719p0(p240nj.AbstractC4845c r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, boolean r5) {
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

    public C5719p0(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.f19290e = r5
            return
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: a */
    public p240nj.AbstractC4848f mo10920a(p240nj.AbstractC4848f r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r17.m10930k()
            if (r2 == 0) goto Lb
            return r1
        Lb:
            boolean r2 = r18.m10930k()
            if (r2 == 0) goto L12
            return r0
        L12:
            if (r0 != r1) goto L19
            nj.f r1 = r17.mo10943x()
            return r1
        L19:
            nj.c r3 = r0.f19286a
            nj.d r2 = r0.f19287b
            qj.o0 r2 = (p298qj.C5715o0) r2
            nj.d r4 = r0.f19288c
            qj.o0 r4 = (p298qj.C5715o0) r4
            nj.d r5 = r1.f19287b
            qj.o0 r5 = (p298qj.C5715o0) r5
            nj.d r6 = r18.mo10927h()
            qj.o0 r6 = (p298qj.C5715o0) r6
            nj.d[] r7 = r0.f19289d
            r8 = 0
            r7 = r7[r8]
            qj.o0 r7 = (p298qj.C5715o0) r7
            nj.d r1 = r1.mo10928i(r8)
            qj.o0 r1 = (p298qj.C5715o0) r1
            r9 = 24
            int[] r10 = new int[r9]
            int[] r11 = new int[r9]
            r12 = 12
            int[] r13 = new int[r12]
            int[] r14 = new int[r12]
            boolean r15 = r7.mo10900h()
            if (r15 == 0) goto L51
            int[] r5 = r5.f22082Y
            int[] r6 = r6.f22082Y
            goto L67
        L51:
            int[] r8 = r7.f22082Y
            p298qj.C5711n0.m12028f(r8, r13)
            int[] r5 = r5.f22082Y
            p298qj.C5711n0.m12025c(r13, r5, r11)
            int[] r5 = r7.f22082Y
            p298qj.C5711n0.m12025c(r13, r5, r13)
            int[] r5 = r6.f22082Y
            p298qj.C5711n0.m12025c(r13, r5, r13)
            r5 = r11
            r6 = r13
        L67:
            boolean r8 = r1.mo10900h()
            if (r8 == 0) goto L72
            int[] r2 = r2.f22082Y
            int[] r4 = r4.f22082Y
            goto L88
        L72:
            int[] r9 = r1.f22082Y
            p298qj.C5711n0.m12028f(r9, r14)
            int[] r2 = r2.f22082Y
            p298qj.C5711n0.m12025c(r14, r2, r10)
            int[] r2 = r1.f22082Y
            p298qj.C5711n0.m12025c(r14, r2, r14)
            int[] r2 = r4.f22082Y
            p298qj.C5711n0.m12025c(r14, r2, r14)
            r2 = r10
            r4 = r14
        L88:
            int[] r9 = new int[r12]
            p298qj.C5711n0.m12030h(r2, r5, r9)
            int[] r5 = new int[r12]
            p298qj.C5711n0.m12030h(r4, r6, r5)
            boolean r6 = p085f1.AbstractC1972m.m4972G(r12, r9)
            if (r6 == 0) goto La8
            boolean r1 = p085f1.AbstractC1972m.m4972G(r12, r5)
            if (r1 == 0) goto La3
            nj.f r1 = r17.mo10943x()
            return r1
        La3:
            nj.f r1 = r3.mo10881n()
            return r1
        La8:
            r6 = 24
            int[] r12 = new int[r6]
            p085f1.AbstractC1972m.m4983R(r9, r12)
            p298qj.C5711n0.m12026d(r12, r13)
            r16 = r3
            r12 = 12
            int[] r3 = new int[r12]
            int[] r12 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r13, r9, r12)
            p298qj.C5711n0.m12026d(r12, r3)
            p298qj.C5711n0.m12025c(r13, r2, r13)
            r2 = 12
            boolean r6 = p085f1.AbstractC1972m.m4972G(r2, r3)
            if (r6 == 0) goto Lcf
            p085f1.AbstractC1972m.m4997c0(r2, r3)
            goto Ld4
        Lcf:
            int[] r6 = p298qj.C5711n0.f22068a
            p085f1.AbstractC1972m.m4984S(r2, r6, r3, r3)
        Ld4:
            p085f1.AbstractC1972m.m4976K(r4, r3, r10)
            int r2 = p085f1.AbstractC1972m.m4998d(r2, r13, r13, r3)
            p298qj.C5711n0.m12027e(r2, r3)
            qj.o0 r4 = new qj.o0
            r4.<init>(r14)
            r2 = 24
            int[] r6 = new int[r2]
            p085f1.AbstractC1972m.m4983R(r5, r6)
            p298qj.C5711n0.m12026d(r6, r14)
            int[] r6 = r4.f22082Y
            p298qj.C5711n0.m12030h(r6, r3, r6)
            qj.o0 r6 = new qj.o0
            r6.<init>(r3)
            int[] r12 = r4.f22082Y
            p298qj.C5711n0.m12030h(r13, r12, r3)
            int[] r3 = r6.f22082Y
            p085f1.AbstractC1972m.m4976K(r3, r5, r11)
            int r3 = p085f1.AbstractC1972m.m4992a(r2, r10, r11, r10)
            if (r3 != 0) goto L116
            r3 = 23
            r3 = r10[r3]
            r5 = -1
            if (r3 != r5) goto L123
            int[] r3 = p298qj.C5711n0.f22069b
            boolean r3 = p085f1.AbstractC1972m.m5019x(r2, r10, r3)
            if (r3 == 0) goto L123
        L116:
            int[] r3 = p298qj.C5711n0.f22070c
            int r5 = r3.length
            int r5 = p085f1.AbstractC1972m.m5002g(r5, r3, r10)
            if (r5 == 0) goto L123
            int r3 = r3.length
            p085f1.AbstractC1972m.m4967B(r2, r10, r3)
        L123:
            int[] r2 = r6.f22082Y
            p298qj.C5711n0.m12026d(r10, r2)
            qj.o0 r2 = new qj.o0
            r2.<init>(r9)
            if (r15 != 0) goto L134
            int[] r3 = r7.f22082Y
            p298qj.C5711n0.m12025c(r9, r3, r9)
        L134:
            if (r8 != 0) goto L13d
            int[] r3 = r2.f22082Y
            int[] r1 = r1.f22082Y
            p298qj.C5711n0.m12025c(r3, r1, r3)
        L13d:
            r1 = 1
            nj.d[] r1 = new p240nj.AbstractC4846d[r1]
            r3 = 0
            r1[r3] = r2
            qj.p0 r8 = new qj.p0
            boolean r7 = r0.f19290e
            r2 = r8
            r3 = r16
            r5 = r6
            r6 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10933n() {
            r7 = this;
            boolean r0 = r7.m10930k()
            if (r0 == 0) goto L7
            return r7
        L7:
            qj.p0 r0 = new qj.p0
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
            qj.o0 r0 = (p298qj.C5715o0) r0
            boolean r1 = r0.mo10901i()
            if (r1 == 0) goto L18
            nj.f r0 = r2.mo10881n()
            return r0
        L18:
            nj.d r1 = r14.f19287b
            qj.o0 r1 = (p298qj.C5715o0) r1
            nj.d[] r3 = r14.f19289d
            r4 = 0
            r3 = r3[r4]
            qj.o0 r3 = (p298qj.C5715o0) r3
            r5 = 12
            int[] r6 = new int[r5]
            int[] r7 = new int[r5]
            int[] r8 = new int[r5]
            int[] r9 = r0.f22082Y
            p298qj.C5711n0.m12028f(r9, r8)
            int[] r9 = new int[r5]
            r10 = 24
            int[] r11 = new int[r10]
            p085f1.AbstractC1972m.m4983R(r8, r11)
            p298qj.C5711n0.m12026d(r11, r9)
            boolean r11 = r3.mo10900h()
            int[] r12 = r3.f22082Y
            if (r11 != 0) goto L48
            p298qj.C5711n0.m12028f(r12, r7)
            r12 = r7
        L48:
            int[] r13 = r1.f22082Y
            p298qj.C5711n0.m12030h(r13, r12, r6)
            int[] r13 = r1.f22082Y
            p298qj.C5711n0.m12023a(r13, r12, r7)
            int[] r12 = new int[r10]
            p085f1.AbstractC1972m.m4976K(r7, r6, r12)
            p298qj.C5711n0.m12026d(r12, r7)
            int r12 = p085f1.AbstractC1972m.m4998d(r5, r7, r7, r7)
            p298qj.C5711n0.m12027e(r12, r7)
            int[] r1 = r1.f22082Y
            p298qj.C5711n0.m12025c(r8, r1, r8)
            r1 = 2
            int r1 = p085f1.AbstractC1972m.m4979N(r5, r8, r1, r4)
            p298qj.C5711n0.m12027e(r1, r8)
            r1 = 3
            int r1 = p085f1.AbstractC1972m.m4980O(r5, r9, r1, r4, r6)
            p298qj.C5711n0.m12027e(r1, r6)
            qj.o0 r12 = new qj.o0
            r12.<init>(r9)
            int[] r1 = new int[r10]
            p085f1.AbstractC1972m.m4983R(r7, r1)
            p298qj.C5711n0.m12026d(r1, r9)
            int[] r1 = r12.f22082Y
            p298qj.C5711n0.m12030h(r1, r8, r1)
            int[] r1 = r12.f22082Y
            p298qj.C5711n0.m12030h(r1, r8, r1)
            qj.o0 r9 = new qj.o0
            r9.<init>(r8)
            int[] r1 = r12.f22082Y
            p298qj.C5711n0.m12030h(r8, r1, r8)
            int[] r1 = r9.f22082Y
            int[] r8 = new int[r10]
            p085f1.AbstractC1972m.m4976K(r1, r7, r8)
            p298qj.C5711n0.m12026d(r8, r1)
            int[] r1 = r9.f22082Y
            p298qj.C5711n0.m12030h(r1, r6, r1)
            qj.o0 r1 = new qj.o0
            r1.<init>(r7)
            int[] r0 = r0.f22082Y
            int r0 = p085f1.AbstractC1972m.m4978M(r5, r0, r4, r7)
            if (r0 != 0) goto Lc2
            r0 = 11
            r0 = r7[r0]
            r6 = -1
            if (r0 != r6) goto Lc5
            int[] r0 = p298qj.C5711n0.f22068a
            boolean r0 = p085f1.AbstractC1972m.m5019x(r5, r7, r0)
            if (r0 == 0) goto Lc5
        Lc2:
            p298qj.C5711n0.m12024b(r7)
        Lc5:
            if (r11 != 0) goto Lce
            int[] r0 = r1.f22082Y
            int[] r3 = r3.f22082Y
            p298qj.C5711n0.m12025c(r0, r3, r0)
        Lce:
            qj.p0 r0 = new qj.p0
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

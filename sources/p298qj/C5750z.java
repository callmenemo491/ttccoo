package p298qj;

/* renamed from: qj.z */
/* loaded from: classes.dex */
public class C5750z extends p240nj.AbstractC4848f.c {
    public C5750z(p240nj.AbstractC4845c r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, boolean r5) {
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

    public C5750z(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4, boolean r5) {
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
            qj.y r2 = (p298qj.C5747y) r2
            nj.d r4 = r0.f19288c
            qj.y r4 = (p298qj.C5747y) r4
            nj.d r5 = r1.f19287b
            qj.y r5 = (p298qj.C5747y) r5
            nj.d r6 = r17.mo10927h()
            qj.y r6 = (p298qj.C5747y) r6
            nj.d[] r7 = r0.f19289d
            r8 = 0
            r7 = r7[r8]
            qj.y r7 = (p298qj.C5747y) r7
            nj.d r1 = r1.mo10928i(r8)
            qj.y r1 = (p298qj.C5747y) r1
            r9 = 14
            int[] r10 = new int[r9]
            r11 = 7
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo10900h()
            if (r15 == 0) goto L50
            int[] r5 = r5.f22149Y
            int[] r6 = r6.f22149Y
            goto L66
        L50:
            int[] r8 = r7.f22149Y
            p298qj.C5744x.m12055d(r8, r13)
            int[] r5 = r5.f22149Y
            p298qj.C5744x.m12052a(r13, r5, r12)
            int[] r5 = r7.f22149Y
            p298qj.C5744x.m12052a(r13, r5, r13)
            int[] r5 = r6.f22149Y
            p298qj.C5744x.m12052a(r13, r5, r13)
            r5 = r12
            r6 = r13
        L66:
            boolean r8 = r1.mo10900h()
            if (r8 == 0) goto L71
            int[] r2 = r2.f22149Y
            int[] r4 = r4.f22149Y
            goto L87
        L71:
            int[] r9 = r1.f22149Y
            p298qj.C5744x.m12055d(r9, r14)
            int[] r2 = r2.f22149Y
            p298qj.C5744x.m12052a(r14, r2, r10)
            int[] r2 = r1.f22149Y
            p298qj.C5744x.m12052a(r14, r2, r14)
            int[] r2 = r4.f22149Y
            p298qj.C5744x.m12052a(r14, r2, r14)
            r2 = r10
            r4 = r14
        L87:
            int[] r9 = new int[r11]
            p298qj.C5744x.m12057f(r2, r5, r9)
            p298qj.C5744x.m12057f(r4, r6, r12)
            boolean r5 = p446z3.AbstractC7246d.m14329o(r9)
            if (r5 == 0) goto La5
            boolean r1 = p446z3.AbstractC7246d.m14329o(r12)
            if (r1 == 0) goto La0
            nj.f r1 = r16.mo10943x()
            return r1
        La0:
            nj.f r1 = r3.mo10881n()
            return r1
        La5:
            r5 = 14
            int[] r6 = new int[r5]
            p446z3.AbstractC7246d.m14334t(r9, r6)
            p298qj.C5744x.m12053b(r6, r13)
            int[] r6 = new int[r11]
            int[] r11 = new int[r5]
            p446z3.AbstractC7246d.m14332r(r13, r9, r11)
            p298qj.C5744x.m12053b(r11, r6)
            int[] r11 = new int[r5]
            p446z3.AbstractC7246d.m14332r(r13, r2, r11)
            p298qj.C5744x.m12053b(r11, r13)
            boolean r2 = p446z3.AbstractC7246d.m14329o(r6)
            if (r2 == 0) goto Lcb
            p446z3.AbstractC7246d.m14337w(r6)
            goto Ld0
        Lcb:
            int[] r2 = p298qj.C5744x.f22139a
            p446z3.AbstractC7246d.m14335u(r2, r6, r6)
        Ld0:
            p446z3.AbstractC7246d.m14332r(r4, r6, r10)
            int r2 = p446z3.AbstractC7246d.m14316b(r13, r13, r6)
            p298qj.C5744x.m12054c(r2, r6)
            qj.y r4 = new qj.y
            r4.<init>(r14)
            r2 = 14
            int[] r5 = new int[r2]
            p446z3.AbstractC7246d.m14334t(r12, r5)
            p298qj.C5744x.m12053b(r5, r14)
            int[] r2 = r4.f22149Y
            p298qj.C5744x.m12057f(r2, r6, r2)
            qj.y r5 = new qj.y
            r5.<init>(r6)
            int[] r2 = r4.f22149Y
            int r2 = p446z3.AbstractC7246d.m14335u(r13, r2, r6)
            if (r2 == 0) goto L101
            r2 = 6803(0x1a93, float:9.533E-42)
            r11 = 7
            p085f1.AbstractC1972m.m4987V(r11, r2, r6)
        L101:
            int[] r2 = r5.f22149Y
            int r2 = p446z3.AbstractC7246d.m14333s(r2, r12, r10)
            if (r2 != 0) goto L11b
            r2 = 13
            r2 = r10[r2]
            r6 = -1
            if (r2 != r6) goto L12a
            int[] r2 = p298qj.C5744x.f22140b
            r6 = 14
            boolean r2 = p085f1.AbstractC1972m.m5019x(r6, r10, r2)
            if (r2 == 0) goto L12a
            goto L11d
        L11b:
            r6 = 14
        L11d:
            int[] r2 = p298qj.C5744x.f22141c
            int r11 = r2.length
            int r11 = p085f1.AbstractC1972m.m5002g(r11, r2, r10)
            if (r11 == 0) goto L12a
            int r2 = r2.length
            p085f1.AbstractC1972m.m4967B(r6, r10, r2)
        L12a:
            int[] r2 = r5.f22149Y
            p298qj.C5744x.m12053b(r10, r2)
            qj.y r2 = new qj.y
            r2.<init>(r9)
            if (r15 != 0) goto L13b
            int[] r6 = r7.f22149Y
            p298qj.C5744x.m12052a(r9, r6, r9)
        L13b:
            if (r8 != 0) goto L144
            int[] r6 = r2.f22149Y
            int[] r1 = r1.f22149Y
            p298qj.C5744x.m12052a(r6, r1, r6)
        L144:
            r1 = 1
            nj.d[] r6 = new p240nj.AbstractC4846d[r1]
            r1 = 0
            r6[r1] = r2
            qj.z r1 = new qj.z
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
            qj.z r0 = new qj.z
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
            r13 = this;
            boolean r0 = r13.m10930k()
            if (r0 == 0) goto L7
            return r13
        L7:
            nj.c r2 = r13.f19286a
            nj.d r0 = r13.f19288c
            qj.y r0 = (p298qj.C5747y) r0
            boolean r1 = r0.mo10901i()
            if (r1 == 0) goto L18
            nj.f r0 = r2.mo10881n()
            return r0
        L18:
            nj.d r1 = r13.f19287b
            qj.y r1 = (p298qj.C5747y) r1
            nj.d[] r3 = r13.f19289d
            r4 = 0
            r3 = r3[r4]
            qj.y r3 = (p298qj.C5747y) r3
            r5 = 7
            int[] r6 = new int[r5]
            int[] r7 = r0.f22149Y
            p298qj.C5744x.m12055d(r7, r6)
            int[] r7 = new int[r5]
            r8 = 14
            int[] r9 = new int[r8]
            p446z3.AbstractC7246d.m14334t(r6, r9)
            p298qj.C5744x.m12053b(r9, r7)
            int[] r9 = new int[r5]
            int[] r10 = r1.f22149Y
            p298qj.C5744x.m12055d(r10, r9)
            int r10 = p446z3.AbstractC7246d.m14316b(r9, r9, r9)
            p298qj.C5744x.m12054c(r10, r9)
            int[] r1 = r1.f22149Y
            p298qj.C5744x.m12052a(r6, r1, r6)
            r1 = 2
            int r1 = p085f1.AbstractC1972m.m4979N(r5, r6, r1, r4)
            p298qj.C5744x.m12054c(r1, r6)
            int[] r1 = new int[r5]
            r10 = 3
            int r10 = p085f1.AbstractC1972m.m4980O(r5, r7, r10, r4, r1)
            p298qj.C5744x.m12054c(r10, r1)
            qj.y r10 = new qj.y
            r10.<init>(r7)
            int[] r11 = new int[r8]
            p446z3.AbstractC7246d.m14334t(r9, r11)
            p298qj.C5744x.m12053b(r11, r7)
            int[] r7 = r10.f22149Y
            p298qj.C5744x.m12057f(r7, r6, r7)
            int[] r7 = r10.f22149Y
            p298qj.C5744x.m12057f(r7, r6, r7)
            qj.y r7 = new qj.y
            r7.<init>(r6)
            int[] r11 = r10.f22149Y
            int r11 = p446z3.AbstractC7246d.m14335u(r6, r11, r6)
            r12 = 6803(0x1a93, float:9.533E-42)
            if (r11 == 0) goto L85
            p085f1.AbstractC1972m.m4987V(r5, r12, r6)
        L85:
            int[] r6 = r7.f22149Y
            int[] r8 = new int[r8]
            p446z3.AbstractC7246d.m14332r(r6, r9, r8)
            p298qj.C5744x.m12053b(r8, r6)
            int[] r6 = r7.f22149Y
            p298qj.C5744x.m12057f(r6, r1, r6)
            qj.y r1 = new qj.y
            r1.<init>(r9)
            int[] r0 = r0.f22149Y
            int r0 = p085f1.AbstractC1972m.m4978M(r5, r0, r4, r9)
            if (r0 != 0) goto Laf
            r0 = 6
            r0 = r9[r0]
            r6 = -1
            if (r0 != r6) goto Lb2
            int[] r0 = p298qj.C5744x.f22139a
            boolean r0 = p446z3.AbstractC7246d.m14323i(r9, r0)
            if (r0 == 0) goto Lb2
        Laf:
            p085f1.AbstractC1972m.m4996c(r5, r12, r9)
        Lb2:
            boolean r0 = r3.mo10900h()
            if (r0 != 0) goto Lbf
            int[] r0 = r1.f22149Y
            int[] r3 = r3.f22149Y
            p298qj.C5744x.m12052a(r0, r3, r0)
        Lbf:
            qj.z r0 = new qj.z
            r3 = 1
            nj.d[] r5 = new p240nj.AbstractC4846d[r3]
            r5[r4] = r1
            boolean r6 = r13.f19290e
            r1 = r0
            r3 = r10
            r4 = r7
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

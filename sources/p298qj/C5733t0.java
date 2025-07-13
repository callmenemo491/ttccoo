package p298qj;

/* renamed from: qj.t0 */
/* loaded from: classes.dex */
public class C5733t0 extends p240nj.AbstractC4848f.c {
    public C5733t0(p240nj.AbstractC4845c r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, boolean r5) {
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

    public C5733t0(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4, boolean r5) {
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
            qj.s0 r2 = (p298qj.C5730s0) r2
            nj.d r4 = r0.f19288c
            qj.s0 r4 = (p298qj.C5730s0) r4
            nj.d r5 = r1.f19287b
            qj.s0 r5 = (p298qj.C5730s0) r5
            nj.d r6 = r17.mo10927h()
            qj.s0 r6 = (p298qj.C5730s0) r6
            nj.d[] r7 = r0.f19289d
            r8 = 0
            r7 = r7[r8]
            qj.s0 r7 = (p298qj.C5730s0) r7
            nj.d r1 = r1.mo10928i(r8)
            qj.s0 r1 = (p298qj.C5730s0) r1
            r9 = 17
            int[] r10 = new int[r9]
            int[] r11 = new int[r9]
            int[] r12 = new int[r9]
            int[] r13 = new int[r9]
            boolean r14 = r7.mo10900h()
            if (r14 == 0) goto L4f
            int[] r5 = r5.f22114Y
            int[] r6 = r6.f22114Y
            goto L65
        L4f:
            int[] r15 = r7.f22114Y
            p298qj.C5727r0.m12042f(r15, r12)
            int[] r5 = r5.f22114Y
            p298qj.C5727r0.m12039c(r12, r5, r11)
            int[] r5 = r7.f22114Y
            p298qj.C5727r0.m12039c(r12, r5, r12)
            int[] r5 = r6.f22114Y
            p298qj.C5727r0.m12039c(r12, r5, r12)
            r5 = r11
            r6 = r12
        L65:
            boolean r15 = r1.mo10900h()
            if (r15 == 0) goto L70
            int[] r2 = r2.f22114Y
            int[] r4 = r4.f22114Y
            goto L86
        L70:
            int[] r8 = r1.f22114Y
            p298qj.C5727r0.m12042f(r8, r13)
            int[] r2 = r2.f22114Y
            p298qj.C5727r0.m12039c(r13, r2, r10)
            int[] r2 = r1.f22114Y
            p298qj.C5727r0.m12039c(r13, r2, r13)
            int[] r2 = r4.f22114Y
            p298qj.C5727r0.m12039c(r13, r2, r13)
            r2 = r10
            r4 = r13
        L86:
            int[] r8 = new int[r9]
            p298qj.C5727r0.m12043g(r2, r5, r8)
            p298qj.C5727r0.m12043g(r4, r6, r11)
            boolean r5 = p085f1.AbstractC1972m.m4972G(r9, r8)
            if (r5 == 0) goto La4
            boolean r1 = p085f1.AbstractC1972m.m4972G(r9, r11)
            if (r1 == 0) goto L9f
            nj.f r1 = r16.mo10943x()
            return r1
        L9f:
            nj.f r1 = r3.mo10881n()
            return r1
        La4:
            r5 = 33
            int[] r6 = new int[r5]
            p298qj.C5727r0.m12038b(r8, r6)
            p298qj.C5727r0.m12040d(r6, r12)
            int[] r6 = new int[r9]
            p298qj.C5727r0.m12039c(r12, r8, r6)
            p298qj.C5727r0.m12039c(r12, r2, r12)
            p298qj.C5727r0.m12039c(r4, r6, r10)
            qj.s0 r4 = new qj.s0
            r4.<init>(r13)
            int[] r2 = new int[r5]
            p298qj.C5727r0.m12038b(r11, r2)
            p298qj.C5727r0.m12040d(r2, r13)
            int[] r2 = r4.f22114Y
            p298qj.C5727r0.m12037a(r2, r6, r2)
            int[] r2 = r4.f22114Y
            p298qj.C5727r0.m12043g(r2, r12, r2)
            int[] r2 = r4.f22114Y
            p298qj.C5727r0.m12043g(r2, r12, r2)
            qj.s0 r5 = new qj.s0
            r5.<init>(r6)
            int[] r2 = r4.f22114Y
            p298qj.C5727r0.m12043g(r12, r2, r6)
            int[] r2 = r5.f22114Y
            p298qj.C5727r0.m12039c(r2, r11, r11)
            int[] r2 = r5.f22114Y
            p298qj.C5727r0.m12043g(r11, r10, r2)
            qj.s0 r2 = new qj.s0
            r2.<init>(r8)
            if (r14 != 0) goto Lf5
            int[] r6 = r7.f22114Y
            p298qj.C5727r0.m12039c(r8, r6, r8)
        Lf5:
            if (r15 != 0) goto Lfe
            int[] r6 = r2.f22114Y
            int[] r1 = r1.f22114Y
            p298qj.C5727r0.m12039c(r6, r1, r6)
        Lfe:
            r1 = 1
            nj.d[] r6 = new p240nj.AbstractC4846d[r1]
            r1 = 0
            r6[r1] = r2
            qj.t0 r1 = new qj.t0
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
            qj.t0 r0 = new qj.t0
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
            qj.s0 r0 = (p298qj.C5730s0) r0
            boolean r1 = r0.mo10901i()
            if (r1 == 0) goto L18
            nj.f r0 = r2.mo10881n()
            return r0
        L18:
            nj.d r1 = r14.f19287b
            qj.s0 r1 = (p298qj.C5730s0) r1
            nj.d[] r3 = r14.f19289d
            r4 = 0
            r3 = r3[r4]
            qj.s0 r3 = (p298qj.C5730s0) r3
            r5 = 17
            int[] r6 = new int[r5]
            int[] r7 = new int[r5]
            int[] r8 = new int[r5]
            int[] r9 = r0.f22114Y
            p298qj.C5727r0.m12042f(r9, r8)
            int[] r9 = new int[r5]
            r10 = 33
            int[] r11 = new int[r10]
            p298qj.C5727r0.m12038b(r8, r11)
            p298qj.C5727r0.m12040d(r11, r9)
            boolean r11 = r3.mo10900h()
            int[] r12 = r3.f22114Y
            if (r11 != 0) goto L48
            p298qj.C5727r0.m12042f(r12, r7)
            r12 = r7
        L48:
            int[] r13 = r1.f22114Y
            p298qj.C5727r0.m12043g(r13, r12, r6)
            int[] r13 = r1.f22114Y
            p298qj.C5727r0.m12037a(r13, r12, r7)
            p298qj.C5727r0.m12039c(r7, r6, r7)
            p085f1.AbstractC1972m.m4998d(r5, r7, r7, r7)
            p298qj.C5727r0.m12041e(r7)
            int[] r1 = r1.f22114Y
            p298qj.C5727r0.m12039c(r8, r1, r8)
            r1 = 2
            p085f1.AbstractC1972m.m4979N(r5, r8, r1, r4)
            p298qj.C5727r0.m12041e(r8)
            r1 = 3
            p085f1.AbstractC1972m.m4980O(r5, r9, r1, r4, r6)
            p298qj.C5727r0.m12041e(r6)
            qj.s0 r5 = new qj.s0
            r5.<init>(r9)
            int[] r1 = new int[r10]
            p298qj.C5727r0.m12038b(r7, r1)
            p298qj.C5727r0.m12040d(r1, r9)
            int[] r1 = r5.f22114Y
            p298qj.C5727r0.m12043g(r1, r8, r1)
            int[] r1 = r5.f22114Y
            p298qj.C5727r0.m12043g(r1, r8, r1)
            qj.s0 r9 = new qj.s0
            r9.<init>(r8)
            int[] r1 = r5.f22114Y
            p298qj.C5727r0.m12043g(r8, r1, r8)
            int[] r1 = r9.f22114Y
            p298qj.C5727r0.m12039c(r1, r7, r1)
            int[] r1 = r9.f22114Y
            p298qj.C5727r0.m12043g(r1, r6, r1)
            qj.s0 r1 = new qj.s0
            r1.<init>(r7)
            int[] r0 = r0.f22114Y
            r6 = 16
            r8 = r0[r6]
            int r10 = r8 << 23
            int r0 = p085f1.AbstractC1972m.m4978M(r6, r0, r10, r7)
            r10 = 1
            int r8 = r8 << r10
            r0 = r0 | r8
            r0 = r0 & 511(0x1ff, float:7.16E-43)
            r7[r6] = r0
            if (r11 != 0) goto Lba
            int[] r0 = r1.f22114Y
            int[] r3 = r3.f22114Y
            p298qj.C5727r0.m12039c(r0, r3, r0)
        Lba:
            qj.t0 r0 = new qj.t0
            nj.d[] r6 = new p240nj.AbstractC4846d[r10]
            r6[r4] = r1
            boolean r7 = r14.f19290e
            r1 = r0
            r3 = r5
            r4 = r9
            r5 = r6
            r6 = r7
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

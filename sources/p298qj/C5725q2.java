package p298qj;

/* renamed from: qj.q2 */
/* loaded from: classes.dex */
public class C5725q2 extends p240nj.AbstractC4848f.b {
    public C5725q2(p240nj.AbstractC4845c r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, boolean r5) {
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

    public C5725q2(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4, boolean r5) {
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
            nj.c r4 = r0.f19286a
            nj.d r2 = r0.f19287b
            qj.m2 r2 = (p298qj.C5709m2) r2
            nj.d r3 = r1.f19287b
            qj.m2 r3 = (p298qj.C5709m2) r3
            boolean r5 = r2.mo10901i()
            if (r5 == 0) goto L32
            boolean r2 = r3.mo10901i()
            if (r2 == 0) goto L2d
            nj.f r1 = r4.mo10881n()
            return r1
        L2d:
            nj.f r1 = r1.mo10920a(r0)
            return r1
        L32:
            nj.d r5 = r0.f19288c
            qj.m2 r5 = (p298qj.C5709m2) r5
            nj.d[] r6 = r0.f19289d
            r7 = 0
            r6 = r6[r7]
            qj.m2 r6 = (p298qj.C5709m2) r6
            nj.d r8 = r1.f19288c
            qj.m2 r8 = (p298qj.C5709m2) r8
            nj.d r1 = r1.mo10928i(r7)
            qj.m2 r1 = (p298qj.C5709m2) r1
            r9 = 9
            long[] r10 = new long[r9]
            long[] r11 = new long[r9]
            long[] r12 = new long[r9]
            long[] r9 = new long[r9]
            boolean r13 = r6.mo10900h()
            if (r13 == 0) goto L59
            r13 = 0
            goto L5f
        L59:
            long[] r13 = r6.f22067Y
            long[] r13 = p298qj.C5705l2.m12017k(r13)
        L5f:
            if (r13 != 0) goto L66
            long[] r15 = r3.f22067Y
            long[] r14 = r8.f22067Y
            goto L72
        L66:
            long[] r14 = r3.f22067Y
            p298qj.C5705l2.m12016j(r14, r13, r11)
            long[] r14 = r8.f22067Y
            p298qj.C5705l2.m12016j(r14, r13, r9)
            r14 = r9
            r15 = r11
        L72:
            boolean r16 = r1.mo10900h()
            if (r16 == 0) goto L7a
            r1 = 0
            goto L80
        L7a:
            long[] r1 = r1.f22067Y
            long[] r1 = p298qj.C5705l2.m12017k(r1)
        L80:
            long[] r2 = r2.f22067Y
            if (r1 != 0) goto L87
            long[] r7 = r5.f22067Y
            goto L91
        L87:
            p298qj.C5705l2.m12016j(r2, r1, r10)
            long[] r2 = r5.f22067Y
            p298qj.C5705l2.m12016j(r2, r1, r12)
            r2 = r10
            r7 = r12
        L91:
            p298qj.C5705l2.m12007a(r7, r14, r12)
            p298qj.C5705l2.m12007a(r2, r15, r9)
            boolean r7 = p139i1.AbstractC3061d.m7483m(r9)
            if (r7 == 0) goto Lad
            boolean r1 = p139i1.AbstractC3061d.m7483m(r12)
            if (r1 == 0) goto La8
            nj.f r1 = r17.mo10943x()
            return r1
        La8:
            nj.f r1 = r4.mo10881n()
            return r1
        Lad:
            boolean r3 = r3.mo10901i()
            if (r3 == 0) goto L10d
            nj.f r1 = r17.m10934o()
            nj.d r2 = r1.f19287b
            qj.m2 r2 = (p298qj.C5709m2) r2
            nj.d r1 = r1.mo10927h()
            nj.d r3 = r1.mo10893a(r8)
            nj.d r3 = r3.mo10896d(r2)
            nj.d r5 = r3.mo10907o()
            nj.d r5 = r5.mo10893a(r3)
            nj.d r5 = r5.mo10893a(r2)
            nj.d r5 = r5.mo10894b()
            qj.m2 r5 = (p298qj.C5709m2) r5
            boolean r6 = r5.mo10901i()
            if (r6 == 0) goto Le9
            qj.q2 r1 = new qj.q2
            qj.m2 r2 = p298qj.C5721p2.f22091l
            boolean r3 = r0.f19290e
            r1.<init>(r4, r5, r2, r3)
            return r1
        Le9:
            nj.d r2 = r2.mo10893a(r5)
            nj.d r2 = r3.mo10902j(r2)
            nj.d r2 = r2.mo10893a(r5)
            nj.d r1 = r2.mo10893a(r1)
            nj.d r1 = r1.mo10896d(r5)
            nj.d r1 = r1.mo10893a(r5)
            qj.m2 r1 = (p298qj.C5709m2) r1
            java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19244S
            nj.d r2 = r4.mo10879l(r2)
            qj.m2 r2 = (p298qj.C5709m2) r2
            r6 = r1
            goto L169
        L10d:
            p298qj.C5705l2.m12020n(r9, r9)
            long[] r3 = p298qj.C5705l2.m12017k(r12)
            p298qj.C5705l2.m12016j(r2, r3, r10)
            p298qj.C5705l2.m12016j(r15, r3, r11)
            qj.m2 r2 = new qj.m2
            r2.<init>(r10)
            p298qj.C5705l2.m12014h(r10, r11, r10)
            boolean r7 = r2.mo10901i()
            if (r7 == 0) goto L132
            qj.q2 r1 = new qj.q2
            qj.m2 r3 = p298qj.C5721p2.f22091l
            boolean r5 = r0.f19290e
            r1.<init>(r4, r2, r3, r5)
            return r1
        L132:
            qj.m2 r7 = new qj.m2
            r7.<init>(r12)
            p298qj.C5705l2.m12016j(r9, r3, r12)
            if (r1 == 0) goto L141
            long[] r3 = r7.f22067Y
            p298qj.C5705l2.m12016j(r3, r1, r3)
        L141:
            r1 = 18
            long[] r1 = new long[r1]
            p298qj.C5705l2.m12007a(r11, r9, r9)
            p298qj.C5705l2.m12021o(r9, r1)
            long[] r3 = r5.f22067Y
            long[] r5 = r6.f22067Y
            p298qj.C5705l2.m12007a(r3, r5, r9)
            long[] r3 = r7.f22067Y
            p298qj.C5705l2.m12015i(r9, r3, r1)
            qj.m2 r3 = new qj.m2
            r3.<init>(r9)
            p298qj.C5705l2.m12018l(r1, r9)
            if (r13 == 0) goto L166
            long[] r1 = r7.f22067Y
            p298qj.C5705l2.m12016j(r1, r13, r1)
        L166:
            r5 = r2
            r6 = r3
            r2 = r7
        L169:
            qj.q2 r1 = new qj.q2
            r3 = 1
            nj.d[] r7 = new p240nj.AbstractC4846d[r3]
            r3 = 0
            r7[r3] = r2
            boolean r8 = r0.f19290e
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: e */
    public boolean mo10924e() {
            r3 = this;
            nj.d r0 = r3.f19287b
            boolean r1 = r0.mo10901i()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            nj.d r1 = r3.f19288c
            boolean r1 = r1.mo10911s()
            boolean r0 = r0.mo10911s()
            if (r1 == r0) goto L17
            r2 = 1
        L17:
            return r2
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: h */
    public p240nj.AbstractC4846d mo10927h() {
            r3 = this;
            nj.d r0 = r3.f19287b
            nj.d r1 = r3.f19288c
            boolean r2 = r3.m10930k()
            if (r2 != 0) goto L29
            boolean r2 = r0.mo10901i()
            if (r2 == 0) goto L11
            goto L29
        L11:
            nj.d r1 = r1.mo10893a(r0)
            nj.d r0 = r1.mo10902j(r0)
            nj.d[] r1 = r3.f19289d
            r2 = 0
            r1 = r1[r2]
            boolean r2 = r1.mo10900h()
            if (r2 != 0) goto L28
            nj.d r0 = r0.mo10896d(r1)
        L28:
            return r0
        L29:
            return r1
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10933n() {
            r8 = this;
            boolean r0 = r8.m10930k()
            if (r0 == 0) goto L7
            return r8
        L7:
            nj.d r3 = r8.f19287b
            boolean r0 = r3.mo10901i()
            if (r0 == 0) goto L10
            return r8
        L10:
            nj.d r0 = r8.f19288c
            nj.d[] r1 = r8.f19289d
            r2 = 0
            r1 = r1[r2]
            qj.q2 r7 = new qj.q2
            nj.c r4 = r8.f19286a
            nj.d r0 = r0.mo10893a(r1)
            r5 = 1
            nj.d[] r5 = new p240nj.AbstractC4846d[r5]
            r5[r2] = r1
            boolean r6 = r8.f19290e
            r1 = r7
            r2 = r4
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: x */
    public p240nj.AbstractC4848f mo10943x() {
            r10 = this;
            boolean r0 = r10.m10930k()
            if (r0 == 0) goto L7
            return r10
        L7:
            nj.c r2 = r10.f19286a
            nj.d r0 = r10.f19287b
            qj.m2 r0 = (p298qj.C5709m2) r0
            boolean r1 = r0.mo10901i()
            if (r1 == 0) goto L18
            nj.f r0 = r2.mo10881n()
            return r0
        L18:
            nj.d r1 = r10.f19288c
            qj.m2 r1 = (p298qj.C5709m2) r1
            nj.d[] r3 = r10.f19289d
            r4 = 0
            r3 = r3[r4]
            qj.m2 r3 = (p298qj.C5709m2) r3
            r5 = 9
            long[] r6 = new long[r5]
            long[] r7 = new long[r5]
            boolean r8 = r3.mo10900h()
            if (r8 == 0) goto L31
            r8 = 0
            goto L37
        L31:
            long[] r8 = r3.f22067Y
            long[] r8 = p298qj.C5705l2.m12017k(r8)
        L37:
            long[] r9 = r1.f22067Y
            if (r8 != 0) goto L3e
            long[] r3 = r3.f22067Y
            goto L48
        L3e:
            p298qj.C5705l2.m12016j(r9, r8, r6)
            long[] r3 = r3.f22067Y
            p298qj.C5705l2.m12020n(r3, r7)
            r9 = r6
            r3 = r7
        L48:
            long[] r5 = new long[r5]
            long[] r1 = r1.f22067Y
            p298qj.C5705l2.m12020n(r1, r5)
            p298qj.C5705l2.m12009c(r9, r3, r5)
            boolean r1 = p139i1.AbstractC3061d.m7483m(r5)
            if (r1 == 0) goto L67
            qj.q2 r0 = new qj.q2
            qj.m2 r1 = new qj.m2
            r1.<init>(r5)
            qj.m2 r3 = p298qj.C5721p2.f22091l
            boolean r4 = r10.f19290e
            r0.<init>(r2, r1, r3, r4)
            return r0
        L67:
            r1 = 18
            long[] r1 = new long[r1]
            p298qj.C5705l2.m12015i(r5, r9, r1)
            qj.m2 r9 = new qj.m2
            r9.<init>(r6)
            p298qj.C5705l2.m12020n(r5, r6)
            qj.m2 r6 = new qj.m2
            r6.<init>(r5)
            if (r8 == 0) goto L80
            p298qj.C5705l2.m12014h(r5, r3, r5)
        L80:
            long[] r0 = r0.f22067Y
            if (r8 != 0) goto L85
            goto L89
        L85:
            p298qj.C5705l2.m12016j(r0, r8, r7)
            r0 = r7
        L89:
            p298qj.C5705l2.m12021o(r0, r1)
            p298qj.C5705l2.m12018l(r1, r7)
            long[] r0 = r9.f22067Y
            long[] r1 = r6.f22067Y
            p298qj.C5705l2.m12009c(r0, r1, r7)
            qj.m2 r0 = new qj.m2
            r0.<init>(r7)
            qj.q2 r7 = new qj.q2
            r1 = 1
            nj.d[] r5 = new p240nj.AbstractC4846d[r1]
            r5[r4] = r6
            boolean r6 = r10.f19290e
            r1 = r7
            r3 = r9
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: y */
    public p240nj.AbstractC4848f mo10944y(p240nj.AbstractC4848f r13) {
            r12 = this;
            boolean r0 = r12.m10930k()
            if (r0 == 0) goto L7
            return r13
        L7:
            boolean r0 = r13.m10930k()
            if (r0 == 0) goto L12
            nj.f r13 = r12.mo10943x()
            return r13
        L12:
            nj.c r1 = r12.f19286a
            nj.d r0 = r12.f19287b
            qj.m2 r0 = (p298qj.C5709m2) r0
            boolean r2 = r0.mo10901i()
            if (r2 == 0) goto L1f
            return r13
        L1f:
            nj.d r2 = r13.f19287b
            qj.m2 r2 = (p298qj.C5709m2) r2
            r3 = 0
            nj.d r4 = r13.mo10928i(r3)
            qj.m2 r4 = (p298qj.C5709m2) r4
            boolean r5 = r2.mo10901i()
            if (r5 != 0) goto L113
            boolean r4 = r4.mo10900h()
            if (r4 != 0) goto L38
            goto L113
        L38:
            nj.d r4 = r12.f19288c
            qj.m2 r4 = (p298qj.C5709m2) r4
            nj.d[] r5 = r12.f19289d
            r5 = r5[r3]
            qj.m2 r5 = (p298qj.C5709m2) r5
            nj.d r6 = r13.f19288c
            qj.m2 r6 = (p298qj.C5709m2) r6
            r7 = 9
            long[] r8 = new long[r7]
            long[] r9 = new long[r7]
            long[] r10 = new long[r7]
            long[] r7 = new long[r7]
            long[] r0 = r0.f22067Y
            p298qj.C5705l2.m12020n(r0, r8)
            long[] r0 = r4.f22067Y
            p298qj.C5705l2.m12020n(r0, r9)
            long[] r0 = r5.f22067Y
            p298qj.C5705l2.m12020n(r0, r10)
            long[] r0 = r4.f22067Y
            long[] r4 = r5.f22067Y
            p298qj.C5705l2.m12014h(r0, r4, r7)
            p298qj.C5705l2.m12009c(r10, r9, r7)
            long[] r0 = p298qj.C5705l2.m12017k(r10)
            long[] r4 = r6.f22067Y
            p298qj.C5705l2.m12016j(r4, r0, r10)
            p298qj.C5705l2.m12007a(r10, r9, r10)
            r4 = 18
            long[] r5 = new long[r4]
            p298qj.C5705l2.m12015i(r10, r7, r5)
            long[] r11 = new long[r4]
            p298qj.C5705l2.m12012f(r8, r0, r11)
            p298qj.C5705l2.m12010d(r5, r11, r5)
            p298qj.C5705l2.m12018l(r5, r10)
            long[] r2 = r2.f22067Y
            p298qj.C5705l2.m12016j(r2, r0, r8)
            p298qj.C5705l2.m12007a(r8, r7, r9)
            p298qj.C5705l2.m12020n(r9, r9)
            boolean r2 = p139i1.AbstractC3061d.m7483m(r9)
            if (r2 == 0) goto La8
            boolean r0 = p139i1.AbstractC3061d.m7483m(r10)
            if (r0 == 0) goto La3
            nj.f r13 = r13.mo10943x()
            return r13
        La3:
            nj.f r13 = r1.mo10881n()
            return r13
        La8:
            boolean r13 = p139i1.AbstractC3061d.m7483m(r10)
            if (r13 == 0) goto Lbd
            qj.q2 r13 = new qj.q2
            qj.m2 r0 = new qj.m2
            r0.<init>(r10)
            qj.m2 r2 = p298qj.C5721p2.f22091l
            boolean r3 = r12.f19290e
            r13.<init>(r1, r0, r2, r3)
            return r13
        Lbd:
            qj.m2 r2 = new qj.m2
            r2.<init>()
            long[] r13 = r2.f22067Y
            p298qj.C5705l2.m12020n(r10, r13)
            long[] r13 = r2.f22067Y
            p298qj.C5705l2.m12014h(r13, r8, r13)
            qj.m2 r13 = new qj.m2
            r13.<init>(r8)
            p298qj.C5705l2.m12014h(r10, r9, r8)
            long[] r8 = r13.f22067Y
            p298qj.C5705l2.m12016j(r8, r0, r8)
            qj.m2 r8 = new qj.m2
            r8.<init>(r9)
            p298qj.C5705l2.m12007a(r10, r9, r9)
            long[] r0 = r8.f22067Y
            p298qj.C5705l2.m12020n(r0, r0)
            r0 = 0
        Le7:
            if (r0 >= r4) goto Lf0
            r9 = 0
            r5[r0] = r9
            int r0 = r0 + 1
            goto Le7
        Lf0:
            long[] r0 = r8.f22067Y
            p298qj.C5705l2.m12015i(r0, r7, r5)
            long[] r0 = r6.f22067Y
            p298qj.C5705l2.m12011e(r0, r7)
            long[] r0 = r13.f22067Y
            p298qj.C5705l2.m12015i(r7, r0, r5)
            long[] r0 = r8.f22067Y
            p298qj.C5705l2.m12018l(r5, r0)
            qj.q2 r6 = new qj.q2
            r0 = 1
            nj.d[] r4 = new p240nj.AbstractC4846d[r0]
            r4[r3] = r13
            boolean r5 = r12.f19290e
            r0 = r6
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L113:
            nj.f r0 = r12.mo10943x()
            nj.f r13 = r0.mo10920a(r13)
            return r13
    }
}

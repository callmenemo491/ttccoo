package p298qj;

/* renamed from: qj.o2 */
/* loaded from: classes.dex */
public class C5717o2 extends p240nj.AbstractC4848f.b {
    public C5717o2(p240nj.AbstractC4845c r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, boolean r5) {
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

    public C5717o2(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4, boolean r5) {
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
            if (r3 == 0) goto L109
            nj.f r1 = r17.m10934o()
            nj.d r2 = r1.f19287b
            qj.m2 r2 = (p298qj.C5709m2) r2
            nj.d r1 = r1.mo10927h()
            nj.d r3 = r1.mo10893a(r8)
            nj.d r3 = r3.mo10896d(r2)
            nj.d r5 = r3.mo10907o()
            nj.d r5 = r5.mo10893a(r3)
            nj.d r5 = r5.mo10893a(r2)
            qj.m2 r5 = (p298qj.C5709m2) r5
            boolean r6 = r5.mo10901i()
            if (r6 == 0) goto Le5
            qj.o2 r1 = new qj.o2
            nj.d r2 = r4.f19250c
            boolean r3 = r0.f19290e
            r1.<init>(r4, r5, r2, r3)
            return r1
        Le5:
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
            goto L165
        L109:
            p298qj.C5705l2.m12020n(r9, r9)
            long[] r3 = p298qj.C5705l2.m12017k(r12)
            p298qj.C5705l2.m12016j(r2, r3, r10)
            p298qj.C5705l2.m12016j(r15, r3, r11)
            qj.m2 r2 = new qj.m2
            r2.<init>(r10)
            p298qj.C5705l2.m12014h(r10, r11, r10)
            boolean r7 = r2.mo10901i()
            if (r7 == 0) goto L12e
            qj.o2 r1 = new qj.o2
            nj.d r3 = r4.f19250c
            boolean r5 = r0.f19290e
            r1.<init>(r4, r2, r3, r5)
            return r1
        L12e:
            qj.m2 r7 = new qj.m2
            r7.<init>(r12)
            p298qj.C5705l2.m12016j(r9, r3, r12)
            if (r1 == 0) goto L13d
            long[] r3 = r7.f22067Y
            p298qj.C5705l2.m12016j(r3, r1, r3)
        L13d:
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
            if (r13 == 0) goto L162
            long[] r1 = r7.f22067Y
            p298qj.C5705l2.m12016j(r1, r13, r1)
        L162:
            r5 = r2
            r6 = r3
            r2 = r7
        L165:
            qj.o2 r1 = new qj.o2
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
            qj.o2 r7 = new qj.o2
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
            boolean r1 = r0.mo10901i()
            if (r1 == 0) goto L16
            nj.f r0 = r2.mo10881n()
            return r0
        L16:
            nj.d r1 = r10.f19288c
            nj.d[] r3 = r10.f19289d
            r4 = 0
            r3 = r3[r4]
            boolean r5 = r3.mo10900h()
            if (r5 == 0) goto L25
            r6 = r3
            goto L29
        L25:
            nj.d r6 = r3.mo10907o()
        L29:
            if (r5 == 0) goto L34
            nj.d r7 = r1.mo10907o()
            nj.d r7 = r7.mo10893a(r1)
            goto L3c
        L34:
            nj.d r7 = r1.mo10893a(r3)
            nj.d r7 = r7.mo10902j(r1)
        L3c:
            boolean r8 = r7.mo10901i()
            if (r8 == 0) goto L4c
            qj.o2 r0 = new qj.o2
            nj.d r1 = r2.f19250c
            boolean r3 = r10.f19290e
            r0.<init>(r2, r7, r1, r3)
            return r0
        L4c:
            nj.d r8 = r7.mo10907o()
            if (r5 == 0) goto L54
            r9 = r7
            goto L58
        L54:
            nj.d r9 = r7.mo10902j(r6)
        L58:
            nj.d r0 = r1.mo10893a(r0)
            nj.d r0 = r0.mo10907o()
            if (r5 == 0) goto L63
            goto L67
        L63:
            nj.d r3 = r6.mo10907o()
        L67:
            nj.d r1 = r0.mo10893a(r7)
            nj.d r1 = r1.mo10893a(r6)
            nj.d r0 = r1.mo10902j(r0)
            nj.d r0 = r0.mo10893a(r3)
            nj.d r0 = r0.mo10893a(r8)
            nj.d r0 = r0.mo10893a(r9)
            qj.o2 r7 = new qj.o2
            r1 = 1
            nj.d[] r5 = new p240nj.AbstractC4846d[r1]
            r5[r4] = r9
            boolean r6 = r10.f19290e
            r1 = r7
            r3 = r8
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
    }

    @Override // p240nj.AbstractC4848f
    /* renamed from: y */
    public p240nj.AbstractC4848f mo10944y(p240nj.AbstractC4848f r10) {
            r9 = this;
            boolean r0 = r9.m10930k()
            if (r0 == 0) goto L7
            return r10
        L7:
            boolean r0 = r10.m10930k()
            if (r0 == 0) goto L12
            nj.f r10 = r9.mo10943x()
            return r10
        L12:
            nj.c r1 = r9.f19286a
            nj.d r0 = r9.f19287b
            boolean r2 = r0.mo10901i()
            if (r2 == 0) goto L1d
            return r10
        L1d:
            nj.d r2 = r10.f19287b
            r3 = 0
            nj.d r4 = r10.mo10928i(r3)
            boolean r5 = r2.mo10901i()
            if (r5 != 0) goto Lbd
            boolean r4 = r4.mo10900h()
            if (r4 != 0) goto L32
            goto Lbd
        L32:
            nj.d r4 = r9.f19288c
            nj.d[] r5 = r9.f19289d
            r5 = r5[r3]
            nj.d r6 = r10.f19288c
            nj.d r0 = r0.mo10907o()
            nj.d r7 = r4.mo10907o()
            nj.d r8 = r5.mo10907o()
            nj.d r4 = r4.mo10902j(r5)
            nj.d r4 = r7.mo10893a(r4)
            nj.d r5 = r6.mo10894b()
            nj.d r6 = r5.mo10902j(r8)
            nj.d r6 = r6.mo10893a(r7)
            nj.d r0 = r6.mo10904l(r4, r0, r8)
            nj.d r2 = r2.mo10902j(r8)
            nj.d r6 = r2.mo10893a(r4)
            nj.d r6 = r6.mo10907o()
            boolean r7 = r6.mo10901i()
            if (r7 == 0) goto L80
            boolean r0 = r0.mo10901i()
            if (r0 == 0) goto L7b
            nj.f r10 = r10.mo10943x()
            return r10
        L7b:
            nj.f r10 = r1.mo10881n()
            return r10
        L80:
            boolean r10 = r0.mo10901i()
            if (r10 == 0) goto L90
            qj.o2 r10 = new qj.o2
            nj.d r2 = r1.f19250c
            boolean r3 = r9.f19290e
            r10.<init>(r1, r0, r2, r3)
            return r10
        L90:
            nj.d r10 = r0.mo10907o()
            nj.d r2 = r10.mo10902j(r2)
            nj.d r10 = r0.mo10902j(r6)
            nj.d r10 = r10.mo10902j(r8)
            nj.d r0 = r0.mo10893a(r6)
            nj.d r0 = r0.mo10907o()
            nj.d r4 = r0.mo10904l(r4, r5, r10)
            qj.o2 r6 = new qj.o2
            r0 = 1
            nj.d[] r5 = new p240nj.AbstractC4846d[r0]
            r5[r3] = r10
            boolean r10 = r9.f19290e
            r0 = r6
            r3 = r4
            r4 = r5
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        Lbd:
            nj.f r0 = r9.mo10943x()
            nj.f r10 = r0.mo10920a(r10)
            return r10
    }
}

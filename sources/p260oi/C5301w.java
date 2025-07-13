package p260oi;

/* renamed from: oi.w */
/* loaded from: classes.dex */
public final class C5301w extends p260oi.C5287i {

    /* renamed from: d0 */
    public final transient byte[][] f20547d0;

    /* renamed from: e0 */
    public final transient int[] f20548e0;

    public C5301w(byte[][] r2, int[] r3) {
            r1 = this;
            oi.i r0 = p260oi.C5287i.f20504b0
            byte[] r0 = r0.f20508a0
            r1.<init>(r0)
            r1.f20547d0 = r2
            r1.f20548e0 = r3
            return
    }

    @Override // p260oi.C5287i
    /* renamed from: e */
    public java.lang.String mo11583e() {
            r1 = this;
            oi.i r0 = r1.m11612v()
            java.lang.String r0 = r0.mo11583e()
            return r0
    }

    @Override // p260oi.C5287i
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != r4) goto L5
            goto L21
        L5:
            boolean r2 = r5 instanceof p260oi.C5287i
            if (r2 == 0) goto L20
            oi.i r5 = (p260oi.C5287i) r5
            int r2 = r5.mo11585h()
            int r3 = r4.mo11585h()
            if (r2 != r3) goto L20
            int r2 = r4.mo11585h()
            boolean r5 = r4.mo11589p(r1, r5, r1, r2)
            if (r5 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @Override // p260oi.C5287i
    /* renamed from: g */
    public p260oi.C5287i mo11584g(java.lang.String r7) {
            r6 = this;
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)
            byte[][] r0 = r6.f20547d0
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L9:
            if (r1 >= r0) goto L20
            int[] r3 = r6.f20548e0
            int r4 = r0 + r1
            r4 = r3[r4]
            r3 = r3[r1]
            byte[][] r5 = r6.f20547d0
            r5 = r5[r1]
            int r2 = r3 - r2
            r7.update(r5, r4, r2)
            int r1 = r1 + 1
            r2 = r3
            goto L9
        L20:
            oi.i r0 = new oi.i
            byte[] r7 = r7.digest()
            java.lang.String r1 = "digest.digest()"
            p214m2.C4339q.m9705j(r7, r1)
            r0.<init>(r7)
            return r0
    }

    @Override // p260oi.C5287i
    /* renamed from: h */
    public int mo11585h() {
            r2 = this;
            int[] r0 = r2.f20548e0
            byte[][] r1 = r2.f20547d0
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    @Override // p260oi.C5287i
    public int hashCode() {
            r8 = this;
            int r0 = r8.f20506Y
            if (r0 == 0) goto L5
            goto L2d
        L5:
            byte[][] r0 = r8.f20547d0
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r3 = 0
        Lb:
            if (r1 >= r0) goto L2a
            int[] r4 = r8.f20548e0
            int r5 = r0 + r1
            r5 = r4[r5]
            r4 = r4[r1]
            byte[][] r6 = r8.f20547d0
            r6 = r6[r1]
            int r3 = r4 - r3
            int r3 = r3 + r5
        L1c:
            if (r5 >= r3) goto L26
            int r2 = r2 * 31
            r7 = r6[r5]
            int r2 = r2 + r7
            int r5 = r5 + 1
            goto L1c
        L26:
            int r1 = r1 + 1
            r3 = r4
            goto Lb
        L2a:
            r8.f20506Y = r2
            r0 = r2
        L2d:
            return r0
    }

    @Override // p260oi.C5287i
    /* renamed from: k */
    public java.lang.String mo11586k() {
            r1 = this;
            oi.i r0 = r1.m11612v()
            java.lang.String r0 = r0.mo11586k()
            return r0
    }

    @Override // p260oi.C5287i
    /* renamed from: l */
    public byte[] mo11587l() {
            r1 = this;
            byte[] r0 = r1.m11611u()
            return r0
    }

    @Override // p260oi.C5287i
    /* renamed from: o */
    public byte mo11588o(int r8) {
            r7 = this;
            int[] r0 = r7.f20548e0
            byte[][] r1 = r7.f20547d0
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            long r1 = (long) r0
            long r3 = (long) r8
            r5 = 1
            p080ei.C1854b.m4602d(r1, r3, r5)
            int r0 = gh.C2390b.m6132v(r7, r8)
            if (r0 != 0) goto L18
            r1 = 0
            goto L1e
        L18:
            int[] r1 = r7.f20548e0
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L1e:
            int[] r2 = r7.f20548e0
            byte[][] r3 = r7.f20547d0
            int r4 = r3.length
            int r4 = r4 + r0
            r2 = r2[r4]
            r0 = r3[r0]
            int r8 = r8 - r1
            int r8 = r8 + r2
            r8 = r0[r8]
            return r8
    }

    @Override // p260oi.C5287i
    /* renamed from: p */
    public boolean mo11589p(int r7, p260oi.C5287i r8, int r9, int r10) {
            r6 = this;
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r8, r0)
            r0 = 0
            if (r7 < 0) goto L46
            int r1 = r6.mo11585h()
            int r1 = r1 - r10
            if (r7 <= r1) goto L10
            goto L46
        L10:
            int r10 = r10 + r7
            int r1 = gh.C2390b.m6132v(r6, r7)
        L15:
            if (r7 >= r10) goto L45
            if (r1 != 0) goto L1b
            r2 = 0
            goto L21
        L1b:
            int[] r2 = r6.f20548e0
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L21:
            int[] r3 = r6.f20548e0
            r4 = r3[r1]
            int r4 = r4 - r2
            byte[][] r5 = r6.f20547d0
            int r5 = r5.length
            int r5 = r5 + r1
            r3 = r3[r5]
            int r4 = r4 + r2
            int r4 = java.lang.Math.min(r10, r4)
            int r4 = r4 - r7
            int r2 = r7 - r2
            int r2 = r2 + r3
            byte[][] r3 = r6.f20547d0
            r3 = r3[r1]
            boolean r2 = r8.mo11590q(r9, r3, r2, r4)
            if (r2 != 0) goto L40
            goto L46
        L40:
            int r9 = r9 + r4
            int r7 = r7 + r4
            int r1 = r1 + 1
            goto L15
        L45:
            r0 = 1
        L46:
            return r0
    }

    @Override // p260oi.C5287i
    /* renamed from: q */
    public boolean mo11590q(int r7, byte[] r8, int r9, int r10) {
            r6 = this;
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r8, r0)
            r0 = 0
            if (r7 < 0) goto L4c
            int r1 = r6.mo11585h()
            int r1 = r1 - r10
            if (r7 > r1) goto L4c
            if (r9 < 0) goto L4c
            int r1 = r8.length
            int r1 = r1 - r10
            if (r9 <= r1) goto L16
            goto L4c
        L16:
            int r10 = r10 + r7
            int r1 = gh.C2390b.m6132v(r6, r7)
        L1b:
            if (r7 >= r10) goto L4b
            if (r1 != 0) goto L21
            r2 = 0
            goto L27
        L21:
            int[] r2 = r6.f20548e0
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L27:
            int[] r3 = r6.f20548e0
            r4 = r3[r1]
            int r4 = r4 - r2
            byte[][] r5 = r6.f20547d0
            int r5 = r5.length
            int r5 = r5 + r1
            r3 = r3[r5]
            int r4 = r4 + r2
            int r4 = java.lang.Math.min(r10, r4)
            int r4 = r4 - r7
            int r2 = r7 - r2
            int r2 = r2 + r3
            byte[][] r3 = r6.f20547d0
            r3 = r3[r1]
            boolean r2 = p080ei.C1854b.m4601c(r3, r2, r8, r9, r4)
            if (r2 != 0) goto L46
            goto L4c
        L46:
            int r9 = r9 + r4
            int r7 = r7 + r4
            int r1 = r1 + 1
            goto L1b
        L4b:
            r0 = 1
        L4c:
            return r0
    }

    @Override // p260oi.C5287i
    /* renamed from: r */
    public p260oi.C5287i mo11591r() {
            r1 = this;
            oi.i r0 = r1.m11612v()
            oi.i r0 = r0.mo11591r()
            return r0
    }

    @Override // p260oi.C5287i
    /* renamed from: t */
    public void mo11593t(p260oi.C5283e r11, int r12, int r13) {
            r10 = this;
            int r13 = r13 + r12
            int r0 = gh.C2390b.m6132v(r10, r12)
        L5:
            if (r12 >= r13) goto L4b
            if (r0 != 0) goto Lb
            r1 = 0
            goto L11
        Lb:
            int[] r1 = r10.f20548e0
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L11:
            int[] r2 = r10.f20548e0
            r3 = r2[r0]
            int r3 = r3 - r1
            byte[][] r4 = r10.f20547d0
            int r4 = r4.length
            int r4 = r4 + r0
            r2 = r2[r4]
            int r3 = r3 + r1
            int r3 = java.lang.Math.min(r13, r3)
            int r3 = r3 - r12
            int r1 = r12 - r1
            int r6 = r1 + r2
            byte[][] r1 = r10.f20547d0
            r5 = r1[r0]
            oi.u r1 = new oi.u
            int r7 = r6 + r3
            r8 = 1
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            oi.u r2 = r11.f20500Y
            if (r2 != 0) goto L3f
            r1.f20542g = r1
            r1.f20541f = r1
            r11.f20500Y = r1
            goto L47
        L3f:
            oi.u r2 = r2.f20542g
            p214m2.C4339q.m9704i(r2)
            r2.m11605b(r1)
        L47:
            int r12 = r12 + r3
            int r0 = r0 + 1
            goto L5
        L4b:
            long r12 = r11.f20501Z
            int r0 = r10.mo11585h()
            long r0 = (long) r0
            long r12 = r12 + r0
            r11.f20501Z = r12
            return
    }

    @Override // p260oi.C5287i
    public java.lang.String toString() {
            r1 = this;
            oi.i r0 = r1.m11612v()
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    public byte[] m11611u() {
            r9 = this;
            int r0 = r9.mo11585h()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r9.f20547d0
            int r1 = r1.length
            r2 = 0
            r3 = 0
            r4 = 0
        Lc:
            if (r2 >= r1) goto L26
            int[] r5 = r9.f20548e0
            int r6 = r1 + r2
            r6 = r5[r6]
            r5 = r5[r2]
            byte[][] r7 = r9.f20547d0
            r7 = r7[r2]
            int r3 = r5 - r3
            int r8 = r6 + r3
            p062dh.C1468d.m3983E(r7, r0, r4, r6, r8)
            int r4 = r4 + r3
            int r2 = r2 + 1
            r3 = r5
            goto Lc
        L26:
            return r0
    }

    /* renamed from: v */
    public final p260oi.C5287i m11612v() {
            r2 = this;
            oi.i r0 = new oi.i
            byte[] r1 = r2.m11611u()
            r0.<init>(r1)
            return r0
    }
}

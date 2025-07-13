package p240nj;

/* renamed from: nj.r */
/* loaded from: classes.dex */
public class C4860r extends p124h7.AbstractC2947xb {
    public C4860r() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            return
    }

    @Override // p124h7.AbstractC2947xb
    /* renamed from: c */
    public p240nj.AbstractC4848f mo7310c(p240nj.AbstractC4848f r19, java.math.BigInteger r20) {
            r18 = this;
            r0 = r19
            r1 = r20
            int r2 = r20.bitLength()
            int r2 = p240nj.AbstractC4862t.m10985c(r2)
            r3 = 16
            int r2 = java.lang.Math.min(r3, r2)
            r4 = 2
            int r2 = java.lang.Math.max(r4, r2)
            r5 = 1
            nj.s r6 = p240nj.AbstractC4862t.m10987e(r0, r2, r5)
            nj.f[] r7 = r6.f19316a
            nj.f[] r6 = r6.f19317b
            r8 = 0
            java.lang.String r9 = "'k' must have bitlength < 2^16"
            if (r2 != r4) goto L89
            int r4 = r20.bitLength()
            int r4 = r4 >>> r3
            if (r4 != 0) goto L83
            int r4 = r20.signum()
            if (r4 != 0) goto L36
            int[] r1 = p240nj.AbstractC4862t.f19321c
            goto Leb
        L36:
            java.math.BigInteger r4 = r1.shiftLeft(r5)
            java.math.BigInteger r4 = r4.add(r1)
            int r9 = r4.bitLength()
            int r10 = r9 >> 1
            int[] r11 = new int[r10]
            java.math.BigInteger r4 = r4.xor(r1)
            int r9 = r9 - r5
            r12 = 1
            r13 = 0
            r14 = 0
        L4e:
            if (r12 >= r9) goto L6f
            boolean r15 = r4.testBit(r12)
            if (r15 != 0) goto L59
            int r14 = r14 + 1
            goto L6d
        L59:
            boolean r15 = r1.testBit(r12)
            if (r15 == 0) goto L61
            r15 = -1
            goto L62
        L61:
            r15 = 1
        L62:
            int r16 = r13 + 1
            int r15 = r15 << r3
            r14 = r14 | r15
            r11[r13] = r14
            int r12 = r12 + 1
            r13 = r16
            r14 = 1
        L6d:
            int r12 = r12 + r5
            goto L4e
        L6f:
            int r1 = r13 + 1
            r3 = 65536(0x10000, float:9.1835E-41)
            r3 = r3 | r14
            r11[r13] = r3
            if (r10 <= r1) goto L80
            int[] r3 = new int[r1]
            java.lang.System.arraycopy(r11, r8, r3, r8, r1)
            r1 = r3
            goto Leb
        L80:
            r1 = r11
            goto Leb
        L83:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L89:
            if (r2 < r4) goto L159
            if (r2 > r3) goto L159
            int r4 = r20.bitLength()
            int r4 = r4 >>> r3
            if (r4 != 0) goto L153
            int r4 = r20.signum()
            if (r4 != 0) goto L9d
            int[] r1 = p240nj.AbstractC4862t.f19321c
            goto Leb
        L9d:
            int r4 = r20.bitLength()
            int r4 = r4 / r2
            int r4 = r4 + r5
            int[] r9 = new int[r4]
            int r10 = r5 << r2
            int r11 = r10 + (-1)
            int r12 = r10 >>> 1
            r13 = 0
            r14 = 0
            r15 = 0
        Lae:
            int r5 = r1.bitLength()
            if (r13 > r5) goto Le2
            boolean r5 = r1.testBit(r13)
            if (r5 != r15) goto Lbd
            int r13 = r13 + 1
            goto Lae
        Lbd:
            java.math.BigInteger r1 = r1.shiftRight(r13)
            int r5 = r1.intValue()
            r5 = r5 & r11
            if (r15 == 0) goto Lca
            int r5 = r5 + 1
        Lca:
            r15 = r5 & r12
            if (r15 == 0) goto Ld0
            r15 = 1
            goto Ld1
        Ld0:
            r15 = 0
        Ld1:
            if (r15 == 0) goto Ld4
            int r5 = r5 - r10
        Ld4:
            if (r14 <= 0) goto Ld8
            int r13 = r13 + (-1)
        Ld8:
            int r17 = r14 + 1
            int r5 = r5 << r3
            r5 = r5 | r13
            r9[r14] = r5
            r13 = r2
            r14 = r17
            goto Lae
        Le2:
            if (r4 <= r14) goto Lea
            int[] r1 = new int[r14]
            java.lang.System.arraycopy(r9, r8, r1, r8, r14)
            goto Leb
        Lea:
            r1 = r9
        Leb:
            nj.c r0 = r0.f19286a
            nj.f r0 = r0.mo10881n()
            int r3 = r1.length
            r4 = 65535(0xffff, float:9.1834E-41)
            r5 = 1
            if (r3 <= r5) goto L133
            int r3 = r3 + (-1)
            r0 = r1[r3]
            int r5 = r0 >> 16
            r0 = r0 & r4
            int r8 = java.lang.Math.abs(r5)
            if (r5 >= 0) goto L107
            r5 = r6
            goto L108
        L107:
            r5 = r7
        L108:
            int r9 = r8 << 2
            r10 = 1
            int r11 = r10 << r2
            if (r9 >= r11) goto L12b
            byte[] r9 = p240nj.C4854l.f19303a0
            r9 = r9[r8]
            int r11 = r2 - r9
            int r9 = r9 - r10
            int r9 = r10 << r9
            r8 = r8 ^ r9
            int r2 = r2 - r10
            int r2 = r10 << r2
            int r2 = r2 - r10
            int r8 = r8 << r11
            int r8 = r8 + r10
            int r2 = r2 >>> r10
            r2 = r5[r2]
            int r8 = r8 >>> r10
            r5 = r5[r8]
            nj.f r2 = r2.mo10920a(r5)
            int r0 = r0 - r11
            goto L12f
        L12b:
            int r2 = r8 >>> 1
            r2 = r5[r2]
        L12f:
            nj.f r0 = r2.mo10942w(r0)
        L133:
            if (r3 <= 0) goto L152
            int r3 = r3 + (-1)
            r2 = r1[r3]
            int r5 = r2 >> 16
            r2 = r2 & r4
            int r8 = java.lang.Math.abs(r5)
            if (r5 >= 0) goto L144
            r5 = r6
            goto L145
        L144:
            r5 = r7
        L145:
            r9 = 1
            int r8 = r8 >>> r9
            r5 = r5[r8]
            nj.f r0 = r0.mo10944y(r5)
            nj.f r0 = r0.mo10942w(r2)
            goto L133
        L152:
            return r0
        L153:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L159:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "'width' must be in the range [2, 16]"
            r0.<init>(r1)
            throw r0
    }
}

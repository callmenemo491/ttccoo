package p240nj;

/* renamed from: nj.v */
/* loaded from: classes.dex */
public class C4864v extends p124h7.AbstractC2947xb {
    public C4864v() {
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
            boolean r1 = r0 instanceof p240nj.AbstractC4848f.b
            if (r1 == 0) goto L2b5
            nj.f$b r0 = (p240nj.AbstractC4848f.b) r0
            nj.c r1 = r0.f19286a
            nj.c$b r1 = (p240nj.AbstractC4845c.b) r1
            int r8 = r1.mo10880m()
            nj.d r2 = r1.f19249b
            java.math.BigInteger r2 = r2.mo10912t()
            byte r9 = r2.byteValue()
            java.math.BigInteger r2 = p240nj.C4858p.f19307a
            r10 = -1
            r11 = 1
            if (r9 != 0) goto L22
            r2 = -1
            goto L23
        L22:
            r2 = 1
        L23:
            byte r12 = (byte) r2
            monitor-enter(r1)
            java.math.BigInteger[] r2 = r1.f19260i     // Catch: java.lang.Throwable -> L2b2
            if (r2 != 0) goto L2f
            java.math.BigInteger[] r2 = p240nj.C4858p.m10982c(r1)     // Catch: java.lang.Throwable -> L2b2
            r1.f19260i = r2     // Catch: java.lang.Throwable -> L2b2
        L2f:
            java.math.BigInteger[] r13 = r1.f19260i     // Catch: java.lang.Throwable -> L2b2
            monitor-exit(r1)
            r1 = 10
            r14 = 0
            if (r12 != r11) goto L40
            r2 = r13[r14]
            r3 = r13[r11]
            java.math.BigInteger r2 = r2.add(r3)
            goto L48
        L40:
            r2 = r13[r14]
            r3 = r13[r11]
            java.math.BigInteger r2 = r2.subtract(r3)
        L48:
            r15 = r2
            java.math.BigInteger[] r2 = p240nj.C4858p.m10981b(r12, r8, r11)
            r16 = r2[r11]
            r3 = r13[r14]
            r7 = 10
            r2 = r20
            r4 = r16
            r5 = r9
            r6 = r8
            nj.o r7 = p240nj.C4858p.m10980a(r2, r3, r4, r5, r6, r7)
            r3 = r13[r11]
            r8 = r7
            r7 = r1
            nj.o r1 = p240nj.C4858p.m10980a(r2, r3, r4, r5, r6, r7)
            int r2 = r8.f19306b
            int r3 = r1.f19306b
            if (r3 != r2) goto L2aa
            if (r12 == r11) goto L78
            if (r12 != r10) goto L70
            goto L78
        L70:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "mu must be 1 or -1"
            r0.<init>(r1)
            throw r0
        L78:
            java.math.BigInteger r2 = r8.m10978c()
            java.math.BigInteger r3 = r1.m10978c()
            nj.o r4 = new nj.o
            java.math.BigInteger r5 = r8.f19305a
            int r6 = r8.f19306b
            java.math.BigInteger r6 = r2.shiftLeft(r6)
            java.math.BigInteger r5 = r5.subtract(r6)
            int r6 = r8.f19306b
            r4.<init>(r5, r6)
            nj.o r5 = new nj.o
            java.math.BigInteger r6 = r1.f19305a
            int r7 = r1.f19306b
            java.math.BigInteger r7 = r3.shiftLeft(r7)
            java.math.BigInteger r6 = r6.subtract(r7)
            int r1 = r1.f19306b
            r5.<init>(r6, r1)
            nj.o r1 = r4.m10976a(r4)
            if (r12 != r11) goto Lb1
            nj.o r1 = r1.m10976a(r5)
            goto Lb5
        Lb1:
            nj.o r1 = r1.m10979d(r5)
        Lb5:
            nj.o r6 = r5.m10976a(r5)
            nj.o r6 = r6.m10976a(r5)
            nj.o r5 = r6.m10976a(r5)
            if (r12 != r11) goto Lcc
            nj.o r6 = r4.m10979d(r6)
            nj.o r4 = r4.m10976a(r5)
            goto Ld4
        Lcc:
            nj.o r6 = r4.m10976a(r6)
            nj.o r4 = r4.m10979d(r5)
        Ld4:
            java.math.BigInteger r5 = p240nj.InterfaceC4844b.f19244S
            int r7 = r1.m10977b(r5)
            if (r7 < 0) goto Le8
            java.math.BigInteger r7 = p240nj.C4858p.f19307a
            int r7 = r6.m10977b(r7)
            if (r7 >= 0) goto Le5
            goto Lf0
        Le5:
            r7 = 0
            r8 = 1
            goto Lf4
        Le8:
            java.math.BigInteger r7 = p240nj.InterfaceC4844b.f19245T
            int r7 = r4.m10977b(r7)
            if (r7 < 0) goto Lf2
        Lf0:
            r7 = r12
            goto Lf3
        Lf2:
            r7 = 0
        Lf3:
            r8 = 0
        Lf4:
            java.math.BigInteger r10 = p240nj.C4858p.f19307a
            int r1 = r1.m10977b(r10)
            if (r1 >= 0) goto L10d
            java.math.BigInteger r1 = r6.f19305a
            int r4 = r6.f19306b
            java.math.BigInteger r4 = r5.shiftLeft(r4)
            int r1 = r1.compareTo(r4)
            if (r1 < 0) goto L10b
            goto L115
        L10b:
            r8 = -1
            goto L117
        L10d:
            java.math.BigInteger r1 = p240nj.C4858p.f19308b
            int r1 = r4.m10977b(r1)
            if (r1 >= 0) goto L117
        L115:
            int r1 = -r12
            byte r7 = (byte) r1
        L117:
            long r4 = (long) r8
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r1 = r2.add(r1)
            long r4 = (long) r7
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r2 = r3.add(r2)
            java.math.BigInteger r3 = r15.multiply(r1)
            r4 = r20
            java.math.BigInteger r3 = r4.subtract(r3)
            r4 = 2
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            r5 = r13[r11]
            java.math.BigInteger r4 = r4.multiply(r5)
            java.math.BigInteger r4 = r4.multiply(r2)
            java.math.BigInteger r3 = r3.subtract(r4)
            r4 = r13[r11]
            java.math.BigInteger r1 = r4.multiply(r1)
            r4 = r13[r14]
            java.math.BigInteger r2 = r4.multiply(r2)
            java.math.BigInteger r1 = r1.subtract(r2)
            if (r9 != 0) goto L15c
            hb.h[] r2 = p240nj.C4858p.f19309c
            goto L15e
        L15c:
            hb.h[] r2 = p240nj.C4858p.f19311e
        L15e:
            if (r12 != r11) goto L163
            r4 = 6
            goto L165
        L163:
            r4 = 10
        L165:
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            r5 = 16
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r5)
            java.lang.String r6 = "mu must be 1 or -1"
            if (r12 == r11) goto L17d
            r7 = -1
            if (r12 != r7) goto L177
            goto L17d
        L177:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L17d:
            java.math.BigInteger r7 = r3.multiply(r3)
            java.math.BigInteger r8 = r3.multiply(r1)
            java.math.BigInteger r9 = r1.multiply(r1)
            java.math.BigInteger r9 = r9.shiftLeft(r11)
            if (r12 != r11) goto L194
            java.math.BigInteger r6 = r7.add(r8)
            goto L19b
        L194:
            r10 = -1
            if (r12 != r10) goto L2a4
            java.math.BigInteger r6 = r7.subtract(r8)
        L19b:
            java.math.BigInteger r6 = r6.add(r9)
            int r6 = r6.bitLength()
            r7 = 30
            if (r6 <= r7) goto L1ad
            int r6 = r6 + 4
            int r6 = r6 + 4
            r7 = r6
            goto L1b1
        L1ad:
            r6 = 38
            r7 = 38
        L1b1:
            byte[] r8 = new byte[r7]
            java.math.BigInteger r9 = r5.shiftRight(r11)
            r6 = 0
        L1b8:
            java.math.BigInteger r10 = p240nj.InterfaceC4844b.f19243R
            boolean r13 = r3.equals(r10)
            if (r13 == 0) goto L22b
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto L1c7
            goto L22b
        L1c7:
            nj.c r1 = r0.f19286a
            nj.c$b r1 = (p240nj.AbstractC4845c.b) r1
            nj.d r2 = r1.f19249b
            java.math.BigInteger r2 = r2.mo10912t()
            byte r2 = r2.byteValue()
            nj.u r3 = new nj.u
            r3.<init>(r0, r2)
            java.lang.String r2 = "bc_wtnaf"
            nj.n r1 = r1.m10885r(r0, r2, r3)
            nj.w r1 = (p240nj.C4865w) r1
            nj.f$b[] r1 = r1.f19332a
            int r2 = r1.length
            nj.f$b[] r2 = new p240nj.AbstractC4848f.b[r2]
            r3 = 0
        L1e8:
            int r4 = r1.length
            if (r3 >= r4) goto L1f8
            r4 = r1[r3]
            nj.f r4 = r4.mo10933n()
            nj.f$b r4 = (p240nj.AbstractC4848f.b) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L1e8
        L1f8:
            nj.c r0 = r0.f19286a
            nj.f r0 = r0.mo10881n()
            nj.f$b r0 = (p240nj.AbstractC4848f.b) r0
            r10 = -1
            int r7 = r7 + r10
            r3 = 0
        L203:
            if (r7 < 0) goto L224
            int r3 = r3 + 1
            r4 = r8[r7]
            if (r4 == 0) goto L221
            nj.f$b r0 = r0.m10946z(r3)
            if (r4 <= 0) goto L216
            int r3 = r4 >>> 1
            r3 = r1[r3]
            goto L21a
        L216:
            int r3 = -r4
            int r3 = r3 >>> r11
            r3 = r2[r3]
        L21a:
            nj.f r0 = r0.mo10920a(r3)
            nj.f$b r0 = (p240nj.AbstractC4848f.b) r0
            r3 = 0
        L221:
            int r7 = r7 + (-1)
            goto L203
        L224:
            if (r3 <= 0) goto L22a
            nj.f$b r0 = r0.m10946z(r3)
        L22a:
            return r0
        L22b:
            r10 = -1
            boolean r13 = r3.testBit(r14)
            if (r13 == 0) goto L282
            java.math.BigInteger r13 = r1.multiply(r4)
            java.math.BigInteger r13 = r3.add(r13)
            java.math.BigInteger r13 = r13.mod(r5)
            int r15 = r13.compareTo(r9)
            if (r15 < 0) goto L248
            java.math.BigInteger r13 = r13.subtract(r5)
        L248:
            int r13 = r13.intValue()
            byte r13 = (byte) r13
            r8[r6] = r13
            if (r13 >= 0) goto L255
            int r13 = -r13
            byte r13 = (byte) r13
            r15 = 0
            goto L256
        L255:
            r15 = 1
        L256:
            if (r15 == 0) goto L26d
            r15 = r2[r13]
            wa.b<s9.a> r15 = r15.f12118b
            java.math.BigInteger r15 = (java.math.BigInteger) r15
            java.math.BigInteger r3 = r3.subtract(r15)
            r13 = r2[r13]
            java.util.Map<java.lang.String, java.lang.String> r13 = r13.f12119c
            java.math.BigInteger r13 = (java.math.BigInteger) r13
            java.math.BigInteger r1 = r1.subtract(r13)
            goto L284
        L26d:
            r15 = r2[r13]
            wa.b<s9.a> r15 = r15.f12118b
            java.math.BigInteger r15 = (java.math.BigInteger) r15
            java.math.BigInteger r3 = r3.add(r15)
            r13 = r2[r13]
            java.util.Map<java.lang.String, java.lang.String> r13 = r13.f12119c
            java.math.BigInteger r13 = (java.math.BigInteger) r13
            java.math.BigInteger r1 = r1.add(r13)
            goto L284
        L282:
            r8[r6] = r14
        L284:
            java.math.BigInteger r13 = r3.shiftRight(r11)
            if (r12 != r11) goto L28f
            java.math.BigInteger r1 = r1.add(r13)
            goto L293
        L28f:
            java.math.BigInteger r1 = r1.subtract(r13)
        L293:
            java.math.BigInteger r3 = r3.shiftRight(r11)
            java.math.BigInteger r3 = r3.negate()
            int r6 = r6 + 1
            r17 = r3
            r3 = r1
            r1 = r17
            goto L1b8
        L2a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L2aa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "lambda0 and lambda1 do not have same scale"
            r0.<init>(r1)
            throw r0
        L2b2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L2b5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only ECPoint.AbstractF2m can be used in WTauNafMultiplier"
            r0.<init>(r1)
            throw r0
    }
}

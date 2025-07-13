package p240nj;

/* renamed from: nj.p */
/* loaded from: classes.dex */
public class C4858p {

    /* renamed from: a */
    public static final java.math.BigInteger f19307a = null;

    /* renamed from: b */
    public static final java.math.BigInteger f19308b = null;

    /* renamed from: c */
    public static final p128hb.C3003h[] f19309c = null;

    /* renamed from: d */
    public static final byte[][] f19310d = null;

    /* renamed from: e */
    public static final p128hb.C3003h[] f19311e = null;

    /* renamed from: f */
    public static final byte[][] f19312f = null;

    static {
            java.math.BigInteger r0 = p240nj.InterfaceC4844b.f19244S
            java.math.BigInteger r1 = r0.negate()
            p240nj.C4858p.f19307a = r1
            java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19245T
            java.math.BigInteger r2 = r2.negate()
            p240nj.C4858p.f19308b = r2
            java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19246U
            java.math.BigInteger r2 = r2.negate()
            r3 = 9
            hb.h[] r4 = new p128hb.C3003h[r3]
            r5 = 0
            r6 = 0
            r4[r5] = r6
            hb.h r7 = new hb.h
            java.math.BigInteger r8 = p240nj.InterfaceC4844b.f19243R
            r7.<init>(r0, r8)
            r9 = 1
            r4[r9] = r7
            r7 = 2
            r4[r7] = r6
            hb.h r10 = new hb.h
            r10.<init>(r2, r1)
            r11 = 3
            r4[r11] = r10
            r10 = 4
            r4[r10] = r6
            hb.h r12 = new hb.h
            r12.<init>(r1, r1)
            r13 = 5
            r4[r13] = r12
            r12 = 6
            r4[r12] = r6
            hb.h r14 = new hb.h
            r14.<init>(r0, r1)
            r15 = 7
            r4[r15] = r14
            r14 = 8
            r4[r14] = r6
            p240nj.C4858p.f19309c = r4
            byte[][] r4 = new byte[r14][]
            r4[r5] = r6
            byte[] r14 = new byte[r9]
            r14[r5] = r9
            r4[r9] = r14
            r4[r7] = r6
            byte[] r14 = new byte[r11]
            r14 = {x00ca: FILL_ARRAY_DATA , data: [-1, 0, 1} // fill-array
            r4[r11] = r14
            r4[r10] = r6
            byte[] r14 = new byte[r11]
            r14 = {x00d0: FILL_ARRAY_DATA , data: [1, 0, 1} // fill-array
            r4[r13] = r14
            r4[r12] = r6
            byte[] r14 = new byte[r10]
            r14 = {x00d6: FILL_ARRAY_DATA , data: [-1, 0, 0, 1} // fill-array
            r4[r15] = r14
            p240nj.C4858p.f19310d = r4
            hb.h[] r3 = new p128hb.C3003h[r3]
            r3[r5] = r6
            hb.h r4 = new hb.h
            r4.<init>(r0, r8)
            r3[r9] = r4
            r3[r7] = r6
            hb.h r4 = new hb.h
            r4.<init>(r2, r0)
            r3[r11] = r4
            r3[r10] = r6
            hb.h r2 = new hb.h
            r2.<init>(r1, r0)
            r3[r13] = r2
            r3[r12] = r6
            hb.h r1 = new hb.h
            r1.<init>(r0, r0)
            r3[r15] = r1
            r0 = 8
            r3[r0] = r6
            p240nj.C4858p.f19311e = r3
            byte[][] r0 = new byte[r0][]
            r0[r5] = r6
            byte[] r1 = new byte[r9]
            r1[r5] = r9
            r0[r9] = r1
            r0[r7] = r6
            byte[] r1 = new byte[r11]
            r1 = {x00dc: FILL_ARRAY_DATA , data: [-1, 0, 1} // fill-array
            r0[r11] = r1
            r0[r10] = r6
            byte[] r1 = new byte[r11]
            r1 = {x00e2: FILL_ARRAY_DATA , data: [1, 0, 1} // fill-array
            r0[r13] = r1
            r0[r12] = r6
            byte[] r1 = new byte[r10]
            r1 = {x00e8: FILL_ARRAY_DATA , data: [-1, 0, 0, -1} // fill-array
            r0[r15] = r1
            p240nj.C4858p.f19312f = r0
            return
    }

    /* renamed from: a */
    public static p240nj.C4857o m10980a(java.math.BigInteger r2, java.math.BigInteger r3, java.math.BigInteger r4, byte r5, int r6, int r7) {
            int r0 = r6 + 5
            int r0 = r0 / 2
            int r0 = r0 + r7
            int r1 = r6 - r0
            int r1 = r1 + (-2)
            int r1 = r1 + r5
            java.math.BigInteger r2 = r2.shiftRight(r1)
            java.math.BigInteger r2 = r3.multiply(r2)
            java.math.BigInteger r3 = r2.shiftRight(r6)
            java.math.BigInteger r3 = r4.multiply(r3)
            java.math.BigInteger r2 = r2.add(r3)
            int r0 = r0 - r7
            java.math.BigInteger r3 = r2.shiftRight(r0)
            int r0 = r0 + (-1)
            boolean r2 = r2.testBit(r0)
            if (r2 == 0) goto L31
            java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19244S
            java.math.BigInteger r3 = r3.add(r2)
        L31:
            nj.o r2 = new nj.o
            r2.<init>(r3, r7)
            return r2
    }

    /* renamed from: b */
    public static java.math.BigInteger[] m10981b(byte r5, int r6, boolean r7) {
            r0 = 1
            if (r5 == r0) goto Lf
            r1 = -1
            if (r5 != r1) goto L7
            goto Lf
        L7:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "mu must be 1 or -1"
            r5.<init>(r6)
            throw r5
        Lf:
            if (r7 == 0) goto L19
            java.math.BigInteger r7 = p240nj.InterfaceC4844b.f19245T
            long r1 = (long) r5
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            goto L1d
        L19:
            java.math.BigInteger r7 = p240nj.InterfaceC4844b.f19243R
            java.math.BigInteger r1 = p240nj.InterfaceC4844b.f19244S
        L1d:
            r2 = 1
        L1e:
            if (r2 >= r6) goto L36
            if (r5 != r0) goto L24
            r3 = r1
            goto L28
        L24:
            java.math.BigInteger r3 = r1.negate()
        L28:
            java.math.BigInteger r7 = r7.shiftLeft(r0)
            java.math.BigInteger r7 = r3.subtract(r7)
            int r2 = r2 + 1
            r4 = r1
            r1 = r7
            r7 = r4
            goto L1e
        L36:
            r5 = 2
            java.math.BigInteger[] r5 = new java.math.BigInteger[r5]
            r6 = 0
            r5[r6] = r7
            r5[r0] = r1
            return r5
    }

    /* renamed from: c */
    public static java.math.BigInteger[] m10982c(p240nj.AbstractC4845c.b r6) {
            boolean r0 = r6.mo10890u()
            if (r0 == 0) goto L76
            int r0 = r6.mo10880m()
            nj.d r1 = r6.f19249b
            java.math.BigInteger r1 = r1.mo10912t()
            int r1 = r1.intValue()
            r2 = 1
            if (r1 != 0) goto L19
            r3 = -1
            goto L1a
        L19:
            r3 = 1
        L1a:
            byte r3 = (byte) r3
            java.math.BigInteger r6 = r6.f19252e
            if (r6 == 0) goto L6e
            java.math.BigInteger r4 = p240nj.InterfaceC4844b.f19245T
            boolean r4 = r6.equals(r4)
            r5 = 2
            if (r4 == 0) goto L2a
            r6 = 1
            goto L33
        L2a:
            java.math.BigInteger r4 = p240nj.InterfaceC4844b.f19247V
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L6e
            r6 = 2
        L33:
            int r0 = r0 + 3
            int r0 = r0 - r1
            r1 = 0
            java.math.BigInteger[] r0 = m10981b(r3, r0, r1)
            if (r3 != r2) goto L4d
            r3 = r0[r1]
            java.math.BigInteger r3 = r3.negate()
            r0[r1] = r3
            r3 = r0[r2]
            java.math.BigInteger r3 = r3.negate()
            r0[r2] = r3
        L4d:
            java.math.BigInteger r3 = p240nj.InterfaceC4844b.f19244S
            r4 = r0[r2]
            java.math.BigInteger r4 = r3.add(r4)
            java.math.BigInteger r4 = r4.shiftRight(r6)
            r0 = r0[r1]
            java.math.BigInteger r0 = r3.add(r0)
            java.math.BigInteger r6 = r0.shiftRight(r6)
            java.math.BigInteger r6 = r6.negate()
            java.math.BigInteger[] r0 = new java.math.BigInteger[r5]
            r0[r1] = r4
            r0[r2] = r6
            return r0
        L6e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "h (Cofactor) must be 2 or 4"
            r6.<init>(r0)
            throw r6
        L76:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "si is defined for Koblitz curves only"
            r6.<init>(r0)
            throw r6
    }
}

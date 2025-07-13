package p129hc;

/* renamed from: hc.s */
/* loaded from: classes.dex */
public abstract class AbstractC3022s extends p129hc.AbstractC3019p {

    /* renamed from: d */
    public static final int[] f12161d = null;

    /* renamed from: e */
    public static final int[] f12162e = null;

    /* renamed from: f */
    public static final int[] f12163f = null;

    /* renamed from: g */
    public static final int[][] f12164g = null;

    /* renamed from: h */
    public static final int[][] f12165h = null;

    /* renamed from: a */
    public final java.lang.StringBuilder f12166a;

    /* renamed from: b */
    public final p129hc.C3021r f12167b;

    /* renamed from: c */
    public final p128hb.C3003h f12168c;

    static {
            r0 = 3
            int[] r1 = new int[r0]
            r1 = {x0098: FILL_ARRAY_DATA , data: [1, 1, 1} // fill-array
            p129hc.AbstractC3022s.f12161d = r1
            r1 = 5
            int[] r2 = new int[r1]
            r2 = {x00a2: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 1} // fill-array
            p129hc.AbstractC3022s.f12162e = r2
            r2 = 6
            int[] r3 = new int[r2]
            r3 = {x00b0: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 1, 1} // fill-array
            p129hc.AbstractC3022s.f12163f = r3
            r3 = 10
            int[][] r4 = new int[r3][]
            r5 = 4
            int[] r6 = new int[r5]
            r6 = {x00c0: FILL_ARRAY_DATA , data: [3, 2, 1, 1} // fill-array
            r7 = 0
            r4[r7] = r6
            int[] r6 = new int[r5]
            r6 = {x00cc: FILL_ARRAY_DATA , data: [2, 2, 2, 1} // fill-array
            r8 = 1
            r4[r8] = r6
            int[] r6 = new int[r5]
            r6 = {x00d8: FILL_ARRAY_DATA , data: [2, 1, 2, 2} // fill-array
            r9 = 2
            r4[r9] = r6
            int[] r6 = new int[r5]
            r6 = {x00e4: FILL_ARRAY_DATA , data: [1, 4, 1, 1} // fill-array
            r4[r0] = r6
            int[] r0 = new int[r5]
            r0 = {x00f0: FILL_ARRAY_DATA , data: [1, 1, 3, 2} // fill-array
            r4[r5] = r0
            int[] r0 = new int[r5]
            r0 = {x00fc: FILL_ARRAY_DATA , data: [1, 2, 3, 1} // fill-array
            r4[r1] = r0
            int[] r0 = new int[r5]
            r0 = {x0108: FILL_ARRAY_DATA , data: [1, 1, 1, 4} // fill-array
            r4[r2] = r0
            int[] r0 = new int[r5]
            r0 = {x0114: FILL_ARRAY_DATA , data: [1, 3, 1, 2} // fill-array
            r1 = 7
            r4[r1] = r0
            int[] r0 = new int[r5]
            r0 = {x0120: FILL_ARRAY_DATA , data: [1, 2, 1, 3} // fill-array
            r1 = 8
            r4[r1] = r0
            int[] r0 = new int[r5]
            r0 = {x012c: FILL_ARRAY_DATA , data: [3, 1, 1, 2} // fill-array
            r1 = 9
            r4[r1] = r0
            p129hc.AbstractC3022s.f12164g = r4
            r0 = 20
            int[][] r1 = new int[r0][]
            p129hc.AbstractC3022s.f12165h = r1
            java.lang.System.arraycopy(r4, r7, r1, r7, r3)
        L76:
            if (r3 >= r0) goto L96
            int[][] r1 = p129hc.AbstractC3022s.f12164g
            int r2 = r3 + (-10)
            r1 = r1[r2]
            int r2 = r1.length
            int[] r2 = new int[r2]
            r4 = 0
        L82:
            int r5 = r1.length
            if (r4 >= r5) goto L8f
            int r5 = r1.length
            int r5 = r5 - r4
            int r5 = r5 - r8
            r5 = r1[r5]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L82
        L8f:
            int[][] r1 = p129hc.AbstractC3022s.f12165h
            r1[r3] = r2
            int r3 = r3 + 1
            goto L76
        L96:
            return
    }

    public AbstractC3022s() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 20
            r0.<init>(r1)
            r2.f12166a = r0
            hc.r r0 = new hc.r
            r0.<init>()
            r2.f12167b = r0
            hb.h r0 = new hb.h
            r1 = 4
            r0.<init>(r1)
            r2.f12168c = r0
            return
    }

    /* renamed from: j */
    public static boolean m7426j(java.lang.CharSequence r6) {
            int r0 = r6.length()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r0 + (-2)
            r3 = 0
        Lb:
            r4 = 9
            if (r2 < 0) goto L22
            char r5 = r6.charAt(r2)
            int r5 = r5 + (-48)
            if (r5 < 0) goto L1d
            if (r5 > r4) goto L1d
            int r3 = r3 + r5
            int r2 = r2 + (-2)
            goto Lb
        L1d:
            sb.f r6 = sb.C6012f.m12491a()
            throw r6
        L22:
            int r3 = r3 * 3
            r2 = 1
            int r0 = r0 - r2
        L26:
            if (r0 < 0) goto L3b
            char r5 = r6.charAt(r0)
            int r5 = r5 + (-48)
            if (r5 < 0) goto L36
            if (r5 > r4) goto L36
            int r3 = r3 + r5
            int r0 = r0 + (-2)
            goto L26
        L36:
            sb.f r6 = sb.C6012f.m12491a()
            throw r6
        L3b:
            int r3 = r3 % 10
            if (r3 != 0) goto L40
            return r2
        L40:
            return r1
    }

    /* renamed from: k */
    public static int m7427k(p453zb.C7269a r4, int[] r5, int r6, int[][] r7) {
            p129hc.AbstractC3019p.m7421g(r4, r6, r5)
            int r4 = r7.length
            r6 = 1056293519(0x3ef5c28f, float:0.48)
            r0 = -1
            r1 = 0
        L9:
            if (r1 >= r4) goto L1d
            r2 = r7[r1]
            r3 = 1060320051(0x3f333333, float:0.7)
            float r2 = p129hc.AbstractC3019p.m7420f(r5, r2, r3)
            int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r3 >= 0) goto L1a
            r0 = r1
            r6 = r2
        L1a:
            int r1 = r1 + 1
            goto L9
        L1d:
            if (r0 < 0) goto L20
            return r0
        L20:
            sb.k r4 = sb.C6017k.f23200a0
            throw r4
    }

    /* renamed from: o */
    public static int[] m7428o(p453zb.C7269a r10, int r11, boolean r12, int[] r13, int[] r14) {
            int r0 = r10.f27901Z
            if (r12 == 0) goto L9
            int r11 = r10.m14366g(r11)
            goto Ld
        L9:
            int r11 = r10.m14365f(r11)
        Ld:
            int r1 = r13.length
            r2 = 0
            r3 = r12
            r4 = 0
            r12 = r11
        L12:
            if (r11 >= r0) goto L57
            boolean r5 = r10.m14364e(r11)
            r5 = r5 ^ r3
            r6 = 1
            if (r5 == 0) goto L22
            r5 = r14[r4]
            int r5 = r5 + r6
            r14[r4] = r5
            goto L54
        L22:
            int r5 = r1 + (-1)
            if (r4 != r5) goto L4e
            r7 = 1060320051(0x3f333333, float:0.7)
            float r7 = p129hc.AbstractC3019p.m7420f(r14, r13, r7)
            r8 = 1056293519(0x3ef5c28f, float:0.48)
            r9 = 2
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L3c
            int[] r10 = new int[r9]
            r10[r2] = r12
            r10[r6] = r11
            return r10
        L3c:
            r7 = r14[r2]
            r8 = r14[r6]
            int r7 = r7 + r8
            int r12 = r12 + r7
            int r7 = r1 + (-2)
            java.lang.System.arraycopy(r14, r9, r14, r2, r7)
            r14[r7] = r2
            r14[r5] = r2
            int r4 = r4 + (-1)
            goto L50
        L4e:
            int r4 = r4 + 1
        L50:
            r14[r4] = r6
            r3 = r3 ^ 1
        L54:
            int r11 = r11 + 1
            goto L12
        L57:
            sb.k r10 = sb.C6017k.f23200a0
            throw r10
    }

    /* renamed from: p */
    public static int[] m7429p(p453zb.C7269a r7) {
            int[] r0 = p129hc.AbstractC3022s.f12161d
            int r0 = r0.length
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L9:
            if (r3 != 0) goto L26
            int[] r2 = p129hc.AbstractC3022s.f12161d
            int r5 = r2.length
            java.util.Arrays.fill(r0, r1, r5, r1)
            int[] r2 = m7428o(r7, r4, r1, r2, r0)
            r4 = r2[r1]
            r5 = 1
            r5 = r2[r5]
            int r6 = r5 - r4
            int r6 = r4 - r6
            if (r6 < 0) goto L24
            boolean r3 = r7.m14368k(r6, r4, r1)
        L24:
            r4 = r5
            goto L9
        L26:
            return r2
    }

    @Override // p129hc.AbstractC3019p
    /* renamed from: d */
    public sb.C6021o mo7401d(int r2, p453zb.C7269a r3, java.util.Map<sb.EnumC6009c, ?> r4) {
            r1 = this;
            int[] r0 = m7429p(r3)
            sb.o r2 = r1.mo7416n(r2, r3, r0, r4)
            return r2
    }

    /* renamed from: i */
    public boolean mo7430i(java.lang.String r1) {
            r0 = this;
            boolean r1 = m7426j(r1)
            return r1
    }

    /* renamed from: l */
    public int[] mo7431l(p453zb.C7269a r4, int r5) {
            r3 = this;
            int[] r0 = p129hc.AbstractC3022s.f12161d
            int r1 = r0.length
            int[] r1 = new int[r1]
            r2 = 0
            int[] r4 = m7428o(r4, r5, r2, r0, r1)
            return r4
    }

    /* renamed from: m */
    public abstract int mo7413m(p453zb.C7269a r1, int[] r2, java.lang.StringBuilder r3);

    /* renamed from: n */
    public sb.C6021o mo7416n(int r12, p453zb.C7269a r13, int[] r14, java.util.Map<sb.EnumC6009c, ?> r15) {
            r11 = this;
            r0 = 0
            if (r15 != 0) goto L5
            r1 = r0
            goto Ld
        L5:
            sb.c r1 = sb.EnumC6009c.f23178h0
            java.lang.Object r1 = r15.get(r1)
            sb.r r1 = (sb.InterfaceC6024r) r1
        Ld:
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            sb.q r5 = new sb.q
            r6 = r14[r4]
            r7 = r14[r3]
            int r6 = r6 + r7
            float r6 = (float) r6
            float r6 = r6 / r2
            float r7 = (float) r12
            r5.<init>(r6, r7)
            r1.mo12503a(r5)
        L23:
            java.lang.StringBuilder r5 = r11.f12166a
            r5.setLength(r4)
            int r6 = r11.mo7413m(r13, r14, r5)
            if (r1 == 0) goto L38
            sb.q r7 = new sb.q
            float r8 = (float) r6
            float r9 = (float) r12
            r7.<init>(r8, r9)
            r1.mo12503a(r7)
        L38:
            int[] r6 = r11.mo7431l(r13, r6)
            if (r1 == 0) goto L4e
            sb.q r7 = new sb.q
            r8 = r6[r4]
            r9 = r6[r3]
            int r8 = r8 + r9
            float r8 = (float) r8
            float r8 = r8 / r2
            float r9 = (float) r12
            r7.<init>(r8, r9)
            r1.mo12503a(r7)
        L4e:
            r1 = r6[r3]
            r7 = r6[r4]
            int r7 = r1 - r7
            int r7 = r7 + r1
            int r8 = r13.f27901Z
            if (r7 >= r8) goto L14f
            boolean r1 = r13.m14368k(r1, r7, r4)
            if (r1 == 0) goto L14f
            java.lang.String r1 = r5.toString()
            int r5 = r1.length()
            r7 = 8
            if (r5 < r7) goto L14a
            boolean r5 = r11.mo7430i(r1)
            if (r5 == 0) goto L145
            r5 = r14[r3]
            r14 = r14[r4]
            int r5 = r5 + r14
            float r14 = (float) r5
            float r14 = r14 / r2
            r5 = r6[r3]
            r7 = r6[r4]
            int r5 = r5 + r7
            float r5 = (float) r5
            float r5 = r5 / r2
            sb.a r2 = r11.mo7414q()
            sb.o r7 = new sb.o
            r8 = 2
            sb.q[] r8 = new sb.C6023q[r8]
            sb.q r9 = new sb.q
            float r10 = (float) r12
            r9.<init>(r14, r10)
            r8[r4] = r9
            sb.q r14 = new sb.q
            r14.<init>(r5, r10)
            r8[r3] = r14
            r7.<init>(r1, r0, r8, r2)
            hc.r r14 = r11.f12167b     // Catch: sb.AbstractC6020n -> Ld3
            r5 = r6[r3]     // Catch: sb.AbstractC6020n -> Ld3
            sb.o r12 = r14.m7425a(r12, r13, r5)     // Catch: sb.AbstractC6020n -> Ld3
            sb.p r13 = sb.EnumC6022p.f23217e0     // Catch: sb.AbstractC6020n -> Ld3
            java.lang.String r14 = r12.f23206a     // Catch: sb.AbstractC6020n -> Ld3
            r7.m12500b(r13, r14)     // Catch: sb.AbstractC6020n -> Ld3
            java.util.Map<sb.p, java.lang.Object> r13 = r12.f23210e     // Catch: sb.AbstractC6020n -> Ld3
            r7.m12499a(r13)     // Catch: sb.AbstractC6020n -> Ld3
            sb.q[] r13 = r12.f23208c     // Catch: sb.AbstractC6020n -> Ld3
            sb.q[] r14 = r7.f23208c     // Catch: sb.AbstractC6020n -> Ld3
            if (r14 != 0) goto Lb7
            r7.f23208c = r13     // Catch: sb.AbstractC6020n -> Ld3
            goto Lcc
        Lb7:
            if (r13 == 0) goto Lcc
            int r5 = r13.length     // Catch: sb.AbstractC6020n -> Ld3
            if (r5 <= 0) goto Lcc
            int r5 = r14.length     // Catch: sb.AbstractC6020n -> Ld3
            int r6 = r13.length     // Catch: sb.AbstractC6020n -> Ld3
            int r5 = r5 + r6
            sb.q[] r5 = new sb.C6023q[r5]     // Catch: sb.AbstractC6020n -> Ld3
            int r6 = r14.length     // Catch: sb.AbstractC6020n -> Ld3
            java.lang.System.arraycopy(r14, r4, r5, r4, r6)     // Catch: sb.AbstractC6020n -> Ld3
            int r14 = r14.length     // Catch: sb.AbstractC6020n -> Ld3
            int r6 = r13.length     // Catch: sb.AbstractC6020n -> Ld3
            java.lang.System.arraycopy(r13, r4, r5, r14, r6)     // Catch: sb.AbstractC6020n -> Ld3
            r7.f23208c = r5     // Catch: sb.AbstractC6020n -> Ld3
        Lcc:
            java.lang.String r12 = r12.f23206a     // Catch: sb.AbstractC6020n -> Ld3
            int r12 = r12.length()     // Catch: sb.AbstractC6020n -> Ld3
            goto Ld4
        Ld3:
            r12 = 0
        Ld4:
            if (r15 != 0) goto Ld8
            r13 = r0
            goto Le0
        Ld8:
            sb.c r13 = sb.EnumC6009c.f23179i0
            java.lang.Object r13 = r15.get(r13)
            int[] r13 = (int[]) r13
        Le0:
            if (r13 == 0) goto Lf6
            int r14 = r13.length
            r15 = 0
        Le4:
            if (r15 >= r14) goto Lef
            r5 = r13[r15]
            if (r12 != r5) goto Lec
            r12 = 1
            goto Lf0
        Lec:
            int r15 = r15 + 1
            goto Le4
        Lef:
            r12 = 0
        Lf0:
            if (r12 == 0) goto Lf3
            goto Lf6
        Lf3:
            sb.k r12 = sb.C6017k.f23200a0
            throw r12
        Lf6:
            sb.a r12 = sb.EnumC6007a.f23158f0
            if (r2 == r12) goto Lfe
            sb.a r12 = sb.EnumC6007a.f23165m0
            if (r2 != r12) goto L144
        Lfe:
            hb.h r12 = r11.f12168c
            r12.m7392s()
            r13 = 3
            java.lang.String r13 = r1.substring(r4, r13)
            int r13 = java.lang.Integer.parseInt(r13)
            wa.b<s9.a> r14 = r12.f12118b
            java.util.List r14 = (java.util.List) r14
            int r14 = r14.size()
            r15 = 0
        L115:
            if (r15 >= r14) goto L13d
            wa.b<s9.a> r1 = r12.f12118b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r15)
            int[] r1 = (int[]) r1
            r2 = r1[r4]
            if (r13 >= r2) goto L126
            goto L13d
        L126:
            int r5 = r1.length
            if (r5 != r3) goto L12a
            goto L12c
        L12a:
            r2 = r1[r3]
        L12c:
            if (r13 > r2) goto L13a
            java.util.Map<java.lang.String, java.lang.String> r12 = r12.f12119c
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r12.get(r15)
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            goto L13d
        L13a:
            int r15 = r15 + 1
            goto L115
        L13d:
            if (r0 == 0) goto L144
            sb.p r12 = sb.EnumC6022p.f23216d0
            r7.m12500b(r12, r0)
        L144:
            return r7
        L145:
            sb.b r12 = sb.C6008b.m12490a()
            throw r12
        L14a:
            sb.f r12 = sb.C6012f.m12491a()
            throw r12
        L14f:
            sb.k r12 = sb.C6017k.f23200a0
            throw r12
    }

    /* renamed from: q */
    public abstract sb.EnumC6007a mo7414q();
}

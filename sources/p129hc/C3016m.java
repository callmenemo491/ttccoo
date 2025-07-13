package p129hc;

/* renamed from: hc.m */
/* loaded from: classes.dex */
public final class C3016m extends p129hc.AbstractC3019p {

    /* renamed from: b */
    public static final int[] f12146b = null;

    /* renamed from: c */
    public static final int[] f12147c = null;

    /* renamed from: d */
    public static final int[] f12148d = null;

    /* renamed from: e */
    public static final int[][] f12149e = null;

    /* renamed from: a */
    public int f12150a;

    static {
            r0 = 5
            int[] r1 = new int[r0]
            r1 = {x006e: FILL_ARRAY_DATA , data: [6, 8, 10, 12, 14} // fill-array
            p129hc.C3016m.f12146b = r1
            r1 = 4
            int[] r2 = new int[r1]
            r2 = {x007c: FILL_ARRAY_DATA , data: [1, 1, 1, 1} // fill-array
            p129hc.C3016m.f12147c = r2
            r2 = 3
            int[] r3 = new int[r2]
            r3 = {x0088: FILL_ARRAY_DATA , data: [1, 1, 3} // fill-array
            p129hc.C3016m.f12148d = r3
            r3 = 10
            int[][] r3 = new int[r3][]
            int[] r4 = new int[r0]
            r4 = {x0092: FILL_ARRAY_DATA , data: [1, 1, 3, 3, 1} // fill-array
            r5 = 0
            r3[r5] = r4
            int[] r4 = new int[r0]
            r4 = {x00a0: FILL_ARRAY_DATA , data: [3, 1, 1, 1, 3} // fill-array
            r5 = 1
            r3[r5] = r4
            int[] r4 = new int[r0]
            r4 = {x00ae: FILL_ARRAY_DATA , data: [1, 3, 1, 1, 3} // fill-array
            r5 = 2
            r3[r5] = r4
            int[] r4 = new int[r0]
            r4 = {x00bc: FILL_ARRAY_DATA , data: [3, 3, 1, 1, 1} // fill-array
            r3[r2] = r4
            int[] r2 = new int[r0]
            r2 = {x00ca: FILL_ARRAY_DATA , data: [1, 1, 3, 1, 3} // fill-array
            r3[r1] = r2
            int[] r1 = new int[r0]
            r1 = {x00d8: FILL_ARRAY_DATA , data: [3, 1, 3, 1, 1} // fill-array
            r3[r0] = r1
            int[] r1 = new int[r0]
            r1 = {x00e6: FILL_ARRAY_DATA , data: [1, 3, 3, 1, 1} // fill-array
            r2 = 6
            r3[r2] = r1
            int[] r1 = new int[r0]
            r1 = {x00f4: FILL_ARRAY_DATA , data: [1, 1, 1, 3, 3} // fill-array
            r2 = 7
            r3[r2] = r1
            int[] r1 = new int[r0]
            r1 = {x0102: FILL_ARRAY_DATA , data: [3, 1, 1, 3, 1} // fill-array
            r2 = 8
            r3[r2] = r1
            int[] r0 = new int[r0]
            r0 = {x0110: FILL_ARRAY_DATA , data: [1, 3, 1, 3, 1} // fill-array
            r1 = 9
            r3[r1] = r0
            p129hc.C3016m.f12149e = r3
            return
    }

    public C3016m() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f12150a = r0
            return
    }

    /* renamed from: i */
    public static int m7417i(int[] r6) {
            int[][] r0 = p129hc.C3016m.f12149e
            int r0 = r0.length
            r1 = 1052938076(0x3ec28f5c, float:0.38)
            r2 = -1
            r3 = 0
        L8:
            if (r3 >= r0) goto L1e
            int[][] r4 = p129hc.C3016m.f12149e
            r4 = r4[r3]
            r5 = 1061662228(0x3f47ae14, float:0.78)
            float r4 = p129hc.AbstractC3019p.m7420f(r6, r4, r5)
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 >= 0) goto L1b
            r2 = r3
            r1 = r4
        L1b:
            int r3 = r3 + 1
            goto L8
        L1e:
            if (r2 < 0) goto L21
            return r2
        L21:
            sb.k r6 = sb.C6017k.f23200a0
            throw r6
    }

    /* renamed from: j */
    public static int[] m7418j(p453zb.C7269a r12, int r13, int[] r14) {
            int r0 = r14.length
            int[] r1 = new int[r0]
            int r2 = r12.f27901Z
            r3 = 0
            r4 = r13
            r5 = 0
            r6 = 0
        L9:
            if (r13 >= r2) goto L4e
            boolean r7 = r12.m14364e(r13)
            r7 = r7 ^ r5
            r8 = 1
            if (r7 == 0) goto L19
            r7 = r1[r6]
            int r7 = r7 + r8
            r1[r6] = r7
            goto L4b
        L19:
            int r7 = r0 + (-1)
            if (r6 != r7) goto L45
            r9 = 1061662228(0x3f47ae14, float:0.78)
            float r9 = p129hc.AbstractC3019p.m7420f(r1, r14, r9)
            r10 = 1052938076(0x3ec28f5c, float:0.38)
            r11 = 2
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L33
            int[] r12 = new int[r11]
            r12[r3] = r4
            r12[r8] = r13
            return r12
        L33:
            r9 = r1[r3]
            r10 = r1[r8]
            int r9 = r9 + r10
            int r4 = r4 + r9
            int r9 = r0 + (-2)
            java.lang.System.arraycopy(r1, r11, r1, r3, r9)
            r1[r9] = r3
            r1[r7] = r3
            int r6 = r6 + (-1)
            goto L47
        L45:
            int r6 = r6 + 1
        L47:
            r1[r6] = r8
            r5 = r5 ^ 1
        L4b:
            int r13 = r13 + 1
            goto L9
        L4e:
            sb.k r12 = sb.C6017k.f23200a0
            throw r12
    }

    @Override // p129hc.AbstractC3019p
    /* renamed from: d */
    public sb.C6021o mo7401d(int r19, p453zb.C7269a r20, java.util.Map<sb.EnumC6009c, ?> r21) {
            r18 = this;
            r1 = r18
            r2 = r20
            r0 = r21
            int r3 = r2.f27901Z
            r4 = 0
            int r5 = r2.m14365f(r4)
            if (r5 == r3) goto Lf4
            int[] r3 = p129hc.C3016m.f12147c
            int[] r3 = m7418j(r2, r5, r3)
            r5 = 1
            r6 = r3[r5]
            r7 = r3[r4]
            int r6 = r6 - r7
            int r6 = r6 / 4
            r1.f12150a = r6
            r6 = r3[r4]
            r1.m7419k(r2, r6)
            r20.m14369m()
            int r6 = r2.f27901Z     // Catch: java.lang.Throwable -> Lef
            int r7 = r2.m14365f(r4)     // Catch: java.lang.Throwable -> Lef
            if (r7 == r6) goto Lec
            int[] r6 = p129hc.C3016m.f12148d     // Catch: java.lang.Throwable -> Lef
            int[] r6 = m7418j(r2, r7, r6)     // Catch: java.lang.Throwable -> Lef
            r7 = r6[r4]     // Catch: java.lang.Throwable -> Lef
            r1.m7419k(r2, r7)     // Catch: java.lang.Throwable -> Lef
            r7 = r6[r4]     // Catch: java.lang.Throwable -> Lef
            int r8 = r2.f27901Z     // Catch: java.lang.Throwable -> Lef
            r9 = r6[r5]     // Catch: java.lang.Throwable -> Lef
            int r9 = r8 - r9
            r6[r4] = r9     // Catch: java.lang.Throwable -> Lef
            int r8 = r8 - r7
            r6[r5] = r8     // Catch: java.lang.Throwable -> Lef
            r20.m14369m()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 20
            r7.<init>(r8)
            r8 = r3[r5]
            r9 = r6[r4]
            r10 = 10
            int[] r11 = new int[r10]
            r12 = 5
            int[] r13 = new int[r12]
            int[] r14 = new int[r12]
        L5e:
            if (r8 >= r9) goto L93
            p129hc.AbstractC3019p.m7421g(r2, r8, r11)
            r15 = 0
        L64:
            if (r15 >= r12) goto L75
            int r16 = r15 * 2
            r17 = r11[r16]
            r13[r15] = r17
            int r16 = r16 + 1
            r16 = r11[r16]
            r14[r15] = r16
            int r15 = r15 + 1
            goto L64
        L75:
            int r15 = m7417i(r13)
            int r15 = r15 + 48
            char r15 = (char) r15
            r7.append(r15)
            int r15 = m7417i(r14)
            int r15 = r15 + 48
            char r15 = (char) r15
            r7.append(r15)
            r15 = 0
        L8a:
            if (r15 >= r10) goto L5e
            r16 = r11[r15]
            int r8 = r8 + r16
            int r15 = r15 + 1
            goto L8a
        L93:
            java.lang.String r2 = r7.toString()
            r7 = 0
            if (r0 == 0) goto La3
            sb.c r8 = sb.EnumC6009c.f23174d0
            java.lang.Object r0 = r0.get(r8)
            int[] r0 = (int[]) r0
            goto La4
        La3:
            r0 = r7
        La4:
            if (r0 != 0) goto La8
            int[] r0 = p129hc.C3016m.f12146b
        La8:
            int r8 = r2.length()
            int r9 = r0.length
            r10 = 0
            r11 = 0
        Laf:
            if (r10 >= r9) goto Lbd
            r12 = r0[r10]
            if (r8 != r12) goto Lb7
            r0 = 1
            goto Lbe
        Lb7:
            if (r12 <= r11) goto Lba
            r11 = r12
        Lba:
            int r10 = r10 + 1
            goto Laf
        Lbd:
            r0 = 0
        Lbe:
            if (r0 != 0) goto Lc3
            if (r8 <= r11) goto Lc3
            r0 = 1
        Lc3:
            if (r0 == 0) goto Le7
            sb.o r0 = new sb.o
            r8 = 2
            sb.q[] r8 = new sb.C6023q[r8]
            sb.q r9 = new sb.q
            r3 = r3[r5]
            float r3 = (float) r3
            r10 = r19
            float r10 = (float) r10
            r9.<init>(r3, r10)
            r8[r4] = r9
            sb.q r3 = new sb.q
            r4 = r6[r4]
            float r4 = (float) r4
            r3.<init>(r4, r10)
            r8[r5] = r3
            sb.a r3 = sb.EnumC6007a.f23159g0
            r0.<init>(r2, r7, r8, r3)
            return r0
        Le7:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        Lec:
            sb.k r0 = sb.C6017k.f23200a0     // Catch: java.lang.Throwable -> Lef
            throw r0     // Catch: java.lang.Throwable -> Lef
        Lef:
            r0 = move-exception
            r20.m14369m()
            throw r0
        Lf4:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
    }

    /* renamed from: k */
    public final void m7419k(p453zb.C7269a r3, int r4) {
            r2 = this;
            int r0 = r2.f12150a
            int r0 = r0 * 10
            if (r0 >= r4) goto L7
            goto L8
        L7:
            r0 = r4
        L8:
            int r4 = r4 + (-1)
            if (r0 <= 0) goto L17
            if (r4 < 0) goto L17
            boolean r1 = r3.m14364e(r4)
            if (r1 != 0) goto L17
            int r0 = r0 + (-1)
            goto L8
        L17:
            if (r0 != 0) goto L1a
            return
        L1a:
            sb.k r3 = sb.C6017k.f23200a0
            throw r3
    }
}

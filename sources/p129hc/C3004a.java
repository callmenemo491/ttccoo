package p129hc;

/* renamed from: hc.a */
/* loaded from: classes.dex */
public final class C3004a extends p129hc.AbstractC3019p {

    /* renamed from: d */
    public static final char[] f12120d = null;

    /* renamed from: e */
    public static final int[] f12121e = null;

    /* renamed from: f */
    public static final char[] f12122f = null;

    /* renamed from: a */
    public final java.lang.StringBuilder f12123a;

    /* renamed from: b */
    public int[] f12124b;

    /* renamed from: c */
    public int f12125c;

    static {
            java.lang.String r0 = "0123456789-$:/.+ABCD"
            char[] r0 = r0.toCharArray()
            p129hc.C3004a.f12120d = r0
            r0 = 20
            int[] r0 = new int[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14} // fill-array
            p129hc.C3004a.f12121e = r0
            r0 = 4
            char[] r0 = new char[r0]
            r0 = {x0046: FILL_ARRAY_DATA , data: [65, 66, 67, 68} // fill-array
            p129hc.C3004a.f12122f = r0
            return
    }

    public C3004a() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 20
            r0.<init>(r1)
            r2.f12123a = r0
            r0 = 80
            int[] r0 = new int[r0]
            r2.f12124b = r0
            r0 = 0
            r2.f12125c = r0
            return
    }

    /* renamed from: i */
    public static boolean m7400i(char[] r4, char r5) {
            r0 = 0
            if (r4 == 0) goto L10
            int r1 = r4.length
            r2 = 0
        L5:
            if (r2 >= r1) goto L10
            char r3 = r4[r2]
            if (r3 != r5) goto Ld
            r4 = 1
            return r4
        Ld:
            int r2 = r2 + 1
            goto L5
        L10:
            return r0
    }

    @Override // p129hc.AbstractC3019p
    /* renamed from: d */
    public sb.C6021o mo7401d(int r20, p453zb.C7269a r21, java.util.Map<sb.EnumC6009c, ?> r22) {
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            int[] r3 = r0.f12124b
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            r0.f12125c = r4
            int r3 = r1.m14366g(r4)
            int r5 = r1.f27901Z
            if (r3 >= r5) goto L20f
            r6 = 1
            r7 = 0
            r8 = 1
        L19:
            if (r3 >= r5) goto L2e
            boolean r9 = r1.m14364e(r3)
            r9 = r9 ^ r8
            if (r9 == 0) goto L25
            int r7 = r7 + 1
            goto L2b
        L25:
            r0.m7402j(r7)
            r8 = r8 ^ 1
            r7 = 1
        L2b:
            int r3 = r3 + 1
            goto L19
        L2e:
            r0.m7402j(r7)
            r1 = 1
        L32:
            int r3 = r0.f12125c
            if (r1 >= r3) goto L20c
            int r3 = r0.m7403k(r1)
            r5 = -1
            if (r3 == r5) goto L206
            char[] r7 = p129hc.C3004a.f12122f
            char[] r8 = p129hc.C3004a.f12120d
            char r3 = r8[r3]
            boolean r3 = m7400i(r7, r3)
            if (r3 == 0) goto L206
            r3 = r1
            r7 = 0
        L4b:
            int r8 = r1 + 7
            if (r3 >= r8) goto L57
            int[] r8 = r0.f12124b
            r8 = r8[r3]
            int r7 = r7 + r8
            int r3 = r3 + 1
            goto L4b
        L57:
            if (r1 == r6) goto L63
            int[] r3 = r0.f12124b
            int r8 = r1 + (-1)
            r3 = r3[r8]
            int r7 = r7 / 2
            if (r3 < r7) goto L206
        L63:
            java.lang.StringBuilder r3 = r0.f12123a
            r3.setLength(r4)
            r3 = r1
        L69:
            int r7 = r0.m7403k(r3)
            if (r7 == r5) goto L203
            java.lang.StringBuilder r8 = r0.f12123a
            char r9 = (char) r7
            r8.append(r9)
            int r3 = r3 + 8
            java.lang.StringBuilder r8 = r0.f12123a
            int r8 = r8.length()
            if (r8 <= r6) goto L8b
            char[] r8 = p129hc.C3004a.f12122f
            char[] r9 = p129hc.C3004a.f12120d
            char r7 = r9[r7]
            boolean r7 = m7400i(r8, r7)
            if (r7 != 0) goto L8f
        L8b:
            int r7 = r0.f12125c
            if (r3 < r7) goto L1ff
        L8f:
            int[] r7 = r0.f12124b
            int r8 = r3 + (-1)
            r7 = r7[r8]
            r9 = -8
            r10 = 0
        L97:
            if (r9 >= r5) goto La3
            int[] r11 = r0.f12124b
            int r12 = r3 + r9
            r11 = r11[r12]
            int r10 = r10 + r11
            int r9 = r9 + 1
            goto L97
        La3:
            int r9 = r0.f12125c
            r11 = 2
            if (r3 >= r9) goto Laf
            int r10 = r10 / r11
            if (r7 < r10) goto Lac
            goto Laf
        Lac:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        Laf:
            r3 = 4
            int[] r7 = new int[r3]
            r7 = {x0212: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            int[] r9 = new int[r3]
            r9 = {x021e: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            java.lang.StringBuilder r10 = r0.f12123a
            int r10 = r10.length()
            int r10 = r10 + r5
            r12 = r1
            r5 = 0
        Lc3:
            int[] r13 = p129hc.C3004a.f12121e
            java.lang.StringBuilder r14 = r0.f12123a
            char r14 = r14.charAt(r5)
            r13 = r13[r14]
            r15 = 6
        Lce:
            if (r15 < 0) goto Led
            r16 = r15 & 1
            r17 = r13 & 1
            int r17 = r17 << 1
            int r16 = r16 + r17
            r17 = r7[r16]
            int[] r14 = r0.f12124b
            int r18 = r12 + r15
            r14 = r14[r18]
            int r17 = r17 + r14
            r7[r16] = r17
            r14 = r9[r16]
            int r14 = r14 + r6
            r9[r16] = r14
            int r13 = r13 >> r6
            int r15 = r15 + (-1)
            goto Lce
        Led:
            if (r5 >= r10) goto Lf4
            int r12 = r12 + 8
            int r5 = r5 + 1
            goto Lc3
        Lf4:
            float[] r5 = new float[r3]
            float[] r3 = new float[r3]
            r12 = 0
        Lf9:
            if (r12 >= r11) goto L12a
            r13 = 0
            r3[r12] = r13
            int r13 = r12 + 2
            r14 = r7[r12]
            float r14 = (float) r14
            r15 = r9[r12]
            float r15 = (float) r15
            float r14 = r14 / r15
            r15 = r7[r13]
            float r15 = (float) r15
            r11 = r9[r13]
            float r11 = (float) r11
            float r15 = r15 / r11
            float r15 = r15 + r14
            r11 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 / r11
            r3[r13] = r15
            r14 = r3[r13]
            r5[r12] = r14
            r14 = r7[r13]
            float r14 = (float) r14
            float r14 = r14 * r11
            r11 = 1069547520(0x3fc00000, float:1.5)
            float r14 = r14 + r11
            r11 = r9[r13]
            float r11 = (float) r11
            float r14 = r14 / r11
            r5[r13] = r14
            int r12 = r12 + 1
            r11 = 2
            goto Lf9
        L12a:
            r9 = r1
            r7 = 0
        L12c:
            int[] r11 = p129hc.C3004a.f12121e
            java.lang.StringBuilder r12 = r0.f12123a
            char r12 = r12.charAt(r7)
            r11 = r11[r12]
            r12 = 6
        L137:
            if (r12 < 0) goto L15a
            r13 = r12 & 1
            r14 = r11 & 1
            int r14 = r14 << r6
            int r13 = r13 + r14
            int[] r14 = r0.f12124b
            int r15 = r9 + r12
            r14 = r14[r15]
            float r14 = (float) r14
            r15 = r3[r13]
            int r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r15 < 0) goto L157
            r13 = r5[r13]
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 > 0) goto L157
            int r11 = r11 >> 1
            int r12 = r12 + (-1)
            goto L137
        L157:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L15a:
            if (r7 >= r10) goto L161
            int r9 = r9 + 8
            int r7 = r7 + 1
            goto L12c
        L161:
            r3 = 0
        L162:
            java.lang.StringBuilder r5 = r0.f12123a
            int r5 = r5.length()
            if (r3 >= r5) goto L17a
            java.lang.StringBuilder r5 = r0.f12123a
            char[] r7 = p129hc.C3004a.f12120d
            char r9 = r5.charAt(r3)
            char r7 = r7[r9]
            r5.setCharAt(r3, r7)
            int r3 = r3 + 1
            goto L162
        L17a:
            java.lang.StringBuilder r3 = r0.f12123a
            char r3 = r3.charAt(r4)
            char[] r5 = p129hc.C3004a.f12122f
            boolean r3 = m7400i(r5, r3)
            if (r3 == 0) goto L1fc
            java.lang.StringBuilder r3 = r0.f12123a
            int r7 = r3.length()
            int r7 = r7 - r6
            char r3 = r3.charAt(r7)
            boolean r3 = m7400i(r5, r3)
            if (r3 == 0) goto L1f9
            java.lang.StringBuilder r3 = r0.f12123a
            int r3 = r3.length()
            r5 = 3
            if (r3 <= r5) goto L1f6
            if (r2 == 0) goto L1ac
            sb.c r3 = sb.EnumC6009c.f23177g0
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L1bb
        L1ac:
            java.lang.StringBuilder r2 = r0.f12123a
            int r3 = r2.length()
            int r3 = r3 - r6
            r2.deleteCharAt(r3)
            java.lang.StringBuilder r2 = r0.f12123a
            r2.deleteCharAt(r4)
        L1bb:
            r2 = 0
            r3 = 0
        L1bd:
            if (r2 >= r1) goto L1c7
            int[] r5 = r0.f12124b
            r5 = r5[r2]
            int r3 = r3 + r5
            int r2 = r2 + 1
            goto L1bd
        L1c7:
            float r2 = (float) r3
        L1c8:
            if (r1 >= r8) goto L1d2
            int[] r5 = r0.f12124b
            r5 = r5[r1]
            int r3 = r3 + r5
            int r1 = r1 + 1
            goto L1c8
        L1d2:
            float r1 = (float) r3
            sb.o r3 = new sb.o
            java.lang.StringBuilder r5 = r0.f12123a
            java.lang.String r5 = r5.toString()
            r7 = 0
            r8 = 2
            sb.q[] r8 = new sb.C6023q[r8]
            sb.q r9 = new sb.q
            r10 = r20
            float r10 = (float) r10
            r9.<init>(r2, r10)
            r8[r4] = r9
            sb.q r2 = new sb.q
            r2.<init>(r1, r10)
            r8[r6] = r2
            sb.a r1 = sb.EnumC6007a.f23152Z
            r3.<init>(r5, r7, r8, r1)
            return r3
        L1f6:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L1f9:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L1fc:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L1ff:
            r10 = r20
            goto L69
        L203:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L206:
            r10 = r20
            int r1 = r1 + 2
            goto L32
        L20c:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L20f:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
    }

    /* renamed from: j */
    public final void m7402j(int r4) {
            r3 = this;
            int[] r0 = r3.f12124b
            int r1 = r3.f12125c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f12125c = r1
            int r4 = r0.length
            if (r1 < r4) goto L17
            int r4 = r1 << 1
            int[] r4 = new int[r4]
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.f12124b = r4
        L17:
            return
    }

    /* renamed from: k */
    public final int m7403k(int r11) {
            r10 = this;
            int r0 = r11 + 7
            int r1 = r10.f12125c
            r2 = -1
            if (r0 < r1) goto L8
            return r2
        L8:
            int[] r1 = r10.f12124b
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r5 = r11
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
        L13:
            if (r5 >= r0) goto L20
            r8 = r1[r5]
            if (r8 >= r6) goto L1a
            r6 = r8
        L1a:
            if (r8 <= r7) goto L1d
            r7 = r8
        L1d:
            int r5 = r5 + 2
            goto L13
        L20:
            int r6 = r6 + r7
            int r6 = r6 / 2
            int r5 = r11 + 1
            r7 = 0
        L26:
            if (r5 >= r0) goto L33
            r8 = r1[r5]
            if (r8 >= r3) goto L2d
            r3 = r8
        L2d:
            if (r8 <= r7) goto L30
            r7 = r8
        L30:
            int r5 = r5 + 2
            goto L26
        L33:
            int r3 = r3 + r7
            int r3 = r3 / 2
            r0 = 128(0x80, float:1.8E-43)
            r5 = 0
            r7 = 0
        L3a:
            r8 = 7
            if (r5 >= r8) goto L50
            r8 = r5 & 1
            if (r8 != 0) goto L43
            r8 = r6
            goto L44
        L43:
            r8 = r3
        L44:
            int r0 = r0 >> 1
            int r9 = r11 + r5
            r9 = r1[r9]
            if (r9 <= r8) goto L4d
            r7 = r7 | r0
        L4d:
            int r5 = r5 + 1
            goto L3a
        L50:
            int[] r11 = p129hc.C3004a.f12121e
            int r0 = r11.length
            if (r4 >= r0) goto L5d
            r11 = r11[r4]
            if (r11 != r7) goto L5a
            return r4
        L5a:
            int r4 = r4 + 1
            goto L50
        L5d:
            return r2
    }
}

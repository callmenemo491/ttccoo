package p129hc;

/* renamed from: hc.g */
/* loaded from: classes.dex */
public final class C3010g extends p129hc.AbstractC3019p {

    /* renamed from: c */
    public static final char[] f12136c = null;

    /* renamed from: d */
    public static final int[] f12137d = null;

    /* renamed from: e */
    public static final int f12138e = 0;

    /* renamed from: a */
    public final java.lang.StringBuilder f12139a;

    /* renamed from: b */
    public final int[] f12140b;

    static {
            java.lang.String r0 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*"
            char[] r0 = r0.toCharArray()
            p129hc.C3010g.f12136c = r0
            r0 = 48
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350} // fill-array
            p129hc.C3010g.f12137d = r0
            r1 = 47
            r0 = r0[r1]
            p129hc.C3010g.f12138e = r0
            return
    }

    public C3010g() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 20
            r0.<init>(r1)
            r2.f12139a = r0
            r0 = 6
            int[] r0 = new int[r0]
            r2.f12140b = r0
            return
    }

    /* renamed from: i */
    public static void m7408i(java.lang.CharSequence r6, int r7, int r8) {
            int r0 = r7 + (-1)
            r1 = 1
            r2 = 0
            r3 = 1
        L5:
            if (r0 < 0) goto L1b
            char r4 = r6.charAt(r0)
            java.lang.String r5 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*"
            int r4 = r5.indexOf(r4)
            int r4 = r4 * r3
            int r2 = r2 + r4
            int r3 = r3 + r1
            if (r3 <= r8) goto L18
            r3 = 1
        L18:
            int r0 = r0 + (-1)
            goto L5
        L1b:
            char r6 = r6.charAt(r7)
            char[] r7 = p129hc.C3010g.f12136c
            int r2 = r2 % 47
            char r7 = r7[r2]
            if (r6 != r7) goto L28
            return
        L28:
            sb.b r6 = sb.C6008b.m12490a()
            throw r6
    }

    /* renamed from: j */
    public static int m7409j(int[] r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto Lc
            r4 = r7[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Lc:
            int r0 = r7.length
            r2 = 0
            r4 = 0
        Lf:
            if (r2 >= r0) goto L38
            r5 = r7[r2]
            float r5 = (float) r5
            r6 = 1091567616(0x41100000, float:9.0)
            float r5 = r5 * r6
            float r6 = (float) r3
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)
            if (r5 <= 0) goto L36
            r6 = 4
            if (r5 <= r6) goto L24
            goto L36
        L24:
            r6 = r2 & 1
            if (r6 != 0) goto L32
            r6 = 0
        L29:
            if (r6 >= r5) goto L33
            int r4 = r4 << 1
            r4 = r4 | 1
            int r6 = r6 + 1
            goto L29
        L32:
            int r4 = r4 << r5
        L33:
            int r2 = r2 + 1
            goto Lf
        L36:
            r7 = -1
            return r7
        L38:
            return r4
    }

    @Override // p129hc.AbstractC3019p
    /* renamed from: d */
    public sb.C6021o mo7401d(int r17, p453zb.C7269a r18, java.util.Map<sb.EnumC6009c, ?> r19) {
            r16 = this;
            r0 = r16
            r1 = r18
            int r2 = r1.f27901Z
            r3 = 0
            int r4 = r1.m14365f(r3)
            int[] r5 = r0.f12140b
            java.util.Arrays.fill(r5, r3)
            int[] r5 = r0.f12140b
            int r6 = r5.length
            r7 = r4
            r8 = 0
            r9 = 0
        L16:
            if (r4 >= r2) goto L1b3
            boolean r10 = r1.m14364e(r4)
            r10 = r10 ^ r8
            r11 = 1
            if (r10 == 0) goto L29
            r10 = r5[r9]
            int r10 = r10 + r11
            r5[r9] = r10
            r12 = r17
            goto L1af
        L29:
            int r10 = r6 + (-1)
            if (r9 != r10) goto L1a7
            int r12 = m7409j(r5)
            int r13 = p129hc.C3010g.f12138e
            r14 = 2
            if (r12 != r13) goto L193
            int[] r2 = new int[r14]
            r2[r3] = r7
            r2[r11] = r4
            r4 = r2[r11]
            int r4 = r1.m14365f(r4)
            int r5 = r1.f27901Z
            int[] r6 = r0.f12140b
            java.util.Arrays.fill(r6, r3)
            java.lang.StringBuilder r7 = r0.f12139a
            r7.setLength(r3)
        L4e:
            p129hc.AbstractC3019p.m7421g(r1, r4, r6)
            int r8 = m7409j(r6)
            if (r8 < 0) goto L190
            r9 = 0
        L58:
            int[] r10 = p129hc.C3010g.f12137d
            int r12 = r10.length
            if (r9 >= r12) goto L18d
            r10 = r10[r9]
            if (r10 != r8) goto L187
            char[] r8 = p129hc.C3010g.f12136c
            char r8 = r8[r9]
            r7.append(r8)
            int r9 = r6.length
            r12 = r4
            r10 = 0
        L6b:
            if (r10 >= r9) goto L73
            r13 = r6[r10]
            int r12 = r12 + r13
            int r10 = r10 + 1
            goto L6b
        L73:
            int r9 = r1.m14365f(r12)
            r10 = 42
            if (r8 != r10) goto L182
            int r8 = r7.length()
            int r8 = r8 - r11
            r7.deleteCharAt(r8)
            int r8 = r6.length
            r10 = 0
            r12 = 0
        L86:
            if (r10 >= r8) goto L8e
            r13 = r6[r10]
            int r12 = r12 + r13
            int r10 = r10 + 1
            goto L86
        L8e:
            if (r9 == r5) goto L17f
            boolean r1 = r1.m14364e(r9)
            if (r1 == 0) goto L17f
            int r1 = r7.length()
            if (r1 < r14) goto L17c
            int r1 = r7.length()
            int r5 = r1 + (-2)
            r6 = 20
            m7408i(r7, r5, r6)
            int r1 = r1 + (-1)
            r5 = 15
            m7408i(r7, r1, r5)
            int r1 = r7.length()
            int r1 = r1 - r14
            r7.setLength(r1)
            int r1 = r7.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r6 = 0
        Lc0:
            if (r6 >= r1) goto L14f
            char r8 = r7.charAt(r6)
            r9 = 97
            if (r8 < r9) goto L149
            r9 = 100
            if (r8 > r9) goto L149
            int r9 = r1 + (-1)
            if (r6 >= r9) goto L144
            int r6 = r6 + 1
            char r9 = r7.charAt(r6)
            r10 = 79
            r13 = 90
            r15 = 65
            switch(r8) {
                case 97: goto L137;
                case 98: goto L101;
                case 99: goto Lf0;
                case 100: goto Le4;
                default: goto Le1;
            }
        Le1:
            r8 = 0
            goto L149
        Le4:
            if (r9 < r15) goto Leb
            if (r9 > r13) goto Leb
            int r9 = r9 + 32
            goto L13d
        Leb:
            sb.f r1 = sb.C6012f.m12491a()
            throw r1
        Lf0:
            if (r9 < r15) goto Lf7
            if (r9 > r10) goto Lf7
            int r9 = r9 + (-32)
            goto L13d
        Lf7:
            if (r9 != r13) goto Lfc
            r8 = 58
            goto L149
        Lfc:
            sb.f r1 = sb.C6012f.m12491a()
            throw r1
        L101:
            if (r9 < r15) goto L10a
            r8 = 69
            if (r9 > r8) goto L10a
            int r9 = r9 + (-38)
            goto L13d
        L10a:
            r8 = 70
            if (r9 < r8) goto L115
            r8 = 74
            if (r9 > r8) goto L115
            int r9 = r9 + (-11)
            goto L13d
        L115:
            r8 = 75
            if (r9 < r8) goto L11e
            if (r9 > r10) goto L11e
            int r9 = r9 + 16
            goto L13d
        L11e:
            r8 = 80
            if (r9 < r8) goto L129
            r8 = 83
            if (r9 > r8) goto L129
            int r9 = r9 + 43
            goto L13d
        L129:
            r8 = 84
            if (r9 < r8) goto L132
            if (r9 > r13) goto L132
            r8 = 127(0x7f, float:1.78E-43)
            goto L149
        L132:
            sb.f r1 = sb.C6012f.m12491a()
            throw r1
        L137:
            if (r9 < r15) goto L13f
            if (r9 > r13) goto L13f
            int r9 = r9 + (-64)
        L13d:
            char r8 = (char) r9
            goto L149
        L13f:
            sb.f r1 = sb.C6012f.m12491a()
            throw r1
        L144:
            sb.f r1 = sb.C6012f.m12491a()
            throw r1
        L149:
            r5.append(r8)
            int r6 = r6 + r11
            goto Lc0
        L14f:
            java.lang.String r1 = r5.toString()
            r5 = r2[r11]
            r2 = r2[r3]
            int r5 = r5 + r2
            float r2 = (float) r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            float r4 = (float) r4
            float r6 = (float) r12
            float r6 = r6 / r5
            float r6 = r6 + r4
            sb.o r4 = new sb.o
            r5 = 0
            sb.q[] r7 = new sb.C6023q[r14]
            sb.q r8 = new sb.q
            r12 = r17
            float r9 = (float) r12
            r8.<init>(r2, r9)
            r7[r3] = r8
            sb.q r2 = new sb.q
            r2.<init>(r6, r9)
            r7[r11] = r2
            sb.a r2 = sb.EnumC6007a.f23154b0
            r4.<init>(r1, r5, r7, r2)
            return r4
        L17c:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L17f:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L182:
            r12 = r17
            r4 = r9
            goto L4e
        L187:
            r12 = r17
            int r9 = r9 + 1
            goto L58
        L18d:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L190:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L193:
            r12 = r17
            r13 = r5[r3]
            r15 = r5[r11]
            int r13 = r13 + r15
            int r7 = r7 + r13
            int r13 = r6 + (-2)
            java.lang.System.arraycopy(r5, r14, r5, r3, r13)
            r5[r13] = r3
            r5[r10] = r3
            int r9 = r9 + (-1)
            goto L1ab
        L1a7:
            r12 = r17
            int r9 = r9 + 1
        L1ab:
            r5[r9] = r11
            r8 = r8 ^ 1
        L1af:
            int r4 = r4 + 1
            goto L16
        L1b3:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
    }
}

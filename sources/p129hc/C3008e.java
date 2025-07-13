package p129hc;

/* renamed from: hc.e */
/* loaded from: classes.dex */
public final class C3008e extends p129hc.AbstractC3019p {

    /* renamed from: d */
    public static final int[] f12131d = null;

    /* renamed from: e */
    public static final int f12132e = 0;

    /* renamed from: a */
    public final boolean f12133a;

    /* renamed from: b */
    public final java.lang.StringBuilder f12134b;

    /* renamed from: c */
    public final int[] f12135c;

    static {
            r0 = 44
            int[] r0 = new int[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42} // fill-array
            p129hc.C3008e.f12131d = r0
            r1 = 39
            r0 = r0[r1]
            p129hc.C3008e.f12132e = r0
            return
    }

    public C3008e(boolean r2) {
            r1 = this;
            r1.<init>()
            r1.f12133a = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r0 = 20
            r2.<init>(r0)
            r1.f12134b = r2
            r2 = 9
            int[] r2 = new int[r2]
            r1.f12135c = r2
            return
    }

    /* renamed from: i */
    public static int m7406i(int[] r10) {
            int r0 = r10.length
            r1 = 0
            r2 = 0
        L3:
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r4 = r10.length
            r5 = 0
        L8:
            if (r5 >= r4) goto L14
            r6 = r10[r5]
            if (r6 >= r3) goto L11
            if (r6 <= r2) goto L11
            r3 = r6
        L11:
            int r5 = r5 + 1
            goto L8
        L14:
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L18:
            if (r2 >= r0) goto L2b
            r7 = r10[r2]
            if (r7 <= r3) goto L28
            int r8 = r0 + (-1)
            int r8 = r8 - r2
            r9 = 1
            int r8 = r9 << r8
            r5 = r5 | r8
            int r4 = r4 + 1
            int r6 = r6 + r7
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = 3
            r7 = -1
            if (r4 != r2) goto L42
        L2f:
            if (r1 >= r0) goto L41
            if (r4 <= 0) goto L41
            r2 = r10[r1]
            if (r2 <= r3) goto L3e
            int r4 = r4 + (-1)
            int r2 = r2 << 1
            if (r2 < r6) goto L3e
            return r7
        L3e:
            int r1 = r1 + 1
            goto L2f
        L41:
            return r5
        L42:
            if (r4 > r2) goto L45
            return r7
        L45:
            r2 = r3
            goto L3
    }

    @Override // p129hc.AbstractC3019p
    /* renamed from: d */
    public sb.C6021o mo7401d(int r18, p453zb.C7269a r19, java.util.Map<sb.EnumC6009c, ?> r20) {
            r17 = this;
            r0 = r17
            r1 = r19
            int[] r2 = r0.f12135c
            r3 = 0
            java.util.Arrays.fill(r2, r3)
            java.lang.StringBuilder r4 = r0.f12134b
            r4.setLength(r3)
            int r5 = r1.f27901Z
            int r6 = r1.m14365f(r3)
            int r7 = r2.length
            r8 = r6
            r9 = 0
            r10 = 0
        L19:
            if (r6 >= r5) goto L13e
            boolean r11 = r1.m14364e(r6)
            r11 = r11 ^ r9
            r12 = 1
            if (r11 == 0) goto L2c
            r11 = r2[r10]
            int r11 = r11 + r12
            r2[r10] = r11
            r13 = r18
            goto L13a
        L2c:
            int r11 = r7 + (-1)
            if (r10 != r11) goto L132
            int r13 = m7406i(r2)
            int r14 = p129hc.C3008e.f12132e
            r15 = 2
            if (r13 != r14) goto L11d
            int r13 = r6 - r8
            int r13 = r13 / r15
            int r13 = r8 - r13
            int r13 = java.lang.Math.max(r3, r13)
            boolean r13 = r1.m14368k(r13, r8, r3)
            if (r13 == 0) goto L11d
            int[] r5 = new int[r15]
            r5[r3] = r8
            r5[r12] = r6
            r6 = r5[r12]
            int r6 = r1.m14365f(r6)
            int r7 = r1.f27901Z
        L56:
            p129hc.AbstractC3019p.m7421g(r1, r6, r2)
            int r8 = m7406i(r2)
            if (r8 < 0) goto L11a
            r9 = 0
        L60:
            int[] r10 = p129hc.C3008e.f12131d
            int r11 = r10.length
            if (r9 >= r11) goto L117
            r10 = r10[r9]
            if (r10 != r8) goto L111
            java.lang.String r8 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%"
            char r8 = r8.charAt(r9)
            r4.append(r8)
            int r9 = r2.length
            r11 = r6
            r10 = 0
        L75:
            if (r10 >= r9) goto L7d
            r13 = r2[r10]
            int r11 = r11 + r13
            int r10 = r10 + 1
            goto L75
        L7d:
            int r9 = r1.m14365f(r11)
            r10 = 42
            if (r8 != r10) goto L10c
            int r1 = r4.length()
            int r1 = r1 - r12
            r4.setLength(r1)
            int r1 = r2.length
            r8 = 0
            r10 = 0
        L90:
            if (r8 >= r1) goto L98
            r11 = r2[r8]
            int r10 = r10 + r11
            int r8 = r8 + 1
            goto L90
        L98:
            int r1 = r9 - r6
            int r1 = r1 - r10
            if (r9 == r7) goto La4
            int r1 = r1 << r12
            if (r1 < r10) goto La1
            goto La4
        La1:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        La4:
            boolean r1 = r0.f12133a
            if (r1 == 0) goto Ld6
            int r1 = r4.length()
            int r1 = r1 - r12
            r2 = 0
            r7 = 0
        Laf:
            java.lang.String r8 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%"
            if (r2 >= r1) goto Lc1
            java.lang.StringBuilder r9 = r0.f12134b
            char r9 = r9.charAt(r2)
            int r8 = r8.indexOf(r9)
            int r7 = r7 + r8
            int r2 = r2 + 1
            goto Laf
        Lc1:
            char r2 = r4.charAt(r1)
            int r7 = r7 % 43
            char r7 = r8.charAt(r7)
            if (r2 != r7) goto Ld1
            r4.setLength(r1)
            goto Ld6
        Ld1:
            sb.b r1 = sb.C6008b.m12490a()
            throw r1
        Ld6:
            int r1 = r4.length()
            if (r1 == 0) goto L109
            java.lang.String r1 = r4.toString()
            r2 = r5[r12]
            r4 = r5[r3]
            int r2 = r2 + r4
            float r2 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            float r5 = (float) r6
            float r6 = (float) r10
            float r6 = r6 / r4
            float r6 = r6 + r5
            sb.o r4 = new sb.o
            r5 = 0
            sb.q[] r7 = new sb.C6023q[r15]
            sb.q r8 = new sb.q
            r13 = r18
            float r9 = (float) r13
            r8.<init>(r2, r9)
            r7[r3] = r8
            sb.q r2 = new sb.q
            r2.<init>(r6, r9)
            r7[r12] = r2
            sb.a r2 = sb.EnumC6007a.f23153a0
            r4.<init>(r1, r5, r7, r2)
            return r4
        L109:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L10c:
            r13 = r18
            r6 = r9
            goto L56
        L111:
            r13 = r18
            int r9 = r9 + 1
            goto L60
        L117:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L11a:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L11d:
            r13 = r18
            r14 = r2[r3]
            r16 = r2[r12]
            int r14 = r14 + r16
            int r8 = r8 + r14
            int r14 = r7 + (-2)
            java.lang.System.arraycopy(r2, r15, r2, r3, r14)
            r2[r14] = r3
            r2[r11] = r3
            int r10 = r10 + (-1)
            goto L136
        L132:
            r13 = r18
            int r10 = r10 + 1
        L136:
            r2[r10] = r12
            r9 = r9 ^ 1
        L13a:
            int r6 = r6 + 1
            goto L19
        L13e:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
    }
}

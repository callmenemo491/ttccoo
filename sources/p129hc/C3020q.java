package p129hc;

/* renamed from: hc.q */
/* loaded from: classes.dex */
public final class C3020q {

    /* renamed from: c */
    public static final int[] f12155c = null;

    /* renamed from: a */
    public final int[] f12156a;

    /* renamed from: b */
    public final java.lang.StringBuilder f12157b;

    static {
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [24, 20, 18, 17, 12, 6, 3, 10, 9, 5} // fill-array
            p129hc.C3020q.f12155c = r0
            return
    }

    public C3020q() {
            r1 = this;
            r1.<init>()
            r0 = 4
            int[] r0 = new int[r0]
            r1.f12156a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.f12157b = r0
            return
    }

    /* renamed from: a */
    public sb.C6021o m7424a(int r17, p453zb.C7269a r18, int[] r19) {
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.StringBuilder r2 = r0.f12157b
            r3 = 0
            r2.setLength(r3)
            int[] r4 = r0.f12156a
            r4[r3] = r3
            r5 = 1
            r4[r5] = r3
            r6 = 2
            r4[r6] = r3
            r7 = 3
            r4[r7] = r3
            int r7 = r1.f27901Z
            r8 = r19[r5]
            r9 = 0
            r10 = 0
        L1d:
            r11 = 48
            r12 = 5
            r13 = 10
            if (r9 >= r12) goto L52
            if (r8 >= r7) goto L52
            int[][] r12 = p129hc.AbstractC3022s.f12165h
            int r12 = p129hc.AbstractC3022s.m7427k(r1, r4, r8, r12)
            int r14 = r12 % 10
            int r14 = r14 + r11
            char r11 = (char) r14
            r2.append(r11)
            int r11 = r4.length
            r14 = 0
        L35:
            if (r14 >= r11) goto L3d
            r15 = r4[r14]
            int r8 = r8 + r15
            int r14 = r14 + 1
            goto L35
        L3d:
            if (r12 < r13) goto L44
            int r11 = 4 - r9
            int r11 = r5 << r11
            r10 = r10 | r11
        L44:
            r11 = 4
            if (r9 == r11) goto L4f
            int r8 = r1.m14365f(r8)
            int r8 = r1.m14366g(r8)
        L4f:
            int r9 = r9 + 1
            goto L1d
        L52:
            int r1 = r2.length()
            if (r1 != r12) goto L14b
            r1 = 0
        L59:
            if (r1 >= r13) goto L148
            int[] r4 = p129hc.C3020q.f12155c
            r4 = r4[r1]
            if (r10 != r4) goto L142
            java.lang.String r4 = r2.toString()
            int r7 = r4.length()
            int r9 = r7 + (-2)
            r10 = 0
        L6c:
            if (r9 < 0) goto L78
            char r14 = r4.charAt(r9)
            int r14 = r14 + (-48)
            int r10 = r10 + r14
            int r9 = r9 + (-2)
            goto L6c
        L78:
            int r10 = r10 * 3
            int r7 = r7 + (-1)
        L7c:
            if (r7 < 0) goto L88
            char r9 = r4.charAt(r7)
            int r9 = r9 + (-48)
            int r10 = r10 + r9
            int r7 = r7 + (-2)
            goto L7c
        L88:
            int r10 = r10 * 3
            int r10 = r10 % r13
            if (r10 != r1) goto L13f
            java.lang.String r1 = r2.toString()
            int r2 = r1.length()
            r4 = 0
            if (r2 == r12) goto L9a
            goto L107
        L9a:
            char r2 = r1.charAt(r3)
            if (r2 == r11) goto Lcf
            r7 = 53
            if (r2 == r7) goto Lcc
            r7 = 57
            if (r2 == r7) goto La9
            goto Lc9
        La9:
            java.lang.String r2 = "90000"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Lb3
            r2 = r4
            goto L105
        Lb3:
            java.lang.String r2 = "99991"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Lbe
            java.lang.String r2 = "0.00"
            goto L105
        Lbe:
            java.lang.String r2 = "99990"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Lc9
            java.lang.String r2 = "Used"
            goto L105
        Lc9:
            java.lang.String r2 = ""
            goto Ld1
        Lcc:
            java.lang.String r2 = "$"
            goto Ld1
        Lcf:
            java.lang.String r2 = "\u00a3"
        Ld1:
            java.lang.String r7 = r1.substring(r5)
            int r7 = java.lang.Integer.parseInt(r7)
            int r9 = r7 / 100
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r7 = r7 % 100
            if (r7 >= r13) goto Lea
            java.lang.String r10 = "0"
            java.lang.String r7 = p422y.C7094d.m14209a(r10, r7)
            goto Lee
        Lea:
            java.lang.String r7 = java.lang.String.valueOf(r7)
        Lee:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r9)
            r2 = 46
            r10.append(r2)
            r10.append(r7)
            java.lang.String r2 = r10.toString()
        L105:
            if (r2 != 0) goto L109
        L107:
            r7 = r4
            goto L115
        L109:
            java.util.EnumMap r7 = new java.util.EnumMap
            java.lang.Class<sb.p> r9 = sb.EnumC6022p.class
            r7.<init>(r9)
            sb.p r9 = sb.EnumC6022p.f23215c0
            r7.put(r9, r2)
        L115:
            sb.o r2 = new sb.o
            sb.q[] r6 = new sb.C6023q[r6]
            sb.q r9 = new sb.q
            r10 = r19[r3]
            r11 = r19[r5]
            int r10 = r10 + r11
            float r10 = (float) r10
            r11 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r11
            r14 = r17
            float r11 = (float) r14
            r9.<init>(r10, r11)
            r6[r3] = r9
            sb.q r3 = new sb.q
            float r8 = (float) r8
            r3.<init>(r8, r11)
            r6[r5] = r3
            sb.a r3 = sb.EnumC6007a.f23167o0
            r2.<init>(r1, r4, r6, r3)
            if (r7 == 0) goto L13e
            r2.m12499a(r7)
        L13e:
            return r2
        L13f:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L142:
            r14 = r17
            int r1 = r1 + 1
            goto L59
        L148:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L14b:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
    }
}

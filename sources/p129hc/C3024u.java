package p129hc;

/* renamed from: hc.u */
/* loaded from: classes.dex */
public final class C3024u extends p129hc.AbstractC3022s {

    /* renamed from: j */
    public static final int[] f12169j = null;

    /* renamed from: k */
    public static final int[] f12170k = null;

    /* renamed from: l */
    public static final int[][] f12171l = null;

    /* renamed from: i */
    public final int[] f12172i;

    static {
            r0 = 10
            int[] r1 = new int[r0]
            r1 = {x0028: FILL_ARRAY_DATA , data: [56, 52, 50, 49, 44, 38, 35, 42, 41, 37} // fill-array
            p129hc.C3024u.f12169j = r1
            r1 = 6
            int[] r1 = new int[r1]
            r1 = {x0040: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 1, 1} // fill-array
            p129hc.C3024u.f12170k = r1
            r1 = 2
            int[][] r1 = new int[r1][]
            int[] r2 = new int[r0]
            r2 = {x0050: FILL_ARRAY_DATA , data: [56, 52, 50, 49, 44, 38, 35, 42, 41, 37} // fill-array
            r3 = 0
            r1[r3] = r2
            int[] r0 = new int[r0]
            r0 = {x0068: FILL_ARRAY_DATA , data: [7, 11, 13, 14, 19, 25, 28, 21, 22, 26} // fill-array
            r2 = 1
            r1[r2] = r0
            p129hc.C3024u.f12171l = r1
            return
    }

    public C3024u() {
            r1 = this;
            r1.<init>()
            r0 = 4
            int[] r0 = new int[r0]
            r1.f12172i = r0
            return
    }

    @Override // p129hc.AbstractC3022s
    /* renamed from: i */
    public boolean mo7430i(java.lang.String r11) {
            r10 = this;
            r0 = 6
            char[] r0 = new char[r0]
            r1 = 1
            r2 = 7
            r3 = 0
            r11.getChars(r1, r2, r0, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = 12
            r1.<init>(r4)
            char r4 = r11.charAt(r3)
            r1.append(r4)
            r4 = 5
            char r5 = r0[r4]
            java.lang.String r6 = "00000"
            java.lang.String r7 = "0000"
            r8 = 3
            r9 = 2
            switch(r5) {
                case 48: goto L44;
                case 49: goto L44;
                case 50: goto L44;
                case 51: goto L3a;
                case 52: goto L2d;
                default: goto L23;
            }
        L23:
            r1.append(r0, r3, r4)
            r1.append(r7)
            r1.append(r5)
            goto L50
        L2d:
            r4 = 4
            r1.append(r0, r3, r4)
            r1.append(r6)
            char r0 = r0[r4]
            r1.append(r0)
            goto L50
        L3a:
            r1.append(r0, r3, r8)
            r1.append(r6)
            r1.append(r0, r8, r9)
            goto L50
        L44:
            r1.append(r0, r3, r9)
            r1.append(r5)
            r1.append(r7)
            r1.append(r0, r9, r8)
        L50:
            char r11 = r11.charAt(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            boolean r11 = p129hc.AbstractC3022s.m7426j(r11)
            return r11
    }

    @Override // p129hc.AbstractC3022s
    /* renamed from: l */
    public int[] mo7431l(p453zb.C7269a r4, int r5) {
            r3 = this;
            int[] r0 = p129hc.C3024u.f12170k
            int r1 = r0.length
            int[] r1 = new int[r1]
            r2 = 1
            int[] r4 = p129hc.AbstractC3022s.m7428o(r4, r5, r2, r0, r1)
            return r4
    }

    @Override // p129hc.AbstractC3022s
    /* renamed from: m */
    public int mo7413m(p453zb.C7269a r12, int[] r13, java.lang.StringBuilder r14) {
            r11 = this;
            int[] r0 = r11.f12172i
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r3 = 2
            r0[r3] = r1
            r3 = 3
            r0[r3] = r1
            int r3 = r12.f27901Z
            r13 = r13[r2]
            r4 = 0
            r5 = 0
        L14:
            r6 = 6
            r7 = 10
            if (r4 >= r6) goto L3d
            if (r13 >= r3) goto L3d
            int[][] r6 = p129hc.AbstractC3022s.f12165h
            int r6 = p129hc.AbstractC3022s.m7427k(r12, r0, r13, r6)
            int r8 = r6 % 10
            int r8 = r8 + 48
            char r8 = (char) r8
            r14.append(r8)
            int r8 = r0.length
            r9 = 0
        L2b:
            if (r9 >= r8) goto L33
            r10 = r0[r9]
            int r13 = r13 + r10
            int r9 = r9 + 1
            goto L2b
        L33:
            if (r6 < r7) goto L3a
            int r6 = 5 - r4
            int r6 = r2 << r6
            r5 = r5 | r6
        L3a:
            int r4 = r4 + 1
            goto L14
        L3d:
            r12 = 0
        L3e:
            if (r12 > r2) goto L5e
            r0 = 0
        L41:
            if (r0 >= r7) goto L5b
            int[][] r3 = p129hc.C3024u.f12171l
            r3 = r3[r12]
            r3 = r3[r0]
            if (r5 != r3) goto L58
            int r12 = r12 + 48
            char r12 = (char) r12
            r14.insert(r1, r12)
            int r0 = r0 + 48
            char r12 = (char) r0
            r14.append(r12)
            return r13
        L58:
            int r0 = r0 + 1
            goto L41
        L5b:
            int r12 = r12 + 1
            goto L3e
        L5e:
            sb.k r12 = sb.C6017k.f23200a0
            throw r12
    }

    @Override // p129hc.AbstractC3022s
    /* renamed from: q */
    public sb.EnumC6007a mo7414q() {
            r1 = this;
            sb.a r0 = sb.EnumC6007a.f23166n0
            return r0
    }
}

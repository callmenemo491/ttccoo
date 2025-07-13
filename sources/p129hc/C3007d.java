package p129hc;

/* renamed from: hc.d */
/* loaded from: classes.dex */
public final class C3007d extends p333t1.AbstractC6102f {
    public C3007d() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    /* renamed from: g */
    public static int m7405g(java.lang.CharSequence r5, int r6) {
            int r0 = r5.length()
            r1 = 1
            if (r6 < r0) goto L8
            return r1
        L8:
            char r2 = r5.charAt(r6)
            r3 = 241(0xf1, float:3.38E-43)
            if (r2 != r3) goto L12
            r5 = 4
            return r5
        L12:
            r3 = 48
            if (r2 < r3) goto L2b
            r4 = 57
            if (r2 <= r4) goto L1b
            goto L2b
        L1b:
            int r6 = r6 + r1
            r1 = 2
            if (r6 < r0) goto L20
            return r1
        L20:
            char r5 = r5.charAt(r6)
            if (r5 < r3) goto L2b
            if (r5 <= r4) goto L29
            goto L2b
        L29:
            r5 = 3
            return r5
        L2b:
            return r1
    }

    @Override // p333t1.AbstractC6102f
    /* renamed from: b */
    public boolean[] mo7404b(java.lang.String r15) {
            r14 = this;
            int r0 = r15.length()
            if (r0 <= 0) goto L118
            r1 = 80
            if (r0 > r1) goto L118
            r1 = 0
            r2 = 0
        Lc:
            r3 = 32
            if (r2 >= r0) goto L34
            char r4 = r15.charAt(r2)
            if (r4 < r3) goto L1a
            r3 = 126(0x7e, float:1.77E-43)
            if (r4 <= r3) goto L31
        L1a:
            switch(r4) {
                case 241: goto L31;
                case 242: goto L31;
                case 243: goto L31;
                case 244: goto L31;
                default: goto L1d;
            }
        L1d:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bad character in input: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L31:
            int r2 = r2 + 1
            goto Lc
        L34:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
        L3e:
            if (r4 >= r0) goto Ld4
            int r8 = m7405g(r15, r4)
            r9 = 100
            if (r8 == r3) goto L89
            r10 = 2
            if (r8 != r10) goto L4c
            goto L89
        L4c:
            r11 = 99
            if (r6 != r11) goto L51
            goto L7c
        L51:
            r12 = 3
            r13 = 4
            if (r6 != r9) goto L7e
            if (r8 != r13) goto L58
            goto L7c
        L58:
            int r8 = r4 + 2
            int r8 = m7405g(r15, r8)
            if (r8 == r3) goto L7c
            if (r8 != r10) goto L63
            goto L7c
        L63:
            if (r8 != r13) goto L6e
            int r8 = r4 + 3
            int r8 = m7405g(r15, r8)
            if (r8 != r12) goto L89
            goto L8b
        L6e:
            int r8 = r4 + 4
        L70:
            int r13 = m7405g(r15, r8)
            if (r13 != r12) goto L79
            int r8 = r8 + 2
            goto L70
        L79:
            if (r13 != r10) goto L8b
            goto L89
        L7c:
            r11 = r6
            goto L8b
        L7e:
            if (r8 != r13) goto L86
            int r8 = r4 + 1
            int r8 = m7405g(r15, r8)
        L86:
            if (r8 != r12) goto L89
            goto L8b
        L89:
            r11 = 100
        L8b:
            if (r11 != r6) goto Lb4
            char r8 = r15.charAt(r4)
            switch(r8) {
                case 241: goto La3;
                case 242: goto La0;
                case 243: goto L9d;
                case 244: goto Lb2;
                default: goto L94;
            }
        L94:
            if (r6 != r9) goto La6
            char r8 = r15.charAt(r4)
            int r9 = r8 + (-32)
            goto Lb2
        L9d:
            r9 = 96
            goto Lb2
        La0:
            r9 = 97
            goto Lb2
        La3:
            r9 = 102(0x66, float:1.43E-43)
            goto Lb2
        La6:
            int r8 = r4 + 2
            java.lang.String r8 = r15.substring(r4, r8)
            int r9 = java.lang.Integer.parseInt(r8)
            int r4 = r4 + 1
        Lb2:
            int r4 = r4 + r3
            goto Lc4
        Lb4:
            if (r6 != 0) goto Lc2
            if (r11 != r9) goto Lbd
            r6 = 104(0x68, float:1.46E-43)
            r9 = 104(0x68, float:1.46E-43)
            goto Lc3
        Lbd:
            r6 = 105(0x69, float:1.47E-43)
            r9 = 105(0x69, float:1.47E-43)
            goto Lc3
        Lc2:
            r9 = r11
        Lc3:
            r6 = r11
        Lc4:
            int[][] r8 = p129hc.C3006c.f12130a
            r8 = r8[r9]
            r2.add(r8)
            int r9 = r9 * r7
            int r5 = r5 + r9
            if (r4 == 0) goto L3e
            int r7 = r7 + 1
            goto L3e
        Ld4:
            int r5 = r5 % 103
            int[][] r15 = p129hc.C3006c.f12130a
            r0 = r15[r5]
            r2.add(r0)
            r0 = 106(0x6a, float:1.49E-43)
            r15 = r15[r0]
            r2.add(r15)
            java.util.Iterator r15 = r2.iterator()
            r0 = 0
        Le9:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto Lff
            java.lang.Object r4 = r15.next()
            int[] r4 = (int[]) r4
            int r5 = r4.length
            r6 = 0
        Lf7:
            if (r6 >= r5) goto Le9
            r7 = r4[r6]
            int r0 = r0 + r7
            int r6 = r6 + 1
            goto Lf7
        Lff:
            boolean[] r15 = new boolean[r0]
            java.util.Iterator r0 = r2.iterator()
        L105:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L117
            java.lang.Object r2 = r0.next()
            int[] r2 = (int[]) r2
            int r2 = p333t1.AbstractC6102f.m12600a(r15, r1, r2, r3)
            int r1 = r1 + r2
            goto L105
        L117:
            return r15
        L118:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Contents length should be between 1 and 80 characters, but got "
            java.lang.String r0 = p422y.C7094d.m14209a(r1, r0)
            r15.<init>(r0)
            throw r15
    }

    @Override // p333t1.AbstractC6102f, sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r2, sb.EnumC6007a r3, int r4, int r5, java.util.Map<sb.EnumC6011e, ?> r6) {
            r1 = this;
            sb.a r0 = sb.EnumC6007a.f23155c0
            if (r3 != r0) goto L9
            zb.b r2 = super.mo7086d(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can only encode CODE_128, but got "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }
}

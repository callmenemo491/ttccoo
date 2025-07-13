package p129hc;

/* renamed from: hc.j */
/* loaded from: classes.dex */
public final class C3013j extends p129hc.AbstractC3023t {

    /* renamed from: Y */
    public final /* synthetic */ int f12143Y;

    public C3013j(int r1) {
            r0 = this;
            r0.f12143Y = r1
            r0.<init>()
            return
    }

    @Override // p333t1.AbstractC6102f
    /* renamed from: b */
    public boolean[] mo7404b(java.lang.String r11) {
            r10 = this;
            int r0 = r10.f12143Y
            r1 = 6
            r2 = 1
            r3 = 7
            r4 = 0
            switch(r0) {
                case 0: goto Lb;
                default: goto L9;
            }
        L9:
            goto L9f
        Lb:
            int r0 = r11.length()
            r5 = 13
            if (r0 != r5) goto L87
            boolean r0 = p129hc.AbstractC3022s.m7426j(r11)     // Catch: sb.C6012f -> L7f
            if (r0 == 0) goto L77
            java.lang.String r0 = r11.substring(r4, r2)
            int r0 = java.lang.Integer.parseInt(r0)
            int[] r5 = p129hc.C3012i.f12141j
            r0 = r5[r0]
            r5 = 95
            boolean[] r5 = new boolean[r5]
            int[] r6 = p129hc.AbstractC3022s.f12161d
            int r6 = p333t1.AbstractC6102f.m12600a(r5, r4, r6, r2)
            int r6 = r6 + r4
            r7 = 1
        L31:
            if (r7 > r1) goto L51
            int r8 = r7 + 1
            java.lang.String r9 = r11.substring(r7, r8)
            int r9 = java.lang.Integer.parseInt(r9)
            int r7 = 6 - r7
            int r7 = r0 >> r7
            r7 = r7 & r2
            if (r7 != r2) goto L46
            int r9 = r9 + 10
        L46:
            int[][] r7 = p129hc.AbstractC3022s.f12165h
            r7 = r7[r9]
            int r7 = p333t1.AbstractC6102f.m12600a(r5, r6, r7, r4)
            int r6 = r6 + r7
            r7 = r8
            goto L31
        L51:
            int[] r0 = p129hc.AbstractC3022s.f12162e
            int r0 = p333t1.AbstractC6102f.m12600a(r5, r6, r0, r4)
            int r0 = r0 + r6
        L58:
            r1 = 12
            if (r3 > r1) goto L71
            int r1 = r3 + 1
            java.lang.String r3 = r11.substring(r3, r1)
            int r3 = java.lang.Integer.parseInt(r3)
            int[][] r4 = p129hc.AbstractC3022s.f12164g
            r3 = r4[r3]
            int r3 = p333t1.AbstractC6102f.m12600a(r5, r0, r3, r2)
            int r0 = r0 + r3
            r3 = r1
            goto L58
        L71:
            int[] r11 = p129hc.AbstractC3022s.f12161d
            p333t1.AbstractC6102f.m12600a(r5, r0, r11, r2)
            return r5
        L77:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: sb.C6012f -> L7f
            java.lang.String r0 = "Contents do not pass checksum"
            r11.<init>(r0)     // Catch: sb.C6012f -> L7f
            throw r11     // Catch: sb.C6012f -> L7f
        L7f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Illegal contents"
            r11.<init>(r0)
            throw r11
        L87:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested contents should be 13 digits long, but got "
            r1.<init>(r2)
            int r11 = r11.length()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L9f:
            int r0 = r11.length()
            r5 = 8
            if (r0 != r5) goto Le5
            java.lang.String r0 = r11.substring(r3, r5)
            int r0 = java.lang.Integer.parseInt(r0)
            int[] r3 = p129hc.C3024u.f12169j
            r0 = r3[r0]
            r3 = 51
            boolean[] r3 = new boolean[r3]
            int[] r5 = p129hc.AbstractC3022s.f12161d
            int r5 = p333t1.AbstractC6102f.m12600a(r3, r4, r5, r2)
            int r5 = r5 + r4
            r6 = 1
        Lbf:
            if (r6 > r1) goto Ldf
            int r7 = r6 + 1
            java.lang.String r8 = r11.substring(r6, r7)
            int r8 = java.lang.Integer.parseInt(r8)
            int r6 = 6 - r6
            int r6 = r0 >> r6
            r6 = r6 & r2
            if (r6 != r2) goto Ld4
            int r8 = r8 + 10
        Ld4:
            int[][] r6 = p129hc.AbstractC3022s.f12165h
            r6 = r6[r8]
            int r6 = p333t1.AbstractC6102f.m12600a(r3, r5, r6, r4)
            int r5 = r5 + r6
            r6 = r7
            goto Lbf
        Ldf:
            int[] r11 = p129hc.AbstractC3022s.f12163f
            p333t1.AbstractC6102f.m12600a(r3, r5, r11, r4)
            return r3
        Le5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested contents should be 8 digits long, but got "
            r1.<init>(r2)
            int r11 = r11.length()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
    }

    @Override // p333t1.AbstractC6102f, sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r2, sb.EnumC6007a r3, int r4, int r5, java.util.Map r6) {
            r1 = this;
            int r0 = r1.f12143Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L23
        L6:
            sb.a r0 = sb.EnumC6007a.f23158f0
            if (r3 != r0) goto Lf
            zb.b r2 = super.mo7086d(r2, r3, r4, r5, r6)
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can only encode EAN_13, but got "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L23:
            sb.a r0 = sb.EnumC6007a.f23166n0
            if (r3 != r0) goto L2c
            zb.b r2 = super.mo7086d(r2, r3, r4, r5, r6)
            return r2
        L2c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can only encode UPC_E, but got "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }
}

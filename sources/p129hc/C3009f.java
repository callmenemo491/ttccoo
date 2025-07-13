package p129hc;

/* renamed from: hc.f */
/* loaded from: classes.dex */
public final class C3009f extends p333t1.AbstractC6102f {
    public C3009f() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    /* renamed from: g */
    public static void m7407g(int r3, int[] r4) {
            r0 = 0
        L1:
            r1 = 9
            if (r0 >= r1) goto L14
            int r1 = 8 - r0
            r2 = 1
            int r1 = r2 << r1
            r1 = r1 & r3
            if (r1 != 0) goto Le
            goto Lf
        Le:
            r2 = 2
        Lf:
            r4[r0] = r2
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }

    @Override // p333t1.AbstractC6102f
    /* renamed from: b */
    public boolean[] mo7404b(java.lang.String r12) {
            r11 = this;
            int r0 = r12.length()
            r1 = 80
            if (r0 > r1) goto L82
            r1 = 9
            int[] r2 = new int[r1]
            int r3 = r0 + 25
            r4 = 0
            r5 = 0
        L10:
            java.lang.String r6 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%"
            if (r5 >= r0) goto L45
            char r7 = r12.charAt(r5)
            int r6 = r6.indexOf(r7)
            if (r6 < 0) goto L31
            int[] r7 = p129hc.C3008e.f12131d
            r6 = r7[r6]
            m7407g(r6, r2)
            r6 = 0
        L26:
            if (r6 >= r1) goto L2e
            r7 = r2[r6]
            int r3 = r3 + r7
            int r6 = r6 + 1
            goto L26
        L2e:
            int r5 = r5 + 1
            goto L10
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Bad contents: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L45:
            boolean[] r1 = new boolean[r3]
            int r3 = p129hc.C3008e.f12132e
            m7407g(r3, r2)
            r3 = 1
            int r5 = p333t1.AbstractC6102f.m12600a(r1, r4, r2, r3)
            int[] r7 = new int[r3]
            r7[r4] = r3
            int r8 = p333t1.AbstractC6102f.m12600a(r1, r5, r7, r4)
            int r8 = r8 + r5
            r5 = 0
        L5b:
            if (r5 >= r0) goto L79
            char r9 = r12.charAt(r5)
            int r9 = r6.indexOf(r9)
            int[] r10 = p129hc.C3008e.f12131d
            r9 = r10[r9]
            m7407g(r9, r2)
            int r9 = p333t1.AbstractC6102f.m12600a(r1, r8, r2, r3)
            int r9 = r9 + r8
            int r8 = p333t1.AbstractC6102f.m12600a(r1, r9, r7, r4)
            int r8 = r8 + r9
            int r5 = r5 + 1
            goto L5b
        L79:
            int r12 = p129hc.C3008e.f12132e
            m7407g(r12, r2)
            p333t1.AbstractC6102f.m12600a(r1, r8, r2, r3)
            return r1
        L82:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Requested contents should be less than 80 digits long, but got "
            java.lang.String r0 = p422y.C7094d.m14209a(r1, r0)
            r12.<init>(r0)
            throw r12
    }

    @Override // p333t1.AbstractC6102f, sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r2, sb.EnumC6007a r3, int r4, int r5, java.util.Map<sb.EnumC6011e, ?> r6) {
            r1 = this;
            sb.a r0 = sb.EnumC6007a.f23153a0
            if (r3 != r0) goto L9
            zb.b r2 = super.mo7086d(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can only encode CODE_39, but got "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }
}

package p129hc;

/* renamed from: hc.n */
/* loaded from: classes.dex */
public final class C3017n extends p333t1.AbstractC6102f {

    /* renamed from: Y */
    public static final int[] f12151Y = null;

    /* renamed from: Z */
    public static final int[] f12152Z = null;

    static {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [1, 1, 1, 1} // fill-array
            p129hc.C3017n.f12151Y = r0
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x001e: FILL_ARRAY_DATA , data: [3, 1, 1} // fill-array
            p129hc.C3017n.f12152Z = r0
            return
    }

    public C3017n() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // p333t1.AbstractC6102f
    /* renamed from: b */
    public boolean[] mo7404b(java.lang.String r13) {
            r12 = this;
            int r0 = r13.length()
            int r1 = r0 % 2
            if (r1 != 0) goto L66
            r1 = 80
            if (r0 > r1) goto L5a
            int r1 = r0 * 9
            int r1 = r1 + 9
            boolean[] r1 = new boolean[r1]
            int[] r2 = p129hc.C3017n.f12151Y
            r3 = 0
            r4 = 1
            int r2 = p333t1.AbstractC6102f.m12600a(r1, r3, r2, r4)
        L1a:
            if (r3 >= r0) goto L54
            char r5 = r13.charAt(r3)
            r6 = 10
            int r5 = java.lang.Character.digit(r5, r6)
            int r7 = r3 + 1
            char r7 = r13.charAt(r7)
            int r6 = java.lang.Character.digit(r7, r6)
            r7 = 18
            int[] r7 = new int[r7]
            r8 = 0
        L35:
            r9 = 5
            if (r8 >= r9) goto L4c
            int r9 = r8 * 2
            int[][] r10 = p129hc.C3016m.f12149e
            r11 = r10[r5]
            r11 = r11[r8]
            r7[r9] = r11
            int r9 = r9 + r4
            r10 = r10[r6]
            r10 = r10[r8]
            r7[r9] = r10
            int r8 = r8 + 1
            goto L35
        L4c:
            int r5 = p333t1.AbstractC6102f.m12600a(r1, r2, r7, r4)
            int r2 = r2 + r5
            int r3 = r3 + 2
            goto L1a
        L54:
            int[] r13 = p129hc.C3017n.f12152Z
            p333t1.AbstractC6102f.m12600a(r1, r2, r13, r4)
            return r1
        L5a:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Requested contents should be less than 80 digits long, but got "
            java.lang.String r0 = p422y.C7094d.m14209a(r1, r0)
            r13.<init>(r0)
            throw r13
        L66:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The length of the input should be even"
            r13.<init>(r0)
            throw r13
    }

    @Override // p333t1.AbstractC6102f, sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r2, sb.EnumC6007a r3, int r4, int r5, java.util.Map<sb.EnumC6011e, ?> r6) {
            r1 = this;
            sb.a r0 = sb.EnumC6007a.f23159g0
            if (r3 != r0) goto L9
            zb.b r2 = super.mo7086d(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can only encode ITF, but got "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }
}

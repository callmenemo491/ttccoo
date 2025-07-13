package p129hc;

/* renamed from: hc.h */
/* loaded from: classes.dex */
public class C3011h extends p333t1.AbstractC6102f {
    public C3011h() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    /* renamed from: g */
    public static int m7410g(boolean[] r5, int r6, int[] r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L14
            r3 = r7[r2]
            int r4 = r6 + 1
            if (r3 == 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            r5[r6] = r3
            int r2 = r2 + 1
            r6 = r4
            goto L3
        L14:
            r5 = 9
            return r5
    }

    /* renamed from: h */
    public static int m7411h(java.lang.String r6, int r7) {
            int r0 = r6.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 1
        L8:
            if (r0 < 0) goto L1e
            char r4 = r6.charAt(r0)
            java.lang.String r5 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*"
            int r4 = r5.indexOf(r4)
            int r4 = r4 * r3
            int r2 = r2 + r4
            int r3 = r3 + r1
            if (r3 <= r7) goto L1b
            r3 = 1
        L1b:
            int r0 = r0 + (-1)
            goto L8
        L1e:
            int r2 = r2 % 47
            return r2
    }

    /* renamed from: i */
    public static void m7412i(int r4, int[] r5) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 9
            if (r1 >= r2) goto L14
            int r2 = 8 - r1
            r3 = 1
            int r2 = r3 << r2
            r2 = r2 & r4
            if (r2 != 0) goto Lf
            r3 = 0
        Lf:
            r5[r1] = r3
            int r1 = r1 + 1
            goto L2
        L14:
            return
    }

    @Override // p333t1.AbstractC6102f
    /* renamed from: b */
    public boolean[] mo7404b(java.lang.String r11) {
            r10 = this;
            int r0 = r11.length()
            r1 = 80
            if (r0 > r1) goto L7f
            r1 = 9
            int[] r2 = new int[r1]
            int r3 = r11.length()
            int r3 = r3 + 2
            int r3 = r3 + 2
            int r3 = r3 * 9
            r4 = 1
            int r3 = r3 + r4
            boolean[] r3 = new boolean[r3]
            int[] r5 = p129hc.C3010g.f12137d
            r6 = 47
            r5 = r5[r6]
            m7412i(r5, r2)
            r5 = 0
            m7410g(r3, r5, r2)
            r7 = 9
        L29:
            java.lang.String r8 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*"
            if (r5 >= r0) goto L44
            char r9 = r11.charAt(r5)
            int r8 = r8.indexOf(r9)
            int[] r9 = p129hc.C3010g.f12137d
            r8 = r9[r8]
            m7412i(r8, r2)
            m7410g(r3, r7, r2)
            int r7 = r7 + 9
            int r5 = r5 + 1
            goto L29
        L44:
            r0 = 20
            int r0 = m7411h(r11, r0)
            int[] r5 = p129hc.C3010g.f12137d
            r9 = r5[r0]
            m7412i(r9, r2)
            m7410g(r3, r7, r2)
            int r7 = r7 + r1
            java.lang.StringBuilder r11 = android.support.v4.media.C0144c.m256a(r11)
            char r0 = r8.charAt(r0)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r0 = 15
            int r11 = m7411h(r11, r0)
            r11 = r5[r11]
            m7412i(r11, r2)
            m7410g(r3, r7, r2)
            int r7 = r7 + r1
            r11 = r5[r6]
            m7412i(r11, r2)
            m7410g(r3, r7, r2)
            int r7 = r7 + r1
            r3[r7] = r4
            return r3
        L7f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Requested contents should be less than 80 digits long, but got "
            java.lang.String r0 = p422y.C7094d.m14209a(r1, r0)
            r11.<init>(r0)
            throw r11
    }

    @Override // p333t1.AbstractC6102f, sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r2, sb.EnumC6007a r3, int r4, int r5, java.util.Map<sb.EnumC6011e, ?> r6) {
            r1 = this;
            sb.a r0 = sb.EnumC6007a.f23154b0
            if (r3 != r0) goto L9
            zb.b r2 = super.mo7086d(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can only encode CODE_93, but got "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }
}

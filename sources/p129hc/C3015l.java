package p129hc;

/* renamed from: hc.l */
/* loaded from: classes.dex */
public final class C3015l extends p129hc.AbstractC3023t {
    public C3015l() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p333t1.AbstractC6102f
    /* renamed from: b */
    public boolean[] mo7404b(java.lang.String r8) {
            r7 = this;
            int r0 = r8.length()
            r1 = 8
            if (r0 != r1) goto L54
            r0 = 67
            boolean[] r0 = new boolean[r0]
            int[] r1 = p129hc.AbstractC3022s.f12161d
            r2 = 0
            r3 = 1
            int r1 = p333t1.AbstractC6102f.m12600a(r0, r2, r1, r3)
            int r1 = r1 + r2
            r4 = 0
        L16:
            r5 = 3
            if (r4 > r5) goto L2e
            int r5 = r4 + 1
            java.lang.String r4 = r8.substring(r4, r5)
            int r4 = java.lang.Integer.parseInt(r4)
            int[][] r6 = p129hc.AbstractC3022s.f12164g
            r4 = r6[r4]
            int r4 = p333t1.AbstractC6102f.m12600a(r0, r1, r4, r2)
            int r1 = r1 + r4
            r4 = r5
            goto L16
        L2e:
            int[] r4 = p129hc.AbstractC3022s.f12162e
            int r2 = p333t1.AbstractC6102f.m12600a(r0, r1, r4, r2)
            int r2 = r2 + r1
            r1 = 4
        L36:
            r4 = 7
            if (r1 > r4) goto L4e
            int r4 = r1 + 1
            java.lang.String r1 = r8.substring(r1, r4)
            int r1 = java.lang.Integer.parseInt(r1)
            int[][] r5 = p129hc.AbstractC3022s.f12164g
            r1 = r5[r1]
            int r1 = p333t1.AbstractC6102f.m12600a(r0, r2, r1, r3)
            int r2 = r2 + r1
            r1 = r4
            goto L36
        L4e:
            int[] r8 = p129hc.AbstractC3022s.f12161d
            p333t1.AbstractC6102f.m12600a(r0, r2, r8, r3)
            return r0
        L54:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested contents should be 8 digits long, but got "
            r1.<init>(r2)
            int r8 = r8.length()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    @Override // p333t1.AbstractC6102f, sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r2, sb.EnumC6007a r3, int r4, int r5, java.util.Map<sb.EnumC6011e, ?> r6) {
            r1 = this;
            sb.a r0 = sb.EnumC6007a.f23157e0
            if (r3 != r0) goto L9
            zb.b r2 = super.mo7086d(r2, r3, r4, r5, r6)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can only encode EAN_8, but got "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }
}

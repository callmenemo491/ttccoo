package p129hc;

/* renamed from: hc.k */
/* loaded from: classes.dex */
public final class C3014k extends p129hc.AbstractC3022s {

    /* renamed from: i */
    public final /* synthetic */ int f12144i;

    /* renamed from: j */
    public final java.lang.Object f12145j;

    public C3014k(int r2) {
            r1 = this;
            r1.f12144i = r2
            r0 = 1
            if (r2 == r0) goto Le
            r1.<init>()
            r2 = 4
            int[] r2 = new int[r2]
            r1.f12145j = r2
            return
        Le:
            r1.<init>()
            hc.i r2 = new hc.i
            r2.<init>()
            r1.f12145j = r2
            return
    }

    /* renamed from: r */
    public static sb.C6021o m7415r(sb.C6021o r4) {
            java.lang.String r0 = r4.f23206a
            r1 = 0
            char r1 = r0.charAt(r1)
            r2 = 48
            if (r1 != r2) goto L1b
            sb.o r1 = new sb.o
            r2 = 1
            java.lang.String r0 = r0.substring(r2)
            r2 = 0
            sb.q[] r4 = r4.f23208c
            sb.a r3 = sb.EnumC6007a.f23165m0
            r1.<init>(r0, r2, r4, r3)
            return r1
        L1b:
            sb.f r4 = sb.C6012f.m12491a()
            throw r4
    }

    @Override // p129hc.AbstractC3019p, sb.InterfaceC6019m
    /* renamed from: a */
    public sb.C6021o mo2335a(p128hb.C3003h r2) {
            r1 = this;
            int r0 = r1.f12144i
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L13
        L6:
            java.lang.Object r0 = r1.f12145j
            hc.s r0 = (p129hc.AbstractC3022s) r0
            sb.o r2 = r0.mo2335a(r2)
            sb.o r2 = m7415r(r2)
            return r2
        L13:
            r0 = 0
            sb.o r2 = r1.mo2337c(r2, r0)
            return r2
    }

    @Override // p129hc.AbstractC3019p, sb.InterfaceC6019m
    /* renamed from: c */
    public sb.C6021o mo2337c(p128hb.C3003h r2, java.util.Map r3) {
            r1 = this;
            int r0 = r1.f12144i
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            sb.o r2 = super.mo2337c(r2, r3)
            return r2
        La:
            java.lang.Object r0 = r1.f12145j
            hc.s r0 = (p129hc.AbstractC3022s) r0
            sb.o r2 = r0.mo2337c(r2, r3)
            sb.o r2 = m7415r(r2)
            return r2
    }

    @Override // p129hc.AbstractC3022s, p129hc.AbstractC3019p
    /* renamed from: d */
    public sb.C6021o mo7401d(int r2, p453zb.C7269a r3, java.util.Map r4) {
            r1 = this;
            int r0 = r1.f12144i
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            sb.o r2 = super.mo7401d(r2, r3, r4)
            return r2
        La:
            java.lang.Object r0 = r1.f12145j
            hc.s r0 = (p129hc.AbstractC3022s) r0
            sb.o r2 = r0.mo7401d(r2, r3, r4)
            sb.o r2 = m7415r(r2)
            return r2
    }

    @Override // p129hc.AbstractC3022s
    /* renamed from: m */
    public int mo7413m(p453zb.C7269a r9, int[] r10, java.lang.StringBuilder r11) {
            r8 = this;
            int r0 = r8.f12144i
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L63
        L6:
            java.lang.Object r0 = r8.f12145j
            int[] r0 = (int[]) r0
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r3 = 2
            r0[r3] = r1
            r3 = 3
            r0[r3] = r1
            int r3 = r9.f27901Z
            r10 = r10[r2]
            r4 = 0
        L1b:
            r5 = 4
            if (r4 >= r5) goto L39
            if (r10 >= r3) goto L39
            int[][] r5 = p129hc.AbstractC3022s.f12164g
            int r5 = p129hc.AbstractC3022s.m7427k(r9, r0, r10, r5)
            int r5 = r5 + 48
            char r5 = (char) r5
            r11.append(r5)
            int r5 = r0.length
            r6 = 0
        L2e:
            if (r6 >= r5) goto L36
            r7 = r0[r6]
            int r10 = r10 + r7
            int r6 = r6 + 1
            goto L2e
        L36:
            int r4 = r4 + 1
            goto L1b
        L39:
            int[] r4 = p129hc.AbstractC3022s.f12162e
            int r6 = r4.length
            int[] r6 = new int[r6]
            int[] r10 = p129hc.AbstractC3022s.m7428o(r9, r10, r2, r4, r6)
            r10 = r10[r2]
            r2 = 0
        L45:
            if (r2 >= r5) goto L62
            if (r10 >= r3) goto L62
            int[][] r4 = p129hc.AbstractC3022s.f12164g
            int r4 = p129hc.AbstractC3022s.m7427k(r9, r0, r10, r4)
            int r4 = r4 + 48
            char r4 = (char) r4
            r11.append(r4)
            int r4 = r0.length
            r6 = 0
        L57:
            if (r6 >= r4) goto L5f
            r7 = r0[r6]
            int r10 = r10 + r7
            int r6 = r6 + 1
            goto L57
        L5f:
            int r2 = r2 + 1
            goto L45
        L62:
            return r10
        L63:
            java.lang.Object r0 = r8.f12145j
            hc.s r0 = (p129hc.AbstractC3022s) r0
            int r9 = r0.mo7413m(r9, r10, r11)
            return r9
    }

    @Override // p129hc.AbstractC3022s
    /* renamed from: n */
    public sb.C6021o mo7416n(int r2, p453zb.C7269a r3, int[] r4, java.util.Map r5) {
            r1 = this;
            int r0 = r1.f12144i
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            sb.o r2 = super.mo7416n(r2, r3, r4, r5)
            return r2
        La:
            java.lang.Object r0 = r1.f12145j
            hc.s r0 = (p129hc.AbstractC3022s) r0
            sb.o r2 = r0.mo7416n(r2, r3, r4, r5)
            sb.o r2 = m7415r(r2)
            return r2
    }

    @Override // p129hc.AbstractC3022s
    /* renamed from: q */
    public sb.EnumC6007a mo7414q() {
            r1 = this;
            int r0 = r1.f12144i
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            sb.a r0 = sb.EnumC6007a.f23165m0
            return r0
        L8:
            sb.a r0 = sb.EnumC6007a.f23157e0
            return r0
    }
}

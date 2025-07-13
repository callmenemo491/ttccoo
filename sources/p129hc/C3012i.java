package p129hc;

/* renamed from: hc.i */
/* loaded from: classes.dex */
public final class C3012i extends p129hc.AbstractC3022s {

    /* renamed from: j */
    public static final int[] f12141j = null;

    /* renamed from: i */
    public final int[] f12142i;

    static {
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 11, 13, 14, 19, 25, 28, 21, 22, 26} // fill-array
            p129hc.C3012i.f12141j = r0
            return
    }

    public C3012i() {
            r1 = this;
            r1.<init>()
            r0 = 4
            int[] r0 = new int[r0]
            r1.f12142i = r0
            return
    }

    @Override // p129hc.AbstractC3022s
    /* renamed from: m */
    public int mo7413m(p453zb.C7269a r12, int[] r13, java.lang.StringBuilder r14) {
            r11 = this;
            int[] r0 = r11.f12142i
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
            r4 = 0
        L3e:
            if (r4 >= r7) goto L79
            int[] r8 = p129hc.C3012i.f12141j
            r8 = r8[r4]
            if (r5 != r8) goto L76
            int r4 = r4 + 48
            char r4 = (char) r4
            r14.insert(r1, r4)
            int[] r4 = p129hc.AbstractC3022s.f12162e
            int r5 = r4.length
            int[] r5 = new int[r5]
            int[] r13 = p129hc.AbstractC3022s.m7428o(r12, r13, r2, r4, r5)
            r13 = r13[r2]
            r2 = 0
        L58:
            if (r2 >= r6) goto L75
            if (r13 >= r3) goto L75
            int[][] r4 = p129hc.AbstractC3022s.f12164g
            int r4 = p129hc.AbstractC3022s.m7427k(r12, r0, r13, r4)
            int r4 = r4 + 48
            char r4 = (char) r4
            r14.append(r4)
            int r4 = r0.length
            r5 = 0
        L6a:
            if (r5 >= r4) goto L72
            r7 = r0[r5]
            int r13 = r13 + r7
            int r5 = r5 + 1
            goto L6a
        L72:
            int r2 = r2 + 1
            goto L58
        L75:
            return r13
        L76:
            int r4 = r4 + 1
            goto L3e
        L79:
            sb.k r12 = sb.C6017k.f23200a0
            throw r12
    }

    @Override // p129hc.AbstractC3022s
    /* renamed from: q */
    public sb.EnumC6007a mo7414q() {
            r1 = this;
            sb.a r0 = sb.EnumC6007a.f23158f0
            return r0
    }
}

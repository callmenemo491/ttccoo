package p096fc;

/* renamed from: fc.a */
/* loaded from: classes.dex */
public final class C2138a implements sb.InterfaceC6019m {

    /* renamed from: b */
    public static final sb.C6023q[] f9833b = null;

    /* renamed from: a */
    public final cc.C0944c f9834a;

    static {
            r0 = 0
            sb.q[] r0 = new sb.C6023q[r0]
            p096fc.C2138a.f9833b = r0
            return
    }

    public C2138a() {
            r2 = this;
            r2.<init>()
            cc.c r0 = new cc.c
            r1 = 1
            r0.<init>(r1)
            r2.f9834a = r0
            return
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: a */
    public sb.C6021o mo2335a(p128hb.C3003h r2) {
            r1 = this;
            r0 = 0
            sb.o r2 = r1.mo2337c(r2, r0)
            return r2
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: b */
    public void mo2336b() {
            r0 = this;
            return
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: c */
    public sb.C6021o mo2337c(p128hb.C3003h r14, java.util.Map<sb.EnumC6009c, ?> r15) {
            r13 = this;
            if (r15 == 0) goto Ld2
            sb.c r0 = sb.EnumC6009c.f23170Z
            boolean r15 = r15.containsKey(r0)
            if (r15 == 0) goto Ld2
            zb.b r14 = r14.m7387m()
            int r15 = r14.f27902Y
            int r0 = r14.f27903Z
            r1 = -1
            r2 = 0
            r3 = -1
            r4 = 0
        L16:
            int r5 = r14.f27903Z
            if (r4 >= r5) goto L57
            r5 = 0
        L1b:
            int r6 = r14.f27904a0
            if (r5 >= r6) goto L54
            int[] r7 = r14.f27905b0
            int r6 = r6 * r4
            int r6 = r6 + r5
            r6 = r7[r6]
            if (r6 == 0) goto L51
            if (r4 >= r0) goto L2b
            r0 = r4
        L2b:
            if (r4 <= r3) goto L2e
            r3 = r4
        L2e:
            int r7 = r5 << 5
            if (r7 >= r15) goto L40
            r8 = 0
        L33:
            int r9 = 31 - r8
            int r9 = r6 << r9
            if (r9 != 0) goto L3c
            int r8 = r8 + 1
            goto L33
        L3c:
            int r8 = r8 + r7
            if (r8 >= r15) goto L40
            r15 = r8
        L40:
            int r8 = r7 + 31
            if (r8 <= r1) goto L51
            r8 = 31
        L46:
            int r9 = r6 >>> r8
            if (r9 != 0) goto L4d
            int r8 = r8 + (-1)
            goto L46
        L4d:
            int r7 = r7 + r8
            if (r7 <= r1) goto L51
            r1 = r7
        L51:
            int r5 = r5 + 1
            goto L1b
        L54:
            int r4 = r4 + 1
            goto L16
        L57:
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 < r15) goto L6f
            if (r3 >= r0) goto L5f
            goto L6f
        L5f:
            r7 = 4
            int[] r7 = new int[r7]
            r7[r2] = r15
            r7[r6] = r0
            int r1 = r1 - r15
            int r1 = r1 + r6
            r7[r5] = r1
            int r3 = r3 - r0
            int r3 = r3 + r6
            r7[r4] = r3
            goto L70
        L6f:
            r7 = 0
        L70:
            if (r7 == 0) goto Lcf
            r15 = r7[r2]
            r0 = r7[r6]
            r1 = r7[r5]
            r3 = r7[r4]
            zb.b r4 = new zb.b
            r6 = 30
            r7 = 33
            r4.<init>(r6, r7)
            r8 = 0
        L84:
            if (r8 >= r7) goto Lac
            int r9 = r8 * r3
            int r10 = r3 / 2
            int r10 = r10 + r9
            int r10 = r10 / r7
            int r10 = r10 + r0
            r9 = 0
        L8e:
            if (r9 >= r6) goto La9
            int r11 = r9 * r1
            int r12 = r1 / 2
            int r12 = r12 + r11
            r11 = r8 & 1
            int r11 = r11 * r1
            int r11 = r11 / r5
            int r11 = r11 + r12
            int r11 = r11 / r6
            int r11 = r11 + r15
            boolean r11 = r14.m14372b(r11, r10)
            if (r11 == 0) goto La6
            r4.m14376f(r9, r8)
        La6:
            int r9 = r9 + 1
            goto L8e
        La9:
            int r8 = r8 + 1
            goto L84
        Lac:
            cc.c r14 = r13.f9834a
            zb.e r14 = r14.m2668c(r4)
            sb.o r15 = new sb.o
            java.lang.Object r0 = r14.f27916c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r14.f27914a
            byte[] r1 = (byte[]) r1
            sb.q[] r2 = p096fc.C2138a.f9833b
            sb.a r3 = sb.EnumC6007a.f23160h0
            r15.<init>(r0, r1, r2, r3)
            java.lang.Object r14 = r14.f27918e
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto Lce
            sb.p r0 = sb.EnumC6022p.f23213a0
            r15.m12500b(r0, r14)
        Lce:
            return r15
        Lcf:
            sb.k r14 = sb.C6017k.f23200a0
            throw r14
        Ld2:
            sb.k r14 = sb.C6017k.f23200a0
            throw r14
    }
}

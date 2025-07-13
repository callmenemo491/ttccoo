package p216m4;

/* renamed from: m4.o */
/* loaded from: classes.dex */
public final class C4370o {

    /* renamed from: m4.o$a */
    public static final class a {

        /* renamed from: a */
        public long f17909a;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: a */
    public static boolean m9813a(p371v5.C6571u r2, p216m4.C4373r r3, boolean r4, p216m4.C4370o.a r5) {
            long r0 = r2.m13391A()     // Catch: java.lang.NumberFormatException -> L10
            if (r4 == 0) goto L7
            goto Lc
        L7:
            int r2 = r3.f17913b
            long r2 = (long) r2
            long r0 = r0 * r2
        Lc:
            r5.f17909a = r0
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    /* renamed from: b */
    public static boolean m9814b(p371v5.C6571u r17, p216m4.C4373r r18, int r19, p216m4.C4370o.a r20) {
            r0 = r17
            r1 = r18
            int r2 = r0.f25711b
            long r3 = r17.m13419v()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L17
            return r9
        L17:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L21
            r5 = 1
            goto L22
        L21:
            r5 = 0
        L22:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            long r6 = r15 & r13
            int r7 = (int) r6
            r6 = 4
            long r15 = r3 >> r6
            long r13 = r13 & r15
            int r6 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r8 = (int) r13
            r13 = 1
            long r3 = r3 & r13
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 != 0) goto L45
            r3 = 1
            goto L46
        L45:
            r3 = 0
        L46:
            r4 = 7
            if (r6 > r4) goto L4f
            int r4 = r1.f17918g
            int r4 = r4 - r10
            if (r6 != r4) goto L5a
            goto L58
        L4f:
            r4 = 10
            if (r6 > r4) goto L5a
            int r4 = r1.f17918g
            r6 = 2
            if (r4 != r6) goto L5a
        L58:
            r4 = 1
            goto L5b
        L5a:
            r4 = 0
        L5b:
            if (r4 == 0) goto Ld3
            if (r8 != 0) goto L60
            goto L64
        L60:
            int r4 = r1.f17920i
            if (r8 != r4) goto L66
        L64:
            r4 = 1
            goto L67
        L66:
            r4 = 0
        L67:
            if (r4 == 0) goto Ld3
            if (r3 != 0) goto Ld3
            r3 = r20
            boolean r3 = m9813a(r0, r1, r5, r3)
            if (r3 == 0) goto Ld3
            int r3 = m9815c(r0, r12)
            r4 = -1
            if (r3 == r4) goto L80
            int r4 = r1.f17913b
            if (r3 > r4) goto L80
            r3 = 1
            goto L81
        L80:
            r3 = 0
        L81:
            if (r3 == 0) goto Ld3
            int r3 = r1.f17916e
            if (r7 != 0) goto L88
            goto Lac
        L88:
            r4 = 11
            if (r7 > r4) goto L91
            int r1 = r1.f17917f
            if (r7 != r1) goto Lae
            goto Lac
        L91:
            r1 = 12
            if (r7 != r1) goto L9e
            int r1 = r17.m13418u()
            int r1 = r1 * 1000
            if (r1 != r3) goto Lae
            goto Lac
        L9e:
            r1 = 14
            if (r7 > r1) goto Lae
            int r4 = r17.m13423z()
            if (r7 != r1) goto Laa
            int r4 = r4 * 10
        Laa:
            if (r4 != r3) goto Lae
        Lac:
            r1 = 1
            goto Laf
        Lae:
            r1 = 0
        Laf:
            if (r1 == 0) goto Ld3
            int r1 = r17.m13418u()
            int r3 = r0.f25711b
            byte[] r0 = r0.f25710a
            int r3 = r3 - r10
            int r4 = p371v5.C6552b0.f25624a
            r4 = 0
        Lbd:
            if (r2 >= r3) goto Lcb
            int[] r5 = p371v5.C6552b0.f25634k
            r6 = r0[r2]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r4 = r4 ^ r6
            r4 = r5[r4]
            int r2 = r2 + 1
            goto Lbd
        Lcb:
            if (r1 != r4) goto Lcf
            r0 = 1
            goto Ld0
        Lcf:
            r0 = 0
        Ld0:
            if (r0 == 0) goto Ld3
            r9 = 1
        Ld3:
            return r9
    }

    /* renamed from: c */
    public static int m9815c(p371v5.C6571u r0, int r1) {
            switch(r1) {
                case 1: goto L1f;
                case 2: goto L19;
                case 3: goto L19;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L12;
                case 7: goto Lb;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto L5;
                case 11: goto L5;
                case 12: goto L5;
                case 13: goto L5;
                case 14: goto L5;
                case 15: goto L5;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L5:
            r0 = 256(0x100, float:3.59E-43)
            int r1 = r1 + (-8)
            int r0 = r0 << r1
            return r0
        Lb:
            int r0 = r0.m13423z()
            int r0 = r0 + 1
            return r0
        L12:
            int r0 = r0.m13418u()
            int r0 = r0 + 1
            return r0
        L19:
            r0 = 576(0x240, float:8.07E-43)
            int r1 = r1 + (-2)
            int r0 = r0 << r1
            return r0
        L1f:
            r0 = 192(0xc0, float:2.69E-43)
            return r0
    }
}

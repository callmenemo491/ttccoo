package sc;

/* renamed from: sc.d */
/* loaded from: classes.dex */
public class C6030d {

    /* renamed from: a */
    public final p453zb.C7270b f23236a;

    /* renamed from: b */
    public final java.util.List<sc.C6029c> f23237b;

    /* renamed from: c */
    public boolean f23238c;

    /* renamed from: d */
    public final int[] f23239d;

    /* renamed from: e */
    public final sb.InterfaceC6024r f23240e;

    /* renamed from: sc.d$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: sc.d$b */
    public static final class b implements java.io.Serializable, java.util.Comparator<sc.C6029c> {

        /* renamed from: Y */
        public final float f23241Y;

        public b(float r1, sc.C6030d.a r2) {
                r0 = this;
                r0.<init>()
                r0.f23241Y = r1
                return
        }

        @Override // java.util.Comparator
        public int compare(sc.C6029c r3, sc.C6029c r4) {
                r2 = this;
                sc.c r3 = (sc.C6029c) r3
                sc.c r4 = (sc.C6029c) r4
                int r0 = r4.f23235d
                int r1 = r3.f23235d
                if (r0 != r1) goto L2a
                float r4 = r4.f23234c
                float r0 = r2.f23241Y
                float r4 = r4 - r0
                float r4 = java.lang.Math.abs(r4)
                float r3 = r3.f23234c
                float r0 = r2.f23241Y
                float r3 = r3 - r0
                float r3 = java.lang.Math.abs(r3)
                int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r0 >= 0) goto L22
                r3 = 1
                goto L2c
            L22:
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 != 0) goto L28
                r3 = 0
                goto L2c
            L28:
                r3 = -1
                goto L2c
            L2a:
                int r3 = r0 - r1
            L2c:
                return r3
        }
    }

    /* renamed from: sc.d$c */
    public static final class c implements java.io.Serializable, java.util.Comparator<sc.C6029c> {

        /* renamed from: Y */
        public final float f23242Y;

        public c(float r1, sc.C6030d.a r2) {
                r0 = this;
                r0.<init>()
                r0.f23242Y = r1
                return
        }

        @Override // java.util.Comparator
        public int compare(sc.C6029c r2, sc.C6029c r3) {
                r1 = this;
                sc.c r2 = (sc.C6029c) r2
                sc.c r3 = (sc.C6029c) r3
                float r3 = r3.f23234c
                float r0 = r1.f23242Y
                float r3 = r3 - r0
                float r3 = java.lang.Math.abs(r3)
                float r2 = r2.f23234c
                float r0 = r1.f23242Y
                float r2 = r2 - r0
                float r2 = java.lang.Math.abs(r2)
                int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r0 >= 0) goto L1c
                r2 = -1
                goto L23
            L1c:
                int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r2 != 0) goto L22
                r2 = 0
                goto L23
            L22:
                r2 = 1
            L23:
                return r2
        }
    }

    public C6030d(p453zb.C7270b r1, sb.InterfaceC6024r r2) {
            r0 = this;
            r0.<init>()
            r0.f23236a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f23237b = r1
            r1 = 5
            int[] r1 = new int[r1]
            r0.f23239d = r1
            r0.f23240e = r2
            return
    }

    /* renamed from: a */
    public static float m12507a(int[] r1, int r2) {
            r0 = 4
            r0 = r1[r0]
            int r2 = r2 - r0
            r0 = 3
            r0 = r1[r0]
            int r2 = r2 - r0
            float r2 = (float) r2
            r0 = 2
            r1 = r1[r0]
            float r1 = (float) r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r2 = r2 - r1
            return r2
    }

    /* renamed from: b */
    public static boolean m12508b(int[] r7) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            r3 = 5
            if (r1 >= r3) goto Lf
            r3 = r7[r1]
            if (r3 != 0) goto Lb
            return r0
        Lb:
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Lf:
            r1 = 7
            if (r2 >= r1) goto L13
            return r0
        L13:
            float r1 = (float) r2
            r2 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r1 / r2
            r3 = r7[r0]
            float r3 = (float) r3
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 >= 0) goto L65
            r3 = 1
            r4 = r7[r3]
            float r4 = (float) r4
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L65
            r4 = 1077936128(0x40400000, float:3.0)
            float r5 = r1 * r4
            r6 = 2
            r6 = r7[r6]
            float r6 = (float) r6
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            float r4 = r4 * r2
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 >= 0) goto L65
            r4 = 3
            r4 = r7[r4]
            float r4 = (float) r4
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L65
            r4 = 4
            r7 = r7[r4]
            float r7 = (float) r7
            float r1 = r1 - r7
            float r7 = java.lang.Math.abs(r1)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L65
            return r3
        L65:
            return r0
    }

    /* renamed from: c */
    public final int[] m12509c() {
            r3 = this;
            int[] r0 = r3.f23239d
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r2 = 2
            r0[r2] = r1
            r2 = 3
            r0[r2] = r1
            r2 = 4
            r0[r2] = r1
            return r0
    }

    /* renamed from: d */
    public final boolean m12510d(int[] r18, int r19, int r20, boolean r21) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r5 = r1[r4]
            int r3 = r3 + r5
            r5 = 2
            r6 = r1[r5]
            int r3 = r3 + r6
            r6 = 3
            r7 = r1[r6]
            int r3 = r3 + r7
            r7 = 4
            r8 = r1[r7]
            int r3 = r3 + r8
            r8 = r20
            float r8 = m12507a(r1, r8)
            int r8 = (int) r8
            r9 = r1[r5]
            zb.b r10 = r0.f23236a
            int r11 = r10.f27903Z
            int[] r12 = r17.m12509c()
            r13 = r19
        L2a:
            if (r13 < 0) goto L3a
            boolean r14 = r10.m14372b(r8, r13)
            if (r14 == 0) goto L3a
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + (-1)
            goto L2a
        L3a:
            if (r13 >= 0) goto L3e
            goto Le2
        L3e:
            if (r13 < 0) goto L52
            boolean r15 = r10.m14372b(r8, r13)
            if (r15 != 0) goto L52
            r15 = r12[r4]
            if (r15 > r9) goto L52
            r15 = r12[r4]
            int r15 = r15 + r4
            r12[r4] = r15
            int r13 = r13 + (-1)
            goto L3e
        L52:
            if (r13 < 0) goto Le2
            r15 = r12[r4]
            if (r15 <= r9) goto L5a
            goto Le2
        L5a:
            if (r13 < 0) goto L6e
            boolean r15 = r10.m14372b(r8, r13)
            if (r15 == 0) goto L6e
            r15 = r12[r2]
            if (r15 > r9) goto L6e
            r15 = r12[r2]
            int r15 = r15 + r4
            r12[r2] = r15
            int r13 = r13 + (-1)
            goto L5a
        L6e:
            r13 = r12[r2]
            if (r13 <= r9) goto L74
            goto Le2
        L74:
            int r13 = r19 + 1
        L76:
            if (r13 >= r11) goto L86
            boolean r15 = r10.m14372b(r8, r13)
            if (r15 == 0) goto L86
            r15 = r12[r5]
            int r15 = r15 + r4
            r12[r5] = r15
            int r13 = r13 + 1
            goto L76
        L86:
            if (r13 != r11) goto L89
            goto Le2
        L89:
            if (r13 >= r11) goto L9d
            boolean r15 = r10.m14372b(r8, r13)
            if (r15 != 0) goto L9d
            r15 = r12[r6]
            if (r15 >= r9) goto L9d
            r15 = r12[r6]
            int r15 = r15 + r4
            r12[r6] = r15
            int r13 = r13 + 1
            goto L89
        L9d:
            if (r13 == r11) goto Le2
            r15 = r12[r6]
            if (r15 < r9) goto La4
            goto Le2
        La4:
            if (r13 >= r11) goto Lb8
            boolean r15 = r10.m14372b(r8, r13)
            if (r15 == 0) goto Lb8
            r15 = r12[r7]
            if (r15 >= r9) goto Lb8
            r15 = r12[r7]
            int r15 = r15 + r4
            r12[r7] = r15
            int r13 = r13 + 1
            goto La4
        Lb8:
            r10 = r12[r7]
            if (r10 < r9) goto Lbd
            goto Le2
        Lbd:
            r9 = r12[r2]
            r10 = r12[r4]
            int r9 = r9 + r10
            r10 = r12[r5]
            int r9 = r9 + r10
            r10 = r12[r6]
            int r9 = r9 + r10
            r10 = r12[r7]
            int r9 = r9 + r10
            int r9 = r9 - r3
            int r9 = java.lang.Math.abs(r9)
            int r9 = r9 * 5
            int r10 = r3 * 2
            if (r9 < r10) goto Ld7
            goto Le2
        Ld7:
            boolean r9 = m12508b(r12)
            if (r9 == 0) goto Le2
            float r9 = m12507a(r12, r13)
            goto Le4
        Le2:
            r9 = 2143289344(0x7fc00000, float:NaN)
        Le4:
            boolean r10 = java.lang.Float.isNaN(r9)
            if (r10 != 0) goto L342
            int r10 = (int) r9
            r11 = r1[r5]
            zb.b r12 = r0.f23236a
            int r13 = r12.f27902Y
            int[] r15 = r17.m12509c()
            r14 = r8
        Lf6:
            if (r14 < 0) goto L107
            boolean r16 = r12.m14372b(r14, r10)
            if (r16 == 0) goto L107
            r16 = r15[r5]
            int r16 = r16 + 1
            r15[r5] = r16
            int r14 = r14 + (-1)
            goto Lf6
        L107:
            if (r14 >= 0) goto L10b
            goto L1af
        L10b:
            if (r14 < 0) goto L120
            boolean r16 = r12.m14372b(r14, r10)
            if (r16 != 0) goto L120
            r7 = r15[r4]
            if (r7 > r11) goto L120
            r7 = r15[r4]
            int r7 = r7 + r4
            r15[r4] = r7
            int r14 = r14 + (-1)
            r7 = 4
            goto L10b
        L120:
            if (r14 < 0) goto L1af
            r7 = r15[r4]
            if (r7 <= r11) goto L128
            goto L1af
        L128:
            if (r14 < 0) goto L13c
            boolean r7 = r12.m14372b(r14, r10)
            if (r7 == 0) goto L13c
            r7 = r15[r2]
            if (r7 > r11) goto L13c
            r7 = r15[r2]
            int r7 = r7 + r4
            r15[r2] = r7
            int r14 = r14 + (-1)
            goto L128
        L13c:
            r7 = r15[r2]
            if (r7 <= r11) goto L142
            goto L1af
        L142:
            int r8 = r8 + r4
        L143:
            if (r8 >= r13) goto L153
            boolean r7 = r12.m14372b(r8, r10)
            if (r7 == 0) goto L153
            r7 = r15[r5]
            int r7 = r7 + r4
            r15[r5] = r7
            int r8 = r8 + 1
            goto L143
        L153:
            if (r8 != r13) goto L156
            goto L1af
        L156:
            if (r8 >= r13) goto L16a
            boolean r7 = r12.m14372b(r8, r10)
            if (r7 != 0) goto L16a
            r7 = r15[r6]
            if (r7 >= r11) goto L16a
            r7 = r15[r6]
            int r7 = r7 + r4
            r15[r6] = r7
            int r8 = r8 + 1
            goto L156
        L16a:
            if (r8 == r13) goto L1af
            r7 = r15[r6]
            if (r7 < r11) goto L171
            goto L1af
        L171:
            if (r8 >= r13) goto L186
            boolean r7 = r12.m14372b(r8, r10)
            if (r7 == 0) goto L186
            r7 = 4
            r14 = r15[r7]
            if (r14 >= r11) goto L187
            r14 = r15[r7]
            int r14 = r14 + r4
            r15[r7] = r14
            int r8 = r8 + 1
            goto L171
        L186:
            r7 = 4
        L187:
            r12 = r15[r7]
            if (r12 < r11) goto L18c
            goto L1af
        L18c:
            r11 = r15[r2]
            r12 = r15[r4]
            int r11 = r11 + r12
            r12 = r15[r5]
            int r11 = r11 + r12
            r12 = r15[r6]
            int r11 = r11 + r12
            r12 = r15[r7]
            int r11 = r11 + r12
            int r11 = r11 - r3
            int r7 = java.lang.Math.abs(r11)
            int r7 = r7 * 5
            if (r7 < r3) goto L1a4
            goto L1af
        L1a4:
            boolean r7 = m12508b(r15)
            if (r7 == 0) goto L1af
            float r14 = m12507a(r15, r8)
            goto L1b1
        L1af:
            r14 = 2143289344(0x7fc00000, float:NaN)
        L1b1:
            boolean r7 = java.lang.Float.isNaN(r14)
            if (r7 != 0) goto L342
            if (r21 == 0) goto L2c0
            int r7 = (int) r14
            r1 = r1[r5]
            int[] r8 = r17.m12509c()
            r11 = 0
        L1c1:
            if (r10 < r11) goto L1d9
            if (r7 < r11) goto L1d9
            zb.b r12 = r0.f23236a
            int r13 = r7 - r11
            int r15 = r10 - r11
            boolean r12 = r12.m14372b(r13, r15)
            if (r12 == 0) goto L1d9
            r12 = r8[r5]
            int r12 = r12 + r4
            r8[r5] = r12
            int r11 = r11 + 1
            goto L1c1
        L1d9:
            if (r10 < r11) goto L2bd
            if (r7 >= r11) goto L1df
            goto L2bd
        L1df:
            if (r10 < r11) goto L1fb
            if (r7 < r11) goto L1fb
            zb.b r12 = r0.f23236a
            int r13 = r7 - r11
            int r15 = r10 - r11
            boolean r12 = r12.m14372b(r13, r15)
            if (r12 != 0) goto L1fb
            r12 = r8[r4]
            if (r12 > r1) goto L1fb
            r12 = r8[r4]
            int r12 = r12 + r4
            r8[r4] = r12
            int r11 = r11 + 1
            goto L1df
        L1fb:
            if (r10 < r11) goto L2bd
            if (r7 < r11) goto L2bd
            r12 = r8[r4]
            if (r12 <= r1) goto L205
            goto L2bd
        L205:
            if (r10 < r11) goto L221
            if (r7 < r11) goto L221
            zb.b r12 = r0.f23236a
            int r13 = r7 - r11
            int r15 = r10 - r11
            boolean r12 = r12.m14372b(r13, r15)
            if (r12 == 0) goto L221
            r12 = r8[r2]
            if (r12 > r1) goto L221
            r12 = r8[r2]
            int r12 = r12 + r4
            r8[r2] = r12
            int r11 = r11 + 1
            goto L205
        L221:
            r11 = r8[r2]
            if (r11 <= r1) goto L227
            goto L2bd
        L227:
            zb.b r11 = r0.f23236a
            int r12 = r11.f27903Z
            int r11 = r11.f27902Y
            r13 = 1
        L22e:
            int r15 = r10 + r13
            if (r15 >= r12) goto L248
            int r2 = r7 + r13
            if (r2 >= r11) goto L248
            zb.b r6 = r0.f23236a
            boolean r2 = r6.m14372b(r2, r15)
            if (r2 == 0) goto L248
            r2 = r8[r5]
            int r2 = r2 + r4
            r8[r5] = r2
            int r13 = r13 + 1
            r2 = 0
            r6 = 3
            goto L22e
        L248:
            if (r15 >= r12) goto L2bd
            int r2 = r7 + r13
            if (r2 < r11) goto L250
            goto L2bd
        L250:
            int r2 = r10 + r13
            if (r2 >= r12) goto L26d
            int r6 = r7 + r13
            if (r6 >= r11) goto L26d
            zb.b r15 = r0.f23236a
            boolean r6 = r15.m14372b(r6, r2)
            if (r6 != 0) goto L26d
            r6 = 3
            r15 = r8[r6]
            if (r15 >= r1) goto L26d
            r2 = r8[r6]
            int r2 = r2 + r4
            r8[r6] = r2
            int r13 = r13 + 1
            goto L250
        L26d:
            if (r2 >= r12) goto L2bd
            int r2 = r7 + r13
            if (r2 >= r11) goto L2bd
            r2 = 3
            r6 = r8[r2]
            if (r6 < r1) goto L279
            goto L2bd
        L279:
            int r2 = r10 + r13
            if (r2 >= r12) goto L296
            int r6 = r7 + r13
            if (r6 >= r11) goto L296
            zb.b r15 = r0.f23236a
            boolean r2 = r15.m14372b(r6, r2)
            if (r2 == 0) goto L296
            r2 = 4
            r6 = r8[r2]
            if (r6 >= r1) goto L297
            r6 = r8[r2]
            int r6 = r6 + r4
            r8[r2] = r6
            int r13 = r13 + 1
            goto L279
        L296:
            r2 = 4
        L297:
            r6 = r8[r2]
            if (r6 < r1) goto L29c
            goto L2bd
        L29c:
            r1 = 0
            r6 = r8[r1]
            r1 = r8[r4]
            int r6 = r6 + r1
            r1 = r8[r5]
            int r6 = r6 + r1
            r1 = 3
            r1 = r8[r1]
            int r6 = r6 + r1
            r1 = r8[r2]
            int r6 = r6 + r1
            int r6 = r6 - r3
            int r1 = java.lang.Math.abs(r6)
            int r2 = r3 * 2
            if (r1 >= r2) goto L2bd
            boolean r1 = m12508b(r8)
            if (r1 == 0) goto L2bd
            r1 = 1
            goto L2be
        L2bd:
            r1 = 0
        L2be:
            if (r1 == 0) goto L342
        L2c0:
            float r1 = (float) r3
            r2 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r2
            r2 = 0
        L2c5:
            java.util.List<sc.c> r3 = r0.f23237b
            int r3 = r3.size()
            if (r2 >= r3) goto L32d
            java.util.List<sc.c> r3 = r0.f23237b
            java.lang.Object r3 = r3.get(r2)
            sc.c r3 = (sc.C6029c) r3
            float r5 = r3.f23223b
            float r5 = r9 - r5
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 > 0) goto L303
            float r5 = r3.f23222a
            float r5 = r14 - r5
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 > 0) goto L303
            float r5 = r3.f23234c
            float r5 = r1 - r5
            float r5 = java.lang.Math.abs(r5)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L301
            float r6 = r3.f23234c
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L303
        L301:
            r5 = 1
            goto L304
        L303:
            r5 = 0
        L304:
            if (r5 == 0) goto L32a
            java.util.List<sc.c> r5 = r0.f23237b
            int r6 = r3.f23235d
            int r7 = r6 + 1
            float r6 = (float) r6
            float r8 = r3.f23222a
            float r8 = r8 * r6
            float r8 = r8 + r14
            float r10 = (float) r7
            float r8 = r8 / r10
            float r11 = r3.f23223b
            float r11 = r11 * r6
            float r11 = r11 + r9
            float r11 = r11 / r10
            float r3 = r3.f23234c
            float r6 = r6 * r3
            float r6 = r6 + r1
            float r6 = r6 / r10
            sc.c r3 = new sc.c
            r3.<init>(r8, r11, r6, r7)
            r5.set(r2, r3)
            r2 = 1
            goto L32e
        L32a:
            int r2 = r2 + 1
            goto L2c5
        L32d:
            r2 = 0
        L32e:
            if (r2 != 0) goto L341
            sc.c r2 = new sc.c
            r2.<init>(r14, r9, r1)
            java.util.List<sc.c> r1 = r0.f23237b
            r1.add(r2)
            sb.r r1 = r0.f23240e
            if (r1 == 0) goto L341
            r1.mo12503a(r2)
        L341:
            return r4
        L342:
            r1 = 0
            return r1
    }

    /* renamed from: e */
    public final boolean m12511e() {
            r9 = this;
            java.util.List<sc.c> r0 = r9.f23237b
            int r0 = r0.size()
            java.util.List<sc.c> r1 = r9.f23237b
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L10:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L27
            java.lang.Object r6 = r1.next()
            sc.c r6 = (sc.C6029c) r6
            int r7 = r6.f23235d
            r8 = 2
            if (r7 < r8) goto L10
            int r4 = r4 + 1
            float r6 = r6.f23234c
            float r5 = r5 + r6
            goto L10
        L27:
            r1 = 3
            if (r4 >= r1) goto L2b
            return r3
        L2b:
            float r0 = (float) r0
            float r0 = r5 / r0
            java.util.List<sc.c> r1 = r9.f23237b
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r1.next()
            sc.c r4 = (sc.C6029c) r4
            float r4 = r4.f23234c
            float r4 = r4 - r0
            float r4 = java.lang.Math.abs(r4)
            float r2 = r2 + r4
            goto L34
        L49:
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            float r5 = r5 * r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L54
            r0 = 1
            return r0
        L54:
            return r3
    }
}

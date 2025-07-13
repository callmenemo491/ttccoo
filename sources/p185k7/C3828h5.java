package p185k7;

/* renamed from: k7.h5 */
/* loaded from: classes.dex */
public /* synthetic */ class C3828h5 {
    /* renamed from: A */
    public static int m8572A(java.lang.CharSequence r19, int r20, int r21) {
            r0 = r19
            r1 = r20
            int r2 = r19.length()
            if (r1 < r2) goto Lb
            return r21
        Lb:
            r2 = 6
            float[] r3 = new float[r2]
            if (r21 != 0) goto L14
            r3 = {x0206: FILL_ARRAY_DATA , data: [0, 1065353216, 1065353216, 1065353216, 1065353216, 1067450368} // fill-array
            goto L1a
        L14:
            r3 = {x0216: FILL_ARRAY_DATA , data: [1065353216, 1073741824, 1073741824, 1073741824, 1073741824, 1074790400} // fill-array
            r4 = 0
            r3[r21] = r4
        L1a:
            r4 = 0
            r5 = 0
        L1c:
            int r6 = r1 + r5
            int r7 = r19.length()
            r8 = 2
            r9 = 4
            r10 = 3
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 5
            r13 = 1
            if (r6 != r7) goto L60
            byte[] r0 = new byte[r2]
            int[] r1 = new int[r2]
            int r3 = m8595j(r3, r1, r11, r0)
            r5 = 0
            r6 = 0
        L36:
            if (r5 >= r2) goto L3e
            r7 = r0[r5]
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto L36
        L3e:
            r1 = r1[r4]
            if (r1 != r3) goto L43
            return r4
        L43:
            if (r6 != r13) goto L4a
            r1 = r0[r12]
            if (r1 <= 0) goto L4a
            return r12
        L4a:
            if (r6 != r13) goto L51
            r1 = r0[r9]
            if (r1 <= 0) goto L51
            return r9
        L51:
            if (r6 != r13) goto L58
            r1 = r0[r8]
            if (r1 <= 0) goto L58
            return r8
        L58:
            if (r6 != r13) goto L5f
            r0 = r0[r10]
            if (r0 <= 0) goto L5f
            return r10
        L5f:
            return r13
        L60:
            char r6 = r0.charAt(r6)
            int r5 = r5 + 1
            boolean r7 = m8602q(r6)
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L76
            r7 = r3[r4]
            r15 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r15
            r3[r4] = r7
            goto L9d
        L76:
            boolean r7 = m8603r(r6)
            if (r7 == 0) goto L8e
            r7 = r3[r4]
            double r11 = (double) r7
            double r11 = java.lang.Math.ceil(r11)
            float r7 = (float) r11
            r3[r4] = r7
            r7 = r3[r4]
            r11 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 + r11
            r3[r4] = r7
            goto L9d
        L8e:
            r7 = r3[r4]
            double r11 = (double) r7
            double r11 = java.lang.Math.ceil(r11)
            float r7 = (float) r11
            r3[r4] = r7
            r7 = r3[r4]
            float r7 = r7 + r14
            r3[r4] = r7
        L9d:
            r7 = 57
            r11 = 48
            r12 = 32
            if (r6 == r12) goto Lb4
            if (r6 < r11) goto La9
            if (r6 <= r7) goto Lb4
        La9:
            r15 = 65
            if (r6 < r15) goto Lb2
            r15 = 90
            if (r6 > r15) goto Lb2
            goto Lb4
        Lb2:
            r15 = 0
            goto Lb5
        Lb4:
            r15 = 1
        Lb5:
            r16 = 1076538027(0x402aaaab, float:2.6666667)
            r17 = 1068149419(0x3faaaaab, float:1.3333334)
            r18 = 1059760811(0x3f2aaaab, float:0.6666667)
            if (r15 == 0) goto Lc7
            r15 = r3[r13]
            float r15 = r15 + r18
            r3[r13] = r15
            goto Lda
        Lc7:
            boolean r15 = m8603r(r6)
            if (r15 == 0) goto Ld4
            r15 = r3[r13]
            float r15 = r15 + r16
            r3[r13] = r15
            goto Lda
        Ld4:
            r15 = r3[r13]
            float r15 = r15 + r17
            r3[r13] = r15
        Lda:
            if (r6 == r12) goto Leb
            if (r6 < r11) goto Le0
            if (r6 <= r7) goto Leb
        Le0:
            r7 = 97
            if (r6 < r7) goto Le9
            r7 = 122(0x7a, float:1.71E-43)
            if (r6 > r7) goto Le9
            goto Leb
        Le9:
            r7 = 0
            goto Lec
        Leb:
            r7 = 1
        Lec:
            if (r7 == 0) goto Lf5
            r7 = r3[r8]
            float r7 = r7 + r18
            r3[r8] = r7
            goto L108
        Lf5:
            boolean r7 = m8603r(r6)
            if (r7 == 0) goto L102
            r7 = r3[r8]
            float r7 = r7 + r16
            r3[r8] = r7
            goto L108
        L102:
            r7 = r3[r8]
            float r7 = r7 + r17
            r3[r8] = r7
        L108:
            boolean r7 = m8604s(r6)
            if (r7 == 0) goto L115
            r7 = r3[r10]
            float r7 = r7 + r18
            r3[r10] = r7
            goto L12c
        L115:
            boolean r7 = m8603r(r6)
            if (r7 == 0) goto L124
            r7 = r3[r10]
            r11 = 1082829483(0x408aaaab, float:4.3333335)
            float r7 = r7 + r11
            r3[r10] = r7
            goto L12c
        L124:
            r7 = r3[r10]
            r11 = 1079334229(0x40555555, float:3.3333333)
            float r7 = r7 + r11
            r3[r10] = r7
        L12c:
            if (r6 < r12) goto L134
            r7 = 94
            if (r6 > r7) goto L134
            r7 = 1
            goto L135
        L134:
            r7 = 0
        L135:
            if (r7 == 0) goto L140
            r6 = r3[r9]
            r7 = 1061158912(0x3f400000, float:0.75)
            float r6 = r6 + r7
            r3[r9] = r6
        L13e:
            r6 = 5
            goto L156
        L140:
            boolean r6 = m8603r(r6)
            if (r6 == 0) goto L14e
            r6 = r3[r9]
            r7 = 1082654720(0x40880000, float:4.25)
            float r6 = r6 + r7
            r3[r9] = r6
            goto L13e
        L14e:
            r6 = r3[r9]
            r7 = 1078984704(0x40500000, float:3.25)
            float r6 = r6 + r7
            r3[r9] = r6
            goto L13e
        L156:
            r7 = r3[r6]
            float r7 = r7 + r14
            r3[r6] = r7
            if (r5 < r9) goto L1c
            int[] r6 = new int[r2]
            byte[] r7 = new byte[r2]
            r11 = 2147483647(0x7fffffff, float:NaN)
            m8595j(r3, r6, r11, r7)
            r11 = 0
            r12 = 0
        L169:
            if (r11 >= r2) goto L171
            r14 = r7[r11]
            int r12 = r12 + r14
            int r11 = r11 + 1
            goto L169
        L171:
            r11 = r6[r4]
            r14 = 5
            r15 = r6[r14]
            r14 = r15
            if (r11 >= r14) goto L192
            r11 = r6[r4]
            r14 = r6[r13]
            if (r11 >= r14) goto L192
            r11 = r6[r4]
            r14 = r6[r8]
            if (r11 >= r14) goto L192
            r11 = r6[r4]
            r14 = r6[r10]
            if (r11 >= r14) goto L192
            r11 = r6[r4]
            r14 = r6[r9]
            if (r11 >= r14) goto L192
            return r4
        L192:
            r11 = 5
            r14 = r6[r11]
            r11 = r6[r4]
            if (r14 < r11) goto L203
            r11 = r7[r13]
            r14 = r7[r8]
            int r11 = r11 + r14
            r14 = r7[r10]
            int r11 = r11 + r14
            r14 = r7[r9]
            int r11 = r11 + r14
            if (r11 != 0) goto L1a7
            goto L203
        L1a7:
            if (r12 != r13) goto L1ae
            r11 = r7[r9]
            if (r11 <= 0) goto L1ae
            return r9
        L1ae:
            if (r12 != r13) goto L1b5
            r11 = r7[r8]
            if (r11 <= 0) goto L1b5
            return r8
        L1b5:
            if (r12 != r13) goto L1bc
            r7 = r7[r10]
            if (r7 <= 0) goto L1bc
            return r10
        L1bc:
            r7 = r6[r13]
            int r7 = r7 + r13
            r11 = r6[r4]
            if (r7 >= r11) goto L1c
            r7 = r6[r13]
            int r7 = r7 + r13
            r11 = 5
            r11 = r6[r11]
            if (r7 >= r11) goto L1c
            r7 = r6[r13]
            int r7 = r7 + r13
            r9 = r6[r9]
            if (r7 >= r9) goto L1c
            r7 = r6[r13]
            int r7 = r7 + r13
            r8 = r6[r8]
            if (r7 >= r8) goto L1c
            r7 = r6[r13]
            r8 = r6[r10]
            if (r7 >= r8) goto L1e0
            return r13
        L1e0:
            r7 = r6[r13]
            r6 = r6[r10]
            if (r7 != r6) goto L1c
            int r1 = r1 + r5
            int r1 = r1 + r13
        L1e8:
            int r2 = r19.length()
            if (r1 >= r2) goto L202
            char r2 = r0.charAt(r1)
            boolean r3 = m8608w(r2)
            if (r3 == 0) goto L1f9
            return r10
        L1f9:
            boolean r2 = m8604s(r2)
            if (r2 == 0) goto L202
            int r1 = r1 + 1
            goto L1e8
        L202:
            return r13
        L203:
            r0 = 5
            return r0
    }

    /* renamed from: B */
    public static final <T> java.util.Set<T> m8573B(T... r4) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r4.length
            int r1 = p185k7.C4038x4.m9097j(r1)
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L16
            r3 = r4[r2]
            r0.add(r3)
            int r2 = r2 + 1
            goto Lc
        L16:
            return r0
    }

    /* renamed from: C */
    public static void m8574C(android.view.View r2, float r3) {
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            boolean r0 = r2 instanceof p340t8.C6189f
            if (r0 == 0) goto L17
            t8.f r2 = (p340t8.C6189f) r2
            t8.f$b r0 = r2.f24036Y
            float r1 = r0.f24073o
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L17
            r0.f24073o = r3
            r2.m12781y()
        L17:
            return
    }

    /* renamed from: D */
    public static void m8575D(android.view.View r2, p340t8.C6189f r3) {
            t8.f$b r0 = r3.f24036Y
            j8.a r0 = r0.f24060b
            if (r0 == 0) goto Lc
            boolean r0 = r0.f14920a
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L20
            float r2 = p220m8.C4430n.m9885c(r2)
            t8.f$b r0 = r3.f24036Y
            float r1 = r0.f24072n
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L20
            r0.f24072n = r2
            r3.m12781y()
        L20:
            return
    }

    /* renamed from: E */
    public static <T> void m8576E(java.util.List<T> r2, p010a9.InterfaceC0039g<? super T> r3, int r4, int r5) {
            int r0 = r2.size()
        L4:
            int r0 = r0 + (-1)
            if (r0 <= r5) goto L16
            java.lang.Object r1 = r2.get(r0)
            boolean r1 = r3.apply(r1)
            if (r1 == 0) goto L4
            r2.remove(r0)
            goto L4
        L16:
            int r5 = r5 + (-1)
            if (r5 < r4) goto L1e
            r2.remove(r5)
            goto L16
        L1e:
            return
    }

    /* renamed from: F */
    public static final <A, B> ch.C0978e<A, B> m8577F(A r1, B r2) {
            ch.e r0 = new ch.e
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: G */
    public static void m8578G(byte[] r4, long r5, int r7) {
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto L13
            int r1 = r7 + r0
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r5
            int r3 = (int) r2
            byte r2 = (byte) r3
            r4[r1] = r2
            int r0 = r0 + 1
            r1 = 8
            long r5 = r5 >> r1
            goto L1
        L13:
            return
    }

    /* renamed from: H */
    public static final android.net.Uri m8579H(java.lang.String r1) {
            if (r1 == 0) goto L7
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L8
        L7:
            r1 = 0
        L8:
            if (r1 != 0) goto L11
            android.net.Uri r1 = android.net.Uri.EMPTY
            java.lang.String r0 = "EMPTY"
            p214m2.C4339q.m9705j(r1, r0)
        L11:
            return r1
    }

    /* renamed from: I */
    public static void m8580I() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called from the main thread."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: J */
    public static final void m8581J(java.nio.ByteBuffer r3, java.nio.ByteBuffer r4, java.nio.ByteBuffer r5, int r6) {
            if (r6 < 0) goto L28
            int r0 = r4.remaining()
            if (r0 < r6) goto L28
            int r0 = r5.remaining()
            if (r0 < r6) goto L28
            int r0 = r3.remaining()
            if (r0 < r6) goto L28
            r0 = 0
        L15:
            if (r0 >= r6) goto L27
            byte r1 = r4.get()
            byte r2 = r5.get()
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r3.put(r1)
            int r0 = r0 + 1
            goto L15
        L27:
            return
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "That combination of buffers, offsets and length to xor result in out-of-bond accesses."
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: K */
    public static final byte[] m8582K(byte[] r4, int r5, byte[] r6, int r7, int r8) {
            if (r8 < 0) goto L1f
            int r0 = r4.length
            int r0 = r0 - r8
            if (r0 < r5) goto L1f
            int r0 = r6.length
            int r0 = r0 - r8
            if (r0 < r7) goto L1f
            byte[] r0 = new byte[r8]
            r1 = 0
        Ld:
            if (r1 >= r8) goto L1e
            int r2 = r1 + r5
            r2 = r4[r2]
            int r3 = r1 + r7
            r3 = r6[r3]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L1e:
            return r0
        L1f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "That combination of buffers, offsets and length to xor result in out-of-bond accesses."
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: L */
    public static final byte[] m8583L(byte[] r2, byte[] r3) {
            int r0 = r2.length
            int r1 = r3.length
            if (r0 != r1) goto Lb
            int r0 = r2.length
            r1 = 0
            byte[] r2 = m8582K(r2, r1, r3, r1, r0)
            return r2
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The lengths of x and y should match."
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: M */
    public static java.lang.String m8584M(p185k7.AbstractC3842i5 r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.mo8520h()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r5.mo8520h()
            if (r1 >= r2) goto L70
            byte r2 = r5.mo8518a(r1)
            r3 = 34
            if (r2 == r3) goto L6a
            r3 = 39
            if (r2 == r3) goto L67
            r3 = 92
            if (r2 == r3) goto L64
            switch(r2) {
                case 7: goto L5e;
                case 8: goto L5b;
                case 9: goto L58;
                case 10: goto L55;
                case 11: goto L52;
                case 12: goto L4f;
                case 13: goto L4c;
                default: goto L23;
            }
        L23:
            r4 = 32
            if (r2 < r4) goto L2c
            r4 = 126(0x7e, float:1.77E-43)
            if (r2 > r4) goto L2c
            goto L47
        L2c:
            r0.append(r3)
            int r3 = r2 >>> 6
            r3 = r3 & 3
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            int r3 = r2 >>> 3
            r3 = r3 & 7
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            r2 = r2 & 7
            int r2 = r2 + 48
        L47:
            char r2 = (char) r2
            r0.append(r2)
            goto L6d
        L4c:
            java.lang.String r2 = "\\r"
            goto L60
        L4f:
            java.lang.String r2 = "\\f"
            goto L60
        L52:
            java.lang.String r2 = "\\v"
            goto L60
        L55:
            java.lang.String r2 = "\\n"
            goto L60
        L58:
            java.lang.String r2 = "\\t"
            goto L60
        L5b:
            java.lang.String r2 = "\\b"
            goto L60
        L5e:
            java.lang.String r2 = "\\a"
        L60:
            r0.append(r2)
            goto L6d
        L64:
            java.lang.String r2 = "\\\\"
            goto L60
        L67:
            java.lang.String r2 = "\\'"
            goto L60
        L6a:
            java.lang.String r2 = "\\\""
            goto L60
        L6d:
            int r1 = r1 + 1
            goto La
        L70:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* renamed from: N */
    public static java.util.List<p375v9.AbstractC6621s> m8585N(java.util.List<p124h7.C2788oe> r10) {
            if (r10 == 0) goto L42
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L9
            goto L42
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L12:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r10.next()
            h7.oe r1 = (p124h7.C2788oe) r1
            r2 = 0
            if (r1 != 0) goto L22
            goto L3b
        L22:
            java.lang.String r3 = r1.f11807Y
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L3b
            v9.w r2 = new v9.w
            java.lang.String r5 = r1.f11808Z
            java.lang.String r6 = r1.f11809a0
            long r7 = r1.f11810b0
            java.lang.String r9 = r1.f11807Y
            com.google.android.gms.common.internal.C1101a.m3100e(r9)
            r4 = r2
            r4.<init>(r5, r6, r7, r9)
        L3b:
            if (r2 == 0) goto L12
            r0.add(r2)
            goto L12
        L41:
            return r0
        L42:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            return r10
    }

    /* renamed from: a */
    public static int m8586a(p387w5.C6800c r10, boolean r11) {
            if (r11 == 0) goto L5
            int r0 = r10.f26410c
            goto L7
        L5:
            int r0 = r10.f26409b
        L7:
            if (r11 == 0) goto Lc
            int r1 = r10.f26409b
            goto Le
        Lc:
            int r1 = r10.f26410c
        Le:
            java.lang.Object r10 = r10.f26411d
            byte[][] r10 = (byte[][]) r10
            r2 = 0
            r3 = 0
            r4 = 0
        L15:
            if (r3 >= r0) goto L45
            r5 = -1
            r6 = 0
            r7 = 0
        L1a:
            r8 = 5
            if (r6 >= r1) goto L3a
            if (r11 == 0) goto L24
            r9 = r10[r3]
            r9 = r9[r6]
            goto L28
        L24:
            r9 = r10[r6]
            r9 = r9[r3]
        L28:
            if (r9 != r5) goto L2d
            int r7 = r7 + 1
            goto L37
        L2d:
            if (r7 < r8) goto L34
            int r7 = r7 + (-5)
            int r7 = r7 + 3
            int r4 = r4 + r7
        L34:
            r5 = 1
            r5 = r9
            r7 = 1
        L37:
            int r6 = r6 + 1
            goto L1a
        L3a:
            if (r7 < r8) goto L42
            int r7 = r7 + (-5)
            int r7 = r7 + 3
            int r7 = r7 + r4
            r4 = r7
        L42:
            int r3 = r3 + 1
            goto L15
        L45:
            return r4
    }

    /* renamed from: b */
    public static void m8587b(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    /* renamed from: c */
    public static byte[] m8588c(byte[] r54, byte[] r55) {
            r0 = r54
            r1 = r55
            int r2 = r0.length
            r3 = 32
            if (r2 != r3) goto L221
            r2 = 0
            long r4 = m8611z(r0, r2)
            long r4 = r4 >> r2
            r6 = 67108863(0x3ffffff, double:3.31561837E-316)
            long r4 = r4 & r6
            long r4 = r4 & r6
            r8 = 3
            long r9 = m8611z(r0, r8)
            r11 = 2
            long r9 = r9 >> r11
            long r9 = r9 & r6
            r12 = 67108611(0x3ffff03, double:3.3156059E-316)
            long r9 = r9 & r12
            r12 = 6
            long r13 = m8611z(r0, r12)
            r15 = 4
            long r13 = r13 >> r15
            long r13 = r13 & r6
            r16 = 67092735(0x3ffc0ff, double:3.31482154E-316)
            long r13 = r13 & r16
            r3 = 9
            long r17 = m8611z(r0, r3)
            long r17 = r17 >> r12
            long r17 = r17 & r6
            r19 = 66076671(0x3f03fff, double:3.2646213E-316)
            long r17 = r17 & r19
            r3 = 12
            long r20 = m8611z(r0, r3)
            r3 = 8
            long r20 = r20 >> r3
            long r20 = r20 & r6
            r22 = 1048575(0xfffff, double:5.18065E-318)
            long r20 = r20 & r22
            r22 = 5
            long r24 = r9 * r22
            long r26 = r13 * r22
            long r28 = r17 * r22
            long r30 = r20 * r22
            r3 = 17
            byte[] r15 = new byte[r3]
            r33 = 0
            r35 = r33
            r37 = r35
            r39 = r37
            r41 = r39
            r12 = 0
        L66:
            int r11 = r1.length
            r8 = 16
            r44 = 26
            if (r12 >= r11) goto L156
            int r11 = r1.length
            int r11 = r11 - r12
            int r11 = java.lang.Math.min(r8, r11)
            java.lang.System.arraycopy(r1, r12, r15, r2, r11)
            r45 = 1
            r15[r11] = r45
            if (r11 == r8) goto L81
            int r11 = r11 + 1
            java.util.Arrays.fill(r15, r11, r3, r2)
        L81:
            long r45 = m8611z(r15, r2)
            long r45 = r45 >> r2
            long r45 = r45 & r6
            long r41 = r41 + r45
            r11 = 3
            long r45 = m8611z(r15, r11)
            r43 = 2
            long r45 = r45 >> r43
            long r45 = r45 & r6
            long r33 = r33 + r45
            r3 = 6
            long r45 = m8611z(r15, r3)
            r32 = 4
            long r45 = r45 >> r32
            long r45 = r45 & r6
            long r35 = r35 + r45
            r11 = 9
            long r46 = m8611z(r15, r11)
            long r46 = r46 >> r3
            long r46 = r46 & r6
            long r37 = r37 + r46
            r3 = 12
            long r46 = m8611z(r15, r3)
            r3 = 8
            long r46 = r46 >> r3
            long r46 = r46 & r6
            r3 = r15[r8]
            r8 = 24
            int r3 = r3 << r8
            long r2 = (long) r3
            long r2 = r46 | r2
            long r39 = r39 + r2
            long r2 = r41 * r4
            long r46 = r33 * r30
            long r46 = r46 + r2
            long r2 = r35 * r28
            long r2 = r2 + r46
            long r46 = r37 * r26
            long r46 = r46 + r2
            long r2 = r39 * r24
            long r2 = r2 + r46
            long r46 = r41 * r9
            long r48 = r33 * r4
            long r48 = r48 + r46
            long r46 = r35 * r30
            long r46 = r46 + r48
            long r48 = r37 * r28
            long r48 = r48 + r46
            long r46 = r39 * r26
            long r46 = r46 + r48
            long r48 = r41 * r13
            long r50 = r33 * r9
            long r50 = r50 + r48
            long r48 = r35 * r4
            long r48 = r48 + r50
            long r50 = r37 * r30
            long r50 = r50 + r48
            long r48 = r39 * r28
            long r48 = r48 + r50
            long r50 = r41 * r17
            long r52 = r33 * r13
            long r52 = r52 + r50
            long r50 = r35 * r9
            long r50 = r50 + r52
            long r52 = r37 * r4
            long r52 = r52 + r50
            long r50 = r39 * r30
            long r50 = r50 + r52
            long r41 = r41 * r20
            long r33 = r33 * r17
            long r33 = r33 + r41
            long r35 = r35 * r13
            long r35 = r35 + r33
            long r37 = r37 * r9
            long r37 = r37 + r35
            long r39 = r39 * r4
            long r39 = r39 + r37
            long r33 = r2 >> r44
            long r2 = r2 & r6
            long r46 = r46 + r33
            long r33 = r46 >> r44
            long r35 = r46 & r6
            long r48 = r48 + r33
            long r33 = r48 >> r44
            long r37 = r48 & r6
            long r50 = r50 + r33
            long r33 = r50 >> r44
            long r41 = r50 & r6
            long r39 = r39 + r33
            long r33 = r39 >> r44
            long r39 = r39 & r6
            long r33 = r33 * r22
            long r33 = r33 + r2
            long r2 = r33 >> r44
            long r33 = r33 & r6
            long r2 = r35 + r2
            int r12 = r12 + 16
            r35 = r37
            r37 = r41
            r8 = 3
            r41 = r33
            r33 = r2
            r2 = 0
            r3 = 17
            goto L66
        L156:
            long r1 = r33 >> r44
            long r3 = r33 & r6
            long r35 = r35 + r1
            long r1 = r35 >> r44
            long r9 = r35 & r6
            long r37 = r37 + r1
            long r1 = r37 >> r44
            long r11 = r37 & r6
            long r39 = r39 + r1
            long r1 = r39 >> r44
            long r13 = r39 & r6
            long r1 = r1 * r22
            long r1 = r1 + r41
            long r17 = r1 >> r44
            long r1 = r1 & r6
            long r3 = r3 + r17
            long r22 = r1 + r22
            long r17 = r22 >> r44
            long r20 = r22 & r6
            long r17 = r3 + r17
            long r22 = r17 >> r44
            long r17 = r17 & r6
            long r22 = r9 + r22
            long r24 = r22 >> r44
            long r22 = r22 & r6
            long r24 = r11 + r24
            long r26 = r24 >> r44
            long r5 = r24 & r6
            long r26 = r13 + r26
            r24 = 67108864(0x4000000, double:3.3156184E-316)
            long r26 = r26 - r24
            r7 = 63
            r24 = r9
            long r8 = r26 >> r7
            long r1 = r1 & r8
            long r3 = r3 & r8
            long r24 = r24 & r8
            long r10 = r11 & r8
            long r12 = r13 & r8
            long r7 = ~r8
            long r20 = r20 & r7
            long r1 = r1 | r20
            long r17 = r17 & r7
            long r3 = r3 | r17
            long r17 = r22 & r7
            long r17 = r24 | r17
            long r5 = r5 & r7
            long r5 = r5 | r10
            long r7 = r26 & r7
            long r7 = r7 | r12
            long r9 = r3 << r44
            long r1 = r1 | r9
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r9
            r11 = 6
            long r3 = r3 >> r11
            r11 = 20
            long r12 = r17 << r11
            long r3 = r3 | r12
            long r3 = r3 & r9
            r12 = 12
            long r13 = r17 >> r12
            r12 = 14
            long r17 = r5 << r12
            long r12 = r13 | r17
            long r12 = r12 & r9
            r14 = 18
            long r5 = r5 >> r14
            r14 = 8
            long r7 = r7 << r14
            long r5 = r5 | r7
            long r5 = r5 & r9
            r7 = 16
            long r17 = m8611z(r0, r7)
            long r17 = r17 + r1
            long r1 = r17 & r9
            long r7 = m8611z(r0, r11)
            long r7 = r7 + r3
            r3 = 32
            long r16 = r17 >> r3
            long r7 = r7 + r16
            long r3 = r7 & r9
            r11 = 24
            long r17 = m8611z(r0, r11)
            long r17 = r17 + r12
            r11 = 32
            long r7 = r7 >> r11
            long r17 = r17 + r7
            long r7 = r17 & r9
            r12 = 28
            long r12 = m8611z(r0, r12)
            long r12 = r12 + r5
            long r5 = r17 >> r11
            long r12 = r12 + r5
            long r5 = r12 & r9
            r0 = 16
            byte[] r0 = new byte[r0]
            r9 = 0
            m8578G(r0, r1, r9)
            r1 = 4
            m8578G(r0, r3, r1)
            r1 = 8
            m8578G(r0, r7, r1)
            r1 = 12
            m8578G(r0, r5, r1)
            return r0
        L221:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The key length in bytes must be 32."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: d */
    public static byte[] m8589d(byte[]... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto L1c
            r4 = r7[r2]
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r6 = r4.length
            int r5 = r5 - r6
            if (r3 > r5) goto L14
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L14:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "exceeded size limit"
            r7.<init>(r0)
            throw r7
        L1c:
            byte[] r0 = new byte[r3]
            int r2 = r7.length
            r3 = 0
            r4 = 0
        L21:
            if (r3 >= r2) goto L2e
            r5 = r7[r3]
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r1, r0, r4, r6)
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L21
        L2e:
            return r0
    }

    /* renamed from: e */
    public static final boolean m8590e(java.lang.String r2, java.lang.String r3) {
            if (r2 == 0) goto L1b
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r1 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p214m2.C4339q.m9705j(r2, r1)
            java.lang.String r3 = r3.toLowerCase(r0)
            p214m2.C4339q.m9705j(r3, r1)
            r0 = 0
            r1 = 2
            boolean r2 = p362uh.C6467m.m13064U(r2, r3, r0, r1)
            goto L1f
        L1b:
            boolean r2 = p214m2.C4339q.m9702c(r2, r3)
        L1f:
            return r2
    }

    /* renamed from: f */
    public static p422y.C7095e m8591f(int r1) {
            if (r1 == 0) goto L11
            r0 = 1
            if (r1 == r0) goto Lb
            t8.h r1 = new t8.h
            r1.<init>()
            return r1
        Lb:
            t8.d r1 = new t8.d
            r1.<init>()
            return r1
        L11:
            t8.h r1 = new t8.h
            r1.<init>()
            return r1
    }

    /* renamed from: g */
    public static p340t8.C6188e m8592g() {
            t8.e r0 = new t8.e
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    /* renamed from: h */
    public static float m8593h(float r0, float r1, float r2, float r3) {
            float r2 = r2 - r0
            float r3 = r3 - r1
            double r0 = (double) r2
            double r2 = (double) r3
            double r0 = java.lang.Math.hypot(r0, r2)
            float r0 = (float) r0
            return r0
    }

    /* renamed from: i */
    public static final boolean m8594i(byte[] r5, byte[] r6) {
            r0 = 0
            if (r5 == 0) goto L1c
            if (r6 != 0) goto L6
            goto L1c
        L6:
            int r1 = r5.length
            int r2 = r6.length
            if (r1 == r2) goto Lb
            return r0
        Lb:
            r1 = 0
            r2 = 0
        Ld:
            int r3 = r5.length
            if (r1 >= r3) goto L19
            r3 = r5[r1]
            r4 = r6[r1]
            r3 = r3 ^ r4
            r2 = r2 | r3
            int r1 = r1 + 1
            goto Ld
        L19:
            if (r2 != 0) goto L1c
            r0 = 1
        L1c:
            return r0
    }

    /* renamed from: j */
    public static int m8595j(float[] r4, int[] r5, int r6, byte[] r7) {
            r0 = 0
            java.util.Arrays.fill(r7, r0)
            r1 = 0
        L5:
            r2 = 6
            if (r1 >= r2) goto L26
            r2 = r4[r1]
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r5[r1] = r2
            r2 = r5[r1]
            if (r6 <= r2) goto L1a
            java.util.Arrays.fill(r7, r0)
            r6 = r2
        L1a:
            if (r6 != r2) goto L23
            r2 = r7[r1]
            int r2 = r2 + 1
            byte r2 = (byte) r2
            r7[r1] = r2
        L23:
            int r1 = r1 + 1
            goto L5
        L26:
            return r6
    }

    /* renamed from: k */
    public static <T extends java.lang.Exception> T m8596k(java.lang.Class r1, java.lang.Exception r2) {
            java.lang.Class r0 = r2.getClass()
            if (r0 != r1) goto L7
            return r2
        L7:
            java.lang.Throwable r0 = r2.getCause()
            if (r0 != 0) goto Lf
            r1 = 0
            return r1
        Lf:
            java.lang.Throwable r2 = r2.getCause()
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.lang.Exception r1 = m8596k(r1, r2)
            return r1
    }

    /* renamed from: l */
    public static final java.lang.String m8597l(p105g2.C2226t r2) {
            boolean r0 = r2 instanceof p105g2.C2217k
            if (r0 == 0) goto L5
            goto L23
        L5:
            boolean r0 = r2 instanceof p105g2.C2224r
            if (r0 == 0) goto L1a
            java.lang.String r0 = "Server error ("
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            g2.l r2 = r2.f10175Y
            int r2 = r2.f10135a
            r1 = 41
            java.lang.String r2 = p084f0.C1939b.m4826a(r0, r2, r1)
            goto L35
        L1a:
            boolean r0 = r2 instanceof p105g2.C2207a
            if (r0 == 0) goto L1f
            goto L23
        L1f:
            boolean r0 = r2 instanceof p105g2.C2219m
            if (r0 == 0) goto L26
        L23:
            java.lang.String r2 = "Cannot connect to Internet...Please check your connection!"
            goto L35
        L26:
            boolean r0 = r2 instanceof p105g2.C2225s
            if (r0 == 0) goto L2d
            java.lang.String r2 = "Connection TimeOut! Please check your internet connection."
            goto L35
        L2d:
            java.lang.String r2 = r2.getMessage()
            if (r2 != 0) goto L35
            java.lang.String r2 = "(unknow)"
        L35:
            return r2
    }

    /* renamed from: m */
    public static <T> T m8598m(java.lang.Iterable<? extends T> r1, T r2) {
            b9.j0$a r1 = (p026b9.C0707j0.a) r1
            b9.i0 r0 = new b9.i0
            r0.<init>(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L11
            java.lang.Object r2 = r0.next()
        L11:
            return r2
    }

    /* renamed from: n */
    public static final vg.C6668i m8599n(androidx.fragment.app.ComponentCallbacksC0395n r13) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r13, r0)
            android.content.Context r0 = r13.m1334s0()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "null cannot be cast to non-null type io.tacocrypto.app.TacoApplication"
            java.util.Objects.requireNonNull(r0, r1)
            r3 = r0
            io.tacocrypto.app.TacoApplication r3 = (io.tacocrypto.app.TacoApplication) r3
            nd.b0 r4 = r3.m7708c()
            io.tacocrypto.app.database.AppDatabase r6 = r3.m7706a()
            nd.u r5 = r3.m7707b()
            nd.j1 r7 = r3.m7710e()
            nd.k1 r8 = r3.m7711f()
            nd.c1 r9 = r3.m7709d()
            vg.i r0 = new vg.i
            r11 = 0
            r12 = 256(0x100, float:3.59E-43)
            r2 = r0
            r10 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    /* renamed from: o */
    public static final vg.C6668i m8600o(p083f.ActivityC1921h r13) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r13, r0)
            android.content.Context r0 = r13.getApplicationContext()
            java.lang.String r1 = "null cannot be cast to non-null type io.tacocrypto.app.TacoApplication"
            java.util.Objects.requireNonNull(r0, r1)
            r3 = r0
            io.tacocrypto.app.TacoApplication r3 = (io.tacocrypto.app.TacoApplication) r3
            nd.b0 r4 = r3.m7708c()
            io.tacocrypto.app.database.AppDatabase r6 = r3.m7706a()
            nd.u r5 = r3.m7707b()
            nd.j1 r7 = r3.m7710e()
            nd.k1 r8 = r3.m7711f()
            nd.c1 r9 = r3.m7709d()
            vg.i r0 = new vg.i
            r11 = 0
            r12 = 256(0x100, float:3.59E-43)
            r2 = r0
            r10 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    /* renamed from: p */
    public static void m8601p(char r5) {
            java.lang.String r0 = java.lang.Integer.toHexString(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.length()
            int r2 = 4 - r2
            java.lang.String r3 = "0000"
            r4 = 0
            java.lang.String r2 = r3.substring(r4, r2)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Illegal character: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = " (0x"
            r2.append(r5)
            r2.append(r0)
            r5 = 41
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    /* renamed from: q */
    public static boolean m8602q(char r1) {
            r0 = 48
            if (r1 < r0) goto La
            r0 = 57
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    /* renamed from: r */
    public static boolean m8603r(char r1) {
            r0 = 128(0x80, float:1.8E-43)
            if (r1 < r0) goto La
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    /* renamed from: s */
    public static boolean m8604s(char r1) {
            boolean r0 = m8608w(r1)
            if (r0 != 0) goto L1d
            r0 = 32
            if (r1 == r0) goto L1d
            r0 = 48
            if (r1 < r0) goto L12
            r0 = 57
            if (r1 <= r0) goto L1d
        L12:
            r0 = 65
            if (r1 < r0) goto L1b
            r0 = 90
            if (r1 > r0) goto L1b
            goto L1d
        L1b:
            r1 = 0
            return r1
        L1d:
            r1 = 1
            return r1
    }

    /* renamed from: t */
    public static boolean m8605t(java.lang.String r1) {
            int r0 = p010a9.C0038f.f86a
            if (r1 == 0) goto Ld
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }

    /* renamed from: u */
    public static boolean m8606u(byte[] r3, int r4, int r5) {
            r0 = 0
            int r4 = java.lang.Math.max(r4, r0)
            int r1 = r3.length
            int r5 = java.lang.Math.min(r5, r1)
        La:
            r1 = 1
            if (r4 >= r5) goto L15
            r2 = r3[r4]
            if (r2 != r1) goto L12
            return r0
        L12:
            int r4 = r4 + 1
            goto La
        L15:
            return r1
    }

    /* renamed from: v */
    public static boolean m8607v(byte[][] r3, int r4, int r5, int r6) {
            r0 = 0
            int r5 = java.lang.Math.max(r5, r0)
            int r1 = r3.length
            int r6 = java.lang.Math.min(r6, r1)
        La:
            r1 = 1
            if (r5 >= r6) goto L17
            r2 = r3[r5]
            r2 = r2[r4]
            if (r2 != r1) goto L14
            return r0
        L14:
            int r5 = r5 + 1
            goto La
        L17:
            return r1
    }

    /* renamed from: w */
    public static boolean m8608w(char r1) {
            r0 = 13
            if (r1 == r0) goto Lf
            r0 = 42
            if (r1 == r0) goto Lf
            r0 = 62
            if (r1 != r0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    /* renamed from: x */
    public static java.lang.String m8609x(java.lang.String r9, java.lang.Object... r10) {
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0 = 0
            r1 = 0
        L6:
            int r2 = r10.length
            if (r1 >= r2) goto L81
            r2 = r10[r1]
            if (r2 != 0) goto L10
            java.lang.String r2 = "null"
            goto L7c
        L10:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L15
            goto L7c
        L15:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r2.getClass()
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            r5 = 64
            r4.append(r5)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "com.google.common.base.Strings"
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Exception during lenientFormat for "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r4.log(r5, r6, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "<"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " threw "
            r4.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r4.append(r2)
            java.lang.String r2 = ">"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L7c:
            r10[r1] = r2
            int r1 = r1 + 1
            goto L6
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r9.length()
            int r3 = r10.length
            int r3 = r3 * 16
            int r3 = r3 + r2
            r1.<init>(r3)
            r2 = 0
        L8f:
            int r3 = r10.length
            if (r0 >= r3) goto Lac
            java.lang.String r3 = "%s"
            int r3 = r9.indexOf(r3, r2)
            r4 = -1
            if (r3 != r4) goto L9c
            goto Lac
        L9c:
            r1.append(r9, r2, r3)
            int r2 = r0 + 1
            r0 = r10[r0]
            r1.append(r0)
            int r0 = r3 + 2
            r8 = r2
            r2 = r0
            r0 = r8
            goto L8f
        Lac:
            int r3 = r9.length()
            r1.append(r9, r2, r3)
            int r9 = r10.length
            if (r0 >= r9) goto Ld8
            java.lang.String r9 = " ["
            r1.append(r9)
            int r9 = r0 + 1
            r0 = r10[r0]
            r1.append(r0)
        Lc2:
            int r0 = r10.length
            if (r9 >= r0) goto Ld3
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r9 + 1
            r9 = r10[r9]
            r1.append(r9)
            r9 = r0
            goto Lc2
        Ld3:
            r9 = 93
            r1.append(r9)
        Ld8:
            java.lang.String r9 = r1.toString()
            return r9
    }

    /* renamed from: y */
    public static float m8610y(float r1, float r2, float r3) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r3
            float r0 = r0 * r1
            float r3 = r3 * r2
            float r3 = r3 + r0
            return r3
    }

    /* renamed from: z */
    public static long m8611z(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }
}

package p221m9;

/* renamed from: m9.r1 */
/* loaded from: classes.dex */
public final class C4486r1 {

    /* renamed from: a */
    public static final p221m9.C4486r1.b f18221a = null;

    /* renamed from: m9.r1$a */
    public static class a {
        /* renamed from: a */
        public static void m10286a(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
                boolean r0 = m10290e(r3)
                if (r0 != 0) goto L41
                int r0 = r2 << 28
                int r1 = r3 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L41
                boolean r0 = m10290e(r4)
                if (r0 != 0) goto L41
                boolean r0 = m10290e(r5)
                if (r0 != 0) goto L41
                r2 = r2 & 7
                int r2 = r2 << 18
                r3 = r3 & 63
                int r3 = r3 << 12
                r2 = r2 | r3
                r3 = r4 & 63
                int r3 = r3 << 6
                r2 = r2 | r3
                r3 = r5 & 63
                r2 = r2 | r3
                int r3 = r2 >>> 10
                r4 = 55232(0xd7c0, float:7.7397E-41)
                int r3 = r3 + r4
                char r3 = (char) r3
                r6[r7] = r3
                int r7 = r7 + 1
                r2 = r2 & 1023(0x3ff, float:1.434E-42)
                r3 = 56320(0xdc00, float:7.8921E-41)
                int r2 = r2 + r3
                char r2 = (char) r2
                r6[r7] = r2
                return
            L41:
                m9.a0 r2 = p221m9.C4434a0.m9897c()
                throw r2
        }

        /* renamed from: b */
        public static boolean m10287b(byte r0) {
                if (r0 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                return r0
        }

        /* renamed from: c */
        public static void m10288c(byte r1, byte r2, char[] r3, int r4) {
                r0 = -62
                if (r1 < r0) goto L15
                boolean r0 = m10290e(r2)
                if (r0 != 0) goto L15
                r1 = r1 & 31
                int r1 = r1 << 6
                r2 = r2 & 63
                r1 = r1 | r2
                char r1 = (char) r1
                r3[r4] = r1
                return
            L15:
                m9.a0 r1 = p221m9.C4434a0.m9897c()
                throw r1
        }

        /* renamed from: d */
        public static void m10289d(byte r2, byte r3, byte r4, char[] r5, int r6) {
                boolean r0 = m10290e(r3)
                if (r0 != 0) goto L2a
                r0 = -32
                r1 = -96
                if (r2 != r0) goto Le
                if (r3 < r1) goto L2a
            Le:
                r0 = -19
                if (r2 != r0) goto L14
                if (r3 >= r1) goto L2a
            L14:
                boolean r0 = m10290e(r4)
                if (r0 != 0) goto L2a
                r2 = r2 & 15
                int r2 = r2 << 12
                r3 = r3 & 63
                int r3 = r3 << 6
                r2 = r2 | r3
                r3 = r4 & 63
                r2 = r2 | r3
                char r2 = (char) r2
                r5[r6] = r2
                return
            L2a:
                m9.a0 r2 = p221m9.C4434a0.m9897c()
                throw r2
        }

        /* renamed from: e */
        public static boolean m10290e(byte r1) {
                r0 = -65
                if (r1 <= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }
    }

    /* renamed from: m9.r1$b */
    public static abstract class b {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract java.lang.String mo10291a(byte[] r1, int r2, int r3);

        /* renamed from: b */
        public abstract int mo10292b(java.lang.CharSequence r1, byte[] r2, int r3, int r4);

        /* renamed from: c */
        public abstract int mo10293c(int r1, byte[] r2, int r3, int r4);
    }

    /* renamed from: m9.r1$c */
    public static final class c extends p221m9.C4486r1.b {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p221m9.C4486r1.b
        /* renamed from: a */
        public java.lang.String mo10291a(byte[] r12, int r13, int r14) {
                r11 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r13
                int r1 = r1 - r14
                r0 = r0 | r1
                r1 = 0
                r2 = 1
                if (r0 < 0) goto Lb2
                int r0 = r13 + r14
                char[] r14 = new char[r14]
                r3 = 0
            Lf:
                if (r13 >= r0) goto L23
                r4 = r12[r13]
                boolean r5 = p221m9.C4486r1.a.m10287b(r4)
                if (r5 != 0) goto L1a
                goto L23
            L1a:
                int r13 = r13 + 1
                int r5 = r3 + 1
                char r4 = (char) r4
                r14[r3] = r4
                r3 = r5
                goto Lf
            L23:
                r8 = r3
            L24:
                if (r13 >= r0) goto Lac
                int r3 = r13 + 1
                r13 = r12[r13]
                boolean r4 = p221m9.C4486r1.a.m10287b(r13)
                if (r4 == 0) goto L4a
                int r4 = r8 + 1
                char r13 = (char) r13
                r14[r8] = r13
                r13 = r3
            L36:
                r8 = r4
                if (r13 >= r0) goto L24
                r3 = r12[r13]
                boolean r4 = p221m9.C4486r1.a.m10287b(r3)
                if (r4 != 0) goto L42
                goto L24
            L42:
                int r13 = r13 + 1
                int r4 = r8 + 1
                char r3 = (char) r3
                r14[r8] = r3
                goto L36
            L4a:
                r4 = -32
                if (r13 >= r4) goto L50
                r4 = 1
                goto L51
            L50:
                r4 = 0
            L51:
                if (r4 == 0) goto L66
                if (r3 >= r0) goto L61
                int r4 = r3 + 1
                r3 = r12[r3]
                int r5 = r8 + 1
                p221m9.C4486r1.a.m10288c(r13, r3, r14, r8)
                r13 = r4
                r8 = r5
                goto L24
            L61:
                m9.a0 r12 = p221m9.C4434a0.m9897c()
                throw r12
            L66:
                r4 = -16
                if (r13 >= r4) goto L6c
                r4 = 1
                goto L6d
            L6c:
                r4 = 0
            L6d:
                if (r4 == 0) goto L88
                int r4 = r0 + (-1)
                if (r3 >= r4) goto L83
                int r4 = r3 + 1
                r3 = r12[r3]
                int r5 = r4 + 1
                r4 = r12[r4]
                int r6 = r8 + 1
                p221m9.C4486r1.a.m10289d(r13, r3, r4, r14, r8)
                r13 = r5
                r8 = r6
                goto L24
            L83:
                m9.a0 r12 = p221m9.C4434a0.m9897c()
                throw r12
            L88:
                int r4 = r0 + (-2)
                if (r3 >= r4) goto La7
                int r4 = r3 + 1
                r5 = r12[r3]
                int r3 = r4 + 1
                r6 = r12[r4]
                int r9 = r3 + 1
                r7 = r12[r3]
                int r10 = r8 + 1
                r3 = r13
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r14
                p221m9.C4486r1.a.m10286a(r3, r4, r5, r6, r7, r8)
                int r8 = r10 + 1
                r13 = r9
                goto L24
            La7:
                m9.a0 r12 = p221m9.C4434a0.m9897c()
                throw r12
            Lac:
                java.lang.String r12 = new java.lang.String
                r12.<init>(r14, r1, r8)
                return r12
            Lb2:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r3[r1] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
                r3[r2] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
                r13 = 2
                r3[r13] = r12
                java.lang.String r12 = "buffer length=%d, index=%d, size=%d"
                java.lang.String r12 = java.lang.String.format(r12, r3)
                r0.<init>(r12)
                throw r0
        }

        @Override // p221m9.C4486r1.b
        /* renamed from: b */
        public int mo10292b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
                r7 = this;
                int r0 = r8.length()
                int r11 = r11 + r10
                r1 = 0
            L6:
                r2 = 128(0x80, float:1.8E-43)
                if (r1 >= r0) goto L1a
                int r3 = r1 + r10
                if (r3 >= r11) goto L1a
                char r4 = r8.charAt(r1)
                if (r4 >= r2) goto L1a
                byte r2 = (byte) r4
                r9[r3] = r2
                int r1 = r1 + 1
                goto L6
            L1a:
                if (r1 != r0) goto L1e
                int r10 = r10 + r0
                return r10
            L1e:
                int r10 = r10 + r1
            L1f:
                if (r1 >= r0) goto Lfd
                char r3 = r8.charAt(r1)
                if (r3 >= r2) goto L31
                if (r10 >= r11) goto L31
                int r4 = r10 + 1
                byte r3 = (byte) r3
                r9[r10] = r3
            L2e:
                r10 = r4
                goto Lb5
            L31:
                r4 = 2048(0x800, float:2.87E-42)
                if (r3 >= r4) goto L4b
                int r4 = r11 + (-2)
                if (r10 > r4) goto L4b
                int r4 = r10 + 1
                int r5 = r3 >>> 6
                r5 = r5 | 960(0x3c0, float:1.345E-42)
                byte r5 = (byte) r5
                r9[r10] = r5
                int r10 = r4 + 1
                r3 = r3 & 63
                r3 = r3 | r2
                byte r3 = (byte) r3
                r9[r4] = r3
                goto Lb5
            L4b:
                r4 = 57343(0xdfff, float:8.0355E-41)
                r5 = 55296(0xd800, float:7.7486E-41)
                if (r3 < r5) goto L55
                if (r4 >= r3) goto L75
            L55:
                int r6 = r11 + (-3)
                if (r10 > r6) goto L75
                int r4 = r10 + 1
                int r5 = r3 >>> 12
                r5 = r5 | 480(0x1e0, float:6.73E-43)
                byte r5 = (byte) r5
                r9[r10] = r5
                int r10 = r4 + 1
                int r5 = r3 >>> 6
                r5 = r5 & 63
                r5 = r5 | r2
                byte r5 = (byte) r5
                r9[r4] = r5
                int r4 = r10 + 1
                r3 = r3 & 63
                r3 = r3 | r2
                byte r3 = (byte) r3
                r9[r10] = r3
                goto L2e
            L75:
                int r6 = r11 + (-4)
                if (r10 > r6) goto Lc2
                int r4 = r1 + 1
                int r5 = r8.length()
                if (r4 == r5) goto Lba
                char r1 = r8.charAt(r4)
                boolean r5 = java.lang.Character.isSurrogatePair(r3, r1)
                if (r5 == 0) goto Lb9
                int r1 = java.lang.Character.toCodePoint(r3, r1)
                int r3 = r10 + 1
                int r5 = r1 >>> 18
                r5 = r5 | 240(0xf0, float:3.36E-43)
                byte r5 = (byte) r5
                r9[r10] = r5
                int r10 = r3 + 1
                int r5 = r1 >>> 12
                r5 = r5 & 63
                r5 = r5 | r2
                byte r5 = (byte) r5
                r9[r3] = r5
                int r3 = r10 + 1
                int r5 = r1 >>> 6
                r5 = r5 & 63
                r5 = r5 | r2
                byte r5 = (byte) r5
                r9[r10] = r5
                int r10 = r3 + 1
                r1 = r1 & 63
                r1 = r1 | r2
                byte r1 = (byte) r1
                r9[r3] = r1
                r1 = r4
            Lb5:
                int r1 = r1 + 1
                goto L1f
            Lb9:
                r1 = r4
            Lba:
                m9.r1$d r8 = new m9.r1$d
                int r1 = r1 + (-1)
                r8.<init>(r1, r0)
                throw r8
            Lc2:
                if (r5 > r3) goto Lde
                if (r3 > r4) goto Lde
                int r9 = r1 + 1
                int r11 = r8.length()
                if (r9 == r11) goto Ld8
                char r8 = r8.charAt(r9)
                boolean r8 = java.lang.Character.isSurrogatePair(r3, r8)
                if (r8 != 0) goto Lde
            Ld8:
                m9.r1$d r8 = new m9.r1$d
                r8.<init>(r1, r0)
                throw r8
            Lde:
                java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "Failed writing "
                r9.append(r11)
                r9.append(r3)
                java.lang.String r11 = " at index "
                r9.append(r11)
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
            Lfd:
                return r10
        }

        @Override // p221m9.C4486r1.b
        /* renamed from: c */
        public int mo10293c(int r12, byte[] r13, int r14, int r15) {
                r11 = this;
                r0 = -19
                r1 = -62
                r2 = -16
                r3 = 0
                r4 = -96
                r5 = -32
                r6 = -1
                r7 = -65
                if (r12 == 0) goto L85
                if (r14 < r15) goto L13
                return r12
            L13:
                byte r8 = (byte) r12
                if (r8 >= r5) goto L23
                if (r8 < r1) goto L22
                int r12 = r14 + 1
                r14 = r13[r14]
                if (r14 <= r7) goto L1f
                goto L22
            L1f:
                r14 = r12
                goto L85
            L22:
                return r6
            L23:
                if (r8 >= r2) goto L4a
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L39
                int r12 = r14 + 1
                r14 = r13[r14]
                if (r12 < r15) goto L36
                int r12 = p221m9.C4486r1.m10281a(r8, r14)
                return r12
            L36:
                r10 = r14
                r14 = r12
                r12 = r10
            L39:
                if (r12 > r7) goto L49
                if (r8 != r5) goto L3f
                if (r12 < r4) goto L49
            L3f:
                if (r8 != r0) goto L43
                if (r12 >= r4) goto L49
            L43:
                int r12 = r14 + 1
                r14 = r13[r14]
                if (r14 <= r7) goto L1f
            L49:
                return r6
            L4a:
                int r9 = r12 >> 8
                int r9 = ~r9
                byte r9 = (byte) r9
                if (r9 != 0) goto L5e
                int r12 = r14 + 1
                r9 = r13[r14]
                if (r12 < r15) goto L5b
                int r12 = p221m9.C4486r1.m10281a(r8, r9)
                return r12
            L5b:
                r14 = r12
                r12 = 0
                goto L61
            L5e:
                int r12 = r12 >> 16
                byte r12 = (byte) r12
            L61:
                if (r12 != 0) goto L71
                int r12 = r14 + 1
                r14 = r13[r14]
                if (r12 < r15) goto L6e
                int r12 = p221m9.C4486r1.m10284d(r8, r9, r14)
                return r12
            L6e:
                r10 = r14
                r14 = r12
                r12 = r10
            L71:
                if (r9 > r7) goto L84
                int r8 = r8 << 28
                int r9 = r9 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L84
                if (r12 > r7) goto L84
                int r12 = r14 + 1
                r14 = r13[r14]
                if (r14 <= r7) goto L1f
            L84:
                return r6
            L85:
                if (r14 >= r15) goto L8e
                r12 = r13[r14]
                if (r12 < 0) goto L8e
                int r14 = r14 + 1
                goto L85
            L8e:
                if (r14 < r15) goto L91
                goto Lea
            L91:
                if (r14 < r15) goto L94
                goto Lea
            L94:
                int r12 = r14 + 1
                r14 = r13[r14]
                if (r14 >= 0) goto Leb
                if (r14 >= r5) goto La9
                if (r12 < r15) goto La0
                r3 = r14
                goto Lea
            La0:
                if (r14 < r1) goto Le9
                int r14 = r12 + 1
                r12 = r13[r12]
                if (r12 <= r7) goto L91
                goto Le9
            La9:
                if (r14 >= r2) goto Lc5
                int r8 = r15 + (-1)
                if (r12 < r8) goto Lb0
                goto Lc9
            Lb0:
                int r8 = r12 + 1
                r12 = r13[r12]
                if (r12 > r7) goto Le9
                if (r14 != r5) goto Lba
                if (r12 < r4) goto Le9
            Lba:
                if (r14 != r0) goto Lbe
                if (r12 >= r4) goto Le9
            Lbe:
                int r14 = r8 + 1
                r12 = r13[r8]
                if (r12 <= r7) goto L91
                goto Le9
            Lc5:
                int r8 = r15 + (-2)
                if (r12 < r8) goto Lce
            Lc9:
                int r3 = p221m9.C4486r1.m10282b(r13, r12, r15)
                goto Lea
            Lce:
                int r8 = r12 + 1
                r12 = r13[r12]
                if (r12 > r7) goto Le9
                int r14 = r14 << 28
                int r12 = r12 + 112
                int r12 = r12 + r14
                int r12 = r12 >> 30
                if (r12 != 0) goto Le9
                int r12 = r8 + 1
                r14 = r13[r8]
                if (r14 > r7) goto Le9
                int r14 = r12 + 1
                r12 = r13[r12]
                if (r12 <= r7) goto L91
            Le9:
                r3 = -1
            Lea:
                return r3
            Leb:
                r14 = r12
                goto L91
        }
    }

    /* renamed from: m9.r1$d */
    public static class d extends java.lang.IllegalArgumentException {
        public d(int r3, int r4) {
                r2 = this;
                java.lang.String r0 = "Unpaired surrogate at index "
                java.lang.String r1 = " of "
                java.lang.String r3 = p243o1.C4872b.m11020a(r0, r3, r1, r4)
                r2.<init>(r3)
                return
        }
    }

    /* renamed from: m9.r1$e */
    public static final class e extends p221m9.C4486r1.b {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: d */
        public static int m10294d(byte[] r2, int r3, long r4, int r6) {
                if (r6 == 0) goto L27
                r0 = 1
                if (r6 == r0) goto L1e
                r0 = 2
                if (r6 != r0) goto L18
                byte r6 = p221m9.C4483q1.m10243g(r2, r4)
                r0 = 1
                long r4 = r4 + r0
                byte r2 = p221m9.C4483q1.m10243g(r2, r4)
                int r2 = p221m9.C4486r1.m10284d(r3, r6, r2)
                return r2
            L18:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L1e:
                byte r2 = p221m9.C4483q1.m10243g(r2, r4)
                int r2 = p221m9.C4486r1.m10281a(r3, r2)
                return r2
            L27:
                m9.r1$b r2 = p221m9.C4486r1.f18221a
                r2 = -12
                if (r3 <= r2) goto L2e
                r3 = -1
            L2e:
                return r3
        }

        @Override // p221m9.C4486r1.b
        /* renamed from: a */
        public java.lang.String mo10291a(byte[] r12, int r13, int r14) {
                r11 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r13
                int r1 = r1 - r14
                r0 = r0 | r1
                r1 = 0
                r2 = 1
                if (r0 < 0) goto Lcd
                int r0 = r13 + r14
                char[] r14 = new char[r14]
                r3 = 0
            Lf:
                if (r13 >= r0) goto L26
                long r4 = (long) r13
                byte r4 = p221m9.C4483q1.m10243g(r12, r4)
                boolean r5 = p221m9.C4486r1.a.m10287b(r4)
                if (r5 != 0) goto L1d
                goto L26
            L1d:
                int r13 = r13 + 1
                int r5 = r3 + 1
                char r4 = (char) r4
                r14[r3] = r4
                r3 = r5
                goto Lf
            L26:
                r8 = r3
            L27:
                if (r13 >= r0) goto Lc7
                int r3 = r13 + 1
                long r4 = (long) r13
                byte r13 = p221m9.C4483q1.m10243g(r12, r4)
                boolean r4 = p221m9.C4486r1.a.m10287b(r13)
                if (r4 == 0) goto L53
                int r4 = r8 + 1
                char r13 = (char) r13
                r14[r8] = r13
                r13 = r3
            L3c:
                r8 = r4
                if (r13 >= r0) goto L27
                long r3 = (long) r13
                byte r3 = p221m9.C4483q1.m10243g(r12, r3)
                boolean r4 = p221m9.C4486r1.a.m10287b(r3)
                if (r4 != 0) goto L4b
                goto L27
            L4b:
                int r13 = r13 + 1
                int r4 = r8 + 1
                char r3 = (char) r3
                r14[r8] = r3
                goto L3c
            L53:
                r4 = -32
                if (r13 >= r4) goto L59
                r4 = 1
                goto L5a
            L59:
                r4 = 0
            L5a:
                if (r4 == 0) goto L72
                if (r3 >= r0) goto L6d
                int r4 = r3 + 1
                long r5 = (long) r3
                byte r3 = p221m9.C4483q1.m10243g(r12, r5)
                int r5 = r8 + 1
                p221m9.C4486r1.a.m10288c(r13, r3, r14, r8)
                r13 = r4
                r8 = r5
                goto L27
            L6d:
                m9.a0 r12 = p221m9.C4434a0.m9897c()
                throw r12
            L72:
                r4 = -16
                if (r13 >= r4) goto L78
                r4 = 1
                goto L79
            L78:
                r4 = 0
            L79:
                if (r4 == 0) goto L9a
                int r4 = r0 + (-1)
                if (r3 >= r4) goto L95
                int r4 = r3 + 1
                long r5 = (long) r3
                byte r3 = p221m9.C4483q1.m10243g(r12, r5)
                int r5 = r4 + 1
                long r6 = (long) r4
                byte r4 = p221m9.C4483q1.m10243g(r12, r6)
                int r6 = r8 + 1
                p221m9.C4486r1.a.m10289d(r13, r3, r4, r14, r8)
                r13 = r5
                r8 = r6
                goto L27
            L95:
                m9.a0 r12 = p221m9.C4434a0.m9897c()
                throw r12
            L9a:
                int r4 = r0 + (-2)
                if (r3 >= r4) goto Lc2
                int r4 = r3 + 1
                long r5 = (long) r3
                byte r5 = p221m9.C4483q1.m10243g(r12, r5)
                int r3 = r4 + 1
                long r6 = (long) r4
                byte r6 = p221m9.C4483q1.m10243g(r12, r6)
                int r9 = r3 + 1
                long r3 = (long) r3
                byte r7 = p221m9.C4483q1.m10243g(r12, r3)
                int r10 = r8 + 1
                r3 = r13
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r14
                p221m9.C4486r1.a.m10286a(r3, r4, r5, r6, r7, r8)
                int r8 = r10 + 1
                r13 = r9
                goto L27
            Lc2:
                m9.a0 r12 = p221m9.C4434a0.m9897c()
                throw r12
            Lc7:
                java.lang.String r12 = new java.lang.String
                r12.<init>(r14, r1, r8)
                return r12
            Lcd:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r3[r1] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
                r3[r2] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
                r13 = 2
                r3[r13] = r12
                java.lang.String r12 = "buffer length=%d, index=%d, size=%d"
                java.lang.String r12 = java.lang.String.format(r12, r3)
                r0.<init>(r12)
                throw r0
        }

        @Override // p221m9.C4486r1.b
        /* renamed from: b */
        public int mo10292b(java.lang.CharSequence r19, byte[] r20, int r21, int r22) {
                r18 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                r3 = r22
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r19.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L130
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L130
                r2 = 0
            L1a:
                r3 = 128(0x80, float:1.8E-43)
                r11 = 1
                if (r2 >= r8) goto L2f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L2f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                p221m9.C4483q1.m10253q(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L1a
            L2f:
                if (r2 != r8) goto L33
                int r0 = (int) r4
                return r0
            L33:
                if (r2 >= r8) goto L12e
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L46
                int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r3 >= 0) goto L46
                long r14 = r4 + r11
                byte r3 = (byte) r13
                p221m9.C4483q1.m10253q(r1, r4, r3)
                goto L9e
            L46:
                r3 = 2048(0x800, float:2.87E-42)
                if (r13 >= r3) goto L69
                r14 = 2
                long r14 = r6 - r14
                int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r3 > 0) goto L69
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                p221m9.C4483q1.m10253q(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                p221m9.C4483q1.m10253q(r1, r14, r5)
                r4 = r3
                goto Lec
            L69:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L73
                if (r3 >= r13) goto La0
            L73:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto La0
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                p221m9.C4483q1.m10253q(r1, r4, r3)
                long r11 = r11 + r14
                int r3 = r13 >>> 6
                r3 = r3 & 63
                r3 = r3 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                p221m9.C4483q1.m10253q(r1, r14, r3)
                r3 = 1
                long r14 = r11 + r3
                r3 = r13 & 63
                r3 = r3 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                p221m9.C4483q1.m10253q(r1, r11, r3)
                r11 = 1
            L9e:
                r4 = r14
                goto Lec
            La0:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto Lfb
                int r3 = r2 + 1
                if (r3 == r8) goto Lf3
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto Lf2
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                p221m9.C4483q1.m10253q(r1, r4, r15)
                long r11 = r11 + r13
                int r4 = r2 >>> 12
                r4 = r4 & 63
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                p221m9.C4483q1.m10253q(r1, r13, r4)
                r4 = 1
                long r4 = r4 + r11
                int r13 = r2 >>> 6
                r13 = r13 & 63
                r13 = r13 | 128(0x80, float:1.8E-43)
                byte r13 = (byte) r13
                p221m9.C4483q1.m10253q(r1, r11, r13)
                r11 = 1
                long r13 = r4 + r11
                r2 = r2 & 63
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                p221m9.C4483q1.m10253q(r1, r4, r2)
                r2 = r3
                r4 = r13
            Lec:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.8E-43)
                goto L33
            Lf2:
                r2 = r3
            Lf3:
                m9.r1$d r0 = new m9.r1$d
                int r2 = r2 + (-1)
                r0.<init>(r2, r8)
                throw r0
            Lfb:
                if (r14 > r13) goto L113
                if (r13 > r3) goto L113
                int r1 = r2 + 1
                if (r1 == r8) goto L10d
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L113
            L10d:
                m9.r1$d r0 = new m9.r1$d
                r0.<init>(r2, r8)
                throw r0
            L113:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L12e:
                int r0 = (int) r4
                return r0
            L130:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r10)
                int r8 = r8 + (-1)
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
        }

        @Override // p221m9.C4486r1.b
        /* renamed from: c */
        public int mo10293c(int r24, byte[] r25, int r26, int r27) {
                r23 = this;
                r0 = r24
                r1 = r25
                r2 = r26
                r3 = r27
                r4 = r2 | r3
                int r5 = r1.length
                int r5 = r5 - r3
                r4 = r4 | r5
                r5 = 2
                if (r4 < 0) goto L14d
                long r8 = (long) r2
                long r2 = (long) r3
                r4 = -19
                r10 = -62
                r11 = -16
                r12 = 16
                r13 = -96
                r14 = -32
                r15 = -65
                r16 = -1
                r17 = 1
                if (r0 == 0) goto Lb1
                int r19 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r19 < 0) goto L2b
                return r0
            L2b:
                byte r7 = (byte) r0
                if (r7 >= r14) goto L3e
                if (r7 < r10) goto L3d
                long r20 = r8 + r17
                byte r0 = p221m9.C4483q1.m10243g(r1, r8)
                if (r0 <= r15) goto L39
                goto L3d
            L39:
                r8 = r20
                goto Lb1
            L3d:
                return r16
            L3e:
                if (r7 >= r11) goto L6a
                int r0 = r0 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L57
                long r20 = r8 + r17
                byte r0 = p221m9.C4483q1.m10243g(r1, r8)
                int r8 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
                if (r8 < 0) goto L55
                int r0 = p221m9.C4486r1.m10281a(r7, r0)
                return r0
            L55:
                r8 = r20
            L57:
                if (r0 > r15) goto L69
                if (r7 != r14) goto L5d
                if (r0 < r13) goto L69
            L5d:
                if (r7 != r4) goto L61
                if (r0 >= r13) goto L69
            L61:
                long r20 = r8 + r17
                byte r0 = p221m9.C4483q1.m10243g(r1, r8)
                if (r0 <= r15) goto L39
            L69:
                return r16
            L6a:
                int r6 = r0 >> 8
                int r6 = ~r6
                byte r6 = (byte) r6
                if (r6 != 0) goto L83
                long r21 = r8 + r17
                byte r6 = p221m9.C4483q1.m10243g(r1, r8)
                int r0 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
                if (r0 < 0) goto L7f
                int r0 = p221m9.C4486r1.m10281a(r7, r6)
                return r0
            L7f:
                r8 = r21
                r0 = 0
                goto L85
            L83:
                int r0 = r0 >> r12
                byte r0 = (byte) r0
            L85:
                if (r0 != 0) goto L98
                long r21 = r8 + r17
                byte r0 = p221m9.C4483q1.m10243g(r1, r8)
                int r8 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
                if (r8 < 0) goto L96
                int r0 = p221m9.C4486r1.m10284d(r7, r6, r0)
                return r0
            L96:
                r8 = r21
            L98:
                if (r6 > r15) goto Lb0
                int r7 = r7 << 28
                int r6 = r6 + 112
                int r6 = r6 + r7
                int r6 = r6 >> 30
                if (r6 != 0) goto Lb0
                if (r0 > r15) goto Lb0
                long r6 = r8 + r17
                byte r0 = p221m9.C4483q1.m10243g(r1, r8)
                if (r0 <= r15) goto Lae
                goto Lb0
            Lae:
                r8 = r6
                goto Lb1
            Lb0:
                return r16
            Lb1:
                long r2 = r2 - r8
                int r0 = (int) r2
                if (r0 >= r12) goto Lb7
                r2 = 0
                goto Lca
            Lb7:
                r6 = r8
                r2 = 0
            Lb9:
                if (r2 >= r0) goto Lc9
                long r21 = r6 + r17
                byte r3 = p221m9.C4483q1.m10243g(r1, r6)
                if (r3 >= 0) goto Lc4
                goto Lca
            Lc4:
                int r2 = r2 + 1
                r6 = r21
                goto Lb9
            Lc9:
                r2 = r0
            Lca:
                int r0 = r0 - r2
                long r2 = (long) r2
                long r8 = r8 + r2
            Lcd:
                r2 = 0
            Lce:
                if (r0 <= 0) goto Ldf
                long r2 = r8 + r17
                byte r6 = p221m9.C4483q1.m10243g(r1, r8)
                if (r6 < 0) goto Ldd
                int r0 = r0 + (-1)
                r8 = r2
                r2 = r6
                goto Lce
            Ldd:
                r8 = r2
                r2 = r6
            Ldf:
                if (r0 != 0) goto Le4
                r7 = 0
                goto L14c
            Le4:
                int r0 = r0 + (-1)
                if (r2 >= r14) goto Lfe
                if (r0 != 0) goto Led
                r7 = r2
                goto L14c
            Led:
                int r0 = r0 + (-1)
                if (r2 < r10) goto Lfc
                long r2 = r8 + r17
                byte r6 = p221m9.C4483q1.m10243g(r1, r8)
                if (r6 <= r15) goto Lfa
                goto Lfc
            Lfa:
                r8 = r2
                goto Lcd
            Lfc:
                r7 = -1
                goto L14c
            Lfe:
                if (r2 >= r11) goto L11e
                if (r0 >= r5) goto L103
                goto L121
            L103:
                int r0 = r0 + (-2)
                long r6 = r8 + r17
                byte r3 = p221m9.C4483q1.m10243g(r1, r8)
                if (r3 > r15) goto Lfc
                if (r2 != r14) goto L111
                if (r3 < r13) goto Lfc
            L111:
                if (r2 != r4) goto L115
                if (r3 >= r13) goto Lfc
            L115:
                long r8 = r6 + r17
                byte r2 = p221m9.C4483q1.m10243g(r1, r6)
                if (r2 <= r15) goto Lcd
                goto Lfc
            L11e:
                r3 = 3
                if (r0 >= r3) goto L126
            L121:
                int r7 = m10294d(r1, r2, r8, r0)
                goto L14c
            L126:
                int r0 = r0 + (-3)
                long r6 = r8 + r17
                byte r3 = p221m9.C4483q1.m10243g(r1, r8)
                if (r3 > r15) goto Lfc
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r3 = r3 + r2
                int r2 = r3 >> 30
                if (r2 != 0) goto Lfc
                long r2 = r6 + r17
                byte r6 = p221m9.C4483q1.m10243g(r1, r6)
                if (r6 > r15) goto Lfc
                long r6 = r2 + r17
                byte r2 = p221m9.C4483q1.m10243g(r1, r2)
                if (r2 <= r15) goto L14a
                goto Lfc
            L14a:
                r8 = r6
                goto Lcd
            L14c:
                return r7
            L14d:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r1 = r1.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6 = 0
                r4[r6] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
                r2 = 1
                r4[r2] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
                r4[r5] = r1
                java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            boolean r0 = p221m9.C4483q1.f18217h
            if (r0 == 0) goto La
            boolean r0 = p221m9.C4483q1.f18216g
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L19
            boolean r0 = p221m9.C4442d.m9915a()
            if (r0 != 0) goto L19
            m9.r1$e r0 = new m9.r1$e
            r0.<init>()
            goto L1e
        L19:
            m9.r1$c r0 = new m9.r1$c
            r0.<init>()
        L1e:
            p221m9.C4486r1.f18221a = r0
            return
    }

    /* renamed from: a */
    public static int m10281a(int r1, int r2) {
            r0 = -12
            if (r1 > r0) goto Ld
            r0 = -65
            if (r2 <= r0) goto L9
            goto Ld
        L9:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            goto Le
        Ld:
            r1 = -1
        Le:
            return r1
    }

    /* renamed from: b */
    public static int m10282b(byte[] r4, int r5, int r6) {
            int r0 = r5 + (-1)
            r0 = r4[r0]
            int r6 = r6 - r5
            r1 = -1
            r2 = -12
            if (r6 == 0) goto L2f
            r3 = 1
            if (r6 == r3) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            r6 = r4[r5]
            int r5 = r5 + r3
            r4 = r4[r5]
            int r4 = m10284d(r0, r6, r4)
            goto L33
        L1a:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L20:
            r4 = r4[r5]
            if (r0 > r2) goto L2d
            r5 = -65
            if (r4 <= r5) goto L29
            goto L2d
        L29:
            int r4 = r4 << 8
            r1 = r0 ^ r4
        L2d:
            r4 = r1
            goto L33
        L2f:
            if (r0 <= r2) goto L32
            r0 = -1
        L32:
            r4 = r0
        L33:
            return r4
    }

    /* renamed from: c */
    public static int m10283c(java.lang.CharSequence r8) {
            int r0 = r8.length()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L13
            char r3 = r8.charAt(r2)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L13
            int r2 = r2 + 1
            goto L6
        L13:
            r3 = r0
        L14:
            if (r2 >= r0) goto L59
            char r4 = r8.charAt(r2)
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L26
            int r4 = 127 - r4
            int r4 = r4 >>> 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L14
        L26:
            int r4 = r8.length()
        L2a:
            if (r2 >= r4) goto L58
            char r6 = r8.charAt(r2)
            if (r6 >= r5) goto L38
            int r6 = 127 - r6
            int r6 = r6 >>> 31
            int r1 = r1 + r6
            goto L55
        L38:
            int r1 = r1 + 2
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r7 > r6) goto L55
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r6 > r7) goto L55
            int r6 = java.lang.Character.codePointAt(r8, r2)
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 < r7) goto L4f
            int r2 = r2 + 1
            goto L55
        L4f:
            m9.r1$d r8 = new m9.r1$d
            r8.<init>(r2, r4)
            throw r8
        L55:
            int r2 = r2 + 1
            goto L2a
        L58:
            int r3 = r3 + r1
        L59:
            if (r3 < r0) goto L5c
            return r3
        L5c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "UTF-8 length does not fit in int: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = (long) r3
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 + r3
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }

    /* renamed from: d */
    public static int m10284d(int r1, int r2, int r3) {
            r0 = -12
            if (r1 > r0) goto L12
            r0 = -65
            if (r2 > r0) goto L12
            if (r3 <= r0) goto Lb
            goto L12
        Lb:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            int r2 = r3 << 16
            r1 = r1 ^ r2
            goto L13
        L12:
            r1 = -1
        L13:
            return r1
    }

    /* renamed from: e */
    public static boolean m10285e(byte[] r2, int r3, int r4) {
            m9.r1$b r0 = p221m9.C4486r1.f18221a
            r1 = 0
            int r2 = r0.mo10293c(r1, r2, r3, r4)
            if (r2 != 0) goto La
            r1 = 1
        La:
            return r1
    }
}

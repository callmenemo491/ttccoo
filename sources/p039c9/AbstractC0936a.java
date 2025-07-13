package p039c9;

/* renamed from: c9.a */
/* loaded from: classes.dex */
public abstract class AbstractC0936a {

    /* renamed from: a */
    public static final p039c9.AbstractC0936a f4902a = null;

    /* renamed from: c9.a$a */
    public static final class a {

        /* renamed from: a */
        public final java.lang.String f4903a;

        /* renamed from: b */
        public final char[] f4904b;

        /* renamed from: c */
        public final int f4905c;

        /* renamed from: d */
        public final int f4906d;

        /* renamed from: e */
        public final int f4907e;

        /* renamed from: f */
        public final int f4908f;

        /* renamed from: g */
        public final byte[] f4909g;

        /* renamed from: h */
        public final boolean[] f4910h;

        public a(java.lang.String r9, char[] r10) {
                r8 = this;
                r8.<init>()
                java.util.Objects.requireNonNull(r9)
                r8.f4903a = r9
                java.util.Objects.requireNonNull(r10)
                r8.f4904b = r10
                int r9 = r10.length     // Catch: java.lang.ArithmeticException -> L8b
                java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L8b
                int r9 = p055d9.C1345a.m3843b(r9, r0)     // Catch: java.lang.ArithmeticException -> L8b
                r8.f4906d = r9     // Catch: java.lang.ArithmeticException -> L8b
                int r0 = java.lang.Integer.lowestOneBit(r9)
                r1 = 8
                int r0 = java.lang.Math.min(r1, r0)
                int r1 = r1 / r0
                r8.f4907e = r1     // Catch: java.lang.ArithmeticException -> L72
                int r9 = r9 / r0
                r8.f4908f = r9     // Catch: java.lang.ArithmeticException -> L72
                int r9 = r10.length
                r0 = 1
                int r9 = r9 - r0
                r8.f4905c = r9
                r9 = 128(0x80, float:1.8E-43)
                byte[] r1 = new byte[r9]
                r2 = -1
                java.util.Arrays.fill(r1, r2)
                r3 = 0
                r4 = 0
            L35:
                int r5 = r10.length
                if (r4 >= r5) goto L56
                char r5 = r10[r4]
                if (r5 >= r9) goto L3e
                r6 = 1
                goto L3f
            L3e:
                r6 = 0
            L3f:
                java.lang.String r7 = "Non-ASCII character: %s"
                p124h7.C2939x3.m7278d(r6, r7, r5)
                r6 = r1[r5]
                if (r6 != r2) goto L4a
                r6 = 1
                goto L4b
            L4a:
                r6 = 0
            L4b:
                java.lang.String r7 = "Duplicate character: %s"
                p124h7.C2939x3.m7278d(r6, r7, r5)
                byte r6 = (byte) r4
                r1[r5] = r6
                int r4 = r4 + 1
                goto L35
            L56:
                r8.f4909g = r1
                int r9 = r8.f4907e
                boolean[] r9 = new boolean[r9]
            L5c:
                int r10 = r8.f4908f
                if (r3 >= r10) goto L6f
                int r10 = r3 * 8
                int r1 = r8.f4906d
                java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
                int r10 = p055d9.C1345a.m3842a(r10, r1, r2)
                r9[r10] = r0
                int r3 = r3 + 1
                goto L5c
            L6f:
                r8.f4910h = r9
                return
            L72:
                r9 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Illegal alphabet "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r2 = new java.lang.String
                r2.<init>(r10)
                r1.append(r2)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10, r9)
                throw r0
            L8b:
                r9 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Illegal alphabet length "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                int r10 = r10.length
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10, r9)
                throw r0
        }

        /* renamed from: a */
        public int m2657a(char r5) {
                r4 = this;
                java.lang.String r0 = "Unrecognized character: 0x"
                r1 = 127(0x7f, float:1.78E-43)
                if (r5 > r1) goto L41
                byte[] r2 = r4.f4909g
                r2 = r2[r5]
                r3 = -1
                if (r2 != r3) goto L40
                r2 = 32
                if (r5 <= r2) goto L2b
                if (r5 != r1) goto L14
                goto L2b
            L14:
                c9.a$d r0 = new c9.a$d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unrecognized character: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            L2b:
                c9.a$d r1 = new c9.a$d
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r5 = java.lang.Integer.toHexString(r5)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r1.<init>(r5)
                throw r1
            L40:
                return r2
            L41:
                c9.a$d r1 = new c9.a$d
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r5 = java.lang.Integer.toHexString(r5)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r1.<init>(r5)
                throw r1
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof p039c9.AbstractC0936a.a
                if (r0 == 0) goto Lf
                c9.a$a r2 = (p039c9.AbstractC0936a.a) r2
                char[] r0 = r1.f4904b
                char[] r2 = r2.f4904b
                boolean r2 = java.util.Arrays.equals(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                char[] r0 = r1.f4904b
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.f4903a
                return r0
        }
    }

    /* renamed from: c9.a$b */
    public static final class b extends p039c9.AbstractC0936a.e {

        /* renamed from: e */
        public final char[] f4911e;

        public b(p039c9.AbstractC0936a.a r6) {
                r5 = this;
                r0 = 0
                r5.<init>(r6, r0)
                r0 = 512(0x200, float:7.17E-43)
                char[] r0 = new char[r0]
                r5.f4911e = r0
                char[] r0 = r6.f4904b
                int r0 = r0.length
                r1 = 0
                r2 = 16
                if (r0 != r2) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                p124h7.C2939x3.m7276b(r0)
            L18:
                r0 = 256(0x100, float:3.59E-43)
                if (r1 >= r0) goto L31
                char[] r0 = r5.f4911e
                int r2 = r1 >>> 4
                char[] r3 = r6.f4904b
                char r2 = r3[r2]
                r0[r1] = r2
                r2 = r1 | 256(0x100, float:3.59E-43)
                r4 = r1 & 15
                char r3 = r3[r4]
                r0[r2] = r3
                int r1 = r1 + 1
                goto L18
            L31:
                return
        }

        @Override // p039c9.AbstractC0936a.e, p039c9.AbstractC0936a
        /* renamed from: a */
        public int mo2654a(byte[] r6, java.lang.CharSequence r7) {
                r5 = this;
                int r0 = r7.length()
                int r0 = r0 % 2
                r1 = 1
                if (r0 == r1) goto L34
                r0 = 0
                r1 = 0
            Lb:
                int r2 = r7.length()
                if (r0 >= r2) goto L33
                c9.a$a r2 = r5.f4912b
                char r3 = r7.charAt(r0)
                int r2 = r2.m2657a(r3)
                int r2 = r2 << 4
                c9.a$a r3 = r5.f4912b
                int r4 = r0 + 1
                char r4 = r7.charAt(r4)
                int r3 = r3.m2657a(r4)
                r2 = r2 | r3
                int r3 = r1 + 1
                byte r2 = (byte) r2
                r6[r1] = r2
                int r0 = r0 + 2
                r1 = r3
                goto Lb
            L33:
                return r1
            L34:
                c9.a$d r6 = new c9.a$d
                java.lang.String r0 = "Invalid input length "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                int r7 = r7.length()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r6.<init>(r7)
                throw r6
        }

        @Override // p039c9.AbstractC0936a.e, p039c9.AbstractC0936a
        /* renamed from: b */
        public void mo2655b(java.lang.Appendable r4, byte[] r5, int r6, int r7) {
                r3 = this;
                int r0 = r6 + r7
                int r1 = r5.length
                p124h7.C2939x3.m7283i(r6, r0, r1)
                r0 = 0
            L7:
                if (r0 >= r7) goto L22
                int r1 = r6 + r0
                r1 = r5[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                char[] r2 = r3.f4911e
                char r2 = r2[r1]
                r4.append(r2)
                char[] r2 = r3.f4911e
                r1 = r1 | 256(0x100, float:3.59E-43)
                char r1 = r2[r1]
                r4.append(r1)
                int r0 = r0 + 1
                goto L7
            L22:
                return
        }

        @Override // p039c9.AbstractC0936a.e
        /* renamed from: e */
        public p039c9.AbstractC0936a mo2658e(p039c9.AbstractC0936a.a r1, java.lang.Character r2) {
                r0 = this;
                c9.a$b r2 = new c9.a$b
                r2.<init>(r1)
                return r2
        }
    }

    /* renamed from: c9.a$c */
    public static final class c extends p039c9.AbstractC0936a.e {
        public c(p039c9.AbstractC0936a.a r1, java.lang.Character r2) {
                r0 = this;
                r0.<init>(r1, r2)
                char[] r1 = r1.f4904b
                int r1 = r1.length
                r2 = 64
                if (r1 != r2) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                p124h7.C2939x3.m7276b(r1)
                return
        }

        public c(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
                r1 = this;
                c9.a$a r0 = new c9.a$a
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0, r4)
                char[] r2 = r0.f4904b
                int r2 = r2.length
                r3 = 64
                if (r2 != r3) goto L15
                r2 = 1
                goto L16
            L15:
                r2 = 0
            L16:
                p124h7.C2939x3.m7276b(r2)
                return
        }

        @Override // p039c9.AbstractC0936a.e, p039c9.AbstractC0936a
        /* renamed from: a */
        public int mo2654a(byte[] r6, java.lang.CharSequence r7) {
                r5 = this;
                java.lang.CharSequence r7 = r5.mo2656c(r7)
                c9.a$a r0 = r5.f4912b
                int r1 = r7.length()
                boolean[] r2 = r0.f4910h
                int r0 = r0.f4907e
                int r1 = r1 % r0
                boolean r0 = r2[r1]
                if (r0 == 0) goto L7e
                r0 = 0
                r1 = 0
            L15:
                int r2 = r7.length()
                if (r0 >= r2) goto L7d
                c9.a$a r2 = r5.f4912b
                int r3 = r0 + 1
                char r0 = r7.charAt(r0)
                int r0 = r2.m2657a(r0)
                int r0 = r0 << 18
                c9.a$a r2 = r5.f4912b
                int r4 = r3 + 1
                char r3 = r7.charAt(r3)
                int r2 = r2.m2657a(r3)
                int r2 = r2 << 12
                r0 = r0 | r2
                int r2 = r1 + 1
                int r3 = r0 >>> 16
                byte r3 = (byte) r3
                r6[r1] = r3
                int r1 = r7.length()
                if (r4 >= r1) goto L7a
                c9.a$a r1 = r5.f4912b
                int r3 = r4 + 1
                char r4 = r7.charAt(r4)
                int r1 = r1.m2657a(r4)
                int r1 = r1 << 6
                r0 = r0 | r1
                int r1 = r2 + 1
                int r4 = r0 >>> 8
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r6[r2] = r4
                int r2 = r7.length()
                if (r3 >= r2) goto L78
                c9.a$a r2 = r5.f4912b
                int r4 = r3 + 1
                char r3 = r7.charAt(r3)
                int r2 = r2.m2657a(r3)
                r0 = r0 | r2
                int r2 = r1 + 1
                r0 = r0 & 255(0xff, float:3.57E-43)
                byte r0 = (byte) r0
                r6[r1] = r0
                goto L7a
            L78:
                r0 = r3
                goto L15
            L7a:
                r1 = r2
                r0 = r4
                goto L15
            L7d:
                return r1
            L7e:
                c9.a$d r6 = new c9.a$d
                java.lang.String r0 = "Invalid input length "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                int r7 = r7.length()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r6.<init>(r7)
                throw r6
        }

        @Override // p039c9.AbstractC0936a.e, p039c9.AbstractC0936a
        /* renamed from: b */
        public void mo2655b(java.lang.Appendable r5, byte[] r6, int r7, int r8) {
                r4 = this;
                int r0 = r7 + r8
                int r1 = r6.length
                p124h7.C2939x3.m7283i(r7, r0, r1)
            L6:
                r1 = 3
                if (r8 < r1) goto L55
                int r1 = r7 + 1
                r7 = r6[r7]
                r7 = r7 & 255(0xff, float:3.57E-43)
                int r7 = r7 << 16
                int r2 = r1 + 1
                r1 = r6[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 8
                r7 = r7 | r1
                int r1 = r2 + 1
                r2 = r6[r2]
                r2 = r2 & 255(0xff, float:3.57E-43)
                r7 = r7 | r2
                c9.a$a r2 = r4.f4912b
                int r3 = r7 >>> 18
                char[] r2 = r2.f4904b
                char r2 = r2[r3]
                r5.append(r2)
                c9.a$a r2 = r4.f4912b
                int r3 = r7 >>> 12
                r3 = r3 & 63
                char[] r2 = r2.f4904b
                char r2 = r2[r3]
                r5.append(r2)
                c9.a$a r2 = r4.f4912b
                int r3 = r7 >>> 6
                r3 = r3 & 63
                char[] r2 = r2.f4904b
                char r2 = r2[r3]
                r5.append(r2)
                c9.a$a r2 = r4.f4912b
                r7 = r7 & 63
                char[] r2 = r2.f4904b
                char r7 = r2[r7]
                r5.append(r7)
                int r8 = r8 + (-3)
                r7 = r1
                goto L6
            L55:
                if (r7 >= r0) goto L5b
                int r0 = r0 - r7
                r4.m2659d(r5, r6, r7, r0)
            L5b:
                return
        }

        @Override // p039c9.AbstractC0936a.e
        /* renamed from: e */
        public p039c9.AbstractC0936a mo2658e(p039c9.AbstractC0936a.a r2, java.lang.Character r3) {
                r1 = this;
                c9.a$c r0 = new c9.a$c
                r0.<init>(r2, r3)
                return r0
        }
    }

    /* renamed from: c9.a$d */
    public static final class d extends java.io.IOException {
        public d(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: c9.a$e */
    public static class e extends p039c9.AbstractC0936a {

        /* renamed from: b */
        public final p039c9.AbstractC0936a.a f4912b;

        /* renamed from: c */
        public final java.lang.Character f4913c;

        /* renamed from: d */
        public transient p039c9.AbstractC0936a f4914d;

        public e(p039c9.AbstractC0936a.a r5, java.lang.Character r6) {
                r4 = this;
                r4.<init>()
                java.util.Objects.requireNonNull(r5)
                r4.f4912b = r5
                r0 = 0
                r1 = 1
                if (r6 == 0) goto L1f
                char r2 = r6.charValue()
                byte[] r5 = r5.f4909g
                int r3 = r5.length
                if (r2 >= r3) goto L1c
                r5 = r5[r2]
                r2 = -1
                if (r5 == r2) goto L1c
                r5 = 1
                goto L1d
            L1c:
                r5 = 0
            L1d:
                if (r5 != 0) goto L20
            L1f:
                r0 = 1
            L20:
                java.lang.String r5 = "Padding character %s was already in alphabet"
                p124h7.C2939x3.m7279e(r0, r5, r6)
                r4.f4913c = r6
                return
        }

        @Override // p039c9.AbstractC0936a
        /* renamed from: a */
        public int mo2654a(byte[] r13, java.lang.CharSequence r14) {
                r12 = this;
                java.lang.CharSequence r14 = r12.mo2656c(r14)
                c9.a$a r0 = r12.f4912b
                int r1 = r14.length()
                boolean[] r2 = r0.f4910h
                int r0 = r0.f4907e
                int r1 = r1 % r0
                boolean r0 = r2[r1]
                if (r0 == 0) goto L68
                r0 = 0
                r1 = 0
            L15:
                int r2 = r14.length()
                if (r0 >= r2) goto L67
                r2 = 0
                r4 = 0
                r5 = 0
            L1f:
                c9.a$a r6 = r12.f4912b
                int r7 = r6.f4907e
                if (r4 >= r7) goto L43
                int r6 = r6.f4906d
                long r2 = r2 << r6
                int r6 = r0 + r4
                int r7 = r14.length()
                if (r6 >= r7) goto L40
                c9.a$a r6 = r12.f4912b
                int r7 = r5 + 1
                int r5 = r5 + r0
                char r5 = r14.charAt(r5)
                int r5 = r6.m2657a(r5)
                long r5 = (long) r5
                long r2 = r2 | r5
                r5 = r7
            L40:
                int r4 = r4 + 1
                goto L1f
            L43:
                int r4 = r6.f4908f
                int r7 = r4 * 8
                int r6 = r6.f4906d
                int r5 = r5 * r6
                int r7 = r7 - r5
                int r4 = r4 + (-1)
                int r4 = r4 * 8
            L50:
                if (r4 < r7) goto L61
                int r5 = r1 + 1
                long r8 = r2 >>> r4
                r10 = 255(0xff, double:1.26E-321)
                long r8 = r8 & r10
                int r6 = (int) r8
                byte r6 = (byte) r6
                r13[r1] = r6
                int r4 = r4 + (-8)
                r1 = r5
                goto L50
            L61:
                c9.a$a r2 = r12.f4912b
                int r2 = r2.f4907e
                int r0 = r0 + r2
                goto L15
            L67:
                return r1
            L68:
                c9.a$d r13 = new c9.a$d
                java.lang.String r0 = "Invalid input length "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                int r14 = r14.length()
                r0.append(r14)
                java.lang.String r14 = r0.toString()
                r13.<init>(r14)
                throw r13
        }

        @Override // p039c9.AbstractC0936a
        /* renamed from: b */
        public void mo2655b(java.lang.Appendable r5, byte[] r6, int r7, int r8) {
                r4 = this;
                int r0 = r7 + r8
                int r1 = r6.length
                p124h7.C2939x3.m7283i(r7, r0, r1)
                r0 = 0
            L7:
                if (r0 >= r8) goto L1e
                int r1 = r7 + r0
                c9.a$a r2 = r4.f4912b
                int r2 = r2.f4908f
                int r3 = r8 - r0
                int r2 = java.lang.Math.min(r2, r3)
                r4.m2659d(r5, r6, r1, r2)
                c9.a$a r1 = r4.f4912b
                int r1 = r1.f4908f
                int r0 = r0 + r1
                goto L7
            L1e:
                return
        }

        @Override // p039c9.AbstractC0936a
        /* renamed from: c */
        public java.lang.CharSequence mo2656c(java.lang.CharSequence r4) {
                r3 = this;
                java.util.Objects.requireNonNull(r4)
                java.lang.Character r0 = r3.f4913c
                if (r0 != 0) goto L8
                return r4
            L8:
                char r0 = r0.charValue()
                int r1 = r4.length()
                int r1 = r1 + (-1)
            L12:
                if (r1 < 0) goto L1e
                char r2 = r4.charAt(r1)
                if (r2 == r0) goto L1b
                goto L1e
            L1b:
                int r1 = r1 + (-1)
                goto L12
            L1e:
                r0 = 0
                int r1 = r1 + 1
                java.lang.CharSequence r4 = r4.subSequence(r0, r1)
                return r4
        }

        /* renamed from: d */
        public void m2659d(java.lang.Appendable r8, byte[] r9, int r10, int r11) {
                r7 = this;
                int r0 = r10 + r11
                int r1 = r9.length
                p124h7.C2939x3.m7283i(r10, r0, r1)
                c9.a$a r0 = r7.f4912b
                int r0 = r0.f4908f
                r1 = 0
                if (r11 > r0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                p124h7.C2939x3.m7276b(r0)
                r2 = 0
                r0 = 0
            L16:
                r4 = 8
                if (r0 >= r11) goto L26
                int r5 = r10 + r0
                r5 = r9[r5]
                r5 = r5 & 255(0xff, float:3.57E-43)
                long r5 = (long) r5
                long r2 = r2 | r5
                long r2 = r2 << r4
                int r0 = r0 + 1
                goto L16
            L26:
                int r9 = r11 + 1
                int r9 = r9 * 8
                c9.a$a r10 = r7.f4912b
                int r10 = r10.f4906d
                int r9 = r9 - r10
            L2f:
                int r10 = r11 * 8
                if (r1 >= r10) goto L4a
                int r10 = r9 - r1
                long r5 = r2 >>> r10
                int r10 = (int) r5
                c9.a$a r0 = r7.f4912b
                int r5 = r0.f4905c
                r10 = r10 & r5
                char[] r0 = r0.f4904b
                char r10 = r0[r10]
                r8.append(r10)
                c9.a$a r10 = r7.f4912b
                int r10 = r10.f4906d
                int r1 = r1 + r10
                goto L2f
            L4a:
                java.lang.Character r9 = r7.f4913c
                if (r9 == 0) goto L65
            L4e:
                c9.a$a r9 = r7.f4912b
                int r9 = r9.f4908f
                int r9 = r9 * 8
                if (r1 >= r9) goto L65
                java.lang.Character r9 = r7.f4913c
                char r9 = r9.charValue()
                r8.append(r9)
                c9.a$a r9 = r7.f4912b
                int r9 = r9.f4906d
                int r1 = r1 + r9
                goto L4e
            L65:
                return
        }

        /* renamed from: e */
        public p039c9.AbstractC0936a mo2658e(p039c9.AbstractC0936a.a r2, java.lang.Character r3) {
                r1 = this;
                c9.a$e r0 = new c9.a$e
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof p039c9.AbstractC0936a.e
                r1 = 0
                if (r0 == 0) goto L1c
                c9.a$e r4 = (p039c9.AbstractC0936a.e) r4
                c9.a$a r0 = r3.f4912b
                c9.a$a r2 = r4.f4912b
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                java.lang.Character r0 = r3.f4913c
                java.lang.Character r4 = r4.f4913c
                boolean r4 = p185k7.C3836i.m8619d(r0, r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        public int hashCode() {
                r4 = this;
                c9.a$a r0 = r4.f4912b
                int r0 = r0.hashCode()
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Character r2 = r4.f4913c
                r3 = 0
                r1[r3] = r2
                int r1 = java.util.Arrays.hashCode(r1)
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "BaseEncoding."
                r0.<init>(r1)
                c9.a$a r1 = r3.f4912b
                java.lang.String r1 = r1.f4903a
                r0.append(r1)
                r1 = 8
                c9.a$a r2 = r3.f4912b
                int r2 = r2.f4906d
                int r1 = r1 % r2
                if (r1 == 0) goto L2d
                java.lang.Character r1 = r3.f4913c
                if (r1 != 0) goto L1e
                java.lang.String r1 = ".omitPadding()"
                goto L2a
            L1e:
                java.lang.String r1 = ".withPadChar('"
                r0.append(r1)
                java.lang.Character r1 = r3.f4913c
                r0.append(r1)
                java.lang.String r1 = "')"
            L2a:
                r0.append(r1)
            L2d:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            c9.a$c r0 = new c9.a$c
            r1 = 61
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.String r2 = "base64()"
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            r0.<init>(r2, r3, r1)
            c9.a$c r0 = new c9.a$c
            java.lang.String r2 = "base64Url()"
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"
            r0.<init>(r2, r3, r1)
            c9.a$e r0 = new c9.a$e
            c9.a$a r2 = new c9.a$a
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"
            char[] r3 = r3.toCharArray()
            java.lang.String r4 = "base32()"
            r2.<init>(r4, r3)
            r0.<init>(r2, r1)
            c9.a$e r0 = new c9.a$e
            c9.a$a r2 = new c9.a$a
            java.lang.String r3 = "0123456789ABCDEFGHIJKLMNOPQRSTUV"
            char[] r3 = r3.toCharArray()
            java.lang.String r4 = "base32Hex()"
            r2.<init>(r4, r3)
            r0.<init>(r2, r1)
            c9.a$b r0 = new c9.a$b
            c9.a$a r1 = new c9.a$a
            java.lang.String r2 = "0123456789ABCDEF"
            char[] r2 = r2.toCharArray()
            java.lang.String r3 = "base16()"
            r1.<init>(r3, r2)
            r0.<init>(r1)
            p039c9.AbstractC0936a.f4902a = r0
            return
    }

    public AbstractC0936a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract int mo2654a(byte[] r1, java.lang.CharSequence r2);

    /* renamed from: b */
    public abstract void mo2655b(java.lang.Appendable r1, byte[] r2, int r3, int r4);

    /* renamed from: c */
    public abstract java.lang.CharSequence mo2656c(java.lang.CharSequence r1);
}

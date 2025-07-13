package p124h7;

/* renamed from: h7.g1 */
/* loaded from: classes.dex */
public final class C2631g1 {

    /* renamed from: a */
    public static final p124h7.C2595e1 f11538a = null;

    static {
            boolean r0 = p124h7.C2577d1.f11437e
            if (r0 == 0) goto La
            boolean r0 = p124h7.C2577d1.f11436d
            if (r0 == 0) goto La
            int r0 = p124h7.C2897uf.f11947a
        La:
            h7.e1 r0 = new h7.e1
            r1 = 0
            r0.<init>(r1)
            p124h7.C2631g1.f11538a = r0
            return
    }

    /* renamed from: a */
    public static /* synthetic */ int m6742a(byte[] r5, int r6, int r7) {
            int r0 = r6 + (-1)
            r0 = r5[r0]
            int r7 = r7 - r6
            r1 = -12
            if (r7 == 0) goto L36
            r2 = 1
            r3 = -65
            if (r7 == r2) goto L2b
            r4 = 2
            if (r7 != r4) goto L25
            r7 = r5[r6]
            int r6 = r6 + r2
            r5 = r5[r6]
            if (r0 > r1) goto L38
            if (r7 > r3) goto L38
            if (r5 <= r3) goto L1d
            goto L38
        L1d:
            int r6 = r7 << 8
            r6 = r6 ^ r0
            int r5 = r5 << 16
            r0 = r6 ^ r5
            goto L39
        L25:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L2b:
            r5 = r5[r6]
            if (r0 > r1) goto L38
            if (r5 <= r3) goto L32
            goto L38
        L32:
            int r5 = r5 << 8
            r0 = r0 ^ r5
            goto L39
        L36:
            if (r0 <= r1) goto L39
        L38:
            r0 = -1
        L39:
            return r0
    }

    /* renamed from: b */
    public static int m6743b(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
            int r0 = r7.length()
            int r10 = r10 + r9
            r1 = 0
        L6:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L1a
            int r3 = r1 + r9
            if (r3 >= r10) goto L1a
            char r4 = r7.charAt(r1)
            if (r4 >= r2) goto L1a
            byte r2 = (byte) r4
            r8[r3] = r2
            int r1 = r1 + 1
            goto L6
        L1a:
            if (r1 != r0) goto L1f
            int r9 = r9 + r0
            goto Lff
        L1f:
            int r9 = r9 + r1
        L20:
            if (r1 >= r0) goto Lff
            char r3 = r7.charAt(r1)
            if (r3 >= r2) goto L30
            if (r9 >= r10) goto L30
            int r4 = r9 + 1
            byte r3 = (byte) r3
            r8[r9] = r3
            goto L73
        L30:
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L4a
            int r4 = r10 + (-2)
            if (r9 > r4) goto L4a
            int r4 = r9 + 1
            int r5 = r3 >>> 6
            r5 = r5 | 960(0x3c0, float:1.345E-42)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r4 + 1
            r3 = r3 & 63
            r3 = r3 | r2
            byte r3 = (byte) r3
            r8[r4] = r3
            goto Lb5
        L4a:
            r4 = 57343(0xdfff, float:8.0355E-41)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L54
            if (r3 <= r4) goto L75
        L54:
            int r6 = r10 + (-3)
            if (r9 > r6) goto L75
            int r4 = r9 + 1
            int r5 = r3 >>> 12
            r5 = r5 | 480(0x1e0, float:6.73E-43)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r4 + 1
            int r5 = r3 >>> 6
            r5 = r5 & 63
            r5 = r5 | r2
            byte r5 = (byte) r5
            r8[r4] = r5
            int r4 = r9 + 1
            r3 = r3 & 63
            r3 = r3 | r2
            byte r3 = (byte) r3
            r8[r9] = r3
        L73:
            r9 = r4
            goto Lb5
        L75:
            int r6 = r10 + (-4)
            if (r9 > r6) goto Lc2
            int r4 = r1 + 1
            int r5 = r7.length()
            if (r4 == r5) goto Lba
            char r1 = r7.charAt(r4)
            boolean r5 = java.lang.Character.isSurrogatePair(r3, r1)
            if (r5 == 0) goto Lb9
            int r1 = java.lang.Character.toCodePoint(r3, r1)
            int r3 = r9 + 1
            int r5 = r1 >>> 18
            r5 = r5 | 240(0xf0, float:3.36E-43)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r3 + 1
            int r5 = r1 >>> 12
            r5 = r5 & 63
            r5 = r5 | r2
            byte r5 = (byte) r5
            r8[r3] = r5
            int r3 = r9 + 1
            int r5 = r1 >>> 6
            r5 = r5 & 63
            r5 = r5 | r2
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r3 + 1
            r1 = r1 & 63
            r1 = r1 | r2
            byte r1 = (byte) r1
            r8[r3] = r1
            r1 = r4
        Lb5:
            int r1 = r1 + 1
            goto L20
        Lb9:
            r1 = r4
        Lba:
            h7.f1 r7 = new h7.f1
            int r1 = r1 + (-1)
            r7.<init>(r1, r0)
            throw r7
        Lc2:
            if (r3 < r5) goto Lde
            if (r3 > r4) goto Lde
            int r8 = r1 + 1
            int r10 = r7.length()
            if (r8 == r10) goto Ld8
            char r7 = r7.charAt(r8)
            boolean r7 = java.lang.Character.isSurrogatePair(r3, r7)
            if (r7 != 0) goto Lde
        Ld8:
            h7.f1 r7 = new h7.f1
            r7.<init>(r1, r0)
            throw r7
        Lde:
            java.lang.ArrayIndexOutOfBoundsException r7 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r10 = 37
            r8.<init>(r10)
            java.lang.String r10 = "Failed writing "
            r8.append(r10)
            r8.append(r3)
            java.lang.String r10 = " at index "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Lff:
            return r9
    }

    /* renamed from: c */
    public static int m6744c(java.lang.CharSequence r8) {
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
            if (r6 < r7) goto L55
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r6 > r7) goto L55
            int r6 = java.lang.Character.codePointAt(r8, r2)
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 < r7) goto L4f
            int r2 = r2 + 1
            goto L55
        L4f:
            h7.f1 r8 = new h7.f1
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
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 54
            r0.<init>(r1)
            java.lang.String r1 = "UTF-8 length does not fit in int: "
            r0.append(r1)
            long r1 = (long) r3
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 + r3
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }

    /* renamed from: d */
    public static java.lang.String m6745d(byte[] r9, int r10, int r11) {
            int r0 = r9.length
            r1 = r10 | r11
            int r2 = r0 - r10
            int r2 = r2 - r11
            r1 = r1 | r2
            r2 = 0
            if (r1 < 0) goto L126
            int r0 = r10 + r11
            char[] r11 = new char[r11]
            r1 = 0
        Lf:
            if (r10 >= r0) goto L23
            r3 = r9[r10]
            boolean r4 = p052d6.C1306f0.m3785n(r3)
            if (r4 != 0) goto L1a
            goto L23
        L1a:
            int r10 = r10 + 1
            int r4 = r1 + 1
            char r3 = (char) r3
            r11[r1] = r3
            r1 = r4
            goto Lf
        L23:
            if (r10 >= r0) goto L120
            int r3 = r10 + 1
            r10 = r9[r10]
            boolean r4 = p052d6.C1306f0.m3785n(r10)
            if (r4 == 0) goto L49
            int r4 = r1 + 1
            char r10 = (char) r10
            r11[r1] = r10
            r10 = r3
        L35:
            r1 = r4
            if (r10 >= r0) goto L23
            r3 = r9[r10]
            boolean r4 = p052d6.C1306f0.m3785n(r3)
            if (r4 != 0) goto L41
            goto L23
        L41:
            int r10 = r10 + 1
            int r4 = r1 + 1
            char r3 = (char) r3
            r11[r1] = r3
            goto L35
        L49:
            r4 = -32
            if (r10 >= r4) goto L76
            if (r3 >= r0) goto L71
            int r4 = r3 + 1
            int r5 = r1 + 1
            r3 = r9[r3]
            r6 = -62
            if (r10 < r6) goto L6c
            boolean r6 = p052d6.C1306f0.m3787p(r3)
            if (r6 != 0) goto L6c
            r10 = r10 & 31
            int r10 = r10 << 6
            r3 = r3 & 63
            r10 = r10 | r3
            char r10 = (char) r10
            r11[r1] = r10
            r10 = r4
            r1 = r5
            goto L23
        L6c:
            h7.f r9 = p124h7.C2611f.m6683c()
            throw r9
        L71:
            h7.f r9 = p124h7.C2611f.m6683c()
            throw r9
        L76:
            r5 = -16
            if (r10 >= r5) goto Lc1
            int r5 = r0 + (-1)
            if (r3 >= r5) goto Lbc
            int r5 = r3 + 1
            int r6 = r5 + 1
            int r7 = r1 + 1
            r3 = r9[r3]
            r5 = r9[r5]
            boolean r8 = p052d6.C1306f0.m3787p(r3)
            if (r8 != 0) goto Lb7
            r8 = -96
            if (r10 != r4) goto L96
            if (r3 < r8) goto Lb7
            r10 = -32
        L96:
            r4 = -19
            if (r10 != r4) goto L9e
            if (r3 >= r8) goto Lb7
            r10 = -19
        L9e:
            boolean r4 = p052d6.C1306f0.m3787p(r5)
            if (r4 != 0) goto Lb7
            r10 = r10 & 15
            int r10 = r10 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r10 = r10 | r3
            r3 = r5 & 63
            r10 = r10 | r3
            char r10 = (char) r10
            r11[r1] = r10
            r10 = r6
            r1 = r7
            goto L23
        Lb7:
            h7.f r9 = p124h7.C2611f.m6683c()
            throw r9
        Lbc:
            h7.f r9 = p124h7.C2611f.m6683c()
            throw r9
        Lc1:
            int r4 = r0 + (-2)
            if (r3 >= r4) goto L11b
            int r4 = r3 + 1
            int r5 = r4 + 1
            int r6 = r5 + 1
            r3 = r9[r3]
            r4 = r9[r4]
            r5 = r9[r5]
            boolean r7 = p052d6.C1306f0.m3787p(r3)
            if (r7 != 0) goto L116
            int r7 = r10 << 28
            int r8 = r3 + 112
            int r8 = r8 + r7
            int r7 = r8 >> 30
            if (r7 != 0) goto L116
            boolean r7 = p052d6.C1306f0.m3787p(r4)
            if (r7 != 0) goto L116
            boolean r7 = p052d6.C1306f0.m3787p(r5)
            if (r7 != 0) goto L116
            r10 = r10 & 7
            int r10 = r10 << 18
            r3 = r3 & 63
            int r3 = r3 << 12
            r10 = r10 | r3
            r3 = r4 & 63
            int r3 = r3 << 6
            r10 = r10 | r3
            r3 = r5 & 63
            r10 = r10 | r3
            int r3 = r10 >>> 10
            r4 = 55232(0xd7c0, float:7.7397E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            r11[r1] = r3
            int r3 = r1 + 1
            r10 = r10 & 1023(0x3ff, float:1.434E-42)
            r4 = 56320(0xdc00, float:7.8921E-41)
            int r10 = r10 + r4
            char r10 = (char) r10
            r11[r3] = r10
            int r1 = r1 + 2
            r10 = r6
            goto L23
        L116:
            h7.f r9 = p124h7.C2611f.m6683c()
            throw r9
        L11b:
            h7.f r9 = p124h7.C2611f.m6683c()
            throw r9
        L120:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r11, r2, r1)
            return r9
        L126:
            java.lang.ArrayIndexOutOfBoundsException r9 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r2] = r0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0 = 1
            r1[r0] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r11 = 2
            r1[r11] = r10
            java.lang.String r10 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r9.<init>(r10)
            throw r9
    }

    /* renamed from: e */
    public static boolean m6746e(byte[] r1, int r2, int r3) {
            h7.e1 r0 = p124h7.C2631g1.f11538a
            boolean r1 = r0.m6636c(r1, r2, r3)
            return r1
    }
}

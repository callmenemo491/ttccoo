package p312rc;

/* renamed from: rc.c */
/* loaded from: classes.dex */
public final class C5808c {

    /* renamed from: a */
    public static final char[] f22501a = null;

    static {
            java.lang.String r0 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:"
            char[] r0 = r0.toCharArray()
            p312rc.C5808c.f22501a = r0
            return
    }

    /* renamed from: a */
    public static void m12175a(p453zb.C7271c r3, java.lang.StringBuilder r4, int r5, boolean r6) {
            int r0 = r4.length()
        L4:
            r1 = 1
            if (r5 <= r1) goto L2d
            int r1 = r3.m14378a()
            r2 = 11
            if (r1 < r2) goto L28
            int r1 = r3.m14379b(r2)
            int r2 = r1 / 45
            char r2 = m12180f(r2)
            r4.append(r2)
            int r1 = r1 % 45
            char r1 = m12180f(r1)
            r4.append(r1)
            int r5 = r5 + (-2)
            goto L4
        L28:
            sb.f r3 = sb.C6012f.m12491a()
            throw r3
        L2d:
            if (r5 != r1) goto L47
            int r5 = r3.m14378a()
            r2 = 6
            if (r5 < r2) goto L42
            int r3 = r3.m14379b(r2)
            char r3 = m12180f(r3)
            r4.append(r3)
            goto L47
        L42:
            sb.f r3 = sb.C6012f.m12491a()
            throw r3
        L47:
            if (r6 == 0) goto L72
        L49:
            int r3 = r4.length()
            if (r0 >= r3) goto L72
            char r3 = r4.charAt(r0)
            r5 = 37
            if (r3 != r5) goto L6f
            int r3 = r4.length()
            int r3 = r3 - r1
            if (r0 >= r3) goto L6a
            int r3 = r0 + 1
            char r6 = r4.charAt(r3)
            if (r6 != r5) goto L6a
            r4.deleteCharAt(r3)
            goto L6f
        L6a:
            r3 = 29
            r4.setCharAt(r0, r3)
        L6f:
            int r0 = r0 + 1
            goto L49
        L72:
            return
    }

    /* renamed from: b */
    public static void m12176b(p453zb.C7271c r21, java.lang.StringBuilder r22, int r23, p453zb.EnumC7272d r24, java.util.Collection<byte[]> r25, java.util.Map<sb.EnumC6009c, ?> r26) {
            r0 = r23
            r1 = r26
            int r2 = r0 << 3
            int r3 = r21.m14378a()
            if (r2 > r3) goto L175
            byte[] r2 = new byte[r0]
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r0) goto L20
            r5 = 8
            r6 = r21
            int r5 = r6.m14379b(r5)
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r4 + 1
            goto L10
        L20:
            if (r24 != 0) goto L158
            java.lang.String r4 = p453zb.C7276h.f27929a
            if (r1 == 0) goto L3a
            sb.c r4 = sb.EnumC6009c.f23173c0
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L3a
            java.lang.Object r0 = r1.get(r4)
            java.lang.String r0 = r0.toString()
            r20 = r2
            goto L15e
        L3a:
            r1 = 2
            r4 = 3
            r5 = 1
            if (r0 <= r4) goto L53
            r6 = r2[r3]
            r7 = -17
            if (r6 != r7) goto L53
            r6 = r2[r5]
            r7 = -69
            if (r6 != r7) goto L53
            r6 = r2[r1]
            r7 = -65
            if (r6 != r7) goto L53
            r6 = 1
            goto L54
        L53:
            r6 = 0
        L54:
            r1 = 0
            r7 = 1
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L64:
            if (r9 >= r0) goto L113
            if (r5 != 0) goto L6c
            if (r7 != 0) goto L6c
            if (r8 == 0) goto L113
        L6c:
            r4 = r2[r9]
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r8 == 0) goto La0
            r20 = r2
            r2 = r4 & 128(0x80, float:1.8E-43)
            if (r10 <= 0) goto L7d
            if (r2 == 0) goto L9e
            int r10 = r10 + (-1)
            goto La2
        L7d:
            if (r2 == 0) goto La2
            r2 = r4 & 64
            if (r2 == 0) goto L9e
            int r10 = r10 + 1
            r2 = r4 & 32
            if (r2 != 0) goto L8c
            int r12 = r12 + 1
            goto La2
        L8c:
            int r10 = r10 + 1
            r2 = r4 & 16
            if (r2 != 0) goto L95
            int r13 = r13 + 1
            goto La2
        L95:
            int r10 = r10 + 1
            r2 = r4 & 8
            if (r2 != 0) goto L9e
            int r14 = r14 + 1
            goto La2
        L9e:
            r8 = 0
            goto La2
        La0:
            r20 = r2
        La2:
            r2 = 127(0x7f, float:1.78E-43)
            if (r5 == 0) goto Lc0
            if (r4 <= r2) goto Lae
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 >= r2) goto Lae
            r5 = 0
            goto Lc0
        Lae:
            r2 = 159(0x9f, float:2.23E-43)
            if (r4 <= r2) goto Lc0
            r2 = 192(0xc0, float:2.69E-43)
            if (r4 < r2) goto Lbe
            r2 = 215(0xd7, float:3.01E-43)
            if (r4 == r2) goto Lbe
            r2 = 247(0xf7, float:3.46E-43)
            if (r4 != r2) goto Lc0
        Lbe:
            int r17 = r17 + 1
        Lc0:
            if (r7 == 0) goto L10c
            if (r11 <= 0) goto Ld4
            r2 = 64
            if (r4 < r2) goto L10b
            r2 = 127(0x7f, float:1.78E-43)
            if (r4 == r2) goto L10b
            r2 = 252(0xfc, float:3.53E-43)
            if (r4 <= r2) goto Ld1
            goto L10b
        Ld1:
            int r11 = r11 + (-1)
            goto L10c
        Ld4:
            r2 = 128(0x80, float:1.8E-43)
            if (r4 == r2) goto L10b
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 == r2) goto L10b
            r2 = 239(0xef, float:3.35E-43)
            if (r4 <= r2) goto Le1
            goto L10b
        Le1:
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 <= r2) goto Lf5
            r2 = 224(0xe0, float:3.14E-43)
            if (r4 >= r2) goto Lf5
            int r1 = r1 + 1
            int r2 = r19 + 1
            if (r2 <= r15) goto Lf0
            r15 = r2
        Lf0:
            r19 = r2
            r18 = 0
            goto L10c
        Lf5:
            r2 = 127(0x7f, float:1.78E-43)
            if (r4 <= r2) goto L106
            int r11 = r11 + 1
            int r2 = r18 + 1
            if (r2 <= r3) goto L103
            r3 = r2
            r18 = r3
            goto L108
        L103:
            r18 = r2
            goto L108
        L106:
            r18 = 0
        L108:
            r19 = 0
            goto L10c
        L10b:
            r7 = 0
        L10c:
            int r9 = r9 + 1
            r2 = r20
            r4 = 3
            goto L64
        L113:
            r20 = r2
            if (r8 == 0) goto L11a
            if (r10 <= 0) goto L11a
            r8 = 0
        L11a:
            if (r7 == 0) goto L121
            if (r11 <= 0) goto L121
            r16 = 0
            goto L123
        L121:
            r16 = r7
        L123:
            if (r8 == 0) goto L12c
            if (r6 != 0) goto L152
            int r12 = r12 + r13
            int r12 = r12 + r14
            if (r12 <= 0) goto L12c
            goto L152
        L12c:
            if (r16 == 0) goto L138
            boolean r2 = p453zb.C7276h.f27930b
            if (r2 != 0) goto L14d
            r2 = 3
            if (r15 >= r2) goto L14d
            if (r3 < r2) goto L138
            goto L14d
        L138:
            if (r5 == 0) goto L146
            if (r16 == 0) goto L146
            r2 = 2
            if (r15 != r2) goto L141
            if (r1 == r2) goto L14d
        L141:
            int r1 = r17 * 10
            if (r1 < r0) goto L148
            goto L14d
        L146:
            if (r5 == 0) goto L14b
        L148:
            java.lang.String r0 = "ISO8859_1"
            goto L15e
        L14b:
            if (r16 == 0) goto L150
        L14d:
            java.lang.String r0 = "SJIS"
            goto L15e
        L150:
            if (r8 == 0) goto L155
        L152:
            java.lang.String r0 = "UTF8"
            goto L15e
        L155:
            java.lang.String r0 = p453zb.C7276h.f27929a
            goto L15e
        L158:
            r20 = r2
            java.lang.String r0 = r24.name()
        L15e:
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L170
            r2 = r20
            r1.<init>(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> L170
            r0 = r22
            r0.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L170
            r0 = r25
            r0.add(r2)
            return
        L170:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L175:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
    }

    /* renamed from: c */
    public static void m12177c(p453zb.C7271c r4, java.lang.StringBuilder r5, int r6) {
            int r0 = r6 * 13
            int r1 = r4.m14378a()
            if (r0 > r1) goto L47
            int r0 = r6 * 2
            byte[] r0 = new byte[r0]
            r1 = 0
        Ld:
            if (r6 <= 0) goto L37
            r2 = 13
            int r2 = r4.m14379b(r2)
            int r3 = r2 / 96
            int r3 = r3 << 8
            int r2 = r2 % 96
            r2 = r2 | r3
            r3 = 959(0x3bf, float:1.344E-42)
            if (r2 >= r3) goto L24
            r3 = 41377(0xa1a1, float:5.7982E-41)
            goto L27
        L24:
            r3 = 42657(0xa6a1, float:5.9775E-41)
        L27:
            int r2 = r2 + r3
            int r3 = r2 >> 8
            byte r3 = (byte) r3
            r0[r1] = r3
            int r3 = r1 + 1
            byte r2 = (byte) r2
            r0[r3] = r2
            int r1 = r1 + 2
            int r6 = r6 + (-1)
            goto Ld
        L37:
            java.lang.String r4 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L42
            java.lang.String r6 = "GB2312"
            r4.<init>(r0, r6)     // Catch: java.io.UnsupportedEncodingException -> L42
            r5.append(r4)     // Catch: java.io.UnsupportedEncodingException -> L42
            return
        L42:
            sb.f r4 = sb.C6012f.m12491a()
            throw r4
        L47:
            sb.f r4 = sb.C6012f.m12491a()
            throw r4
    }

    /* renamed from: d */
    public static void m12178d(p453zb.C7271c r4, java.lang.StringBuilder r5, int r6) {
            int r0 = r6 * 13
            int r1 = r4.m14378a()
            if (r0 > r1) goto L47
            int r0 = r6 * 2
            byte[] r0 = new byte[r0]
            r1 = 0
        Ld:
            if (r6 <= 0) goto L37
            r2 = 13
            int r2 = r4.m14379b(r2)
            int r3 = r2 / 192
            int r3 = r3 << 8
            int r2 = r2 % 192
            r2 = r2 | r3
            r3 = 7936(0x1f00, float:1.1121E-41)
            if (r2 >= r3) goto L24
            r3 = 33088(0x8140, float:4.6366E-41)
            goto L27
        L24:
            r3 = 49472(0xc140, float:6.9325E-41)
        L27:
            int r2 = r2 + r3
            int r3 = r2 >> 8
            byte r3 = (byte) r3
            r0[r1] = r3
            int r3 = r1 + 1
            byte r2 = (byte) r2
            r0[r3] = r2
            int r1 = r1 + 2
            int r6 = r6 + (-1)
            goto Ld
        L37:
            java.lang.String r4 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L42
            java.lang.String r6 = "SJIS"
            r4.<init>(r0, r6)     // Catch: java.io.UnsupportedEncodingException -> L42
            r5.append(r4)     // Catch: java.io.UnsupportedEncodingException -> L42
            return
        L42:
            sb.f r4 = sb.C6012f.m12491a()
            throw r4
        L47:
            sb.f r4 = sb.C6012f.m12491a()
            throw r4
    }

    /* renamed from: e */
    public static void m12179e(p453zb.C7271c r3, java.lang.StringBuilder r4, int r5) {
        L0:
            r0 = 3
            r1 = 10
            if (r5 < r0) goto L3c
            int r0 = r3.m14378a()
            if (r0 < r1) goto L37
            int r0 = r3.m14379b(r1)
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 >= r2) goto L32
            int r2 = r0 / 100
            char r2 = m12180f(r2)
            r4.append(r2)
            int r2 = r0 / 10
            int r2 = r2 % r1
            char r1 = m12180f(r2)
            r4.append(r1)
            int r0 = r0 % 10
            char r0 = m12180f(r0)
            r4.append(r0)
            int r5 = r5 + (-3)
            goto L0
        L32:
            sb.f r3 = sb.C6012f.m12491a()
            throw r3
        L37:
            sb.f r3 = sb.C6012f.m12491a()
            throw r3
        L3c:
            r0 = 2
            if (r5 != r0) goto L6a
            int r5 = r3.m14378a()
            r0 = 7
            if (r5 < r0) goto L65
            int r3 = r3.m14379b(r0)
            r5 = 100
            if (r3 >= r5) goto L60
            int r5 = r3 / 10
            char r5 = m12180f(r5)
            r4.append(r5)
            int r3 = r3 % r1
            char r3 = m12180f(r3)
            r4.append(r3)
            return
        L60:
            sb.f r3 = sb.C6012f.m12491a()
            throw r3
        L65:
            sb.f r3 = sb.C6012f.m12491a()
            throw r3
        L6a:
            r0 = 1
            if (r5 != r0) goto L8c
            int r5 = r3.m14378a()
            r0 = 4
            if (r5 < r0) goto L87
            int r3 = r3.m14379b(r0)
            if (r3 >= r1) goto L82
            char r3 = m12180f(r3)
            r4.append(r3)
            goto L8c
        L82:
            sb.f r3 = sb.C6012f.m12491a()
            throw r3
        L87:
            sb.f r3 = sb.C6012f.m12491a()
            throw r3
        L8c:
            return
    }

    /* renamed from: f */
    public static char m12180f(int r2) {
            char[] r0 = p312rc.C5808c.f22501a
            int r1 = r0.length
            if (r2 >= r1) goto L8
            char r2 = r0[r2]
            return r2
        L8:
            sb.f r2 = sb.C6012f.m12491a()
            throw r2
    }
}

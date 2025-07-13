package p260oi;

/* renamed from: oi.i */
/* loaded from: classes.dex */
public class C5287i implements java.io.Serializable, java.lang.Comparable<p260oi.C5287i> {

    /* renamed from: b0 */
    public static final p260oi.C5287i f20504b0 = null;

    /* renamed from: c0 */
    public static final p260oi.C5287i.a f20505c0 = null;

    /* renamed from: Y */
    public transient int f20506Y;

    /* renamed from: Z */
    public transient java.lang.String f20507Z;

    /* renamed from: a0 */
    public final byte[] f20508a0;

    /* renamed from: oi.i$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: c */
        public static p260oi.C5287i m11594c(p260oi.C5287i.a r6, byte[] r7, int r8, int r9, int r10) {
                r6 = r10 & 1
                if (r6 == 0) goto L5
                r8 = 0
            L5:
                r6 = r10 & 2
                if (r6 == 0) goto La
                int r9 = r7.length
            La:
                int r6 = r7.length
                long r0 = (long) r6
                long r2 = (long) r8
                long r4 = (long) r9
                p080ei.C1854b.m4602d(r0, r2, r4)
                oi.i r6 = new oi.i
                int r9 = r9 + r8
                byte[] r7 = p062dh.C1468d.m3986H(r7, r8, r9)
                r6.<init>(r7)
                return r6
        }

        /* renamed from: a */
        public final p260oi.C5287i m11595a(java.lang.String r6) {
                r5 = this;
                int r0 = r6.length()
                int r0 = r0 % 2
                r1 = 0
                if (r0 != 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                if (r0 == 0) goto L3b
                int r0 = r6.length()
                int r0 = r0 / 2
                byte[] r2 = new byte[r0]
            L16:
                if (r1 >= r0) goto L35
                int r3 = r1 * 2
                char r4 = r6.charAt(r3)
                int r4 = p277pi.C5528b.m11789a(r4)
                int r4 = r4 << 4
                int r3 = r3 + 1
                char r3 = r6.charAt(r3)
                int r3 = p277pi.C5528b.m11789a(r3)
                int r3 = r3 + r4
                byte r3 = (byte) r3
                r2[r1] = r3
                int r1 = r1 + 1
                goto L16
            L35:
                oi.i r6 = new oi.i
                r6.<init>(r2)
                return r6
            L3b:
                java.lang.String r0 = "Unexpected hex string: "
                java.lang.String r6 = p064e.C1493g.m4049a(r0, r6)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
        }

        /* renamed from: b */
        public final p260oi.C5287i m11596b(java.lang.String r4) {
                r3 = this;
                oi.i r0 = new oi.i
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r1 = r4.getBytes(r1)
                java.lang.String r2 = "(this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r1, r2)
                r0.<init>(r1)
                r0.f20507Z = r4
                return r0
        }
    }

    static {
            oi.i$a r0 = new oi.i$a
            r1 = 0
            r0.<init>(r1)
            p260oi.C5287i.f20505c0 = r0
            oi.i r0 = new oi.i
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            p260oi.C5287i.f20504b0 = r0
            return
    }

    public C5287i(byte[] r2) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f20508a0 = r2
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(p260oi.C5287i r8) {
            r7 = this;
            oi.i r8 = (p260oi.C5287i) r8
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r8, r0)
            int r0 = r7.mo11585h()
            int r1 = r8.mo11585h()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.mo11588o(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.mo11588o(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
    }

    /* renamed from: e */
    public java.lang.String mo11583e() {
            r12 = this;
            byte[] r0 = r12.f20508a0
            byte[] r1 = p260oi.C5278a.f20484a
            byte[] r1 = p260oi.C5278a.f20484a
            java.lang.String r2 = "$this$encodeBase64"
            p214m2.C4339q.m9706k(r0, r2)
            java.lang.String r2 = "map"
            p214m2.C4339q.m9706k(r1, r2)
            int r2 = r0.length
            r3 = 2
            int r2 = r2 + r3
            int r2 = r2 / 3
            int r2 = r2 * 4
            byte[] r2 = new byte[r2]
            int r4 = r0.length
            int r5 = r0.length
            int r5 = r5 % 3
            int r4 = r4 - r5
            r5 = 0
            r6 = 0
        L20:
            if (r5 >= r4) goto L5e
            int r7 = r5 + 1
            r5 = r0[r5]
            int r8 = r7 + 1
            r7 = r0[r7]
            int r9 = r8 + 1
            r8 = r0[r8]
            int r10 = r6 + 1
            r11 = r5 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> r3
            r11 = r1[r11]
            r2[r6] = r11
            int r6 = r10 + 1
            r5 = r5 & 3
            int r5 = r5 << 4
            r11 = r7 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> 4
            r5 = r5 | r11
            r5 = r1[r5]
            r2[r10] = r5
            int r5 = r6 + 1
            r7 = r7 & 15
            int r7 = r7 << r3
            r10 = r8 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 6
            r7 = r7 | r10
            r7 = r1[r7]
            r2[r6] = r7
            int r6 = r5 + 1
            r7 = r8 & 63
            r7 = r1[r7]
            r2[r5] = r7
            r5 = r9
            goto L20
        L5e:
            int r7 = r0.length
            int r7 = r7 - r4
            r4 = 61
            r8 = 1
            if (r7 == r8) goto L93
            if (r7 == r3) goto L68
            goto Lb0
        L68:
            int r7 = r5 + 1
            r5 = r0[r5]
            r0 = r0[r7]
            int r7 = r6 + 1
            r8 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r8 >> r3
            r8 = r1[r8]
            r2[r6] = r8
            int r6 = r7 + 1
            r5 = r5 & 3
            int r5 = r5 << 4
            r8 = r0 & 255(0xff, float:3.57E-43)
            int r8 = r8 >> 4
            r5 = r5 | r8
            r5 = r1[r5]
            r2[r7] = r5
            int r5 = r6 + 1
            r0 = r0 & 15
            int r0 = r0 << r3
            r0 = r1[r0]
            r2[r6] = r0
            byte r0 = (byte) r4
            r2[r5] = r0
            goto Lb0
        L93:
            r0 = r0[r5]
            int r5 = r6 + 1
            r7 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r7 >> 2
            r3 = r1[r3]
            r2[r6] = r3
            int r3 = r5 + 1
            r0 = r0 & 3
            int r0 = r0 << 4
            r0 = r1[r0]
            r2[r5] = r0
            int r0 = r3 + 1
            byte r1 = (byte) r4
            r2[r3] = r1
            r2[r0] = r1
        Lb0:
            java.lang.String r0 = "$this$toUtf8String"
            p214m2.C4339q.m9706k(r2, r0)
            java.nio.charset.Charset r0 = p362uh.C6455a.f25034b
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r0)
            return r1
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 != r5) goto L5
            goto L1d
        L5:
            boolean r2 = r6 instanceof p260oi.C5287i
            if (r2 == 0) goto L1c
            oi.i r6 = (p260oi.C5287i) r6
            int r2 = r6.mo11585h()
            byte[] r3 = r5.f20508a0
            int r4 = r3.length
            if (r2 != r4) goto L1c
            int r2 = r3.length
            boolean r6 = r6.mo11590q(r1, r3, r1, r2)
            if (r6 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    /* renamed from: g */
    public p260oi.C5287i mo11584g(java.lang.String r3) {
            r2 = this;
            oi.i r0 = new oi.i
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            byte[] r1 = r2.f20508a0
            byte[] r3 = r3.digest(r1)
            java.lang.String r1 = "MessageDigest.getInstance(algorithm).digest(data)"
            p214m2.C4339q.m9705j(r3, r1)
            r0.<init>(r3)
            return r0
    }

    /* renamed from: h */
    public int mo11585h() {
            r1 = this;
            byte[] r0 = r1.f20508a0
            int r0 = r0.length
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.f20506Y
            if (r0 == 0) goto L5
            goto Ld
        L5:
            byte[] r0 = r1.f20508a0
            int r0 = java.util.Arrays.hashCode(r0)
            r1.f20506Y = r0
        Ld:
            return r0
    }

    /* renamed from: k */
    public java.lang.String mo11586k() {
            r9 = this;
            byte[] r0 = r9.f20508a0
            int r1 = r0.length
            int r1 = r1 * 2
            char[] r1 = new char[r1]
            int r2 = r0.length
            r3 = 0
            r4 = 0
        La:
            if (r3 >= r2) goto L25
            r5 = r0[r3]
            int r6 = r4 + 1
            char[] r7 = p277pi.C5528b.f21528a
            int r8 = r5 >> 4
            r8 = r8 & 15
            char r8 = r7[r8]
            r1[r4] = r8
            int r4 = r6 + 1
            r5 = r5 & 15
            char r5 = r7[r5]
            r1[r6] = r5
            int r3 = r3 + 1
            goto La
        L25:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    /* renamed from: l */
    public byte[] mo11587l() {
            r1 = this;
            byte[] r0 = r1.f20508a0
            return r0
    }

    /* renamed from: o */
    public byte mo11588o(int r2) {
            r1 = this;
            byte[] r0 = r1.f20508a0
            r2 = r0[r2]
            return r2
    }

    /* renamed from: p */
    public boolean mo11589p(int r2, p260oi.C5287i r3, int r4, int r5) {
            r1 = this;
            byte[] r0 = r1.f20508a0
            boolean r2 = r3.mo11590q(r4, r0, r2, r5)
            return r2
    }

    /* renamed from: q */
    public boolean mo11590q(int r3, byte[] r4, int r5, int r6) {
            r2 = this;
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r4, r0)
            if (r3 < 0) goto L1b
            byte[] r0 = r2.f20508a0
            int r1 = r0.length
            int r1 = r1 - r6
            if (r3 > r1) goto L1b
            if (r5 < 0) goto L1b
            int r1 = r4.length
            int r1 = r1 - r6
            if (r5 > r1) goto L1b
            boolean r3 = p080ei.C1854b.m4601c(r0, r3, r4, r5, r6)
            if (r3 == 0) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            return r3
    }

    /* renamed from: r */
    public p260oi.C5287i mo11591r() {
            r6 = this;
            r0 = 0
        L1:
            byte[] r1 = r6.f20508a0
            int r2 = r1.length
            if (r0 >= r2) goto L3f
            r2 = r1[r0]
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L3c
            r4 = 90
            byte r4 = (byte) r4
            if (r2 <= r4) goto L13
            goto L3c
        L13:
            int r5 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r5)
            java.lang.String r5 = "java.util.Arrays.copyOf(this, size)"
            p214m2.C4339q.m9705j(r1, r5)
            int r5 = r0 + 1
            int r2 = r2 + 32
            byte r2 = (byte) r2
            r1[r0] = r2
        L24:
            int r0 = r1.length
            if (r5 >= r0) goto L36
            r0 = r1[r5]
            if (r0 < r3) goto L33
            if (r0 <= r4) goto L2e
            goto L33
        L2e:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r1[r5] = r0
        L33:
            int r5 = r5 + 1
            goto L24
        L36:
            oi.i r0 = new oi.i
            r0.<init>(r1)
            goto L40
        L3c:
            int r0 = r0 + 1
            goto L1
        L3f:
            r0 = r6
        L40:
            return r0
    }

    /* renamed from: s */
    public java.lang.String m11592s() {
            r3 = this;
            java.lang.String r0 = r3.f20507Z
            if (r0 != 0) goto L17
            byte[] r0 = r3.mo11587l()
            java.lang.String r1 = "$this$toUtf8String"
            p214m2.C4339q.m9706k(r0, r1)
            java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r1)
            r3.f20507Z = r2
            r0 = r2
        L17:
            return r0
    }

    /* renamed from: t */
    public void mo11593t(p260oi.C5283e r2, int r3, int r4) {
            r1 = this;
            byte[] r0 = r1.f20508a0
            r2.m11536B0(r0, r3, r4)
            return
    }

    public java.lang.String toString() {
            r16 = this;
            r0 = r16
            byte[] r1 = r0.f20508a0
            int r2 = r1.length
            if (r2 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            java.lang.String r1 = "[size=0]"
            goto L2a9
        L10:
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        L14:
            r6 = 64
            if (r3 >= r2) goto L1ef
            r7 = r1[r3]
            r8 = 13
            r9 = 10
            r10 = 31
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 159(0x9f, float:2.23E-43)
            r13 = 65533(0xfffd, float:9.1831E-41)
            r14 = 65536(0x10000, float:9.1835E-41)
            if (r7 < 0) goto L7e
            int r15 = r4 + 1
            if (r4 != r6) goto L31
            goto L1ef
        L31:
            if (r7 == r9) goto L43
            if (r7 == r8) goto L43
            if (r7 < 0) goto L39
            if (r10 >= r7) goto L3e
        L39:
            if (r11 <= r7) goto L3c
            goto L40
        L3c:
            if (r12 < r7) goto L40
        L3e:
            r4 = 1
            goto L41
        L40:
            r4 = 0
        L41:
            if (r4 != 0) goto L1ee
        L43:
            if (r7 != r13) goto L47
            goto L1ee
        L47:
            if (r7 >= r14) goto L4b
            r4 = 1
            goto L4c
        L4b:
            r4 = 2
        L4c:
            int r5 = r5 + r4
            int r3 = r3 + 1
        L4f:
            r4 = r15
            if (r3 >= r2) goto L14
            r7 = r1[r3]
            if (r7 < 0) goto L14
            int r7 = r3 + 1
            r3 = r1[r3]
            int r15 = r4 + 1
            if (r4 != r6) goto L60
            goto L1ef
        L60:
            if (r3 == r9) goto L72
            if (r3 == r8) goto L72
            if (r3 < 0) goto L68
            if (r10 >= r3) goto L6d
        L68:
            if (r11 <= r3) goto L6b
            goto L6f
        L6b:
            if (r12 < r3) goto L6f
        L6d:
            r4 = 1
            goto L70
        L6f:
            r4 = 0
        L70:
            if (r4 != 0) goto L1ee
        L72:
            if (r3 != r13) goto L76
            goto L1ee
        L76:
            if (r3 >= r14) goto L7a
            r3 = 1
            goto L7b
        L7a:
            r3 = 2
        L7b:
            int r5 = r5 + r3
            r3 = r7
            goto L4f
        L7e:
            int r13 = r7 >> 5
            r14 = -2
            r15 = 128(0x80, float:1.8E-43)
            if (r13 != r14) goto Ld5
            int r7 = r3 + 1
            if (r2 > r7) goto L8d
            if (r4 != r6) goto L1ee
            goto L1ef
        L8d:
            r13 = r1[r3]
            r7 = r1[r7]
            r14 = r7 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L97
            r14 = 1
            goto L98
        L97:
            r14 = 0
        L98:
            if (r14 != 0) goto L9e
            if (r4 != r6) goto L1ee
            goto L1ef
        L9e:
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r13 = r13 << 6
            r7 = r7 ^ r13
            if (r7 >= r15) goto La9
            if (r4 != r6) goto L1ee
            goto L1ef
        La9:
            int r13 = r4 + 1
            if (r4 != r6) goto Laf
            goto L1ef
        Laf:
            if (r7 == r9) goto Lc1
            if (r7 == r8) goto Lc1
            if (r7 < 0) goto Lb7
            if (r10 >= r7) goto Lbc
        Lb7:
            if (r11 <= r7) goto Lba
            goto Lbe
        Lba:
            if (r12 < r7) goto Lbe
        Lbc:
            r4 = 1
            goto Lbf
        Lbe:
            r4 = 0
        Lbf:
            if (r4 != 0) goto L1ee
        Lc1:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto Lc8
            goto L1ee
        Lc8:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r4) goto Lce
            r15 = 1
            goto Lcf
        Lce:
            r15 = 2
        Lcf:
            int r5 = r5 + r15
            int r3 = r3 + 2
            r4 = r13
            goto L14
        Ld5:
            int r10 = r7 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            if (r10 != r14) goto L156
            int r7 = r3 + 2
            if (r2 > r7) goto Le7
            if (r4 != r6) goto L1ee
            goto L1ef
        Le7:
            r10 = r1[r3]
            int r13 = r3 + 1
            r13 = r1[r13]
            r14 = r13 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto Lf3
            r14 = 1
            goto Lf4
        Lf3:
            r14 = 0
        Lf4:
            if (r14 != 0) goto Lfa
            if (r4 != r6) goto L1ee
            goto L1ef
        Lfa:
            r7 = r1[r7]
            r14 = r7 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L102
            r14 = 1
            goto L103
        L102:
            r14 = 0
        L103:
            if (r14 != 0) goto L109
            if (r4 != r6) goto L1ee
            goto L1ef
        L109:
            r14 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r14
            int r13 = r13 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r7 >= r10) goto L11b
            if (r4 != r6) goto L1ee
            goto L1ef
        L11b:
            if (r11 <= r7) goto L11e
            goto L124
        L11e:
            if (r12 < r7) goto L124
            if (r4 != r6) goto L1ee
            goto L1ef
        L124:
            int r10 = r4 + 1
            if (r4 != r6) goto L12a
            goto L1ef
        L12a:
            if (r7 == r9) goto L142
            if (r7 == r8) goto L142
            if (r7 < 0) goto L134
            r4 = 31
            if (r4 >= r7) goto L13d
        L134:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L139
            goto L13f
        L139:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L13f
        L13d:
            r4 = 1
            goto L140
        L13f:
            r4 = 0
        L140:
            if (r4 != 0) goto L1ee
        L142:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L149
            goto L1ee
        L149:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r4) goto L14f
            r15 = 1
            goto L150
        L14f:
            r15 = 2
        L150:
            int r5 = r5 + r15
            int r3 = r3 + 3
            r4 = r10
            goto L14
        L156:
            int r7 = r7 >> 3
            if (r7 != r14) goto L1eb
            int r7 = r3 + 3
            if (r2 > r7) goto L162
            if (r4 != r6) goto L1ee
            goto L1ef
        L162:
            r8 = r1[r3]
            int r10 = r3 + 1
            r10 = r1[r10]
            r13 = r10 & 192(0xc0, float:2.69E-43)
            if (r13 != r15) goto L16e
            r13 = 1
            goto L16f
        L16e:
            r13 = 0
        L16f:
            if (r13 != 0) goto L175
            if (r4 != r6) goto L1ee
            goto L1ef
        L175:
            int r13 = r3 + 2
            r13 = r1[r13]
            r14 = r13 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L17f
            r14 = 1
            goto L180
        L17f:
            r14 = 0
        L180:
            if (r14 != 0) goto L186
            if (r4 != r6) goto L1ee
            goto L1ef
        L186:
            r7 = r1[r7]
            r14 = r7 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L18e
            r14 = 1
            goto L18f
        L18e:
            r14 = 0
        L18f:
            if (r14 != 0) goto L195
            if (r4 != r6) goto L1ee
            goto L1ef
        L195:
            r14 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r14
            int r13 = r13 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            int r8 = r8 << 18
            r7 = r7 ^ r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r7 <= r8) goto L1aa
            if (r4 != r6) goto L1ee
            goto L1ef
        L1aa:
            if (r11 <= r7) goto L1ad
            goto L1b2
        L1ad:
            if (r12 < r7) goto L1b2
            if (r4 != r6) goto L1ee
            goto L1ef
        L1b2:
            r8 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r8) goto L1b9
            if (r4 != r6) goto L1ee
            goto L1ef
        L1b9:
            int r8 = r4 + 1
            if (r4 != r6) goto L1be
            goto L1ef
        L1be:
            if (r7 == r9) goto L1d8
            r4 = 13
            if (r7 == r4) goto L1d8
            if (r7 < 0) goto L1ca
            r4 = 31
            if (r4 >= r7) goto L1d3
        L1ca:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L1cf
            goto L1d5
        L1cf:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L1d5
        L1d3:
            r4 = 1
            goto L1d6
        L1d5:
            r4 = 0
        L1d6:
            if (r4 != 0) goto L1ee
        L1d8:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L1de
            goto L1ee
        L1de:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r4) goto L1e4
            r15 = 1
            goto L1e5
        L1e4:
            r15 = 2
        L1e5:
            int r5 = r5 + r15
            int r3 = r3 + 4
            r4 = r8
            goto L14
        L1eb:
            if (r4 != r6) goto L1ee
            goto L1ef
        L1ee:
            r5 = -1
        L1ef:
            java.lang.String r1 = "\u2026]"
            r2 = 93
            java.lang.String r3 = "[size="
            r4 = -1
            if (r5 != r4) goto L255
            byte[] r4 = r0.f20508a0
            int r4 = r4.length
            if (r4 > r6) goto L20c
            java.lang.String r1 = "[hex="
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r3 = r16.mo11586k()
            r1.append(r3)
            goto L2a2
        L20c:
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r3)
            byte[] r3 = r0.f20508a0
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " hex="
            r2.append(r3)
            byte[] r3 = r0.f20508a0
            int r4 = r3.length
            if (r6 > r4) goto L222
            r4 = 1
            goto L223
        L222:
            r4 = 0
        L223:
            if (r4 == 0) goto L23c
            int r4 = r3.length
            if (r6 != r4) goto L22a
            r4 = r0
            goto L234
        L22a:
            oi.i r4 = new oi.i
            r5 = 0
            byte[] r3 = p062dh.C1468d.m3986H(r3, r5, r6)
            r4.<init>(r3)
        L234:
            java.lang.String r3 = r4.mo11586k()
            r2.append(r3)
            goto L294
        L23c:
            java.lang.String r1 = "endIndex > length("
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            byte[] r2 = r0.f20508a0
            int r2 = r2.length
            r3 = 41
            java.lang.String r1 = p084f0.C1939b.m4826a(r1, r2, r3)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L255:
            java.lang.String r4 = r16.m11592s()
            r6 = 0
            java.lang.String r7 = r4.substring(r6, r5)
            java.lang.String r8 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r7, r8)
            java.lang.String r8 = "\\"
            java.lang.String r9 = "\\\\"
            r10 = 4
            java.lang.String r7 = p362uh.C6463i.m13057N(r7, r8, r9, r6, r10)
            java.lang.String r8 = "\n"
            java.lang.String r9 = "\\n"
            java.lang.String r7 = p362uh.C6463i.m13057N(r7, r8, r9, r6, r10)
            java.lang.String r8 = "\r"
            java.lang.String r9 = "\\r"
            java.lang.String r6 = p362uh.C6463i.m13057N(r7, r8, r9, r6, r10)
            int r4 = r4.length()
            if (r5 >= r4) goto L29c
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r3)
            byte[] r3 = r0.f20508a0
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " text="
            r2.append(r3)
            r2.append(r6)
        L294:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L2a9
        L29c:
            java.lang.String r1 = "[text="
            java.lang.StringBuilder r1 = android.support.v4.media.C0143b.m255a(r1, r6)
        L2a2:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L2a9:
            return r1
    }
}

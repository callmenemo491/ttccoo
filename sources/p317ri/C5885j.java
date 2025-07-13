package p317ri;

/* renamed from: ri.j */
/* loaded from: classes.dex */
public class C5885j extends java.io.FilterInputStream {

    /* renamed from: Y */
    public final int f22706Y;

    /* renamed from: Z */
    public final boolean f22707Z;

    /* renamed from: a0 */
    public final byte[][] f22708a0;

    public C5885j(java.io.InputStream r2) {
            r1 = this;
            int r0 = p317ri.C5923v1.m12292c(r2)
            r1.<init>(r2)
            r1.f22706Y = r0
            r2 = 0
            r1.f22707Z = r2
            r2 = 11
            byte[][] r2 = new byte[r2][]
            r1.f22708a0 = r2
            return
    }

    public C5885j(java.io.InputStream r2, boolean r3) {
            r1 = this;
            int r0 = p317ri.C5923v1.m12292c(r2)
            r1.<init>(r2)
            r1.f22706Y = r0
            r1.f22707Z = r3
            r2 = 11
            byte[][] r2 = new byte[r2][]
            r1.f22708a0 = r2
            return
    }

    public C5885j(byte[] r2) {
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            int r2 = r2.length
            r1.<init>(r0)
            r1.f22706Y = r2
            r2 = 0
            r1.f22707Z = r2
            r2 = 11
            byte[][] r2 = new byte[r2][]
            r1.f22708a0 = r2
            return
    }

    public C5885j(byte[] r2, boolean r3) {
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            int r2 = r2.length
            r1.<init>(r0)
            r1.f22706Y = r2
            r1.f22707Z = r3
            r2 = 11
            byte[][] r2 = new byte[r2][]
            r1.f22708a0 = r2
            return
    }

    /* renamed from: L */
    public static int m12233L(java.io.InputStream r2, int r3) {
            r0 = 31
            r3 = r3 & r0
            if (r3 != r0) goto L34
            r3 = 0
            int r0 = r2.read()
            r1 = r0 & 127(0x7f, float:1.78E-43)
            if (r1 == 0) goto L2c
        Le:
            if (r0 < 0) goto L1e
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L1e
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r3 = r3 | r0
            int r3 = r3 << 7
            int r0 = r2.read()
            goto Le
        L1e:
            if (r0 < 0) goto L24
            r2 = r0 & 127(0x7f, float:1.78E-43)
            r3 = r3 | r2
            goto L34
        L24:
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.String r3 = "EOF found inside tag value."
            r2.<init>(r3)
            throw r2
        L2c:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "corrupted stream - invalid high tag number found"
            r2.<init>(r3)
            throw r2
        L34:
            return r3
    }

    /* renamed from: i */
    public static p317ri.AbstractC5912s m12234i(int r5, p317ri.C5905p1 r6, byte[][] r7) {
            r0 = 1
            r1 = 255(0xff, float:3.57E-43)
            r2 = 10
            r3 = 0
            if (r5 == r2) goto L12d
            r2 = 12
            if (r5 == r2) goto L123
            r2 = 30
            if (r5 == r2) goto Lfb
            switch(r5) {
                case 1: goto L84;
                case 2: goto L7a;
                case 3: goto L3a;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L24;
                default: goto L13;
            }
        L13:
            switch(r5) {
                case 18: goto Lf1;
                case 19: goto Le7;
                case 20: goto Ldd;
                case 21: goto Ld3;
                case 22: goto Lc9;
                case 23: goto Lbf;
                case 24: goto Lb5;
                case 25: goto Lab;
                case 26: goto La1;
                case 27: goto L97;
                case 28: goto L8d;
                default: goto L16;
            }
        L16:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "unknown tag "
            java.lang.String r0 = " encountered"
            java.lang.String r5 = android.support.v4.media.C0146e.m258a(r7, r5, r0)
            r6.<init>(r5)
            throw r6
        L24:
            byte[] r5 = m12235l(r6, r7)
            ri.n r5 = p317ri.C5897n.m12248D(r5)
            return r5
        L2d:
            ri.v0 r5 = p317ri.C5922v0.f22751Y
            return r5
        L30:
            ri.x0 r5 = new ri.x0
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        L3a:
            int r5 = r6.f22729b0
            if (r5 < r0) goto L72
            int r7 = r6.read()
            int r5 = r5 - r0
            byte[] r2 = new byte[r5]
            if (r5 == 0) goto L6c
            int r6 = p441yj.C7221a.m14286a(r6, r2)
            if (r6 != r5) goto L64
            if (r7 <= 0) goto L6c
            r6 = 8
            if (r7 >= r6) goto L6c
            int r5 = r5 - r0
            r6 = r2[r5]
            r5 = r2[r5]
            int r0 = r1 << r7
            r5 = r5 & r0
            byte r5 = (byte) r5
            if (r6 == r5) goto L6c
            ri.j1 r5 = new ri.j1
            r5.<init>(r2, r7)
            goto L71
        L64:
            java.io.EOFException r5 = new java.io.EOFException
            java.lang.String r6 = "EOF encountered in middle of BIT STRING"
            r5.<init>(r6)
            throw r5
        L6c:
            ri.n0 r5 = new ri.n0
            r5.<init>(r2, r7)
        L71:
            return r5
        L72:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "truncated BIT STRING detected"
            r5.<init>(r6)
            throw r5
        L7a:
            ri.k r5 = new ri.k
            byte[] r6 = r6.m12261i()
            r5.<init>(r6, r3)
            return r5
        L84:
            byte[] r5 = m12235l(r6, r7)
            ri.c r5 = p317ri.C5864c.m12215C(r5)
            return r5
        L8d:
            ri.f1 r5 = new ri.f1
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        L97:
            ri.r0 r5 = new ri.r0
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        La1:
            ri.h1 r5 = new ri.h1
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        Lab:
            ri.t0 r5 = new ri.t0
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        Lb5:
            ri.i r5 = new ri.i
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        Lbf:
            ri.z r5 = new ri.z
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        Lc9:
            ri.u0 r5 = new ri.u0
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        Ld3:
            ri.g1 r5 = new ri.g1
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        Ldd:
            ri.c1 r5 = new ri.c1
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        Le7:
            ri.z0 r5 = new ri.z0
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        Lf1:
            ri.w0 r5 = new ri.w0
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        Lfb:
            ri.m0 r5 = new ri.m0
            int r7 = r6.f22729b0
            int r7 = r7 / 2
            char[] r0 = new char[r7]
        L103:
            if (r3 >= r7) goto L11f
            int r1 = r6.read()
            if (r1 >= 0) goto L10c
            goto L11f
        L10c:
            int r2 = r6.read()
            if (r2 >= 0) goto L113
            goto L11f
        L113:
            int r4 = r3 + 1
            int r1 = r1 << 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1 = r1 | r2
            char r1 = (char) r1
            r0[r3] = r1
            r3 = r4
            goto L103
        L11f:
            r5.<init>(r0)
            return r5
        L123:
            ri.e1 r5 = new ri.e1
            byte[] r6 = r6.m12261i()
            r5.<init>(r6)
            return r5
        L12d:
            byte[] r5 = m12235l(r6, r7)
            int r6 = r5.length
            if (r6 <= r0) goto L13a
            ri.f r6 = new ri.f
            r6.<init>(r5)
            goto L15f
        L13a:
            int r6 = r5.length
            if (r6 == 0) goto L160
            r6 = r5[r3]
            r6 = r6 & r1
            ri.f[] r7 = p317ri.C5873f.f22688Z
            int r0 = r7.length
            if (r6 < r0) goto L14f
            ri.f r6 = new ri.f
            byte[] r5 = p400wj.C6888a.m13951c(r5)
            r6.<init>(r5)
            goto L15f
        L14f:
            r0 = r7[r6]
            if (r0 != 0) goto L15e
            ri.f r0 = new ri.f
            byte[] r5 = p400wj.C6888a.m13951c(r5)
            r0.<init>(r5)
            r7[r6] = r0
        L15e:
            r6 = r0
        L15f:
            return r6
        L160:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "ENUMERATED has zero length"
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: l */
    public static byte[] m12235l(p317ri.C5905p1 r2, byte[][] r3) {
            int r0 = r2.f22729b0
            int r1 = r3.length
            if (r0 >= r1) goto L11
            r1 = r3[r0]
            if (r1 != 0) goto Ld
            byte[] r1 = new byte[r0]
            r3[r0] = r1
        Ld:
            p441yj.C7221a.m14286a(r2, r1)
            return r1
        L11:
            byte[] r2 = r2.m12261i()
            return r2
    }

    /* renamed from: n */
    public static int m12236n(java.io.InputStream r4, int r5) {
            int r0 = r4.read()
            if (r0 < 0) goto L50
            r1 = 128(0x80, float:1.8E-43)
            if (r0 != r1) goto Lc
            r4 = -1
            return r4
        Lc:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L4f
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r1 = 4
            if (r0 > r1) goto L43
            r1 = 0
            r2 = 0
        L17:
            if (r2 >= r0) goto L2d
            int r3 = r4.read()
            if (r3 < 0) goto L25
            int r1 = r1 << 8
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L17
        L25:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "EOF found reading length"
            r4.<init>(r5)
            throw r4
        L2d:
            if (r1 < 0) goto L3b
            if (r1 >= r5) goto L33
            r0 = r1
            goto L4f
        L33:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "corrupted stream - out of bounds length found"
            r4.<init>(r5)
            throw r4
        L3b:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "corrupted stream - negative length found"
            r4.<init>(r5)
            throw r4
        L43:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "DER length more than 4 bytes: "
            java.lang.String r5 = android.support.v4.media.C0142a.m254a(r5, r0)
            r4.<init>(r5)
            throw r4
        L4f:
            return r0
        L50:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "EOF found when length expected"
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: A */
    public p317ri.AbstractC5912s m12237A() {
            r7 = this;
            int r0 = r7.read()
            if (r0 > 0) goto L12
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "unexpected end-of-contents marker"
            r0.<init>(r1)
            throw r0
        L12:
            int r1 = m12233L(r7, r0)
            r2 = r0 & 32
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            int r5 = r7.f22706Y
            int r5 = m12236n(r7, r5)
            if (r5 >= 0) goto Lb8
            if (r2 == 0) goto Lb0
            ri.r1 r2 = new ri.r1
            int r5 = r7.f22706Y
            r2.<init>(r7, r5)
            ma.a r5 = new ma.a
            int r6 = r7.f22706Y
            r5.<init>(r2, r6)
            r2 = r0 & 64
            if (r2 == 0) goto L45
            ri.a0 r0 = new ri.a0
            h7.rb r2 = r5.m10392d()
            r0.<init>(r1, r2)
            return r0
        L45:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L4e
            ri.s r0 = r5.m10391c(r4, r1)
            return r0
        L4e:
            r0 = 4
            if (r1 == r0) goto L8e
            r0 = 8
            if (r1 == r0) goto L79
            r0 = 16
            if (r1 == r0) goto L6f
            r0 = 17
            if (r1 != r0) goto L67
            ri.h0 r0 = new ri.h0
            h7.rb r1 = r5.m10392d()
            r0.<init>(r1)
            return r0
        L67:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "unknown BER object encountered"
            r0.<init>(r1)
            throw r0
        L6f:
            ri.f0 r0 = new ri.f0
            h7.rb r1 = r5.m10392d()
            r0.<init>(r1)
            return r0
        L79:
            ri.k1 r0 = new ri.k1     // Catch: java.lang.IllegalArgumentException -> L83
            h7.rb r1 = r5.m10392d()     // Catch: java.lang.IllegalArgumentException -> L83
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L83
            return r0
        L83:
            r0 = move-exception
            ri.g r1 = new ri.g
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0, r3)
            throw r1
        L8e:
            ri.d0 r0 = new ri.d0
            ri.l0 r1 = new ri.l0
            r1.<init>(r5)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r4]
        L9e:
            int r6 = r1.read(r5, r3, r4)
            if (r6 < 0) goto La8
            r2.write(r5, r3, r6)
            goto L9e
        La8:
            byte[] r1 = r2.toByteArray()
            r0.<init>(r1)
            return r0
        Lb0:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "indefinite-length primitive encoding encountered"
            r0.<init>(r1)
            throw r0
        Lb8:
            ri.s r0 = r7.m12239h(r0, r1, r5)     // Catch: java.lang.IllegalArgumentException -> Lbd
            return r0
        Lbd:
            r0 = move-exception
            ri.g r1 = new ri.g
            java.lang.String r2 = "corrupted stream detected"
            r1.<init>(r2, r0, r3)
            throw r1
    }

    /* renamed from: a */
    public p124h7.C2839rb m12238a(p317ri.C5905p1 r4) {
            r3 = this;
            ri.j r0 = new ri.j
            r0.<init>(r4)
            h7.rb r4 = new h7.rb
            r1 = 25
            r4.<init>(r1)
        Lc:
            ri.s r1 = r0.m12237A()
            if (r1 == 0) goto L1a
            java.lang.Object r2 = r4.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            goto Lc
        L1a:
            return r4
    }

    /* renamed from: h */
    public p317ri.AbstractC5912s m12239h(int r5, int r6, int r7) {
            r4 = this;
            r0 = r5 & 32
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            ri.p1 r3 = new ri.p1
            r3.<init>(r4, r7)
            r7 = r5 & 64
            if (r7 == 0) goto L1c
            ri.i1 r5 = new ri.i1
            byte[] r7 = r3.m12261i()
            r5.<init>(r0, r6, r7)
            return r5
        L1c:
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L2a
            ma.a r5 = new ma.a
            r5.<init>(r3)
            ri.s r5 = r5.m10391c(r0, r6)
            return r5
        L2a:
            if (r0 == 0) goto Laa
            r5 = 4
            if (r6 == r5) goto L8d
            r5 = 8
            if (r6 == r5) goto L83
            r5 = 16
            if (r6 == r5) goto L5f
            r5 = 17
            if (r6 != r5) goto L51
            h7.rb r5 = r4.m12238a(r3)
            ri.t r6 = p317ri.C5907q0.f22732a
            int r6 = r5.m7098u()
            if (r6 >= r2) goto L4a
            ri.v r5 = p317ri.C5907q0.f22733b
            goto L50
        L4a:
            ri.b1 r6 = new ri.b1
            r6.<init>(r5)
            r5 = r6
        L50:
            return r5
        L51:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r7 = "unknown tag "
            java.lang.String r0 = " encountered"
            java.lang.String r6 = android.support.v4.media.C0146e.m258a(r7, r6, r0)
            r5.<init>(r6)
            throw r5
        L5f:
            boolean r5 = r4.f22707Z
            if (r5 == 0) goto L6d
            ri.t1 r5 = new ri.t1
            byte[] r6 = r3.m12261i()
            r5.<init>(r6)
            return r5
        L6d:
            h7.rb r5 = r4.m12238a(r3)
            ri.t r6 = p317ri.C5907q0.f22732a
            int r6 = r5.m7098u()
            if (r6 >= r2) goto L7c
            ri.t r5 = p317ri.C5907q0.f22732a
            goto L82
        L7c:
            ri.m1 r6 = new ri.m1
            r6.<init>(r5)
            r5 = r6
        L82:
            return r5
        L83:
            ri.k1 r5 = new ri.k1
            h7.rb r6 = r4.m12238a(r3)
            r5.<init>(r6)
            return r5
        L8d:
            h7.rb r5 = r4.m12238a(r3)
            int r6 = r5.m7098u()
            ri.o[] r7 = new p317ri.AbstractC5900o[r6]
        L97:
            if (r1 == r6) goto La4
            ri.e r0 = r5.m7093n(r1)
            ri.o r0 = (p317ri.AbstractC5900o) r0
            r7[r1] = r0
            int r1 = r1 + 1
            goto L97
        La4:
            ri.d0 r5 = new ri.d0
            r5.<init>(r7)
            return r5
        Laa:
            byte[][] r5 = r4.f22708a0
            ri.s r5 = m12234i(r6, r3, r5)
            return r5
    }
}

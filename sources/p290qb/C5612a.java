package p290qb;

/* renamed from: qb.a */
/* loaded from: classes.dex */
public class C5612a implements java.io.Closeable {

    /* renamed from: n0 */
    public static final char[] f21774n0 = null;

    /* renamed from: Y */
    public final java.io.Reader f21775Y;

    /* renamed from: Z */
    public boolean f21776Z;

    /* renamed from: a0 */
    public final char[] f21777a0;

    /* renamed from: b0 */
    public int f21778b0;

    /* renamed from: c0 */
    public int f21779c0;

    /* renamed from: d0 */
    public int f21780d0;

    /* renamed from: e0 */
    public int f21781e0;

    /* renamed from: f0 */
    public int f21782f0;

    /* renamed from: g0 */
    public long f21783g0;

    /* renamed from: h0 */
    public int f21784h0;

    /* renamed from: i0 */
    public java.lang.String f21785i0;

    /* renamed from: j0 */
    public int[] f21786j0;

    /* renamed from: k0 */
    public int f21787k0;

    /* renamed from: l0 */
    public java.lang.String[] f21788l0;

    /* renamed from: m0 */
    public int[] f21789m0;

    /* renamed from: qb.a$a */
    public class a extends p124h7.AbstractC2951xf {
        public a() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // p124h7.AbstractC2951xf
        /* renamed from: c */
        public void mo7311c(p290qb.C5612a r4) {
                r3 = this;
                boolean r0 = r4 instanceof p222mb.C4514e
                if (r0 == 0) goto L2d
                mb.e r4 = (p222mb.C4514e) r4
                qb.b r0 = p290qb.EnumC5613b.f21794c0
                r4.m10398G0(r0)
                java.lang.Object r0 = r4.m10399H0()
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                r4.m10402J0(r1)
                jb.t r1 = new jb.t
                java.lang.Object r0 = r0.getKey()
                java.lang.String r0 = (java.lang.String) r0
                r1.<init>(r0)
                r4.m10402J0(r1)
                return
            L2d:
                int r0 = r4.f21782f0
                if (r0 != 0) goto L35
                int r0 = r4.m11899l()
            L35:
                r1 = 13
                if (r0 != r1) goto L3c
                r0 = 9
                goto L49
            L3c:
                r1 = 12
                if (r0 != r1) goto L43
                r0 = 8
                goto L49
            L43:
                r1 = 14
                if (r0 != r1) goto L4c
                r0 = 10
            L49:
                r4.f21782f0 = r0
                return
            L4c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Expected a name but was "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                qb.b r2 = r4.mo10414z0()
                r1.append(r2)
                java.lang.String r4 = r4.m11896S()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    static {
            java.lang.String r0 = ")]}'\n"
            char[] r0 = r0.toCharArray()
            p290qb.C5612a.f21774n0 = r0
            qb.a$a r0 = new qb.a$a
            r0.<init>()
            p124h7.AbstractC2951xf.f12032a = r0
            return
    }

    public C5612a(java.io.Reader r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f21776Z = r0
            r1 = 1024(0x400, float:1.435E-42)
            char[] r1 = new char[r1]
            r4.f21777a0 = r1
            r4.f21778b0 = r0
            r4.f21779c0 = r0
            r4.f21780d0 = r0
            r4.f21781e0 = r0
            r4.f21782f0 = r0
            r1 = 32
            int[] r2 = new int[r1]
            r4.f21786j0 = r2
            r4.f21787k0 = r0
            int r3 = r0 + 1
            r4.f21787k0 = r3
            r3 = 6
            r2[r0] = r3
            java.lang.String[] r0 = new java.lang.String[r1]
            r4.f21788l0 = r0
            int[] r0 = new int[r1]
            r4.f21789m0 = r0
            java.lang.String r0 = "in == null"
            java.util.Objects.requireNonNull(r5, r0)
            r4.f21775Y = r5
            return
    }

    /* renamed from: A */
    public void mo10396A() {
            r3 = this;
            int r0 = r3.f21782f0
            if (r0 != 0) goto L8
            int r0 = r3.m11899l()
        L8:
            r1 = 2
            if (r0 != r1) goto L24
            int r0 = r3.f21787k0
            int r0 = r0 + (-1)
            r3.f21787k0 = r0
            java.lang.String[] r1 = r3.f21788l0
            r2 = 0
            r1[r0] = r2
            int[] r1 = r3.f21789m0
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
            r0 = 0
            r3.f21782f0 = r0
            return
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected END_OBJECT but was "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            qb.b r2 = r3.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r3.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: A0 */
    public final void m11889A0(int r4) {
            r3 = this;
            int r0 = r3.f21787k0
            int[] r1 = r3.f21786j0
            int r2 = r1.length
            if (r0 != r2) goto L21
            int r0 = r0 * 2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f21786j0 = r1
            int[] r1 = r3.f21789m0
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f21789m0 = r1
            java.lang.String[] r1 = r3.f21788l0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.f21788l0 = r0
        L21:
            int[] r0 = r3.f21786j0
            int r1 = r3.f21787k0
            int r2 = r1 + 1
            r3.f21787k0 = r2
            r0[r1] = r4
            return
    }

    /* renamed from: B0 */
    public final char m11890B0() {
            r8 = this;
            int r0 = r8.f21778b0
            int r1 = r8.f21779c0
            java.lang.String r2 = "Unterminated escape sequence"
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L15
            boolean r0 = r8.m11894L(r4)
            if (r0 == 0) goto L11
            goto L15
        L11:
            r8.m11893F0(r2)
            throw r3
        L15:
            char[] r0 = r8.f21777a0
            int r1 = r8.f21778b0
            int r5 = r1 + 1
            r8.f21778b0 = r5
            char r0 = r0[r1]
            r1 = 10
            if (r0 == r1) goto Lc3
            r4 = 34
            if (r0 == r4) goto Lca
            r4 = 39
            if (r0 == r4) goto Lca
            r4 = 47
            if (r0 == r4) goto Lca
            r4 = 92
            if (r0 == r4) goto Lca
            r4 = 98
            if (r0 == r4) goto Lc0
            r4 = 102(0x66, float:1.43E-43)
            if (r0 == r4) goto Lbd
            r6 = 110(0x6e, float:1.54E-43)
            if (r0 == r6) goto Lbc
            r6 = 114(0x72, float:1.6E-43)
            if (r0 == r6) goto Lb9
            r6 = 116(0x74, float:1.63E-43)
            if (r0 == r6) goto Lb6
            r6 = 117(0x75, float:1.64E-43)
            if (r0 != r6) goto Lb0
            r0 = 4
            int r5 = r5 + r0
            int r6 = r8.f21779c0
            if (r5 <= r6) goto L5c
            boolean r5 = r8.m11894L(r0)
            if (r5 == 0) goto L58
            goto L5c
        L58:
            r8.m11893F0(r2)
            throw r3
        L5c:
            r2 = 0
            int r3 = r8.f21778b0
            int r5 = r3 + 4
        L61:
            if (r3 >= r5) goto Laa
            char[] r6 = r8.f21777a0
            char r6 = r6[r3]
            int r2 = r2 << 4
            char r2 = (char) r2
            r7 = 48
            if (r6 < r7) goto L75
            r7 = 57
            if (r6 > r7) goto L75
            int r6 = r6 + (-48)
            goto L89
        L75:
            r7 = 97
            if (r6 < r7) goto L7e
            if (r6 > r4) goto L7e
            int r6 = r6 + (-97)
            goto L88
        L7e:
            r7 = 65
            if (r6 < r7) goto L8e
            r7 = 70
            if (r6 > r7) goto L8e
            int r6 = r6 + (-65)
        L88:
            int r6 = r6 + r1
        L89:
            int r6 = r6 + r2
            char r2 = (char) r6
            int r3 = r3 + 1
            goto L61
        L8e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "\\u"
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = new java.lang.String
            char[] r4 = r8.f21777a0
            int r5 = r8.f21778b0
            r3.<init>(r4, r5, r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Laa:
            int r1 = r8.f21778b0
            int r1 = r1 + r0
            r8.f21778b0 = r1
            return r2
        Lb0:
            java.lang.String r0 = "Invalid escape sequence"
            r8.m11893F0(r0)
            throw r3
        Lb6:
            r0 = 9
            return r0
        Lb9:
            r0 = 13
            return r0
        Lbc:
            return r1
        Lbd:
            r0 = 12
            return r0
        Lc0:
            r0 = 8
            return r0
        Lc3:
            int r1 = r8.f21780d0
            int r1 = r1 + r4
            r8.f21780d0 = r1
            r8.f21781e0 = r5
        Lca:
            return r0
    }

    /* renamed from: C0 */
    public final void m11891C0(char r7) {
            r6 = this;
            char[] r0 = r6.f21777a0
        L2:
            int r1 = r6.f21778b0
            int r2 = r6.f21779c0
        L6:
            r3 = 1
            if (r1 >= r2) goto L29
            int r4 = r1 + 1
            char r1 = r0[r1]
            if (r1 != r7) goto L12
            r6.f21778b0 = r4
            return
        L12:
            r5 = 92
            if (r1 != r5) goto L1c
            r6.f21778b0 = r4
            r6.m11890B0()
            goto L2
        L1c:
            r5 = 10
            if (r1 != r5) goto L27
            int r1 = r6.f21780d0
            int r1 = r1 + r3
            r6.f21780d0 = r1
            r6.f21781e0 = r4
        L27:
            r1 = r4
            goto L6
        L29:
            r6.f21778b0 = r1
            boolean r1 = r6.m11894L(r3)
            if (r1 == 0) goto L32
            goto L2
        L32:
            java.lang.String r7 = "Unterminated string"
            r6.m11893F0(r7)
            r7 = 0
            throw r7
    }

    /* renamed from: D0 */
    public final void m11892D0() {
            r4 = this;
        L0:
            int r0 = r4.f21778b0
            int r1 = r4.f21779c0
            r2 = 1
            if (r0 < r1) goto Ld
            boolean r0 = r4.m11894L(r2)
            if (r0 == 0) goto L27
        Ld:
            char[] r0 = r4.f21777a0
            int r1 = r4.f21778b0
            int r3 = r1 + 1
            r4.f21778b0 = r3
            char r0 = r0[r1]
            r1 = 10
            if (r0 != r1) goto L23
            int r0 = r4.f21780d0
            int r0 = r0 + r2
            r4.f21780d0 = r0
            r4.f21781e0 = r3
            goto L27
        L23:
            r1 = 13
            if (r0 != r1) goto L0
        L27:
            return
    }

    /* renamed from: E0 */
    public void mo10397E0() {
            r10 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r10.f21782f0
            if (r2 != 0) goto La
            int r2 = r10.m11899l()
        La:
            r3 = 3
            r4 = 1
            if (r2 != r3) goto L15
            r10.m11889A0(r4)
        L11:
            int r1 = r1 + 1
            goto Laa
        L15:
            if (r2 != r4) goto L1b
            r10.m11889A0(r3)
            goto L11
        L1b:
            r3 = 4
            if (r2 != r3) goto L27
        L1e:
            int r2 = r10.f21787k0
            int r2 = r2 - r4
            r10.f21787k0 = r2
            int r1 = r1 + (-1)
            goto Laa
        L27:
            r3 = 2
            if (r2 != r3) goto L2b
            goto L1e
        L2b:
            r3 = 14
            r5 = 13
            r6 = 12
            r7 = 10
            r8 = 9
            if (r2 == r3) goto L5b
            if (r2 != r7) goto L3a
            goto L5b
        L3a:
            r3 = 8
            if (r2 == r3) goto L55
            if (r2 != r6) goto L41
            goto L55
        L41:
            if (r2 == r8) goto L52
            if (r2 != r5) goto L46
            goto L52
        L46:
            r3 = 16
            if (r2 != r3) goto Laa
            int r2 = r10.f21778b0
            int r3 = r10.f21784h0
            int r2 = r2 + r3
            r10.f21778b0 = r2
            goto Laa
        L52:
            r2 = 34
            goto L57
        L55:
            r2 = 39
        L57:
            r10.m11891C0(r2)
            goto Laa
        L5b:
            r2 = 0
        L5c:
            int r3 = r10.f21778b0
            int r3 = r3 + r2
            int r9 = r10.f21779c0
            if (r3 >= r9) goto La2
            char[] r9 = r10.f21777a0
            char r3 = r9[r3]
            if (r3 == r8) goto L9c
            if (r3 == r7) goto L9c
            if (r3 == r6) goto L9c
            if (r3 == r5) goto L9c
            r9 = 32
            if (r3 == r9) goto L9c
            r9 = 35
            if (r3 == r9) goto L99
            r9 = 44
            if (r3 == r9) goto L9c
            r9 = 47
            if (r3 == r9) goto L99
            r9 = 61
            if (r3 == r9) goto L99
            r9 = 123(0x7b, float:1.72E-43)
            if (r3 == r9) goto L9c
            r9 = 125(0x7d, float:1.75E-43)
            if (r3 == r9) goto L9c
            r9 = 58
            if (r3 == r9) goto L9c
            r9 = 59
            if (r3 == r9) goto L99
            switch(r3) {
                case 91: goto L9c;
                case 92: goto L99;
                case 93: goto L9c;
                default: goto L96;
            }
        L96:
            int r2 = r2 + 1
            goto L5c
        L99:
            r10.m11897i()
        L9c:
            int r3 = r10.f21778b0
            int r3 = r3 + r2
            r10.f21778b0 = r3
            goto Laa
        La2:
            r10.f21778b0 = r3
            boolean r2 = r10.m11894L(r4)
            if (r2 != 0) goto L5b
        Laa:
            r10.f21782f0 = r0
            if (r1 != 0) goto L2
            int[] r0 = r10.f21789m0
            int r1 = r10.f21787k0
            int r2 = r1 + (-1)
            r3 = r0[r2]
            int r3 = r3 + r4
            r0[r2] = r3
            java.lang.String[] r0 = r10.f21788l0
            int r1 = r1 - r4
            java.lang.String r2 = "null"
            r0[r1] = r2
            return
    }

    /* renamed from: F0 */
    public final java.io.IOException m11893F0(java.lang.String r3) {
            r2 = this;
            qb.d r0 = new qb.d
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.String r1 = r2.m11896S()
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: J */
    public java.lang.String mo10401J() {
            r5 = this;
            r0 = 36
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            int r1 = r5.f21787k0
            r2 = 0
        L9:
            if (r2 >= r1) goto L44
            int[] r3 = r5.f21786j0
            r3 = r3[r2]
            r4 = 1
            if (r3 == r4) goto L30
            r4 = 2
            if (r3 == r4) goto L30
            r4 = 3
            if (r3 == r4) goto L1f
            r4 = 4
            if (r3 == r4) goto L1f
            r4 = 5
            if (r3 == r4) goto L1f
            goto L41
        L1f:
            r3 = 46
            r0.append(r3)
            java.lang.String[] r3 = r5.f21788l0
            r4 = r3[r2]
            if (r4 == 0) goto L41
            r3 = r3[r2]
            r0.append(r3)
            goto L41
        L30:
            r3 = 91
            r0.append(r3)
            int[] r3 = r5.f21789m0
            r3 = r3[r2]
            r0.append(r3)
            r3 = 93
            r0.append(r3)
        L41:
            int r2 = r2 + 1
            goto L9
        L44:
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: L */
    public final boolean m11894L(int r8) {
            r7 = this;
            char[] r0 = r7.f21777a0
            int r1 = r7.f21781e0
            int r2 = r7.f21778b0
            int r1 = r1 - r2
            r7.f21781e0 = r1
            int r1 = r7.f21779c0
            r3 = 0
            if (r1 == r2) goto L15
            int r1 = r1 - r2
            r7.f21779c0 = r1
            java.lang.System.arraycopy(r0, r2, r0, r3, r1)
            goto L17
        L15:
            r7.f21779c0 = r3
        L17:
            r7.f21778b0 = r3
        L19:
            java.io.Reader r1 = r7.f21775Y
            int r2 = r7.f21779c0
            int r4 = r0.length
            int r4 = r4 - r2
            int r1 = r1.read(r0, r2, r4)
            r2 = -1
            if (r1 == r2) goto L4b
            int r2 = r7.f21779c0
            int r2 = r2 + r1
            r7.f21779c0 = r2
            int r1 = r7.f21780d0
            r4 = 1
            if (r1 != 0) goto L48
            int r1 = r7.f21781e0
            if (r1 != 0) goto L48
            if (r2 <= 0) goto L48
            char r5 = r0[r3]
            r6 = 65279(0xfeff, float:9.1475E-41)
            if (r5 != r6) goto L48
            int r5 = r7.f21778b0
            int r5 = r5 + r4
            r7.f21778b0 = r5
            int r1 = r1 + 1
            r7.f21781e0 = r1
            int r8 = r8 + 1
        L48:
            if (r2 < r8) goto L19
            return r4
        L4b:
            return r3
    }

    /* renamed from: Q */
    public boolean mo10403Q() {
            r2 = this;
            int r0 = r2.f21782f0
            if (r0 != 0) goto L8
            int r0 = r2.m11899l()
        L8:
            r1 = 2
            if (r0 == r1) goto L10
            r1 = 4
            if (r0 == r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* renamed from: R */
    public final boolean m11895R(char r2) {
            r1 = this;
            r0 = 9
            if (r2 == r0) goto L3c
            r0 = 10
            if (r2 == r0) goto L3c
            r0 = 12
            if (r2 == r0) goto L3c
            r0 = 13
            if (r2 == r0) goto L3c
            r0 = 32
            if (r2 == r0) goto L3c
            r0 = 35
            if (r2 == r0) goto L39
            r0 = 44
            if (r2 == r0) goto L3c
            r0 = 47
            if (r2 == r0) goto L39
            r0 = 61
            if (r2 == r0) goto L39
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L3c
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 == r0) goto L3c
            r0 = 58
            if (r2 == r0) goto L3c
            r0 = 59
            if (r2 == r0) goto L39
            switch(r2) {
                case 91: goto L3c;
                case 92: goto L39;
                case 93: goto L3c;
                default: goto L37;
            }
        L37:
            r2 = 1
            return r2
        L39:
            r1.m11897i()
        L3c:
            r2 = 0
            return r2
    }

    /* renamed from: S */
    public java.lang.String m11896S() {
            r5 = this;
            int r0 = r5.f21780d0
            int r0 = r0 + 1
            int r1 = r5.f21778b0
            int r2 = r5.f21781e0
            int r1 = r1 - r2
            int r1 = r1 + 1
            java.lang.String r2 = " at line "
            java.lang.String r3 = " column "
            java.lang.String r4 = " path "
            java.lang.StringBuilder r0 = androidx.recyclerview.widget.C0608s.m2117a(r2, r0, r3, r1, r4)
            java.lang.String r1 = r5.mo10401J()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: V */
    public boolean mo10404V() {
            r5 = this;
            int r0 = r5.f21782f0
            if (r0 != 0) goto L8
            int r0 = r5.m11899l()
        L8:
            r1 = 5
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L1a
            r5.f21782f0 = r2
            int[] r0 = r5.f21789m0
            int r1 = r5.f21787k0
            int r1 = r1 - r3
            r2 = r0[r1]
            int r2 = r2 + r3
            r0[r1] = r2
            return r3
        L1a:
            r1 = 6
            if (r0 != r1) goto L2a
            r5.f21782f0 = r2
            int[] r0 = r5.f21789m0
            int r1 = r5.f21787k0
            int r1 = r1 - r3
            r4 = r0[r1]
            int r4 = r4 + r3
            r0[r1] = r4
            return r2
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected a boolean but was "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            qb.b r2 = r5.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r5.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: Z */
    public double mo10405Z() {
            r6 = this;
            int r0 = r6.f21782f0
            if (r0 != 0) goto L8
            int r0 = r6.m11899l()
        L8:
            r1 = 15
            r2 = 0
            if (r0 != r1) goto L1f
            r6.f21782f0 = r2
            int[] r0 = r6.f21789m0
            int r1 = r6.f21787k0
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r6.f21783g0
            double r0 = (double) r0
            return r0
        L1f:
            r1 = 16
            r3 = 11
            if (r0 != r1) goto L3a
            java.lang.String r0 = new java.lang.String
            char[] r1 = r6.f21777a0
            int r4 = r6.f21778b0
            int r5 = r6.f21784h0
            r0.<init>(r1, r4, r5)
            r6.f21785i0 = r0
            int r0 = r6.f21778b0
            int r1 = r6.f21784h0
            int r0 = r0 + r1
            r6.f21778b0 = r0
            goto L7a
        L3a:
            r1 = 8
            if (r0 == r1) goto L6d
            r4 = 9
            if (r0 != r4) goto L43
            goto L6d
        L43:
            r1 = 10
            if (r0 != r1) goto L4c
            java.lang.String r0 = r6.m11901y0()
            goto L78
        L4c:
            if (r0 != r3) goto L4f
            goto L7a
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected a double but was "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            qb.b r2 = r6.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r6.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6d:
            if (r0 != r1) goto L72
            r0 = 39
            goto L74
        L72:
            r0 = 34
        L74:
            java.lang.String r0 = r6.m11900s0(r0)
        L78:
            r6.f21785i0 = r0
        L7a:
            r6.f21782f0 = r3
            java.lang.String r0 = r6.f21785i0
            double r0 = java.lang.Double.parseDouble(r0)
            boolean r3 = r6.f21776Z
            if (r3 != 0) goto Lb1
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L93
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L93
            goto Lb1
        L93:
            qb.d r2 = new qb.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r6.m11896S()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        Lb1:
            r3 = 0
            r6.f21785i0 = r3
            r6.f21782f0 = r2
            int[] r2 = r6.f21789m0
            int r3 = r6.f21787k0
            int r3 = r3 + (-1)
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            return r0
    }

    /* renamed from: a */
    public void mo10406a() {
            r3 = this;
            int r0 = r3.f21782f0
            if (r0 != 0) goto L8
            int r0 = r3.m11899l()
        L8:
            r1 = 3
            if (r0 != r1) goto L1a
            r0 = 1
            r3.m11889A0(r0)
            int[] r1 = r3.f21789m0
            int r2 = r3.f21787k0
            int r2 = r2 - r0
            r0 = 0
            r1[r2] = r0
            r3.f21782f0 = r0
            return
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected BEGIN_ARRAY but was "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            qb.b r2 = r3.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r3.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b0 */
    public int mo10407b0() {
            r8 = this;
            int r0 = r8.f21782f0
            if (r0 != 0) goto L8
            int r0 = r8.m11899l()
        L8:
            r1 = 15
            java.lang.String r2 = "Expected an int but was "
            r3 = 0
            if (r0 != r1) goto L40
            long r0 = r8.f21783g0
            int r4 = (int) r0
            long r5 = (long) r4
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
            r8.f21782f0 = r3
            int[] r0 = r8.f21789m0
            int r1 = r8.f21787k0
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            return r4
        L26:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r2)
            long r2 = r8.f21783g0
            r1.append(r2)
            java.lang.String r2 = r8.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40:
            r1 = 16
            if (r0 != r1) goto L59
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f21777a0
            int r4 = r8.f21778b0
            int r5 = r8.f21784h0
            r0.<init>(r1, r4, r5)
            r8.f21785i0 = r0
            int r0 = r8.f21778b0
            int r1 = r8.f21784h0
            int r0 = r0 + r1
            r8.f21778b0 = r0
            goto Lac
        L59:
            r1 = 10
            r4 = 8
            if (r0 == r4) goto L82
            r5 = 9
            if (r0 == r5) goto L82
            if (r0 != r1) goto L66
            goto L82
        L66:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r2)
            qb.b r2 = r8.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r8.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L82:
            if (r0 != r1) goto L89
            java.lang.String r0 = r8.m11901y0()
            goto L94
        L89:
            if (r0 != r4) goto L8e
            r0 = 39
            goto L90
        L8e:
            r0 = 34
        L90:
            java.lang.String r0 = r8.m11900s0(r0)
        L94:
            r8.f21785i0 = r0
            java.lang.String r0 = r8.f21785i0     // Catch: java.lang.NumberFormatException -> Lab
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lab
            r8.f21782f0 = r3     // Catch: java.lang.NumberFormatException -> Lab
            int[] r1 = r8.f21789m0     // Catch: java.lang.NumberFormatException -> Lab
            int r4 = r8.f21787k0     // Catch: java.lang.NumberFormatException -> Lab
            int r4 = r4 + (-1)
            r5 = r1[r4]     // Catch: java.lang.NumberFormatException -> Lab
            int r5 = r5 + 1
            r1[r4] = r5     // Catch: java.lang.NumberFormatException -> Lab
            return r0
        Lab:
        Lac:
            r0 = 11
            r8.f21782f0 = r0
            java.lang.String r0 = r8.f21785i0
            double r0 = java.lang.Double.parseDouble(r0)
            int r4 = (int) r0
            double r5 = (double) r4
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 != 0) goto Lce
            r0 = 0
            r8.f21785i0 = r0
            r8.f21782f0 = r3
            int[] r0 = r8.f21789m0
            int r1 = r8.f21787k0
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            return r4
        Lce:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r2 = r8.f21785i0
            r1.append(r2)
            java.lang.String r2 = r8.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            r0 = 0
            r3.f21782f0 = r0
            int[] r1 = r3.f21786j0
            r2 = 8
            r1[r0] = r2
            r0 = 1
            r3.f21787k0 = r0
            java.io.Reader r0 = r3.f21775Y
            r0.close()
            return
    }

    /* renamed from: d0 */
    public long mo10408d0() {
            r9 = this;
            int r0 = r9.f21782f0
            if (r0 != 0) goto L8
            int r0 = r9.m11899l()
        L8:
            r1 = 15
            r2 = 0
            if (r0 != r1) goto L1e
            r9.f21782f0 = r2
            int[] r0 = r9.f21789m0
            int r1 = r9.f21787k0
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r9.f21783g0
            return r0
        L1e:
            r1 = 16
            java.lang.String r3 = "Expected a long but was "
            if (r0 != r1) goto L39
            java.lang.String r0 = new java.lang.String
            char[] r1 = r9.f21777a0
            int r4 = r9.f21778b0
            int r5 = r9.f21784h0
            r0.<init>(r1, r4, r5)
            r9.f21785i0 = r0
            int r0 = r9.f21778b0
            int r1 = r9.f21784h0
            int r0 = r0 + r1
            r9.f21778b0 = r0
            goto L8c
        L39:
            r1 = 10
            r4 = 8
            if (r0 == r4) goto L62
            r5 = 9
            if (r0 == r5) goto L62
            if (r0 != r1) goto L46
            goto L62
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r3)
            qb.b r2 = r9.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r9.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L62:
            if (r0 != r1) goto L69
            java.lang.String r0 = r9.m11901y0()
            goto L74
        L69:
            if (r0 != r4) goto L6e
            r0 = 39
            goto L70
        L6e:
            r0 = 34
        L70:
            java.lang.String r0 = r9.m11900s0(r0)
        L74:
            r9.f21785i0 = r0
            java.lang.String r0 = r9.f21785i0     // Catch: java.lang.NumberFormatException -> L8b
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L8b
            r9.f21782f0 = r2     // Catch: java.lang.NumberFormatException -> L8b
            int[] r4 = r9.f21789m0     // Catch: java.lang.NumberFormatException -> L8b
            int r5 = r9.f21787k0     // Catch: java.lang.NumberFormatException -> L8b
            int r5 = r5 + (-1)
            r6 = r4[r5]     // Catch: java.lang.NumberFormatException -> L8b
            int r6 = r6 + 1
            r4[r5] = r6     // Catch: java.lang.NumberFormatException -> L8b
            return r0
        L8b:
        L8c:
            r0 = 11
            r9.f21782f0 = r0
            java.lang.String r0 = r9.f21785i0
            double r0 = java.lang.Double.parseDouble(r0)
            long r4 = (long) r0
            double r6 = (double) r4
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto Lae
            r0 = 0
            r9.f21785i0 = r0
            r9.f21782f0 = r2
            int[] r0 = r9.f21789m0
            int r1 = r9.f21787k0
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            return r4
        Lae:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.String r2 = r9.f21785i0
            r1.append(r2)
            java.lang.String r2 = r9.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: f0 */
    public java.lang.String mo10409f0() {
            r3 = this;
            int r0 = r3.f21782f0
            if (r0 != 0) goto L8
            int r0 = r3.m11899l()
        L8:
            r1 = 14
            if (r0 != r1) goto L11
            java.lang.String r0 = r3.m11901y0()
            goto L22
        L11:
            r1 = 12
            if (r0 != r1) goto L18
            r0 = 39
            goto L1e
        L18:
            r1 = 13
            if (r0 != r1) goto L2e
            r0 = 34
        L1e:
            java.lang.String r0 = r3.m11900s0(r0)
        L22:
            r1 = 0
            r3.f21782f0 = r1
            java.lang.String[] r1 = r3.f21788l0
            int r2 = r3.f21787k0
            int r2 = r2 + (-1)
            r1[r2] = r0
            return r0
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected a name but was "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            qb.b r2 = r3.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r3.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: h */
    public void mo10410h() {
            r3 = this;
            int r0 = r3.f21782f0
            if (r0 != 0) goto L8
            int r0 = r3.m11899l()
        L8:
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 3
            r3.m11889A0(r0)
            r0 = 0
            r3.f21782f0 = r0
            return
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected BEGIN_OBJECT but was "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            qb.b r2 = r3.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r3.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: i */
    public final void m11897i() {
            r1 = this;
            boolean r0 = r1.f21776Z
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            r1.m11893F0(r0)
            r0 = 0
            throw r0
    }

    /* renamed from: i0 */
    public final int m11898i0(boolean r10) {
            r9 = this;
            char[] r0 = r9.f21777a0
        L2:
            int r1 = r9.f21778b0
        L4:
            int r2 = r9.f21779c0
        L6:
            r3 = 1
            if (r1 != r2) goto L30
            r9.f21778b0 = r1
            boolean r1 = r9.m11894L(r3)
            if (r1 != 0) goto L2c
            if (r10 != 0) goto L15
            r10 = -1
            return r10
        L15:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r9.m11896S()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L2c:
            int r1 = r9.f21778b0
            int r2 = r9.f21779c0
        L30:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L41
            int r1 = r9.f21780d0
            int r1 = r1 + r3
            r9.f21780d0 = r1
            r9.f21781e0 = r4
            goto Ld9
        L41:
            r6 = 32
            if (r1 == r6) goto Ld9
            r6 = 13
            if (r1 == r6) goto Ld9
            r6 = 9
            if (r1 != r6) goto L4f
            goto Ld9
        L4f:
            r6 = 47
            if (r1 != r6) goto Lca
            r9.f21778b0 = r4
            r7 = 2
            if (r4 != r2) goto L68
            int r4 = r4 + (-1)
            r9.f21778b0 = r4
            boolean r2 = r9.m11894L(r7)
            int r4 = r9.f21778b0
            int r4 = r4 + r3
            r9.f21778b0 = r4
            if (r2 != 0) goto L68
            return r1
        L68:
            r9.m11897i()
            int r2 = r9.f21778b0
            char r4 = r0[r2]
            r8 = 42
            if (r4 == r8) goto L7b
            if (r4 == r6) goto L76
            return r1
        L76:
            int r2 = r2 + 1
            r9.f21778b0 = r2
            goto Ld3
        L7b:
            int r2 = r2 + 1
            r9.f21778b0 = r2
        L7f:
            int r1 = r9.f21778b0
            int r1 = r1 + r7
            int r2 = r9.f21779c0
            r4 = 0
            if (r1 <= r2) goto L90
            boolean r1 = r9.m11894L(r7)
            if (r1 == 0) goto L8e
            goto L90
        L8e:
            r3 = 0
            goto Lbc
        L90:
            char[] r1 = r9.f21777a0
            int r2 = r9.f21778b0
            char r1 = r1[r2]
            if (r1 != r5) goto La2
            int r1 = r9.f21780d0
            int r1 = r1 + r3
            r9.f21780d0 = r1
            int r2 = r2 + 1
            r9.f21781e0 = r2
            goto Lb3
        La2:
            if (r4 >= r7) goto Lbc
            char[] r1 = r9.f21777a0
            int r2 = r9.f21778b0
            int r2 = r2 + r4
            char r1 = r1[r2]
            java.lang.String r2 = "*/"
            char r2 = r2.charAt(r4)
            if (r1 == r2) goto Lb9
        Lb3:
            int r1 = r9.f21778b0
            int r1 = r1 + r3
            r9.f21778b0 = r1
            goto L7f
        Lb9:
            int r4 = r4 + 1
            goto La2
        Lbc:
            if (r3 == 0) goto Lc3
            int r1 = r9.f21778b0
            int r1 = r1 + r7
            goto L4
        Lc3:
            java.lang.String r10 = "Unterminated comment"
            r9.m11893F0(r10)
            r10 = 0
            throw r10
        Lca:
            r2 = 35
            r9.f21778b0 = r4
            if (r1 != r2) goto Ld8
            r9.m11897i()
        Ld3:
            r9.m11892D0()
            goto L2
        Ld8:
            return r1
        Ld9:
            r1 = r4
            goto L6
    }

    /* renamed from: l */
    public int m11899l() {
            r19 = this;
            r0 = r19
            int[] r1 = r0.f21786j0
            int r2 = r0.f21787k0
            int r3 = r2 + (-1)
            r3 = r1[r3]
            r7 = 93
            r8 = 59
            r9 = 44
            r10 = 6
            r11 = 3
            r12 = 7
            r13 = 0
            r14 = 5
            r15 = 4
            r5 = 2
            r6 = 0
            r4 = 1
            if (r3 != r4) goto L20
            int r2 = r2 - r4
            r1[r2] = r5
            goto Ld1
        L20:
            if (r3 != r5) goto L3a
            int r1 = r0.m11898i0(r4)
            if (r1 == r9) goto Ld1
            if (r1 == r8) goto L35
            if (r1 != r7) goto L2f
            r0.f21782f0 = r15
            return r15
        L2f:
            java.lang.String r1 = "Unterminated array"
            r0.m11893F0(r1)
            throw r13
        L35:
            r19.m11897i()
            goto Ld1
        L3a:
            if (r3 == r11) goto L2b6
            if (r3 != r14) goto L40
            goto L2b6
        L40:
            if (r3 != r15) goto L74
            int r2 = r2 - r4
            r1[r2] = r14
            int r1 = r0.m11898i0(r4)
            r2 = 58
            if (r1 == r2) goto Ld1
            r2 = 61
            if (r1 != r2) goto L6e
            r19.m11897i()
            int r1 = r0.f21778b0
            int r2 = r0.f21779c0
            if (r1 < r2) goto L60
            boolean r1 = r0.m11894L(r4)
            if (r1 == 0) goto Ld1
        L60:
            char[] r1 = r0.f21777a0
            int r2 = r0.f21778b0
            char r1 = r1[r2]
            r15 = 62
            if (r1 != r15) goto Ld1
            int r2 = r2 + r4
            r0.f21778b0 = r2
            goto Ld1
        L6e:
            java.lang.String r1 = "Expected ':'"
            r0.m11893F0(r1)
            throw r13
        L74:
            if (r3 != r10) goto Lb6
            boolean r1 = r0.f21776Z
            if (r1 == 0) goto Lae
            r0.m11898i0(r4)
            int r1 = r0.f21778b0
            int r1 = r1 - r4
            r0.f21778b0 = r1
            char[] r2 = p290qb.C5612a.f21774n0
            int r15 = r2.length
            int r1 = r1 + r15
            int r15 = r0.f21779c0
            if (r1 <= r15) goto L92
            int r1 = r2.length
            boolean r1 = r0.m11894L(r1)
            if (r1 != 0) goto L92
            goto Lae
        L92:
            r1 = 0
        L93:
            char[] r2 = p290qb.C5612a.f21774n0
            int r15 = r2.length
            if (r1 >= r15) goto La8
            char[] r15 = r0.f21777a0
            int r13 = r0.f21778b0
            int r13 = r13 + r1
            char r13 = r15[r13]
            char r2 = r2[r1]
            if (r13 == r2) goto La4
            goto Lae
        La4:
            int r1 = r1 + 1
            r13 = 0
            goto L93
        La8:
            int r1 = r0.f21778b0
            int r2 = r2.length
            int r1 = r1 + r2
            r0.f21778b0 = r1
        Lae:
            int[] r1 = r0.f21786j0
            int r2 = r0.f21787k0
            int r2 = r2 - r4
            r1[r2] = r12
            goto Ld1
        Lb6:
            if (r3 != r12) goto Lcd
            int r1 = r0.m11898i0(r6)
            r2 = -1
            if (r1 != r2) goto Lc4
            r1 = 17
        Lc1:
            r0.f21782f0 = r1
            return r1
        Lc4:
            r19.m11897i()
            int r1 = r0.f21778b0
            int r1 = r1 - r4
            r0.f21778b0 = r1
            goto Ld1
        Lcd:
            r1 = 8
            if (r3 == r1) goto L2ae
        Ld1:
            int r1 = r0.m11898i0(r4)
            r2 = 34
            if (r1 == r2) goto L2aa
            r2 = 39
            if (r1 == r2) goto L2a3
            if (r1 == r9) goto L28c
            if (r1 == r8) goto L28c
            r2 = 91
            if (r1 == r2) goto L289
            if (r1 == r7) goto L284
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L281
            int r1 = r0.f21778b0
            int r1 = r1 - r4
            r0.f21778b0 = r1
            char[] r2 = r0.f21777a0
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L11a
            r2 = 84
            if (r1 != r2) goto Lfd
            goto L11a
        Lfd:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L114
            r2 = 70
            if (r1 != r2) goto L106
            goto L114
        L106:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L10e
            r2 = 78
            if (r1 != r2) goto L169
        L10e:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r3 = 7
            goto L11f
        L114:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r3 = 6
            goto L11f
        L11a:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r3 = 5
        L11f:
            int r7 = r1.length()
            r8 = 1
        L124:
            if (r8 >= r7) goto L14d
            int r9 = r0.f21778b0
            int r9 = r9 + r8
            int r13 = r0.f21779c0
            if (r9 < r13) goto L136
            int r9 = r8 + 1
            boolean r9 = r0.m11894L(r9)
            if (r9 != 0) goto L136
            goto L169
        L136:
            char[] r9 = r0.f21777a0
            int r13 = r0.f21778b0
            int r13 = r13 + r8
            char r9 = r9[r13]
            char r13 = r1.charAt(r8)
            if (r9 == r13) goto L14a
            char r13 = r2.charAt(r8)
            if (r9 == r13) goto L14a
            goto L169
        L14a:
            int r8 = r8 + 1
            goto L124
        L14d:
            int r1 = r0.f21778b0
            int r1 = r1 + r7
            int r2 = r0.f21779c0
            if (r1 < r2) goto L15c
            int r1 = r7 + 1
            boolean r1 = r0.m11894L(r1)
            if (r1 == 0) goto L16b
        L15c:
            char[] r1 = r0.f21777a0
            int r2 = r0.f21778b0
            int r2 = r2 + r7
            char r1 = r1[r2]
            boolean r1 = r0.m11895R(r1)
            if (r1 == 0) goto L16b
        L169:
            r3 = 0
            goto L172
        L16b:
            int r1 = r0.f21778b0
            int r1 = r1 + r7
            r0.f21778b0 = r1
            r0.f21782f0 = r3
        L172:
            if (r3 == 0) goto L175
            return r3
        L175:
            char[] r1 = r0.f21777a0
            int r2 = r0.f21778b0
            int r3 = r0.f21779c0
            r7 = 0
            r10 = r7
            r9 = 0
            r13 = 0
            r15 = 1
            r16 = 0
        L183:
            int r6 = r2 + r9
            if (r6 != r3) goto L19b
            int r2 = r1.length
            if (r9 != r2) goto L18d
        L18a:
            r6 = 0
            goto L264
        L18d:
            int r2 = r9 + 1
            boolean r2 = r0.m11894L(r2)
            if (r2 != 0) goto L197
            goto L205
        L197:
            int r2 = r0.f21778b0
            int r3 = r0.f21779c0
        L19b:
            int r6 = r2 + r9
            char r6 = r1[r6]
            r12 = 43
            if (r6 == r12) goto L257
            r12 = 69
            if (r6 == r12) goto L24d
            r12 = 101(0x65, float:1.42E-43)
            if (r6 == r12) goto L24d
            r12 = 45
            if (r6 == r12) goto L241
            r12 = 46
            if (r6 == r12) goto L23a
            r12 = 48
            if (r6 < r12) goto L1ff
            r12 = 57
            if (r6 <= r12) goto L1bc
            goto L1ff
        L1bc:
            if (r13 == r4) goto L1f5
            if (r13 != 0) goto L1c1
            goto L1f5
        L1c1:
            if (r13 != r5) goto L1e9
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 != 0) goto L1c8
            goto L18a
        L1c8:
            r17 = 10
            long r17 = r17 * r10
            int r6 = r6 + (-48)
            long r7 = (long) r6
            long r17 = r17 - r7
            r6 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 > 0) goto L1e3
            if (r8 != 0) goto L1e1
            int r6 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r6 >= 0) goto L1e1
            goto L1e3
        L1e1:
            r6 = 0
            goto L1e4
        L1e3:
            r6 = 1
        L1e4:
            r15 = r15 & r6
            r10 = r17
            r7 = 6
            goto L1fb
        L1e9:
            r6 = 3
            r7 = 6
            if (r13 != r6) goto L1ef
            r13 = 4
            goto L1fb
        L1ef:
            if (r13 == r14) goto L1f3
            if (r13 != r7) goto L1fb
        L1f3:
            r13 = 7
            goto L1fb
        L1f5:
            r7 = 6
            int r6 = r6 + (-48)
            int r6 = -r6
            long r10 = (long) r6
            r13 = 2
        L1fb:
            r17 = 0
            goto L25d
        L1ff:
            boolean r1 = r0.m11895R(r6)
            if (r1 != 0) goto L18a
        L205:
            if (r13 != r5) goto L229
            if (r15 == 0) goto L229
            r1 = -9223372036854775808
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L211
            if (r16 == 0) goto L229
        L211:
            r17 = 0
            int r1 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r1 != 0) goto L219
            if (r16 != 0) goto L229
        L219:
            if (r16 == 0) goto L21c
            goto L21d
        L21c:
            long r10 = -r10
        L21d:
            r0.f21783g0 = r10
            int r1 = r0.f21778b0
            int r1 = r1 + r9
            r0.f21778b0 = r1
            r1 = 15
            r6 = 15
            goto L237
        L229:
            if (r13 == r5) goto L231
            r1 = 4
            if (r13 == r1) goto L231
            r1 = 7
            if (r13 != r1) goto L18a
        L231:
            r0.f21784h0 = r9
            r1 = 16
            r6 = 16
        L237:
            r0.f21782f0 = r6
            goto L264
        L23a:
            r17 = r7
            r7 = 6
            if (r13 != r5) goto L18a
            r13 = 3
            goto L25d
        L241:
            r17 = r7
            r7 = 6
            if (r13 != 0) goto L24a
            r13 = 1
            r16 = 1
            goto L25d
        L24a:
            if (r13 != r14) goto L18a
            goto L25c
        L24d:
            r17 = r7
            r7 = 6
            if (r13 == r5) goto L255
            r6 = 4
            if (r13 != r6) goto L18a
        L255:
            r13 = 5
            goto L25d
        L257:
            r17 = r7
            r7 = 6
            if (r13 != r14) goto L18a
        L25c:
            r13 = 6
        L25d:
            int r9 = r9 + 1
            r7 = r17
            r12 = 7
            goto L183
        L264:
            if (r6 == 0) goto L267
            return r6
        L267:
            char[] r1 = r0.f21777a0
            int r2 = r0.f21778b0
            char r1 = r1[r2]
            boolean r1 = r0.m11895R(r1)
            if (r1 == 0) goto L27a
            r19.m11897i()
            r1 = 10
            goto Lc1
        L27a:
            java.lang.String r1 = "Expected value"
            r0.m11893F0(r1)
            r1 = 0
            throw r1
        L281:
            r0.f21782f0 = r4
            return r4
        L284:
            if (r3 != r4) goto L28c
            r1 = 4
            goto Lc1
        L289:
            r1 = 3
            goto Lc1
        L28c:
            if (r3 == r4) goto L298
            if (r3 != r5) goto L291
            goto L298
        L291:
            java.lang.String r1 = "Unexpected value"
            r0.m11893F0(r1)
            r1 = 0
            throw r1
        L298:
            r19.m11897i()
            int r1 = r0.f21778b0
            int r1 = r1 - r4
            r0.f21778b0 = r1
            r1 = 7
            goto Lc1
        L2a3:
            r19.m11897i()
            r1 = 8
            goto Lc1
        L2aa:
            r1 = 9
            goto Lc1
        L2ae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L2b6:
            int r2 = r2 - r4
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r14) goto L2d5
            int r2 = r0.m11898i0(r4)
            if (r2 == r9) goto L2d5
            if (r2 == r8) goto L2d2
            if (r2 != r1) goto L2cb
            r0.f21782f0 = r5
            return r5
        L2cb:
            java.lang.String r1 = "Unterminated object"
            r0.m11893F0(r1)
            r1 = 0
            throw r1
        L2d2:
            r19.m11897i()
        L2d5:
            int r2 = r0.m11898i0(r4)
            r6 = 34
            if (r2 == r6) goto L30e
            r6 = 39
            if (r2 == r6) goto L307
            java.lang.String r6 = "Expected name"
            if (r2 == r1) goto L2fd
            r19.m11897i()
            int r1 = r0.f21778b0
            int r1 = r1 - r4
            r0.f21778b0 = r1
            char r1 = (char) r2
            boolean r1 = r0.m11895R(r1)
            if (r1 == 0) goto L2f8
            r1 = 14
            goto Lc1
        L2f8:
            r0.m11893F0(r6)
            r1 = 0
            throw r1
        L2fd:
            r1 = 0
            if (r3 == r14) goto L303
            r0.f21782f0 = r5
            return r5
        L303:
            r0.m11893F0(r6)
            throw r1
        L307:
            r19.m11897i()
            r1 = 12
            goto Lc1
        L30e:
            r1 = 13
            goto Lc1
    }

    /* renamed from: m0 */
    public void mo10411m0() {
            r3 = this;
            int r0 = r3.f21782f0
            if (r0 != 0) goto L8
            int r0 = r3.m11899l()
        L8:
            r1 = 7
            if (r0 != r1) goto L1b
            r0 = 0
            r3.f21782f0 = r0
            int[] r0 = r3.f21789m0
            int r1 = r3.f21787k0
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            return
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected null but was "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            qb.b r2 = r3.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r3.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: n */
    public void mo10412n() {
            r3 = this;
            int r0 = r3.f21782f0
            if (r0 != 0) goto L8
            int r0 = r3.m11899l()
        L8:
            r1 = 4
            if (r0 != r1) goto L1f
            int r0 = r3.f21787k0
            int r0 = r0 + (-1)
            r3.f21787k0 = r0
            int[] r1 = r3.f21789m0
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
            r0 = 0
            r3.f21782f0 = r0
            return
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected END_ARRAY but was "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            qb.b r2 = r3.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r3.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: s0 */
    public final java.lang.String m11900s0(char r11) {
            r10 = this;
            char[] r0 = r10.f21777a0
            r1 = 0
            r2 = r1
        L4:
            int r3 = r10.f21778b0
            int r4 = r10.f21779c0
            r5 = r4
            r4 = r3
        La:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L59
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L29
            r10.f21778b0 = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L21:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L29:
            r9 = 92
            if (r3 != r9) goto L4c
            r10.f21778b0 = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L41
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L41:
            r2.append(r0, r4, r8)
            char r3 = r10.m11890B0()
            r2.append(r3)
            goto L4
        L4c:
            r6 = 10
            if (r3 != r6) goto L57
            int r3 = r10.f21780d0
            int r3 = r3 + r7
            r10.f21780d0 = r3
            r10.f21781e0 = r8
        L57:
            r3 = r8
            goto La
        L59:
            if (r2 != 0) goto L69
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L69:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f21778b0 = r3
            boolean r3 = r10.m11894L(r7)
            if (r3 == 0) goto L77
            goto L4
        L77:
            java.lang.String r11 = "Unterminated string"
            r10.m11893F0(r11)
            throw r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = r2.m11896S()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: x0 */
    public java.lang.String mo10413x0() {
            r4 = this;
            int r0 = r4.f21782f0
            if (r0 != 0) goto L8
            int r0 = r4.m11899l()
        L8:
            r1 = 10
            if (r0 != r1) goto L11
            java.lang.String r0 = r4.m11901y0()
            goto L4e
        L11:
            r1 = 8
            if (r0 != r1) goto L18
            r0 = 39
            goto L1e
        L18:
            r1 = 9
            if (r0 != r1) goto L23
            r0 = 34
        L1e:
            java.lang.String r0 = r4.m11900s0(r0)
            goto L4e
        L23:
            r1 = 11
            if (r0 != r1) goto L2d
            java.lang.String r0 = r4.f21785i0
            r1 = 0
            r4.f21785i0 = r1
            goto L4e
        L2d:
            r1 = 15
            if (r0 != r1) goto L38
            long r0 = r4.f21783g0
            java.lang.String r0 = java.lang.Long.toString(r0)
            goto L4e
        L38:
            r1 = 16
            if (r0 != r1) goto L5e
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.f21777a0
            int r2 = r4.f21778b0
            int r3 = r4.f21784h0
            r0.<init>(r1, r2, r3)
            int r1 = r4.f21778b0
            int r2 = r4.f21784h0
            int r1 = r1 + r2
            r4.f21778b0 = r1
        L4e:
            r1 = 0
            r4.f21782f0 = r1
            int[] r1 = r4.f21789m0
            int r2 = r4.f21787k0
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
            return r0
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected a string but was "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            qb.b r2 = r4.mo10414z0()
            r1.append(r2)
            java.lang.String r2 = r4.m11896S()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: y0 */
    public final java.lang.String m11901y0() {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f21778b0
            int r4 = r3 + r2
            int r5 = r6.f21779c0
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f21777a0
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m11897i()
            goto L5c
        L4e:
            char[] r3 = r6.f21777a0
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m11894L(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f21777a0
            int r4 = r6.f21778b0
            r1.append(r3, r4, r2)
            int r3 = r6.f21778b0
            int r3 = r3 + r2
            r6.f21778b0 = r3
            r2 = 1
            boolean r2 = r6.m11894L(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f21777a0
            int r3 = r6.f21778b0
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f21777a0
            int r3 = r6.f21778b0
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f21778b0
            int r2 = r2 + r0
            r6.f21778b0 = r2
            return r1
    }

    /* renamed from: z0 */
    public p290qb.EnumC5613b mo10414z0() {
            r1 = this;
            int r0 = r1.f21782f0
            if (r0 != 0) goto L8
            int r0 = r1.m11899l()
        L8:
            switch(r0) {
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L20;
                case 7: goto L1d;
                case 8: goto L1a;
                case 9: goto L1a;
                case 10: goto L1a;
                case 11: goto L1a;
                case 12: goto L17;
                case 13: goto L17;
                case 14: goto L17;
                case 15: goto L14;
                case 16: goto L14;
                case 17: goto L11;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L11:
            qb.b r0 = p290qb.EnumC5613b.f21799h0
            return r0
        L14:
            qb.b r0 = p290qb.EnumC5613b.f21796e0
            return r0
        L17:
            qb.b r0 = p290qb.EnumC5613b.f21794c0
            return r0
        L1a:
            qb.b r0 = p290qb.EnumC5613b.f21795d0
            return r0
        L1d:
            qb.b r0 = p290qb.EnumC5613b.f21798g0
            return r0
        L20:
            qb.b r0 = p290qb.EnumC5613b.f21797f0
            return r0
        L23:
            qb.b r0 = p290qb.EnumC5613b.f21791Z
            return r0
        L26:
            qb.b r0 = p290qb.EnumC5613b.f21790Y
            return r0
        L29:
            qb.b r0 = p290qb.EnumC5613b.f21793b0
            return r0
        L2c:
            qb.b r0 = p290qb.EnumC5613b.f21792a0
            return r0
    }
}

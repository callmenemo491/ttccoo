package p290qb;

/* renamed from: qb.c */
/* loaded from: classes.dex */
public class C5614c implements java.io.Closeable, java.io.Flushable {

    /* renamed from: h0 */
    public static final java.lang.String[] f21801h0 = null;

    /* renamed from: i0 */
    public static final java.lang.String[] f21802i0 = null;

    /* renamed from: Y */
    public final java.io.Writer f21803Y;

    /* renamed from: Z */
    public int[] f21804Z;

    /* renamed from: a0 */
    public int f21805a0;

    /* renamed from: b0 */
    public java.lang.String f21806b0;

    /* renamed from: c0 */
    public java.lang.String f21807c0;

    /* renamed from: d0 */
    public boolean f21808d0;

    /* renamed from: e0 */
    public boolean f21809e0;

    /* renamed from: f0 */
    public java.lang.String f21810f0;

    /* renamed from: g0 */
    public boolean f21811g0;

    static {
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            p290qb.C5614c.f21801h0 = r0
            r0 = 0
            r1 = 0
        L8:
            r2 = 31
            if (r1 > r2) goto L22
            java.lang.String[] r2 = p290qb.C5614c.f21801h0
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3[r0] = r4
            java.lang.String r4 = "\\u%04x"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L8
        L22:
            java.lang.String[] r0 = p290qb.C5614c.f21801h0
            r1 = 34
            java.lang.String r2 = "\\\""
            r0[r1] = r2
            r1 = 92
            java.lang.String r2 = "\\\\"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "\\t"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "\\b"
            r0[r1] = r2
            r1 = 10
            java.lang.String r2 = "\\n"
            r0[r1] = r2
            r1 = 13
            java.lang.String r2 = "\\r"
            r0[r1] = r2
            r1 = 12
            java.lang.String r2 = "\\f"
            r0[r1] = r2
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            p290qb.C5614c.f21802i0 = r0
            r1 = 60
            java.lang.String r2 = "\\u003c"
            r0[r1] = r2
            r1 = 62
            java.lang.String r2 = "\\u003e"
            r0[r1] = r2
            r1 = 38
            java.lang.String r2 = "\\u0026"
            r0[r1] = r2
            r1 = 61
            java.lang.String r2 = "\\u003d"
            r0[r1] = r2
            r1 = 39
            java.lang.String r2 = "\\u0027"
            r0[r1] = r2
            return
    }

    public C5614c(java.io.Writer r2) {
            r1 = this;
            r1.<init>()
            r0 = 32
            int[] r0 = new int[r0]
            r1.f21804Z = r0
            r0 = 0
            r1.f21805a0 = r0
            r0 = 6
            r1.m11904V(r0)
            java.lang.String r0 = ":"
            r1.f21807c0 = r0
            r0 = 1
            r1.f21811g0 = r0
            java.lang.String r0 = "out == null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f21803Y = r2
            return
    }

    /* renamed from: A */
    public p290qb.C5614c mo10415A() {
            r3 = this;
            r0 = 3
            r1 = 5
            r2 = 125(0x7d, float:1.75E-43)
            r3.m11908l(r0, r1, r2)
            return r3
    }

    /* renamed from: L */
    public p290qb.C5614c mo10416L(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name == null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = r1.f21810f0
            if (r0 != 0) goto L18
            int r0 = r1.f21805a0
            if (r0 == 0) goto L10
            r1.f21810f0 = r2
            return r1
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "JsonWriter is closed."
            r2.<init>(r0)
            throw r2
        L18:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
    }

    /* renamed from: Q */
    public final void m11902Q() {
            r4 = this;
            java.lang.String r0 = r4.f21806b0
            if (r0 != 0) goto L5
            return
        L5:
            java.io.Writer r0 = r4.f21803Y
            r1 = 10
            r0.write(r1)
            int r0 = r4.f21805a0
            r1 = 1
        Lf:
            if (r1 >= r0) goto L1b
            java.io.Writer r2 = r4.f21803Y
            java.lang.String r3 = r4.f21806b0
            r2.write(r3)
            int r1 = r1 + 1
            goto Lf
        L1b:
            return
    }

    /* renamed from: R */
    public p290qb.C5614c mo10417R() {
            r2 = this;
            java.lang.String r0 = r2.f21810f0
            if (r0 == 0) goto L10
            boolean r0 = r2.f21811g0
            if (r0 == 0) goto Lc
            r2.m11909x0()
            goto L10
        Lc:
            r0 = 0
            r2.f21810f0 = r0
            return r2
        L10:
            r2.m11906a()
            java.io.Writer r0 = r2.f21803Y
            java.lang.String r1 = "null"
            r0.write(r1)
            return r2
    }

    /* renamed from: S */
    public final int m11903S() {
            r2 = this;
            int r0 = r2.f21805a0
            if (r0 == 0) goto Lb
            int[] r1 = r2.f21804Z
            int r0 = r0 + (-1)
            r0 = r1[r0]
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonWriter is closed."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: V */
    public final void m11904V(int r4) {
            r3 = this;
            int r0 = r3.f21805a0
            int[] r1 = r3.f21804Z
            int r2 = r1.length
            if (r0 != r2) goto Lf
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f21804Z = r0
        Lf:
            int[] r0 = r3.f21804Z
            int r1 = r3.f21805a0
            int r2 = r1 + 1
            r3.f21805a0 = r2
            r0[r1] = r4
            return
    }

    /* renamed from: Z */
    public final void m11905Z(int r3) {
            r2 = this;
            int[] r0 = r2.f21804Z
            int r1 = r2.f21805a0
            int r1 = r1 + (-1)
            r0[r1] = r3
            return
    }

    /* renamed from: a */
    public final void m11906a() {
            r3 = this;
            int r0 = r3.m11903S()
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L40
            if (r0 == r2) goto L38
            r1 = 4
            if (r0 == r1) goto L2c
            r1 = 6
            r2 = 7
            if (r0 == r1) goto L28
            if (r0 != r2) goto L20
            boolean r0 = r3.f21808d0
            if (r0 == 0) goto L18
            goto L28
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JSON must have only one top-level value."
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Nesting problem."
            r0.<init>(r1)
            throw r0
        L28:
            r3.m11905Z(r2)
            goto L46
        L2c:
            java.io.Writer r0 = r3.f21803Y
            java.lang.String r1 = r3.f21807c0
            r0.append(r1)
            r0 = 5
            r3.m11905Z(r0)
            goto L46
        L38:
            java.io.Writer r0 = r3.f21803Y
            r1 = 44
            r0.append(r1)
            goto L43
        L40:
            r3.m11905Z(r2)
        L43:
            r3.m11902Q()
        L46:
            return
    }

    /* renamed from: b0 */
    public final void m11907b0(java.lang.String r9) {
            r8 = this;
            boolean r0 = r8.f21809e0
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p290qb.C5614c.f21802i0
            goto L9
        L7:
            java.lang.String[] r0 = p290qb.C5614c.f21801h0
        L9:
            java.io.Writer r1 = r8.f21803Y
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f21803Y
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f21803Y
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f21803Y
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f21803Y
            r9.write(r2)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            java.io.Writer r0 = r3.f21803Y
            r0.close()
            int r0 = r3.f21805a0
            r1 = 1
            if (r0 > r1) goto L18
            if (r0 != r1) goto L14
            int[] r2 = r3.f21804Z
            int r0 = r0 - r1
            r0 = r2[r0]
            r1 = 7
            if (r0 != r1) goto L18
        L14:
            r0 = 0
            r3.f21805a0 = r0
            return
        L18:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Incomplete document"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: d0 */
    public p290qb.C5614c mo10418d0(long r2) {
            r1 = this;
            r1.m11909x0()
            r1.m11906a()
            java.io.Writer r0 = r1.f21803Y
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.write(r2)
            return r1
    }

    /* renamed from: f0 */
    public p290qb.C5614c mo10419f0(java.lang.Boolean r2) {
            r1 = this;
            if (r2 != 0) goto L7
            qb.c r2 = r1.mo10417R()
            return r2
        L7:
            r1.m11909x0()
            r1.m11906a()
            java.io.Writer r0 = r1.f21803Y
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L18
            java.lang.String r2 = "true"
            goto L1a
        L18:
            java.lang.String r2 = "false"
        L1a:
            r0.write(r2)
            return r1
    }

    public void flush() {
            r2 = this;
            int r0 = r2.f21805a0
            if (r0 == 0) goto La
            java.io.Writer r0 = r2.f21803Y
            r0.flush()
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonWriter is closed."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: h */
    public p290qb.C5614c mo10420h() {
            r2 = this;
            r2.m11909x0()
            r2.m11906a()
            r0 = 1
            r2.m11904V(r0)
            java.io.Writer r0 = r2.f21803Y
            r1 = 91
            r0.write(r1)
            return r2
    }

    /* renamed from: i */
    public p290qb.C5614c mo10421i() {
            r2 = this;
            r2.m11909x0()
            r2.m11906a()
            r0 = 3
            r2.m11904V(r0)
            java.io.Writer r0 = r2.f21803Y
            r1 = 123(0x7b, float:1.72E-43)
            r0.write(r1)
            return r2
    }

    /* renamed from: i0 */
    public p290qb.C5614c mo10422i0(java.lang.Number r4) {
            r3 = this;
            if (r4 != 0) goto L7
            qb.c r4 = r3.mo10417R()
            return r4
        L7:
            r3.m11909x0()
            java.lang.String r0 = r4.toString()
            boolean r1 = r3.f21808d0
            if (r1 != 0) goto L42
            java.lang.String r1 = "-Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "NaN"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2b
            goto L42
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Numeric values must be finite, but was "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L42:
            r3.m11906a()
            java.io.Writer r4 = r3.f21803Y
            r4.append(r0)
            return r3
    }

    /* renamed from: l */
    public final p290qb.C5614c m11908l(int r2, int r3, char r4) {
            r1 = this;
            int r0 = r1.m11903S()
            if (r0 == r3) goto L11
            if (r0 != r2) goto L9
            goto L11
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Nesting problem."
            r2.<init>(r3)
            throw r2
        L11:
            java.lang.String r2 = r1.f21810f0
            if (r2 != 0) goto L26
            int r2 = r1.f21805a0
            int r2 = r2 + (-1)
            r1.f21805a0 = r2
            if (r0 != r3) goto L20
            r1.m11902Q()
        L20:
            java.io.Writer r2 = r1.f21803Y
            r2.write(r4)
            return r1
        L26:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Dangling name: "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.String r4 = r1.f21810f0
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: m0 */
    public p290qb.C5614c mo10423m0(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L7
            qb.c r1 = r0.mo10417R()
            return r1
        L7:
            r0.m11909x0()
            r0.m11906a()
            r0.m11907b0(r1)
            return r0
    }

    /* renamed from: n */
    public p290qb.C5614c mo10424n() {
            r3 = this;
            r0 = 1
            r1 = 2
            r2 = 93
            r3.m11908l(r0, r1, r2)
            return r3
    }

    /* renamed from: s0 */
    public p290qb.C5614c mo10425s0(boolean r2) {
            r1 = this;
            r1.m11909x0()
            r1.m11906a()
            java.io.Writer r0 = r1.f21803Y
            if (r2 == 0) goto Ld
            java.lang.String r2 = "true"
            goto Lf
        Ld:
            java.lang.String r2 = "false"
        Lf:
            r0.write(r2)
            return r1
    }

    /* renamed from: x0 */
    public final void m11909x0() {
            r2 = this;
            java.lang.String r0 = r2.f21810f0
            if (r0 == 0) goto L2e
            int r0 = r2.m11903S()
            r1 = 5
            if (r0 != r1) goto L13
            java.io.Writer r0 = r2.f21803Y
            r1 = 44
            r0.write(r1)
            goto L16
        L13:
            r1 = 3
            if (r0 != r1) goto L26
        L16:
            r2.m11902Q()
            r0 = 4
            r2.m11905Z(r0)
            java.lang.String r0 = r2.f21810f0
            r2.m11907b0(r0)
            r0 = 0
            r2.f21810f0 = r0
            goto L2e
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Nesting problem."
            r0.<init>(r1)
            throw r0
        L2e:
            return
    }
}

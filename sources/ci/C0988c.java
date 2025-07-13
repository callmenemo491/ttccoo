package ci;

/* renamed from: ci.c */
/* loaded from: classes.dex */
public final class C0988c {

    /* renamed from: a */
    public static final byte[] f5065a = null;

    /* renamed from: b */
    public static final bi.C0802v f5066b = null;

    /* renamed from: c */
    public static final bi.AbstractC0785h0 f5067c = null;

    /* renamed from: d */
    public static final p260oi.C5295q f5068d = null;

    /* renamed from: e */
    public static final java.util.TimeZone f5069e = null;

    /* renamed from: f */
    public static final p362uh.C6457c f5070f = null;

    /* renamed from: g */
    public static final java.lang.String f5071g = null;

    static {
            r0 = 0
            byte[] r1 = new byte[r0]
            ci.C0988c.f5065a = r1
            bi.v$b r2 = bi.C0802v.f4340Z
            java.lang.String[] r3 = new java.lang.String[r0]
            bi.v r2 = r2.m2438c(r3)
            ci.C0988c.f5066b = r2
            oi.e r2 = new oi.e
            r2.<init>()
            r2.m11535A0(r1)
            long r7 = (long) r0
            bi.i0 r1 = new bi.i0
            r9 = 0
            r1.<init>(r2, r9, r7)
            ci.C0988c.f5067c = r1
            r3 = r7
            r5 = r7
            m2697b(r3, r5, r7)
            oi.q$a r1 = p260oi.C5295q.f20524a0
            r2 = 5
            oi.i[] r3 = new p260oi.C5287i[r2]
            oi.i$a r4 = p260oi.C5287i.f20505c0
            java.lang.String r5 = "efbbbf"
            oi.i r5 = r4.m11595a(r5)
            r3[r0] = r5
            java.lang.String r5 = "feff"
            oi.i r5 = r4.m11595a(r5)
            r6 = 1
            r3[r6] = r5
            java.lang.String r5 = "fffe"
            oi.i r5 = r4.m11595a(r5)
            r7 = 2
            r3[r7] = r5
            r5 = 3
            java.lang.String r8 = "0000ffff"
            oi.i r8 = r4.m11595a(r8)
            r3[r5] = r8
            r5 = 4
            java.lang.String r8 = "ffff0000"
            oi.i r4 = r4.m11595a(r8)
            r3[r5] = r4
            java.util.ArrayList r15 = new java.util.ArrayList
            dh.c r4 = new dh.c
            r4.<init>(r3, r0)
            r15.<init>(r4)
            int r4 = r15.size()
            if (r4 <= r6) goto L6b
            java.util.Collections.sort(r15)
        L6b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r5 = 0
        L71:
            if (r5 >= r2) goto L80
            r8 = r3[r5]
            r8 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            int r5 = r5 + 1
            goto L71
        L80:
            java.lang.Integer[] r5 = new java.lang.Integer[r0]
            java.lang.Object[] r4 = r4.toArray(r5)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r4, r5)
            java.lang.Integer[] r4 = (java.lang.Integer[]) r4
            int r5 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.Integer[] r4 = (java.lang.Integer[]) r4
            java.util.List r4 = p074e9.C1805a.m4533r(r4)
            r5 = 0
            r8 = 0
        L9a:
            if (r5 >= r2) goto L121
            r10 = r3[r5]
            int r11 = r8 + 1
            int r12 = r15.size()
            int r13 = r15.size()
            java.lang.String r14 = ")."
            if (r12 < 0) goto Lff
            if (r12 > r13) goto Ldd
            int r12 = r12 + (-1)
            r13 = 0
        Lb1:
            if (r13 > r12) goto Lce
            int r14 = r13 + r12
            int r14 = r14 >>> r6
            java.lang.Object r16 = r15.get(r14)
            r6 = r16
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            int r6 = p079eh.C1850a.m4597b(r6, r10)
            if (r6 >= 0) goto Lc7
            int r13 = r14 + 1
            goto Lcc
        Lc7:
            if (r6 <= 0) goto Ld1
            int r14 = r14 + (-1)
            r12 = r14
        Lcc:
            r6 = 1
            goto Lb1
        Lce:
            int r13 = r13 + 1
            int r14 = -r13
        Ld1:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r4.set(r14, r6)
            int r5 = r5 + 1
            r8 = r11
            r6 = 1
            goto L9a
        Ldd:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "toIndex ("
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = ") is greater than size ("
            r1.append(r2)
            r1.append(r13)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lff:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fromIndex ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") is greater than toIndex ("
            r2.append(r0)
            r2.append(r12)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L121:
            java.lang.Object r5 = r15.get(r0)
            oi.i r5 = (p260oi.C5287i) r5
            int r5 = r5.mo11585h()
            if (r5 <= 0) goto L12f
            r5 = 1
            goto L130
        L12f:
            r5 = 0
        L130:
            if (r5 == 0) goto L22b
            r5 = 0
        L133:
            int r6 = r15.size()
            if (r5 >= r6) goto L1ad
            java.lang.Object r6 = r15.get(r5)
            oi.i r6 = (p260oi.C5287i) r6
            int r8 = r5 + 1
            r10 = r8
        L142:
            int r11 = r15.size()
            if (r10 >= r11) goto L1ab
            java.lang.Object r11 = r15.get(r10)
            oi.i r11 = (p260oi.C5287i) r11
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = "prefix"
            p214m2.C4339q.m9706k(r6, r12)
            int r12 = r6.mo11585h()
            boolean r12 = r11.mo11589p(r0, r6, r0, r12)
            if (r12 != 0) goto L161
            goto L1ab
        L161:
            int r12 = r11.mo11585h()
            int r13 = r6.mo11585h()
            if (r12 == r13) goto L16d
            r12 = 1
            goto L16e
        L16d:
            r12 = 0
        L16e:
            if (r12 == 0) goto L190
            java.lang.Object r11 = r4.get(r10)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r4.get(r5)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r11 <= r12) goto L18d
            r15.remove(r10)
            r4.remove(r10)
            goto L142
        L18d:
            int r10 = r10 + 1
            goto L142
        L190:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "duplicate option: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L1ab:
            r5 = r8
            goto L133
        L1ad:
            oi.e r5 = new oi.e
            r5.<init>()
            r11 = 0
            r14 = 0
            r16 = 0
            int r17 = r15.size()
            r10 = r1
            r13 = r5
            r18 = r4
            r10.m11599a(r11, r13, r14, r15, r16, r17, r18)
            long r10 = r1.m11600b(r5)
            int r1 = (int) r10
            int[] r1 = new int[r1]
            r4 = 0
        L1ca:
            boolean r6 = r5.mo11541F()
            if (r6 != 0) goto L1da
            int r6 = r4 + 1
            int r8 = r5.readInt()
            r1[r4] = r8
            r4 = r6
            goto L1ca
        L1da:
            oi.q r4 = new oi.q
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r3 = "java.util.Arrays.copyOf(this, size)"
            p214m2.C4339q.m9705j(r2, r3)
            oi.i[] r2 = (p260oi.C5287i[]) r2
            r4.<init>(r2, r1, r9)
            ci.C0988c.f5068d = r4
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            p214m2.C4339q.m9704i(r1)
            ci.C0988c.f5069e = r1
            uh.c r1 = new uh.c
            java.lang.String r2 = "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"
            r1.<init>(r2)
            ci.C0988c.f5070f = r1
            java.lang.Class<bi.a0> r1 = bi.C0771a0.class
            java.lang.Class<bi.a0> r1 = bi.C0771a0.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp3."
            java.lang.String r1 = p362uh.C6467m.m13076g0(r1, r2)
            java.lang.String r2 = "Client"
            boolean r3 = p362uh.C6463i.m13052I(r1, r2, r0, r7)
            if (r3 == 0) goto L228
            int r3 = r1.length()
            int r2 = r2.length()
            int r3 = r3 - r2
            java.lang.String r1 = r1.substring(r0, r3)
            java.lang.String r0 = "this as java.lang.String\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r1, r0)
        L228:
            ci.C0988c.f5071g = r1
            return
        L22b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "the empty byte string is not a supported option"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: a */
    public static final boolean m2696a(bi.C0803w r2, bi.C0803w r3) {
            java.lang.String r0 = "$this$canReuseConnectionFor"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = r2.f4349e
            java.lang.String r1 = r3.f4349e
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L26
            int r0 = r2.f4350f
            int r1 = r3.f4350f
            if (r0 != r1) goto L26
            java.lang.String r2 = r2.f4346b
            java.lang.String r3 = r3.f4346b
            boolean r2 = p214m2.C4339q.m9702c(r2, r3)
            if (r2 == 0) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            return r2
    }

    /* renamed from: b */
    public static final void m2697b(long r5, long r7, long r9) {
            long r0 = r7 | r9
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L12
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L12
            long r5 = r5 - r7
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 < 0) goto L12
            return
        L12:
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            r5.<init>()
            throw r5
    }

    /* renamed from: c */
    public static final void m2698c(java.io.Closeable r1) {
            java.lang.String r0 = "$this$closeQuietly"
            p214m2.C4339q.m9706k(r1, r0)
            r1.close()     // Catch: java.lang.Exception -> L8 java.lang.RuntimeException -> L9
        L8:
            return
        L9:
            r1 = move-exception
            throw r1
    }

    /* renamed from: d */
    public static final void m2699d(java.net.Socket r0) {
            r0.close()     // Catch: java.lang.Exception -> L3 java.lang.RuntimeException -> L4 java.lang.AssertionError -> L6
        L3:
            return
        L4:
            r0 = move-exception
            throw r0
        L6:
            r0 = move-exception
            throw r0
    }

    /* renamed from: e */
    public static final int m2700e(java.lang.String r1, char r2, int r3, int r4) {
            java.lang.String r0 = "$this$delimiterOffset"
            p214m2.C4339q.m9706k(r1, r0)
        L5:
            if (r3 >= r4) goto L11
            char r0 = r1.charAt(r3)
            if (r0 != r2) goto Le
            return r3
        Le:
            int r3 = r3 + 1
            goto L5
        L11:
            return r4
    }

    /* renamed from: f */
    public static final int m2701f(java.lang.String r3, java.lang.String r4, int r5, int r6) {
            java.lang.String r0 = "$this$delimiterOffset"
            p214m2.C4339q.m9706k(r3, r0)
        L5:
            if (r5 >= r6) goto L17
            char r0 = r3.charAt(r5)
            r1 = 0
            r2 = 2
            boolean r0 = p362uh.C6467m.m13063T(r4, r0, r1, r2)
            if (r0 == 0) goto L14
            return r5
        L14:
            int r5 = r5 + 1
            goto L5
        L17:
            return r6
    }

    /* renamed from: g */
    public static final boolean m2702g(p260oi.InterfaceC5304z r1, int r2, java.util.concurrent.TimeUnit r3) {
            java.lang.String r0 = "timeUnit"
            p214m2.C4339q.m9706k(r3, r0)
            boolean r1 = m2714s(r1, r2, r3)     // Catch: java.io.IOException -> La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    /* renamed from: h */
    public static final java.lang.String m2703h(java.lang.String r2, java.lang.Object... r3) {
            java.lang.String r0 = "format"
            p214m2.C4339q.m9706k(r2, r0)
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            java.lang.String r3 = "java.lang.String.format(locale, format, *args)"
            p214m2.C4339q.m9705j(r2, r3)
            return r2
    }

    /* renamed from: i */
    public static final boolean m2704i(java.lang.String[] r8, java.lang.String[] r9, java.util.Comparator<? super java.lang.String> r10) {
            java.lang.String r0 = "$this$hasIntersection"
            p214m2.C4339q.m9706k(r8, r0)
            int r0 = r8.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L33
            if (r9 == 0) goto L33
            int r0 = r9.length
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1a
            goto L33
        L1a:
            int r0 = r8.length
            r3 = 0
        L1c:
            if (r3 >= r0) goto L33
            r4 = r8[r3]
            int r5 = r9.length
            r6 = 0
        L22:
            if (r6 >= r5) goto L30
            r7 = r9[r6]
            int r7 = r10.compare(r4, r7)
            if (r7 != 0) goto L2d
            return r2
        L2d:
            int r6 = r6 + 1
            goto L22
        L30:
            int r3 = r3 + 1
            goto L1c
        L33:
            return r1
    }

    /* renamed from: j */
    public static final long m2705j(bi.C0783g0 r2) {
            bi.v r2 = r2.f4230d0
            java.lang.String r0 = "Content-Length"
            java.lang.String r2 = r2.m2428a(r0)
            r0 = -1
            if (r2 == 0) goto L10
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L10
        L10:
            return r0
    }

    @java.lang.SafeVarargs
    /* renamed from: k */
    public static final <T> java.util.List<T> m2706k(T... r1) {
            java.lang.String r0 = "elements"
            p214m2.C4339q.m9706k(r1, r0)
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.util.List r1 = p074e9.C1805a.m4529n(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r0 = "Collections.unmodifiable\u2026istOf(*elements.clone()))"
            p214m2.C4339q.m9705j(r1, r0)
            return r1
    }

    /* renamed from: l */
    public static final int m2707l(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L20
            char r2 = r4.charAt(r1)
            r3 = 31
            int r3 = p214m2.C4339q.m9708m(r2, r3)
            if (r3 <= 0) goto L1f
            r3 = 127(0x7f, float:1.78E-43)
            int r2 = p214m2.C4339q.m9708m(r2, r3)
            if (r2 < 0) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L5
        L1f:
            return r1
        L20:
            r4 = -1
            return r4
    }

    /* renamed from: m */
    public static final int m2708m(java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "$this$indexOfFirstNonAsciiWhitespace"
            p214m2.C4339q.m9706k(r2, r0)
        L5:
            if (r3 >= r4) goto L23
            char r0 = r2.charAt(r3)
            r1 = 9
            if (r0 == r1) goto L20
            r1 = 10
            if (r0 == r1) goto L20
            r1 = 12
            if (r0 == r1) goto L20
            r1 = 13
            if (r0 == r1) goto L20
            r1 = 32
            if (r0 == r1) goto L20
            return r3
        L20:
            int r3 = r3 + 1
            goto L5
        L23:
            return r4
    }

    /* renamed from: n */
    public static final int m2709n(java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "$this$indexOfLastNonAsciiWhitespace"
            p214m2.C4339q.m9706k(r2, r0)
            int r4 = r4 + (-1)
            if (r4 < r3) goto L29
        L9:
            char r0 = r2.charAt(r4)
            r1 = 9
            if (r0 == r1) goto L24
            r1 = 10
            if (r0 == r1) goto L24
            r1 = 12
            if (r0 == r1) goto L24
            r1 = 13
            if (r0 == r1) goto L24
            r1 = 32
            if (r0 == r1) goto L24
            int r4 = r4 + 1
            return r4
        L24:
            if (r4 == r3) goto L29
            int r4 = r4 + (-1)
            goto L9
        L29:
            return r3
    }

    /* renamed from: o */
    public static final java.lang.String[] m2710o(java.lang.String[] r8, java.lang.String[] r9, java.util.Comparator<? super java.lang.String> r10) {
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r1) goto L27
            r4 = r8[r3]
            int r5 = r9.length
            r6 = 0
        L13:
            if (r6 >= r5) goto L24
            r7 = r9[r6]
            int r7 = r10.compare(r4, r7)
            if (r7 != 0) goto L21
            r0.add(r4)
            goto L24
        L21:
            int r6 = r6 + 1
            goto L13
        L24:
            int r3 = r3 + 1
            goto Ld
        L27:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r8, r9)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    /* renamed from: p */
    public static final int m2711p(char r2) {
            r0 = 48
            if (r0 <= r2) goto L5
            goto Lb
        L5:
            r1 = 57
            if (r1 < r2) goto Lb
            int r2 = r2 - r0
            goto L23
        Lb:
            r0 = 102(0x66, float:1.43E-43)
            r1 = 97
            if (r1 <= r2) goto L12
            goto L18
        L12:
            if (r0 < r2) goto L18
        L14:
            int r2 = r2 - r1
            int r2 = r2 + 10
            goto L23
        L18:
            r0 = 70
            r1 = 65
            if (r1 <= r2) goto L1f
            goto L22
        L1f:
            if (r0 < r2) goto L22
            goto L14
        L22:
            r2 = -1
        L23:
            return r2
    }

    /* renamed from: q */
    public static final java.nio.charset.Charset m2712q(p260oi.InterfaceC5286h r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "$this$readBomAsCharset"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "default"
            p214m2.C4339q.m9706k(r3, r0)
            oi.q r0 = ci.C0988c.f5068d
            int r2 = r2.mo11552P(r0)
            r0 = -1
            if (r2 == r0) goto L64
            if (r2 == 0) goto L5a
            r3 = 1
            if (r2 == r3) goto L55
            r3 = 2
            if (r2 == r3) goto L50
            r3 = 3
            if (r2 == r3) goto L3b
            r3 = 4
            if (r2 != r3) goto L35
            uh.a r2 = p362uh.C6455a.f25033a
            java.nio.charset.Charset r2 = p362uh.C6455a.f25035c
            if (r2 != 0) goto L4e
            java.lang.String r2 = "UTF-32LE"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            java.lang.String r3 = "forName(\"UTF-32LE\")"
            p214m2.C4339q.m9705j(r2, r3)
            p362uh.C6455a.f25035c = r2
            goto L4e
        L35:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L3b:
            uh.a r2 = p362uh.C6455a.f25033a
            java.nio.charset.Charset r2 = p362uh.C6455a.f25036d
            if (r2 != 0) goto L4e
            java.lang.String r2 = "UTF-32BE"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            java.lang.String r3 = "forName(\"UTF-32BE\")"
            p214m2.C4339q.m9705j(r2, r3)
            p362uh.C6455a.f25036d = r2
        L4e:
            r3 = r2
            goto L64
        L50:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            java.lang.String r3 = "UTF_16LE"
            goto L5e
        L55:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            java.lang.String r3 = "UTF_16BE"
            goto L5e
        L5a:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r3 = "UTF_8"
        L5e:
            r1 = r3
            r3 = r2
            r2 = r1
            p214m2.C4339q.m9705j(r3, r2)
        L64:
            return r3
    }

    /* renamed from: r */
    public static final int m2713r(p260oi.InterfaceC5286h r2) {
            java.lang.String r0 = "$this$readMedium"
            p214m2.C4339q.m9706k(r2, r0)
            byte r0 = r2.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            byte r1 = r2.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r2 = r2.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    /* renamed from: s */
    public static final boolean m2714s(p260oi.InterfaceC5304z r11, int r12, java.util.concurrent.TimeUnit r13) {
            java.lang.String r0 = "timeUnit"
            p214m2.C4339q.m9706k(r13, r0)
            long r0 = java.lang.System.nanoTime()
            oi.a0 r2 = r11.mo7463d()
            boolean r2 = r2.mo11528e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L22
            oi.a0 r2 = r11.mo7463d()
            long r5 = r2.mo11526c()
            long r5 = r5 - r0
            goto L23
        L22:
            r5 = r3
        L23:
            oi.a0 r2 = r11.mo7463d()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.mo11527d(r12)
            oi.e r12 = new oi.e     // Catch: java.lang.Throwable -> L51 java.io.InterruptedIOException -> L63
            r12.<init>()     // Catch: java.lang.Throwable -> L51 java.io.InterruptedIOException -> L63
        L39:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.mo4683j0(r12, r7)     // Catch: java.lang.Throwable -> L51 java.io.InterruptedIOException -> L63
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4b
            long r7 = r12.f20501Z     // Catch: java.lang.Throwable -> L51 java.io.InterruptedIOException -> L63
            r12.mo11559b(r7)     // Catch: java.lang.Throwable -> L51 java.io.InterruptedIOException -> L63
            goto L39
        L4b:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L71
            goto L69
        L51:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            oi.a0 r11 = r11.mo7463d()
            if (r13 != 0) goto L5e
            r11.mo11524a()
            goto L62
        L5e:
            long r0 = r0 + r5
            r11.mo11527d(r0)
        L62:
            throw r12
        L63:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L71
        L69:
            oi.a0 r11 = r11.mo7463d()
            r11.mo11524a()
            goto L79
        L71:
            oi.a0 r11 = r11.mo7463d()
            long r0 = r0 + r5
            r11.mo11527d(r0)
        L79:
            return r12
    }

    /* renamed from: t */
    public static final bi.C0802v m2715t(java.util.List<p154ii.C3176c> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            ii.c r1 = (p154ii.C3176c) r1
            oi.i r2 = r1.f12688b
            oi.i r1 = r1.f12689c
            java.lang.String r2 = r2.m11592s()
            java.lang.String r1 = r1.m11592s()
            r0.add(r2)
            java.lang.CharSequence r1 = p362uh.C6467m.m13083n0(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto Lb
        L32:
            bi.v r3 = new bi.v
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1 = 0
            r3.<init>(r0, r1)
            return r3
    }

    /* renamed from: u */
    public static final java.lang.String m2716u(bi.C0803w r4, boolean r5) {
            java.lang.String r0 = "$this$toHostHeader"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = r4.f4349e
            r1 = 0
            r2 = 2
            java.lang.String r3 = ":"
            boolean r0 = p362uh.C6467m.m13064U(r0, r3, r1, r2)
            if (r0 == 0) goto L20
            r0 = 91
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            java.lang.String r1 = r4.f4349e
            r2 = 93
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            goto L22
        L20:
            java.lang.String r0 = r4.f4349e
        L22:
            if (r5 != 0) goto L55
            int r5 = r4.f4350f
            java.lang.String r1 = r4.f4346b
            java.lang.String r2 = "scheme"
            p214m2.C4339q.m9706k(r1, r2)
            int r2 = r1.hashCode()
            r3 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r3) goto L47
            r3 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 == r3) goto L3c
            goto L52
        L3c:
            java.lang.String r2 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = 443(0x1bb, float:6.21E-43)
            goto L53
        L47:
            java.lang.String r2 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = 80
            goto L53
        L52:
            r1 = -1
        L53:
            if (r5 == r1) goto L6b
        L55:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            int r4 = r4.f4350f
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L6b:
            return r0
    }

    /* renamed from: v */
    public static final <T> java.util.List<T> m2717v(java.util.List<? extends T> r1) {
            java.lang.String r0 = "$this$toImmutableList"
            p214m2.C4339q.m9706k(r1, r0)
            java.util.List r1 = p062dh.C1473i.m4009U(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r0 = "Collections.unmodifiableList(toMutableList())"
            p214m2.C4339q.m9705j(r1, r0)
            return r1
    }

    /* renamed from: w */
    public static final int m2718w(java.lang.String r4, int r5) {
            if (r4 == 0) goto L19
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L19
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r1 = (long) r0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lf
            goto L18
        Lf:
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L17
            r0 = 0
            goto L18
        L17:
            int r0 = (int) r4
        L18:
            return r0
        L19:
            return r5
    }

    /* renamed from: x */
    public static final java.lang.String m2719x(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "$this$trimSubstring"
            p214m2.C4339q.m9706k(r1, r0)
            int r2 = m2708m(r1, r2, r3)
            int r3 = m2709n(r1, r2, r3)
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r1, r2)
            return r1
    }

    /* renamed from: y */
    public static final java.lang.Throwable m2720y(java.lang.Exception r2, java.util.List<? extends java.lang.Exception> r3) {
            java.lang.String r0 = "$this$withSuppressed"
            p214m2.C4339q.m9706k(r2, r0)
            int r0 = r3.size()
            r1 = 1
            if (r0 <= r1) goto L11
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r3)
        L11:
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            java.lang.Exception r0 = (java.lang.Exception) r0
            p185k7.C3836i.m8616a(r2, r0)
            goto L15
        L25:
            return r2
    }
}

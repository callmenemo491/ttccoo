package p362uh;

/* renamed from: uh.m */
/* loaded from: classes.dex */
public class C6467m extends p362uh.C6463i {
    /* renamed from: S */
    public static final boolean m13062S(java.lang.CharSequence r10, java.lang.CharSequence r11, boolean r12) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r11, r0)
            boolean r0 = r11 instanceof java.lang.String
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            java.lang.String r11 = (java.lang.String) r11
            r0 = 2
            int r10 = m13070a0(r10, r11, r2, r12, r0)
            if (r10 < 0) goto L2c
            goto L2d
        L1a:
            r5 = 0
            int r6 = r10.length()
            r8 = 0
            r9 = 16
            r3 = r10
            r4 = r11
            r7 = r12
            int r10 = m13068Y(r3, r4, r5, r6, r7, r8, r9)
            if (r10 < 0) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            return r1
    }

    /* renamed from: T */
    public static boolean m13063T(java.lang.CharSequence r2, char r3, boolean r4, int r5) {
            r0 = 2
            r5 = r5 & r0
            r1 = 0
            if (r5 == 0) goto L6
            r4 = 0
        L6:
            java.lang.String r5 = "<this>"
            p214m2.C4339q.m9706k(r2, r5)
            int r2 = m13069Z(r2, r3, r1, r4, r0)
            if (r2 < 0) goto L12
            r1 = 1
        L12:
            return r1
    }

    /* renamed from: U */
    public static /* synthetic */ boolean m13064U(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m13062S(r0, r1, r2)
            return r0
    }

    /* renamed from: V */
    public static final int m13065V(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            int r1 = r1.length()
            int r1 = r1 + (-1)
            return r1
    }

    /* renamed from: W */
    public static final int m13066W(java.lang.CharSequence r7, java.lang.String r8, int r9, boolean r10) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r7, r0)
            java.lang.String r0 = "string"
            p214m2.C4339q.m9706k(r8, r0)
            if (r10 != 0) goto L18
            boolean r0 = r7 instanceof java.lang.String
            if (r0 != 0) goto L11
            goto L18
        L11:
            java.lang.String r7 = (java.lang.String) r7
            int r7 = r7.indexOf(r8, r9)
            goto L27
        L18:
            int r3 = r7.length()
            r5 = 0
            r6 = 16
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            int r7 = m13068Y(r0, r1, r2, r3, r4, r5, r6)
        L27:
            return r7
    }

    /* renamed from: X */
    public static final int m13067X(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11) {
            r0 = 0
            if (r11 != 0) goto L13
            rh.c r11 = new rh.c
            if (r8 >= 0) goto L8
            r8 = 0
        L8:
            int r0 = r6.length()
            if (r9 <= r0) goto Lf
            r9 = r0
        Lf:
            r11.<init>(r8, r9)
            goto L21
        L13:
            int r11 = m13065V(r6)
            if (r8 <= r11) goto L1a
            r8 = r11
        L1a:
            if (r9 >= 0) goto L1d
            r9 = 0
        L1d:
            rh.a r11 = p209lh.C4304a.m9618l(r8, r9)
        L21:
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto L4f
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L4f
            int r8 = r11.f22647Y
            int r9 = r11.f22648Z
            int r11 = r11.f22649a0
            if (r11 <= 0) goto L33
            if (r8 <= r9) goto L37
        L33:
            if (r11 >= 0) goto L71
            if (r9 > r8) goto L71
        L37:
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r7.length()
            r3 = r8
            r5 = r10
            boolean r0 = p362uh.C6463i.m13055L(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L4b
            return r8
        L4b:
            if (r8 == r9) goto L71
            int r8 = r8 + r11
            goto L37
        L4f:
            int r8 = r11.f22647Y
            int r9 = r11.f22648Z
            int r11 = r11.f22649a0
            if (r11 <= 0) goto L59
            if (r8 <= r9) goto L5d
        L59:
            if (r11 >= 0) goto L71
            if (r9 > r8) goto L71
        L5d:
            r1 = 0
            int r4 = r7.length()
            r0 = r7
            r2 = r6
            r3 = r8
            r5 = r10
            boolean r0 = m13075f0(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L6d
            return r8
        L6d:
            if (r8 == r9) goto L71
            int r8 = r8 + r11
            goto L5d
        L71:
            r6 = -1
            return r6
    }

    /* renamed from: Y */
    public static /* synthetic */ int m13068Y(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11, int r12) {
            r12 = r12 & 16
            if (r12 == 0) goto L7
            r11 = 0
            r5 = 0
            goto L8
        L7:
            r5 = r11
        L8:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r6 = m13067X(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* renamed from: Z */
    public static int m13069Z(java.lang.CharSequence r2, char r3, int r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = 0
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = 0
        Lb:
            java.lang.String r6 = "<this>"
            p214m2.C4339q.m9706k(r2, r6)
            if (r5 != 0) goto L1e
            boolean r6 = r2 instanceof java.lang.String
            if (r6 != 0) goto L17
            goto L1e
        L17:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.indexOf(r3, r4)
            goto L27
        L1e:
            r6 = 1
            char[] r6 = new char[r6]
            r6[r1] = r3
            int r2 = m13071b0(r2, r6, r4, r5)
        L27:
            return r2
    }

    /* renamed from: a0 */
    public static /* synthetic */ int m13070a0(java.lang.CharSequence r2, java.lang.String r3, int r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = 0
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = 0
        Lb:
            int r2 = m13066W(r2, r3, r4, r5)
            return r2
    }

    /* renamed from: b0 */
    public static final int m13071b0(java.lang.CharSequence r7, char[] r8, int r9, boolean r10) {
            java.lang.String r0 = "chars"
            p214m2.C4339q.m9706k(r8, r0)
            r0 = 1
            if (r10 != 0) goto L1a
            int r1 = r8.length
            if (r1 != r0) goto L1a
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto L1a
            char r8 = p062dh.C1468d.m3990L(r8)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = r7.indexOf(r8, r9)
            return r7
        L1a:
            r1 = 0
            if (r9 >= 0) goto L1e
            r9 = 0
        L1e:
            int r2 = m13065V(r7)
            if (r9 > r2) goto L42
        L24:
            char r3 = r7.charAt(r9)
            int r4 = r8.length
            r5 = 0
        L2a:
            if (r5 >= r4) goto L39
            char r6 = r8[r5]
            boolean r6 = gh.C2390b.m6115e(r6, r3, r10)
            if (r6 == 0) goto L36
            r3 = 1
            goto L3a
        L36:
            int r5 = r5 + 1
            goto L2a
        L39:
            r3 = 0
        L3a:
            if (r3 == 0) goto L3d
            return r9
        L3d:
            if (r9 == r2) goto L42
            int r9 = r9 + 1
            goto L24
        L42:
            r7 = -1
            return r7
    }

    /* renamed from: c0 */
    public static int m13072c0(java.lang.CharSequence r5, char r6, int r7, boolean r8, int r9) {
            r0 = r9 & 2
            if (r0 == 0) goto L8
            int r7 = m13065V(r5)
        L8:
            r9 = r9 & 4
            r0 = 0
            if (r9 == 0) goto Le
            r8 = 0
        Le:
            r9 = -1
            if (r8 != 0) goto L18
            java.lang.String r5 = (java.lang.String) r5
            int r9 = r5.lastIndexOf(r6, r7)
            goto L4f
        L18:
            r1 = 1
            char[] r2 = new char[r1]
            r2[r0] = r6
            if (r8 != 0) goto L2a
            char r6 = p062dh.C1468d.m3990L(r2)
            java.lang.String r5 = (java.lang.String) r5
            int r9 = r5.lastIndexOf(r6, r7)
            goto L4f
        L2a:
            int r6 = m13065V(r5)
            if (r7 <= r6) goto L31
            r7 = r6
        L31:
            if (r9 >= r7) goto L4f
            char r6 = r5.charAt(r7)
            r3 = 0
        L38:
            if (r3 >= r1) goto L47
            char r4 = r2[r3]
            boolean r4 = gh.C2390b.m6115e(r4, r6, r8)
            if (r4 == 0) goto L44
            r6 = 1
            goto L48
        L44:
            int r3 = r3 + 1
            goto L38
        L47:
            r6 = 0
        L48:
            if (r6 == 0) goto L4c
            r9 = r7
            goto L4f
        L4c:
            int r7 = r7 + (-1)
            goto L31
        L4f:
            return r9
    }

    /* renamed from: d0 */
    public static final java.util.List<java.lang.String> m13073d0(java.lang.CharSequence r9) {
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "\n"
            java.lang.String r2 = "\r"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1, r2}
            r6 = 0
            r7 = 0
            r5 = 0
            r8 = 2
            r3 = r9
            th.d r0 = m13074e0(r3, r4, r5, r6, r7, r8)
            uh.l r1 = new uh.l
            r1.<init>(r9)
            th.k r9 = new th.k
            r9.<init>(r0, r1)
            java.util.List r9 = th.C6249g.m12831E(r9)
            return r9
    }

    /* renamed from: e0 */
    public static th.InterfaceC6246d m13074e0(java.lang.CharSequence r2, java.lang.String[] r3, int r4, boolean r5, int r6, int r7) {
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = 0
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = 0
        Lb:
            r7 = r7 & 8
            if (r7 == 0) goto L10
            r6 = 0
        L10:
            m13077h0(r6)
            java.util.List r3 = p062dh.C1468d.m3982D(r3)
            uh.b r7 = new uh.b
            uh.k r0 = new uh.k
            r0.<init>(r3, r5)
            r7.<init>(r2, r4, r6, r0)
            return r7
    }

    /* renamed from: f0 */
    public static final boolean m13075f0(java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r6, r0)
            r0 = 0
            if (r7 < 0) goto L39
            if (r5 < 0) goto L39
            int r1 = r4.length()
            int r1 = r1 - r8
            if (r5 > r1) goto L39
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L1e
            goto L39
        L1e:
            r1 = 0
        L1f:
            if (r1 >= r8) goto L37
            int r2 = r5 + r1
            char r2 = r4.charAt(r2)
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            boolean r2 = gh.C2390b.m6115e(r2, r3, r9)
            if (r2 != 0) goto L34
            return r0
        L34:
            int r1 = r1 + 1
            goto L1f
        L37:
            r4 = 1
            return r4
        L39:
            return r0
    }

    /* renamed from: g0 */
    public static final java.lang.String m13076g0(java.lang.String r3, java.lang.CharSequence r4) {
            r0 = 2
            r1 = 0
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = p362uh.C6463i.m13061R(r3, r2, r1, r0)
            if (r0 == 0) goto L18
            int r4 = r4.length()
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            p214m2.C4339q.m9705j(r3, r4)
        L18:
            return r3
    }

    /* renamed from: h0 */
    public static final void m13077h0(int r1) {
            if (r1 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.String r0 = "Limit must be non-negative, but was "
            java.lang.String r1 = android.support.v4.media.C0142a.m254a(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: i0 */
    public static final java.util.List<java.lang.String> m13078i0(java.lang.CharSequence r6, java.lang.String r7, boolean r8, int r9) {
            m13077h0(r9)
            r0 = 0
            int r1 = m13066W(r6, r7, r0, r8)
            r2 = -1
            if (r1 == r2) goto L50
            r3 = 1
            if (r9 != r3) goto Lf
            goto L50
        Lf:
            if (r9 <= 0) goto L12
            goto L13
        L12:
            r3 = 0
        L13:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            if (r3 == 0) goto L1d
            if (r9 <= r5) goto L1c
            goto L1d
        L1c:
            r5 = r9
        L1d:
            r4.<init>(r5)
        L20:
            java.lang.CharSequence r0 = r6.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            r4.add(r0)
            int r0 = r7.length()
            int r0 = r0 + r1
            if (r3 == 0) goto L3a
            int r1 = r4.size()
            int r5 = r9 + (-1)
            if (r1 == r5) goto L40
        L3a:
            int r1 = m13066W(r6, r7, r0, r8)
            if (r1 != r2) goto L20
        L40:
            int r7 = r6.length()
            java.lang.CharSequence r6 = r6.subSequence(r0, r7)
            java.lang.String r6 = r6.toString()
            r4.add(r6)
            return r4
        L50:
            java.lang.String r6 = r6.toString()
            java.util.List r6 = p074e9.C1805a.m4528m(r6)
            return r6
    }

    /* renamed from: j0 */
    public static java.util.List m13079j0(java.lang.CharSequence r2, char[] r3, boolean r4, int r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = 0
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = 0
        Lb:
            java.lang.String r6 = "<this>"
            p214m2.C4339q.m9706k(r2, r6)
            int r6 = r3.length
            r0 = 1
            if (r6 != r0) goto L1f
            char r3 = r3[r1]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.util.List r2 = m13078i0(r2, r3, r4, r5)
            goto L55
        L1f:
            m13077h0(r5)
            uh.b r6 = new uh.b
            uh.j r0 = new uh.j
            r0.<init>(r3, r4)
            r6.<init>(r2, r1, r5, r0)
            th.j r3 = new th.j
            r3.<init>(r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p062dh.C1469e.m3992D(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L40:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r3.next()
            rh.c r5 = (p316rh.C5854c) r5
            java.lang.String r5 = m13081l0(r2, r5)
            r4.add(r5)
            goto L40
        L54:
            r2 = r4
        L55:
            return r2
    }

    /* renamed from: k0 */
    public static java.util.List m13080k0(java.lang.CharSequence r8, java.lang.String[] r9, boolean r10, int r11, int r12) {
            r0 = r12 & 2
            r1 = 0
            if (r0 == 0) goto L7
            r5 = 0
            goto L8
        L7:
            r5 = r10
        L8:
            r10 = r12 & 4
            if (r10 == 0) goto Le
            r6 = 0
            goto Lf
        Le:
            r6 = r11
        Lf:
            java.lang.String r10 = "<this>"
            p214m2.C4339q.m9706k(r8, r10)
            int r10 = r9.length
            r11 = 1
            if (r10 != r11) goto L28
            r10 = r9[r1]
            int r12 = r10.length()
            if (r12 != 0) goto L21
            r1 = 1
        L21:
            if (r1 != 0) goto L28
            java.util.List r8 = m13078i0(r8, r10, r5, r6)
            goto L59
        L28:
            r4 = 0
            r7 = 2
            r2 = r8
            r3 = r9
            th.d r9 = m13074e0(r2, r3, r4, r5, r6, r7)
            th.j r10 = new th.j
            r10.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 10
            int r11 = p062dh.C1469e.m3992D(r10, r11)
            r9.<init>(r11)
            java.util.Iterator r10 = r10.iterator()
        L44:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L58
            java.lang.Object r11 = r10.next()
            rh.c r11 = (p316rh.C5854c) r11
            java.lang.String r11 = m13081l0(r8, r11)
            r9.add(r11)
            goto L44
        L58:
            r8 = r9
        L59:
            return r8
    }

    /* renamed from: l0 */
    public static final java.lang.String m13081l0(java.lang.CharSequence r1, p316rh.C5854c r2) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            java.lang.String r0 = "range"
            p214m2.C4339q.m9706k(r2, r0)
            int r0 = r2.f22647Y
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            int r2 = r2.f22648Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* renamed from: m0 */
    public static java.lang.String m13082m0(java.lang.String r1, char r2, java.lang.String r3, int r4) {
            r3 = r4 & 2
            if (r3 == 0) goto L6
            r3 = r1
            goto L7
        L6:
            r3 = 0
        L7:
            java.lang.String r4 = "<this>"
            p214m2.C4339q.m9706k(r1, r4)
            java.lang.String r4 = "missingDelimiterValue"
            p214m2.C4339q.m9706k(r3, r4)
            r4 = 0
            r0 = 6
            int r2 = m13072c0(r1, r2, r4, r4, r0)
            r4 = -1
            if (r2 != r4) goto L1b
            goto L2a
        L1b:
            int r2 = r2 + 1
            int r3 = r1.length()
            java.lang.String r3 = r1.substring(r2, r3)
            java.lang.String r1 = "this as java.lang.String\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r3, r1)
        L2a:
            return r3
    }

    /* renamed from: n0 */
    public static final java.lang.CharSequence m13083n0(java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r5, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        Ld:
            if (r2 > r0) goto L2b
            if (r3 != 0) goto L13
            r4 = r2
            goto L14
        L13:
            r4 = r0
        L14:
            char r4 = r5.charAt(r4)
            boolean r4 = gh.C2390b.m6128r(r4)
            if (r3 != 0) goto L25
            if (r4 != 0) goto L22
            r3 = 1
            goto Ld
        L22:
            int r2 = r2 + 1
            goto Ld
        L25:
            if (r4 != 0) goto L28
            goto L2b
        L28:
            int r0 = r0 + (-1)
            goto Ld
        L2b:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }
}

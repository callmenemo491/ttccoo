package p062dh;

/* renamed from: dh.d */
/* loaded from: classes.dex */
public class C1468d extends p074e9.C1805a {
    /* renamed from: D */
    public static final <T> java.util.List<T> m3982D(T[] r1) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r0 = "asList(this)"
            p214m2.C4339q.m9705j(r1, r0)
            return r1
    }

    /* renamed from: E */
    public static final byte[] m3983E(byte[] r1, byte[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            java.lang.String r0 = "destination"
            p214m2.C4339q.m9706k(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    /* renamed from: F */
    public static /* synthetic */ byte[] m3984F(byte[] r2, byte[] r3, int r4, int r5, int r6, int r7) {
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
            int r6 = r2.length
        L10:
            m3983E(r2, r3, r4, r5, r6)
            return r3
    }

    /* renamed from: G */
    public static java.lang.Object[] m3985G(java.lang.Object[] r2, java.lang.Object[] r3, int r4, int r5, int r6, int r7) {
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
            int r6 = r2.length
        L10:
            java.lang.String r7 = "<this>"
            p214m2.C4339q.m9706k(r2, r7)
            int r6 = r6 - r5
            java.lang.System.arraycopy(r2, r5, r3, r4, r6)
            return r3
    }

    /* renamed from: H */
    public static final byte[] m3986H(byte[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r2, r0)
            int r0 = r2.length
            if (r4 > r0) goto L12
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r3, r4)
            java.lang.String r3 = "copyOfRange(this, fromIndex, toIndex)"
            p214m2.C4339q.m9705j(r2, r3)
            return r2
        L12:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "toIndex ("
            r3.append(r1)
            r3.append(r4)
            java.lang.String r4 = ") is greater than size ("
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ")."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: I */
    public static final <T> int m3987I(T[] r1) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            int r1 = r1.length
            int r1 = r1 + (-1)
            return r1
    }

    /* renamed from: J */
    public static final <T> int m3988J(T[] r3, T r4) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r3, r0)
            r0 = 0
            if (r4 != 0) goto L13
            int r4 = r3.length
        L9:
            if (r0 >= r4) goto L22
            r1 = r3[r0]
            if (r1 != 0) goto L10
            return r0
        L10:
            int r0 = r0 + 1
            goto L9
        L13:
            int r1 = r3.length
        L14:
            if (r0 >= r1) goto L22
            r2 = r3[r0]
            boolean r2 = p214m2.C4339q.m9702c(r4, r2)
            if (r2 == 0) goto L1f
            return r0
        L1f:
            int r0 = r0 + 1
            goto L14
        L22:
            r3 = -1
            return r3
    }

    /* renamed from: K */
    public static java.lang.String m3989K(byte[] r4, java.lang.CharSequence r5, java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, java.lang.CharSequence r9, mh.InterfaceC4620l r10, int r11) {
            r6 = r11 & 1
            if (r6 == 0) goto L6
            java.lang.String r5 = ", "
        L6:
            r6 = r11 & 2
            java.lang.String r7 = ""
            r9 = 0
            if (r6 == 0) goto Lf
            r6 = r7
            goto L10
        Lf:
            r6 = r9
        L10:
            r0 = r11 & 4
            if (r0 == 0) goto L15
            goto L16
        L15:
            r7 = r9
        L16:
            r0 = r11 & 8
            if (r0 == 0) goto L1b
            r8 = -1
        L1b:
            r0 = r11 & 16
            if (r0 == 0) goto L22
            java.lang.String r0 = "..."
            goto L23
        L22:
            r0 = r9
        L23:
            r11 = r11 & 32
            if (r11 == 0) goto L28
            r10 = r9
        L28:
            java.lang.String r9 = "prefix"
            p214m2.C4339q.m9706k(r6, r9)
            java.lang.String r9 = "postfix"
            p214m2.C4339q.m9706k(r7, r9)
            java.lang.String r9 = "truncated"
            p214m2.C4339q.m9706k(r0, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            int r6 = r4.length
            r11 = 0
            r1 = 0
        L42:
            if (r11 >= r6) goto L69
            r2 = r4[r11]
            int r1 = r1 + 1
            r3 = 1
            if (r1 <= r3) goto L4e
            r9.append(r5)
        L4e:
            if (r8 < 0) goto L52
            if (r1 > r8) goto L69
        L52:
            if (r10 == 0) goto L5f
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            java.lang.Object r2 = r10.mo107b(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L63
        L5f:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L63:
            r9.append(r2)
            int r11 = r11 + 1
            goto L42
        L69:
            if (r8 < 0) goto L70
            if (r1 <= r8) goto L70
            r9.append(r0)
        L70:
            r9.append(r7)
            java.lang.String r4 = r9.toString()
            java.lang.String r5 = "joinTo(StringBuilder(), \u2026ed, transform).toString()"
            p214m2.C4339q.m9705j(r4, r5)
            return r4
    }

    /* renamed from: L */
    public static final char m3990L(char[] r2) {
            int r0 = r2.length
            if (r0 == 0) goto L12
            r1 = 1
            if (r0 != r1) goto La
            r0 = 0
            char r2 = r2[r0]
            return r2
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Array has more than one element."
            r2.<init>(r0)
            throw r2
        L12:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r0 = "Array is empty."
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: M */
    public static final <T> java.util.List<T> m3991M(T[] r3) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r3, r0)
            int r0 = r3.length
            if (r0 == 0) goto L1e
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L17
            java.util.ArrayList r0 = new java.util.ArrayList
            dh.c r1 = new dh.c
            r1.<init>(r3, r2)
            r0.<init>(r1)
            goto L20
        L17:
            r3 = r3[r2]
            java.util.List r0 = p074e9.C1805a.m4528m(r3)
            goto L20
        L1e:
            dh.k r0 = p062dh.C1475k.f7237Y
        L20:
            return r0
    }
}

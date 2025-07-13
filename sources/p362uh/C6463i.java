package p362uh;

/* renamed from: uh.i */
/* loaded from: classes.dex */
public class C6463i extends p362uh.C6462h {
    /* renamed from: H */
    public static final java.lang.String m13051H(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: I */
    public static boolean m13052I(java.lang.String r6, java.lang.String r7, boolean r8, int r9) {
            r9 = r9 & 2
            if (r9 == 0) goto L5
            r8 = 0
        L5:
            java.lang.String r9 = "<this>"
            p214m2.C4339q.m9706k(r6, r9)
            java.lang.String r9 = "suffix"
            p214m2.C4339q.m9706k(r7, r9)
            if (r8 != 0) goto L16
            boolean r6 = r6.endsWith(r7)
            goto L2c
        L16:
            int r8 = r6.length()
            int r9 = r7.length()
            int r1 = r8 - r9
            r3 = 0
            int r4 = r7.length()
            r5 = 1
            r0 = r6
            r2 = r7
            boolean r6 = m13055L(r0, r1, r2, r3, r4, r5)
        L2c:
            return r6
    }

    /* renamed from: J */
    public static final boolean m13053J(java.lang.String r0, java.lang.String r1, boolean r2) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
        L8:
            if (r2 != 0) goto Lf
            boolean r0 = r0.equals(r1)
            goto L13
        Lf:
            boolean r0 = r0.equalsIgnoreCase(r1)
        L13:
            return r0
    }

    /* renamed from: K */
    public static final boolean m13054K(java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r4, r0)
            int r1 = r4.length()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L48
            p214m2.C4339q.m9706k(r4, r0)
            rh.c r0 = new rh.c
            int r1 = r4.length()
            int r1 = r1 + (-1)
            r0.<init>(r2, r1)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L2a
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2a
        L28:
            r4 = 1
            goto L46
        L2a:
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            r1 = r0
            dh.n r1 = (p062dh.AbstractC1478n) r1
            int r1 = r1.mo4012a()
            char r1 = r4.charAt(r1)
            boolean r1 = gh.C2390b.m6128r(r1)
            if (r1 != 0) goto L2e
            r4 = 0
        L46:
            if (r4 == 0) goto L49
        L48:
            r2 = 1
        L49:
            return r2
    }

    /* renamed from: L */
    public static final boolean m13055L(java.lang.String r6, int r7, java.lang.String r8, int r9, int r10, boolean r11) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r8, r0)
            if (r11 != 0) goto L11
            boolean r6 = r6.regionMatches(r7, r8, r9, r10)
            goto L1b
        L11:
            r0 = r6
            r1 = r11
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
        L1b:
            return r6
    }

    /* renamed from: M */
    public static java.lang.String m13056M(java.lang.String r3, char r4, char r5, boolean r6, int r7) {
            r7 = r7 & 4
            r0 = 0
            if (r7 == 0) goto L6
            r6 = 0
        L6:
            if (r6 != 0) goto Lf
            java.lang.String r3 = r3.replace(r4, r5)
            java.lang.String r4 = "this as java.lang.String\u2026replace(oldChar, newChar)"
            goto L35
        Lf:
            int r7 = r3.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
        L18:
            int r7 = r3.length()
            if (r0 >= r7) goto L2f
            char r7 = r3.charAt(r0)
            boolean r2 = gh.C2390b.m6115e(r7, r4, r6)
            if (r2 == 0) goto L29
            r7 = r5
        L29:
            r1.append(r7)
            int r0 = r0 + 1
            goto L18
        L2f:
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "StringBuilder(capacity).\u2026builderAction).toString()"
        L35:
            p214m2.C4339q.m9705j(r3, r4)
            return r3
    }

    /* renamed from: N */
    public static java.lang.String m13057N(java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, int r9) {
            r9 = r9 & 4
            r0 = 0
            if (r9 == 0) goto L6
            r8 = 0
        L6:
            java.lang.String r9 = "<this>"
            p214m2.C4339q.m9706k(r5, r9)
            int r9 = p362uh.C6467m.m13066W(r5, r6, r0, r8)
            if (r9 >= 0) goto L12
            goto L51
        L12:
            int r1 = r6.length()
            r2 = 1
            if (r1 >= r2) goto L1a
            goto L1b
        L1a:
            r2 = r1
        L1b:
            int r3 = r5.length()
            int r3 = r3 - r1
            int r4 = r7.length()
            int r4 = r4 + r3
            if (r4 < 0) goto L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
        L2c:
            r3.append(r5, r0, r9)
            r3.append(r7)
            int r0 = r9 + r1
            int r4 = r5.length()
            if (r9 >= r4) goto L41
            int r9 = r9 + r2
            int r9 = p362uh.C6467m.m13066W(r5, r6, r9, r8)
            if (r9 > 0) goto L2c
        L41:
            int r6 = r5.length()
            r3.append(r5, r0, r6)
            java.lang.String r5 = r3.toString()
            java.lang.String r6 = "stringBuilder.append(this, i, length).toString()"
            p214m2.C4339q.m9705j(r5, r6)
        L51:
            return r5
        L52:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
    }

    /* renamed from: O */
    public static final boolean m13058O(java.lang.String r6, java.lang.String r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "prefix"
            p214m2.C4339q.m9706k(r7, r0)
            if (r9 != 0) goto L11
            boolean r6 = r6.startsWith(r7, r8)
            return r6
        L11:
            r3 = 0
            int r4 = r7.length()
            r0 = r6
            r1 = r8
            r2 = r7
            r5 = r9
            boolean r6 = m13055L(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* renamed from: P */
    public static final boolean m13059P(java.lang.String r6, java.lang.String r7, boolean r8) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "prefix"
            p214m2.C4339q.m9706k(r7, r0)
            if (r8 != 0) goto L11
            boolean r6 = r6.startsWith(r7)
            return r6
        L11:
            r1 = 0
            r3 = 0
            int r4 = r7.length()
            r0 = r6
            r2 = r7
            r5 = r8
            boolean r6 = m13055L(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* renamed from: Q */
    public static /* synthetic */ boolean m13060Q(java.lang.String r0, java.lang.String r1, int r2, boolean r3, int r4) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            boolean r0 = m13058O(r0, r1, r2, r3)
            return r0
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m13061R(java.lang.String r0, java.lang.String r1, boolean r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m13059P(r0, r1, r2)
            return r0
    }
}

package p124h7;

/* renamed from: h7.v8 */
/* loaded from: classes.dex */
public final class C2908v8 extends p124h7.C2979z7 {
    public C2908v8() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public final java.lang.String toString() {
            r7 = this;
            r0 = 6
            char[] r0 = new char[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [92, 117, 0, 0, 0, 0} // fill-array
            r1 = 46
            r2 = 0
        L9:
            r3 = 4
            if (r2 >= r3) goto L1c
            int r4 = 5 - r2
            r5 = r1 & 15
            java.lang.String r6 = "0123456789ABCDEF"
            char r5 = r6.charAt(r5)
            r0[r4] = r5
            int r1 = r1 >> r3
            int r2 = r2 + 1
            goto L9
        L1c:
            java.lang.String r0 = java.lang.String.copyValueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 18
            r2.<init>(r1)
            java.lang.String r1 = "CharMatcher.is('"
            java.lang.String r3 = "')"
            java.lang.String r0 = p083f.C1932s.m4774a(r2, r1, r0, r3)
            return r0
    }
}

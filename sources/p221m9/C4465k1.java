package p221m9;

/* renamed from: m9.k1 */
/* loaded from: classes.dex */
public final class C4465k1 {
    /* renamed from: a */
    public static java.lang.String m10179a(p221m9.AbstractC4454h r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.size()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r5.size()
            if (r1 >= r2) goto L6f
            byte r2 = r5.mo10056a(r1)
            r3 = 34
            if (r2 == r3) goto L67
            r3 = 39
            if (r2 == r3) goto L64
            r3 = 92
            if (r2 == r3) goto L61
            switch(r2) {
                case 7: goto L3e;
                case 8: goto L3b;
                case 9: goto L38;
                case 10: goto L35;
                case 11: goto L32;
                case 12: goto L2f;
                case 13: goto L2c;
                default: goto L23;
            }
        L23:
            r4 = 32
            if (r2 < r4) goto L41
            r4 = 126(0x7e, float:1.77E-43)
            if (r2 > r4) goto L41
            goto L5c
        L2c:
            java.lang.String r2 = "\\r"
            goto L69
        L2f:
            java.lang.String r2 = "\\f"
            goto L69
        L32:
            java.lang.String r2 = "\\v"
            goto L69
        L35:
            java.lang.String r2 = "\\n"
            goto L69
        L38:
            java.lang.String r2 = "\\t"
            goto L69
        L3b:
            java.lang.String r2 = "\\b"
            goto L69
        L3e:
            java.lang.String r2 = "\\a"
            goto L69
        L41:
            r0.append(r3)
            int r3 = r2 >>> 6
            r3 = r3 & 3
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            int r3 = r2 >>> 3
            r3 = r3 & 7
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            r2 = r2 & 7
            int r2 = r2 + 48
        L5c:
            char r2 = (char) r2
            r0.append(r2)
            goto L6c
        L61:
            java.lang.String r2 = "\\\\"
            goto L69
        L64:
            java.lang.String r2 = "\\'"
            goto L69
        L67:
            java.lang.String r2 = "\\\""
        L69:
            r0.append(r2)
        L6c:
            int r1 = r1 + 1
            goto La
        L6f:
            java.lang.String r5 = r0.toString()
            return r5
    }
}

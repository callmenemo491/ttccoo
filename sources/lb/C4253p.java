package lb;

/* renamed from: lb.p */
/* loaded from: classes.dex */
public final class C4253p {

    /* renamed from: a */
    public static final int f17434a = 0;

    static {
            java.lang.String r0 = "java.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            r2 = -1
            java.lang.String r3 = "[._]"
            java.lang.String[] r3 = r0.split(r3)     // Catch: java.lang.NumberFormatException -> L21
            r4 = r3[r1]     // Catch: java.lang.NumberFormatException -> L21
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L21
            r5 = 1
            if (r4 != r5) goto L22
            int r6 = r3.length     // Catch: java.lang.NumberFormatException -> L21
            if (r6 <= r5) goto L22
            r3 = r3[r5]     // Catch: java.lang.NumberFormatException -> L21
            int r4 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L21
            goto L22
        L21:
            r4 = -1
        L22:
            if (r4 != r2) goto L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L48
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L48
        L29:
            int r4 = r0.length()     // Catch: java.lang.NumberFormatException -> L48
            if (r1 >= r4) goto L3f
            char r4 = r0.charAt(r1)     // Catch: java.lang.NumberFormatException -> L48
            boolean r5 = java.lang.Character.isDigit(r4)     // Catch: java.lang.NumberFormatException -> L48
            if (r5 == 0) goto L3f
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L48
            int r1 = r1 + 1
            goto L29
        L3f:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.NumberFormatException -> L48
            int r4 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L48
            goto L49
        L48:
            r4 = -1
        L49:
            if (r4 != r2) goto L4c
            r4 = 6
        L4c:
            lb.C4253p.f17434a = r4
            return
    }
}

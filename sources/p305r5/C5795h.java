package p305r5;

/* renamed from: r5.h */
/* loaded from: classes.dex */
public final class C5795h {
    static {
            java.lang.String r0 = "^NOTE([ \t].*)?$"
            java.util.regex.Pattern.compile(r0)
            return
    }

    /* renamed from: a */
    public static float m12157a(java.lang.String r2) {
            java.lang.String r0 = "%"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L1b
            r0 = 0
            int r1 = r2.length()
            int r1 = r1 + (-1)
            java.lang.String r2 = r2.substring(r0, r1)
            float r2 = java.lang.Float.parseFloat(r2)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            return r2
        L1b:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r0 = "Percentages must end with %"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: b */
    public static long m12158b(java.lang.String r9) {
            int r0 = p371v5.C6552b0.f25624a
            java.lang.String r0 = "\\."
            r1 = 2
            java.lang.String[] r9 = r9.split(r0, r1)
            r0 = 0
            r2 = r9[r0]
            java.lang.String r3 = ":"
            java.lang.String[] r2 = p371v5.C6552b0.m13303G(r2, r3)
            int r3 = r2.length
            r4 = 0
        L15:
            if (r0 >= r3) goto L25
            r6 = r2[r0]
            r7 = 60
            long r4 = r4 * r7
            long r6 = java.lang.Long.parseLong(r6)
            long r4 = r4 + r6
            int r0 = r0 + 1
            goto L15
        L25:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r2
            int r0 = r9.length
            if (r0 != r1) goto L34
            r0 = 1
            r9 = r9[r0]
            long r0 = java.lang.Long.parseLong(r9)
            long r4 = r4 + r0
        L34:
            long r4 = r4 * r2
            return r4
    }

    /* renamed from: c */
    public static void m12159c(p371v5.C6571u r3) {
            int r0 = r3.f25711b
            java.lang.String r1 = r3.m13404g()
            if (r1 == 0) goto L12
            java.lang.String r2 = "WEBVTT"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 != 0) goto L38
            r3.m13396F(r0)
            java.lang.String r0 = "Expected WEBVTT. Got "
            java.lang.String r3 = r3.m13404g()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            if (r1 == 0) goto L2d
            java.lang.String r3 = r0.concat(r3)
            goto L32
        L2d:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L32:
            r0 = 0
            f4.s0 r3 = p088f4.C2044s0.m5407a(r3, r0)
            throw r3
        L38:
            return
    }
}

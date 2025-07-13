package p305r5;

/* renamed from: r5.b */
/* loaded from: classes.dex */
public final class C5789b {

    /* renamed from: c */
    public static final java.util.regex.Pattern f22423c = null;

    /* renamed from: d */
    public static final java.util.regex.Pattern f22424d = null;

    /* renamed from: a */
    public final p371v5.C6571u f22425a;

    /* renamed from: b */
    public final java.lang.StringBuilder f22426b;

    static {
            java.lang.String r0 = "\\[voice=\"([^\"]*)\"\\]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p305r5.C5789b.f22423c = r0
            java.lang.String r0 = "^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p305r5.C5789b.f22424d = r0
            return
    }

    public C5789b() {
            r1 = this;
            r1.<init>()
            v5.u r0 = new v5.u
            r0.<init>()
            r1.f22425a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.f22426b = r0
            return
    }

    /* renamed from: a */
    public static java.lang.String m12143a(p371v5.C6571u r5, java.lang.StringBuilder r6) {
            r0 = 0
            r6.setLength(r0)
            int r1 = r5.f25711b
            int r2 = r5.f25712c
        L8:
            if (r1 >= r2) goto L42
            if (r0 != 0) goto L42
            byte[] r3 = r5.f25710a
            r3 = r3[r1]
            char r3 = (char) r3
            r4 = 65
            if (r3 < r4) goto L19
            r4 = 90
            if (r3 <= r4) goto L3c
        L19:
            r4 = 97
            if (r3 < r4) goto L21
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 <= r4) goto L3c
        L21:
            r4 = 48
            if (r3 < r4) goto L29
            r4 = 57
            if (r3 <= r4) goto L3c
        L29:
            r4 = 35
            if (r3 == r4) goto L3c
            r4 = 45
            if (r3 == r4) goto L3c
            r4 = 46
            if (r3 == r4) goto L3c
            r4 = 95
            if (r3 != r4) goto L3a
            goto L3c
        L3a:
            r0 = 1
            goto L8
        L3c:
            int r1 = r1 + 1
            r6.append(r3)
            goto L8
        L42:
            int r0 = r5.f25711b
            int r1 = r1 - r0
            r5.m13397G(r1)
            java.lang.String r5 = r6.toString()
            return r5
    }

    /* renamed from: b */
    public static java.lang.String m12144b(p371v5.C6571u r1, java.lang.StringBuilder r2) {
            m12145c(r1)
            int r0 = r1.m13398a()
            if (r0 != 0) goto Lb
            r1 = 0
            return r1
        Lb:
            java.lang.String r2 = m12143a(r1, r2)
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L18
            return r2
        L18:
            int r1 = r1.m13418u()
            char r1 = (char) r1
            r2 = 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* renamed from: c */
    public static void m12145c(p371v5.C6571u r8) {
            r0 = 1
        L1:
            r1 = 1
        L2:
            int r2 = r8.m13398a()
            if (r2 <= 0) goto L6a
            if (r1 == 0) goto L6a
            int r1 = r8.f25711b
            byte[] r2 = r8.f25710a
            r1 = r2[r1]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L28
            r2 = 10
            if (r1 == r2) goto L28
            r2 = 12
            if (r1 == r2) goto L28
            r2 = 13
            if (r1 == r2) goto L28
            r2 = 32
            if (r1 == r2) goto L28
            r1 = 0
            goto L2c
        L28:
            r8.m13397G(r0)
            r1 = 1
        L2c:
            if (r1 != 0) goto L1
            int r1 = r8.f25711b
            int r2 = r8.f25712c
            byte[] r4 = r8.f25710a
            int r5 = r1 + 2
            if (r5 > r2) goto L64
            int r5 = r1 + 1
            r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L64
            int r1 = r5 + 1
            r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L64
        L48:
            int r5 = r1 + 1
            if (r5 >= r2) goto L5c
            r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L5a
            r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L5a
            int r2 = r5 + 1
            r1 = r2
            goto L48
        L5a:
            r1 = r5
            goto L48
        L5c:
            int r1 = r8.f25711b
            int r2 = r2 - r1
            r8.m13397G(r2)
            r1 = 1
            goto L65
        L64:
            r1 = 0
        L65:
            if (r1 == 0) goto L68
            goto L1
        L68:
            r1 = 0
            goto L2
        L6a:
            return
    }
}

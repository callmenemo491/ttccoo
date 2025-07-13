package p216m4;

/* renamed from: m4.s */
/* loaded from: classes.dex */
public final class C4374s {

    /* renamed from: c */
    public static final java.util.regex.Pattern f17926c = null;

    /* renamed from: a */
    public int f17927a;

    /* renamed from: b */
    public int f17928b;

    static {
            java.lang.String r0 = "^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p216m4.C4374s.f17926c = r0
            return
    }

    public C4374s() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f17927a = r0
            r1.f17928b = r0
            return
    }

    /* renamed from: a */
    public final boolean m9827a(java.lang.String r5) {
            r4 = this;
            java.util.regex.Pattern r0 = p216m4.C4374s.f17926c
            java.util.regex.Matcher r5 = r0.matcher(r5)
            boolean r0 = r5.find()
            if (r0 == 0) goto L2b
            r0 = 1
            java.lang.String r1 = r5.group(r0)     // Catch: java.lang.NumberFormatException -> L2b
            int r2 = p371v5.C6552b0.f25624a     // Catch: java.lang.NumberFormatException -> L2b
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r1, r2)     // Catch: java.lang.NumberFormatException -> L2b
            r3 = 2
            java.lang.String r5 = r5.group(r3)     // Catch: java.lang.NumberFormatException -> L2b
            int r5 = java.lang.Integer.parseInt(r5, r2)     // Catch: java.lang.NumberFormatException -> L2b
            if (r1 > 0) goto L26
            if (r5 <= 0) goto L2b
        L26:
            r4.f17927a = r1     // Catch: java.lang.NumberFormatException -> L2b
            r4.f17928b = r5     // Catch: java.lang.NumberFormatException -> L2b
            return r0
        L2b:
            r5 = 0
            return r5
    }

    /* renamed from: b */
    public boolean m9828b(p427y4.C7110a r8) {
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            y4.a$b[] r2 = r8.f27506Y
            int r3 = r2.length
            if (r1 >= r3) goto L47
            r2 = r2[r1]
            boolean r3 = r2 instanceof p051d5.C1286e
            java.lang.String r4 = "iTunSMPB"
            r5 = 1
            if (r3 == 0) goto L23
            d5.e r2 = (p051d5.C1286e) r2
            java.lang.String r3 = r2.f6779a0
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L44
            java.lang.String r2 = r2.f6780b0
            boolean r2 = r7.m9827a(r2)
            if (r2 == 0) goto L44
            return r5
        L23:
            boolean r3 = r2 instanceof p051d5.C1290i
            if (r3 == 0) goto L44
            d5.i r2 = (p051d5.C1290i) r2
            java.lang.String r3 = r2.f6791Z
            java.lang.String r6 = "com.apple.iTunes"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L44
            java.lang.String r3 = r2.f6792a0
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L44
            java.lang.String r2 = r2.f6793b0
            boolean r2 = r7.m9827a(r2)
            if (r2 == 0) goto L44
            return r5
        L44:
            int r1 = r1 + 1
            goto L2
        L47:
            return r0
    }
}

package p057db;

/* renamed from: db.d0 */
/* loaded from: classes.dex */
public final class C1394d0 {

    /* renamed from: d */
    public static final java.util.regex.Pattern f7015d = null;

    /* renamed from: a */
    public final java.lang.String f7016a;

    /* renamed from: b */
    public final java.lang.String f7017b;

    /* renamed from: c */
    public final java.lang.String f7018c;

    static {
            java.lang.String r0 = "[a-zA-Z0-9-_.~%]{1,900}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p057db.C1394d0.f7015d = r0
            return
    }

    public C1394d0(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L25
            java.lang.String r2 = "/topics/"
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L25
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r5
            java.lang.String r3 = "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s."
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "FirebaseMessaging"
            android.util.Log.w(r3, r2)
            r2 = 8
            java.lang.String r2 = r6.substring(r2)
            goto L26
        L25:
            r2 = r6
        L26:
            if (r2 == 0) goto L58
            java.util.regex.Pattern r3 = p057db.C1394d0.f7015d
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L58
            r4.f7016a = r2
            r4.f7017b = r5
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            java.lang.String r2 = java.lang.String.valueOf(r6)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r0 = r0 + r1
            int r0 = r0 + r2
            r3.<init>(r0)
            java.lang.String r0 = "!"
            java.lang.String r5 = p083f.C1932s.m4774a(r3, r5, r0, r6)
            r4.f7018c = r5
            return
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r0] = r2
            java.lang.String r0 = "[a-zA-Z0-9-_.~%]{1,900}"
            r6[r1] = r0
            java.lang.String r0 = "Invalid topic name: %s does not match the allowed format %s."
            java.lang.String r6 = java.lang.String.format(r0, r6)
            r5.<init>(r6)
            throw r5
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p057db.C1394d0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            db.d0 r4 = (p057db.C1394d0) r4
            java.lang.String r0 = r3.f7016a
            java.lang.String r2 = r4.f7016a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            java.lang.String r0 = r3.f7017b
            java.lang.String r4 = r4.f7017b
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f7017b
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f7016a
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}

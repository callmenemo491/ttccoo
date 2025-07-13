package bi;

/* renamed from: bi.y */
/* loaded from: classes.dex */
public final class C0805y {

    /* renamed from: d */
    public static final java.util.regex.Pattern f4363d = null;

    /* renamed from: e */
    public static final java.util.regex.Pattern f4364e = null;

    /* renamed from: f */
    public static final bi.C0805y.a f4365f = null;

    /* renamed from: a */
    public final java.lang.String f4366a;

    /* renamed from: b */
    public final java.lang.String f4367b;

    /* renamed from: c */
    public final java.lang.String[] f4368c;

    /* renamed from: bi.y$a */
    public static final class a {
        /* renamed from: a */
        public static final bi.C0805y m2459a(java.lang.String r12) {
                java.lang.String r0 = "$this$toMediaType"
                p214m2.C4339q.m9706k(r12, r0)
                java.util.regex.Pattern r0 = bi.C0805y.f4363d
                java.util.regex.Matcher r0 = r0.matcher(r12)
                boolean r1 = r0.lookingAt()
                r2 = 34
                if (r1 == 0) goto Le6
                r1 = 1
                java.lang.String r3 = r0.group(r1)
                java.lang.String r4 = "typeSubtype.group(1)"
                p214m2.C4339q.m9705j(r3, r4)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.String r5 = "Locale.US"
                p214m2.C4339q.m9705j(r4, r5)
                java.lang.String r8 = r3.toLowerCase(r4)
                java.lang.String r3 = "(this as java.lang.String).toLowerCase(locale)"
                p214m2.C4339q.m9705j(r8, r3)
                r6 = 2
                java.lang.String r7 = r0.group(r6)
                java.lang.String r9 = "typeSubtype.group(2)"
                p214m2.C4339q.m9705j(r7, r9)
                p214m2.C4339q.m9705j(r4, r5)
                java.lang.String r9 = r7.toLowerCase(r4)
                p214m2.C4339q.m9705j(r9, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.regex.Pattern r4 = bi.C0805y.f4364e
                java.util.regex.Matcher r4 = r4.matcher(r12)
                int r0 = r0.end()
            L50:
                int r5 = r12.length()
                r7 = 0
                if (r0 >= r5) goto Lcf
                int r5 = r12.length()
                r4.region(r0, r5)
                boolean r5 = r4.lookingAt()
                if (r5 == 0) goto La4
                java.lang.String r0 = r4.group(r1)
                if (r0 != 0) goto L6b
                goto L9f
            L6b:
                java.lang.String r5 = r4.group(r6)
                if (r5 != 0) goto L77
                r5 = 3
                java.lang.String r5 = r4.group(r5)
                goto L99
            L77:
                java.lang.String r10 = "'"
                boolean r11 = p362uh.C6463i.m13061R(r5, r10, r7, r6)
                if (r11 == 0) goto L99
                boolean r7 = p362uh.C6463i.m13052I(r5, r10, r7, r6)
                if (r7 == 0) goto L99
                int r7 = r5.length()
                if (r7 <= r6) goto L99
                int r7 = r5.length()
                int r7 = r7 - r1
                java.lang.String r5 = r5.substring(r1, r7)
                java.lang.String r7 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
                p214m2.C4339q.m9705j(r5, r7)
            L99:
                r3.add(r0)
                r3.add(r5)
            L9f:
                int r0 = r4.end()
                goto L50
            La4:
                java.lang.String r1 = "Parameter is not formatted correctly: \""
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r0 = r12.substring(r0)
                java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
                p214m2.C4339q.m9705j(r0, r3)
                r1.append(r0)
                java.lang.String r0 = "\" for: \""
                r1.append(r0)
                r1.append(r12)
                r1.append(r2)
                java.lang.String r12 = r1.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r0.<init>(r12)
                throw r0
            Lcf:
                bi.y r0 = new bi.y
                java.lang.String[] r1 = new java.lang.String[r7]
                java.lang.Object[] r1 = r3.toArray(r1)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r1, r2)
                r10 = r1
                java.lang.String[] r10 = (java.lang.String[]) r10
                r11 = 0
                r6 = r0
                r7 = r12
                r6.<init>(r7, r8, r9, r10, r11)
                return r0
            Le6:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "No subtype found for: \""
                r0.append(r1)
                r0.append(r12)
                r0.append(r2)
                java.lang.String r12 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r0.<init>(r12)
                throw r0
        }

        /* renamed from: b */
        public static final bi.C0805y m2460b(java.lang.String r1) {
                java.lang.String r0 = "$this$toMediaTypeOrNull"
                p214m2.C4339q.m9706k(r1, r0)
                bi.y r1 = m2459a(r1)     // Catch: java.lang.IllegalArgumentException -> La
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }
    }

    static {
            java.lang.String r0 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bi.C0805y.f4363d = r0
            java.lang.String r0 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bi.C0805y.f4364e = r0
            return
    }

    public C0805y(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4, p239nh.C4826f r5) {
            r0 = this;
            r0.<init>()
            r0.f4366a = r1
            r0.f4367b = r2
            r0.f4368c = r4
            return
    }

    /* renamed from: b */
    public static final bi.C0805y m2457b(java.lang.String r0) {
            bi.y r0 = bi.C0805y.a.m2459a(r0)
            return r0
    }

    /* renamed from: a */
    public final java.nio.charset.Charset m2458a(java.nio.charset.Charset r7) {
            r6 = this;
            java.lang.String r0 = "charset"
            java.lang.String r1 = "name"
            p214m2.C4339q.m9706k(r0, r1)
            java.lang.String[] r1 = r6.f4368c
            java.lang.String r2 = "<this>"
            p214m2.C4339q.m9706k(r1, r2)
            rh.c r2 = new rh.c
            int r1 = p062dh.C1468d.m3987I(r1)
            r3 = 0
            r2.<init>(r3, r1)
            r1 = 2
            rh.a r1 = p209lh.C4304a.m9603I(r2, r1)
            int r2 = r1.f22647Y
            int r3 = r1.f22648Z
            int r1 = r1.f22649a0
            if (r1 < 0) goto L28
            if (r2 > r3) goto L3f
            goto L2a
        L28:
            if (r2 < r3) goto L3f
        L2a:
            java.lang.String[] r4 = r6.f4368c
            r4 = r4[r2]
            r5 = 1
            boolean r4 = p362uh.C6463i.m13053J(r4, r0, r5)
            if (r4 == 0) goto L3b
            java.lang.String[] r0 = r6.f4368c
            int r2 = r2 + r5
            r0 = r0[r2]
            goto L40
        L3b:
            if (r2 == r3) goto L3f
            int r2 = r2 + r1
            goto L2a
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L46
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L46
        L46:
            return r7
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof bi.C0805y
            if (r0 == 0) goto L12
            bi.y r2 = (bi.C0805y) r2
            java.lang.String r2 = r2.f4366a
            java.lang.String r0 = r1.f4366a
            boolean r2 = p214m2.C4339q.m9702c(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f4366a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f4366a
            return r0
    }
}

package bi;

/* renamed from: bi.e */
/* loaded from: classes.dex */
public final class C0778e {

    /* renamed from: n */
    public static final bi.C0778e.a f4206n = null;

    /* renamed from: a */
    public final boolean f4207a;

    /* renamed from: b */
    public final boolean f4208b;

    /* renamed from: c */
    public final int f4209c;

    /* renamed from: d */
    public final int f4210d;

    /* renamed from: e */
    public final boolean f4211e;

    /* renamed from: f */
    public final boolean f4212f;

    /* renamed from: g */
    public final boolean f4213g;

    /* renamed from: h */
    public final int f4214h;

    /* renamed from: i */
    public final int f4215i;

    /* renamed from: j */
    public final boolean f4216j;

    /* renamed from: k */
    public final boolean f4217k;

    /* renamed from: l */
    public final boolean f4218l;

    /* renamed from: m */
    public java.lang.String f4219m;

    /* renamed from: bi.e$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final int m2374a(java.lang.String r5, java.lang.String r6, int r7) {
                r4 = this;
                int r0 = r5.length()
            L4:
                if (r7 >= r0) goto L16
                char r1 = r5.charAt(r7)
                r2 = 0
                r3 = 2
                boolean r1 = p362uh.C6467m.m13063T(r6, r1, r2, r3)
                if (r1 == 0) goto L13
                return r7
            L13:
                int r7 = r7 + 1
                goto L4
            L16:
                int r5 = r5.length()
                return r5
        }

        /* renamed from: b */
        public final bi.C0778e m2375b(bi.C0802v r27) {
                r26 = this;
                r0 = r26
                r1 = r27
                java.lang.String r2 = "headers"
                p214m2.C4339q.m9706k(r1, r2)
                int r2 = r27.size()
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L23:
                if (r7 >= r2) goto L197
                java.lang.String r3 = r1.m2429e(r7)
                java.lang.String r4 = r1.m2431i(r7)
                java.lang.String r5 = "Cache-Control"
                boolean r5 = p362uh.C6463i.m13053J(r3, r5, r6)
                if (r5 == 0) goto L3a
                if (r9 == 0) goto L38
                goto L42
            L38:
                r9 = r4
                goto L43
            L3a:
                java.lang.String r5 = "Pragma"
                boolean r3 = p362uh.C6463i.m13053J(r3, r5, r6)
                if (r3 == 0) goto L18b
            L42:
                r8 = 0
            L43:
                r3 = 0
            L44:
                int r5 = r4.length()
                if (r3 >= r5) goto L186
                java.lang.String r5 = "=,;"
                int r5 = r0.m2374a(r4, r5, r3)
                java.lang.String r3 = r4.substring(r3, r5)
                java.lang.String r6 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
                p214m2.C4339q.m9705j(r3, r6)
                java.lang.CharSequence r3 = p362uh.C6467m.m13083n0(r3)
                java.lang.String r3 = r3.toString()
                int r1 = r4.length()
                if (r5 == r1) goto Ldc
                char r1 = r4.charAt(r5)
                r24 = r2
                r2 = 44
                if (r1 == r2) goto Lde
                char r1 = r4.charAt(r5)
                r2 = 59
                if (r1 != r2) goto L7a
                goto Lde
            L7a:
                int r5 = r5 + 1
                byte[] r1 = ci.C0988c.f5065a
                java.lang.String r1 = "$this$indexOfNonWhitespace"
                p214m2.C4339q.m9706k(r4, r1)
                int r1 = r4.length()
            L87:
                if (r5 >= r1) goto L9d
                char r2 = r4.charAt(r5)
                r25 = r1
                r1 = 32
                if (r2 == r1) goto L98
                r1 = 9
                if (r2 == r1) goto L98
                goto La1
            L98:
                int r5 = r5 + 1
                r1 = r25
                goto L87
            L9d:
                int r5 = r4.length()
            La1:
                int r1 = r4.length()
                if (r5 >= r1) goto Lc3
                char r1 = r4.charAt(r5)
                r2 = 34
                if (r1 != r2) goto Lc3
                int r5 = r5 + 1
                r1 = 4
                r25 = r9
                r9 = 0
                int r1 = p362uh.C6467m.m13069Z(r4, r2, r5, r9, r1)
                java.lang.String r2 = r4.substring(r5, r1)
                p214m2.C4339q.m9705j(r2, r6)
                r5 = 1
                int r1 = r1 + r5
                goto Le5
            Lc3:
                r25 = r9
                r9 = 0
                java.lang.String r1 = ",;"
                int r1 = r0.m2374a(r4, r1, r5)
                java.lang.String r2 = r4.substring(r5, r1)
                p214m2.C4339q.m9705j(r2, r6)
                java.lang.CharSequence r2 = p362uh.C6467m.m13083n0(r2)
                java.lang.String r2 = r2.toString()
                goto Le5
            Ldc:
                r24 = r2
            Lde:
                r25 = r9
                r9 = 0
                int r5 = r5 + 1
                r1 = r5
                r2 = 0
            Le5:
                java.lang.String r5 = "no-cache"
                r6 = 1
                boolean r5 = p362uh.C6463i.m13053J(r5, r3, r6)
                if (r5 == 0) goto Lf2
                r5 = -1
                r10 = 1
                goto L17d
            Lf2:
                java.lang.String r5 = "no-store"
                boolean r5 = p362uh.C6463i.m13053J(r5, r3, r6)
                if (r5 == 0) goto Lfe
                r5 = -1
                r11 = 1
                goto L17d
            Lfe:
                java.lang.String r5 = "max-age"
                boolean r5 = p362uh.C6463i.m13053J(r5, r3, r6)
                if (r5 == 0) goto L10d
                r5 = -1
                int r12 = ci.C0988c.m2718w(r2, r5)
                goto L17d
            L10d:
                r5 = -1
                java.lang.String r9 = "s-maxage"
                boolean r9 = p362uh.C6463i.m13053J(r9, r3, r6)
                if (r9 == 0) goto L11b
                int r13 = ci.C0988c.m2718w(r2, r5)
                goto L17d
            L11b:
                java.lang.String r5 = "private"
                boolean r5 = p362uh.C6463i.m13053J(r5, r3, r6)
                if (r5 == 0) goto L126
                r5 = -1
                r14 = 1
                goto L17d
            L126:
                java.lang.String r5 = "public"
                boolean r5 = p362uh.C6463i.m13053J(r5, r3, r6)
                if (r5 == 0) goto L131
                r5 = -1
                r15 = 1
                goto L17d
            L131:
                java.lang.String r5 = "must-revalidate"
                boolean r5 = p362uh.C6463i.m13053J(r5, r3, r6)
                if (r5 == 0) goto L13d
                r5 = -1
                r16 = 1
                goto L17d
            L13d:
                java.lang.String r5 = "max-stale"
                boolean r5 = p362uh.C6463i.m13053J(r5, r3, r6)
                if (r5 == 0) goto L14e
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = ci.C0988c.m2718w(r2, r3)
                r5 = -1
                goto L17d
            L14e:
                java.lang.String r5 = "min-fresh"
                boolean r5 = p362uh.C6463i.m13053J(r5, r3, r6)
                if (r5 == 0) goto L15c
                r5 = -1
                int r18 = ci.C0988c.m2718w(r2, r5)
                goto L17d
            L15c:
                r5 = -1
                java.lang.String r2 = "only-if-cached"
                boolean r2 = p362uh.C6463i.m13053J(r2, r3, r6)
                if (r2 == 0) goto L168
                r19 = 1
                goto L17d
            L168:
                java.lang.String r2 = "no-transform"
                boolean r2 = p362uh.C6463i.m13053J(r2, r3, r6)
                if (r2 == 0) goto L173
                r20 = 1
                goto L17d
            L173:
                java.lang.String r2 = "immutable"
                boolean r2 = p362uh.C6463i.m13053J(r2, r3, r6)
                if (r2 == 0) goto L17d
                r21 = 1
            L17d:
                r3 = r1
                r2 = r24
                r9 = r25
                r1 = r27
                goto L44
            L186:
                r24 = r2
                r25 = r9
                goto L18e
            L18b:
                r24 = r2
                r3 = r9
            L18e:
                r5 = -1
                int r7 = r7 + 1
                r1 = r27
                r2 = r24
                goto L23
            L197:
                r3 = r9
                if (r8 != 0) goto L19d
                r22 = 0
                goto L19f
            L19d:
                r22 = r3
            L19f:
                bi.e r1 = new bi.e
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
        }
    }

    static {
            bi.e$a r0 = new bi.e$a
            r1 = 0
            r0.<init>(r1)
            bi.C0778e.f4206n = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r1 = "timeUnit"
            p214m2.C4339q.m9706k(r0, r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            long r1 = (long) r1
            r0.toSeconds(r1)
            return
    }

    public C0778e(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13, p239nh.C4826f r14) {
            r0 = this;
            r0.<init>()
            r0.f4207a = r1
            r0.f4208b = r2
            r0.f4209c = r3
            r0.f4210d = r4
            r0.f4211e = r5
            r0.f4212f = r6
            r0.f4213g = r7
            r0.f4214h = r8
            r0.f4215i = r9
            r0.f4216j = r10
            r0.f4217k = r11
            r0.f4218l = r12
            r0.f4219m = r13
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.f4219m
            if (r0 != 0) goto Lbe
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r4.f4207a
            if (r1 == 0) goto L12
            java.lang.String r1 = "no-cache, "
            r0.append(r1)
        L12:
            boolean r1 = r4.f4208b
            if (r1 == 0) goto L1b
            java.lang.String r1 = "no-store, "
            r0.append(r1)
        L1b:
            int r1 = r4.f4209c
            java.lang.String r2 = ", "
            r3 = -1
            if (r1 == r3) goto L2f
            java.lang.String r1 = "max-age="
            r0.append(r1)
            int r1 = r4.f4209c
            r0.append(r1)
            r0.append(r2)
        L2f:
            int r1 = r4.f4210d
            if (r1 == r3) goto L40
            java.lang.String r1 = "s-maxage="
            r0.append(r1)
            int r1 = r4.f4210d
            r0.append(r1)
            r0.append(r2)
        L40:
            boolean r1 = r4.f4211e
            if (r1 == 0) goto L49
            java.lang.String r1 = "private, "
            r0.append(r1)
        L49:
            boolean r1 = r4.f4212f
            if (r1 == 0) goto L52
            java.lang.String r1 = "public, "
            r0.append(r1)
        L52:
            boolean r1 = r4.f4213g
            if (r1 == 0) goto L5b
            java.lang.String r1 = "must-revalidate, "
            r0.append(r1)
        L5b:
            int r1 = r4.f4214h
            if (r1 == r3) goto L6c
            java.lang.String r1 = "max-stale="
            r0.append(r1)
            int r1 = r4.f4214h
            r0.append(r1)
            r0.append(r2)
        L6c:
            int r1 = r4.f4215i
            if (r1 == r3) goto L7d
            java.lang.String r1 = "min-fresh="
            r0.append(r1)
            int r1 = r4.f4215i
            r0.append(r1)
            r0.append(r2)
        L7d:
            boolean r1 = r4.f4216j
            if (r1 == 0) goto L86
            java.lang.String r1 = "only-if-cached, "
            r0.append(r1)
        L86:
            boolean r1 = r4.f4217k
            if (r1 == 0) goto L8f
            java.lang.String r1 = "no-transform, "
            r0.append(r1)
        L8f:
            boolean r1 = r4.f4218l
            if (r1 == 0) goto L98
            java.lang.String r1 = "immutable, "
            r0.append(r1)
        L98:
            int r1 = r0.length()
            if (r1 != 0) goto La0
            r1 = 1
            goto La1
        La0:
            r1 = 0
        La1:
            if (r1 == 0) goto La6
            java.lang.String r0 = ""
            return r0
        La6:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            r0.delete(r1, r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p214m2.C4339q.m9705j(r0, r1)
            r4.f4219m = r0
        Lbe:
            return r0
    }
}

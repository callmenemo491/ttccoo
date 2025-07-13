package androidx.navigation;

/* renamed from: androidx.navigation.l */
/* loaded from: classes.dex */
public final class C0517l {

    /* renamed from: i */
    public static final java.util.regex.Pattern f2958i = null;

    /* renamed from: a */
    public final java.util.ArrayList<java.lang.String> f2959a;

    /* renamed from: b */
    public final java.util.Map<java.lang.String, androidx.navigation.C0517l.b> f2960b;

    /* renamed from: c */
    public java.util.regex.Pattern f2961c;

    /* renamed from: d */
    public boolean f2962d;

    /* renamed from: e */
    public boolean f2963e;

    /* renamed from: f */
    public final java.lang.String f2964f;

    /* renamed from: g */
    public java.util.regex.Pattern f2965g;

    /* renamed from: h */
    public final java.lang.String f2966h;

    /* renamed from: androidx.navigation.l$a */
    public static class a implements java.lang.Comparable<androidx.navigation.C0517l.a> {

        /* renamed from: Y */
        public java.lang.String f2967Y;

        /* renamed from: Z */
        public java.lang.String f2968Z;

        public a(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "/"
                r1 = -1
                java.lang.String[] r3 = r3.split(r0, r1)
                r0 = 0
                r0 = r3[r0]
                r2.f2967Y = r0
                r0 = 1
                r3 = r3[r0]
                r2.f2968Z = r3
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(androidx.navigation.C0517l.a r1) {
                r0 = this;
                androidx.navigation.l$a r1 = (androidx.navigation.C0517l.a) r1
                int r1 = r0.m1590e(r1)
                return r1
        }

        /* renamed from: e */
        public int m1590e(androidx.navigation.C0517l.a r3) {
                r2 = this;
                java.lang.String r0 = r2.f2967Y
                java.lang.String r1 = r3.f2967Y
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lc
                r0 = 2
                goto Ld
            Lc:
                r0 = 0
            Ld:
                java.lang.String r1 = r2.f2968Z
                java.lang.String r3 = r3.f2968Z
                boolean r3 = r1.equals(r3)
                if (r3 == 0) goto L19
                int r0 = r0 + 1
            L19:
                return r0
        }
    }

    /* renamed from: androidx.navigation.l$b */
    public static class b {

        /* renamed from: a */
        public java.lang.String f2969a;

        /* renamed from: b */
        public java.util.ArrayList<java.lang.String> f2970b;

        public b() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f2970b = r0
                return
        }
    }

    static {
            java.lang.String r0 = "^[a-zA-Z]+[+\\w\\-.]*:"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.navigation.C0517l.f2958i = r0
            return
    }

    public C0517l(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r12 = this;
            r12.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f2959a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.f2960b = r0
            r0 = 0
            r12.f2961c = r0
            r1 = 0
            r12.f2962d = r1
            r12.f2963e = r1
            r12.f2965g = r0
            r12.f2964f = r14
            r12.f2966h = r15
            if (r13 == 0) goto Lfb
            android.net.Uri r14 = android.net.Uri.parse(r13)
            java.lang.String r0 = r14.getQuery()
            r2 = 1
            if (r0 == 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            r12.f2963e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "^"
            r0.<init>(r3)
            java.util.regex.Pattern r3 = androidx.navigation.C0517l.f2958i
            java.util.regex.Matcher r3 = r3.matcher(r13)
            boolean r3 = r3.find()
            if (r3 != 0) goto L49
            java.lang.String r3 = "http[s]?://"
            r0.append(r3)
        L49:
            java.lang.String r3 = "\\{(.+?)\\}"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            boolean r4 = r12.f2963e
            java.lang.String r5 = "\\E.*\\Q"
            java.lang.String r6 = ".*"
            if (r4 == 0) goto Le6
            java.lang.String r4 = "(\\?)"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.util.regex.Matcher r4 = r4.matcher(r13)
            boolean r7 = r4.find()
            if (r7 == 0) goto L72
            int r4 = r4.start()
            java.lang.String r13 = r13.substring(r1, r4)
            r12.m1588a(r13, r0, r3)
        L72:
            r12.f2962d = r1
            java.util.Set r13 = r14.getQueryParameterNames()
            java.util.Iterator r13 = r13.iterator()
        L7c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto Lec
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = r14.getQueryParameter(r1)
            java.util.regex.Matcher r8 = r3.matcher(r7)
            androidx.navigation.l$b r9 = new androidx.navigation.l$b
            r9.<init>()
            r10 = 0
        L9b:
            boolean r11 = r8.find()
            if (r11 == 0) goto Lc4
            java.lang.String r2 = r8.group(r2)
            java.util.ArrayList<java.lang.String> r11 = r9.f2970b
            r11.add(r2)
            int r2 = r8.start()
            java.lang.String r2 = r7.substring(r10, r2)
            java.lang.String r2 = java.util.regex.Pattern.quote(r2)
            r4.append(r2)
            java.lang.String r2 = "(.+?)?"
            r4.append(r2)
            int r10 = r8.end()
            r2 = 1
            goto L9b
        Lc4:
            int r2 = r7.length()
            if (r10 >= r2) goto Ld5
            java.lang.String r2 = r7.substring(r10)
            java.lang.String r2 = java.util.regex.Pattern.quote(r2)
            r4.append(r2)
        Ld5:
            java.lang.String r2 = r4.toString()
            java.lang.String r2 = r2.replace(r6, r5)
            r9.f2969a = r2
            java.util.Map<java.lang.String, androidx.navigation.l$b> r2 = r12.f2960b
            r2.put(r1, r9)
            r2 = 1
            goto L7c
        Le6:
            boolean r13 = r12.m1588a(r13, r0, r3)
            r12.f2962d = r13
        Lec:
            java.lang.String r13 = r0.toString()
            java.lang.String r13 = r13.replace(r6, r5)
            r14 = 2
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13, r14)
            r12.f2961c = r13
        Lfb:
            if (r15 == 0) goto L14d
            java.lang.String r13 = "^[\\s\\S]+/[\\s\\S]+$"
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13)
            java.util.regex.Matcher r13 = r13.matcher(r15)
            boolean r13 = r13.matches()
            if (r13 == 0) goto L13f
            androidx.navigation.l$a r13 = new androidx.navigation.l$a
            r13.<init>(r15)
            java.lang.String r14 = "^("
            java.lang.StringBuilder r14 = android.support.v4.media.C0144c.m256a(r14)
            java.lang.String r15 = r13.f2967Y
            r14.append(r15)
            java.lang.String r15 = "|[*]+)/("
            r14.append(r15)
            java.lang.String r13 = r13.f2968Z
            r14.append(r13)
            java.lang.String r13 = "|[*]+)$"
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = "*|[*]"
            java.lang.String r15 = "[\\s\\S]"
            java.lang.String r13 = r13.replace(r14, r15)
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13)
            r12.f2965g = r13
            goto L14d
        L13f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "The given mimeType "
            java.lang.String r0 = " does not match to required \"type/subtype\" format"
            java.lang.String r14 = android.support.v4.media.C0145d.m257a(r14, r15, r0)
            r13.<init>(r14)
            throw r13
        L14d:
            return
    }

    /* renamed from: a */
    public final boolean m1588a(java.lang.String r6, java.lang.StringBuilder r7, java.util.regex.Pattern r8) {
            r5 = this;
            java.util.regex.Matcher r8 = r8.matcher(r6)
            java.lang.String r0 = ".*"
            boolean r0 = r6.contains(r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            r3 = 0
        Le:
            boolean r4 = r8.find()
            if (r4 == 0) goto L37
            java.lang.String r0 = r8.group(r1)
            java.util.ArrayList<java.lang.String> r4 = r5.f2959a
            r4.add(r0)
            int r0 = r8.start()
            java.lang.String r0 = r6.substring(r3, r0)
            java.lang.String r0 = java.util.regex.Pattern.quote(r0)
            r7.append(r0)
            java.lang.String r0 = "(.+?)"
            r7.append(r0)
            int r3 = r8.end()
            r0 = 0
            goto Le
        L37:
            int r8 = r6.length()
            if (r3 >= r8) goto L48
            java.lang.String r6 = r6.substring(r3)
            java.lang.String r6 = java.util.regex.Pattern.quote(r6)
            r7.append(r6)
        L48:
            java.lang.String r6 = "($|(\\?(.)*))"
            r7.append(r6)
            return r0
    }

    /* renamed from: b */
    public final boolean m1589b(android.os.Bundle r1, java.lang.String r2, java.lang.String r3, androidx.navigation.C0513h r4) {
            r0 = this;
            if (r4 == 0) goto Le
            androidx.navigation.t r4 = r4.f2939a
            java.lang.Object r3 = r4.mo1605c(r3)     // Catch: java.lang.IllegalArgumentException -> Lc
            r4.mo1606d(r1, r2, r3)     // Catch: java.lang.IllegalArgumentException -> Lc
            goto L11
        Lc:
            r1 = 1
            return r1
        Le:
            r1.putString(r2, r3)
        L11:
            r1 = 0
            return r1
    }
}

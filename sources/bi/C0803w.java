package bi;

/* renamed from: bi.w */
/* loaded from: classes.dex */
public final class C0803w {

    /* renamed from: k */
    public static final char[] f4343k = null;

    /* renamed from: l */
    public static final bi.C0803w.b f4344l = null;

    /* renamed from: a */
    public final boolean f4345a;

    /* renamed from: b */
    public final java.lang.String f4346b;

    /* renamed from: c */
    public final java.lang.String f4347c;

    /* renamed from: d */
    public final java.lang.String f4348d;

    /* renamed from: e */
    public final java.lang.String f4349e;

    /* renamed from: f */
    public final int f4350f;

    /* renamed from: g */
    public final java.util.List<java.lang.String> f4351g;

    /* renamed from: h */
    public final java.util.List<java.lang.String> f4352h;

    /* renamed from: i */
    public final java.lang.String f4353i;

    /* renamed from: j */
    public final java.lang.String f4354j;

    /* renamed from: bi.w$a */
    public static final class a {

        /* renamed from: a */
        public java.lang.String f4355a;

        /* renamed from: b */
        public java.lang.String f4356b;

        /* renamed from: c */
        public java.lang.String f4357c;

        /* renamed from: d */
        public java.lang.String f4358d;

        /* renamed from: e */
        public int f4359e;

        /* renamed from: f */
        public final java.util.List<java.lang.String> f4360f;

        /* renamed from: g */
        public java.util.List<java.lang.String> f4361g;

        /* renamed from: h */
        public java.lang.String f4362h;

        public a() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.f4356b = r0
                r2.f4357c = r0
                r1 = -1
                r2.f4359e = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.f4360f = r1
                r1.add(r0)
                return
        }

        /* renamed from: a */
        public final bi.C0803w m2447a() {
                r17 = this;
                r0 = r17
                java.lang.String r2 = r0.f4355a
                if (r2 == 0) goto La9
                bi.w$b r1 = bi.C0803w.f4344l
                java.lang.String r4 = r0.f4356b
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 7
                r3 = r1
                java.lang.String r9 = bi.C0803w.b.m2452d(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = r0.f4357c
                java.lang.String r4 = bi.C0803w.b.m2452d(r3, r4, r5, r6, r7, r8)
                java.lang.String r5 = r0.f4358d
                if (r5 == 0) goto La1
                int r6 = r17.m2448b()
                java.util.List<java.lang.String> r1 = r0.f4360f
                java.util.ArrayList r7 = new java.util.ArrayList
                r3 = 10
                int r8 = p062dh.C1469e.m3992D(r1, r3)
                r7.<init>(r8)
                java.util.Iterator r1 = r1.iterator()
            L32:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L4d
                java.lang.Object r8 = r1.next()
                r11 = r8
                java.lang.String r11 = (java.lang.String) r11
                bi.w$b r10 = bi.C0803w.f4344l
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 7
                java.lang.String r8 = bi.C0803w.b.m2452d(r10, r11, r12, r13, r14, r15)
                r7.add(r8)
                goto L32
            L4d:
                java.util.List<java.lang.String> r1 = r0.f4361g
                r8 = 0
                if (r1 == 0) goto L7f
                java.util.ArrayList r10 = new java.util.ArrayList
                int r3 = p062dh.C1469e.m3992D(r1, r3)
                r10.<init>(r3)
                java.util.Iterator r1 = r1.iterator()
            L5f:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L80
                java.lang.Object r3 = r1.next()
                r12 = r3
                java.lang.String r12 = (java.lang.String) r12
                if (r12 == 0) goto L7a
                bi.w$b r11 = bi.C0803w.f4344l
                r13 = 0
                r14 = 0
                r15 = 1
                r16 = 3
                java.lang.String r3 = bi.C0803w.b.m2452d(r11, r12, r13, r14, r15, r16)
                goto L7b
            L7a:
                r3 = r8
            L7b:
                r10.add(r3)
                goto L5f
            L7f:
                r10 = r8
            L80:
                java.lang.String r12 = r0.f4362h
                if (r12 == 0) goto L91
                bi.w$b r11 = bi.C0803w.f4344l
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 7
                java.lang.String r1 = bi.C0803w.b.m2452d(r11, r12, r13, r14, r15, r16)
                r11 = r1
                goto L92
            L91:
                r11 = r8
            L92:
                java.lang.String r12 = r17.toString()
                bi.w r13 = new bi.w
                r1 = r13
                r3 = r9
                r8 = r10
                r9 = r11
                r10 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r13
            La1:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "host == null"
                r1.<init>(r2)
                throw r1
            La9:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "scheme == null"
                r1.<init>(r2)
                throw r1
        }

        /* renamed from: b */
        public final int m2448b() {
                r4 = this;
                int r0 = r4.f4359e
                r1 = -1
                if (r0 == r1) goto L6
                goto L36
            L6:
                java.lang.String r0 = r4.f4355a
                p214m2.C4339q.m9704i(r0)
                java.lang.String r2 = "scheme"
                p214m2.C4339q.m9706k(r0, r2)
                int r2 = r0.hashCode()
                r3 = 3213448(0x310888, float:4.503E-39)
                if (r2 == r3) goto L2a
                r3 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r2 == r3) goto L1f
                goto L35
            L1f:
                java.lang.String r2 = "https"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L35
                r0 = 443(0x1bb, float:6.21E-43)
                goto L36
            L2a:
                java.lang.String r2 = "http"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L35
                r0 = 80
                goto L36
            L35:
                r0 = -1
            L36:
                return r0
        }

        /* renamed from: c */
        public final bi.C0803w.a m2449c(java.lang.String r13) {
                r12 = this;
                if (r13 == 0) goto L1a
                bi.w$b r11 = bi.C0803w.f4344l
                r2 = 0
                r3 = 0
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 211(0xd3, float:2.96E-43)
                java.lang.String r4 = " \"'<>#"
                r0 = r11
                r1 = r13
                java.lang.String r13 = bi.C0803w.b.m2451a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.util.List r13 = r11.m2455e(r13)
                goto L1b
            L1a:
                r13 = 0
            L1b:
                r12.f4361g = r13
                return r12
        }

        /* renamed from: d */
        public final bi.C0803w.a m2450d(bi.C0803w r27, java.lang.String r28) {
                r26 = this;
                r0 = r26
                r1 = r27
                r12 = r28
                byte[] r2 = ci.C0988c.f5065a
                int r2 = r28.length()
                r3 = 0
                int r2 = ci.C0988c.m2708m(r12, r3, r2)
                int r4 = r28.length()
                int r13 = ci.C0988c.m2709n(r12, r2, r4)
                int r4 = r13 - r2
                r5 = 2
                r6 = 58
                r7 = -1
                r8 = 1
                if (r4 >= r5) goto L24
                goto L7d
            L24:
                char r4 = r12.charAt(r2)
                r9 = 97
                int r10 = p214m2.C4339q.m9708m(r4, r9)
                r11 = 122(0x7a, float:1.71E-43)
                r14 = 65
                r15 = 90
                if (r10 < 0) goto L3c
                int r10 = p214m2.C4339q.m9708m(r4, r11)
                if (r10 <= 0) goto L49
            L3c:
                int r10 = p214m2.C4339q.m9708m(r4, r14)
                if (r10 < 0) goto L7d
                int r4 = p214m2.C4339q.m9708m(r4, r15)
                if (r4 <= 0) goto L49
                goto L7d
            L49:
                r4 = r2
            L4a:
                int r4 = r4 + r8
                if (r4 >= r13) goto L7d
                char r10 = r12.charAt(r4)
                if (r9 <= r10) goto L54
                goto L57
            L54:
                if (r11 < r10) goto L57
                goto L75
            L57:
                if (r14 <= r10) goto L5a
                goto L5d
            L5a:
                if (r15 < r10) goto L5d
                goto L75
            L5d:
                r9 = 57
                r11 = 48
                if (r11 <= r10) goto L64
                goto L67
            L64:
                if (r9 < r10) goto L67
                goto L75
            L67:
                r9 = 43
                if (r10 != r9) goto L6c
                goto L75
            L6c:
                r9 = 45
                if (r10 != r9) goto L71
                goto L75
            L71:
                r9 = 46
                if (r10 != r9) goto L7a
            L75:
                r9 = 97
                r11 = 122(0x7a, float:1.71E-43)
                goto L4a
            L7a:
                if (r10 != r6) goto L7d
                goto L7e
            L7d:
                r4 = -1
            L7e:
                java.lang.String r14 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
                if (r4 == r7) goto Lbf
                java.lang.String r9 = "https:"
                boolean r9 = p362uh.C6463i.m13058O(r12, r9, r2, r8)
                if (r9 == 0) goto L91
                java.lang.String r3 = "https"
                r0.f4355a = r3
                int r2 = r2 + 6
                goto Lc5
            L91:
                java.lang.String r9 = "http:"
                boolean r9 = p362uh.C6463i.m13058O(r12, r9, r2, r8)
                if (r9 == 0) goto La0
                java.lang.String r3 = "http"
                r0.f4355a = r3
                int r2 = r2 + 5
                goto Lc5
            La0:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                java.lang.String r3 = r12.substring(r3, r4)
                p214m2.C4339q.m9705j(r3, r14)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Lbf:
                if (r1 == 0) goto L459
                java.lang.String r3 = r1.f4346b
                r0.f4355a = r3
            Lc5:
                r3 = 0
                r4 = r2
            Lc7:
                r9 = 92
                r10 = 47
                if (r4 >= r13) goto Lda
                char r11 = r12.charAt(r4)
                if (r11 == r9) goto Ld5
                if (r11 != r10) goto Lda
            Ld5:
                int r3 = r3 + 1
                int r4 = r4 + 1
                goto Lc7
            Lda:
                r4 = 63
                r11 = 35
                if (r3 >= r5) goto L124
                if (r1 == 0) goto L124
                java.lang.String r5 = r1.f4346b
                java.lang.String r15 = r0.f4355a
                boolean r5 = p214m2.C4339q.m9702c(r5, r15)
                r5 = r5 ^ r8
                if (r5 == 0) goto Lee
                goto L124
            Lee:
                java.lang.String r3 = r27.m2443e()
                r0.f4356b = r3
                java.lang.String r3 = r27.m2439a()
                r0.f4357c = r3
                java.lang.String r3 = r1.f4349e
                r0.f4358d = r3
                int r3 = r1.f4350f
                r0.f4359e = r3
                java.util.List<java.lang.String> r3 = r0.f4360f
                r3.clear()
                java.util.List<java.lang.String> r3 = r0.f4360f
                java.util.List r4 = r27.m2441c()
                r3.addAll(r4)
                if (r2 == r13) goto L118
                char r3 = r12.charAt(r2)
                if (r3 != r11) goto L11f
            L118:
                java.lang.String r1 = r27.m2442d()
                r0.m2449c(r1)
            L11f:
                r1 = 1
                r17 = r13
                goto L2d2
            L124:
                int r2 = r2 + r3
                r1 = 0
                r3 = 0
                r11 = r2
                r1 = 35
                r15 = 0
                r16 = 0
            L12d:
                java.lang.String r2 = "@/\\?#"
                int r8 = ci.C0988c.m2701f(r12, r2, r11, r13)
                if (r8 == r13) goto L13a
                char r2 = r12.charAt(r8)
                goto L13b
            L13a:
                r2 = -1
            L13b:
                if (r2 == r7) goto L1fb
                if (r2 == r1) goto L1fb
                if (r2 == r10) goto L1fb
                if (r2 == r9) goto L1fb
                if (r2 == r4) goto L1fb
                r1 = 64
                if (r2 == r1) goto L14d
                r17 = r13
                goto L1ec
            L14d:
                java.lang.String r10 = "%40"
                if (r15 != 0) goto L1b1
                int r9 = ci.C0988c.m2700e(r12, r6, r11, r8)
                bi.w$b r17 = bi.C0803w.f4344l
                r6 = 1
                r7 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r17
                r2 = r28
                r3 = r11
                r4 = r9
                r11 = r8
                r8 = r18
                r22 = r9
                r9 = r19
                r23 = r10
                r10 = r20
                r27 = r15
                r15 = r11
                r11 = r21
                java.lang.String r1 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r16 == 0) goto L18c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f4356b
                r4 = r23
                java.lang.String r1 = p083f.C1932s.m4774a(r2, r3, r4, r1)
            L18c:
                r0.f4356b = r1
                r1 = r22
                if (r1 == r15) goto L1aa
                int r3 = r1 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r17
                r2 = r28
                r4 = r15
                java.lang.String r1 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.f4357c = r1
                r1 = 1
                goto L1ac
            L1aa:
                r1 = r27
            L1ac:
                r16 = 1
                r17 = r13
                goto L1e9
            L1b1:
                r4 = r10
                r27 = r15
                r15 = r8
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = r0.f4357c
                r10.append(r1)
                r10.append(r4)
                bi.w$b r1 = bi.C0803w.f4344l
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r17 = 0
                r18 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = r28
                r3 = r11
                r4 = r15
                r11 = r10
                r10 = r17
                r17 = r13
                r13 = r11
                r11 = r18
                java.lang.String r1 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.append(r1)
                java.lang.String r1 = r13.toString()
                r0.f4357c = r1
                r1 = r27
            L1e9:
                int r11 = r15 + 1
                r15 = r1
            L1ec:
                r1 = 35
                r4 = 63
                r10 = 47
                r9 = 92
                r7 = -1
                r6 = 58
                r13 = r17
                goto L12d
            L1fb:
                r15 = r8
                r17 = r13
                r8 = r11
            L1ff:
                if (r8 >= r15) goto L21f
                char r1 = r12.charAt(r8)
                r2 = 58
                if (r1 == r2) goto L21d
                r2 = 91
                if (r1 == r2) goto L20e
                goto L21a
            L20e:
                int r8 = r8 + 1
                if (r8 >= r15) goto L21a
                char r1 = r12.charAt(r8)
                r2 = 93
                if (r1 != r2) goto L20e
            L21a:
                int r8 = r8 + 1
                goto L1ff
            L21d:
                r13 = r8
                goto L220
            L21f:
                r13 = r15
            L220:
                int r10 = r13 + 1
                r7 = 34
                if (r10 >= r15) goto L2a5
                bi.w$b r7 = bi.C0803w.f4344l
                r5 = 0
                r6 = 4
                r1 = r7
                r2 = r28
                r3 = r11
                r4 = r13
                java.lang.String r1 = bi.C0803w.b.m2452d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = gh.C2390b.m6135y(r1)
                r0.f4358d = r1
                java.lang.String r5 = ""
                r6 = 0
                r8 = 0
                r9 = 0
                r16 = 0
                r18 = 0
                r19 = 248(0xf8, float:3.48E-43)
                r4 = 1
                r1 = r7
                r2 = r28
                r3 = r10
                r7 = 1
                r4 = r15
                r7 = r8
                r8 = r9
                r9 = r16
                r25 = r10
                r10 = r18
                r27 = r11
                r11 = r19
                java.lang.String r1 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.NumberFormatException -> L26a
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L26a
                r2 = 65535(0xffff, float:9.1834E-41)
                r3 = 1
                if (r3 <= r1) goto L266
                goto L270
            L266:
                if (r2 < r1) goto L270
                r4 = 1
                goto L272
            L26a:
                r3 = 1
                goto L270
            L26c:
                r25 = r10
                r27 = r11
            L270:
                r4 = 1
                r1 = -1
            L272:
                r0.f4359e = r1
                r2 = -1
                if (r1 == r2) goto L279
                r1 = 1
                goto L27a
            L279:
                r1 = 0
            L27a:
                if (r1 == 0) goto L280
                r7 = 34
                r1 = r4
                goto L2c8
            L280:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                r13 = r25
                java.lang.String r2 = r12.substring(r13, r15)
                p214m2.C4339q.m9705j(r2, r14)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L2a5:
                r27 = r11
                r8 = 1
                bi.w$b r9 = bi.C0803w.f4344l
                r5 = 0
                r6 = 4
                r1 = r9
                r2 = r28
                r3 = r27
                r4 = r13
                java.lang.String r1 = bi.C0803w.b.m2452d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = gh.C2390b.m6135y(r1)
                r0.f4358d = r1
                java.lang.String r1 = r0.f4355a
                p214m2.C4339q.m9704i(r1)
                int r1 = r9.m2453b(r1)
                r0.f4359e = r1
                r1 = 1
            L2c8:
                java.lang.String r2 = r0.f4358d
                if (r2 == 0) goto L2ce
                r2 = 1
                goto L2cf
            L2ce:
                r2 = 0
            L2cf:
                if (r2 == 0) goto L436
                r2 = r15
            L2d2:
                java.lang.String r3 = "?#"
                r4 = r17
                int r3 = ci.C0988c.m2701f(r12, r3, r2, r4)
                if (r2 != r3) goto L2e1
                r15 = r0
                r14 = r4
                r13 = r12
                goto L3e6
            L2e1:
                char r5 = r12.charAt(r2)
                java.lang.String r6 = ""
                r7 = 47
                if (r5 == r7) goto L305
                r7 = 92
                if (r5 != r7) goto L2f0
                goto L305
            L2f0:
                java.util.List<java.lang.String> r5 = r0.f4360f
                int r7 = r5.size()
                int r7 = r7 - r1
                r5.set(r7, r6)
                r8 = r0
                r9 = r8
                r5 = r3
                r13 = r4
                r7 = r6
                r4 = r2
                r6 = r5
                r2 = r12
                r3 = r1
                r1 = r2
                goto L31a
            L305:
                java.util.List<java.lang.String> r5 = r0.f4360f
                r5.clear()
                java.util.List<java.lang.String> r5 = r0.f4360f
                r5.add(r6)
                r8 = r0
                r9 = r8
                r5 = r3
                r13 = r4
                r7 = r6
                r4 = r2
                r6 = r5
                r2 = r12
                r3 = r1
                r1 = r2
            L319:
                int r4 = r4 + r3
            L31a:
                if (r4 >= r6) goto L3e2
                java.lang.String r10 = "/\\"
                int r10 = ci.C0988c.m2701f(r1, r10, r4, r6)
                if (r10 >= r6) goto L326
                r11 = 1
                goto L327
            L326:
                r11 = 0
            L327:
                r19 = 1
                bi.w$b r14 = bi.C0803w.f4344l
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 240(0xf0, float:3.36E-43)
                java.lang.String r18 = " \"<>^`{}|/\\?#"
                r15 = r1
                r16 = r4
                r17 = r10
                java.lang.String r4 = bi.C0803w.b.m2451a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                java.lang.String r14 = "."
                boolean r14 = p214m2.C4339q.m9702c(r4, r14)
                if (r14 != 0) goto L353
                java.lang.String r14 = "%2e"
                boolean r14 = p362uh.C6463i.m13053J(r4, r14, r3)
                if (r14 == 0) goto L351
                goto L353
            L351:
                r14 = 0
                goto L354
            L353:
                r14 = 1
            L354:
                if (r14 == 0) goto L358
                goto L3dd
            L358:
                java.lang.String r14 = ".."
                boolean r14 = p214m2.C4339q.m9702c(r4, r14)
                if (r14 != 0) goto L37b
                java.lang.String r14 = "%2e."
                boolean r14 = p362uh.C6463i.m13053J(r4, r14, r3)
                if (r14 != 0) goto L37b
                java.lang.String r14 = ".%2e"
                boolean r14 = p362uh.C6463i.m13053J(r4, r14, r3)
                if (r14 != 0) goto L37b
                java.lang.String r14 = "%2e%2e"
                boolean r14 = p362uh.C6463i.m13053J(r4, r14, r3)
                if (r14 == 0) goto L379
                goto L37b
            L379:
                r14 = 0
                goto L37c
            L37b:
                r14 = 1
            L37c:
                if (r14 == 0) goto L3b0
                java.util.List<java.lang.String> r4 = r9.f4360f
                int r14 = r4.size()
                int r14 = r14 - r3
                java.lang.Object r4 = r4.remove(r14)
                java.lang.String r4 = (java.lang.String) r4
                int r4 = r4.length()
                if (r4 != 0) goto L393
                r4 = 1
                goto L394
            L393:
                r4 = 0
            L394:
                if (r4 == 0) goto L3aa
                java.util.List<java.lang.String> r4 = r9.f4360f
                boolean r4 = r4.isEmpty()
                r4 = r4 ^ r3
                if (r4 == 0) goto L3aa
                java.util.List<java.lang.String> r4 = r9.f4360f
                int r14 = r4.size()
                int r14 = r14 - r3
                r4.set(r14, r7)
                goto L3dd
            L3aa:
                java.util.List<java.lang.String> r4 = r9.f4360f
                r4.add(r7)
                goto L3dd
            L3b0:
                java.util.List<java.lang.String> r14 = r9.f4360f
                int r15 = r14.size()
                int r15 = r15 - r3
                java.lang.Object r14 = r14.get(r15)
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                int r14 = r14.length()
                if (r14 != 0) goto L3c5
                r14 = 1
                goto L3c6
            L3c5:
                r14 = 0
            L3c6:
                java.util.List<java.lang.String> r15 = r9.f4360f
                if (r14 == 0) goto L3d3
                int r14 = r15.size()
                int r14 = r14 - r3
                r15.set(r14, r4)
                goto L3d6
            L3d3:
                r15.add(r4)
            L3d6:
                if (r11 == 0) goto L3dd
                java.util.List<java.lang.String> r4 = r9.f4360f
                r4.add(r7)
            L3dd:
                r4 = r10
                if (r11 == 0) goto L31a
                goto L319
            L3e2:
                r3 = r5
                r15 = r8
                r14 = r13
                r13 = r2
            L3e6:
                if (r3 >= r14) goto L416
                char r1 = r12.charAt(r3)
                r2 = 63
                if (r1 != r2) goto L416
                r1 = 35
                int r16 = ci.C0988c.m2700e(r12, r1, r3, r14)
                bi.w$b r11 = bi.C0803w.f4344l
                int r3 = r3 + 1
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r17 = 208(0xd0, float:2.91E-43)
                java.lang.String r5 = " \"'<>#"
                r1 = r11
                r2 = r13
                r4 = r16
                r0 = r11
                r11 = r17
                java.lang.String r1 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List r0 = r0.m2455e(r1)
                r15.f4361g = r0
                r3 = r16
            L416:
                if (r3 >= r14) goto L435
                char r0 = r12.charAt(r3)
                r1 = 35
                if (r0 != r1) goto L435
                bi.w$b r1 = bi.C0803w.f4344l
                int r3 = r3 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 176(0xb0, float:2.47E-43)
                java.lang.String r5 = ""
                r2 = r13
                r4 = r14
                java.lang.String r0 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r15.f4362h = r0
            L435:
                return r15
            L436:
                java.lang.String r0 = "Invalid URL host: \""
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                r2 = r27
                java.lang.String r1 = r12.substring(r2, r13)
                p214m2.C4339q.m9705j(r1, r14)
                r0.append(r1)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L459:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r0.<init>(r1)
                throw r0
        }

        public java.lang.String toString() {
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r9.f4355a
                if (r1 == 0) goto Lf
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L11
            Lf:
                java.lang.String r1 = "//"
            L11:
                r0.append(r1)
                java.lang.String r1 = r9.f4356b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L20
                r1 = 1
                goto L21
            L20:
                r1 = 0
            L21:
                r4 = 58
                if (r1 != 0) goto L32
                java.lang.String r1 = r9.f4357c
                int r1 = r1.length()
                if (r1 <= 0) goto L2f
                r1 = 1
                goto L30
            L2f:
                r1 = 0
            L30:
                if (r1 == 0) goto L50
            L32:
                java.lang.String r1 = r9.f4356b
                r0.append(r1)
                java.lang.String r1 = r9.f4357c
                int r1 = r1.length()
                if (r1 <= 0) goto L40
                goto L41
            L40:
                r2 = 0
            L41:
                if (r2 == 0) goto L4b
                r0.append(r4)
                java.lang.String r1 = r9.f4357c
                r0.append(r1)
            L4b:
                r1 = 64
                r0.append(r1)
            L50:
                java.lang.String r1 = r9.f4358d
                r2 = 2
                if (r1 == 0) goto L73
                p214m2.C4339q.m9704i(r1)
                boolean r1 = p362uh.C6467m.m13063T(r1, r4, r3, r2)
                if (r1 == 0) goto L6e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r9.f4358d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L73
            L6e:
                java.lang.String r1 = r9.f4358d
                r0.append(r1)
            L73:
                int r1 = r9.f4359e
                r5 = -1
                if (r1 != r5) goto L7c
                java.lang.String r1 = r9.f4355a
                if (r1 == 0) goto Lb8
            L7c:
                int r1 = r9.m2448b()
                java.lang.String r6 = r9.f4355a
                if (r6 == 0) goto Lb2
                p214m2.C4339q.m9704i(r6)
                java.lang.String r7 = "scheme"
                p214m2.C4339q.m9706k(r6, r7)
                int r7 = r6.hashCode()
                r8 = 3213448(0x310888, float:4.503E-39)
                if (r7 == r8) goto La6
                r8 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r7 == r8) goto L9b
                goto Lb0
            L9b:
                java.lang.String r7 = "https"
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto Lb0
                r5 = 443(0x1bb, float:6.21E-43)
                goto Lb0
            La6:
                java.lang.String r7 = "http"
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto Lb0
                r5 = 80
            Lb0:
                if (r1 == r5) goto Lb8
            Lb2:
                r0.append(r4)
                r0.append(r1)
            Lb8:
                java.util.List<java.lang.String> r1 = r9.f4360f
                java.lang.String r4 = "$this$toPathString"
                p214m2.C4339q.m9706k(r1, r4)
                java.lang.String r4 = "out"
                p214m2.C4339q.m9706k(r0, r4)
                int r5 = r1.size()
                r6 = 0
            Lc9:
                if (r6 >= r5) goto Ldc
                r7 = 47
                r0.append(r7)
                java.lang.Object r7 = r1.get(r6)
                java.lang.String r7 = (java.lang.String) r7
                r0.append(r7)
                int r6 = r6 + 1
                goto Lc9
            Ldc:
                java.util.List<java.lang.String> r1 = r9.f4361g
                if (r1 == 0) goto L131
                r1 = 63
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r9.f4361g
                p214m2.C4339q.m9704i(r1)
                java.lang.String r5 = "$this$toQueryString"
                p214m2.C4339q.m9706k(r1, r5)
                p214m2.C4339q.m9706k(r0, r4)
                int r4 = r1.size()
                rh.c r3 = p209lh.C4304a.m9605K(r3, r4)
                rh.a r2 = p209lh.C4304a.m9603I(r3, r2)
                int r3 = r2.f22647Y
                int r4 = r2.f22648Z
                int r2 = r2.f22649a0
                if (r2 < 0) goto L109
                if (r3 > r4) goto L131
                goto L10b
            L109:
                if (r3 < r4) goto L131
            L10b:
                java.lang.Object r5 = r1.get(r3)
                java.lang.String r5 = (java.lang.String) r5
                int r6 = r3 + 1
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r3 <= 0) goto L120
                r7 = 38
                r0.append(r7)
            L120:
                r0.append(r5)
                if (r6 == 0) goto L12d
                r5 = 61
                r0.append(r5)
                r0.append(r6)
            L12d:
                if (r3 == r4) goto L131
                int r3 = r3 + r2
                goto L10b
            L131:
                java.lang.String r1 = r9.f4362h
                if (r1 == 0) goto L13f
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r9.f4362h
                r0.append(r1)
            L13f:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: bi.w$b */
    public static final class b {
        public b(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public static java.lang.String m2451a(bi.C0803w.b r16, java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, java.nio.charset.Charset r25, int r26) {
                r0 = r16
                r1 = r17
                r2 = r20
                r3 = r26
                r4 = r3 & 1
                if (r4 == 0) goto Le
                r4 = 0
                goto L10
            Le:
                r4 = r18
            L10:
                r5 = r3 & 2
                if (r5 == 0) goto L19
                int r5 = r17.length()
                goto L1b
            L19:
                r5 = r19
            L1b:
                r6 = r3 & 8
                if (r6 == 0) goto L21
                r6 = 0
                goto L23
            L21:
                r6 = r21
            L23:
                r7 = r3 & 16
                if (r7 == 0) goto L29
                r7 = 0
                goto L2b
            L29:
                r7 = r22
            L2b:
                r8 = r3 & 32
                if (r8 == 0) goto L31
                r8 = 0
                goto L33
            L31:
                r8 = r23
            L33:
                r9 = r3 & 64
                if (r9 == 0) goto L39
                r9 = 0
                goto L3b
            L39:
                r9 = r24
            L3b:
                r3 = r3 & 128(0x80, float:1.8E-43)
                if (r3 == 0) goto L41
                r3 = 0
                goto L43
            L41:
                r3 = r25
            L43:
                java.lang.String r10 = "$this$canonicalize"
                p214m2.C4339q.m9706k(r1, r10)
                r10 = r4
            L49:
                java.lang.String r11 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
                if (r10 >= r5) goto L1ae
                int r12 = r1.codePointAt(r10)
                r13 = 127(0x7f, float:1.78E-43)
                r14 = 32
                r15 = 2
                if (r12 < r14) goto L83
                if (r12 == r13) goto L83
                r13 = 128(0x80, float:1.8E-43)
                if (r12 < r13) goto L60
                if (r9 == 0) goto L83
            L60:
                char r13 = (char) r12
                r14 = 0
                boolean r13 = p362uh.C6467m.m13063T(r2, r13, r14, r15)
                if (r13 != 0) goto L83
                r13 = 37
                if (r12 != r13) goto L76
                if (r6 == 0) goto L83
                if (r7 == 0) goto L76
                boolean r13 = r0.m2454c(r1, r10, r5)
                if (r13 == 0) goto L83
            L76:
                r13 = 43
                if (r12 != r13) goto L7d
                if (r8 == 0) goto L7d
                goto L83
            L7d:
                int r11 = java.lang.Character.charCount(r12)
                int r10 = r10 + r11
                goto L49
            L83:
                oi.e r12 = new oi.e
                r12.<init>()
                r12.m11548J0(r1, r4, r10)
                r4 = 0
            L8c:
                if (r10 >= r5) goto L1a9
                int r13 = r1.codePointAt(r10)
                if (r6 == 0) goto La4
                r14 = 9
                if (r13 == r14) goto Lb4
                r14 = 10
                if (r13 == r14) goto Lb4
                r14 = 12
                if (r13 == r14) goto Lb4
                r14 = 13
                if (r13 == r14) goto Lb4
            La4:
                r14 = 43
                if (r13 != r14) goto Lb8
                if (r8 == 0) goto Lb8
                if (r6 == 0) goto Laf
                java.lang.String r14 = "+"
                goto Lb1
            Laf:
                java.lang.String r14 = "%2B"
            Lb1:
                r12.m11547I0(r14)
            Lb4:
                r18 = r8
                goto L19f
            Lb8:
                r14 = 32
                if (r13 < r14) goto Le4
                r14 = 127(0x7f, float:1.78E-43)
                if (r13 == r14) goto Le4
                r14 = 128(0x80, float:1.8E-43)
                if (r13 < r14) goto Lc6
                if (r9 == 0) goto Le4
            Lc6:
                char r14 = (char) r13
                r18 = r8
                r8 = 0
                boolean r8 = p362uh.C6467m.m13063T(r2, r14, r8, r15)
                if (r8 != 0) goto Le6
                r8 = 37
                if (r13 != r8) goto Ldf
                if (r6 == 0) goto Le6
                if (r7 == 0) goto Ldf
                boolean r8 = r0.m2454c(r1, r10, r5)
                if (r8 != 0) goto Ldf
                goto Le6
            Ldf:
                r12.m11550K0(r13)
                goto L19f
            Le4:
                r18 = r8
            Le6:
                if (r4 != 0) goto Led
                oi.e r4 = new oi.e
                r4.<init>()
            Led:
                if (r3 == 0) goto L178
                java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
                boolean r8 = p214m2.C4339q.m9702c(r3, r8)
                if (r8 == 0) goto Lf9
                goto L178
            Lf9:
                int r8 = java.lang.Character.charCount(r13)
                int r8 = r8 + r10
                r14 = 1
                if (r10 < 0) goto L103
                r15 = 1
                goto L104
            L103:
                r15 = 0
            L104:
                if (r15 == 0) goto L168
                if (r8 < r10) goto L10a
                r15 = 1
                goto L10b
            L10a:
                r15 = 0
            L10b:
                if (r15 == 0) goto L156
                int r15 = r17.length()
                if (r8 > r15) goto L114
                goto L115
            L114:
                r14 = 0
            L115:
                if (r14 == 0) goto L139
                java.nio.charset.Charset r14 = p362uh.C6455a.f25034b
                boolean r14 = p214m2.C4339q.m9702c(r3, r14)
                if (r14 == 0) goto L123
                r4.m11548J0(r1, r10, r8)
                goto L17b
            L123:
                java.lang.String r8 = r1.substring(r10, r8)
                p214m2.C4339q.m9705j(r8, r11)
                byte[] r8 = r8.getBytes(r3)
                java.lang.String r14 = "(this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r8, r14)
                int r14 = r8.length
                r15 = 0
                r4.m11536B0(r8, r15, r14)
                goto L17b
            L139:
                java.lang.String r0 = "endIndex > string.length: "
                java.lang.String r2 = " > "
                java.lang.StringBuilder r0 = androidx.appcompat.widget.C0300r0.m777a(r0, r8, r2)
                int r1 = r17.length()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L156:
                java.lang.String r0 = "endIndex < beginIndex: "
                java.lang.String r1 = " < "
                java.lang.String r0 = p243o1.C4872b.m11020a(r0, r8, r1, r10)
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L168:
                java.lang.String r0 = "beginIndex < 0: "
                java.lang.String r0 = android.support.v4.media.C0142a.m254a(r0, r10)
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L178:
                r4.m11550K0(r13)
            L17b:
                boolean r8 = r4.mo11541F()
                if (r8 != 0) goto L19f
                byte r8 = r4.readByte()
                r8 = r8 & 255(0xff, float:3.57E-43)
                r14 = 37
                r12.m11539D0(r14)
                char[] r14 = bi.C0803w.f4343k
                int r15 = r8 >> 4
                r15 = r15 & 15
                char r15 = r14[r15]
                r12.m11539D0(r15)
                r8 = r8 & 15
                char r8 = r14[r8]
                r12.m11539D0(r8)
                goto L17b
            L19f:
                int r8 = java.lang.Character.charCount(r13)
                int r10 = r10 + r8
                r15 = 2
                r8 = r18
                goto L8c
            L1a9:
                java.lang.String r0 = r12.m11565i0()
                goto L1b5
            L1ae:
                java.lang.String r0 = r1.substring(r4, r5)
                p214m2.C4339q.m9705j(r0, r11)
            L1b5:
                return r0
        }

        /* renamed from: d */
        public static java.lang.String m2452d(bi.C0803w.b r6, java.lang.String r7, int r8, int r9, boolean r10, int r11) {
                r6 = r11 & 1
                r0 = 0
                if (r6 == 0) goto L6
                r8 = 0
            L6:
                r6 = r11 & 2
                if (r6 == 0) goto Le
                int r9 = r7.length()
            Le:
                r6 = r11 & 4
                if (r6 == 0) goto L13
                r10 = 0
            L13:
                java.lang.String r6 = "$this$percentDecode"
                p214m2.C4339q.m9706k(r7, r6)
                r6 = r8
            L19:
                if (r6 >= r9) goto L7e
                char r11 = r7.charAt(r6)
                r0 = 43
                r1 = 37
                if (r11 == r1) goto L2d
                if (r11 != r0) goto L2a
                if (r10 == 0) goto L2a
                goto L2d
            L2a:
                int r6 = r6 + 1
                goto L19
            L2d:
                oi.e r11 = new oi.e
                r11.<init>()
                r11.m11548J0(r7, r8, r6)
            L35:
                if (r6 >= r9) goto L79
                int r8 = r7.codePointAt(r6)
                if (r8 != r1) goto L64
                int r2 = r6 + 2
                if (r2 >= r9) goto L64
                int r3 = r6 + 1
                char r3 = r7.charAt(r3)
                int r3 = ci.C0988c.m2711p(r3)
                char r4 = r7.charAt(r2)
                int r4 = ci.C0988c.m2711p(r4)
                r5 = -1
                if (r3 == r5) goto L70
                if (r4 == r5) goto L70
                int r6 = r3 << 4
                int r6 = r6 + r4
                r11.m11539D0(r6)
                int r6 = java.lang.Character.charCount(r8)
                int r6 = r6 + r2
                goto L35
            L64:
                if (r8 != r0) goto L70
                if (r10 == 0) goto L70
                r8 = 32
                r11.m11539D0(r8)
                int r6 = r6 + 1
                goto L35
            L70:
                r11.m11550K0(r8)
                int r8 = java.lang.Character.charCount(r8)
                int r6 = r6 + r8
                goto L35
            L79:
                java.lang.String r6 = r11.m11565i0()
                goto L87
            L7e:
                java.lang.String r6 = r7.substring(r8, r9)
                java.lang.String r7 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
                p214m2.C4339q.m9705j(r6, r7)
            L87:
                return r6
        }

        /* renamed from: b */
        public final int m2453b(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "scheme"
                p214m2.C4339q.m9706k(r3, r0)
                int r0 = r3.hashCode()
                r1 = 3213448(0x310888, float:4.503E-39)
                if (r0 == r1) goto L1f
                r1 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r0 == r1) goto L14
                goto L2a
            L14:
                java.lang.String r0 = "https"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L2a
                r3 = 443(0x1bb, float:6.21E-43)
                goto L2b
            L1f:
                java.lang.String r0 = "http"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L2a
                r3 = 80
                goto L2b
            L2a:
                r3 = -1
            L2b:
                return r3
        }

        /* renamed from: c */
        public final boolean m2454c(java.lang.String r4, int r5, int r6) {
                r3 = this;
                int r0 = r5 + 2
                r1 = 1
                if (r0 >= r6) goto L24
                char r6 = r4.charAt(r5)
                r2 = 37
                if (r6 != r2) goto L24
                int r5 = r5 + r1
                char r5 = r4.charAt(r5)
                int r5 = ci.C0988c.m2711p(r5)
                r6 = -1
                if (r5 == r6) goto L24
                char r4 = r4.charAt(r0)
                int r4 = ci.C0988c.m2711p(r4)
                if (r4 == r6) goto L24
                goto L25
            L24:
                r1 = 0
            L25:
                return r1
        }

        /* renamed from: e */
        public final java.util.List<java.lang.String> m2455e(java.lang.String r8) {
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                r2 = 0
            L7:
                int r3 = r8.length()
                if (r2 > r3) goto L4d
                r3 = 38
                r4 = 4
                int r3 = p362uh.C6467m.m13069Z(r8, r3, r2, r1, r4)
                r5 = -1
                if (r3 != r5) goto L1b
                int r3 = r8.length()
            L1b:
                r6 = 61
                int r4 = p362uh.C6467m.m13069Z(r8, r6, r2, r1, r4)
                java.lang.String r6 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
                if (r4 == r5) goto L3c
                if (r4 <= r3) goto L28
                goto L3c
            L28:
                java.lang.String r2 = r8.substring(r2, r4)
                p214m2.C4339q.m9705j(r2, r6)
                r0.add(r2)
                int r4 = r4 + 1
                java.lang.String r2 = r8.substring(r4, r3)
                p214m2.C4339q.m9705j(r2, r6)
                goto L47
            L3c:
                java.lang.String r2 = r8.substring(r2, r3)
                p214m2.C4339q.m9705j(r2, r6)
                r0.add(r2)
                r2 = 0
            L47:
                r0.add(r2)
                int r2 = r3 + 1
                goto L7
            L4d:
                return r0
        }
    }

    static {
            bi.w$b r0 = new bi.w$b
            r1 = 0
            r0.<init>(r1)
            bi.C0803w.f4344l = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            bi.C0803w.f4343k = r0
            return
    }

    public C0803w(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.util.List<java.lang.String> r6, java.util.List<java.lang.String> r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.f4346b = r1
            r0.f4347c = r2
            r0.f4348d = r3
            r0.f4349e = r4
            r0.f4350f = r5
            r0.f4351g = r6
            r0.f4352h = r7
            r0.f4353i = r8
            r0.f4354j = r9
            java.lang.String r2 = "https"
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            r0.f4345a = r1
            return
    }

    /* renamed from: a */
    public final java.lang.String m2439a() {
            r6 = this;
            java.lang.String r0 = r6.f4348d
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L12
            java.lang.String r0 = ""
            return r0
        L12:
            java.lang.String r0 = r6.f4354j
            r3 = 58
            java.lang.String r4 = r6.f4346b
            int r4 = r4.length()
            int r4 = r4 + 3
            r5 = 4
            int r0 = p362uh.C6467m.m13069Z(r0, r3, r4, r2, r5)
            int r0 = r0 + r1
            java.lang.String r1 = r6.f4354j
            r3 = 64
            r4 = 6
            int r1 = p362uh.C6467m.m13069Z(r1, r3, r2, r2, r4)
            java.lang.String r2 = r6.f4354j
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    /* renamed from: b */
    public final java.lang.String m2440b() {
            r5 = this;
            java.lang.String r0 = r5.f4354j
            java.lang.String r1 = r5.f4346b
            int r1 = r1.length()
            int r1 = r1 + 3
            r2 = 47
            r3 = 0
            r4 = 4
            int r0 = p362uh.C6467m.m13069Z(r0, r2, r1, r3, r4)
            java.lang.String r1 = r5.f4354j
            int r2 = r1.length()
            java.lang.String r3 = "?#"
            int r1 = ci.C0988c.m2701f(r1, r3, r0, r2)
            java.lang.String r2 = r5.f4354j
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    /* renamed from: c */
    public final java.util.List<java.lang.String> m2441c() {
            r7 = this;
            java.lang.String r0 = r7.f4354j
            java.lang.String r1 = r7.f4346b
            int r1 = r1.length()
            int r1 = r1 + 3
            r2 = 47
            r3 = 0
            r4 = 4
            int r0 = p362uh.C6467m.m13069Z(r0, r2, r1, r3, r4)
            java.lang.String r1 = r7.f4354j
            int r3 = r1.length()
            java.lang.String r4 = "?#"
            int r1 = ci.C0988c.m2701f(r1, r4, r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L23:
            if (r0 >= r1) goto L42
            int r0 = r0 + 1
            java.lang.String r4 = r7.f4354j
            int r4 = ci.C0988c.m2700e(r4, r2, r0, r1)
            java.lang.String r5 = r7.f4354j
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r5, r6)
            java.lang.String r0 = r5.substring(r0, r4)
            java.lang.String r5 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r0, r5)
            r3.add(r0)
            r0 = r4
            goto L23
        L42:
            return r3
    }

    /* renamed from: d */
    public final java.lang.String m2442d() {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.f4352h
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r4.f4354j
            r1 = 63
            r2 = 6
            r3 = 0
            int r0 = p362uh.C6467m.m13069Z(r0, r1, r3, r3, r2)
            int r0 = r0 + 1
            java.lang.String r1 = r4.f4354j
            r2 = 35
            int r3 = r1.length()
            int r1 = ci.C0988c.m2700e(r1, r2, r0, r3)
            java.lang.String r2 = r4.f4354j
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    /* renamed from: e */
    public final java.lang.String m2443e() {
            r4 = this;
            java.lang.String r0 = r4.f4347c
            int r0 = r0.length()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L10
            java.lang.String r0 = ""
            return r0
        L10:
            java.lang.String r0 = r4.f4346b
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r1 = r4.f4354j
            int r2 = r1.length()
            java.lang.String r3 = ":@"
            int r1 = ci.C0988c.m2701f(r1, r3, r0, r2)
            java.lang.String r2 = r4.f4354j
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof bi.C0803w
            if (r0 == 0) goto L12
            bi.w r2 = (bi.C0803w) r2
            java.lang.String r2 = r2.f4354j
            java.lang.String r0 = r1.f4354j
            boolean r2 = p214m2.C4339q.m9702c(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    /* renamed from: f */
    public final bi.C0803w.a m2444f(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "link"
            p214m2.C4339q.m9706k(r2, r0)
            bi.w$a r0 = new bi.w$a     // Catch: java.lang.IllegalArgumentException -> Le
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> Le
            r0.m2450d(r1, r2)     // Catch: java.lang.IllegalArgumentException -> Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* renamed from: g */
    public final java.lang.String m2445g() {
            r14 = this;
            java.lang.String r0 = "/..."
            bi.w$a r0 = r14.m2444f(r0)
            p214m2.C4339q.m9704i(r0)
            java.lang.String r2 = ""
            java.lang.String r1 = "username"
            p214m2.C4339q.m9706k(r2, r1)
            bi.w$b r12 = bi.C0803w.f4344l
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 251(0xfb, float:3.52E-43)
            java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
            r1 = r12
            java.lang.String r1 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f4356b = r1
            java.lang.String r4 = ""
            java.lang.String r1 = "password"
            p214m2.C4339q.m9706k(r4, r1)
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r1 = 0
            r13 = 251(0xfb, float:3.52E-43)
            java.lang.String r7 = " \"':;<=>@[]^`{}|/\\?#"
            r3 = r12
            r12 = r1
            java.lang.String r1 = bi.C0803w.b.m2451a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.f4357c = r1
            bi.w r0 = r0.m2447a()
            java.lang.String r0 = r0.f4354j
            return r0
    }

    /* renamed from: h */
    public final java.net.URI m2446h() {
            r25 = this;
            r1 = r25
            bi.w$a r0 = new bi.w$a
            r0.<init>()
            java.lang.String r2 = r1.f4346b
            r0.f4355a = r2
            java.lang.String r2 = r25.m2443e()
            java.lang.String r3 = "<set-?>"
            p214m2.C4339q.m9706k(r2, r3)
            r0.f4356b = r2
            java.lang.String r2 = r25.m2439a()
            p214m2.C4339q.m9706k(r2, r3)
            r0.f4357c = r2
            java.lang.String r2 = r1.f4349e
            r0.f4358d = r2
            int r2 = r1.f4350f
            bi.w$b r3 = bi.C0803w.f4344l
            java.lang.String r4 = r1.f4346b
            int r3 = r3.m2453b(r4)
            if (r2 == r3) goto L32
            int r2 = r1.f4350f
            goto L33
        L32:
            r2 = -1
        L33:
            r0.f4359e = r2
            java.util.List<java.lang.String> r2 = r0.f4360f
            r2.clear()
            java.util.List<java.lang.String> r2 = r0.f4360f
            java.util.List r3 = r25.m2441c()
            r2.addAll(r3)
            java.lang.String r2 = r25.m2442d()
            r0.m2449c(r2)
            java.lang.String r2 = r1.f4353i
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L52
            r2 = r3
            goto L6d
        L52:
            java.lang.String r2 = r1.f4354j
            r5 = 35
            r6 = 6
            int r2 = p362uh.C6467m.m13069Z(r2, r5, r4, r4, r6)
            int r2 = r2 + 1
            java.lang.String r5 = r1.f4354j
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r5, r6)
            java.lang.String r2 = r5.substring(r2)
            java.lang.String r5 = "(this as java.lang.String).substring(startIndex)"
            p214m2.C4339q.m9705j(r2, r5)
        L6d:
            r0.f4362h = r2
            java.lang.String r2 = r0.f4358d
            java.lang.String r5 = "nativePattern.matcher(in\u2026).replaceAll(replacement)"
            java.lang.String r6 = "replacement"
            java.lang.String r7 = "input"
            java.lang.String r8 = ""
            java.lang.String r9 = "nativePattern"
            java.lang.String r10 = "compile(pattern)"
            java.lang.String r11 = "pattern"
            if (r2 == 0) goto La2
            java.lang.String r12 = "[\"<>^`{|}]"
            p214m2.C4339q.m9706k(r12, r11)
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12)
            p214m2.C4339q.m9705j(r12, r10)
            p214m2.C4339q.m9706k(r12, r9)
            p214m2.C4339q.m9706k(r2, r7)
            p214m2.C4339q.m9706k(r8, r6)
            java.util.regex.Matcher r2 = r12.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r8)
            p214m2.C4339q.m9705j(r2, r5)
            goto La3
        La2:
            r2 = r3
        La3:
            r0.f4358d = r2
            java.util.List<java.lang.String> r2 = r0.f4360f
            int r2 = r2.size()
            r12 = 0
        Lac:
            if (r12 >= r2) goto Ld4
            java.util.List<java.lang.String> r13 = r0.f4360f
            bi.w$b r14 = bi.C0803w.f4344l
            java.lang.Object r15 = r13.get(r12)
            java.lang.String r15 = (java.lang.String) r15
            r16 = 0
            r17 = 0
            r19 = 1
            r20 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 227(0xe3, float:3.18E-43)
            java.lang.String r18 = "[]"
            java.lang.String r14 = bi.C0803w.b.m2451a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r13.set(r12, r14)
            int r12 = r12 + 1
            goto Lac
        Ld4:
            java.util.List<java.lang.String> r2 = r0.f4361g
            if (r2 == 0) goto L107
            int r12 = r2.size()
        Ldc:
            if (r4 >= r12) goto L107
            java.lang.Object r13 = r2.get(r4)
            r15 = r13
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L100
            bi.w$b r14 = bi.C0803w.f4344l
            r16 = 0
            r17 = 0
            r19 = 1
            r20 = 1
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 195(0xc3, float:2.73E-43)
            java.lang.String r18 = "\\^`{|}"
            java.lang.String r13 = bi.C0803w.b.m2451a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L101
        L100:
            r13 = r3
        L101:
            r2.set(r4, r13)
            int r4 = r4 + 1
            goto Ldc
        L107:
            java.lang.String r14 = r0.f4362h
            if (r14 == 0) goto L122
            bi.w$b r13 = bi.C0803w.f4344l
            r15 = 0
            r16 = 0
            r18 = 1
            r19 = 1
            r20 = 0
            r21 = 1
            r22 = 0
            r23 = 163(0xa3, float:2.28E-43)
            java.lang.String r17 = " \"#<>\\^`{|}"
            java.lang.String r3 = bi.C0803w.b.m2451a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L122:
            r0.f4362h = r3
            java.lang.String r2 = r0.toString()
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> L12e
            r0.<init>(r2)     // Catch: java.net.URISyntaxException -> L12e
            goto L158
        L12e:
            r0 = move-exception
            java.lang.String r3 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"
            p214m2.C4339q.m9706k(r3, r11)     // Catch: java.lang.Exception -> L159
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Exception -> L159
            p214m2.C4339q.m9705j(r3, r10)     // Catch: java.lang.Exception -> L159
            p214m2.C4339q.m9706k(r3, r9)     // Catch: java.lang.Exception -> L159
            p214m2.C4339q.m9706k(r2, r7)     // Catch: java.lang.Exception -> L159
            p214m2.C4339q.m9706k(r8, r6)     // Catch: java.lang.Exception -> L159
            java.util.regex.Matcher r2 = r3.matcher(r2)     // Catch: java.lang.Exception -> L159
            java.lang.String r2 = r2.replaceAll(r8)     // Catch: java.lang.Exception -> L159
            p214m2.C4339q.m9705j(r2, r5)     // Catch: java.lang.Exception -> L159
            java.net.URI r0 = java.net.URI.create(r2)     // Catch: java.lang.Exception -> L159
            java.lang.String r2 = "try {\n        val stripp\u2026e) // Unexpected!\n      }"
            p214m2.C4339q.m9705j(r0, r2)
        L158:
            return r0
        L159:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f4354j
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f4354j
            return r0
    }
}

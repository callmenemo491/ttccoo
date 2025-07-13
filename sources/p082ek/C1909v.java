package p082ek;

/* renamed from: ek.v */
/* loaded from: classes.dex */
public final class C1909v {

    /* renamed from: l */
    public static final char[] f8254l = null;

    /* renamed from: m */
    public static final java.util.regex.Pattern f8255m = null;

    /* renamed from: a */
    public final java.lang.String f8256a;

    /* renamed from: b */
    public final bi.C0803w f8257b;

    /* renamed from: c */
    public java.lang.String f8258c;

    /* renamed from: d */
    public bi.C0803w.a f8259d;

    /* renamed from: e */
    public final bi.C0775c0.a f8260e;

    /* renamed from: f */
    public final bi.C0802v.a f8261f;

    /* renamed from: g */
    public bi.C0805y f8262g;

    /* renamed from: h */
    public final boolean f8263h;

    /* renamed from: i */
    public bi.C0806z.a f8264i;

    /* renamed from: j */
    public bi.C0800t.a f8265j;

    /* renamed from: k */
    public bi.AbstractC0781f0 f8266k;

    /* renamed from: ek.v$a */
    public static class a extends bi.AbstractC0781f0 {

        /* renamed from: b */
        public final bi.AbstractC0781f0 f8267b;

        /* renamed from: c */
        public final bi.C0805y f8268c;

        public a(bi.AbstractC0781f0 r1, bi.C0805y r2) {
                r0 = this;
                r0.<init>()
                r0.f8267b = r1
                r0.f8268c = r2
                return
        }

        @Override // bi.AbstractC0781f0
        /* renamed from: a */
        public long mo2371a() {
                r2 = this;
                bi.f0 r0 = r2.f8267b
                long r0 = r0.mo2371a()
                return r0
        }

        @Override // bi.AbstractC0781f0
        /* renamed from: b */
        public bi.C0805y mo2372b() {
                r1 = this;
                bi.y r0 = r1.f8268c
                return r0
        }

        @Override // bi.AbstractC0781f0
        /* renamed from: c */
        public void mo2373c(p260oi.InterfaceC5285g r2) {
                r1 = this;
                bi.f0 r0 = r1.f8267b
                r0.mo2373c(r2)
                return
        }
    }

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            p082ek.C1909v.f8254l = r0
            java.lang.String r0 = "(.*/)?(\\.|%2e|%2E){1,2}(/.*)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p082ek.C1909v.f8255m = r0
            return
    }

    public C1909v(java.lang.String r1, bi.C0803w r2, java.lang.String r3, bi.C0802v r4, bi.C0805y r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            r0.<init>()
            r0.f8256a = r1
            r0.f8257b = r2
            r0.f8258c = r3
            bi.c0$a r1 = new bi.c0$a
            r1.<init>()
            r0.f8260e = r1
            r0.f8262g = r5
            r0.f8263h = r6
            if (r4 == 0) goto L1b
            bi.v$a r1 = r4.m2430h()
            goto L20
        L1b:
            bi.v$a r1 = new bi.v$a
            r1.<init>()
        L20:
            r0.f8261f = r1
            if (r7 == 0) goto L2c
            bi.t$a r1 = new bi.t$a
            r1.<init>()
            r0.f8265j = r1
            goto L67
        L2c:
            if (r8 == 0) goto L67
            bi.z$a r1 = new bi.z$a
            r1.<init>()
            r0.f8264i = r1
            bi.y r2 = bi.C0806z.f4370g
            java.util.Objects.requireNonNull(r1)
            java.lang.String r3 = "type"
            p214m2.C4339q.m9706k(r2, r3)
            java.lang.String r3 = r2.f4367b
            java.lang.String r4 = "multipart"
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 == 0) goto L4c
            r1.f4379b = r2
            goto L67
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "multipart != "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L67:
            return
    }

    /* renamed from: a */
    public void m4687a(java.lang.String r23, java.lang.String r24, boolean r25) {
            r22 = this;
            r1 = r23
            r11 = r22
            bi.t$a r12 = r11.f8265j
            java.util.Objects.requireNonNull(r12)
            java.lang.String r0 = "name"
            if (r25 == 0) goto L55
            p214m2.C4339q.m9706k(r1, r0)
            java.util.List<java.lang.String> r13 = r12.f4331a
            bi.w$b r14 = bi.C0803w.f4344l
            java.nio.charset.Charset r9 = r12.f4333c
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 83
            r2 = 0
            r3 = 0
            r5 = 1
            r6 = 0
            r7 = 1
            r8 = 0
            r10 = 83
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#&!$(),~"
            r0 = r14
            r1 = r23
            java.lang.String r0 = bi.C0803w.b.m2451a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.add(r0)
            java.util.List<java.lang.String> r13 = r12.f4332b
            java.nio.charset.Charset r9 = r12.f4333c
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#&!$(),~"
            r0 = r14
            r1 = r24
            r2 = r15
            r3 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r21
            java.lang.String r0 = bi.C0803w.b.m2451a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.add(r0)
            goto L9c
        L55:
            p214m2.C4339q.m9706k(r1, r0)
            java.util.List<java.lang.String> r13 = r12.f4331a
            bi.w$b r14 = bi.C0803w.f4344l
            java.nio.charset.Charset r9 = r12.f4333c
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 91
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r10 = 91
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#&!$(),~"
            r0 = r14
            r1 = r23
            java.lang.String r0 = bi.C0803w.b.m2451a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.add(r0)
            java.util.List<java.lang.String> r13 = r12.f4332b
            java.nio.charset.Charset r9 = r12.f4333c
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#&!$(),~"
            r0 = r14
            r1 = r24
            r2 = r15
            r3 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r21
            java.lang.String r0 = bi.C0803w.b.m2451a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.add(r0)
        L9c:
            return
    }

    /* renamed from: b */
    public void m4688b(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "Content-Type"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L1c
            bi.y r3 = bi.C0805y.m2457b(r4)     // Catch: java.lang.IllegalArgumentException -> Lf
            r2.f8262g = r3     // Catch: java.lang.IllegalArgumentException -> Lf
            goto L21
        Lf:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Malformed content type: "
            java.lang.String r4 = p064e.C1493g.m4049a(r1, r4)
            r0.<init>(r4, r3)
            throw r0
        L1c:
            bi.v$a r0 = r2.f8261f
            r0.m2432a(r3, r4)
        L21:
            return
    }

    /* renamed from: c */
    public void m4689c(bi.C0802v r6, bi.AbstractC0781f0 r7) {
            r5 = this;
            bi.z$a r0 = r5.f8264i
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "body"
            p214m2.C4339q.m9706k(r7, r1)
            p214m2.C4339q.m9706k(r7, r1)
            r1 = 0
            if (r6 == 0) goto L17
            java.lang.String r2 = "Content-Type"
            java.lang.String r2 = r6.m2428a(r2)
            goto L18
        L17:
            r2 = r1
        L18:
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r2 == 0) goto L4d
            if (r6 == 0) goto L2a
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r6.m2428a(r2)
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r2 != 0) goto L2e
            goto L2f
        L2e:
            r3 = 0
        L2f:
            if (r3 == 0) goto L41
            bi.z$b r2 = new bi.z$b
            r2.<init>(r6, r7, r1)
            java.lang.String r6 = "part"
            p214m2.C4339q.m9706k(r2, r6)
            java.util.List<bi.z$b> r6 = r0.f4380c
            r6.add(r2)
            return
        L41:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Unexpected header: Content-Length"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L4d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Unexpected header: Content-Type"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    /* renamed from: d */
    public void m4690d(java.lang.String r17, java.lang.String r18, boolean r19) {
            r16 = this;
            r0 = r16
            r2 = r17
            java.lang.String r1 = r0.f8258c
            r12 = 0
            if (r1 == 0) goto L35
            bi.w r3 = r0.f8257b
            bi.w$a r1 = r3.m2444f(r1)
            r0.f8259d = r1
            if (r1 == 0) goto L16
            r0.f8258c = r12
            goto L35
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Malformed URL. Base: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            bi.w r3 = r0.f8257b
            r2.append(r3)
            java.lang.String r3 = ", Relative: "
            r2.append(r3)
            java.lang.String r3 = r0.f8258c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L35:
            bi.w$a r13 = r0.f8259d
            java.util.Objects.requireNonNull(r13)
            if (r19 == 0) goto L85
            java.lang.String r1 = "encodedName"
            p214m2.C4339q.m9706k(r2, r1)
            java.util.List<java.lang.String> r1 = r13.f4361g
            if (r1 != 0) goto L4c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13.f4361g = r1
        L4c:
            java.util.List<java.lang.String> r14 = r13.f4361g
            p214m2.C4339q.m9704i(r14)
            bi.w$b r15 = bi.C0803w.f4344l
            r3 = 0
            r4 = 0
            r6 = 1
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 211(0xd3, float:2.96E-43)
            java.lang.String r5 = " \"'<>#&="
            r1 = r15
            r2 = r17
            java.lang.String r1 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r14.add(r1)
            java.util.List<java.lang.String> r13 = r13.f4361g
            p214m2.C4339q.m9704i(r13)
            if (r18 == 0) goto L81
            r3 = 0
            r4 = 0
            r6 = 1
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 211(0xd3, float:2.96E-43)
            java.lang.String r5 = " \"'<>#&="
            r1 = r15
            r2 = r18
            java.lang.String r12 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L81:
            r13.add(r12)
            goto Lcd
        L85:
            java.lang.String r1 = "name"
            p214m2.C4339q.m9706k(r2, r1)
            java.util.List<java.lang.String> r1 = r13.f4361g
            if (r1 != 0) goto L95
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13.f4361g = r1
        L95:
            java.util.List<java.lang.String> r14 = r13.f4361g
            p214m2.C4339q.m9704i(r14)
            bi.w$b r15 = bi.C0803w.f4344l
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 219(0xdb, float:3.07E-43)
            java.lang.String r5 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
            r1 = r15
            r2 = r17
            java.lang.String r1 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r14.add(r1)
            java.util.List<java.lang.String> r13 = r13.f4361g
            p214m2.C4339q.m9704i(r13)
            if (r18 == 0) goto Lca
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 219(0xdb, float:3.07E-43)
            java.lang.String r5 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
            r1 = r15
            r2 = r18
            java.lang.String r12 = bi.C0803w.b.m2451a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        Lca:
            r13.add(r12)
        Lcd:
            return
    }
}

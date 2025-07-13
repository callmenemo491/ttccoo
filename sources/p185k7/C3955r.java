package p185k7;

/* renamed from: k7.r */
/* loaded from: classes.dex */
public final class C3955r implements java.lang.Iterable<p185k7.InterfaceC3916o>, p185k7.InterfaceC3916o {

    /* renamed from: Y */
    public final java.lang.String f16850Y;

    public C3955r(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.f16850Y = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "StringValue cannot be null."
            r2.<init>(r0)
            throw r2
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: e */
    public final java.lang.Boolean mo8353e() {
            r1 = this;
            java.lang.String r0 = r1.f16850Y
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p185k7.C3955r
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            k7.r r2 = (p185k7.C3955r) r2
            java.lang.String r0 = r1.f16850Y
            java.lang.String r2 = r2.f16850Y
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: f */
    public final p185k7.InterfaceC3916o mo8354f() {
            r2 = this;
            k7.r r0 = new k7.r
            java.lang.String r1 = r2.f16850Y
            r0.<init>(r1)
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: g */
    public final java.lang.Double mo8355g() {
            r2 = this;
            java.lang.String r0 = r2.f16850Y
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            r0 = 0
        La:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        Lf:
            java.lang.String r0 = r2.f16850Y     // Catch: java.lang.NumberFormatException -> L16
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L16
            return r0
        L16:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto La
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f16850Y
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: i */
    public final java.lang.String mo8357i() {
            r1 = this;
            java.lang.String r0 = r1.f16850Y
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<p185k7.InterfaceC3916o> iterator() {
            r2 = this;
            k7.q r0 = new k7.q
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: n */
    public final java.util.Iterator<p185k7.InterfaceC3916o> mo8360n() {
            r2 = this;
            k7.q r0 = new k7.q
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: p */
    public final p185k7.InterfaceC3916o mo8361p(java.lang.String r19, p365v.C6476c r20, java.util.List<p185k7.InterfaceC3916o> r21) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "indexOf"
            java.lang.String r7 = "replace"
            java.lang.String r8 = "substring"
            java.lang.String r9 = "split"
            java.lang.String r10 = "slice"
            java.lang.String r11 = "match"
            java.lang.String r12 = "lastIndexOf"
            java.lang.String r13 = "toLocaleUpperCase"
            java.lang.String r14 = "search"
            java.lang.String r15 = "toLowerCase"
            java.lang.String r2 = "toLocaleLowerCase"
            java.lang.String r0 = "toString"
            java.lang.String r3 = "hasOwnProperty"
            r16 = r4
            java.lang.String r4 = "toUpperCase"
            if (r5 != 0) goto La5
            java.lang.String r5 = "concat"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto La5
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto La5
            java.lang.String r5 = "trim"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L93
            goto La5
        L93:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%s is not a String function"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        La5:
            int r5 = r19.hashCode()
            switch(r5) {
                case -1789698943: goto L147;
                case -1776922004: goto L13c;
                case -1464939364: goto L131;
                case -1361633751: goto L127;
                case -1354795244: goto L11b;
                case -1137582698: goto L112;
                case -906336856: goto L10a;
                case -726908483: goto L101;
                case -467511597: goto Lf9;
                case -399551817: goto Lf0;
                case 3568674: goto Le5;
                case 103668165: goto Ldd;
                case 109526418: goto Ld4;
                case 109648666: goto Lcb;
                case 530542161: goto Lc2;
                case 1094496948: goto Lb9;
                case 1943291465: goto Lb0;
                default: goto Lac;
            }
        Lac:
            r5 = r16
            goto L153
        Lb0:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto Lac
            r1 = 3
            goto L124
        Lb9:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto Lac
            r1 = 6
            goto L124
        Lc2:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto Lac
            r1 = 10
            goto L124
        Lcb:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto Lac
            r1 = 9
            goto L124
        Ld4:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto Lac
            r1 = 8
            goto L124
        Ldd:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto Lac
            r1 = 5
            goto L124
        Le5:
            java.lang.String r5 = "trim"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Lac
            r1 = 16
            goto L124
        Lf0:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lac
            r1 = 15
            goto L124
        Lf9:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto Lac
            r1 = 4
            goto L124
        L101:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto Lac
            r1 = 11
            goto L124
        L10a:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto Lac
            r1 = 7
            goto L124
        L112:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto Lac
            r1 = 13
            goto L124
        L11b:
            java.lang.String r5 = "concat"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Lac
            r1 = 1
        L124:
            r5 = r16
            goto L150
        L127:
            r5 = r16
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L153
            r1 = 0
            goto L150
        L131:
            r5 = r16
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L153
            r1 = 12
            goto L150
        L13c:
            r5 = r16
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L153
            r1 = 14
            goto L150
        L147:
            r5 = r16
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L153
            r1 = 2
        L150:
            r16 = r0
            goto L155
        L153:
            r1 = -1
            goto L150
        L155:
            java.lang.String r0 = ""
            java.lang.String r17 = "undefined"
            switch(r1) {
                case 0: goto L616;
                case 1: goto L5dc;
                case 2: goto L596;
                case 3: goto L542;
                case 4: goto L4e3;
                case 5: goto L495;
                case 6: goto L3f4;
                case 7: goto L3a8;
                case 8: goto L311;
                case 9: goto L25c;
                case 10: goto L1df;
                case 11: goto L1ca;
                case 12: goto L1b5;
                case 13: goto L19e;
                case 14: goto L192;
                case 15: goto L17b;
                case 16: goto L166;
                default: goto L15c;
            }
        L15c:
            r3 = r18
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L166:
            r0 = 0
            r1 = r21
            p124h7.C2939x3.m7264N(r4, r0, r1)
            r3 = r18
            java.lang.String r0 = r3.f16850Y
            k7.r r1 = new k7.r
            java.lang.String r0 = r0.trim()
            r1.<init>(r0)
            goto L65c
        L17b:
            r3 = r18
            r1 = r21
            r0 = 0
            p124h7.C2939x3.m7264N(r4, r0, r1)
            java.lang.String r0 = r3.f16850Y
            k7.r r1 = new k7.r
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toUpperCase(r2)
            r1.<init>(r0)
            goto L65c
        L192:
            r3 = r18
            r1 = r21
            r0 = r16
            r2 = 0
            p124h7.C2939x3.m7264N(r0, r2, r1)
            goto L614
        L19e:
            r3 = r18
            r1 = r21
            r0 = 0
            p124h7.C2939x3.m7264N(r15, r0, r1)
            java.lang.String r0 = r3.f16850Y
            k7.r r1 = new k7.r
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r2)
            r1.<init>(r0)
            goto L65c
        L1b5:
            r3 = r18
            r1 = r21
            r0 = 0
            p124h7.C2939x3.m7264N(r2, r0, r1)
            java.lang.String r0 = r3.f16850Y
            k7.r r1 = new k7.r
            java.lang.String r0 = r0.toLowerCase()
            r1.<init>(r0)
            goto L65c
        L1ca:
            r3 = r18
            r1 = r21
            r0 = 0
            p124h7.C2939x3.m7264N(r13, r0, r1)
            java.lang.String r0 = r3.f16850Y
            k7.r r1 = new k7.r
            java.lang.String r0 = r0.toUpperCase()
            r1.<init>(r0)
            goto L65c
        L1df:
            r3 = r18
            r1 = r21
            r0 = 2
            r2 = 0
            p124h7.C2939x3.m7268R(r8, r0, r1)
            java.lang.String r0 = r3.f16850Y
            int r4 = r21.size()
            if (r4 <= 0) goto L20a
            java.lang.Object r2 = r1.get(r2)
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            r4 = r20
            k7.o r2 = r4.m13117i(r2)
            java.lang.Double r2 = r2.mo8355g()
            double r5 = r2.doubleValue()
            double r5 = p124h7.C2939x3.m7290p(r5)
            int r2 = (int) r5
            goto L20d
        L20a:
            r4 = r20
            r2 = 0
        L20d:
            int r5 = r21.size()
            r6 = 1
            if (r5 <= r6) goto L22c
            java.lang.Object r1 = r1.get(r6)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r4.m13117i(r1)
            java.lang.Double r1 = r1.mo8355g()
            double r4 = r1.doubleValue()
            double r4 = p124h7.C2939x3.m7290p(r4)
            int r1 = (int) r4
            goto L230
        L22c:
            int r1 = r0.length()
        L230:
            r4 = 0
            int r2 = java.lang.Math.max(r2, r4)
            int r5 = r0.length()
            int r2 = java.lang.Math.min(r2, r5)
            int r1 = java.lang.Math.max(r1, r4)
            int r4 = r0.length()
            int r1 = java.lang.Math.min(r1, r4)
            k7.r r4 = new k7.r
            int r5 = java.lang.Math.min(r2, r1)
            int r1 = java.lang.Math.max(r2, r1)
            java.lang.String r0 = r0.substring(r5, r1)
            r4.<init>(r0)
            goto L53f
        L25c:
            r3 = r18
            r4 = r20
            r1 = r21
            r2 = 2
            p124h7.C2939x3.m7268R(r9, r2, r1)
            java.lang.String r2 = r3.f16850Y
            int r5 = r2.length()
            if (r5 != 0) goto L27f
            k7.d r1 = new k7.d
            r0 = 1
            k7.o[] r0 = new p185k7.InterfaceC3916o[r0]
            r2 = 0
            r0[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.<init>(r0)
            goto L65c
        L27f:
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r21.size()
            if (r7 != 0) goto L290
            r6.add(r3)
            goto L30a
        L290:
            java.lang.Object r5 = r1.get(r5)
            k7.o r5 = (p185k7.InterfaceC3916o) r5
            k7.o r5 = r4.m13117i(r5)
            java.lang.String r5 = r5.mo8357i()
            int r7 = r21.size()
            r8 = 1
            if (r7 <= r8) goto L2bc
            java.lang.Object r1 = r1.get(r8)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r4.m13117i(r1)
            java.lang.Double r1 = r1.mo8355g()
            double r7 = r1.doubleValue()
            long r7 = p124h7.C2939x3.m7254D(r7)
            goto L2bf
        L2bc:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L2bf:
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L2cc
            k7.d r1 = new k7.d
            r1.<init>()
            goto L65c
        L2cc:
            java.lang.String r1 = java.util.regex.Pattern.quote(r5)
            int r4 = (int) r7
            int r4 = r4 + 1
            java.lang.String[] r1 = r2.split(r1, r4)
            int r2 = r1.length
            boolean r4 = r5.equals(r0)
            if (r4 == 0) goto L2f2
            if (r2 <= 0) goto L2f2
            r4 = 0
            r4 = r1[r4]
            boolean r4 = r4.equals(r0)
            int r5 = r2 + (-1)
            r9 = r1[r5]
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L2f4
            goto L2f3
        L2f2:
            r4 = 0
        L2f3:
            r5 = r2
        L2f4:
            long r9 = (long) r2
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L2fb
            int r5 = r5 + (-1)
        L2fb:
            if (r4 >= r5) goto L30a
            k7.r r0 = new k7.r
            r2 = r1[r4]
            r0.<init>(r2)
            r6.add(r0)
            int r4 = r4 + 1
            goto L2fb
        L30a:
            k7.d r1 = new k7.d
            r1.<init>(r6)
            goto L65c
        L311:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 2
            p124h7.C2939x3.m7268R(r10, r0, r1)
            java.lang.String r0 = r3.f16850Y
            int r2 = r21.size()
            if (r2 <= 0) goto L337
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            k7.o r2 = r4.m13117i(r2)
            java.lang.Double r2 = r2.mo8355g()
            double r5 = r2.doubleValue()
            goto L339
        L337:
            r5 = 0
        L339:
            double r5 = p124h7.C2939x3.m7290p(r5)
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L34e
            int r2 = r0.length()
            double r9 = (double) r2
            double r9 = r9 + r5
            double r5 = java.lang.Math.max(r9, r7)
            goto L357
        L34e:
            int r2 = r0.length()
            double r7 = (double) r2
            double r5 = java.lang.Math.min(r5, r7)
        L357:
            int r2 = (int) r5
            int r5 = r21.size()
            r6 = 1
            if (r5 <= r6) goto L372
            java.lang.Object r1 = r1.get(r6)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r4.m13117i(r1)
            java.lang.Double r1 = r1.mo8355g()
            double r4 = r1.doubleValue()
            goto L377
        L372:
            int r1 = r0.length()
            double r4 = (double) r1
        L377:
            double r4 = p124h7.C2939x3.m7290p(r4)
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L38c
            int r1 = r0.length()
            double r8 = (double) r1
            double r8 = r8 + r4
            double r4 = java.lang.Math.max(r8, r6)
            goto L395
        L38c:
            int r1 = r0.length()
            double r6 = (double) r1
            double r4 = java.lang.Math.min(r4, r6)
        L395:
            int r1 = (int) r4
            int r1 = r1 - r2
            r4 = 0
            int r1 = java.lang.Math.max(r4, r1)
            k7.r r4 = new k7.r
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r2, r1)
            r4.<init>(r0)
            goto L53f
        L3a8:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 1
            r2 = 0
            p124h7.C2939x3.m7268R(r14, r0, r1)
            int r0 = r21.size()
            if (r0 <= 0) goto L3c7
            java.lang.Object r0 = r1.get(r2)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r4.m13117i(r0)
            java.lang.String r17 = r0.mo8357i()
        L3c7:
            java.lang.String r0 = r3.f16850Y
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r17)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L3e7
            k7.g r1 = new k7.g
            int r0 = r0.start()
            double r4 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r1.<init>(r0)
            goto L65c
        L3e7:
            k7.g r1 = new k7.g
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r1.<init>(r0)
            goto L65c
        L3f4:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 2
            p124h7.C2939x3.m7268R(r7, r0, r1)
            k7.o r0 = p185k7.InterfaceC3916o.f16782G
            int r2 = r21.size()
            if (r2 <= 0) goto L426
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            k7.o r2 = r4.m13117i(r2)
            java.lang.String r17 = r2.mo8357i()
            int r2 = r21.size()
            r5 = 1
            if (r2 <= r5) goto L426
            java.lang.Object r0 = r1.get(r5)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r4.m13117i(r0)
        L426:
            r1 = r17
            java.lang.String r2 = r3.f16850Y
            int r5 = r2.indexOf(r1)
            if (r5 < 0) goto L614
            boolean r6 = r0 instanceof p185k7.AbstractC3822h
            if (r6 == 0) goto L459
            k7.h r0 = (p185k7.AbstractC3822h) r0
            r6 = 3
            k7.o[] r6 = new p185k7.InterfaceC3916o[r6]
            k7.r r7 = new k7.r
            r7.<init>(r1)
            r8 = 0
            r6[r8] = r7
            k7.g r7 = new k7.g
            double r8 = (double) r5
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.<init>(r8)
            r8 = 1
            r6[r8] = r7
            r7 = 2
            r6[r7] = r3
            java.util.List r6 = java.util.Arrays.asList(r6)
            k7.o r0 = r0.mo8522b(r4, r6)
        L459:
            k7.r r4 = new k7.r
            r6 = 0
            java.lang.String r6 = r2.substring(r6, r5)
            java.lang.String r0 = r0.mo8357i()
            int r1 = r1.length()
            int r1 = r1 + r5
            java.lang.String r1 = r2.substring(r1)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            int r2 = r2.length()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.String r7 = java.lang.String.valueOf(r1)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r2 = r2 + r5
            int r2 = r2 + r7
            r8.<init>(r2)
            java.lang.String r0 = p083f.C1932s.m4774a(r8, r6, r0, r1)
            r4.<init>(r0)
            goto L53f
        L495:
            r3 = r18
            r4 = r20
            r1 = r21
            r2 = 1
            p124h7.C2939x3.m7268R(r11, r2, r1)
            java.lang.String r2 = r3.f16850Y
            int r5 = r21.size()
            if (r5 > 0) goto L4a8
            goto L4b7
        L4a8:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r4.m13117i(r0)
            java.lang.String r0 = r0.mo8357i()
        L4b7:
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r1 = r0.find()
            if (r1 == 0) goto L4df
            k7.d r1 = new k7.d
            r2 = 1
            k7.o[] r2 = new p185k7.InterfaceC3916o[r2]
            k7.r r4 = new k7.r
            java.lang.String r0 = r0.group()
            r4.<init>(r0)
            r0 = 0
            r2[r0] = r4
            java.util.List r0 = java.util.Arrays.asList(r2)
            r1.<init>(r0)
            goto L65c
        L4df:
            k7.o r1 = p185k7.InterfaceC3916o.f16783H
            goto L65c
        L4e3:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 0
            r2 = 2
            p124h7.C2939x3.m7268R(r12, r2, r1)
            java.lang.String r5 = r3.f16850Y
            int r6 = r21.size()
            if (r6 > 0) goto L4f7
            goto L505
        L4f7:
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r4.m13117i(r0)
            java.lang.String r17 = r0.mo8357i()
        L505:
            r0 = r17
            int r6 = r21.size()
            if (r6 >= r2) goto L510
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L523
        L510:
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r4.m13117i(r1)
            java.lang.Double r1 = r1.mo8355g()
            double r1 = r1.doubleValue()
        L523:
            boolean r4 = java.lang.Double.isNaN(r1)
            if (r4 == 0) goto L52c
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L530
        L52c:
            double r1 = p124h7.C2939x3.m7290p(r1)
        L530:
            k7.g r4 = new k7.g
            int r1 = (int) r1
            int r0 = r5.lastIndexOf(r0, r1)
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.<init>(r0)
        L53f:
            r1 = r4
            goto L65c
        L542:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 2
            r7 = 0
            p124h7.C2939x3.m7268R(r6, r0, r1)
            java.lang.String r2 = r3.f16850Y
            int r5 = r21.size()
            if (r5 > 0) goto L557
            goto L566
        L557:
            r5 = 0
            java.lang.Object r5 = r1.get(r5)
            k7.o r5 = (p185k7.InterfaceC3916o) r5
            k7.o r5 = r4.m13117i(r5)
            java.lang.String r17 = r5.mo8357i()
        L566:
            r5 = r17
            int r6 = r21.size()
            if (r6 >= r0) goto L56f
            goto L582
        L56f:
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r4.m13117i(r0)
            java.lang.Double r0 = r0.mo8355g()
            double r7 = r0.doubleValue()
        L582:
            double r0 = p124h7.C2939x3.m7290p(r7)
            k7.g r4 = new k7.g
            int r0 = (int) r0
            int r0 = r2.indexOf(r5, r0)
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.<init>(r0)
            goto L53f
        L596:
            r4 = r20
            r1 = r21
            r0 = r3
            r3 = r18
            r2 = 1
            p124h7.C2939x3.m7264N(r0, r2, r1)
            java.lang.String r0 = r3.f16850Y
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r4.m13117i(r1)
            java.lang.String r2 = r1.mo8357i()
            java.lang.String r4 = "length"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L5bb
            goto L5d4
        L5bb:
            java.lang.Double r1 = r1.mo8355g()
            double r1 = r1.doubleValue()
            double r4 = java.lang.Math.floor(r1)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L5d8
            int r1 = (int) r1
            if (r1 < 0) goto L5d8
            int r0 = r0.length()
            if (r1 >= r0) goto L5d8
        L5d4:
            k7.o r1 = p185k7.InterfaceC3916o.f16787L
            goto L65c
        L5d8:
            k7.o r1 = p185k7.InterfaceC3916o.f16788M
            goto L65c
        L5dc:
            r3 = r18
            r4 = r20
            r1 = r21
            int r0 = r21.size()
            if (r0 == 0) goto L614
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r3.f16850Y
            r0.<init>(r2)
            r2 = 0
        L5f0:
            int r5 = r21.size()
            if (r2 >= r5) goto L60a
            java.lang.Object r5 = r1.get(r2)
            k7.o r5 = (p185k7.InterfaceC3916o) r5
            k7.o r5 = r4.m13117i(r5)
            java.lang.String r5 = r5.mo8357i()
            r0.append(r5)
            int r2 = r2 + 1
            goto L5f0
        L60a:
            k7.r r1 = new k7.r
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            goto L65c
        L614:
            r1 = r3
            goto L65c
        L616:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 1
            p124h7.C2939x3.m7268R(r5, r0, r1)
            int r0 = r21.size()
            if (r0 <= 0) goto L63f
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r4.m13117i(r0)
            java.lang.Double r0 = r0.mo8355g()
            double r0 = r0.doubleValue()
            double r0 = p124h7.C2939x3.m7290p(r0)
            int r0 = (int) r0
            goto L640
        L63f:
            r0 = 0
        L640:
            java.lang.String r1 = r3.f16850Y
            if (r0 < 0) goto L65a
            int r2 = r1.length()
            if (r0 < r2) goto L64b
            goto L65a
        L64b:
            k7.r r2 = new k7.r
            char r0 = r1.charAt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r0)
            r1 = r2
            goto L65c
        L65a:
            k7.o r1 = p185k7.InterfaceC3916o.f16789N
        L65c:
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.f16850Y
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 2
            r2.<init>(r1)
            r1 = 34
            r2.append(r1)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }
}

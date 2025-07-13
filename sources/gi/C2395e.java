package gi;

/* renamed from: gi.e */
/* loaded from: classes.dex */
public final class C2395e {

    /* renamed from: a */
    public static final p260oi.C5287i f10779a = null;

    /* renamed from: b */
    public static final p260oi.C5287i f10780b = null;

    static {
            oi.i$a r0 = p260oi.C5287i.f20505c0
            java.lang.String r1 = "\"\\"
            oi.i r1 = r0.m11596b(r1)
            gi.C2395e.f10779a = r1
            java.lang.String r1 = "\t ,="
            oi.i r0 = r0.m11596b(r1)
            gi.C2395e.f10780b = r0
            return
    }

    /* renamed from: a */
    public static final boolean m6145a(bi.C0783g0 r8) {
            bi.c0 r0 = r8.f4225Y
            java.lang.String r0 = r0.f4195c
            java.lang.String r1 = "HEAD"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            r1 = 0
            if (r0 == 0) goto Le
            return r1
        Le:
            int r0 = r8.f4228b0
            r2 = 100
            r3 = 1
            if (r0 < r2) goto L19
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L22
        L19:
            r2 = 204(0xcc, float:2.86E-43)
            if (r0 == r2) goto L22
            r2 = 304(0x130, float:4.26E-43)
            if (r0 == r2) goto L22
            return r3
        L22:
            long r4 = ci.C0988c.m2705j(r8)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L3e
            r0 = 0
            r2 = 2
            java.lang.String r4 = "Transfer-Encoding"
            java.lang.String r8 = bi.C0783g0.m2380a(r8, r4, r0, r2)
            java.lang.String r0 = "chunked"
            boolean r8 = p362uh.C6463i.m13053J(r0, r8, r3)
            if (r8 == 0) goto L3d
            goto L3e
        L3d:
            return r1
        L3e:
            return r3
    }

    /* renamed from: b */
    public static final void m6146b(bi.InterfaceC0795o r28, bi.C0803w r29, bi.C0802v r30) {
            r0 = r28
            r1 = r29
            r2 = r30
            java.lang.String r3 = "$this$receiveHeaders"
            p214m2.C4339q.m9706k(r0, r3)
            java.lang.String r3 = "url"
            p214m2.C4339q.m9706k(r1, r3)
            java.lang.String r4 = "headers"
            p214m2.C4339q.m9706k(r2, r4)
            bi.o r5 = bi.InterfaceC0795o.f4321a
            if (r0 != r5) goto L1a
            return
        L1a:
            bi.m r5 = bi.C0793m.f4311n
            p214m2.C4339q.m9706k(r1, r3)
            p214m2.C4339q.m9706k(r2, r4)
            java.lang.String r4 = "Set-Cookie"
            java.lang.String r5 = "name"
            p214m2.C4339q.m9706k(r4, r5)
            int r5 = r30.size()
            r6 = 0
            r7 = 0
            r8 = 0
        L30:
            r9 = 2
            r10 = 1
            if (r7 >= r5) goto L4f
            java.lang.String r11 = r2.m2429e(r7)
            boolean r10 = p362uh.C6463i.m13053J(r4, r11, r10)
            if (r10 == 0) goto L4c
            if (r8 != 0) goto L45
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r9)
        L45:
            java.lang.String r9 = r2.m2431i(r7)
            r8.add(r9)
        L4c:
            int r7 = r7 + 1
            goto L30
        L4f:
            if (r8 == 0) goto L5b
            java.util.List r2 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r4 = "Collections.unmodifiableList(result)"
            p214m2.C4339q.m9705j(r2, r4)
            goto L5d
        L5b:
            dh.k r2 = p062dh.C1475k.f7237Y
        L5d:
            int r4 = r2.size()
            r5 = 0
            r7 = 0
        L63:
            if (r5 >= r4) goto L253
            java.lang.Object r8 = r2.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            p214m2.C4339q.m9706k(r1, r3)
            java.lang.String r9 = "setCookie"
            p214m2.C4339q.m9706k(r8, r9)
            long r10 = java.lang.System.currentTimeMillis()
            p214m2.C4339q.m9706k(r1, r3)
            p214m2.C4339q.m9706k(r8, r9)
            byte[] r9 = ci.C0988c.f5065a
            int r9 = r8.length()
            r12 = 59
            int r9 = ci.C0988c.m2700e(r8, r12, r6, r9)
            r13 = 61
            int r13 = ci.C0988c.m2700e(r8, r13, r6, r9)
            if (r13 != r9) goto L95
        L91:
            r30 = r2
            goto L23f
        L95:
            java.lang.String r15 = ci.C0988c.m2719x(r8, r6, r13)
            int r6 = r15.length()
            if (r6 != 0) goto La1
            r6 = 1
            goto La2
        La1:
            r6 = 0
        La2:
            if (r6 != 0) goto L91
            int r6 = ci.C0988c.m2707l(r15)
            r14 = -1
            if (r6 == r14) goto Lac
            goto L91
        Lac:
            int r13 = r13 + 1
            java.lang.String r16 = ci.C0988c.m2719x(r8, r13, r9)
            int r6 = ci.C0988c.m2707l(r16)
            if (r6 == r14) goto Lb9
            goto L91
        Lb9:
            int r9 = r9 + 1
            int r6 = r8.length()
            r17 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r24 = 0
            r26 = r23
            r27 = r24
            r19 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
        Lde:
            if (r9 >= r6) goto L17b
            int r12 = ci.C0988c.m2700e(r8, r12, r9, r6)
            r13 = 61
            int r13 = ci.C0988c.m2700e(r8, r13, r9, r12)
            java.lang.String r9 = ci.C0988c.m2719x(r8, r9, r13)
            if (r13 >= r12) goto Lf7
            int r13 = r13 + 1
            java.lang.String r13 = ci.C0988c.m2719x(r8, r13, r12)
            goto Lf9
        Lf7:
            java.lang.String r13 = ""
        Lf9:
            java.lang.String r14 = "expires"
            r30 = r2
            r2 = 1
            boolean r14 = p362uh.C6463i.m13053J(r9, r14, r2)
            if (r14 == 0) goto L10e
            int r2 = r13.length()     // Catch: java.lang.Throwable -> L173
            r9 = 0
            long r19 = bi.C0793m.m2413b(r13, r9, r2)     // Catch: java.lang.Throwable -> L173
            goto L11a
        L10e:
            java.lang.String r14 = "max-age"
            boolean r14 = p362uh.C6463i.m13053J(r9, r14, r2)
            if (r14 == 0) goto L11d
            long r17 = bi.C0793m.m2414c(r13)
        L11a:
            r23 = 1
            goto L173
        L11d:
            java.lang.String r14 = "domain"
            boolean r2 = p362uh.C6463i.m13053J(r9, r14, r2)
            if (r2 == 0) goto L152
            java.lang.String r2 = "."
            r9 = 0
            r14 = 2
            boolean r9 = p362uh.C6463i.m13052I(r13, r2, r9, r14)     // Catch: java.lang.Throwable -> L173
            r9 = r9 ^ 1
            if (r9 == 0) goto L146
            java.lang.String r2 = p362uh.C6467m.m13076g0(r13, r2)     // Catch: java.lang.Throwable -> L173
            java.lang.String r2 = gh.C2390b.m6135y(r2)     // Catch: java.lang.Throwable -> L173
            if (r2 == 0) goto L140
            r24 = 0
            r26 = r2
            goto L173
        L140:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L173
            r2.<init>()     // Catch: java.lang.Throwable -> L173
            throw r2     // Catch: java.lang.Throwable -> L173
        L146:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L173
            java.lang.String r9 = "Failed requirement."
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L173
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L173
            throw r2     // Catch: java.lang.Throwable -> L173
        L152:
            java.lang.String r2 = "path"
            r14 = 1
            boolean r2 = p362uh.C6463i.m13053J(r9, r2, r14)
            if (r2 == 0) goto L15e
            r27 = r13
            goto L173
        L15e:
            java.lang.String r2 = "secure"
            boolean r2 = p362uh.C6463i.m13053J(r9, r2, r14)
            if (r2 == 0) goto L169
            r21 = 1
            goto L173
        L169:
            java.lang.String r2 = "httponly"
            boolean r2 = p362uh.C6463i.m13053J(r9, r2, r14)
            if (r2 == 0) goto L173
            r22 = 1
        L173:
            int r9 = r12 + 1
            r12 = 59
            r2 = r30
            goto Lde
        L17b:
            r30 = r2
            r8 = -9223372036854775808
            int r2 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r2 != 0) goto L184
            goto L1ae
        L184:
            r8 = -1
            int r2 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r2 == 0) goto L1b4
            r8 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r2 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r2 > 0) goto L199
            r2 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r2
            long r17 = r17 * r8
            goto L19e
        L199:
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L19e:
            long r8 = r10 + r17
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r10 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            if (r2 < 0) goto L1b1
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L1ae
            goto L1b1
        L1ae:
            r17 = r8
            goto L1b6
        L1b1:
            r17 = r10
            goto L1b6
        L1b4:
            r17 = r19
        L1b6:
            java.lang.String r2 = r1.f4349e
            r6 = r26
            if (r6 != 0) goto L1be
            r6 = r2
            goto L1f5
        L1be:
            boolean r8 = p214m2.C4339q.m9702c(r2, r6)
            if (r8 == 0) goto L1c5
            goto L1ef
        L1c5:
            r8 = 2
            r9 = 0
            boolean r8 = p362uh.C6463i.m13052I(r2, r6, r9, r8)
            if (r8 == 0) goto L1f1
            int r8 = r2.length()
            int r9 = r6.length()
            int r8 = r8 - r9
            int r8 = r8 + (-1)
            char r8 = r2.charAt(r8)
            r9 = 46
            if (r8 != r9) goto L1f1
            byte[] r8 = ci.C0988c.f5065a
            java.lang.String r8 = "$this$canParseAsIpAddress"
            p214m2.C4339q.m9706k(r2, r8)
            uh.c r8 = ci.C0988c.f5070f
            boolean r8 = r8.m13043a(r2)
            if (r8 != 0) goto L1f1
        L1ef:
            r8 = 1
            goto L1f2
        L1f1:
            r8 = 0
        L1f2:
            if (r8 != 0) goto L1f5
            goto L23f
        L1f5:
            int r2 = r2.length()
            int r8 = r6.length()
            if (r2 == r8) goto L20a
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20573h
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20572g
            java.lang.String r2 = r2.m11625a(r6)
            if (r2 != 0) goto L20a
            goto L23f
        L20a:
            java.lang.String r2 = "/"
            r8 = 2
            r9 = 0
            r10 = r27
            if (r10 == 0) goto L21c
            boolean r8 = p362uh.C6463i.m13061R(r10, r2, r9, r8)
            if (r8 != 0) goto L219
            goto L21c
        L219:
            r20 = r10
            goto L234
        L21c:
            java.lang.String r8 = r29.m2440b()
            r10 = 47
            r11 = 6
            int r10 = p362uh.C6467m.m13072c0(r8, r10, r9, r9, r11)
            if (r10 == 0) goto L232
            java.lang.String r2 = r8.substring(r9, r10)
            java.lang.String r8 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r2, r8)
        L232:
            r20 = r2
        L234:
            bi.m r2 = new bi.m
            r25 = 0
            r14 = r2
            r19 = r6
            r14.<init>(r15, r16, r17, r19, r20, r21, r22, r23, r24, r25)
            goto L240
        L23f:
            r2 = 0
        L240:
            if (r2 == 0) goto L24c
            if (r7 != 0) goto L249
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L249:
            r7.add(r2)
        L24c:
            int r5 = r5 + 1
            r6 = 0
            r2 = r30
            goto L63
        L253:
            if (r7 == 0) goto L25f
            java.util.List r2 = java.util.Collections.unmodifiableList(r7)
            java.lang.String r3 = "Collections.unmodifiableList(cookies)"
            p214m2.C4339q.m9705j(r2, r3)
            goto L261
        L25f:
            dh.k r2 = p062dh.C1475k.f7237Y
        L261:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L268
            return
        L268:
            r0.mo2415a(r1, r2)
            return
    }
}

package okhttp3.internal.publicsuffix;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f20570e = null;

    /* renamed from: f */
    public static final java.util.List<java.lang.String> f20571f = null;

    /* renamed from: g */
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase f20572g = null;

    /* renamed from: h */
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase.C5312a f20573h = null;

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicBoolean f20574a;

    /* renamed from: b */
    public final java.util.concurrent.CountDownLatch f20575b;

    /* renamed from: c */
    public byte[] f20576c;

    /* renamed from: d */
    public byte[] f20577d;

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C5312a {
        public C5312a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public static final java.lang.String m11628a(okhttp3.internal.publicsuffix.PublicSuffixDatabase.C5312a r18, byte[] r19, byte[][] r20, int r21) {
                r0 = r19
                r1 = r20
                int r2 = r0.length
                r3 = 0
                r4 = 0
            L7:
                if (r4 >= r2) goto L94
                int r5 = r4 + r2
                int r5 = r5 / 2
            Ld:
                r6 = 10
                r7 = -1
                if (r5 <= r7) goto L1a
                r8 = r0[r5]
                byte r9 = (byte) r6
                if (r8 == r9) goto L1a
                int r5 = r5 + (-1)
                goto Ld
            L1a:
                int r5 = r5 + 1
                r8 = 1
                r9 = 1
            L1e:
                int r10 = r5 + r9
                r11 = r0[r10]
                byte r12 = (byte) r6
                if (r11 == r12) goto L28
                int r9 = r9 + 1
                goto L1e
            L28:
                int r6 = r10 - r5
                r11 = r21
                r9 = 0
                r12 = 0
                r13 = 0
            L2f:
                if (r9 == 0) goto L35
                r9 = 46
                r14 = 0
                goto L42
            L35:
                r14 = r1[r11]
                r14 = r14[r12]
                byte[] r15 = ci.C0988c.f5065a
                r14 = r14 & 255(0xff, float:3.57E-43)
                r17 = r14
                r14 = r9
                r9 = r17
            L42:
                int r15 = r5 + r13
                r15 = r0[r15]
                byte[] r16 = ci.C0988c.f5065a
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r9 = r9 - r15
                if (r9 == 0) goto L4e
                goto L5e
            L4e:
                int r13 = r13 + 1
                int r12 = r12 + 1
                if (r13 != r6) goto L55
                goto L5e
            L55:
                r15 = r1[r11]
                int r15 = r15.length
                if (r15 != r12) goto L92
                int r14 = r1.length
                int r14 = r14 - r8
                if (r11 != r14) goto L8d
            L5e:
                if (r9 >= 0) goto L61
                goto L78
            L61:
                if (r9 <= 0) goto L64
                goto L7d
            L64:
                int r7 = r6 - r13
                r8 = r1[r11]
                int r8 = r8.length
                int r8 = r8 - r12
                int r11 = r11 + 1
                int r9 = r1.length
            L6d:
                if (r11 >= r9) goto L76
                r12 = r1[r11]
                int r12 = r12.length
                int r8 = r8 + r12
                int r11 = r11 + 1
                goto L6d
            L76:
                if (r8 >= r7) goto L7b
            L78:
                int r2 = r5 + (-1)
                goto L7
            L7b:
                if (r8 <= r7) goto L80
            L7d:
                int r4 = r10 + 1
                goto L7
            L80:
                java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
                java.lang.String r2 = "UTF_8"
                p214m2.C4339q.m9705j(r1, r2)
                java.lang.String r2 = new java.lang.String
                r2.<init>(r0, r5, r6, r1)
                goto L95
            L8d:
                int r11 = r11 + 1
                r9 = 1
                r12 = -1
                goto L2f
            L92:
                r9 = r14
                goto L2f
            L94:
                r2 = 0
            L95:
                return r2
        }
    }

    static {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase$a
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20573h = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 42
            byte r1 = (byte) r1
            r2 = 0
            r0[r2] = r1
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20570e = r0
            java.lang.String r0 = "*"
            java.util.List r0 = p074e9.C1805a.m4528m(r0)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20571f = r0
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase
            r0.<init>()
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20572g = r0
            return
    }

    public PublicSuffixDatabase() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f20574a = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.f20575b = r0
            return
    }

    /* renamed from: a */
    public final java.lang.String m11625a(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r14)
            java.lang.String r1 = "unicodeDomain"
            p214m2.C4339q.m9705j(r0, r1)
            java.util.List r0 = r13.m11627c(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f20574a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L4c
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f20574a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L4c
            r1 = 0
        L20:
            r13.m11626b()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28 java.io.InterruptedIOException -> L3d
            if (r1 == 0) goto L59
            goto L35
        L26:
            r14 = move-exception
            goto L42
        L28:
            r4 = move-exception
            ji.e$a r5 = p175ji.C3615e.f15897c     // Catch: java.lang.Throwable -> L26
            ji.e r5 = p175ji.C3615e.f15895a     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = "Failed to read public suffix list"
            r7 = 5
            r5.m8049i(r6, r7, r4)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L59
        L35:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L59
        L3d:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L26
            r1 = 1
            goto L20
        L42:
            if (r1 == 0) goto L4b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4b:
            throw r14
        L4c:
            java.util.concurrent.CountDownLatch r1 = r13.f20575b     // Catch: java.lang.InterruptedException -> L52
            r1.await()     // Catch: java.lang.InterruptedException -> L52
            goto L59
        L52:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L59:
            byte[] r1 = r13.f20576c
            if (r1 == 0) goto L5f
            r1 = 1
            goto L60
        L5f:
            r1 = 0
        L60:
            if (r1 == 0) goto L1cf
            int r1 = r0.size()
            byte[][] r4 = new byte[r1][]
            r5 = 0
        L69:
            if (r5 >= r1) goto L8b
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            p214m2.C4339q.m9705j(r7, r8)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r6, r8)
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "(this as java.lang.String).getBytes(charset)"
            p214m2.C4339q.m9705j(r6, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L69
        L8b:
            r5 = 0
        L8c:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto La5
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20573h
            byte[] r9 = r13.f20576c
            if (r9 == 0) goto La1
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C5312a.m11628a(r8, r9, r4, r5)
            if (r8 == 0) goto L9e
            goto La6
        L9e:
            int r5 = r5 + 1
            goto L8c
        La1:
            p214m2.C4339q.m9713w(r6)
            throw r7
        La5:
            r8 = r7
        La6:
            if (r1 <= r3) goto Lcb
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = 0
        Lb1:
            if (r10 >= r9) goto Lcb
            byte[] r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20570e
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20573h
            byte[] r12 = r13.f20576c
            if (r12 == 0) goto Lc7
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C5312a.m11628a(r11, r12, r5, r10)
            if (r11 == 0) goto Lc4
            goto Lcc
        Lc4:
            int r10 = r10 + 1
            goto Lb1
        Lc7:
            p214m2.C4339q.m9713w(r6)
            throw r7
        Lcb:
            r11 = r7
        Lcc:
            if (r11 == 0) goto Le8
            int r1 = r1 - r3
            r5 = 0
        Ld0:
            if (r5 >= r1) goto Le8
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20573h
            byte[] r9 = r13.f20577d
            if (r9 == 0) goto Le2
            java.lang.String r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C5312a.m11628a(r6, r9, r4, r5)
            if (r6 == 0) goto Ldf
            goto Le9
        Ldf:
            int r5 = r5 + 1
            goto Ld0
        Le2:
            java.lang.String r14 = "publicSuffixExceptionListBytes"
            p214m2.C4339q.m9713w(r14)
            throw r7
        Le8:
            r6 = r7
        Le9:
            r1 = 6
            r4 = 46
            r5 = 33
            if (r6 == 0) goto L108
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            char[] r8 = new char[r3]
            r8[r2] = r4
            java.util.List r1 = p362uh.C6467m.m13079j0(r6, r8, r2, r2, r1)
            goto L134
        L108:
            if (r8 != 0) goto L10f
            if (r11 != 0) goto L10f
            java.util.List<java.lang.String> r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f20571f
            goto L134
        L10f:
            if (r8 == 0) goto L11a
            char[] r6 = new char[r3]
            r6[r2] = r4
            java.util.List r6 = p362uh.C6467m.m13079j0(r8, r6, r2, r2, r1)
            goto L11c
        L11a:
            dh.k r6 = p062dh.C1475k.f7237Y
        L11c:
            if (r11 == 0) goto L127
            char[] r8 = new char[r3]
            r8[r2] = r4
            java.util.List r1 = p362uh.C6467m.m13079j0(r11, r8, r2, r2, r1)
            goto L129
        L127:
            dh.k r1 = p062dh.C1475k.f7237Y
        L129:
            int r4 = r6.size()
            int r8 = r1.size()
            if (r4 <= r8) goto L134
            r1 = r6
        L134:
            int r4 = r0.size()
            int r6 = r1.size()
            if (r4 != r6) goto L14b
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            if (r4 == r5) goto L14b
            return r7
        L14b:
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            int r0 = r0.size()
            int r1 = r1.size()
            if (r4 != r5) goto L160
            goto L162
        L160:
            int r1 = r1 + 1
        L162:
            int r0 = r0 - r1
            java.util.List r14 = r13.m11627c(r14)
            dh.h r1 = new dh.h
            r1.<init>(r14)
            if (r0 < 0) goto L170
            r14 = 1
            goto L171
        L170:
            r14 = 0
        L171:
            if (r14 == 0) goto L1bd
            if (r0 != 0) goto L176
            goto L187
        L176:
            boolean r14 = r1 instanceof th.InterfaceC6245c
            if (r14 == 0) goto L181
            th.c r1 = (th.InterfaceC6245c) r1
            th.d r1 = r1.mo12827a(r0)
            goto L187
        L181:
            th.b r14 = new th.b
            r14.<init>(r1, r0)
            r1 = r14
        L187:
            java.lang.String r14 = ""
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.util.Iterator r1 = r1.iterator()
        L19a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1b0
            java.lang.Object r4 = r1.next()
            int r2 = r2 + r3
            if (r2 <= r3) goto L1ac
            java.lang.String r5 = "."
            r0.append(r5)
        L1ac:
            p101fh.C2174f.m5713c(r0, r4, r7)
            goto L19a
        L1b0:
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), \u2026ed, transform).toString()"
            p214m2.C4339q.m9705j(r14, r0)
            return r14
        L1bd:
            java.lang.String r14 = "Requested element count "
            java.lang.String r1 = " is less than zero."
            java.lang.String r14 = android.support.v4.media.C0146e.m258a(r14, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L1cf:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
    }

    /* renamed from: b */
    public final void m11626b() {
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L56
            oi.m r1 = new oi.m
            java.util.logging.Logger r2 = p260oi.C5294p.f20523a
            java.lang.String r2 = "$this$source"
            p214m2.C4339q.m9706k(r0, r2)
            oi.o r2 = new oi.o
            oi.a0 r3 = new oi.a0
            r3.<init>()
            r2.<init>(r0, r3)
            r1.<init>(r2)
            oi.h r0 = p101fh.C2174f.m5716f(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L4f
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L4f
            byte[] r2 = r0.mo11549K(r2)     // Catch: java.lang.Throwable -> L4f
            int r3 = r0.readInt()     // Catch: java.lang.Throwable -> L4f
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L4f
            byte[] r3 = r0.mo11549K(r3)     // Catch: java.lang.Throwable -> L4f
            p101fh.C2174f.m5717g(r0, r1)
            monitor-enter(r5)
            p214m2.C4339q.m9704i(r2)     // Catch: java.lang.Throwable -> L4c
            r5.f20576c = r2     // Catch: java.lang.Throwable -> L4c
            p214m2.C4339q.m9704i(r3)     // Catch: java.lang.Throwable -> L4c
            r5.f20577d = r3     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f20575b
            r0.countDown()
            return
        L4c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L4f:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L51
        L51:
            r2 = move-exception
            p101fh.C2174f.m5717g(r0, r1)
            throw r2
        L56:
            return
    }

    /* renamed from: c */
    public final java.util.List<java.lang.String> m11627c(java.lang.String r5) {
            r4 = this;
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 46
            r1[r2] = r3
            r3 = 6
            java.util.List r5 = p362uh.C6467m.m13079j0(r5, r1, r2, r2, r3)
            java.lang.Object r1 = p062dh.C1473i.m4001M(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = ""
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 == 0) goto L28
            int r1 = r5.size()
            int r1 = r1 - r0
            if (r1 >= 0) goto L23
            goto L24
        L23:
            r2 = r1
        L24:
            java.util.List r5 = p062dh.C1473i.m4005Q(r5, r2)
        L28:
            return r5
    }
}

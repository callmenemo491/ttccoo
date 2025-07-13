package ni;

/* renamed from: ni.a */
/* loaded from: classes.dex */
public final class C4841a implements bi.InterfaceC0804x {

    /* renamed from: a */
    public volatile java.util.Set<java.lang.String> f19235a;

    /* renamed from: b */
    public volatile ni.C4841a.a f19236b;

    /* renamed from: c */
    public final ni.C4841a.b f19237c;

    /* renamed from: ni.a$a */
    public enum a extends java.lang.Enum<ni.C4841a.a> {

        /* renamed from: Y */
        public static final ni.C4841a.a f19238Y = null;

        /* renamed from: Z */
        public static final ni.C4841a.a f19239Z = null;

        /* renamed from: a0 */
        public static final ni.C4841a.a f19240a0 = null;

        /* renamed from: b0 */
        public static final /* synthetic */ ni.C4841a.a[] f19241b0 = null;

        static {
                r0 = 4
                ni.a$a[] r0 = new ni.C4841a.a[r0]
                ni.a$a r1 = new ni.a$a
                java.lang.String r2 = "NONE"
                r3 = 0
                r1.<init>(r2, r3)
                ni.C4841a.a.f19238Y = r1
                r0[r3] = r1
                ni.a$a r1 = new ni.a$a
                java.lang.String r2 = "BASIC"
                r3 = 1
                r1.<init>(r2, r3)
                r0[r3] = r1
                ni.a$a r1 = new ni.a$a
                java.lang.String r2 = "HEADERS"
                r3 = 2
                r1.<init>(r2, r3)
                ni.C4841a.a.f19239Z = r1
                r0[r3] = r1
                ni.a$a r1 = new ni.a$a
                java.lang.String r2 = "BODY"
                r3 = 3
                r1.<init>(r2, r3)
                ni.C4841a.a.f19240a0 = r1
                r0[r3] = r1
                ni.C4841a.a.f19241b0 = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static ni.C4841a.a valueOf(java.lang.String r1) {
                java.lang.Class<ni.a$a> r0 = ni.C4841a.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ni.a$a r1 = (ni.C4841a.a) r1
                return r1
        }

        public static ni.C4841a.a[] values() {
                ni.a$a[] r0 = ni.C4841a.a.f19241b0
                java.lang.Object r0 = r0.clone()
                ni.a$a[] r0 = (ni.C4841a.a[]) r0
                return r0
        }
    }

    /* renamed from: ni.a$b */
    public interface b {

        /* renamed from: a */
        public static final ni.C4841a.b f19242a = null;

        static {
                ni.b r0 = new ni.b
                r0.<init>()
                ni.C4841a.b.f19242a = r0
                return
        }

        /* renamed from: a */
        void mo10860a(java.lang.String r1);
    }

    public C4841a() {
            r2 = this;
            ni.a$b r0 = ni.C4841a.b.f19242a
            java.lang.String r1 = "logger"
            p214m2.C4339q.m9706k(r0, r1)
            r2.<init>()
            r2.f19237c = r0
            dh.m r0 = p062dh.C1477m.f7239Y
            r2.f19235a = r0
            ni.a$a r0 = ni.C4841a.a.f19238Y
            r2.f19236b = r0
            return
    }

    @Override // bi.InterfaceC0804x
    /* renamed from: a */
    public bi.C0783g0 mo2456a(bi.InterfaceC0804x.a r21) {
            r20 = this;
            r1 = r20
            ni.a$a r0 = r1.f19236b
            r2 = r21
            gi.g r2 = (gi.C2397g) r2
            bi.c0 r3 = r2.f10786f
            ni.a$a r4 = ni.C4841a.a.f19238Y
            if (r0 != r4) goto L13
            bi.g0 r0 = r2.m6150c(r3)
            return r0
        L13:
            ni.a$a r4 = ni.C4841a.a.f19240a0
            if (r0 != r4) goto L19
            r4 = 1
            goto L1a
        L19:
            r4 = 0
        L1a:
            if (r4 != 0) goto L23
            ni.a$a r5 = ni.C4841a.a.f19239Z
            if (r0 != r5) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            bi.f0 r5 = r3.f4197e
            bi.k r6 = r2.m6149a()
            java.lang.String r7 = "--> "
            java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r7)
            java.lang.String r8 = r3.f4195c
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            bi.w r8 = r3.f4194b
            r7.append(r8)
            java.lang.String r8 = ""
            if (r6 == 0) goto L58
            java.lang.String r9 = " "
            java.lang.StringBuilder r9 = android.support.v4.media.C0144c.m256a(r9)
            fi.g r6 = (fi.C2185g) r6
            bi.b0 r6 = r6.f9970e
            p214m2.C4339q.m9704i(r6)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L59
        L58:
            r6 = r8
        L59:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "-byte body)"
            java.lang.String r9 = " ("
            if (r0 != 0) goto L7a
            if (r5 == 0) goto L7a
            java.lang.StringBuilder r6 = android.support.v4.media.C0143b.m255a(r6, r9)
            long r10 = r5.mo2371a()
            r6.append(r10)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L7a:
            ni.a$b r10 = r1.f19237c
            r10.mo10860a(r6)
            java.lang.String r6 = "-byte body omitted)"
            java.lang.String r10 = "UTF_8"
            if (r0 == 0) goto L17c
            bi.v r11 = r3.f4196d
            if (r5 == 0) goto Ld5
            bi.y r12 = r5.mo2372b()
            if (r12 == 0) goto Lad
            java.lang.String r13 = "Content-Type"
            java.lang.String r13 = r11.m2428a(r13)
            if (r13 != 0) goto Lad
            ni.a$b r13 = r1.f19237c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Content-Type: "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.mo10860a(r12)
        Lad:
            long r12 = r5.mo2371a()
            r14 = -1
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto Ld5
            java.lang.String r12 = "Content-Length"
            java.lang.String r12 = r11.m2428a(r12)
            if (r12 != 0) goto Ld5
            ni.a$b r12 = r1.f19237c
            java.lang.String r13 = "Content-Length: "
            java.lang.StringBuilder r13 = android.support.v4.media.C0144c.m256a(r13)
            long r14 = r5.mo2371a()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.mo10860a(r13)
        Ld5:
            int r12 = r11.size()
            r13 = 0
        Lda:
            if (r13 >= r12) goto Le2
            r1.m10859c(r11, r13)
            int r13 = r13 + 1
            goto Lda
        Le2:
            java.lang.String r11 = "--> END "
            if (r4 == 0) goto L168
            if (r5 != 0) goto Lea
            goto L168
        Lea:
            bi.v r12 = r3.f4196d
            boolean r12 = r1.m10858b(r12)
            if (r12 == 0) goto L100
            ni.a$b r5 = r1.f19237c
            java.lang.StringBuilder r11 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.String r12 = r3.f4195c
            r11.append(r12)
            java.lang.String r12 = " (encoded body omitted)"
            goto L170
        L100:
            oi.e r12 = new oi.e
            r12.<init>()
            r5.mo2373c(r12)
            bi.y r13 = r5.mo2372b()
            if (r13 == 0) goto L117
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r13 = r13.m2458a(r14)
            if (r13 == 0) goto L117
            goto L11c
        L117:
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8
            p214m2.C4339q.m9705j(r13, r10)
        L11c:
            ni.a$b r14 = r1.f19237c
            r14.mo10860a(r8)
            boolean r14 = p209lh.C4304a.m9628v(r12)
            if (r14 == 0) goto L149
            ni.a$b r14 = r1.f19237c
            java.lang.String r12 = r12.mo11575u0(r13)
            r14.mo10860a(r12)
            ni.a$b r12 = r1.f19237c
            java.lang.StringBuilder r11 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.String r13 = r3.f4195c
            r11.append(r13)
            r11.append(r9)
            long r13 = r5.mo2371a()
            r11.append(r13)
            r11.append(r7)
            goto L163
        L149:
            ni.a$b r12 = r1.f19237c
            java.lang.StringBuilder r11 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.String r13 = r3.f4195c
            r11.append(r13)
            java.lang.String r13 = " (binary "
            r11.append(r13)
            long r13 = r5.mo2371a()
            r11.append(r13)
            r11.append(r6)
        L163:
            java.lang.String r5 = r11.toString()
            goto L179
        L168:
            ni.a$b r5 = r1.f19237c
            java.lang.StringBuilder r11 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.String r12 = r3.f4195c
        L170:
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r12 = r5
            r5 = r11
        L179:
            r12.mo10860a(r5)
        L17c:
            long r11 = java.lang.System.nanoTime()
            bi.g0 r2 = r2.m6150c(r3)     // Catch: java.lang.Exception -> L315
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r13 = java.lang.System.nanoTime()
            long r13 = r13 - r11
            long r11 = r3.toMillis(r13)
            bi.h0 r3 = r2.f4231e0
            p214m2.C4339q.m9704i(r3)
            long r13 = r3.mo2394h()
            r15 = -1
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 == 0) goto L1b0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r15 = "-byte"
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            goto L1b2
        L1b0:
            java.lang.String r5 = "unknown-length"
        L1b2:
            ni.a$b r15 = r1.f19237c
            java.lang.String r16 = "<-- "
            r21 = r7
            java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r16)
            r16 = r13
            int r13 = r2.f4228b0
            r7.append(r13)
            java.lang.String r13 = r2.f4227a0
            int r13 = r13.length()
            if (r13 != 0) goto L1cd
            r13 = 1
            goto L1ce
        L1cd:
            r13 = 0
        L1ce:
            if (r13 == 0) goto L1d4
            r19 = r6
            r6 = r8
            goto L1ed
        L1d4:
            java.lang.String r13 = r2.f4227a0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r18 = 32
            r19 = r6
            java.lang.String r6 = java.lang.String.valueOf(r18)
            r14.append(r6)
            r14.append(r13)
            java.lang.String r6 = r14.toString()
        L1ed:
            r7.append(r6)
            r6 = 32
            r7.append(r6)
            bi.c0 r6 = r2.f4225Y
            bi.w r6 = r6.f4194b
            r7.append(r6)
            r7.append(r9)
            r7.append(r11)
            java.lang.String r6 = "ms"
            r7.append(r6)
            if (r0 != 0) goto L212
            java.lang.String r6 = ", "
            java.lang.String r9 = " body"
            java.lang.String r5 = android.support.v4.media.C0145d.m257a(r6, r5, r9)
            goto L213
        L212:
            r5 = r8
        L213:
            r7.append(r5)
            r5 = 41
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r15.mo10860a(r5)
            if (r0 == 0) goto L314
            bi.v r0 = r2.f4230d0
            int r5 = r0.size()
            r6 = 0
        L22b:
            if (r6 >= r5) goto L233
            r1.m10859c(r0, r6)
            int r6 = r6 + 1
            goto L22b
        L233:
            if (r4 == 0) goto L30d
            boolean r4 = gi.C2395e.m6145a(r2)
            if (r4 != 0) goto L23d
            goto L30d
        L23d:
            bi.v r4 = r2.f4230d0
            boolean r4 = r1.m10858b(r4)
            if (r4 == 0) goto L24b
            ni.a$b r0 = r1.f19237c
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            goto L311
        L24b:
            oi.h r4 = r3.mo2396l()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.mo11577w(r5)
            oi.e r4 = r4.mo11561c()
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r0 = r0.m2428a(r5)
            java.lang.String r5 = "gzip"
            r6 = 1
            boolean r0 = p362uh.C6463i.m13053J(r5, r0, r6)
            r5 = 0
            if (r0 == 0) goto L290
            long r6 = r4.f20501Z
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            oi.m r6 = new oi.m
            oi.e r4 = r4.m11558a()
            r6.<init>(r4)
            oi.e r4 = new oi.e     // Catch: java.lang.Throwable -> L287
            r4.<init>()     // Catch: java.lang.Throwable -> L287
            r4.m11538C0(r6)     // Catch: java.lang.Throwable -> L287
            p101fh.C2174f.m5717g(r6, r5)
            r5 = r0
            goto L290
        L287:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L28a
        L28a:
            r0 = move-exception
            r3 = r0
            p101fh.C2174f.m5717g(r6, r2)
            throw r3
        L290:
            bi.y r0 = r3.mo2395i()
            if (r0 == 0) goto L29f
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r0 = r0.m2458a(r3)
            if (r0 == 0) goto L29f
            goto L2a4
        L29f:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            p214m2.C4339q.m9705j(r0, r10)
        L2a4:
            boolean r3 = p209lh.C4304a.m9628v(r4)
            if (r3 != 0) goto L2c9
            ni.a$b r0 = r1.f19237c
            r0.mo10860a(r8)
            ni.a$b r0 = r1.f19237c
            java.lang.String r3 = "<-- END HTTP (binary "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            long r4 = r4.f20501Z
            r3.append(r4)
            r4 = r19
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.mo10860a(r3)
            return r2
        L2c9:
            r6 = 0
            int r3 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r3 == 0) goto L2e1
            ni.a$b r3 = r1.f19237c
            r3.mo10860a(r8)
            ni.a$b r3 = r1.f19237c
            oi.e r6 = r4.m11558a()
            java.lang.String r0 = r6.mo11575u0(r0)
            r3.mo10860a(r0)
        L2e1:
            java.lang.String r0 = "<-- END HTTP ("
            ni.a$b r3 = r1.f19237c
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            if (r5 == 0) goto L2fb
            long r6 = r4.f20501Z
            r0.append(r6)
            java.lang.String r4 = "-byte, "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = "-gzipped-byte body)"
            goto L302
        L2fb:
            long r4 = r4.f20501Z
            r0.append(r4)
            r4 = r21
        L302:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.mo10860a(r0)
            goto L314
        L30d:
            ni.a$b r0 = r1.f19237c
            java.lang.String r3 = "<-- END HTTP"
        L311:
            r0.mo10860a(r3)
        L314:
            return r2
        L315:
            r0 = move-exception
            r2 = r0
            ni.a$b r0 = r1.f19237c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.mo10860a(r3)
            throw r2
    }

    /* renamed from: b */
    public final boolean m10858b(bi.C0802v r4) {
            r3 = this;
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r4 = r4.m2428a(r0)
            r0 = 0
            if (r4 == 0) goto L1b
            java.lang.String r1 = "identity"
            r2 = 1
            boolean r1 = p362uh.C6463i.m13053J(r4, r1, r2)
            if (r1 != 0) goto L1b
            java.lang.String r1 = "gzip"
            boolean r4 = p362uh.C6463i.m13053J(r4, r1, r2)
            if (r4 != 0) goto L1b
            r0 = 1
        L1b:
            return r0
    }

    /* renamed from: c */
    public final void m10859c(bi.C0802v r4, int r5) {
            r3 = this;
            java.util.Set<java.lang.String> r0 = r3.f19235a
            java.lang.String[] r1 = r4.f4341Y
            int r5 = r5 * 2
            r1 = r1[r5]
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = "\u2588\u2588"
            goto L17
        L11:
            java.lang.String[] r0 = r4.f4341Y
            int r1 = r5 + 1
            r0 = r0[r1]
        L17:
            ni.a$b r1 = r3.f19237c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String[] r4 = r4.f4341Y
            r4 = r4[r5]
            r2.append(r4)
            java.lang.String r4 = ": "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.mo10860a(r4)
            return
    }
}

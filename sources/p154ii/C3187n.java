package p154ii;

/* renamed from: ii.n */
/* loaded from: classes.dex */
public final class C3187n implements java.io.Closeable {

    /* renamed from: c0 */
    public static final java.util.logging.Logger f12800c0 = null;

    /* renamed from: d0 */
    public static final p154ii.C3187n f12801d0 = null;

    /* renamed from: Y */
    public final p154ii.C3187n.a f12802Y;

    /* renamed from: Z */
    public final p154ii.C3177d.a f12803Z;

    /* renamed from: a0 */
    public final p260oi.InterfaceC5286h f12804a0;

    /* renamed from: b0 */
    public final boolean f12805b0;

    /* renamed from: ii.n$a */
    public static final class a implements p260oi.InterfaceC5304z {

        /* renamed from: Y */
        public int f12806Y;

        /* renamed from: Z */
        public int f12807Z;

        /* renamed from: a0 */
        public int f12808a0;

        /* renamed from: b0 */
        public int f12809b0;

        /* renamed from: c0 */
        public int f12810c0;

        /* renamed from: d0 */
        public final p260oi.InterfaceC5286h f12811d0;

        public a(p260oi.InterfaceC5286h r1) {
                r0 = this;
                r0.<init>()
                r0.f12811d0 = r1
                return
        }

        @Override // p260oi.InterfaceC5304z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // p260oi.InterfaceC5304z
        /* renamed from: d */
        public p260oi.C5279a0 mo7463d() {
                r1 = this;
                oi.h r0 = r1.f12811d0
                oi.a0 r0 = r0.mo7463d()
                return r0
        }

        @Override // p260oi.InterfaceC5304z
        /* renamed from: j0 */
        public long mo4683j0(p260oi.C5283e r10, long r11) {
                r9 = this;
                java.lang.String r0 = "sink"
                p214m2.C4339q.m9706k(r10, r0)
            L5:
                int r0 = r9.f12809b0
                r1 = -1
                if (r0 != 0) goto L8a
                oi.h r0 = r9.f12811d0
                int r3 = r9.f12810c0
                long r3 = (long) r3
                r0.mo11559b(r3)
                r0 = 0
                r9.f12810c0 = r0
                int r0 = r9.f12807Z
                r0 = r0 & 4
                if (r0 == 0) goto L1d
                return r1
            L1d:
                int r0 = r9.f12808a0
                oi.h r1 = r9.f12811d0
                int r1 = ci.C0988c.m2713r(r1)
                r9.f12809b0 = r1
                r9.f12806Y = r1
                oi.h r1 = r9.f12811d0
                byte r1 = r1.readByte()
                r1 = r1 & 255(0xff, float:3.57E-43)
                oi.h r2 = r9.f12811d0
                byte r2 = r2.readByte()
                r2 = r2 & 255(0xff, float:3.57E-43)
                r9.f12807Z = r2
                ii.n r2 = p154ii.C3187n.f12801d0
                java.util.logging.Logger r8 = p154ii.C3187n.f12800c0
                java.util.logging.Level r2 = java.util.logging.Level.FINE
                boolean r2 = r8.isLoggable(r2)
                if (r2 == 0) goto L58
                ii.e r2 = p154ii.C3178e.f12714e
                r3 = 1
                int r4 = r9.f12808a0
                int r5 = r9.f12806Y
                int r7 = r9.f12807Z
                r6 = r1
                java.lang.String r2 = r2.m7627b(r3, r4, r5, r6, r7)
                r8.fine(r2)
            L58:
                oi.h r2 = r9.f12811d0
                int r2 = r2.readInt()
                r3 = 2147483647(0x7fffffff, float:NaN)
                r2 = r2 & r3
                r9.f12808a0 = r2
                r3 = 9
                if (r1 != r3) goto L73
                if (r2 != r0) goto L6b
                goto L5
            L6b:
                java.io.IOException r10 = new java.io.IOException
                java.lang.String r11 = "TYPE_CONTINUATION streamId changed"
                r10.<init>(r11)
                throw r10
            L73:
                java.io.IOException r10 = new java.io.IOException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r1)
                java.lang.String r12 = " != TYPE_CONTINUATION"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r10.<init>(r11)
                throw r10
            L8a:
                oi.h r3 = r9.f12811d0
                long r4 = (long) r0
                long r11 = java.lang.Math.min(r11, r4)
                long r10 = r3.mo4683j0(r10, r11)
                int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r12 != 0) goto L9a
                return r1
            L9a:
                int r12 = r9.f12809b0
                int r0 = (int) r10
                int r12 = r12 - r0
                r9.f12809b0 = r12
                return r10
        }
    }

    /* renamed from: ii.n$b */
    public interface b {
        /* renamed from: a */
        void mo7638a(int r1, p154ii.EnumC3175b r2);

        /* renamed from: c */
        void mo7639c(int r1, p154ii.EnumC3175b r2, p260oi.C5287i r3);

        /* renamed from: d */
        void mo7640d();

        /* renamed from: f */
        void mo7641f(boolean r1, int r2, int r3);

        /* renamed from: h */
        void mo7642h(int r1, int r2, int r3, boolean r4);

        /* renamed from: j */
        void mo7643j(boolean r1, p154ii.C3193t r2);

        /* renamed from: k */
        void mo7644k(boolean r1, int r2, int r3, java.util.List<p154ii.C3176c> r4);

        /* renamed from: m */
        void mo7645m(int r1, long r2);

        /* renamed from: n */
        void mo7646n(int r1, int r2, java.util.List<p154ii.C3176c> r3);

        /* renamed from: o */
        void mo7647o(boolean r1, int r2, p260oi.InterfaceC5286h r3, int r4);
    }

    static {
            java.lang.Class<ii.e> r0 = p154ii.C3178e.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.lang.String r1 = "Logger.getLogger(Http2::class.java.name)"
            p214m2.C4339q.m9705j(r0, r1)
            p154ii.C3187n.f12800c0 = r0
            return
    }

    public C3187n(p260oi.InterfaceC5286h r4, boolean r5) {
            r3 = this;
            r3.<init>()
            r3.f12804a0 = r4
            r3.f12805b0 = r5
            ii.n$a r5 = new ii.n$a
            r5.<init>(r4)
            r3.f12802Y = r5
            ii.d$a r4 = new ii.d$a
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 0
            r2 = 4
            r4.<init>(r5, r0, r1, r2)
            r3.f12803Z = r4
            return
    }

    /* renamed from: a */
    public static final int m7648a(int r2, int r3, int r4) {
            r3 = r3 & 8
            if (r3 == 0) goto L6
            int r2 = r2 + (-1)
        L6:
            if (r4 > r2) goto La
            int r2 = r2 - r4
            return r2
        La:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "PROTOCOL_ERROR padding "
            java.lang.String r1 = " > remaining length "
            java.lang.String r2 = p243o1.C4872b.m11020a(r0, r4, r1, r2)
            r3.<init>(r2)
            throw r3
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            oi.h r0 = r1.f12804a0
            r0.close()
            return
    }

    /* renamed from: h */
    public final boolean m7649h(boolean r17, p154ii.C3187n.b r18) {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 0
            oi.h r3 = r0.f12804a0     // Catch: java.io.EOFException -> L2ea
            r4 = 9
            r3.mo11566k0(r4)     // Catch: java.io.EOFException -> L2ea
            oi.h r3 = r0.f12804a0
            int r3 = ci.C0988c.m2713r(r3)
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r10) goto L2de
            oi.h r4 = r0.f12804a0
            byte r4 = r4.readByte()
            r11 = r4 & 255(0xff, float:3.57E-43)
            oi.h r4 = r0.f12804a0
            byte r4 = r4.readByte()
            r12 = r4 & 255(0xff, float:3.57E-43)
            oi.h r4 = r0.f12804a0
            int r4 = r4.readInt()
            r13 = 2147483647(0x7fffffff, float:NaN)
            r14 = r4 & r13
            java.util.logging.Logger r15 = p154ii.C3187n.f12800c0
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r4 = r15.isLoggable(r4)
            if (r4 == 0) goto L49
            ii.e r4 = p154ii.C3178e.f12714e
            r5 = 1
            r6 = r14
            r7 = r3
            r8 = r11
            r9 = r12
            java.lang.String r4 = r4.m7627b(r5, r6, r7, r8, r9)
            r15.fine(r4)
        L49:
            r4 = 4
            if (r17 == 0) goto L68
            if (r11 != r4) goto L4f
            goto L68
        L4f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Expected a SETTINGS frame but was "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            ii.e r3 = p154ii.C3178e.f12714e
            java.lang.String r3 = r3.m7626a(r11)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L68:
            r5 = 0
            r6 = 5
            r7 = 8
            r8 = 1
            switch(r11) {
                case 0: goto L29d;
                case 1: goto L268;
                case 2: goto L249;
                case 3: goto L1fe;
                case 4: goto L15e;
                case 5: goto L130;
                case 6: goto L102;
                case 7: goto La7;
                case 8: goto L78;
                default: goto L70;
            }
        L70:
            oi.h r1 = r0.f12804a0
            long r2 = (long) r3
            r1.mo11559b(r2)
            goto L2dd
        L78:
            if (r3 != r4) goto L9b
            oi.h r2 = r0.f12804a0
            int r2 = r2.readInt()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            byte[] r5 = ci.C0988c.f5065a
            long r5 = (long) r2
            long r2 = r5 & r3
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L93
            r1.mo7645m(r14, r2)
            goto L2dd
        L93:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "windowSizeIncrement was 0"
            r1.<init>(r2)
            throw r1
        L9b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r2, r3)
            r1.<init>(r2)
            throw r1
        La7:
            if (r3 < r7) goto Lf6
            if (r14 != 0) goto Lee
            oi.h r2 = r0.f12804a0
            int r2 = r2.readInt()
            oi.h r4 = r0.f12804a0
            int r4 = r4.readInt()
            int r3 = r3 - r7
            ii.b[] r6 = p154ii.EnumC3175b.values()
            int r7 = r6.length
            r9 = 0
        Lbe:
            if (r9 >= r7) goto Ld0
            r10 = r6[r9]
            int r11 = r10.f12680Y
            if (r11 != r4) goto Lc8
            r11 = 1
            goto Lc9
        Lc8:
            r11 = 0
        Lc9:
            if (r11 == 0) goto Lcd
            r5 = r10
            goto Ld0
        Lcd:
            int r9 = r9 + 1
            goto Lbe
        Ld0:
            if (r5 == 0) goto Le2
            oi.i r4 = p260oi.C5287i.f20504b0
            if (r3 <= 0) goto Ldd
            oi.h r4 = r0.f12804a0
            long r6 = (long) r3
            oi.i r4 = r4.mo11571q(r6)
        Ldd:
            r1.mo7639c(r2, r5, r4)
            goto L2dd
        Le2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r2, r4)
            r1.<init>(r2)
            throw r1
        Lee:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
            r1.<init>(r2)
            throw r1
        Lf6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY length < 8: "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r2, r3)
            r1.<init>(r2)
            throw r1
        L102:
            if (r3 != r7) goto L124
            if (r14 != 0) goto L11c
            oi.h r3 = r0.f12804a0
            int r3 = r3.readInt()
            oi.h r4 = r0.f12804a0
            int r4 = r4.readInt()
            r5 = r12 & 1
            if (r5 == 0) goto L117
            r2 = 1
        L117:
            r1.mo7641f(r2, r3, r4)
            goto L2dd
        L11c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING streamId != 0"
            r1.<init>(r2)
            throw r1
        L124:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING length != 8: "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r2, r3)
            r1.<init>(r2)
            throw r1
        L130:
            if (r14 == 0) goto L156
            r4 = r12 & 8
            if (r4 == 0) goto L140
            oi.h r2 = r0.f12804a0
            byte r2 = r2.readByte()
            byte[] r4 = ci.C0988c.f5065a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L140:
            oi.h r4 = r0.f12804a0
            int r4 = r4.readInt()
            r4 = r4 & r13
            int r3 = r3 + (-4)
            int r3 = m7648a(r3, r12, r2)
            java.util.List r2 = r0.m7651l(r3, r2, r12, r14)
            r1.mo7646n(r14, r4, r2)
            goto L2dd
        L156:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r1.<init>(r2)
            throw r1
        L15e:
            if (r14 != 0) goto L1f6
            r5 = r12 & 1
            if (r5 == 0) goto L173
            if (r3 != 0) goto L16b
            r18.mo7640d()
            goto L2dd
        L16b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r1.<init>(r2)
            throw r1
        L173:
            int r5 = r3 % 6
            if (r5 != 0) goto L1ea
            ii.t r5 = new ii.t
            r5.<init>()
            rh.c r3 = p209lh.C4304a.m9605K(r2, r3)
            r7 = 6
            rh.a r3 = p209lh.C4304a.m9603I(r3, r7)
            int r7 = r3.f22647Y
            int r9 = r3.f22648Z
            int r3 = r3.f22649a0
            if (r3 < 0) goto L190
            if (r7 > r9) goto L1e5
            goto L192
        L190:
            if (r7 < r9) goto L1e5
        L192:
            oi.h r11 = r0.f12804a0
            short r11 = r11.readShort()
            r12 = 65535(0xffff, float:9.1834E-41)
            byte[] r13 = ci.C0988c.f5065a
            r11 = r11 & r12
            oi.h r12 = r0.f12804a0
            int r12 = r12.readInt()
            r13 = 2
            if (r11 == r13) goto L1d1
            r13 = 3
            if (r11 == r13) goto L1cf
            if (r11 == r4) goto L1c3
            if (r11 == r6) goto L1af
            goto L1de
        L1af:
            if (r12 < r10) goto L1b7
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            if (r12 > r13) goto L1b7
            goto L1de
        L1b7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r2, r12)
            r1.<init>(r2)
            throw r1
        L1c3:
            r11 = 7
            if (r12 < 0) goto L1c7
            goto L1de
        L1c7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r1.<init>(r2)
            throw r1
        L1cf:
            r11 = 4
            goto L1de
        L1d1:
            if (r12 == 0) goto L1de
            if (r12 != r8) goto L1d6
            goto L1de
        L1d6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r1.<init>(r2)
            throw r1
        L1de:
            r5.m7685c(r11, r12)
            if (r7 == r9) goto L1e5
            int r7 = r7 + r3
            goto L192
        L1e5:
            r1.mo7643j(r2, r5)
            goto L2dd
        L1ea:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r2, r3)
            r1.<init>(r2)
            throw r1
        L1f6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            r1.<init>(r2)
            throw r1
        L1fe:
            if (r3 != r4) goto L23b
            if (r14 == 0) goto L233
            oi.h r2 = r0.f12804a0
            int r2 = r2.readInt()
            ii.b[] r3 = p154ii.EnumC3175b.values()
            int r4 = r3.length
            r6 = 0
        L20e:
            if (r6 >= r4) goto L220
            r7 = r3[r6]
            int r9 = r7.f12680Y
            if (r9 != r2) goto L218
            r9 = 1
            goto L219
        L218:
            r9 = 0
        L219:
            if (r9 == 0) goto L21d
            r5 = r7
            goto L220
        L21d:
            int r6 = r6 + 1
            goto L20e
        L220:
            if (r5 == 0) goto L227
            r1.mo7638a(r14, r5)
            goto L2dd
        L227:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r3, r2)
            r1.<init>(r2)
            throw r1
        L233:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            r1.<init>(r2)
            throw r1
        L23b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM length: "
            java.lang.String r4 = " != 4"
            java.lang.String r2 = android.support.v4.media.C0146e.m258a(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L249:
            if (r3 != r6) goto L25a
            if (r14 == 0) goto L252
            r0.m7652n(r1, r14)
            goto L2dd
        L252:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            r1.<init>(r2)
            throw r1
        L25a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY length: "
            java.lang.String r4 = " != 5"
            java.lang.String r2 = android.support.v4.media.C0146e.m258a(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L268:
            if (r14 == 0) goto L295
            r4 = r12 & 1
            if (r4 == 0) goto L270
            r4 = 1
            goto L271
        L270:
            r4 = 0
        L271:
            r5 = r12 & 8
            if (r5 == 0) goto L27f
            oi.h r2 = r0.f12804a0
            byte r2 = r2.readByte()
            byte[] r5 = ci.C0988c.f5065a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L27f:
            r5 = r12 & 32
            if (r5 == 0) goto L288
            r0.m7652n(r1, r14)
            int r3 = r3 + (-5)
        L288:
            int r3 = m7648a(r3, r12, r2)
            java.util.List r2 = r0.m7651l(r3, r2, r12, r14)
            r3 = -1
            r1.mo7644k(r4, r14, r3, r2)
            goto L2dd
        L295:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r1.<init>(r2)
            throw r1
        L29d:
            if (r14 == 0) goto L2d5
            r4 = r12 & 1
            if (r4 == 0) goto L2a5
            r4 = 1
            goto L2a6
        L2a5:
            r4 = 0
        L2a6:
            r5 = r12 & 32
            if (r5 == 0) goto L2ac
            r5 = 1
            goto L2ad
        L2ac:
            r5 = 0
        L2ad:
            if (r5 != 0) goto L2cd
            r5 = r12 & 8
            if (r5 == 0) goto L2bd
            oi.h r2 = r0.f12804a0
            byte r2 = r2.readByte()
            byte[] r5 = ci.C0988c.f5065a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L2bd:
            int r3 = m7648a(r3, r12, r2)
            oi.h r5 = r0.f12804a0
            r1.mo7647o(r4, r14, r5, r3)
            oi.h r1 = r0.f12804a0
            long r2 = (long) r2
            r1.mo11559b(r2)
            goto L2dd
        L2cd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r1.<init>(r2)
            throw r1
        L2d5:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r1.<init>(r2)
            throw r1
        L2dd:
            return r8
        L2de:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR: "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r2, r3)
            r1.<init>(r2)
            throw r1
        L2ea:
            return r2
    }

    /* renamed from: i */
    public final void m7650i(p154ii.C3187n.b r6) {
            r5 = this;
            boolean r0 = r5.f12805b0
            r1 = 1
            if (r0 == 0) goto L14
            boolean r6 = r5.m7649h(r1, r6)
            if (r6 == 0) goto Lc
            goto L4c
        Lc:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Required SETTINGS preface not received"
            r6.<init>(r0)
            throw r6
        L14:
            oi.h r6 = r5.f12804a0
            oi.i r0 = p154ii.C3178e.f12710a
            byte[] r2 = r0.f20508a0
            int r2 = r2.length
            long r2 = (long) r2
            oi.i r6 = r6.mo11571q(r2)
            java.util.logging.Logger r2 = p154ii.C3187n.f12800c0
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r3 = r2.isLoggable(r3)
            if (r3 == 0) goto L45
            java.lang.String r3 = "<< CONNECTION "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.String r4 = r6.mo11586k()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r3 = ci.C0988c.m2703h(r3, r4)
            r2.fine(r3)
        L45:
            boolean r0 = p214m2.C4339q.m9702c(r0, r6)
            r0 = r0 ^ r1
            if (r0 != 0) goto L4d
        L4c:
            return
        L4d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Expected a connection header but was "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r6 = r6.m11592s()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    /* renamed from: l */
    public final java.util.List<p154ii.C3176c> m7651l(int r2, int r3, int r4, int r5) {
            r1 = this;
            ii.n$a r0 = r1.f12802Y
            r0.f12809b0 = r2
            r0.f12806Y = r2
            r0.f12810c0 = r3
            r0.f12807Z = r4
            r0.f12808a0 = r5
            ii.d$a r2 = r1.f12803Z
        Le:
            oi.h r3 = r2.f12694b
            boolean r3 = r3.mo11541F()
            if (r3 != 0) goto L136
            oi.h r3 = r2.f12694b
            byte r3 = r3.readByte()
            byte[] r4 = ci.C0988c.f5065a
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 == r4) goto L12e
            r5 = r3 & 128(0x80, float:1.8E-43)
            if (r5 != r4) goto L7e
            r4 = 127(0x7f, float:1.78E-43)
            int r3 = r2.m7619g(r3, r4)
            int r3 = r3 + (-1)
            if (r3 < 0) goto L3d
            ii.d r4 = p154ii.C3177d.f12692c
            ii.c[] r4 = p154ii.C3177d.f12690a
            int r4 = r4.length
            int r4 = r4 + (-1)
            if (r3 > r4) goto L3d
            r4 = 1
            goto L3e
        L3d:
            r4 = 0
        L3e:
            if (r4 == 0) goto L4c
            ii.d r4 = p154ii.C3177d.f12692c
            ii.c[] r4 = p154ii.C3177d.f12690a
            r3 = r4[r3]
            java.util.List<ii.c> r4 = r2.f12693a
            r4.add(r3)
            goto Le
        L4c:
            ii.d r4 = p154ii.C3177d.f12692c
            ii.c[] r4 = p154ii.C3177d.f12690a
            int r4 = r4.length
            int r4 = r3 - r4
            int r4 = r2.m7614b(r4)
            if (r4 < 0) goto L69
            ii.c[] r5 = r2.f12695c
            int r0 = r5.length
            if (r4 >= r0) goto L69
            java.util.List<ii.c> r3 = r2.f12693a
            r4 = r5[r4]
            p214m2.C4339q.m9704i(r4)
            r3.add(r4)
            goto Le
        L69:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r4 = "Header index too large "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            int r3 = r3 + 1
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L7e:
            r4 = -1
            r5 = 64
            if (r3 != r5) goto L9a
            ii.d r3 = p154ii.C3177d.f12692c
            oi.i r5 = r2.m7618f()
            r3.m7612a(r5)
            oi.i r3 = r2.m7618f()
            ii.c r0 = new ii.c
            r0.<init>(r5, r3)
            r2.m7617e(r4, r0)
            goto Le
        L9a:
            r0 = r3 & 64
            if (r0 != r5) goto Lb8
            r5 = 63
            int r3 = r2.m7619g(r3, r5)
            int r3 = r3 + (-1)
            oi.i r3 = r2.m7616d(r3)
            oi.i r5 = r2.m7618f()
            ii.c r0 = new ii.c
            r0.<init>(r3, r5)
            r2.m7617e(r4, r0)
            goto Le
        Lb8:
            r4 = r3 & 32
            r5 = 32
            if (r4 != r5) goto Lf2
            r4 = 31
            int r3 = r2.m7619g(r3, r4)
            r2.f12700h = r3
            if (r3 < 0) goto Ldd
            int r4 = r2.f12699g
            if (r3 > r4) goto Ldd
            int r4 = r2.f12698f
            if (r3 >= r4) goto Le
            if (r3 != 0) goto Ld7
            r2.m7613a()
            goto Le
        Ld7:
            int r4 = r4 - r3
            r2.m7615c(r4)
            goto Le
        Ldd:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Invalid dynamic table size update "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            int r2 = r2.f12700h
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        Lf2:
            r4 = 16
            if (r3 == r4) goto L115
            if (r3 != 0) goto Lf9
            goto L115
        Lf9:
            r4 = 15
            int r3 = r2.m7619g(r3, r4)
            int r3 = r3 + (-1)
            oi.i r3 = r2.m7616d(r3)
            oi.i r4 = r2.m7618f()
            java.util.List<ii.c> r5 = r2.f12693a
            ii.c r0 = new ii.c
            r0.<init>(r3, r4)
            r5.add(r0)
            goto Le
        L115:
            ii.d r3 = p154ii.C3177d.f12692c
            oi.i r4 = r2.m7618f()
            r3.m7612a(r4)
            oi.i r3 = r2.m7618f()
            java.util.List<ii.c> r5 = r2.f12693a
            ii.c r0 = new ii.c
            r0.<init>(r4, r3)
            r5.add(r0)
            goto Le
        L12e:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "index == 0"
            r2.<init>(r3)
            throw r2
        L136:
            ii.d$a r2 = r1.f12803Z
            java.util.List<ii.c> r3 = r2.f12693a
            java.util.List r3 = p062dh.C1473i.m4007S(r3)
            java.util.List<ii.c> r2 = r2.f12693a
            r2.clear()
            return r3
    }

    /* renamed from: n */
    public final void m7652n(p154ii.C3187n.b r6, int r7) {
            r5 = this;
            oi.h r0 = r5.f12804a0
            int r0 = r0.readInt()
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r2 = (int) r1
            r1 = r0 & r2
            r2 = 1
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r3
            oi.h r3 = r5.f12804a0
            byte r3 = r3.readByte()
            byte[] r4 = ci.C0988c.f5065a
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r6.mo7642h(r7, r0, r3, r1)
            return
    }
}
